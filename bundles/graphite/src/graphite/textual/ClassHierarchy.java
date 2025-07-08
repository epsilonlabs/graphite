package graphite.textual;

import java.util.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;

public class ClassHierarchy {

    public static Map<EClass, List<EClass>> ClusterByRootParents(EClass[] eClasses) {
        Set<EClass> inputSet = new HashSet<>(Arrays.asList(eClasses));
        Set<EClass> allSupertypes = new HashSet<>();

        for (EClass cls : inputSet) {
            allSupertypes.addAll(cls.getEAllSuperTypes());
        }

        // Combine input and supertypes to find all possible cluster roots
        Set<EClass> possibleRoots = new HashSet<>(inputSet);
        possibleRoots.addAll(allSupertypes);

        // Identify root parents: those not having any supertype in the full set
        Set<EClass> rootParents = new HashSet<>(possibleRoots);
        for (EClass a : possibleRoots) {
            for (EClass b : possibleRoots) {
                if (!a.equals(b) && a.getEAllSuperTypes().contains(b)) {
                    rootParents.remove(a);
                    break;
                }
            }
        }

        // Group each class under the closest root parent
        Map<EClass, List<EClass>> grouped = new HashMap<>();
        for (EClass eClass : inputSet) {
            EClass root = findTopmostRootParent(eClass, rootParents);
            grouped.computeIfAbsent(root, k -> new ArrayList<>()).add(eClass);
        }

        // Final result, formatted
        Map<EClass, List<EClass>> result = new LinkedHashMap<>();
        for (EClass root : rootParents) {
            List<EClass> members = grouped.getOrDefault(root, new ArrayList<>());
            if (!root.isAbstract() && !members.contains(root)) {
                members.add(0, root); // include concrete root itself
            }
            result.put(root, members);
        }

        return result;
    }

    private static EClass findTopmostRootParent(EClass eClass, Set<EClass> rootParents) {
        Set<EClass> visited = new HashSet<>();
        Queue<EClass> queue = new LinkedList<>();
        queue.add(eClass);

        while (!queue.isEmpty()) {
            EClass current = queue.poll();
            if (rootParents.contains(current)) {
                return current;
            }
            for (EClass superType : current.getESuperTypes()) {
                if (visited.add(superType)) {
                    queue.add(superType);
                }
            }
        }

        return null;
    }

    // Test
    public static void main(String[] args) {
        EcoreFactory factory = EcoreFactory.eINSTANCE;

        EClass ViewElement = factory.createEClass();
        ViewElement.setName("ViewElement");
        ViewElement.setAbstract(true);

        EClass ComponentView = factory.createEClass();
        ComponentView.setName("ComponentView");
        ComponentView.getESuperTypes().add(ViewElement);

        EClass ContainerView = factory.createEClass();
        ContainerView.setName("ContainerView");
        ContainerView.getESuperTypes().add(ViewElement);

        EClass SystemContextView = factory.createEClass();
        SystemContextView.setName("SystemContextView");
        SystemContextView.getESuperTypes().add(ViewElement);

        EClass SystemLandscapeView = factory.createEClass();
        SystemLandscapeView.setName("SystemLandscapeView");
        SystemLandscapeView.getESuperTypes().add(ViewElement);

        EClass[] input = new EClass[] {
            ComponentView, ContainerView, SystemContextView, SystemLandscapeView
            // note: ViewElement NOT included on purpose
        };

        Map<EClass, List<EClass>> result = ClusterByRootParents(input);

        for (Map.Entry<EClass, List<EClass>> entry : result.entrySet()) {
            System.out.println("Parent: " + entry.getKey().getName());
            for (EClass e : entry.getValue()) {
                System.out.println("  - " + e.getName());
            }
        }
    }
}
