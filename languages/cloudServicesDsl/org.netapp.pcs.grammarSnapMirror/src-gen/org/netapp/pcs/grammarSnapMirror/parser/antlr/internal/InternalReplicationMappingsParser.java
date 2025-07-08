package org.netapp.pcs.grammarSnapMirror.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.netapp.pcs.grammarSnapMirror.services.ReplicationMappingsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalReplicationMappingsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'->'", "'<->'", "'{'", "'policy'", "':'", "','", "'max_transfer_rate'", "'}'", "'-'"
    };
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalReplicationMappingsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReplicationMappingsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReplicationMappingsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReplicationMappings.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private ReplicationMappingsGrammarAccess grammarAccess;

        public InternalReplicationMappingsParser(TokenStream input, ReplicationMappingsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ReplicationPolicy";
       	}

       	@Override
       	protected ReplicationMappingsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleReplicationPolicy"
    // InternalReplicationMappings.g:70:1: entryRuleReplicationPolicy returns [EObject current=null] : iv_ruleReplicationPolicy= ruleReplicationPolicy EOF ;
    public final EObject entryRuleReplicationPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplicationPolicy = null;


        try {
            // InternalReplicationMappings.g:70:58: (iv_ruleReplicationPolicy= ruleReplicationPolicy EOF )
            // InternalReplicationMappings.g:71:2: iv_ruleReplicationPolicy= ruleReplicationPolicy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReplicationPolicyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReplicationPolicy=ruleReplicationPolicy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReplicationPolicy; 
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
    // $ANTLR end "entryRuleReplicationPolicy"


    // $ANTLR start "ruleReplicationPolicy"
    // InternalReplicationMappings.g:77:1: ruleReplicationPolicy returns [EObject current=null] : ( () ( (lv_replication_mappings_1_0= ruleReplicationMappings ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_replication_mappings_3_0= ruleReplicationMappings ) ) )* ) ;
    public final EObject ruleReplicationPolicy() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_2=null;
        EObject lv_replication_mappings_1_0 = null;

        EObject lv_replication_mappings_3_0 = null;



        	enterRule();

        try {
            // InternalReplicationMappings.g:83:2: ( ( () ( (lv_replication_mappings_1_0= ruleReplicationMappings ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_replication_mappings_3_0= ruleReplicationMappings ) ) )* ) )
            // InternalReplicationMappings.g:84:2: ( () ( (lv_replication_mappings_1_0= ruleReplicationMappings ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_replication_mappings_3_0= ruleReplicationMappings ) ) )* )
            {
            // InternalReplicationMappings.g:84:2: ( () ( (lv_replication_mappings_1_0= ruleReplicationMappings ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_replication_mappings_3_0= ruleReplicationMappings ) ) )* )
            // InternalReplicationMappings.g:85:3: () ( (lv_replication_mappings_1_0= ruleReplicationMappings ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_replication_mappings_3_0= ruleReplicationMappings ) ) )*
            {
            // InternalReplicationMappings.g:85:3: ()
            // InternalReplicationMappings.g:86:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReplicationPolicyAccess().getReplicationPolicyAction_0(),
              					current);
              			
            }

            }

            // InternalReplicationMappings.g:95:3: ( (lv_replication_mappings_1_0= ruleReplicationMappings ) )
            // InternalReplicationMappings.g:96:4: (lv_replication_mappings_1_0= ruleReplicationMappings )
            {
            // InternalReplicationMappings.g:96:4: (lv_replication_mappings_1_0= ruleReplicationMappings )
            // InternalReplicationMappings.g:97:5: lv_replication_mappings_1_0= ruleReplicationMappings
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsReplicationMappingsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_replication_mappings_1_0=ruleReplicationMappings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReplicationPolicyRule());
              					}
              					add(
              						current,
              						"replication_mappings",
              						lv_replication_mappings_1_0,
              						"org.netapp.pcs.grammarSnapMirror.ReplicationMappings.ReplicationMappings");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReplicationMappings.g:114:3: (this_NEWLINE_2= RULE_NEWLINE ( (lv_replication_mappings_3_0= ruleReplicationMappings ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReplicationMappings.g:115:4: this_NEWLINE_2= RULE_NEWLINE ( (lv_replication_mappings_3_0= ruleReplicationMappings ) )
            	    {
            	    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_NEWLINE_2, grammarAccess.getReplicationPolicyAccess().getNEWLINETerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalReplicationMappings.g:119:4: ( (lv_replication_mappings_3_0= ruleReplicationMappings ) )
            	    // InternalReplicationMappings.g:120:5: (lv_replication_mappings_3_0= ruleReplicationMappings )
            	    {
            	    // InternalReplicationMappings.g:120:5: (lv_replication_mappings_3_0= ruleReplicationMappings )
            	    // InternalReplicationMappings.g:121:6: lv_replication_mappings_3_0= ruleReplicationMappings
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsReplicationMappingsParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_replication_mappings_3_0=ruleReplicationMappings();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReplicationPolicyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"replication_mappings",
            	      							lv_replication_mappings_3_0,
            	      							"org.netapp.pcs.grammarSnapMirror.ReplicationMappings.ReplicationMappings");
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
    // $ANTLR end "ruleReplicationPolicy"


    // $ANTLR start "entryRuleReplicationMappings"
    // InternalReplicationMappings.g:143:1: entryRuleReplicationMappings returns [EObject current=null] : iv_ruleReplicationMappings= ruleReplicationMappings EOF ;
    public final EObject entryRuleReplicationMappings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplicationMappings = null;


        try {
            // InternalReplicationMappings.g:143:60: (iv_ruleReplicationMappings= ruleReplicationMappings EOF )
            // InternalReplicationMappings.g:144:2: iv_ruleReplicationMappings= ruleReplicationMappings EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReplicationMappingsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReplicationMappings=ruleReplicationMappings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReplicationMappings; 
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
    // $ANTLR end "entryRuleReplicationMappings"


    // $ANTLR start "ruleReplicationMappings"
    // InternalReplicationMappings.g:150:1: ruleReplicationMappings returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )? )? (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) )? )? (otherlv_9= '{' (otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )? (otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) ) )? otherlv_17= '}' )? ) ;
    public final EObject ruleReplicationMappings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_bidirectional_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_max_transfer_rate_16_0 = null;



        	enterRule();

        try {
            // InternalReplicationMappings.g:156:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )? )? (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) )? )? (otherlv_9= '{' (otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )? (otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) ) )? otherlv_17= '}' )? ) )
            // InternalReplicationMappings.g:157:2: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )? )? (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) )? )? (otherlv_9= '{' (otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )? (otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) ) )? otherlv_17= '}' )? )
            {
            // InternalReplicationMappings.g:157:2: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )? )? (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) )? )? (otherlv_9= '{' (otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )? (otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) ) )? otherlv_17= '}' )? )
            // InternalReplicationMappings.g:158:3: () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )? )? (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) )? )? (otherlv_9= '{' (otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )? (otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) ) )? otherlv_17= '}' )?
            {
            // InternalReplicationMappings.g:158:3: ()
            // InternalReplicationMappings.g:159:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReplicationMappingsAccess().getSnapMirrorAction_0(),
              					current);
              			
            }

            }

            // InternalReplicationMappings.g:168:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReplicationMappings.g:169:4: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )?
                    {
                    // InternalReplicationMappings.g:169:4: ( (otherlv_1= RULE_ID ) )
                    // InternalReplicationMappings.g:170:5: (otherlv_1= RULE_ID )
                    {
                    // InternalReplicationMappings.g:170:5: (otherlv_1= RULE_ID )
                    // InternalReplicationMappings.g:171:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReplicationMappingsRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getReplicationMappingsAccess().getSource_cvoCVOCrossReference_1_0_0());
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getReplicationMappingsAccess().getFullStopKeyword_1_1());
                      			
                    }
                    // InternalReplicationMappings.g:189:4: ( (otherlv_3= RULE_ID ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalReplicationMappings.g:190:5: (otherlv_3= RULE_ID )
                            {
                            // InternalReplicationMappings.g:190:5: (otherlv_3= RULE_ID )
                            // InternalReplicationMappings.g:191:6: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getReplicationMappingsRule());
                              						}
                              					
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getReplicationMappingsAccess().getSource_volumeVolumeCrossReference_1_2_0());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalReplicationMappings.g:206:3: (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReplicationMappings.g:207:4: otherlv_4= '->'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getReplicationMappingsAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReplicationMappings.g:212:4: ( (lv_bidirectional_5_0= '<->' ) )
                    {
                    // InternalReplicationMappings.g:212:4: ( (lv_bidirectional_5_0= '<->' ) )
                    // InternalReplicationMappings.g:213:5: (lv_bidirectional_5_0= '<->' )
                    {
                    // InternalReplicationMappings.g:213:5: (lv_bidirectional_5_0= '<->' )
                    // InternalReplicationMappings.g:214:6: lv_bidirectional_5_0= '<->'
                    {
                    lv_bidirectional_5_0=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_bidirectional_5_0, grammarAccess.getReplicationMappingsAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReplicationMappingsRule());
                      						}
                      						setWithLastConsumed(current, "bidirectional", lv_bidirectional_5_0 != null, "<->");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalReplicationMappings.g:227:3: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReplicationMappings.g:228:4: ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) )?
                    {
                    // InternalReplicationMappings.g:228:4: ( (otherlv_6= RULE_ID ) )
                    // InternalReplicationMappings.g:229:5: (otherlv_6= RULE_ID )
                    {
                    // InternalReplicationMappings.g:229:5: (otherlv_6= RULE_ID )
                    // InternalReplicationMappings.g:230:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReplicationMappingsRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getReplicationMappingsAccess().getDestination_cvoCVOCrossReference_3_0_0());
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getReplicationMappingsAccess().getFullStopKeyword_3_1());
                      			
                    }
                    // InternalReplicationMappings.g:248:4: ( (otherlv_8= RULE_ID ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalReplicationMappings.g:249:5: (otherlv_8= RULE_ID )
                            {
                            // InternalReplicationMappings.g:249:5: (otherlv_8= RULE_ID )
                            // InternalReplicationMappings.g:250:6: otherlv_8= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getReplicationMappingsRule());
                              						}
                              					
                            }
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getReplicationMappingsAccess().getDestination_volumeVolumeCrossReference_3_2_0());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalReplicationMappings.g:265:3: (otherlv_9= '{' (otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )? (otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) ) )? otherlv_17= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReplicationMappings.g:266:4: otherlv_9= '{' (otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )? (otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) ) )? otherlv_17= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getReplicationMappingsAccess().getLeftCurlyBracketKeyword_4_0());
                      			
                    }
                    // InternalReplicationMappings.g:270:4: (otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==16) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalReplicationMappings.g:271:5: otherlv_10= 'policy' otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= ','
                            {
                            otherlv_10=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getReplicationMappingsAccess().getPolicyKeyword_4_1_0());
                              				
                            }
                            otherlv_11=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getReplicationMappingsAccess().getColonKeyword_4_1_1());
                              				
                            }
                            // InternalReplicationMappings.g:279:5: ( (otherlv_12= RULE_ID ) )
                            // InternalReplicationMappings.g:280:6: (otherlv_12= RULE_ID )
                            {
                            // InternalReplicationMappings.g:280:6: (otherlv_12= RULE_ID )
                            // InternalReplicationMappings.g:281:7: otherlv_12= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              							/* */
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getReplicationMappingsRule());
                              							}
                              						
                            }
                            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_12, grammarAccess.getReplicationMappingsAccess().getPolicySnapshotPolicyCrossReference_4_1_2_0());
                              						
                            }

                            }


                            }

                            otherlv_13=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getReplicationMappingsAccess().getCommaKeyword_4_1_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalReplicationMappings.g:300:4: (otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalReplicationMappings.g:301:5: otherlv_14= 'max_transfer_rate' otherlv_15= ':' ( (lv_max_transfer_rate_16_0= ruleEInt ) )
                            {
                            otherlv_14=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getReplicationMappingsAccess().getMax_transfer_rateKeyword_4_2_0());
                              				
                            }
                            otherlv_15=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getReplicationMappingsAccess().getColonKeyword_4_2_1());
                              				
                            }
                            // InternalReplicationMappings.g:309:5: ( (lv_max_transfer_rate_16_0= ruleEInt ) )
                            // InternalReplicationMappings.g:310:6: (lv_max_transfer_rate_16_0= ruleEInt )
                            {
                            // InternalReplicationMappings.g:310:6: (lv_max_transfer_rate_16_0= ruleEInt )
                            // InternalReplicationMappings.g:311:7: lv_max_transfer_rate_16_0= ruleEInt
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getReplicationMappingsAccess().getMax_transfer_rateEIntParserRuleCall_4_2_2_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_max_transfer_rate_16_0=ruleEInt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getReplicationMappingsRule());
                              							}
                              							set(
                              								current,
                              								"max_transfer_rate",
                              								lv_max_transfer_rate_16_0,
                              								"org.netapp.pcs.grammarSnapMirror.ReplicationMappings.EInt");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getReplicationMappingsAccess().getRightCurlyBracketKeyword_4_3());
                      			
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
    // $ANTLR end "ruleReplicationMappings"


    // $ANTLR start "entryRuleEInt"
    // InternalReplicationMappings.g:338:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalReplicationMappings.g:338:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalReplicationMappings.g:339:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalReplicationMappings.g:345:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalReplicationMappings.g:351:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalReplicationMappings.g:352:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalReplicationMappings.g:352:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalReplicationMappings.g:353:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalReplicationMappings.g:353:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReplicationMappings.g:354:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});

}