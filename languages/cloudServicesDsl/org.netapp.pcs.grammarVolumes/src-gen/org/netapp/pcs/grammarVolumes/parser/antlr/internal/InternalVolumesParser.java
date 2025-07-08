package org.netapp.pcs.grammarVolumes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.netapp.pcs.grammarVolumes.services.VolumesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVolumesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'name'", "':'", "'identifier'", "'state'", "'size'", "'size_unit'", "'svm_name'", "'export_policy_type'", "'export_policy_ip'", "'export_policy_nfs_version'", "'snapshot_policy'", "'environment'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVolumesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVolumesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVolumesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVolumes.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private VolumesGrammarAccess grammarAccess;

        public InternalVolumesParser(TokenStream input, VolumesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CVO";
       	}

       	@Override
       	protected VolumesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCVO"
    // InternalVolumes.g:70:1: entryRuleCVO returns [EObject current=null] : iv_ruleCVO= ruleCVO EOF ;
    public final EObject entryRuleCVO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCVO = null;


        try {
            // InternalVolumes.g:70:44: (iv_ruleCVO= ruleCVO EOF )
            // InternalVolumes.g:71:2: iv_ruleCVO= ruleCVO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCVORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCVO=ruleCVO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCVO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCVO"


    // $ANTLR start "ruleCVO"
    // InternalVolumes.g:77:1: ruleCVO returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_volumes_2_0= ruleVolume ) ) (otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCVO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_volumes_2_0 = null;

        EObject lv_volumes_4_0 = null;



        	enterRule();

        try {
            // InternalVolumes.g:83:2: ( ( () otherlv_1= '{' ( ( (lv_volumes_2_0= ruleVolume ) ) (otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) ) )* )? otherlv_5= '}' ) )
            // InternalVolumes.g:84:2: ( () otherlv_1= '{' ( ( (lv_volumes_2_0= ruleVolume ) ) (otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) ) )* )? otherlv_5= '}' )
            {
            // InternalVolumes.g:84:2: ( () otherlv_1= '{' ( ( (lv_volumes_2_0= ruleVolume ) ) (otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) ) )* )? otherlv_5= '}' )
            // InternalVolumes.g:85:3: () otherlv_1= '{' ( ( (lv_volumes_2_0= ruleVolume ) ) (otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) ) )* )? otherlv_5= '}'
            {
            // InternalVolumes.g:85:3: ()
            // InternalVolumes.g:86:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCVOAccess().getCVOAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCVOAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalVolumes.g:99:3: ( ( (lv_volumes_2_0= ruleVolume ) ) (otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalVolumes.g:100:4: ( (lv_volumes_2_0= ruleVolume ) ) (otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) ) )*
                    {
                    // InternalVolumes.g:100:4: ( (lv_volumes_2_0= ruleVolume ) )
                    // InternalVolumes.g:101:5: (lv_volumes_2_0= ruleVolume )
                    {
                    // InternalVolumes.g:101:5: (lv_volumes_2_0= ruleVolume )
                    // InternalVolumes.g:102:6: lv_volumes_2_0= ruleVolume
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCVOAccess().getVolumesVolumeParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_volumes_2_0=ruleVolume();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCVORule());
                      						}
                      						add(
                      							current,
                      							"volumes",
                      							lv_volumes_2_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.Volume");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVolumes.g:119:4: (otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalVolumes.g:120:5: otherlv_3= ',' ( (lv_volumes_4_0= ruleVolume ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCVOAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalVolumes.g:124:5: ( (lv_volumes_4_0= ruleVolume ) )
                    	    // InternalVolumes.g:125:6: (lv_volumes_4_0= ruleVolume )
                    	    {
                    	    // InternalVolumes.g:125:6: (lv_volumes_4_0= ruleVolume )
                    	    // InternalVolumes.g:126:7: lv_volumes_4_0= ruleVolume
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCVOAccess().getVolumesVolumeParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_volumes_4_0=ruleVolume();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCVORule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"volumes",
                    	      								lv_volumes_4_0,
                    	      								"org.netapp.pcs.grammarVolumes.Volumes.Volume");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCVOAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCVO"


    // $ANTLR start "entryRuleVolume"
    // InternalVolumes.g:153:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalVolumes.g:153:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalVolumes.g:154:2: iv_ruleVolume= ruleVolume EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVolumeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVolume; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalVolumes.g:160:1: ruleVolume returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'identifier' otherlv_7= ':' ( (lv_identifier_8_0= ruleEString ) ) otherlv_9= ',' )? (otherlv_10= 'state' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) otherlv_13= ',' )? (otherlv_14= 'size' otherlv_15= ':' ( (lv_size_16_0= ruleEDouble ) ) otherlv_17= ',' )? (otherlv_18= 'size_unit' otherlv_19= ':' ( (lv_size_unit_20_0= ruleEString ) ) otherlv_21= ',' )? (otherlv_22= 'svm_name' otherlv_23= ':' ( (lv_svm_name_24_0= ruleEString ) ) otherlv_25= ',' )? (otherlv_26= 'export_policy_type' otherlv_27= ':' ( (lv_export_policy_type_28_0= ruleEString ) ) otherlv_29= ',' )? (otherlv_30= 'export_policy_ip' otherlv_31= ':' otherlv_32= '{' ( (lv_export_policy_ip_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) ) )* otherlv_36= '}' otherlv_37= ',' )? (otherlv_38= 'export_policy_nfs_version' otherlv_39= ':' otherlv_40= '{' ( (lv_export_policy_nfs_version_41_0= ruleEString ) ) (otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) ) )* otherlv_44= '}' otherlv_45= ',' )? (otherlv_46= 'snapshot_policy' otherlv_47= ':' ( (otherlv_48= RULE_ID ) ) otherlv_49= ',' )? (otherlv_50= 'environment' otherlv_51= ':' ( (otherlv_52= RULE_ID ) ) )? otherlv_53= '}' ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_identifier_8_0 = null;

        AntlrDatatypeRuleToken lv_state_12_0 = null;

        AntlrDatatypeRuleToken lv_size_16_0 = null;

        AntlrDatatypeRuleToken lv_size_unit_20_0 = null;

        AntlrDatatypeRuleToken lv_svm_name_24_0 = null;

        AntlrDatatypeRuleToken lv_export_policy_type_28_0 = null;

        AntlrDatatypeRuleToken lv_export_policy_ip_33_0 = null;

        AntlrDatatypeRuleToken lv_export_policy_ip_35_0 = null;

        AntlrDatatypeRuleToken lv_export_policy_nfs_version_41_0 = null;

        AntlrDatatypeRuleToken lv_export_policy_nfs_version_43_0 = null;



        	enterRule();

        try {
            // InternalVolumes.g:166:2: ( ( () otherlv_1= '{' (otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'identifier' otherlv_7= ':' ( (lv_identifier_8_0= ruleEString ) ) otherlv_9= ',' )? (otherlv_10= 'state' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) otherlv_13= ',' )? (otherlv_14= 'size' otherlv_15= ':' ( (lv_size_16_0= ruleEDouble ) ) otherlv_17= ',' )? (otherlv_18= 'size_unit' otherlv_19= ':' ( (lv_size_unit_20_0= ruleEString ) ) otherlv_21= ',' )? (otherlv_22= 'svm_name' otherlv_23= ':' ( (lv_svm_name_24_0= ruleEString ) ) otherlv_25= ',' )? (otherlv_26= 'export_policy_type' otherlv_27= ':' ( (lv_export_policy_type_28_0= ruleEString ) ) otherlv_29= ',' )? (otherlv_30= 'export_policy_ip' otherlv_31= ':' otherlv_32= '{' ( (lv_export_policy_ip_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) ) )* otherlv_36= '}' otherlv_37= ',' )? (otherlv_38= 'export_policy_nfs_version' otherlv_39= ':' otherlv_40= '{' ( (lv_export_policy_nfs_version_41_0= ruleEString ) ) (otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) ) )* otherlv_44= '}' otherlv_45= ',' )? (otherlv_46= 'snapshot_policy' otherlv_47= ':' ( (otherlv_48= RULE_ID ) ) otherlv_49= ',' )? (otherlv_50= 'environment' otherlv_51= ':' ( (otherlv_52= RULE_ID ) ) )? otherlv_53= '}' ) )
            // InternalVolumes.g:167:2: ( () otherlv_1= '{' (otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'identifier' otherlv_7= ':' ( (lv_identifier_8_0= ruleEString ) ) otherlv_9= ',' )? (otherlv_10= 'state' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) otherlv_13= ',' )? (otherlv_14= 'size' otherlv_15= ':' ( (lv_size_16_0= ruleEDouble ) ) otherlv_17= ',' )? (otherlv_18= 'size_unit' otherlv_19= ':' ( (lv_size_unit_20_0= ruleEString ) ) otherlv_21= ',' )? (otherlv_22= 'svm_name' otherlv_23= ':' ( (lv_svm_name_24_0= ruleEString ) ) otherlv_25= ',' )? (otherlv_26= 'export_policy_type' otherlv_27= ':' ( (lv_export_policy_type_28_0= ruleEString ) ) otherlv_29= ',' )? (otherlv_30= 'export_policy_ip' otherlv_31= ':' otherlv_32= '{' ( (lv_export_policy_ip_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) ) )* otherlv_36= '}' otherlv_37= ',' )? (otherlv_38= 'export_policy_nfs_version' otherlv_39= ':' otherlv_40= '{' ( (lv_export_policy_nfs_version_41_0= ruleEString ) ) (otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) ) )* otherlv_44= '}' otherlv_45= ',' )? (otherlv_46= 'snapshot_policy' otherlv_47= ':' ( (otherlv_48= RULE_ID ) ) otherlv_49= ',' )? (otherlv_50= 'environment' otherlv_51= ':' ( (otherlv_52= RULE_ID ) ) )? otherlv_53= '}' )
            {
            // InternalVolumes.g:167:2: ( () otherlv_1= '{' (otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'identifier' otherlv_7= ':' ( (lv_identifier_8_0= ruleEString ) ) otherlv_9= ',' )? (otherlv_10= 'state' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) otherlv_13= ',' )? (otherlv_14= 'size' otherlv_15= ':' ( (lv_size_16_0= ruleEDouble ) ) otherlv_17= ',' )? (otherlv_18= 'size_unit' otherlv_19= ':' ( (lv_size_unit_20_0= ruleEString ) ) otherlv_21= ',' )? (otherlv_22= 'svm_name' otherlv_23= ':' ( (lv_svm_name_24_0= ruleEString ) ) otherlv_25= ',' )? (otherlv_26= 'export_policy_type' otherlv_27= ':' ( (lv_export_policy_type_28_0= ruleEString ) ) otherlv_29= ',' )? (otherlv_30= 'export_policy_ip' otherlv_31= ':' otherlv_32= '{' ( (lv_export_policy_ip_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) ) )* otherlv_36= '}' otherlv_37= ',' )? (otherlv_38= 'export_policy_nfs_version' otherlv_39= ':' otherlv_40= '{' ( (lv_export_policy_nfs_version_41_0= ruleEString ) ) (otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) ) )* otherlv_44= '}' otherlv_45= ',' )? (otherlv_46= 'snapshot_policy' otherlv_47= ':' ( (otherlv_48= RULE_ID ) ) otherlv_49= ',' )? (otherlv_50= 'environment' otherlv_51= ':' ( (otherlv_52= RULE_ID ) ) )? otherlv_53= '}' )
            // InternalVolumes.g:168:3: () otherlv_1= '{' (otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' )? (otherlv_6= 'identifier' otherlv_7= ':' ( (lv_identifier_8_0= ruleEString ) ) otherlv_9= ',' )? (otherlv_10= 'state' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) otherlv_13= ',' )? (otherlv_14= 'size' otherlv_15= ':' ( (lv_size_16_0= ruleEDouble ) ) otherlv_17= ',' )? (otherlv_18= 'size_unit' otherlv_19= ':' ( (lv_size_unit_20_0= ruleEString ) ) otherlv_21= ',' )? (otherlv_22= 'svm_name' otherlv_23= ':' ( (lv_svm_name_24_0= ruleEString ) ) otherlv_25= ',' )? (otherlv_26= 'export_policy_type' otherlv_27= ':' ( (lv_export_policy_type_28_0= ruleEString ) ) otherlv_29= ',' )? (otherlv_30= 'export_policy_ip' otherlv_31= ':' otherlv_32= '{' ( (lv_export_policy_ip_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) ) )* otherlv_36= '}' otherlv_37= ',' )? (otherlv_38= 'export_policy_nfs_version' otherlv_39= ':' otherlv_40= '{' ( (lv_export_policy_nfs_version_41_0= ruleEString ) ) (otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) ) )* otherlv_44= '}' otherlv_45= ',' )? (otherlv_46= 'snapshot_policy' otherlv_47= ':' ( (otherlv_48= RULE_ID ) ) otherlv_49= ',' )? (otherlv_50= 'environment' otherlv_51= ':' ( (otherlv_52= RULE_ID ) ) )? otherlv_53= '}'
            {
            // InternalVolumes.g:168:3: ()
            // InternalVolumes.g:169:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVolumeAccess().getVolumeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalVolumes.g:182:3: (otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVolumes.g:183:4: otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ','
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVolumeAccess().getNameKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVolumeAccess().getColonKeyword_2_1());
                      			
                    }
                    // InternalVolumes.g:191:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalVolumes.g:192:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalVolumes.g:192:5: (lv_name_4_0= ruleEString )
                    // InternalVolumes.g:193:6: lv_name_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getNameEStringParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_name_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_4_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getVolumeAccess().getCommaKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:215:3: (otherlv_6= 'identifier' otherlv_7= ':' ( (lv_identifier_8_0= ruleEString ) ) otherlv_9= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVolumes.g:216:4: otherlv_6= 'identifier' otherlv_7= ':' ( (lv_identifier_8_0= ruleEString ) ) otherlv_9= ','
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getVolumeAccess().getIdentifierKeyword_3_0());
                      			
                    }
                    otherlv_7=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getVolumeAccess().getColonKeyword_3_1());
                      			
                    }
                    // InternalVolumes.g:224:4: ( (lv_identifier_8_0= ruleEString ) )
                    // InternalVolumes.g:225:5: (lv_identifier_8_0= ruleEString )
                    {
                    // InternalVolumes.g:225:5: (lv_identifier_8_0= ruleEString )
                    // InternalVolumes.g:226:6: lv_identifier_8_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getIdentifierEStringParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_identifier_8_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						set(
                      							current,
                      							"identifier",
                      							lv_identifier_8_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getVolumeAccess().getCommaKeyword_3_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:248:3: (otherlv_10= 'state' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) otherlv_13= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVolumes.g:249:4: otherlv_10= 'state' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) otherlv_13= ','
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getVolumeAccess().getStateKeyword_4_0());
                      			
                    }
                    otherlv_11=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getVolumeAccess().getColonKeyword_4_1());
                      			
                    }
                    // InternalVolumes.g:257:4: ( (lv_state_12_0= ruleEString ) )
                    // InternalVolumes.g:258:5: (lv_state_12_0= ruleEString )
                    {
                    // InternalVolumes.g:258:5: (lv_state_12_0= ruleEString )
                    // InternalVolumes.g:259:6: lv_state_12_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getStateEStringParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_state_12_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						set(
                      							current,
                      							"state",
                      							lv_state_12_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getVolumeAccess().getCommaKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:281:3: (otherlv_14= 'size' otherlv_15= ':' ( (lv_size_16_0= ruleEDouble ) ) otherlv_17= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVolumes.g:282:4: otherlv_14= 'size' otherlv_15= ':' ( (lv_size_16_0= ruleEDouble ) ) otherlv_17= ','
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getVolumeAccess().getSizeKeyword_5_0());
                      			
                    }
                    otherlv_15=(Token)match(input,15,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getVolumeAccess().getColonKeyword_5_1());
                      			
                    }
                    // InternalVolumes.g:290:4: ( (lv_size_16_0= ruleEDouble ) )
                    // InternalVolumes.g:291:5: (lv_size_16_0= ruleEDouble )
                    {
                    // InternalVolumes.g:291:5: (lv_size_16_0= ruleEDouble )
                    // InternalVolumes.g:292:6: lv_size_16_0= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getSizeEDoubleParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_size_16_0=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_16_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EDouble");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getVolumeAccess().getCommaKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:314:3: (otherlv_18= 'size_unit' otherlv_19= ':' ( (lv_size_unit_20_0= ruleEString ) ) otherlv_21= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVolumes.g:315:4: otherlv_18= 'size_unit' otherlv_19= ':' ( (lv_size_unit_20_0= ruleEString ) ) otherlv_21= ','
                    {
                    otherlv_18=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getVolumeAccess().getSize_unitKeyword_6_0());
                      			
                    }
                    otherlv_19=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getVolumeAccess().getColonKeyword_6_1());
                      			
                    }
                    // InternalVolumes.g:323:4: ( (lv_size_unit_20_0= ruleEString ) )
                    // InternalVolumes.g:324:5: (lv_size_unit_20_0= ruleEString )
                    {
                    // InternalVolumes.g:324:5: (lv_size_unit_20_0= ruleEString )
                    // InternalVolumes.g:325:6: lv_size_unit_20_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getSize_unitEStringParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_size_unit_20_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						set(
                      							current,
                      							"size_unit",
                      							lv_size_unit_20_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,12,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getVolumeAccess().getCommaKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:347:3: (otherlv_22= 'svm_name' otherlv_23= ':' ( (lv_svm_name_24_0= ruleEString ) ) otherlv_25= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVolumes.g:348:4: otherlv_22= 'svm_name' otherlv_23= ':' ( (lv_svm_name_24_0= ruleEString ) ) otherlv_25= ','
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getVolumeAccess().getSvm_nameKeyword_7_0());
                      			
                    }
                    otherlv_23=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getVolumeAccess().getColonKeyword_7_1());
                      			
                    }
                    // InternalVolumes.g:356:4: ( (lv_svm_name_24_0= ruleEString ) )
                    // InternalVolumes.g:357:5: (lv_svm_name_24_0= ruleEString )
                    {
                    // InternalVolumes.g:357:5: (lv_svm_name_24_0= ruleEString )
                    // InternalVolumes.g:358:6: lv_svm_name_24_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getSvm_nameEStringParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_svm_name_24_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						set(
                      							current,
                      							"svm_name",
                      							lv_svm_name_24_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,12,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getVolumeAccess().getCommaKeyword_7_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:380:3: (otherlv_26= 'export_policy_type' otherlv_27= ':' ( (lv_export_policy_type_28_0= ruleEString ) ) otherlv_29= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVolumes.g:381:4: otherlv_26= 'export_policy_type' otherlv_27= ':' ( (lv_export_policy_type_28_0= ruleEString ) ) otherlv_29= ','
                    {
                    otherlv_26=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getVolumeAccess().getExport_policy_typeKeyword_8_0());
                      			
                    }
                    otherlv_27=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getVolumeAccess().getColonKeyword_8_1());
                      			
                    }
                    // InternalVolumes.g:389:4: ( (lv_export_policy_type_28_0= ruleEString ) )
                    // InternalVolumes.g:390:5: (lv_export_policy_type_28_0= ruleEString )
                    {
                    // InternalVolumes.g:390:5: (lv_export_policy_type_28_0= ruleEString )
                    // InternalVolumes.g:391:6: lv_export_policy_type_28_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getExport_policy_typeEStringParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_export_policy_type_28_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						set(
                      							current,
                      							"export_policy_type",
                      							lv_export_policy_type_28_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getVolumeAccess().getCommaKeyword_8_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:413:3: (otherlv_30= 'export_policy_ip' otherlv_31= ':' otherlv_32= '{' ( (lv_export_policy_ip_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) ) )* otherlv_36= '}' otherlv_37= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVolumes.g:414:4: otherlv_30= 'export_policy_ip' otherlv_31= ':' otherlv_32= '{' ( (lv_export_policy_ip_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) ) )* otherlv_36= '}' otherlv_37= ','
                    {
                    otherlv_30=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getVolumeAccess().getExport_policy_ipKeyword_9_0());
                      			
                    }
                    otherlv_31=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getVolumeAccess().getColonKeyword_9_1());
                      			
                    }
                    otherlv_32=(Token)match(input,11,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_9_2());
                      			
                    }
                    // InternalVolumes.g:426:4: ( (lv_export_policy_ip_33_0= ruleEString ) )
                    // InternalVolumes.g:427:5: (lv_export_policy_ip_33_0= ruleEString )
                    {
                    // InternalVolumes.g:427:5: (lv_export_policy_ip_33_0= ruleEString )
                    // InternalVolumes.g:428:6: lv_export_policy_ip_33_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getExport_policy_ipEStringParserRuleCall_9_3_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_export_policy_ip_33_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						add(
                      							current,
                      							"export_policy_ip",
                      							lv_export_policy_ip_33_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVolumes.g:445:4: (otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==12) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalVolumes.g:446:5: otherlv_34= ',' ( (lv_export_policy_ip_35_0= ruleEString ) )
                    	    {
                    	    otherlv_34=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_34, grammarAccess.getVolumeAccess().getCommaKeyword_9_4_0());
                    	      				
                    	    }
                    	    // InternalVolumes.g:450:5: ( (lv_export_policy_ip_35_0= ruleEString ) )
                    	    // InternalVolumes.g:451:6: (lv_export_policy_ip_35_0= ruleEString )
                    	    {
                    	    // InternalVolumes.g:451:6: (lv_export_policy_ip_35_0= ruleEString )
                    	    // InternalVolumes.g:452:7: lv_export_policy_ip_35_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getVolumeAccess().getExport_policy_ipEStringParserRuleCall_9_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_export_policy_ip_35_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getVolumeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"export_policy_ip",
                    	      								lv_export_policy_ip_35_0,
                    	      								"org.netapp.pcs.grammarVolumes.Volumes.EString");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_9_5());
                      			
                    }
                    otherlv_37=(Token)match(input,12,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getVolumeAccess().getCommaKeyword_9_6());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:479:3: (otherlv_38= 'export_policy_nfs_version' otherlv_39= ':' otherlv_40= '{' ( (lv_export_policy_nfs_version_41_0= ruleEString ) ) (otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) ) )* otherlv_44= '}' otherlv_45= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVolumes.g:480:4: otherlv_38= 'export_policy_nfs_version' otherlv_39= ':' otherlv_40= '{' ( (lv_export_policy_nfs_version_41_0= ruleEString ) ) (otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) ) )* otherlv_44= '}' otherlv_45= ','
                    {
                    otherlv_38=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getVolumeAccess().getExport_policy_nfs_versionKeyword_10_0());
                      			
                    }
                    otherlv_39=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getVolumeAccess().getColonKeyword_10_1());
                      			
                    }
                    otherlv_40=(Token)match(input,11,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_40, grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_10_2());
                      			
                    }
                    // InternalVolumes.g:492:4: ( (lv_export_policy_nfs_version_41_0= ruleEString ) )
                    // InternalVolumes.g:493:5: (lv_export_policy_nfs_version_41_0= ruleEString )
                    {
                    // InternalVolumes.g:493:5: (lv_export_policy_nfs_version_41_0= ruleEString )
                    // InternalVolumes.g:494:6: lv_export_policy_nfs_version_41_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVolumeAccess().getExport_policy_nfs_versionEStringParserRuleCall_10_3_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_export_policy_nfs_version_41_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVolumeRule());
                      						}
                      						add(
                      							current,
                      							"export_policy_nfs_version",
                      							lv_export_policy_nfs_version_41_0,
                      							"org.netapp.pcs.grammarVolumes.Volumes.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVolumes.g:511:4: (otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==12) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalVolumes.g:512:5: otherlv_42= ',' ( (lv_export_policy_nfs_version_43_0= ruleEString ) )
                    	    {
                    	    otherlv_42=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_42, grammarAccess.getVolumeAccess().getCommaKeyword_10_4_0());
                    	      				
                    	    }
                    	    // InternalVolumes.g:516:5: ( (lv_export_policy_nfs_version_43_0= ruleEString ) )
                    	    // InternalVolumes.g:517:6: (lv_export_policy_nfs_version_43_0= ruleEString )
                    	    {
                    	    // InternalVolumes.g:517:6: (lv_export_policy_nfs_version_43_0= ruleEString )
                    	    // InternalVolumes.g:518:7: lv_export_policy_nfs_version_43_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getVolumeAccess().getExport_policy_nfs_versionEStringParserRuleCall_10_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_export_policy_nfs_version_43_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getVolumeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"export_policy_nfs_version",
                    	      								lv_export_policy_nfs_version_43_0,
                    	      								"org.netapp.pcs.grammarVolumes.Volumes.EString");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_44=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_44, grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_10_5());
                      			
                    }
                    otherlv_45=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getVolumeAccess().getCommaKeyword_10_6());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:545:3: (otherlv_46= 'snapshot_policy' otherlv_47= ':' ( (otherlv_48= RULE_ID ) ) otherlv_49= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVolumes.g:546:4: otherlv_46= 'snapshot_policy' otherlv_47= ':' ( (otherlv_48= RULE_ID ) ) otherlv_49= ','
                    {
                    otherlv_46=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_46, grammarAccess.getVolumeAccess().getSnapshot_policyKeyword_11_0());
                      			
                    }
                    otherlv_47=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_47, grammarAccess.getVolumeAccess().getColonKeyword_11_1());
                      			
                    }
                    // InternalVolumes.g:554:4: ( (otherlv_48= RULE_ID ) )
                    // InternalVolumes.g:555:5: (otherlv_48= RULE_ID )
                    {
                    // InternalVolumes.g:555:5: (otherlv_48= RULE_ID )
                    // InternalVolumes.g:556:6: otherlv_48= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVolumeRule());
                      						}
                      					
                    }
                    otherlv_48=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_48, grammarAccess.getVolumeAccess().getSnapshot_policySnapshotPolicyCrossReference_11_2_0());
                      					
                    }

                    }


                    }

                    otherlv_49=(Token)match(input,12,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_49, grammarAccess.getVolumeAccess().getCommaKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:575:3: (otherlv_50= 'environment' otherlv_51= ':' ( (otherlv_52= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVolumes.g:576:4: otherlv_50= 'environment' otherlv_51= ':' ( (otherlv_52= RULE_ID ) )
                    {
                    otherlv_50=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_50, grammarAccess.getVolumeAccess().getEnvironmentKeyword_12_0());
                      			
                    }
                    otherlv_51=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getVolumeAccess().getColonKeyword_12_1());
                      			
                    }
                    // InternalVolumes.g:584:4: ( (otherlv_52= RULE_ID ) )
                    // InternalVolumes.g:585:5: (otherlv_52= RULE_ID )
                    {
                    // InternalVolumes.g:585:5: (otherlv_52= RULE_ID )
                    // InternalVolumes.g:586:6: otherlv_52= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVolumeRule());
                      						}
                      					
                    }
                    otherlv_52=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_52, grammarAccess.getVolumeAccess().getEnvironmentEnvironmentCrossReference_12_2_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_53=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_53, grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_13());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleEString"
    // InternalVolumes.g:609:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVolumes.g:609:47: (iv_ruleEString= ruleEString EOF )
            // InternalVolumes.g:610:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalVolumes.g:616:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVolumes.g:622:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVolumes.g:623:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVolumes.g:623:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVolumes.g:624:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVolumes.g:632:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalVolumes.g:643:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalVolumes.g:643:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalVolumes.g:644:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalVolumes.g:650:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalVolumes.g:656:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? ) )
            // InternalVolumes.g:657:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? )
            {
            // InternalVolumes.g:657:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? )
            // InternalVolumes.g:658:3: (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )?
            {
            // InternalVolumes.g:658:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVolumes.g:659:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:665:3: (this_INT_1= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVolumes.g:666:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            // InternalVolumes.g:674:3: (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVolumes.g:675:4: kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    {
                    kw=(Token)match(input,27,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2_0());
                      			
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_1());
                      			
                    }
                    // InternalVolumes.g:687:4: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=28 && LA21_0<=29)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalVolumes.g:688:5: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                            {
                            // InternalVolumes.g:688:5: (kw= 'E' | kw= 'e' )
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==28) ) {
                                alt19=1;
                            }
                            else if ( (LA19_0==29) ) {
                                alt19=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 0, input);

                                throw nvae;
                            }
                            switch (alt19) {
                                case 1 :
                                    // InternalVolumes.g:689:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,28,FOLLOW_27); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(kw);
                                      						newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_0());
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalVolumes.g:695:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,29,FOLLOW_27); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(kw);
                                      						newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_1());
                                      					
                                    }

                                    }
                                    break;

                            }

                            // InternalVolumes.g:701:5: (kw= '-' )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==26) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalVolumes.g:702:6: kw= '-'
                                    {
                                    kw=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(kw);
                                      						newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_2_2_1());
                                      					
                                    }

                                    }
                                    break;

                            }

                            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_INT_7);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_2_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003FF6000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003FF2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003FE2000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003FC2000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C001040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003F82000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003F02000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003E02000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003C02000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003802000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000042L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000040L});

}