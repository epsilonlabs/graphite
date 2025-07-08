package structurizr.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EStructuralFeature;

import structurizr.C4Element;
import structurizr.CompositeCondition;
import structurizr.ConditionComparisonOperation;
import structurizr.ConditionElement;
import structurizr.ConditionLogicalOperation;
import structurizr.ContainerView;
import structurizr.ElementParentCondition;
import structurizr.ElementPropertyCondition;
import structurizr.ElementTagCondition;
import structurizr.ElementTechnologyCondition;
import structurizr.ElementTypeCondition;
import structurizr.FilterCondition;
import structurizr.FilterType;
import structurizr.IdentifiableElement;
import structurizr.NoFilterCondition;
import structurizr.Property;
import structurizr.Relationship;
import structurizr.RelationshipDestinationCondition;
import structurizr.RelationshipPropertyCondition;
import structurizr.RelationshipSourceCondition;
import structurizr.RelationshipTagCondition;
import structurizr.Tag;
import structurizr.Technology;


/**
 * The services class used by VSM.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class Services {
	
	
    public IdentifiableElement filterRelationshipNode(Relationship relationship, IdentifiableElement identifiableElement, ConditionElement excludeCondition) {
    	return !(excludeCondition instanceof FilterCondition) ? identifiableElement : getFilteredRelationshipNode(relationship, identifiableElement, (FilterCondition)excludeCondition);
    }
    
    public IdentifiableElement getFilteredRelationshipNode(Relationship relationship, IdentifiableElement identifiableElement, FilterCondition filterCondition) {   	
    	if (filterCondition instanceof RelationshipTagCondition) {
    		return getFilteredRelationshipNode(relationship, identifiableElement, (RelationshipTagCondition)filterCondition);
		}  	
    	else if (filterCondition instanceof RelationshipPropertyCondition) {
    		return getFilteredRelationshipNode(relationship, identifiableElement, (RelationshipPropertyCondition)filterCondition);
    	}
    	else if (filterCondition instanceof RelationshipSourceCondition) {
    		return getFilteredRelationshipNode(relationship, identifiableElement, (RelationshipSourceCondition)filterCondition);
    	}
    	else if (filterCondition instanceof RelationshipDestinationCondition) {
    		return getFilteredRelationshipNode(relationship, identifiableElement, (RelationshipDestinationCondition)filterCondition);
    	}
    	else if (filterCondition instanceof CompositeCondition) {
    		return getFilteredRelationshipNode(relationship, identifiableElement, (CompositeCondition)filterCondition);
    	}
    	return identifiableElement;
    }
    
    private IdentifiableElement getFilteredRelationshipNode(Relationship relationship, IdentifiableElement identifiableElement, RelationshipTagCondition tagCondition) {
    	if ((ConditionComparisonOperation.EQUALS.equals(tagCondition.getComparisonOperation()) && (tagMatchesCondition(relationship.getTags(), tagCondition.getTags(), true, true)) || (ConditionComparisonOperation.NOT_EQUALS.equals(tagCondition.getComparisonOperation()) && (tagMatchesCondition(relationship.getTags(), tagCondition.getTags(), false, (relationship.getTags().size() > 0)))))) {			
			return identifiableElement;
		}
   		return null;
    }
    
    private IdentifiableElement getFilteredRelationshipNode(Relationship relationship, IdentifiableElement identifiableElement, RelationshipPropertyCondition propertyCondition) {
    	if (!propertyMatchesCondition(relationship.getProperties(), propertyCondition.getProperty().getName(), propertyCondition.getValue(), ConditionComparisonOperation.NOT_EQUALS.equals(propertyCondition.getComparisonOperation()))) {
			return identifiableElement;
		}
    	return null;
    }

    private IdentifiableElement getFilteredRelationshipNode(Relationship relationship, IdentifiableElement identifiableElement, RelationshipSourceCondition sourceCondition) {
    	if ((ConditionComparisonOperation.EQUALS.equals(sourceCondition.getComparisonOperation()) && sourceCondition.getSource() != relationship.getSource()) || (ConditionComparisonOperation.NOT_EQUALS.equals(sourceCondition.getComparisonOperation()) && sourceCondition.getSource() == relationship.getSource())) {
    		return identifiableElement;
		}
    	return null;
    }
    
    private IdentifiableElement getFilteredRelationshipNode(Relationship relationship, IdentifiableElement identifiableElement, RelationshipDestinationCondition destinationCondition) {
    	if ((ConditionComparisonOperation.EQUALS.equals(destinationCondition.getComparisonOperation()) && destinationCondition.getDestination() != relationship.getTarget()) || (ConditionComparisonOperation.NOT_EQUALS.equals(destinationCondition.getComparisonOperation()) && destinationCondition.getDestination() == relationship.getTarget())) {
    		return identifiableElement;
		}
    	return null;
    }
    
    private IdentifiableElement getFilteredRelationshipNode(Relationship relationship, IdentifiableElement identifiableElement, CompositeCondition compositeCondition) {
		IdentifiableElement leftFilteredNode = getFilteredRelationshipNode(relationship, identifiableElement, (FilterCondition)compositeCondition.getLeft());
		IdentifiableElement rightFilteredNode = getFilteredRelationshipNode(relationship, identifiableElement, (FilterCondition)compositeCondition.getRight());
    	boolean orCondition = (ConditionLogicalOperation.OR.equals(compositeCondition.getLogicalOperation()) && (identifiableElement == leftFilteredNode && identifiableElement == rightFilteredNode));
		boolean andCondition = (ConditionLogicalOperation.AND.equals(compositeCondition.getLogicalOperation()) &&(identifiableElement == leftFilteredNode || identifiableElement == rightFilteredNode));
		if (orCondition || andCondition) {
			return identifiableElement;
		}
    	return null;
    }

    public List<C4Element> filterC4Elements(ConditionElement includeCondition, ConditionElement excludeCondition, String type, Object c4Elements, Object diagram) {
    	List<C4Element> unfilteredC4Elements = new ArrayList<C4Element>(); 	
    	List<C4Element> includeFilteredC4Elements = new ArrayList<C4Element>();
    	List<C4Element> excludeFilteredC4Elements = new ArrayList<C4Element>();
    	if (c4Elements instanceof List) {
    		unfilteredC4Elements.addAll((List)c4Elements);
    	}
    	else if (c4Elements instanceof C4Element) {
    		unfilteredC4Elements.add((C4Element)c4Elements);
    	} 	
    	if (includeCondition instanceof FilterCondition) {
    		includeFilteredC4Elements = getFilteredC4Elements(unfilteredC4Elements, (FilterCondition)includeCondition, FilterType.valueOf(type), true, diagram);
    	}
    	else if (includeCondition instanceof NoFilterCondition) {
    		includeFilteredC4Elements.addAll(unfilteredC4Elements);
    	}	
    	if (excludeCondition instanceof FilterCondition) {
    		excludeFilteredC4Elements = getFilteredC4Elements(unfilteredC4Elements, (FilterCondition)excludeCondition, FilterType.valueOf(type), false, diagram);
    	}
    	else if (excludeCondition instanceof NoFilterCondition) {
    		excludeFilteredC4Elements.addAll(unfilteredC4Elements);
    	}
    	includeFilteredC4Elements.removeAll(excludeFilteredC4Elements);  	
    	return includeFilteredC4Elements;
    }
    
    private List<C4Element> getFilteredC4Elements(List<C4Element> c4Elements, FilterCondition filterCondition, FilterType filterType, boolean isInclude, Object diagram) {
    	List<C4Element> filteredC4Elements = new ArrayList<C4Element>();
    	if (filterCondition instanceof ElementTypeCondition) {
    		filteredC4Elements.addAll(getFilteredC4Elements(c4Elements, (ElementTypeCondition)filterCondition, filterType, isInclude, diagram));
		}
		else if (filterCondition instanceof ElementTagCondition) {
			filteredC4Elements.addAll(getFilteredC4Elements(c4Elements, (ElementTagCondition)filterCondition));
		}		
		else if (filterCondition instanceof ElementTechnologyCondition) {
			filteredC4Elements.addAll(getFilteredC4Elements(c4Elements, (ElementTechnologyCondition)filterCondition, isInclude, diagram));
		}
		else if (filterCondition instanceof ElementParentCondition) {
			filteredC4Elements.addAll(getFilteredC4Elements(c4Elements, (ElementParentCondition)filterCondition, isInclude, diagram));
		}
		else if (filterCondition instanceof ElementPropertyCondition) {
			filteredC4Elements.addAll(getFilteredC4Elements(c4Elements, (ElementPropertyCondition)filterCondition, isInclude, diagram));
		}
		else if (filterCondition instanceof CompositeCondition) {
			filteredC4Elements.addAll(getFilteredC4Elements(c4Elements, (CompositeCondition)filterCondition, filterType, isInclude, diagram));
		}
    	return filteredC4Elements;
    }
    
    private List<C4Element> getFilteredC4Elements(List<C4Element> c4Elements, ElementTypeCondition typeCondition, FilterType filterType, boolean isInclude, Object diagram) {
    	List<C4Element> filteredC4Elements = new ArrayList<C4Element>();
    	boolean equalsCondition = (ConditionComparisonOperation.EQUALS.equals(typeCondition.getComparisonOperation()) && (filterType.equals(typeCondition.getType()) || (isInclude && diagram instanceof ContainerView && FilterType.SOFTWARE_SYSTEM.equals(filterType) && FilterType.CONTAINER.equals(typeCondition.getType()))));
    	boolean notEqualsCondition = (ConditionComparisonOperation.NOT_EQUALS.equals(typeCondition.getComparisonOperation()) && !filterType.equals(typeCondition.getType()));
    	if (equalsCondition || notEqualsCondition) {
    		filteredC4Elements.addAll(c4Elements);
		}
    	return filteredC4Elements;
    }
    
    private List<C4Element> getFilteredC4Elements(List<C4Element> c4Elements, ElementTagCondition tagCondition) {
    	List<C4Element> filteredC4Elements = new ArrayList<C4Element>();    	
		for (C4Element c4Element : c4Elements) {
			boolean matchesCondition = (ConditionComparisonOperation.EQUALS.equals(tagCondition.getComparisonOperation())) ? tagMatchesCondition(c4Element.getTags(), tagCondition.getTags(), false, (c4Element.getTags().size() > 0)) : tagMatchesCondition(c4Element.getTags(), tagCondition.getTags(), true, true);
			if (matchesCondition) {
				filteredC4Elements.add(c4Element);
			}
		}
    	return filteredC4Elements;
    }
    
    private boolean tagMatchesCondition(List<Tag> elementTags, List<Tag> conditionTags, boolean isEquals, boolean matchesCondition) {
    	for (int i = 0; i < elementTags.size() && matchesCondition == true; i++) {
			for (int j = 0; j < conditionTags.size() && matchesCondition == true; j++) {
				boolean equalTagNames = Objects.equals(elementTags.get(i).getName(), conditionTags.get(j).getName());
				equalTagNames = (isEquals) ? equalTagNames : !equalTagNames;
				if (equalTagNames) {
					matchesCondition = false;
				}
			}
		}
    	return matchesCondition;
    }
    
    private List<C4Element> getFilteredC4Elements(List<C4Element> c4Elements, ElementTechnologyCondition technologyCondition, boolean isInclude, Object diagram) {
    	List<C4Element> filteredC4Elements = new ArrayList<C4Element>();
    	boolean equalsCondition = (ConditionComparisonOperation.EQUALS.equals(technologyCondition.getComparisonOperation()));
		for (C4Element c4Element : c4Elements) {
			boolean matchesCondition = c4ElementMatchesCondition(c4Element, technologyCondition, !equalsCondition);
			if (equalsCondition && isInclude && diagram instanceof ContainerView) {
				for (int i = 0; i < c4Element.eContents().size() && !matchesCondition; i++) {
					if (c4Element.eContents().get(i) instanceof C4Element) {
						matchesCondition = c4ElementMatchesCondition((C4Element)c4Element.eContents().get(i), technologyCondition, !equalsCondition);
					}
				}
			}
			if (matchesCondition) {
				filteredC4Elements.add(c4Element);	
			}
		}
    	return filteredC4Elements;
    }
    
    public boolean c4ElementMatchesCondition(C4Element c4Element, ElementTechnologyCondition technologyCondition, boolean matchesCondition) {
    	EStructuralFeature technologyFeature = c4Element.eClass().getEStructuralFeature("technology");
		if (technologyFeature != null) {			
			Technology technology = (Technology)c4Element.eGet(technologyFeature);
			if (technology != null) {
				if (Objects.equals(technology.getName(), technologyCondition.getTechnology().getName())) {
					return !matchesCondition;
				}
			}
		}
		return matchesCondition;
    }
     
    private List<C4Element> getFilteredC4Elements(List<C4Element> c4Elements, ElementPropertyCondition propertyCondition, boolean isInclude, Object diagram) {
    	List<C4Element> filteredC4Elements = new ArrayList<C4Element>();
    	boolean equalsCondition = (ConditionComparisonOperation.EQUALS.equals(propertyCondition.getComparisonOperation()));
		for (C4Element c4Element: c4Elements) {
			boolean matchesCondition = propertyMatchesCondition(c4Element.getProperties(), propertyCondition.getProperty().getName(), propertyCondition.getValue(), !equalsCondition);
			if (isInclude && diagram instanceof ContainerView) {
				for (int i = 0; i < c4Element.eContents().size() && !matchesCondition; i++) {
					if (c4Element.eContents().get(i) instanceof C4Element) {
		    			matchesCondition = propertyMatchesCondition(((C4Element)c4Element.eContents().get(i)).getProperties(), propertyCondition.getProperty().getName(), propertyCondition.getValue(), !equalsCondition);
					}
				}
			}
			if (matchesCondition) {
				filteredC4Elements.add(c4Element);
			}
		}
    	return filteredC4Elements;
    }
    
    private boolean propertyMatchesCondition(List<Property> properties, String propertyConditionName, String propertyConditionValue, boolean matchesCondition) {
    	for (Property property: properties) {
			if (Objects.equals(property.getName(), propertyConditionName) && Objects.equals(property.getValue(), propertyConditionValue)) {
				return !matchesCondition;
			}
		}
    	return matchesCondition;
    }
      
    private List<C4Element> getFilteredC4Elements(List<C4Element> c4Elements, ElementParentCondition parentCondition, boolean isInclude, Object diagram) {
    	List<C4Element> filteredC4Elements = new ArrayList<C4Element>();
    	boolean equalsCondition = (ConditionComparisonOperation.EQUALS.equals(parentCondition.getComparisonOperation()));
		for (C4Element c4Element: c4Elements) {		
			boolean matchesCondition = c4ElementMatchesCondition(c4Element, parentCondition, equalsCondition);		
			if(equalsCondition && isInclude && diagram instanceof ContainerView) {
				for (int i = 0; i < c4Element.eContents().size() && !matchesCondition; i++) {
					if (c4Element.eContents().get(i) instanceof C4Element) {
						matchesCondition = c4ElementMatchesCondition((C4Element)c4Element.eContents().get(i), parentCondition, equalsCondition);		
					}
				}
			}
			if (matchesCondition) {
				filteredC4Elements.add(c4Element);
			}
		}
    	return filteredC4Elements;
    }
    
    private boolean c4ElementMatchesCondition(C4Element c4Element, ElementParentCondition parentCondition, boolean equalsCondition) {	
    	boolean sameParent = c4Element.eContainer() == parentCondition.getParent();  	
    	return equalsCondition ? sameParent : !sameParent;
    }
     
    private List<C4Element> getFilteredC4Elements(List<C4Element> c4Elements, CompositeCondition compositeCondition, FilterType filterType, boolean isInclude, Object diagram) {
    	List<C4Element> filteredC4Elements = new ArrayList<C4Element>();   	
    	if (ConditionLogicalOperation.OR.equals(compositeCondition.getLogicalOperation())) {
    		filteredC4Elements.addAll(getFilteredC4Elements(c4Elements, compositeCondition.getLeft(), filterType, isInclude, diagram));
    		filteredC4Elements.addAll(getFilteredC4Elements(c4Elements, compositeCondition.getRight(), filterType, isInclude, diagram));
    	}
    	else {
    		List<C4Element> leftFilteredC4Elements = getFilteredC4Elements(c4Elements, compositeCondition.getLeft(), filterType, isInclude, diagram);
    		filteredC4Elements.addAll(getFilteredC4Elements(leftFilteredC4Elements, compositeCondition.getRight(), filterType, isInclude, diagram));
    	}
    	return filteredC4Elements;
    }
    
}