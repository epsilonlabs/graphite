package workload.xtext_grammar.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import workload.xtext_grammar.services.EffortsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEffortsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEffortsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEffortsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEffortsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEfforts.g"; }



     	private EffortsGrammarAccess grammarAccess;

        public InternalEffortsParser(TokenStream input, EffortsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Main";
       	}

       	@Override
       	protected EffortsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMain"
    // InternalEfforts.g:64:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalEfforts.g:64:45: (iv_ruleMain= ruleMain EOF )
            // InternalEfforts.g:65:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalEfforts.g:71:1: ruleMain returns [EObject current=null] : ( () ( (lv_efforts_1_0= ruleEffort ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_efforts_3_0= ruleEffort ) ) )* ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_2=null;
        EObject lv_efforts_1_0 = null;

        EObject lv_efforts_3_0 = null;



        	enterRule();

        try {
            // InternalEfforts.g:77:2: ( ( () ( (lv_efforts_1_0= ruleEffort ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_efforts_3_0= ruleEffort ) ) )* ) )
            // InternalEfforts.g:78:2: ( () ( (lv_efforts_1_0= ruleEffort ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_efforts_3_0= ruleEffort ) ) )* )
            {
            // InternalEfforts.g:78:2: ( () ( (lv_efforts_1_0= ruleEffort ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_efforts_3_0= ruleEffort ) ) )* )
            // InternalEfforts.g:79:3: () ( (lv_efforts_1_0= ruleEffort ) ) (this_NEWLINE_2= RULE_NEWLINE ( (lv_efforts_3_0= ruleEffort ) ) )*
            {
            // InternalEfforts.g:79:3: ()
            // InternalEfforts.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainAccess().getTaskAction_0(),
            					current);
            			

            }

            // InternalEfforts.g:86:3: ( (lv_efforts_1_0= ruleEffort ) )
            // InternalEfforts.g:87:4: (lv_efforts_1_0= ruleEffort )
            {
            // InternalEfforts.g:87:4: (lv_efforts_1_0= ruleEffort )
            // InternalEfforts.g:88:5: lv_efforts_1_0= ruleEffort
            {

            					newCompositeNode(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_efforts_1_0=ruleEffort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					add(
            						current,
            						"efforts",
            						lv_efforts_1_0,
            						"workload.xtext_grammar.Efforts.Effort");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEfforts.g:105:3: (this_NEWLINE_2= RULE_NEWLINE ( (lv_efforts_3_0= ruleEffort ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEfforts.g:106:4: this_NEWLINE_2= RULE_NEWLINE ( (lv_efforts_3_0= ruleEffort ) )
            	    {
            	    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            	    				newLeafNode(this_NEWLINE_2, grammarAccess.getMainAccess().getNEWLINETerminalRuleCall_2_0());
            	    			
            	    // InternalEfforts.g:110:4: ( (lv_efforts_3_0= ruleEffort ) )
            	    // InternalEfforts.g:111:5: (lv_efforts_3_0= ruleEffort )
            	    {
            	    // InternalEfforts.g:111:5: (lv_efforts_3_0= ruleEffort )
            	    // InternalEfforts.g:112:6: lv_efforts_3_0= ruleEffort
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_efforts_3_0=ruleEffort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"efforts",
            	    							lv_efforts_3_0,
            	    							"workload.xtext_grammar.Efforts.Effort");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleEffort"
    // InternalEfforts.g:134:1: entryRuleEffort returns [EObject current=null] : iv_ruleEffort= ruleEffort EOF ;
    public final EObject entryRuleEffort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffort = null;


        try {
            // InternalEfforts.g:134:47: (iv_ruleEffort= ruleEffort EOF )
            // InternalEfforts.g:135:2: iv_ruleEffort= ruleEffort EOF
            {
             newCompositeNode(grammarAccess.getEffortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffort=ruleEffort();

            state._fsp--;

             current =iv_ruleEffort; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEffort"


    // $ANTLR start "ruleEffort"
    // InternalEfforts.g:141:1: ruleEffort returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= ':' ( (lv_months_3_0= RULE_INT ) ) ) ;
    public final EObject ruleEffort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_months_3_0=null;


        	enterRule();

        try {
            // InternalEfforts.g:147:2: ( ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= ':' ( (lv_months_3_0= RULE_INT ) ) ) )
            // InternalEfforts.g:148:2: ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= ':' ( (lv_months_3_0= RULE_INT ) ) )
            {
            // InternalEfforts.g:148:2: ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= ':' ( (lv_months_3_0= RULE_INT ) ) )
            // InternalEfforts.g:149:3: () ( (otherlv_1= RULE_ID ) )? otherlv_2= ':' ( (lv_months_3_0= RULE_INT ) )
            {
            // InternalEfforts.g:149:3: ()
            // InternalEfforts.g:150:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffortAccess().getEffortAction_0(),
            					current);
            			

            }

            // InternalEfforts.g:156:3: ( (otherlv_1= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEfforts.g:157:4: (otherlv_1= RULE_ID )
                    {
                    // InternalEfforts.g:157:4: (otherlv_1= RULE_ID )
                    // InternalEfforts.g:158:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEffortRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getEffortAccess().getPersonPersonCrossReference_1_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEffortAccess().getColonKeyword_2());
            		
            // InternalEfforts.g:173:3: ( (lv_months_3_0= RULE_INT ) )
            // InternalEfforts.g:174:4: (lv_months_3_0= RULE_INT )
            {
            // InternalEfforts.g:174:4: (lv_months_3_0= RULE_INT )
            // InternalEfforts.g:175:5: lv_months_3_0= RULE_INT
            {
            lv_months_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_months_3_0, grammarAccess.getEffortAccess().getMonthsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"months",
            						lv_months_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffort"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});

}