package pcs.impl;

import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import graphite.shared.DerivedPropertyData;

import pcs.SnapMirror;
import pcs.Volume;

@SuppressWarnings("rawtypes")
public class PropertiesData {

	public static class DerivedObjectClassContainer {
		public final static Class REPLICATIONPOLICY = XtextReplicationPolicyImpl.class;
		public final static Class CVO = XtextCVOImpl.class;
	}
	
	public static class DerivedObjectName {
		public final static String REPLICATIONPOLICY__REPLICATION_MAPPINGS = "replication_mappings";
		public final static String CVO__VOLUMES = "volumes";
	}
	
	public static class DerivedObjectType {
		public final static Class REPLICATIONPOLICY__REPLICATION_MAPPINGS = SnapMirror.class;
		public final static Class CVO__VOLUMES = Volume.class;
	}
	
	public static class DerivedObjectIsMany {
		public final static boolean REPLICATIONPOLICY__REPLICATION_MAPPINGS = true;
		public final static boolean CVO__VOLUMES = true;
	}
	
	public static class ParsedStringName {
		public final static String REPLICATIONPOLICY__REPLICATION_MAPPING = "replication_mapping";
		public final static String CVO__VOLUME = "volume";
	}
	
	public static class GrammarName {
		public final static String REPLICATIONPOLICY__REPLICATION_MAPPING = "org.netapp.pcs.grammarSnapMirror.ReplicationMappings";
		public final static String CVO__VOLUME = "org.netapp.pcs.grammarVolumes.Volumes";
	}
	
	public static class GrammarEntryRule {
		public final static String REPLICATIONPOLICY__REPLICATION_MAPPING = "ReplicationPolicy";
		public final static String CVO__VOLUME = "CVO";
	}
	
	public static class GrammarSetup {
		public final static ISetup REPLICATIONPOLICY__REPLICATION_MAPPING = new org.netapp.pcs.grammarSnapMirror.ReplicationMappingsStandaloneSetup();
		public final static ISetup CVO__VOLUME = new org.netapp.pcs.grammarVolumes.VolumesStandaloneSetup();
	}
	
	public static class GrammarPlugin {
		public final static Plugin REPLICATIONPOLICY__REPLICATION_MAPPING = org.netapp.pcs.grammarSnapMirror.ui.internal.GrammarSnapMirrorActivator.getInstance();
		public final static Plugin CVO__VOLUME = org.netapp.pcs.grammarVolumes.ui.internal.GrammarVolumesActivator.getInstance();
	}

	public final static Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.REPLICATIONPOLICY, Map.ofEntries(
			Map.entry(DerivedObjectName.REPLICATIONPOLICY__REPLICATION_MAPPINGS, new DerivedPropertyData(DerivedObjectName.REPLICATIONPOLICY__REPLICATION_MAPPINGS, ParsedStringName.REPLICATIONPOLICY__REPLICATION_MAPPING, GrammarName.REPLICATIONPOLICY__REPLICATION_MAPPING, GrammarEntryRule.REPLICATIONPOLICY__REPLICATION_MAPPING, GrammarSetup.REPLICATIONPOLICY__REPLICATION_MAPPING, GrammarPlugin.REPLICATIONPOLICY__REPLICATION_MAPPING, DerivedObjectClassContainer.REPLICATIONPOLICY, DerivedObjectType.REPLICATIONPOLICY__REPLICATION_MAPPINGS, DerivedObjectIsMany.REPLICATIONPOLICY__REPLICATION_MAPPINGS)))),					
	 	Map.entry(DerivedObjectClassContainer.CVO, Map.ofEntries(
			Map.entry(DerivedObjectName.CVO__VOLUMES, new DerivedPropertyData(DerivedObjectName.CVO__VOLUMES, ParsedStringName.CVO__VOLUME, GrammarName.CVO__VOLUME, GrammarEntryRule.CVO__VOLUME, GrammarSetup.CVO__VOLUME, GrammarPlugin.CVO__VOLUME, DerivedObjectClassContainer.CVO, DerivedObjectType.CVO__VOLUMES, DerivedObjectIsMany.CVO__VOLUMES)))));					
		
	public final static Map<Class, Map<String, String>> derivedPairsMappings = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.REPLICATIONPOLICY, Map.ofEntries(
			Map.entry(ParsedStringName.REPLICATIONPOLICY__REPLICATION_MAPPING, DerivedObjectName.REPLICATIONPOLICY__REPLICATION_MAPPINGS))),					
	 	Map.entry(DerivedObjectClassContainer.CVO, Map.ofEntries(
			Map.entry(ParsedStringName.CVO__VOLUME, DerivedObjectName.CVO__VOLUMES))));					
	
	public final static Map<Class, String> identifierAttributeByType = Map.ofEntries(
		/* protected region identifierAttributeByType on begin */
		
		/* protected region identifierAttributeByType end */
	);
	
	public final static Map<Class, SimpleAttributeResolver<EObject, String>> resolvers = Map.of(
		/* protected region resolvers on begin */
		
		/* protected region resolvers end */
	);
	
}