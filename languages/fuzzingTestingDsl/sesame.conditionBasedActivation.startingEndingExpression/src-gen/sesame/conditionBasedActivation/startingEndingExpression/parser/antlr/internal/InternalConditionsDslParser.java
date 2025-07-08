package sesame.conditionBasedActivation.startingEndingExpression.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sesame.conditionBasedActivation.startingEndingExpression.services.ConditionsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalConditionsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'('", "')'", "'{'", "'}'", "'@'", "'-'", "'<'", "'>'", "'='", "'AND'", "'OR'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConditionsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConditionsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConditionsDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConditionsDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private ConditionsDslGrammarAccess grammarAccess;

        public InternalConditionsDslParser(TokenStream input, ConditionsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MainRules";
       	}

       	@Override
       	protected ConditionsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMainRules"
    // InternalConditionsDsl.g:71:1: entryRuleMainRules returns [EObject current=null] : iv_ruleMainRules= ruleMainRules EOF ;
    public final EObject entryRuleMainRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainRules = null;


        try {
            // InternalConditionsDsl.g:71:50: (iv_ruleMainRules= ruleMainRules EOF )
            // InternalConditionsDsl.g:72:2: iv_ruleMainRules= ruleMainRules EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainRulesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMainRules=ruleMainRules();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMainRules; 
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
    // $ANTLR end "entryRuleMainRules"


    // $ANTLR start "ruleMainRules"
    // InternalConditionsDsl.g:78:1: ruleMainRules returns [EObject current=null] : (this_ConditionBasedActivationStarting_0= ruleConditionBasedActivationStarting | this_ConditionBasedActivationEnding_1= ruleConditionBasedActivationEnding ) ;
    public final EObject ruleMainRules() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionBasedActivationStarting_0 = null;

        EObject this_ConditionBasedActivationEnding_1 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:84:2: ( (this_ConditionBasedActivationStarting_0= ruleConditionBasedActivationStarting | this_ConditionBasedActivationEnding_1= ruleConditionBasedActivationEnding ) )
            // InternalConditionsDsl.g:85:2: (this_ConditionBasedActivationStarting_0= ruleConditionBasedActivationStarting | this_ConditionBasedActivationEnding_1= ruleConditionBasedActivationEnding )
            {
            // InternalConditionsDsl.g:85:2: (this_ConditionBasedActivationStarting_0= ruleConditionBasedActivationStarting | this_ConditionBasedActivationEnding_1= ruleConditionBasedActivationEnding )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (synpred1_InternalConditionsDsl()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==EOF) ) {
                int LA1_2 = input.LA(2);

                if ( (synpred1_InternalConditionsDsl()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalConditionsDsl.g:86:3: this_ConditionBasedActivationStarting_0= ruleConditionBasedActivationStarting
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMainRulesAccess().getConditionBasedActivationStartingParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConditionBasedActivationStarting_0=ruleConditionBasedActivationStarting();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConditionBasedActivationStarting_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:98:3: this_ConditionBasedActivationEnding_1= ruleConditionBasedActivationEnding
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMainRulesAccess().getConditionBasedActivationEndingParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConditionBasedActivationEnding_1=ruleConditionBasedActivationEnding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConditionBasedActivationEnding_1;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleMainRules"


    // $ANTLR start "entryRuleConditionBasedActivationStarting"
    // InternalConditionsDsl.g:113:1: entryRuleConditionBasedActivationStarting returns [EObject current=null] : iv_ruleConditionBasedActivationStarting= ruleConditionBasedActivationStarting EOF ;
    public final EObject entryRuleConditionBasedActivationStarting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionBasedActivationStarting = null;


        try {
            // InternalConditionsDsl.g:113:73: (iv_ruleConditionBasedActivationStarting= ruleConditionBasedActivationStarting EOF )
            // InternalConditionsDsl.g:114:2: iv_ruleConditionBasedActivationStarting= ruleConditionBasedActivationStarting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionBasedActivationStartingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionBasedActivationStarting=ruleConditionBasedActivationStarting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionBasedActivationStarting; 
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
    // $ANTLR end "entryRuleConditionBasedActivationStarting"


    // $ANTLR start "ruleConditionBasedActivationStarting"
    // InternalConditionsDsl.g:120:1: ruleConditionBasedActivationStarting returns [EObject current=null] : ( () ( (lv_starting_1_0= ruleCondition ) )? ) ;
    public final EObject ruleConditionBasedActivationStarting() throws RecognitionException {
        EObject current = null;

        EObject lv_starting_1_0 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:126:2: ( ( () ( (lv_starting_1_0= ruleCondition ) )? ) )
            // InternalConditionsDsl.g:127:2: ( () ( (lv_starting_1_0= ruleCondition ) )? )
            {
            // InternalConditionsDsl.g:127:2: ( () ( (lv_starting_1_0= ruleCondition ) )? )
            // InternalConditionsDsl.g:128:3: () ( (lv_starting_1_0= ruleCondition ) )?
            {
            // InternalConditionsDsl.g:128:3: ()
            // InternalConditionsDsl.g:129:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConditionBasedActivationStartingAccess().getConditionBasedActivationAction_0(),
              					current);
              			
            }

            }

            // InternalConditionsDsl.g:138:3: ( (lv_starting_1_0= ruleCondition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalConditionsDsl.g:139:4: (lv_starting_1_0= ruleCondition )
                    {
                    // InternalConditionsDsl.g:139:4: (lv_starting_1_0= ruleCondition )
                    // InternalConditionsDsl.g:140:5: lv_starting_1_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditionBasedActivationStartingAccess().getStartingConditionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_starting_1_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConditionBasedActivationStartingRule());
                      					}
                      					set(
                      						current,
                      						"starting",
                      						lv_starting_1_0,
                      						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.Condition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

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
    // $ANTLR end "ruleConditionBasedActivationStarting"


    // $ANTLR start "entryRuleConditionBasedActivationEnding"
    // InternalConditionsDsl.g:161:1: entryRuleConditionBasedActivationEnding returns [EObject current=null] : iv_ruleConditionBasedActivationEnding= ruleConditionBasedActivationEnding EOF ;
    public final EObject entryRuleConditionBasedActivationEnding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionBasedActivationEnding = null;


        try {
            // InternalConditionsDsl.g:161:71: (iv_ruleConditionBasedActivationEnding= ruleConditionBasedActivationEnding EOF )
            // InternalConditionsDsl.g:162:2: iv_ruleConditionBasedActivationEnding= ruleConditionBasedActivationEnding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionBasedActivationEndingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionBasedActivationEnding=ruleConditionBasedActivationEnding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionBasedActivationEnding; 
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
    // $ANTLR end "entryRuleConditionBasedActivationEnding"


    // $ANTLR start "ruleConditionBasedActivationEnding"
    // InternalConditionsDsl.g:168:1: ruleConditionBasedActivationEnding returns [EObject current=null] : ( () ( (lv_ending_1_0= ruleCondition ) )? ) ;
    public final EObject ruleConditionBasedActivationEnding() throws RecognitionException {
        EObject current = null;

        EObject lv_ending_1_0 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:174:2: ( ( () ( (lv_ending_1_0= ruleCondition ) )? ) )
            // InternalConditionsDsl.g:175:2: ( () ( (lv_ending_1_0= ruleCondition ) )? )
            {
            // InternalConditionsDsl.g:175:2: ( () ( (lv_ending_1_0= ruleCondition ) )? )
            // InternalConditionsDsl.g:176:3: () ( (lv_ending_1_0= ruleCondition ) )?
            {
            // InternalConditionsDsl.g:176:3: ()
            // InternalConditionsDsl.g:177:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConditionBasedActivationEndingAccess().getConditionBasedActivationAction_0(),
              					current);
              			
            }

            }

            // InternalConditionsDsl.g:186:3: ( (lv_ending_1_0= ruleCondition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalConditionsDsl.g:187:4: (lv_ending_1_0= ruleCondition )
                    {
                    // InternalConditionsDsl.g:187:4: (lv_ending_1_0= ruleCondition )
                    // InternalConditionsDsl.g:188:5: lv_ending_1_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditionBasedActivationEndingAccess().getEndingConditionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ending_1_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConditionBasedActivationEndingRule());
                      					}
                      					set(
                      						current,
                      						"ending",
                      						lv_ending_1_0,
                      						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.Condition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

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
    // $ANTLR end "ruleConditionBasedActivationEnding"


    // $ANTLR start "entryRuleCondition"
    // InternalConditionsDsl.g:209:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalConditionsDsl.g:209:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalConditionsDsl.g:210:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalConditionsDsl.g:216:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_c_2_0= ruleConditionElement ) )? otherlv_3= ']' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_c_2_0 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:222:2: ( ( () otherlv_1= '[' ( (lv_c_2_0= ruleConditionElement ) )? otherlv_3= ']' ) )
            // InternalConditionsDsl.g:223:2: ( () otherlv_1= '[' ( (lv_c_2_0= ruleConditionElement ) )? otherlv_3= ']' )
            {
            // InternalConditionsDsl.g:223:2: ( () otherlv_1= '[' ( (lv_c_2_0= ruleConditionElement ) )? otherlv_3= ']' )
            // InternalConditionsDsl.g:224:3: () otherlv_1= '[' ( (lv_c_2_0= ruleConditionElement ) )? otherlv_3= ']'
            {
            // InternalConditionsDsl.g:224:3: ()
            // InternalConditionsDsl.g:225:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConditionAccess().getConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalConditionsDsl.g:238:3: ( (lv_c_2_0= ruleConditionElement ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13||LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConditionsDsl.g:239:4: (lv_c_2_0= ruleConditionElement )
                    {
                    // InternalConditionsDsl.g:239:4: (lv_c_2_0= ruleConditionElement )
                    // InternalConditionsDsl.g:240:5: lv_c_2_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditionAccess().getCConditionElementParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    lv_c_2_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConditionRule());
                      					}
                      					set(
                      						current,
                      						"c",
                      						lv_c_2_0,
                      						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.ConditionElement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionElement"
    // InternalConditionsDsl.g:265:1: entryRuleConditionElement returns [EObject current=null] : iv_ruleConditionElement= ruleConditionElement EOF ;
    public final EObject entryRuleConditionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionElement = null;


        try {
            // InternalConditionsDsl.g:265:57: (iv_ruleConditionElement= ruleConditionElement EOF )
            // InternalConditionsDsl.g:266:2: iv_ruleConditionElement= ruleConditionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionElement=ruleConditionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionElement; 
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
    // $ANTLR end "entryRuleConditionElement"


    // $ANTLR start "ruleConditionElement"
    // InternalConditionsDsl.g:272:1: ruleConditionElement returns [EObject current=null] : (this_CompositeCondition_0= ruleCompositeCondition | this_BasicCondition_1= ruleBasicCondition ) ;
    public final EObject ruleConditionElement() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeCondition_0 = null;

        EObject this_BasicCondition_1 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:278:2: ( (this_CompositeCondition_0= ruleCompositeCondition | this_BasicCondition_1= ruleBasicCondition ) )
            // InternalConditionsDsl.g:279:2: (this_CompositeCondition_0= ruleCompositeCondition | this_BasicCondition_1= ruleBasicCondition )
            {
            // InternalConditionsDsl.g:279:2: (this_CompositeCondition_0= ruleCompositeCondition | this_BasicCondition_1= ruleBasicCondition )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalConditionsDsl.g:280:3: this_CompositeCondition_0= ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionElementAccess().getCompositeConditionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompositeCondition_0=ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompositeCondition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:292:3: this_BasicCondition_1= ruleBasicCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionElementAccess().getBasicConditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicCondition_1=ruleBasicCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicCondition_1;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleConditionElement"


    // $ANTLR start "entryRuleBasicCondition"
    // InternalConditionsDsl.g:307:1: entryRuleBasicCondition returns [EObject current=null] : iv_ruleBasicCondition= ruleBasicCondition EOF ;
    public final EObject entryRuleBasicCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicCondition = null;


        try {
            // InternalConditionsDsl.g:307:55: (iv_ruleBasicCondition= ruleBasicCondition EOF )
            // InternalConditionsDsl.g:308:2: iv_ruleBasicCondition= ruleBasicCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicCondition=ruleBasicCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicCondition; 
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
    // $ANTLR end "entryRuleBasicCondition"


    // $ANTLR start "ruleBasicCondition"
    // InternalConditionsDsl.g:314:1: ruleBasicCondition returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleConditionVariable ) )? ( (lv_bincomp_3_0= ruleBinaryComparisonOperation ) ) ( (lv_right_4_0= ruleConditionExpr ) )? otherlv_5= ')' ) ;
    public final EObject ruleBasicCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        Enumerator lv_bincomp_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:320:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleConditionVariable ) )? ( (lv_bincomp_3_0= ruleBinaryComparisonOperation ) ) ( (lv_right_4_0= ruleConditionExpr ) )? otherlv_5= ')' ) )
            // InternalConditionsDsl.g:321:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleConditionVariable ) )? ( (lv_bincomp_3_0= ruleBinaryComparisonOperation ) ) ( (lv_right_4_0= ruleConditionExpr ) )? otherlv_5= ')' )
            {
            // InternalConditionsDsl.g:321:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleConditionVariable ) )? ( (lv_bincomp_3_0= ruleBinaryComparisonOperation ) ) ( (lv_right_4_0= ruleConditionExpr ) )? otherlv_5= ')' )
            // InternalConditionsDsl.g:322:3: () otherlv_1= '(' ( (lv_left_2_0= ruleConditionVariable ) )? ( (lv_bincomp_3_0= ruleBinaryComparisonOperation ) ) ( (lv_right_4_0= ruleConditionExpr ) )? otherlv_5= ')'
            {
            // InternalConditionsDsl.g:322:3: ()
            // InternalConditionsDsl.g:323:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBasicConditionAccess().getBasicConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBasicConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalConditionsDsl.g:336:3: ( (lv_left_2_0= ruleConditionVariable ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConditionsDsl.g:337:4: (lv_left_2_0= ruleConditionVariable )
                    {
                    // InternalConditionsDsl.g:337:4: (lv_left_2_0= ruleConditionVariable )
                    // InternalConditionsDsl.g:338:5: lv_left_2_0= ruleConditionVariable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicConditionAccess().getLeftConditionVariableParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_left_2_0=ruleConditionVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicConditionRule());
                      					}
                      					set(
                      						current,
                      						"left",
                      						lv_left_2_0,
                      						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.ConditionVariable");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalConditionsDsl.g:355:3: ( (lv_bincomp_3_0= ruleBinaryComparisonOperation ) )
            // InternalConditionsDsl.g:356:4: (lv_bincomp_3_0= ruleBinaryComparisonOperation )
            {
            // InternalConditionsDsl.g:356:4: (lv_bincomp_3_0= ruleBinaryComparisonOperation )
            // InternalConditionsDsl.g:357:5: lv_bincomp_3_0= ruleBinaryComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBasicConditionAccess().getBincompBinaryComparisonOperationEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_bincomp_3_0=ruleBinaryComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBasicConditionRule());
              					}
              					set(
              						current,
              						"bincomp",
              						lv_bincomp_3_0,
              						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.BinaryComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalConditionsDsl.g:374:3: ( (lv_right_4_0= ruleConditionExpr ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=17 && LA7_0<=18)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConditionsDsl.g:375:4: (lv_right_4_0= ruleConditionExpr )
                    {
                    // InternalConditionsDsl.g:375:4: (lv_right_4_0= ruleConditionExpr )
                    // InternalConditionsDsl.g:376:5: lv_right_4_0= ruleConditionExpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBasicConditionAccess().getRightConditionExprParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_right_4_0=ruleConditionExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBasicConditionRule());
                      					}
                      					set(
                      						current,
                      						"right",
                      						lv_right_4_0,
                      						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.ConditionExpr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBasicConditionAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleBasicCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // InternalConditionsDsl.g:401:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalConditionsDsl.g:401:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalConditionsDsl.g:402:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeCondition; 
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
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // InternalConditionsDsl.g:408:1: ruleCompositeCondition returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_left_2_0= ruleConditionElement ) )? ( (lv_binop_3_0= ruleBinaryLogicalOperation ) ) ( (lv_right_4_0= ruleConditionElement ) )? otherlv_5= '}' ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        Enumerator lv_binop_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:414:2: ( ( () otherlv_1= '{' ( (lv_left_2_0= ruleConditionElement ) )? ( (lv_binop_3_0= ruleBinaryLogicalOperation ) ) ( (lv_right_4_0= ruleConditionElement ) )? otherlv_5= '}' ) )
            // InternalConditionsDsl.g:415:2: ( () otherlv_1= '{' ( (lv_left_2_0= ruleConditionElement ) )? ( (lv_binop_3_0= ruleBinaryLogicalOperation ) ) ( (lv_right_4_0= ruleConditionElement ) )? otherlv_5= '}' )
            {
            // InternalConditionsDsl.g:415:2: ( () otherlv_1= '{' ( (lv_left_2_0= ruleConditionElement ) )? ( (lv_binop_3_0= ruleBinaryLogicalOperation ) ) ( (lv_right_4_0= ruleConditionElement ) )? otherlv_5= '}' )
            // InternalConditionsDsl.g:416:3: () otherlv_1= '{' ( (lv_left_2_0= ruleConditionElement ) )? ( (lv_binop_3_0= ruleBinaryLogicalOperation ) ) ( (lv_right_4_0= ruleConditionElement ) )? otherlv_5= '}'
            {
            // InternalConditionsDsl.g:416:3: ()
            // InternalConditionsDsl.g:417:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCompositeConditionAccess().getCompositeConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompositeConditionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalConditionsDsl.g:430:3: ( (lv_left_2_0= ruleConditionElement ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13||LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConditionsDsl.g:431:4: (lv_left_2_0= ruleConditionElement )
                    {
                    // InternalConditionsDsl.g:431:4: (lv_left_2_0= ruleConditionElement )
                    // InternalConditionsDsl.g:432:5: lv_left_2_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLeftConditionElementParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_left_2_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
                      					}
                      					set(
                      						current,
                      						"left",
                      						lv_left_2_0,
                      						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.ConditionElement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalConditionsDsl.g:449:3: ( (lv_binop_3_0= ruleBinaryLogicalOperation ) )
            // InternalConditionsDsl.g:450:4: (lv_binop_3_0= ruleBinaryLogicalOperation )
            {
            // InternalConditionsDsl.g:450:4: (lv_binop_3_0= ruleBinaryLogicalOperation )
            // InternalConditionsDsl.g:451:5: lv_binop_3_0= ruleBinaryLogicalOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompositeConditionAccess().getBinopBinaryLogicalOperationEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_binop_3_0=ruleBinaryLogicalOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              					}
              					set(
              						current,
              						"binop",
              						lv_binop_3_0,
              						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.BinaryLogicalOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalConditionsDsl.g:468:3: ( (lv_right_4_0= ruleConditionElement ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13||LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConditionsDsl.g:469:4: (lv_right_4_0= ruleConditionElement )
                    {
                    // InternalConditionsDsl.g:469:4: (lv_right_4_0= ruleConditionElement )
                    // InternalConditionsDsl.g:470:5: lv_right_4_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCompositeConditionAccess().getRightConditionElementParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
                    lv_right_4_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
                      					}
                      					set(
                      						current,
                      						"right",
                      						lv_right_4_0,
                      						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.ConditionElement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCompositeConditionAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleConditionExpr"
    // InternalConditionsDsl.g:495:1: entryRuleConditionExpr returns [EObject current=null] : iv_ruleConditionExpr= ruleConditionExpr EOF ;
    public final EObject entryRuleConditionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionExpr = null;


        try {
            // InternalConditionsDsl.g:495:54: (iv_ruleConditionExpr= ruleConditionExpr EOF )
            // InternalConditionsDsl.g:496:2: iv_ruleConditionExpr= ruleConditionExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionExpr=ruleConditionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionExpr; 
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
    // $ANTLR end "entryRuleConditionExpr"


    // $ANTLR start "ruleConditionExpr"
    // InternalConditionsDsl.g:502:1: ruleConditionExpr returns [EObject current=null] : (this_ConditionInteger_0= ruleConditionInteger | this_ConditionVariable_1= ruleConditionVariable ) ;
    public final EObject ruleConditionExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionInteger_0 = null;

        EObject this_ConditionVariable_1 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:508:2: ( (this_ConditionInteger_0= ruleConditionInteger | this_ConditionVariable_1= ruleConditionVariable ) )
            // InternalConditionsDsl.g:509:2: (this_ConditionInteger_0= ruleConditionInteger | this_ConditionVariable_1= ruleConditionVariable )
            {
            // InternalConditionsDsl.g:509:2: (this_ConditionInteger_0= ruleConditionInteger | this_ConditionVariable_1= ruleConditionVariable )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalConditionsDsl.g:510:3: this_ConditionInteger_0= ruleConditionInteger
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionExprAccess().getConditionIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConditionInteger_0=ruleConditionInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConditionInteger_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:522:3: this_ConditionVariable_1= ruleConditionVariable
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionExprAccess().getConditionVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConditionVariable_1=ruleConditionVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConditionVariable_1;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleConditionExpr"


    // $ANTLR start "entryRuleConditionVariable"
    // InternalConditionsDsl.g:537:1: entryRuleConditionVariable returns [EObject current=null] : iv_ruleConditionVariable= ruleConditionVariable EOF ;
    public final EObject entryRuleConditionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionVariable = null;


        try {
            // InternalConditionsDsl.g:537:58: (iv_ruleConditionVariable= ruleConditionVariable EOF )
            // InternalConditionsDsl.g:538:2: iv_ruleConditionVariable= ruleConditionVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionVariable=ruleConditionVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionVariable; 
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
    // $ANTLR end "entryRuleConditionVariable"


    // $ANTLR start "ruleConditionVariable"
    // InternalConditionsDsl.g:544:1: ruleConditionVariable returns [EObject current=null] : ( () otherlv_1= '@' ( (otherlv_2= RULE_ID ) )? ) ;
    public final EObject ruleConditionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalConditionsDsl.g:550:2: ( ( () otherlv_1= '@' ( (otherlv_2= RULE_ID ) )? ) )
            // InternalConditionsDsl.g:551:2: ( () otherlv_1= '@' ( (otherlv_2= RULE_ID ) )? )
            {
            // InternalConditionsDsl.g:551:2: ( () otherlv_1= '@' ( (otherlv_2= RULE_ID ) )? )
            // InternalConditionsDsl.g:552:3: () otherlv_1= '@' ( (otherlv_2= RULE_ID ) )?
            {
            // InternalConditionsDsl.g:552:3: ()
            // InternalConditionsDsl.g:553:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConditionVariableAccess().getConditionVariableAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConditionVariableAccess().getCommercialAtKeyword_1());
              		
            }
            // InternalConditionsDsl.g:566:3: ( (otherlv_2= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConditionsDsl.g:567:4: (otherlv_2= RULE_ID )
                    {
                    // InternalConditionsDsl.g:567:4: (otherlv_2= RULE_ID )
                    // InternalConditionsDsl.g:568:5: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConditionVariableRule());
                      					}
                      				
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getConditionVariableAccess().getMetricMetricCrossReference_2_0());
                      				
                    }

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
    // $ANTLR end "ruleConditionVariable"


    // $ANTLR start "entryRuleConditionInteger"
    // InternalConditionsDsl.g:586:1: entryRuleConditionInteger returns [EObject current=null] : iv_ruleConditionInteger= ruleConditionInteger EOF ;
    public final EObject entryRuleConditionInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionInteger = null;


        try {
            // InternalConditionsDsl.g:586:57: (iv_ruleConditionInteger= ruleConditionInteger EOF )
            // InternalConditionsDsl.g:587:2: iv_ruleConditionInteger= ruleConditionInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionInteger=ruleConditionInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionInteger; 
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
    // $ANTLR end "entryRuleConditionInteger"


    // $ANTLR start "ruleConditionInteger"
    // InternalConditionsDsl.g:593:1: ruleConditionInteger returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEInt ) ) ) ;
    public final EObject ruleConditionInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalConditionsDsl.g:599:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) )
            // InternalConditionsDsl.g:600:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            {
            // InternalConditionsDsl.g:600:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            // InternalConditionsDsl.g:601:3: () ( (lv_value_1_0= ruleEInt ) )
            {
            // InternalConditionsDsl.g:601:3: ()
            // InternalConditionsDsl.g:602:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConditionIntegerAccess().getConditionIntegerAction_0(),
              					current);
              			
            }

            }

            // InternalConditionsDsl.g:611:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalConditionsDsl.g:612:4: (lv_value_1_0= ruleEInt )
            {
            // InternalConditionsDsl.g:612:4: (lv_value_1_0= ruleEInt )
            // InternalConditionsDsl.g:613:5: lv_value_1_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionIntegerAccess().getValueEIntParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionIntegerRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


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
    // $ANTLR end "ruleConditionInteger"


    // $ANTLR start "entryRuleEInt"
    // InternalConditionsDsl.g:634:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalConditionsDsl.g:634:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalConditionsDsl.g:635:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalConditionsDsl.g:641:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalConditionsDsl.g:647:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalConditionsDsl.g:648:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalConditionsDsl.g:648:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalConditionsDsl.g:649:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalConditionsDsl.g:649:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalConditionsDsl.g:650:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
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


    // $ANTLR start "ruleBinaryComparisonOperation"
    // InternalConditionsDsl.g:667:1: ruleBinaryComparisonOperation returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) ) ;
    public final Enumerator ruleBinaryComparisonOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalConditionsDsl.g:673:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) ) )
            // InternalConditionsDsl.g:674:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) )
            {
            // InternalConditionsDsl.g:674:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalConditionsDsl.g:675:3: (enumLiteral_0= '<' )
                    {
                    // InternalConditionsDsl.g:675:3: (enumLiteral_0= '<' )
                    // InternalConditionsDsl.g:676:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryComparisonOperationAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinaryComparisonOperationAccess().getLESS_THANEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:683:3: (enumLiteral_1= '>' )
                    {
                    // InternalConditionsDsl.g:683:3: (enumLiteral_1= '>' )
                    // InternalConditionsDsl.g:684:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryComparisonOperationAccess().getGREATER_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinaryComparisonOperationAccess().getGREATER_THANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalConditionsDsl.g:691:3: (enumLiteral_2= '=' )
                    {
                    // InternalConditionsDsl.g:691:3: (enumLiteral_2= '=' )
                    // InternalConditionsDsl.g:692:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryComparisonOperationAccess().getEQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBinaryComparisonOperationAccess().getEQUALSEnumLiteralDeclaration_2());
                      			
                    }

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
    // $ANTLR end "ruleBinaryComparisonOperation"


    // $ANTLR start "ruleBinaryLogicalOperation"
    // InternalConditionsDsl.g:702:1: ruleBinaryLogicalOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBinaryLogicalOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalConditionsDsl.g:708:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalConditionsDsl.g:709:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalConditionsDsl.g:709:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalConditionsDsl.g:710:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalConditionsDsl.g:710:3: (enumLiteral_0= 'AND' )
                    // InternalConditionsDsl.g:711:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryLogicalOperationAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinaryLogicalOperationAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:718:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalConditionsDsl.g:718:3: (enumLiteral_1= 'OR' )
                    // InternalConditionsDsl.g:719:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryLogicalOperationAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinaryLogicalOperationAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

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
    // $ANTLR end "ruleBinaryLogicalOperation"

    // $ANTLR start synpred1_InternalConditionsDsl
    public final void synpred1_InternalConditionsDsl_fragment() throws RecognitionException {   
        EObject this_ConditionBasedActivationStarting_0 = null;


        // InternalConditionsDsl.g:86:3: (this_ConditionBasedActivationStarting_0= ruleConditionBasedActivationStarting )
        // InternalConditionsDsl.g:86:3: this_ConditionBasedActivationStarting_0= ruleConditionBasedActivationStarting
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ConditionBasedActivationStarting_0=ruleConditionBasedActivationStarting();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalConditionsDsl

    // Delegated rules

    public final boolean synpred1_InternalConditionsDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalConditionsDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000B000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000064020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C0A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});

}