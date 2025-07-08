package structurizr.expressions.parser.antlr.internal;

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
import structurizr.expressions.services.StructurizrExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStructurizrExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'{'", "'}'", "'('", "'element'", "'.'", "'tag'", "','", "')'", "'technology'", "'type'", "'properties'", "'['", "']'", "'parent'", "'relationship'", "'source'", "'destination'", "'&&'", "'||'", "'=='", "'!='", "'Person'", "'SoftwareSystem'", "'Container'", "'Component'", "'DeploymentNode'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalStructurizrExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStructurizrExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStructurizrExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStructurizrExpressions.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private StructurizrExpressionsGrammarAccess grammarAccess;

        public InternalStructurizrExpressionsParser(TokenStream input, StructurizrExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EntryRule";
       	}

       	@Override
       	protected StructurizrExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntryRule"
    // InternalStructurizrExpressions.g:71:1: entryRuleEntryRule returns [EObject current=null] : iv_ruleEntryRule= ruleEntryRule EOF ;
    public final EObject entryRuleEntryRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryRule = null;


        try {
            // InternalStructurizrExpressions.g:71:50: (iv_ruleEntryRule= ruleEntryRule EOF )
            // InternalStructurizrExpressions.g:72:2: iv_ruleEntryRule= ruleEntryRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntryRule=ruleEntryRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryRule; 
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
    // $ANTLR end "entryRuleEntryRule"


    // $ANTLR start "ruleEntryRule"
    // InternalStructurizrExpressions.g:78:1: ruleEntryRule returns [EObject current=null] : (this_SystemLandscapeView_Include_0= ruleSystemLandscapeView_Include | this_SystemLandscapeView_Exclude_1= ruleSystemLandscapeView_Exclude | this_SystemContextView_Include_2= ruleSystemContextView_Include | this_SystemContextView_Exclude_3= ruleSystemContextView_Exclude | this_ContainerView_Include_4= ruleContainerView_Include | this_ContainerView_Exclude_5= ruleContainerView_Exclude | this_ComponentView_Include_6= ruleComponentView_Include | this_ComponentView_Exclude_7= ruleComponentView_Exclude ) ;
    public final EObject ruleEntryRule() throws RecognitionException {
        EObject current = null;

        EObject this_SystemLandscapeView_Include_0 = null;

        EObject this_SystemLandscapeView_Exclude_1 = null;

        EObject this_SystemContextView_Include_2 = null;

        EObject this_SystemContextView_Exclude_3 = null;

        EObject this_ContainerView_Include_4 = null;

        EObject this_ContainerView_Exclude_5 = null;

        EObject this_ComponentView_Include_6 = null;

        EObject this_ComponentView_Exclude_7 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:84:2: ( (this_SystemLandscapeView_Include_0= ruleSystemLandscapeView_Include | this_SystemLandscapeView_Exclude_1= ruleSystemLandscapeView_Exclude | this_SystemContextView_Include_2= ruleSystemContextView_Include | this_SystemContextView_Exclude_3= ruleSystemContextView_Exclude | this_ContainerView_Include_4= ruleContainerView_Include | this_ContainerView_Exclude_5= ruleContainerView_Exclude | this_ComponentView_Include_6= ruleComponentView_Include | this_ComponentView_Exclude_7= ruleComponentView_Exclude ) )
            // InternalStructurizrExpressions.g:85:2: (this_SystemLandscapeView_Include_0= ruleSystemLandscapeView_Include | this_SystemLandscapeView_Exclude_1= ruleSystemLandscapeView_Exclude | this_SystemContextView_Include_2= ruleSystemContextView_Include | this_SystemContextView_Exclude_3= ruleSystemContextView_Exclude | this_ContainerView_Include_4= ruleContainerView_Include | this_ContainerView_Exclude_5= ruleContainerView_Exclude | this_ComponentView_Include_6= ruleComponentView_Include | this_ComponentView_Exclude_7= ruleComponentView_Exclude )
            {
            // InternalStructurizrExpressions.g:85:2: (this_SystemLandscapeView_Include_0= ruleSystemLandscapeView_Include | this_SystemLandscapeView_Exclude_1= ruleSystemLandscapeView_Exclude | this_SystemContextView_Include_2= ruleSystemContextView_Include | this_SystemContextView_Exclude_3= ruleSystemContextView_Exclude | this_ContainerView_Include_4= ruleContainerView_Include | this_ContainerView_Exclude_5= ruleContainerView_Exclude | this_ComponentView_Include_6= ruleComponentView_Include | this_ComponentView_Exclude_7= ruleComponentView_Exclude )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalStructurizrExpressions.g:86:3: this_SystemLandscapeView_Include_0= ruleSystemLandscapeView_Include
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryRuleAccess().getSystemLandscapeView_IncludeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SystemLandscapeView_Include_0=ruleSystemLandscapeView_Include();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SystemLandscapeView_Include_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStructurizrExpressions.g:98:3: this_SystemLandscapeView_Exclude_1= ruleSystemLandscapeView_Exclude
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryRuleAccess().getSystemLandscapeView_ExcludeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SystemLandscapeView_Exclude_1=ruleSystemLandscapeView_Exclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SystemLandscapeView_Exclude_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStructurizrExpressions.g:110:3: this_SystemContextView_Include_2= ruleSystemContextView_Include
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryRuleAccess().getSystemContextView_IncludeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SystemContextView_Include_2=ruleSystemContextView_Include();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SystemContextView_Include_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalStructurizrExpressions.g:122:3: this_SystemContextView_Exclude_3= ruleSystemContextView_Exclude
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryRuleAccess().getSystemContextView_ExcludeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SystemContextView_Exclude_3=ruleSystemContextView_Exclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SystemContextView_Exclude_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalStructurizrExpressions.g:134:3: this_ContainerView_Include_4= ruleContainerView_Include
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryRuleAccess().getContainerView_IncludeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerView_Include_4=ruleContainerView_Include();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerView_Include_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalStructurizrExpressions.g:146:3: this_ContainerView_Exclude_5= ruleContainerView_Exclude
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryRuleAccess().getContainerView_ExcludeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerView_Exclude_5=ruleContainerView_Exclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerView_Exclude_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalStructurizrExpressions.g:158:3: this_ComponentView_Include_6= ruleComponentView_Include
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryRuleAccess().getComponentView_IncludeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentView_Include_6=ruleComponentView_Include();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentView_Include_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalStructurizrExpressions.g:170:3: this_ComponentView_Exclude_7= ruleComponentView_Exclude
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryRuleAccess().getComponentView_ExcludeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentView_Exclude_7=ruleComponentView_Exclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentView_Exclude_7;
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
    // $ANTLR end "ruleEntryRule"


    // $ANTLR start "entryRuleSystemLandscapeView_Include"
    // InternalStructurizrExpressions.g:185:1: entryRuleSystemLandscapeView_Include returns [EObject current=null] : iv_ruleSystemLandscapeView_Include= ruleSystemLandscapeView_Include EOF ;
    public final EObject entryRuleSystemLandscapeView_Include() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemLandscapeView_Include = null;


        try {
            // InternalStructurizrExpressions.g:185:68: (iv_ruleSystemLandscapeView_Include= ruleSystemLandscapeView_Include EOF )
            // InternalStructurizrExpressions.g:186:2: iv_ruleSystemLandscapeView_Include= ruleSystemLandscapeView_Include EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemLandscapeView_IncludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystemLandscapeView_Include=ruleSystemLandscapeView_Include();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemLandscapeView_Include; 
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
    // $ANTLR end "entryRuleSystemLandscapeView_Include"


    // $ANTLR start "ruleSystemLandscapeView_Include"
    // InternalStructurizrExpressions.g:192:1: ruleSystemLandscapeView_Include returns [EObject current=null] : ( () ( (lv_include_1_0= ruleConditionElement ) )? ) ;
    public final EObject ruleSystemLandscapeView_Include() throws RecognitionException {
        EObject current = null;

        EObject lv_include_1_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:198:2: ( ( () ( (lv_include_1_0= ruleConditionElement ) )? ) )
            // InternalStructurizrExpressions.g:199:2: ( () ( (lv_include_1_0= ruleConditionElement ) )? )
            {
            // InternalStructurizrExpressions.g:199:2: ( () ( (lv_include_1_0= ruleConditionElement ) )? )
            // InternalStructurizrExpressions.g:200:3: () ( (lv_include_1_0= ruleConditionElement ) )?
            {
            // InternalStructurizrExpressions.g:200:3: ()
            // InternalStructurizrExpressions.g:201:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSystemLandscapeView_IncludeAccess().getSystemLandscapeViewAction_0(),
              					current);
              			
            }

            }

            // InternalStructurizrExpressions.g:210:3: ( (lv_include_1_0= ruleConditionElement ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)||LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalStructurizrExpressions.g:211:4: (lv_include_1_0= ruleConditionElement )
                    {
                    // InternalStructurizrExpressions.g:211:4: (lv_include_1_0= ruleConditionElement )
                    // InternalStructurizrExpressions.g:212:5: lv_include_1_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSystemLandscapeView_IncludeAccess().getIncludeConditionElementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_include_1_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSystemLandscapeView_IncludeRule());
                      					}
                      					set(
                      						current,
                      						"include",
                      						lv_include_1_0,
                      						"structurizr.expressions.StructurizrExpressions.ConditionElement");
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
    // $ANTLR end "ruleSystemLandscapeView_Include"


    // $ANTLR start "entryRuleSystemLandscapeView_Exclude"
    // InternalStructurizrExpressions.g:233:1: entryRuleSystemLandscapeView_Exclude returns [EObject current=null] : iv_ruleSystemLandscapeView_Exclude= ruleSystemLandscapeView_Exclude EOF ;
    public final EObject entryRuleSystemLandscapeView_Exclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemLandscapeView_Exclude = null;


        try {
            // InternalStructurizrExpressions.g:233:68: (iv_ruleSystemLandscapeView_Exclude= ruleSystemLandscapeView_Exclude EOF )
            // InternalStructurizrExpressions.g:234:2: iv_ruleSystemLandscapeView_Exclude= ruleSystemLandscapeView_Exclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemLandscapeView_ExcludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystemLandscapeView_Exclude=ruleSystemLandscapeView_Exclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemLandscapeView_Exclude; 
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
    // $ANTLR end "entryRuleSystemLandscapeView_Exclude"


    // $ANTLR start "ruleSystemLandscapeView_Exclude"
    // InternalStructurizrExpressions.g:240:1: ruleSystemLandscapeView_Exclude returns [EObject current=null] : ( () ( (lv_exclude_1_0= ruleConditionElement ) )? ) ;
    public final EObject ruleSystemLandscapeView_Exclude() throws RecognitionException {
        EObject current = null;

        EObject lv_exclude_1_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:246:2: ( ( () ( (lv_exclude_1_0= ruleConditionElement ) )? ) )
            // InternalStructurizrExpressions.g:247:2: ( () ( (lv_exclude_1_0= ruleConditionElement ) )? )
            {
            // InternalStructurizrExpressions.g:247:2: ( () ( (lv_exclude_1_0= ruleConditionElement ) )? )
            // InternalStructurizrExpressions.g:248:3: () ( (lv_exclude_1_0= ruleConditionElement ) )?
            {
            // InternalStructurizrExpressions.g:248:3: ()
            // InternalStructurizrExpressions.g:249:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSystemLandscapeView_ExcludeAccess().getSystemLandscapeViewAction_0(),
              					current);
              			
            }

            }

            // InternalStructurizrExpressions.g:258:3: ( (lv_exclude_1_0= ruleConditionElement ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=12)||LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStructurizrExpressions.g:259:4: (lv_exclude_1_0= ruleConditionElement )
                    {
                    // InternalStructurizrExpressions.g:259:4: (lv_exclude_1_0= ruleConditionElement )
                    // InternalStructurizrExpressions.g:260:5: lv_exclude_1_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSystemLandscapeView_ExcludeAccess().getExcludeConditionElementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exclude_1_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSystemLandscapeView_ExcludeRule());
                      					}
                      					set(
                      						current,
                      						"exclude",
                      						lv_exclude_1_0,
                      						"structurizr.expressions.StructurizrExpressions.ConditionElement");
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
    // $ANTLR end "ruleSystemLandscapeView_Exclude"


    // $ANTLR start "entryRuleSystemContextView_Include"
    // InternalStructurizrExpressions.g:281:1: entryRuleSystemContextView_Include returns [EObject current=null] : iv_ruleSystemContextView_Include= ruleSystemContextView_Include EOF ;
    public final EObject entryRuleSystemContextView_Include() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemContextView_Include = null;


        try {
            // InternalStructurizrExpressions.g:281:66: (iv_ruleSystemContextView_Include= ruleSystemContextView_Include EOF )
            // InternalStructurizrExpressions.g:282:2: iv_ruleSystemContextView_Include= ruleSystemContextView_Include EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemContextView_IncludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystemContextView_Include=ruleSystemContextView_Include();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemContextView_Include; 
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
    // $ANTLR end "entryRuleSystemContextView_Include"


    // $ANTLR start "ruleSystemContextView_Include"
    // InternalStructurizrExpressions.g:288:1: ruleSystemContextView_Include returns [EObject current=null] : ( () ( (lv_include_1_0= ruleConditionElement ) )? ) ;
    public final EObject ruleSystemContextView_Include() throws RecognitionException {
        EObject current = null;

        EObject lv_include_1_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:294:2: ( ( () ( (lv_include_1_0= ruleConditionElement ) )? ) )
            // InternalStructurizrExpressions.g:295:2: ( () ( (lv_include_1_0= ruleConditionElement ) )? )
            {
            // InternalStructurizrExpressions.g:295:2: ( () ( (lv_include_1_0= ruleConditionElement ) )? )
            // InternalStructurizrExpressions.g:296:3: () ( (lv_include_1_0= ruleConditionElement ) )?
            {
            // InternalStructurizrExpressions.g:296:3: ()
            // InternalStructurizrExpressions.g:297:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSystemContextView_IncludeAccess().getSystemContextViewAction_0(),
              					current);
              			
            }

            }

            // InternalStructurizrExpressions.g:306:3: ( (lv_include_1_0= ruleConditionElement ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)||LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStructurizrExpressions.g:307:4: (lv_include_1_0= ruleConditionElement )
                    {
                    // InternalStructurizrExpressions.g:307:4: (lv_include_1_0= ruleConditionElement )
                    // InternalStructurizrExpressions.g:308:5: lv_include_1_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSystemContextView_IncludeAccess().getIncludeConditionElementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_include_1_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSystemContextView_IncludeRule());
                      					}
                      					set(
                      						current,
                      						"include",
                      						lv_include_1_0,
                      						"structurizr.expressions.StructurizrExpressions.ConditionElement");
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
    // $ANTLR end "ruleSystemContextView_Include"


    // $ANTLR start "entryRuleSystemContextView_Exclude"
    // InternalStructurizrExpressions.g:329:1: entryRuleSystemContextView_Exclude returns [EObject current=null] : iv_ruleSystemContextView_Exclude= ruleSystemContextView_Exclude EOF ;
    public final EObject entryRuleSystemContextView_Exclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemContextView_Exclude = null;


        try {
            // InternalStructurizrExpressions.g:329:66: (iv_ruleSystemContextView_Exclude= ruleSystemContextView_Exclude EOF )
            // InternalStructurizrExpressions.g:330:2: iv_ruleSystemContextView_Exclude= ruleSystemContextView_Exclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemContextView_ExcludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystemContextView_Exclude=ruleSystemContextView_Exclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemContextView_Exclude; 
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
    // $ANTLR end "entryRuleSystemContextView_Exclude"


    // $ANTLR start "ruleSystemContextView_Exclude"
    // InternalStructurizrExpressions.g:336:1: ruleSystemContextView_Exclude returns [EObject current=null] : ( () ( (lv_exclude_1_0= ruleConditionElement ) )? ) ;
    public final EObject ruleSystemContextView_Exclude() throws RecognitionException {
        EObject current = null;

        EObject lv_exclude_1_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:342:2: ( ( () ( (lv_exclude_1_0= ruleConditionElement ) )? ) )
            // InternalStructurizrExpressions.g:343:2: ( () ( (lv_exclude_1_0= ruleConditionElement ) )? )
            {
            // InternalStructurizrExpressions.g:343:2: ( () ( (lv_exclude_1_0= ruleConditionElement ) )? )
            // InternalStructurizrExpressions.g:344:3: () ( (lv_exclude_1_0= ruleConditionElement ) )?
            {
            // InternalStructurizrExpressions.g:344:3: ()
            // InternalStructurizrExpressions.g:345:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSystemContextView_ExcludeAccess().getSystemContextViewAction_0(),
              					current);
              			
            }

            }

            // InternalStructurizrExpressions.g:354:3: ( (lv_exclude_1_0= ruleConditionElement ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=11 && LA5_0<=12)||LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStructurizrExpressions.g:355:4: (lv_exclude_1_0= ruleConditionElement )
                    {
                    // InternalStructurizrExpressions.g:355:4: (lv_exclude_1_0= ruleConditionElement )
                    // InternalStructurizrExpressions.g:356:5: lv_exclude_1_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSystemContextView_ExcludeAccess().getExcludeConditionElementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exclude_1_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSystemContextView_ExcludeRule());
                      					}
                      					set(
                      						current,
                      						"exclude",
                      						lv_exclude_1_0,
                      						"structurizr.expressions.StructurizrExpressions.ConditionElement");
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
    // $ANTLR end "ruleSystemContextView_Exclude"


    // $ANTLR start "entryRuleContainerView_Include"
    // InternalStructurizrExpressions.g:377:1: entryRuleContainerView_Include returns [EObject current=null] : iv_ruleContainerView_Include= ruleContainerView_Include EOF ;
    public final EObject entryRuleContainerView_Include() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerView_Include = null;


        try {
            // InternalStructurizrExpressions.g:377:62: (iv_ruleContainerView_Include= ruleContainerView_Include EOF )
            // InternalStructurizrExpressions.g:378:2: iv_ruleContainerView_Include= ruleContainerView_Include EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerView_IncludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerView_Include=ruleContainerView_Include();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerView_Include; 
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
    // $ANTLR end "entryRuleContainerView_Include"


    // $ANTLR start "ruleContainerView_Include"
    // InternalStructurizrExpressions.g:384:1: ruleContainerView_Include returns [EObject current=null] : ( () ( (lv_include_1_0= ruleConditionElement ) )? ) ;
    public final EObject ruleContainerView_Include() throws RecognitionException {
        EObject current = null;

        EObject lv_include_1_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:390:2: ( ( () ( (lv_include_1_0= ruleConditionElement ) )? ) )
            // InternalStructurizrExpressions.g:391:2: ( () ( (lv_include_1_0= ruleConditionElement ) )? )
            {
            // InternalStructurizrExpressions.g:391:2: ( () ( (lv_include_1_0= ruleConditionElement ) )? )
            // InternalStructurizrExpressions.g:392:3: () ( (lv_include_1_0= ruleConditionElement ) )?
            {
            // InternalStructurizrExpressions.g:392:3: ()
            // InternalStructurizrExpressions.g:393:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContainerView_IncludeAccess().getContainerViewAction_0(),
              					current);
              			
            }

            }

            // InternalStructurizrExpressions.g:402:3: ( (lv_include_1_0= ruleConditionElement ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)||LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStructurizrExpressions.g:403:4: (lv_include_1_0= ruleConditionElement )
                    {
                    // InternalStructurizrExpressions.g:403:4: (lv_include_1_0= ruleConditionElement )
                    // InternalStructurizrExpressions.g:404:5: lv_include_1_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getContainerView_IncludeAccess().getIncludeConditionElementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_include_1_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getContainerView_IncludeRule());
                      					}
                      					set(
                      						current,
                      						"include",
                      						lv_include_1_0,
                      						"structurizr.expressions.StructurizrExpressions.ConditionElement");
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
    // $ANTLR end "ruleContainerView_Include"


    // $ANTLR start "entryRuleContainerView_Exclude"
    // InternalStructurizrExpressions.g:425:1: entryRuleContainerView_Exclude returns [EObject current=null] : iv_ruleContainerView_Exclude= ruleContainerView_Exclude EOF ;
    public final EObject entryRuleContainerView_Exclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerView_Exclude = null;


        try {
            // InternalStructurizrExpressions.g:425:62: (iv_ruleContainerView_Exclude= ruleContainerView_Exclude EOF )
            // InternalStructurizrExpressions.g:426:2: iv_ruleContainerView_Exclude= ruleContainerView_Exclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerView_ExcludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerView_Exclude=ruleContainerView_Exclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerView_Exclude; 
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
    // $ANTLR end "entryRuleContainerView_Exclude"


    // $ANTLR start "ruleContainerView_Exclude"
    // InternalStructurizrExpressions.g:432:1: ruleContainerView_Exclude returns [EObject current=null] : ( () ( (lv_exclude_1_0= ruleConditionElement ) )? ) ;
    public final EObject ruleContainerView_Exclude() throws RecognitionException {
        EObject current = null;

        EObject lv_exclude_1_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:438:2: ( ( () ( (lv_exclude_1_0= ruleConditionElement ) )? ) )
            // InternalStructurizrExpressions.g:439:2: ( () ( (lv_exclude_1_0= ruleConditionElement ) )? )
            {
            // InternalStructurizrExpressions.g:439:2: ( () ( (lv_exclude_1_0= ruleConditionElement ) )? )
            // InternalStructurizrExpressions.g:440:3: () ( (lv_exclude_1_0= ruleConditionElement ) )?
            {
            // InternalStructurizrExpressions.g:440:3: ()
            // InternalStructurizrExpressions.g:441:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContainerView_ExcludeAccess().getContainerViewAction_0(),
              					current);
              			
            }

            }

            // InternalStructurizrExpressions.g:450:3: ( (lv_exclude_1_0= ruleConditionElement ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)||LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStructurizrExpressions.g:451:4: (lv_exclude_1_0= ruleConditionElement )
                    {
                    // InternalStructurizrExpressions.g:451:4: (lv_exclude_1_0= ruleConditionElement )
                    // InternalStructurizrExpressions.g:452:5: lv_exclude_1_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getContainerView_ExcludeAccess().getExcludeConditionElementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exclude_1_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getContainerView_ExcludeRule());
                      					}
                      					set(
                      						current,
                      						"exclude",
                      						lv_exclude_1_0,
                      						"structurizr.expressions.StructurizrExpressions.ConditionElement");
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
    // $ANTLR end "ruleContainerView_Exclude"


    // $ANTLR start "entryRuleComponentView_Include"
    // InternalStructurizrExpressions.g:473:1: entryRuleComponentView_Include returns [EObject current=null] : iv_ruleComponentView_Include= ruleComponentView_Include EOF ;
    public final EObject entryRuleComponentView_Include() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentView_Include = null;


        try {
            // InternalStructurizrExpressions.g:473:62: (iv_ruleComponentView_Include= ruleComponentView_Include EOF )
            // InternalStructurizrExpressions.g:474:2: iv_ruleComponentView_Include= ruleComponentView_Include EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentView_IncludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentView_Include=ruleComponentView_Include();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentView_Include; 
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
    // $ANTLR end "entryRuleComponentView_Include"


    // $ANTLR start "ruleComponentView_Include"
    // InternalStructurizrExpressions.g:480:1: ruleComponentView_Include returns [EObject current=null] : ( () ( (lv_include_1_0= ruleConditionElement ) )? ) ;
    public final EObject ruleComponentView_Include() throws RecognitionException {
        EObject current = null;

        EObject lv_include_1_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:486:2: ( ( () ( (lv_include_1_0= ruleConditionElement ) )? ) )
            // InternalStructurizrExpressions.g:487:2: ( () ( (lv_include_1_0= ruleConditionElement ) )? )
            {
            // InternalStructurizrExpressions.g:487:2: ( () ( (lv_include_1_0= ruleConditionElement ) )? )
            // InternalStructurizrExpressions.g:488:3: () ( (lv_include_1_0= ruleConditionElement ) )?
            {
            // InternalStructurizrExpressions.g:488:3: ()
            // InternalStructurizrExpressions.g:489:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getComponentView_IncludeAccess().getComponentViewAction_0(),
              					current);
              			
            }

            }

            // InternalStructurizrExpressions.g:498:3: ( (lv_include_1_0= ruleConditionElement ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)||LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStructurizrExpressions.g:499:4: (lv_include_1_0= ruleConditionElement )
                    {
                    // InternalStructurizrExpressions.g:499:4: (lv_include_1_0= ruleConditionElement )
                    // InternalStructurizrExpressions.g:500:5: lv_include_1_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentView_IncludeAccess().getIncludeConditionElementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_include_1_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComponentView_IncludeRule());
                      					}
                      					set(
                      						current,
                      						"include",
                      						lv_include_1_0,
                      						"structurizr.expressions.StructurizrExpressions.ConditionElement");
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
    // $ANTLR end "ruleComponentView_Include"


    // $ANTLR start "entryRuleComponentView_Exclude"
    // InternalStructurizrExpressions.g:521:1: entryRuleComponentView_Exclude returns [EObject current=null] : iv_ruleComponentView_Exclude= ruleComponentView_Exclude EOF ;
    public final EObject entryRuleComponentView_Exclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentView_Exclude = null;


        try {
            // InternalStructurizrExpressions.g:521:62: (iv_ruleComponentView_Exclude= ruleComponentView_Exclude EOF )
            // InternalStructurizrExpressions.g:522:2: iv_ruleComponentView_Exclude= ruleComponentView_Exclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentView_ExcludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentView_Exclude=ruleComponentView_Exclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentView_Exclude; 
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
    // $ANTLR end "entryRuleComponentView_Exclude"


    // $ANTLR start "ruleComponentView_Exclude"
    // InternalStructurizrExpressions.g:528:1: ruleComponentView_Exclude returns [EObject current=null] : ( () ( (lv_exclude_1_0= ruleConditionElement ) )? ) ;
    public final EObject ruleComponentView_Exclude() throws RecognitionException {
        EObject current = null;

        EObject lv_exclude_1_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:534:2: ( ( () ( (lv_exclude_1_0= ruleConditionElement ) )? ) )
            // InternalStructurizrExpressions.g:535:2: ( () ( (lv_exclude_1_0= ruleConditionElement ) )? )
            {
            // InternalStructurizrExpressions.g:535:2: ( () ( (lv_exclude_1_0= ruleConditionElement ) )? )
            // InternalStructurizrExpressions.g:536:3: () ( (lv_exclude_1_0= ruleConditionElement ) )?
            {
            // InternalStructurizrExpressions.g:536:3: ()
            // InternalStructurizrExpressions.g:537:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getComponentView_ExcludeAccess().getComponentViewAction_0(),
              					current);
              			
            }

            }

            // InternalStructurizrExpressions.g:546:3: ( (lv_exclude_1_0= ruleConditionElement ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)||LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStructurizrExpressions.g:547:4: (lv_exclude_1_0= ruleConditionElement )
                    {
                    // InternalStructurizrExpressions.g:547:4: (lv_exclude_1_0= ruleConditionElement )
                    // InternalStructurizrExpressions.g:548:5: lv_exclude_1_0= ruleConditionElement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentView_ExcludeAccess().getExcludeConditionElementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exclude_1_0=ruleConditionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComponentView_ExcludeRule());
                      					}
                      					set(
                      						current,
                      						"exclude",
                      						lv_exclude_1_0,
                      						"structurizr.expressions.StructurizrExpressions.ConditionElement");
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
    // $ANTLR end "ruleComponentView_Exclude"


    // $ANTLR start "entryRuleConditionElement"
    // InternalStructurizrExpressions.g:569:1: entryRuleConditionElement returns [EObject current=null] : iv_ruleConditionElement= ruleConditionElement EOF ;
    public final EObject entryRuleConditionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionElement = null;


        try {
            // InternalStructurizrExpressions.g:569:57: (iv_ruleConditionElement= ruleConditionElement EOF )
            // InternalStructurizrExpressions.g:570:2: iv_ruleConditionElement= ruleConditionElement EOF
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
    // InternalStructurizrExpressions.g:576:1: ruleConditionElement returns [EObject current=null] : (this_NoFilterCondition_0= ruleNoFilterCondition | this_FilterCondition_1= ruleFilterCondition ) ;
    public final EObject ruleConditionElement() throws RecognitionException {
        EObject current = null;

        EObject this_NoFilterCondition_0 = null;

        EObject this_FilterCondition_1 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:582:2: ( (this_NoFilterCondition_0= ruleNoFilterCondition | this_FilterCondition_1= ruleFilterCondition ) )
            // InternalStructurizrExpressions.g:583:2: (this_NoFilterCondition_0= ruleNoFilterCondition | this_FilterCondition_1= ruleFilterCondition )
            {
            // InternalStructurizrExpressions.g:583:2: (this_NoFilterCondition_0= ruleNoFilterCondition | this_FilterCondition_1= ruleFilterCondition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12||LA10_0==14) ) {
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
                    // InternalStructurizrExpressions.g:584:3: this_NoFilterCondition_0= ruleNoFilterCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionElementAccess().getNoFilterConditionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NoFilterCondition_0=ruleNoFilterCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NoFilterCondition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStructurizrExpressions.g:596:3: this_FilterCondition_1= ruleFilterCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionElementAccess().getFilterConditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FilterCondition_1=ruleFilterCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FilterCondition_1;
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


    // $ANTLR start "entryRuleNoFilterCondition"
    // InternalStructurizrExpressions.g:611:1: entryRuleNoFilterCondition returns [EObject current=null] : iv_ruleNoFilterCondition= ruleNoFilterCondition EOF ;
    public final EObject entryRuleNoFilterCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoFilterCondition = null;


        try {
            // InternalStructurizrExpressions.g:611:58: (iv_ruleNoFilterCondition= ruleNoFilterCondition EOF )
            // InternalStructurizrExpressions.g:612:2: iv_ruleNoFilterCondition= ruleNoFilterCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoFilterConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNoFilterCondition=ruleNoFilterCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoFilterCondition; 
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
    // $ANTLR end "entryRuleNoFilterCondition"


    // $ANTLR start "ruleNoFilterCondition"
    // InternalStructurizrExpressions.g:618:1: ruleNoFilterCondition returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleNoFilterCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStructurizrExpressions.g:624:2: ( ( () otherlv_1= '*' ) )
            // InternalStructurizrExpressions.g:625:2: ( () otherlv_1= '*' )
            {
            // InternalStructurizrExpressions.g:625:2: ( () otherlv_1= '*' )
            // InternalStructurizrExpressions.g:626:3: () otherlv_1= '*'
            {
            // InternalStructurizrExpressions.g:626:3: ()
            // InternalStructurizrExpressions.g:627:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNoFilterConditionAccess().getNoFilterConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNoFilterConditionAccess().getAsteriskKeyword_1());
              		
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
    // $ANTLR end "ruleNoFilterCondition"


    // $ANTLR start "entryRuleFilterCondition"
    // InternalStructurizrExpressions.g:644:1: entryRuleFilterCondition returns [EObject current=null] : iv_ruleFilterCondition= ruleFilterCondition EOF ;
    public final EObject entryRuleFilterCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterCondition = null;


        try {
            // InternalStructurizrExpressions.g:644:56: (iv_ruleFilterCondition= ruleFilterCondition EOF )
            // InternalStructurizrExpressions.g:645:2: iv_ruleFilterCondition= ruleFilterCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFilterCondition=ruleFilterCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilterCondition; 
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
    // $ANTLR end "entryRuleFilterCondition"


    // $ANTLR start "ruleFilterCondition"
    // InternalStructurizrExpressions.g:651:1: ruleFilterCondition returns [EObject current=null] : (this_CompositeCondition_0= ruleCompositeCondition | this_ElementFilterCondition_1= ruleElementFilterCondition | this_RelationshipFilterCondition_2= ruleRelationshipFilterCondition ) ;
    public final EObject ruleFilterCondition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeCondition_0 = null;

        EObject this_ElementFilterCondition_1 = null;

        EObject this_RelationshipFilterCondition_2 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:657:2: ( (this_CompositeCondition_0= ruleCompositeCondition | this_ElementFilterCondition_1= ruleElementFilterCondition | this_RelationshipFilterCondition_2= ruleRelationshipFilterCondition ) )
            // InternalStructurizrExpressions.g:658:2: (this_CompositeCondition_0= ruleCompositeCondition | this_ElementFilterCondition_1= ruleElementFilterCondition | this_RelationshipFilterCondition_2= ruleRelationshipFilterCondition )
            {
            // InternalStructurizrExpressions.g:658:2: (this_CompositeCondition_0= ruleCompositeCondition | this_ElementFilterCondition_1= ruleElementFilterCondition | this_RelationshipFilterCondition_2= ruleRelationshipFilterCondition )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==15) ) {
                    alt11=2;
                }
                else if ( (LA11_2==26) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalStructurizrExpressions.g:659:3: this_CompositeCondition_0= ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterConditionAccess().getCompositeConditionParserRuleCall_0());
                      		
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
                    // InternalStructurizrExpressions.g:671:3: this_ElementFilterCondition_1= ruleElementFilterCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterConditionAccess().getElementFilterConditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementFilterCondition_1=ruleElementFilterCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ElementFilterCondition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStructurizrExpressions.g:683:3: this_RelationshipFilterCondition_2= ruleRelationshipFilterCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterConditionAccess().getRelationshipFilterConditionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipFilterCondition_2=ruleRelationshipFilterCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipFilterCondition_2;
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
    // $ANTLR end "ruleFilterCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // InternalStructurizrExpressions.g:698:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalStructurizrExpressions.g:698:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalStructurizrExpressions.g:699:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
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
    // InternalStructurizrExpressions.g:705:1: ruleCompositeCondition returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_left_2_0= ruleFilterCondition ) )? ( (lv_logicalOperation_3_0= ruleConditionLogicalOperation ) ) ( (lv_right_4_0= ruleFilterCondition ) )? otherlv_5= '}' ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        Enumerator lv_logicalOperation_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:711:2: ( ( () otherlv_1= '{' ( (lv_left_2_0= ruleFilterCondition ) )? ( (lv_logicalOperation_3_0= ruleConditionLogicalOperation ) ) ( (lv_right_4_0= ruleFilterCondition ) )? otherlv_5= '}' ) )
            // InternalStructurizrExpressions.g:712:2: ( () otherlv_1= '{' ( (lv_left_2_0= ruleFilterCondition ) )? ( (lv_logicalOperation_3_0= ruleConditionLogicalOperation ) ) ( (lv_right_4_0= ruleFilterCondition ) )? otherlv_5= '}' )
            {
            // InternalStructurizrExpressions.g:712:2: ( () otherlv_1= '{' ( (lv_left_2_0= ruleFilterCondition ) )? ( (lv_logicalOperation_3_0= ruleConditionLogicalOperation ) ) ( (lv_right_4_0= ruleFilterCondition ) )? otherlv_5= '}' )
            // InternalStructurizrExpressions.g:713:3: () otherlv_1= '{' ( (lv_left_2_0= ruleFilterCondition ) )? ( (lv_logicalOperation_3_0= ruleConditionLogicalOperation ) ) ( (lv_right_4_0= ruleFilterCondition ) )? otherlv_5= '}'
            {
            // InternalStructurizrExpressions.g:713:3: ()
            // InternalStructurizrExpressions.g:714:4: 
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

            otherlv_1=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompositeConditionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalStructurizrExpressions.g:727:3: ( (lv_left_2_0= ruleFilterCondition ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12||LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStructurizrExpressions.g:728:4: (lv_left_2_0= ruleFilterCondition )
                    {
                    // InternalStructurizrExpressions.g:728:4: (lv_left_2_0= ruleFilterCondition )
                    // InternalStructurizrExpressions.g:729:5: lv_left_2_0= ruleFilterCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLeftFilterConditionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_left_2_0=ruleFilterCondition();

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
                      						"structurizr.expressions.StructurizrExpressions.FilterCondition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalStructurizrExpressions.g:746:3: ( (lv_logicalOperation_3_0= ruleConditionLogicalOperation ) )
            // InternalStructurizrExpressions.g:747:4: (lv_logicalOperation_3_0= ruleConditionLogicalOperation )
            {
            // InternalStructurizrExpressions.g:747:4: (lv_logicalOperation_3_0= ruleConditionLogicalOperation )
            // InternalStructurizrExpressions.g:748:5: lv_logicalOperation_3_0= ruleConditionLogicalOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompositeConditionAccess().getLogicalOperationConditionLogicalOperationEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_logicalOperation_3_0=ruleConditionLogicalOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              					}
              					set(
              						current,
              						"logicalOperation",
              						lv_logicalOperation_3_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionLogicalOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:765:3: ( (lv_right_4_0= ruleFilterCondition ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12||LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStructurizrExpressions.g:766:4: (lv_right_4_0= ruleFilterCondition )
                    {
                    // InternalStructurizrExpressions.g:766:4: (lv_right_4_0= ruleFilterCondition )
                    // InternalStructurizrExpressions.g:767:5: lv_right_4_0= ruleFilterCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCompositeConditionAccess().getRightFilterConditionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_right_4_0=ruleFilterCondition();

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
                      						"structurizr.expressions.StructurizrExpressions.FilterCondition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleElementFilterCondition"
    // InternalStructurizrExpressions.g:792:1: entryRuleElementFilterCondition returns [EObject current=null] : iv_ruleElementFilterCondition= ruleElementFilterCondition EOF ;
    public final EObject entryRuleElementFilterCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementFilterCondition = null;


        try {
            // InternalStructurizrExpressions.g:792:63: (iv_ruleElementFilterCondition= ruleElementFilterCondition EOF )
            // InternalStructurizrExpressions.g:793:2: iv_ruleElementFilterCondition= ruleElementFilterCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementFilterConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementFilterCondition=ruleElementFilterCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementFilterCondition; 
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
    // $ANTLR end "entryRuleElementFilterCondition"


    // $ANTLR start "ruleElementFilterCondition"
    // InternalStructurizrExpressions.g:799:1: ruleElementFilterCondition returns [EObject current=null] : (this_ElementTagCondition_0= ruleElementTagCondition | this_ElementTechnologyCondition_1= ruleElementTechnologyCondition | this_ElementTypeCondition_2= ruleElementTypeCondition | this_ElementPropertyCondition_3= ruleElementPropertyCondition | this_ElementParentCondition_4= ruleElementParentCondition ) ;
    public final EObject ruleElementFilterCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ElementTagCondition_0 = null;

        EObject this_ElementTechnologyCondition_1 = null;

        EObject this_ElementTypeCondition_2 = null;

        EObject this_ElementPropertyCondition_3 = null;

        EObject this_ElementParentCondition_4 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:805:2: ( (this_ElementTagCondition_0= ruleElementTagCondition | this_ElementTechnologyCondition_1= ruleElementTechnologyCondition | this_ElementTypeCondition_2= ruleElementTypeCondition | this_ElementPropertyCondition_3= ruleElementPropertyCondition | this_ElementParentCondition_4= ruleElementParentCondition ) )
            // InternalStructurizrExpressions.g:806:2: (this_ElementTagCondition_0= ruleElementTagCondition | this_ElementTechnologyCondition_1= ruleElementTechnologyCondition | this_ElementTypeCondition_2= ruleElementTypeCondition | this_ElementPropertyCondition_3= ruleElementPropertyCondition | this_ElementParentCondition_4= ruleElementParentCondition )
            {
            // InternalStructurizrExpressions.g:806:2: (this_ElementTagCondition_0= ruleElementTagCondition | this_ElementTechnologyCondition_1= ruleElementTechnologyCondition | this_ElementTypeCondition_2= ruleElementTypeCondition | this_ElementPropertyCondition_3= ruleElementPropertyCondition | this_ElementParentCondition_4= ruleElementParentCondition )
            int alt14=5;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==15) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==16) ) {
                        switch ( input.LA(4) ) {
                        case 20:
                            {
                            alt14=2;
                            }
                            break;
                        case 17:
                            {
                            alt14=1;
                            }
                            break;
                        case 25:
                            {
                            alt14=5;
                            }
                            break;
                        case 21:
                            {
                            alt14=3;
                            }
                            break;
                        case 22:
                            {
                            alt14=4;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalStructurizrExpressions.g:807:3: this_ElementTagCondition_0= ruleElementTagCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementFilterConditionAccess().getElementTagConditionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementTagCondition_0=ruleElementTagCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ElementTagCondition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStructurizrExpressions.g:819:3: this_ElementTechnologyCondition_1= ruleElementTechnologyCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementFilterConditionAccess().getElementTechnologyConditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementTechnologyCondition_1=ruleElementTechnologyCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ElementTechnologyCondition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStructurizrExpressions.g:831:3: this_ElementTypeCondition_2= ruleElementTypeCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementFilterConditionAccess().getElementTypeConditionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementTypeCondition_2=ruleElementTypeCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ElementTypeCondition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalStructurizrExpressions.g:843:3: this_ElementPropertyCondition_3= ruleElementPropertyCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementFilterConditionAccess().getElementPropertyConditionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementPropertyCondition_3=ruleElementPropertyCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ElementPropertyCondition_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalStructurizrExpressions.g:855:3: this_ElementParentCondition_4= ruleElementParentCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementFilterConditionAccess().getElementParentConditionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementParentCondition_4=ruleElementParentCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ElementParentCondition_4;
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
    // $ANTLR end "ruleElementFilterCondition"


    // $ANTLR start "entryRuleRelationshipFilterCondition"
    // InternalStructurizrExpressions.g:870:1: entryRuleRelationshipFilterCondition returns [EObject current=null] : iv_ruleRelationshipFilterCondition= ruleRelationshipFilterCondition EOF ;
    public final EObject entryRuleRelationshipFilterCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipFilterCondition = null;


        try {
            // InternalStructurizrExpressions.g:870:68: (iv_ruleRelationshipFilterCondition= ruleRelationshipFilterCondition EOF )
            // InternalStructurizrExpressions.g:871:2: iv_ruleRelationshipFilterCondition= ruleRelationshipFilterCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipFilterConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipFilterCondition=ruleRelationshipFilterCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipFilterCondition; 
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
    // $ANTLR end "entryRuleRelationshipFilterCondition"


    // $ANTLR start "ruleRelationshipFilterCondition"
    // InternalStructurizrExpressions.g:877:1: ruleRelationshipFilterCondition returns [EObject current=null] : (this_RelationshipTagCondition_0= ruleRelationshipTagCondition | this_RelationshipPropertyCondition_1= ruleRelationshipPropertyCondition | this_RelationshipSourceCondition_2= ruleRelationshipSourceCondition | this_RelationshipDestinationCondition_3= ruleRelationshipDestinationCondition ) ;
    public final EObject ruleRelationshipFilterCondition() throws RecognitionException {
        EObject current = null;

        EObject this_RelationshipTagCondition_0 = null;

        EObject this_RelationshipPropertyCondition_1 = null;

        EObject this_RelationshipSourceCondition_2 = null;

        EObject this_RelationshipDestinationCondition_3 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:883:2: ( (this_RelationshipTagCondition_0= ruleRelationshipTagCondition | this_RelationshipPropertyCondition_1= ruleRelationshipPropertyCondition | this_RelationshipSourceCondition_2= ruleRelationshipSourceCondition | this_RelationshipDestinationCondition_3= ruleRelationshipDestinationCondition ) )
            // InternalStructurizrExpressions.g:884:2: (this_RelationshipTagCondition_0= ruleRelationshipTagCondition | this_RelationshipPropertyCondition_1= ruleRelationshipPropertyCondition | this_RelationshipSourceCondition_2= ruleRelationshipSourceCondition | this_RelationshipDestinationCondition_3= ruleRelationshipDestinationCondition )
            {
            // InternalStructurizrExpressions.g:884:2: (this_RelationshipTagCondition_0= ruleRelationshipTagCondition | this_RelationshipPropertyCondition_1= ruleRelationshipPropertyCondition | this_RelationshipSourceCondition_2= ruleRelationshipSourceCondition | this_RelationshipDestinationCondition_3= ruleRelationshipDestinationCondition )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==26) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==16) ) {
                        switch ( input.LA(4) ) {
                        case 27:
                            {
                            alt15=3;
                            }
                            break;
                        case 22:
                            {
                            alt15=2;
                            }
                            break;
                        case 28:
                            {
                            alt15=4;
                            }
                            break;
                        case 17:
                            {
                            alt15=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalStructurizrExpressions.g:885:3: this_RelationshipTagCondition_0= ruleRelationshipTagCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationshipFilterConditionAccess().getRelationshipTagConditionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipTagCondition_0=ruleRelationshipTagCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipTagCondition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStructurizrExpressions.g:897:3: this_RelationshipPropertyCondition_1= ruleRelationshipPropertyCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationshipFilterConditionAccess().getRelationshipPropertyConditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipPropertyCondition_1=ruleRelationshipPropertyCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipPropertyCondition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStructurizrExpressions.g:909:3: this_RelationshipSourceCondition_2= ruleRelationshipSourceCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationshipFilterConditionAccess().getRelationshipSourceConditionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipSourceCondition_2=ruleRelationshipSourceCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipSourceCondition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalStructurizrExpressions.g:921:3: this_RelationshipDestinationCondition_3= ruleRelationshipDestinationCondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationshipFilterConditionAccess().getRelationshipDestinationConditionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipDestinationCondition_3=ruleRelationshipDestinationCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipDestinationCondition_3;
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
    // $ANTLR end "ruleRelationshipFilterCondition"


    // $ANTLR start "entryRuleElementTagCondition"
    // InternalStructurizrExpressions.g:936:1: entryRuleElementTagCondition returns [EObject current=null] : iv_ruleElementTagCondition= ruleElementTagCondition EOF ;
    public final EObject entryRuleElementTagCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementTagCondition = null;


        try {
            // InternalStructurizrExpressions.g:936:60: (iv_ruleElementTagCondition= ruleElementTagCondition EOF )
            // InternalStructurizrExpressions.g:937:2: iv_ruleElementTagCondition= ruleElementTagCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementTagConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementTagCondition=ruleElementTagCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementTagCondition; 
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
    // $ANTLR end "entryRuleElementTagCondition"


    // $ANTLR start "ruleElementTagCondition"
    // InternalStructurizrExpressions.g:943:1: ruleElementTagCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' ) ;
    public final EObject ruleElementTagCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_comparisonOperation_5_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:949:2: ( ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' ) )
            // InternalStructurizrExpressions.g:950:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' )
            {
            // InternalStructurizrExpressions.g:950:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' )
            // InternalStructurizrExpressions.g:951:3: () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')'
            {
            // InternalStructurizrExpressions.g:951:3: ()
            // InternalStructurizrExpressions.g:952:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElementTagConditionAccess().getElementTagConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElementTagConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElementTagConditionAccess().getElementKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElementTagConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getElementTagConditionAccess().getTagKeyword_4());
              		
            }
            // InternalStructurizrExpressions.g:977:3: ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:978:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:978:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:979:5: lv_comparisonOperation_5_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElementTagConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_comparisonOperation_5_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElementTagConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_5_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:996:3: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalStructurizrExpressions.g:997:4: ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    // InternalStructurizrExpressions.g:997:4: ( (otherlv_6= RULE_ID ) )
                    // InternalStructurizrExpressions.g:998:5: (otherlv_6= RULE_ID )
                    {
                    // InternalStructurizrExpressions.g:998:5: (otherlv_6= RULE_ID )
                    // InternalStructurizrExpressions.g:999:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getElementTagConditionRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getElementTagConditionAccess().getTagsTagCrossReference_6_0_0());
                      					
                    }

                    }


                    }

                    // InternalStructurizrExpressions.g:1013:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalStructurizrExpressions.g:1014:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getElementTagConditionAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalStructurizrExpressions.g:1018:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalStructurizrExpressions.g:1019:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalStructurizrExpressions.g:1019:6: (otherlv_8= RULE_ID )
                    	    // InternalStructurizrExpressions.g:1020:7: otherlv_8= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getElementTagConditionRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_8, grammarAccess.getElementTagConditionAccess().getTagsTagCrossReference_6_1_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getElementTagConditionAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleElementTagCondition"


    // $ANTLR start "entryRuleElementTechnologyCondition"
    // InternalStructurizrExpressions.g:1044:1: entryRuleElementTechnologyCondition returns [EObject current=null] : iv_ruleElementTechnologyCondition= ruleElementTechnologyCondition EOF ;
    public final EObject entryRuleElementTechnologyCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementTechnologyCondition = null;


        try {
            // InternalStructurizrExpressions.g:1044:67: (iv_ruleElementTechnologyCondition= ruleElementTechnologyCondition EOF )
            // InternalStructurizrExpressions.g:1045:2: iv_ruleElementTechnologyCondition= ruleElementTechnologyCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementTechnologyConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementTechnologyCondition=ruleElementTechnologyCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementTechnologyCondition; 
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
    // $ANTLR end "entryRuleElementTechnologyCondition"


    // $ANTLR start "ruleElementTechnologyCondition"
    // InternalStructurizrExpressions.g:1051:1: ruleElementTechnologyCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'technology' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' ) ;
    public final EObject ruleElementTechnologyCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_comparisonOperation_5_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1057:2: ( ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'technology' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' ) )
            // InternalStructurizrExpressions.g:1058:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'technology' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' )
            {
            // InternalStructurizrExpressions.g:1058:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'technology' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' )
            // InternalStructurizrExpressions.g:1059:3: () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'technology' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')'
            {
            // InternalStructurizrExpressions.g:1059:3: ()
            // InternalStructurizrExpressions.g:1060:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElementTechnologyConditionAccess().getElementTechnologyConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElementTechnologyConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElementTechnologyConditionAccess().getElementKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElementTechnologyConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getElementTechnologyConditionAccess().getTechnologyKeyword_4());
              		
            }
            // InternalStructurizrExpressions.g:1085:3: ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:1086:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:1086:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:1087:5: lv_comparisonOperation_5_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElementTechnologyConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_comparisonOperation_5_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElementTechnologyConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_5_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:1104:3: ( (otherlv_6= RULE_ID ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalStructurizrExpressions.g:1105:4: (otherlv_6= RULE_ID )
                    {
                    // InternalStructurizrExpressions.g:1105:4: (otherlv_6= RULE_ID )
                    // InternalStructurizrExpressions.g:1106:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementTechnologyConditionRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getElementTechnologyConditionAccess().getTechnologyTechnologyCrossReference_6_0());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getElementTechnologyConditionAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleElementTechnologyCondition"


    // $ANTLR start "entryRuleElementTypeCondition"
    // InternalStructurizrExpressions.g:1128:1: entryRuleElementTypeCondition returns [EObject current=null] : iv_ruleElementTypeCondition= ruleElementTypeCondition EOF ;
    public final EObject entryRuleElementTypeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementTypeCondition = null;


        try {
            // InternalStructurizrExpressions.g:1128:61: (iv_ruleElementTypeCondition= ruleElementTypeCondition EOF )
            // InternalStructurizrExpressions.g:1129:2: iv_ruleElementTypeCondition= ruleElementTypeCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementTypeConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementTypeCondition=ruleElementTypeCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementTypeCondition; 
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
    // $ANTLR end "entryRuleElementTypeCondition"


    // $ANTLR start "ruleElementTypeCondition"
    // InternalStructurizrExpressions.g:1135:1: ruleElementTypeCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'type' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (lv_type_6_0= ruleFilterType ) )? otherlv_7= ')' ) ;
    public final EObject ruleElementTypeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Enumerator lv_comparisonOperation_5_0 = null;

        Enumerator lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1141:2: ( ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'type' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (lv_type_6_0= ruleFilterType ) )? otherlv_7= ')' ) )
            // InternalStructurizrExpressions.g:1142:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'type' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (lv_type_6_0= ruleFilterType ) )? otherlv_7= ')' )
            {
            // InternalStructurizrExpressions.g:1142:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'type' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (lv_type_6_0= ruleFilterType ) )? otherlv_7= ')' )
            // InternalStructurizrExpressions.g:1143:3: () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'type' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (lv_type_6_0= ruleFilterType ) )? otherlv_7= ')'
            {
            // InternalStructurizrExpressions.g:1143:3: ()
            // InternalStructurizrExpressions.g:1144:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElementTypeConditionAccess().getElementTypeConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElementTypeConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElementTypeConditionAccess().getElementKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElementTypeConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getElementTypeConditionAccess().getTypeKeyword_4());
              		
            }
            // InternalStructurizrExpressions.g:1169:3: ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:1170:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:1170:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:1171:5: lv_comparisonOperation_5_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElementTypeConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_comparisonOperation_5_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElementTypeConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_5_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:1188:3: ( (lv_type_6_0= ruleFilterType ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=33 && LA19_0<=37)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalStructurizrExpressions.g:1189:4: (lv_type_6_0= ruleFilterType )
                    {
                    // InternalStructurizrExpressions.g:1189:4: (lv_type_6_0= ruleFilterType )
                    // InternalStructurizrExpressions.g:1190:5: lv_type_6_0= ruleFilterType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getElementTypeConditionAccess().getTypeFilterTypeEnumRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_type_6_0=ruleFilterType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getElementTypeConditionRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_6_0,
                      						"structurizr.expressions.StructurizrExpressions.FilterType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getElementTypeConditionAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleElementTypeCondition"


    // $ANTLR start "entryRuleElementPropertyCondition"
    // InternalStructurizrExpressions.g:1215:1: entryRuleElementPropertyCondition returns [EObject current=null] : iv_ruleElementPropertyCondition= ruleElementPropertyCondition EOF ;
    public final EObject entryRuleElementPropertyCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementPropertyCondition = null;


        try {
            // InternalStructurizrExpressions.g:1215:65: (iv_ruleElementPropertyCondition= ruleElementPropertyCondition EOF )
            // InternalStructurizrExpressions.g:1216:2: iv_ruleElementPropertyCondition= ruleElementPropertyCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementPropertyConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementPropertyCondition=ruleElementPropertyCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementPropertyCondition; 
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
    // $ANTLR end "entryRuleElementPropertyCondition"


    // $ANTLR start "ruleElementPropertyCondition"
    // InternalStructurizrExpressions.g:1222:1: ruleElementPropertyCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')' ) ;
    public final EObject ruleElementPropertyCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Enumerator lv_comparisonOperation_8_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1228:2: ( ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')' ) )
            // InternalStructurizrExpressions.g:1229:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')' )
            {
            // InternalStructurizrExpressions.g:1229:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')' )
            // InternalStructurizrExpressions.g:1230:3: () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')'
            {
            // InternalStructurizrExpressions.g:1230:3: ()
            // InternalStructurizrExpressions.g:1231:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElementPropertyConditionAccess().getElementPropertyConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElementPropertyConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElementPropertyConditionAccess().getElementKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElementPropertyConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getElementPropertyConditionAccess().getPropertiesKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getElementPropertyConditionAccess().getLeftSquareBracketKeyword_5());
              		
            }
            // InternalStructurizrExpressions.g:1260:3: ( (otherlv_6= RULE_ID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalStructurizrExpressions.g:1261:4: (otherlv_6= RULE_ID )
                    {
                    // InternalStructurizrExpressions.g:1261:4: (otherlv_6= RULE_ID )
                    // InternalStructurizrExpressions.g:1262:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementPropertyConditionRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getElementPropertyConditionAccess().getPropertyPropertyCrossReference_6_0());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getElementPropertyConditionAccess().getRightSquareBracketKeyword_7());
              		
            }
            // InternalStructurizrExpressions.g:1280:3: ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:1281:4: (lv_comparisonOperation_8_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:1281:4: (lv_comparisonOperation_8_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:1282:5: lv_comparisonOperation_8_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElementPropertyConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_comparisonOperation_8_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElementPropertyConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_8_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:1299:3: ( (lv_value_9_0= ruleEString ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalStructurizrExpressions.g:1300:4: (lv_value_9_0= ruleEString )
                    {
                    // InternalStructurizrExpressions.g:1300:4: (lv_value_9_0= ruleEString )
                    // InternalStructurizrExpressions.g:1301:5: lv_value_9_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getElementPropertyConditionAccess().getValueEStringParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_value_9_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getElementPropertyConditionRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_9_0,
                      						"structurizr.expressions.StructurizrExpressions.EString");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getElementPropertyConditionAccess().getRightParenthesisKeyword_10());
              		
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
    // $ANTLR end "ruleElementPropertyCondition"


    // $ANTLR start "entryRuleElementParentCondition"
    // InternalStructurizrExpressions.g:1326:1: entryRuleElementParentCondition returns [EObject current=null] : iv_ruleElementParentCondition= ruleElementParentCondition EOF ;
    public final EObject entryRuleElementParentCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementParentCondition = null;


        try {
            // InternalStructurizrExpressions.g:1326:63: (iv_ruleElementParentCondition= ruleElementParentCondition EOF )
            // InternalStructurizrExpressions.g:1327:2: iv_ruleElementParentCondition= ruleElementParentCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementParentConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementParentCondition=ruleElementParentCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementParentCondition; 
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
    // $ANTLR end "entryRuleElementParentCondition"


    // $ANTLR start "ruleElementParentCondition"
    // InternalStructurizrExpressions.g:1333:1: ruleElementParentCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'parent' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' ) ;
    public final EObject ruleElementParentCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_comparisonOperation_5_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1339:2: ( ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'parent' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' ) )
            // InternalStructurizrExpressions.g:1340:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'parent' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' )
            {
            // InternalStructurizrExpressions.g:1340:2: ( () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'parent' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' )
            // InternalStructurizrExpressions.g:1341:3: () otherlv_1= '(' otherlv_2= 'element' otherlv_3= '.' otherlv_4= 'parent' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')'
            {
            // InternalStructurizrExpressions.g:1341:3: ()
            // InternalStructurizrExpressions.g:1342:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElementParentConditionAccess().getElementParentConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElementParentConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElementParentConditionAccess().getElementKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElementParentConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getElementParentConditionAccess().getParentKeyword_4());
              		
            }
            // InternalStructurizrExpressions.g:1367:3: ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:1368:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:1368:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:1369:5: lv_comparisonOperation_5_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElementParentConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_comparisonOperation_5_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElementParentConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_5_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:1386:3: ( (otherlv_6= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStructurizrExpressions.g:1387:4: (otherlv_6= RULE_ID )
                    {
                    // InternalStructurizrExpressions.g:1387:4: (otherlv_6= RULE_ID )
                    // InternalStructurizrExpressions.g:1388:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementParentConditionRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getElementParentConditionAccess().getParentIdentifiableElementCrossReference_6_0());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getElementParentConditionAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleElementParentCondition"


    // $ANTLR start "entryRuleRelationshipTagCondition"
    // InternalStructurizrExpressions.g:1410:1: entryRuleRelationshipTagCondition returns [EObject current=null] : iv_ruleRelationshipTagCondition= ruleRelationshipTagCondition EOF ;
    public final EObject entryRuleRelationshipTagCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipTagCondition = null;


        try {
            // InternalStructurizrExpressions.g:1410:65: (iv_ruleRelationshipTagCondition= ruleRelationshipTagCondition EOF )
            // InternalStructurizrExpressions.g:1411:2: iv_ruleRelationshipTagCondition= ruleRelationshipTagCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipTagConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipTagCondition=ruleRelationshipTagCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipTagCondition; 
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
    // $ANTLR end "entryRuleRelationshipTagCondition"


    // $ANTLR start "ruleRelationshipTagCondition"
    // InternalStructurizrExpressions.g:1417:1: ruleRelationshipTagCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' ) ;
    public final EObject ruleRelationshipTagCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_comparisonOperation_5_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1423:2: ( ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' ) )
            // InternalStructurizrExpressions.g:1424:2: ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' )
            {
            // InternalStructurizrExpressions.g:1424:2: ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' )
            // InternalStructurizrExpressions.g:1425:3: () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'tag' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')'
            {
            // InternalStructurizrExpressions.g:1425:3: ()
            // InternalStructurizrExpressions.g:1426:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipTagConditionAccess().getRelationshipTagConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelationshipTagConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRelationshipTagConditionAccess().getRelationshipKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRelationshipTagConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRelationshipTagConditionAccess().getTagKeyword_4());
              		
            }
            // InternalStructurizrExpressions.g:1451:3: ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:1452:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:1452:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:1453:5: lv_comparisonOperation_5_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipTagConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_comparisonOperation_5_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipTagConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_5_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:1470:3: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStructurizrExpressions.g:1471:4: ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    // InternalStructurizrExpressions.g:1471:4: ( (otherlv_6= RULE_ID ) )
                    // InternalStructurizrExpressions.g:1472:5: (otherlv_6= RULE_ID )
                    {
                    // InternalStructurizrExpressions.g:1472:5: (otherlv_6= RULE_ID )
                    // InternalStructurizrExpressions.g:1473:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRelationshipTagConditionRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getRelationshipTagConditionAccess().getTagsTagCrossReference_6_0_0());
                      					
                    }

                    }


                    }

                    // InternalStructurizrExpressions.g:1487:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalStructurizrExpressions.g:1488:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getRelationshipTagConditionAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalStructurizrExpressions.g:1492:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalStructurizrExpressions.g:1493:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalStructurizrExpressions.g:1493:6: (otherlv_8= RULE_ID )
                    	    // InternalStructurizrExpressions.g:1494:7: otherlv_8= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getRelationshipTagConditionRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_8, grammarAccess.getRelationshipTagConditionAccess().getTagsTagCrossReference_6_1_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getRelationshipTagConditionAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleRelationshipTagCondition"


    // $ANTLR start "entryRuleRelationshipPropertyCondition"
    // InternalStructurizrExpressions.g:1518:1: entryRuleRelationshipPropertyCondition returns [EObject current=null] : iv_ruleRelationshipPropertyCondition= ruleRelationshipPropertyCondition EOF ;
    public final EObject entryRuleRelationshipPropertyCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipPropertyCondition = null;


        try {
            // InternalStructurizrExpressions.g:1518:70: (iv_ruleRelationshipPropertyCondition= ruleRelationshipPropertyCondition EOF )
            // InternalStructurizrExpressions.g:1519:2: iv_ruleRelationshipPropertyCondition= ruleRelationshipPropertyCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipPropertyConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipPropertyCondition=ruleRelationshipPropertyCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipPropertyCondition; 
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
    // $ANTLR end "entryRuleRelationshipPropertyCondition"


    // $ANTLR start "ruleRelationshipPropertyCondition"
    // InternalStructurizrExpressions.g:1525:1: ruleRelationshipPropertyCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')' ) ;
    public final EObject ruleRelationshipPropertyCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Enumerator lv_comparisonOperation_8_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1531:2: ( ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')' ) )
            // InternalStructurizrExpressions.g:1532:2: ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')' )
            {
            // InternalStructurizrExpressions.g:1532:2: ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')' )
            // InternalStructurizrExpressions.g:1533:3: () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'properties' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )? otherlv_7= ']' ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) ) ( (lv_value_9_0= ruleEString ) )? otherlv_10= ')'
            {
            // InternalStructurizrExpressions.g:1533:3: ()
            // InternalStructurizrExpressions.g:1534:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipPropertyConditionAccess().getRelationshipPropertyConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelationshipPropertyConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRelationshipPropertyConditionAccess().getRelationshipKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRelationshipPropertyConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRelationshipPropertyConditionAccess().getPropertiesKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRelationshipPropertyConditionAccess().getLeftSquareBracketKeyword_5());
              		
            }
            // InternalStructurizrExpressions.g:1563:3: ( (otherlv_6= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalStructurizrExpressions.g:1564:4: (otherlv_6= RULE_ID )
                    {
                    // InternalStructurizrExpressions.g:1564:4: (otherlv_6= RULE_ID )
                    // InternalStructurizrExpressions.g:1565:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRelationshipPropertyConditionRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getRelationshipPropertyConditionAccess().getPropertyPropertyCrossReference_6_0());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRelationshipPropertyConditionAccess().getRightSquareBracketKeyword_7());
              		
            }
            // InternalStructurizrExpressions.g:1583:3: ( (lv_comparisonOperation_8_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:1584:4: (lv_comparisonOperation_8_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:1584:4: (lv_comparisonOperation_8_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:1585:5: lv_comparisonOperation_8_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipPropertyConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_comparisonOperation_8_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipPropertyConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_8_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:1602:3: ( (lv_value_9_0= ruleEString ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalStructurizrExpressions.g:1603:4: (lv_value_9_0= ruleEString )
                    {
                    // InternalStructurizrExpressions.g:1603:4: (lv_value_9_0= ruleEString )
                    // InternalStructurizrExpressions.g:1604:5: lv_value_9_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRelationshipPropertyConditionAccess().getValueEStringParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_value_9_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRelationshipPropertyConditionRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_9_0,
                      						"structurizr.expressions.StructurizrExpressions.EString");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getRelationshipPropertyConditionAccess().getRightParenthesisKeyword_10());
              		
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
    // $ANTLR end "ruleRelationshipPropertyCondition"


    // $ANTLR start "entryRuleRelationshipSourceCondition"
    // InternalStructurizrExpressions.g:1629:1: entryRuleRelationshipSourceCondition returns [EObject current=null] : iv_ruleRelationshipSourceCondition= ruleRelationshipSourceCondition EOF ;
    public final EObject entryRuleRelationshipSourceCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipSourceCondition = null;


        try {
            // InternalStructurizrExpressions.g:1629:68: (iv_ruleRelationshipSourceCondition= ruleRelationshipSourceCondition EOF )
            // InternalStructurizrExpressions.g:1630:2: iv_ruleRelationshipSourceCondition= ruleRelationshipSourceCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipSourceConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipSourceCondition=ruleRelationshipSourceCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipSourceCondition; 
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
    // $ANTLR end "entryRuleRelationshipSourceCondition"


    // $ANTLR start "ruleRelationshipSourceCondition"
    // InternalStructurizrExpressions.g:1636:1: ruleRelationshipSourceCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'source' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' ) ;
    public final EObject ruleRelationshipSourceCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_comparisonOperation_5_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1642:2: ( ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'source' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' ) )
            // InternalStructurizrExpressions.g:1643:2: ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'source' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' )
            {
            // InternalStructurizrExpressions.g:1643:2: ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'source' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' )
            // InternalStructurizrExpressions.g:1644:3: () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'source' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')'
            {
            // InternalStructurizrExpressions.g:1644:3: ()
            // InternalStructurizrExpressions.g:1645:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipSourceConditionAccess().getRelationshipSourceConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelationshipSourceConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRelationshipSourceConditionAccess().getRelationshipKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRelationshipSourceConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRelationshipSourceConditionAccess().getSourceKeyword_4());
              		
            }
            // InternalStructurizrExpressions.g:1670:3: ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:1671:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:1671:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:1672:5: lv_comparisonOperation_5_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipSourceConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_comparisonOperation_5_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipSourceConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_5_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:1689:3: ( (otherlv_6= RULE_ID ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalStructurizrExpressions.g:1690:4: (otherlv_6= RULE_ID )
                    {
                    // InternalStructurizrExpressions.g:1690:4: (otherlv_6= RULE_ID )
                    // InternalStructurizrExpressions.g:1691:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRelationshipSourceConditionRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getRelationshipSourceConditionAccess().getSourceIdentifiableElementCrossReference_6_0());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRelationshipSourceConditionAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleRelationshipSourceCondition"


    // $ANTLR start "entryRuleRelationshipDestinationCondition"
    // InternalStructurizrExpressions.g:1713:1: entryRuleRelationshipDestinationCondition returns [EObject current=null] : iv_ruleRelationshipDestinationCondition= ruleRelationshipDestinationCondition EOF ;
    public final EObject entryRuleRelationshipDestinationCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipDestinationCondition = null;


        try {
            // InternalStructurizrExpressions.g:1713:73: (iv_ruleRelationshipDestinationCondition= ruleRelationshipDestinationCondition EOF )
            // InternalStructurizrExpressions.g:1714:2: iv_ruleRelationshipDestinationCondition= ruleRelationshipDestinationCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipDestinationConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipDestinationCondition=ruleRelationshipDestinationCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipDestinationCondition; 
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
    // $ANTLR end "entryRuleRelationshipDestinationCondition"


    // $ANTLR start "ruleRelationshipDestinationCondition"
    // InternalStructurizrExpressions.g:1720:1: ruleRelationshipDestinationCondition returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'destination' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' ) ;
    public final EObject ruleRelationshipDestinationCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_comparisonOperation_5_0 = null;



        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1726:2: ( ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'destination' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' ) )
            // InternalStructurizrExpressions.g:1727:2: ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'destination' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' )
            {
            // InternalStructurizrExpressions.g:1727:2: ( () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'destination' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')' )
            // InternalStructurizrExpressions.g:1728:3: () otherlv_1= '(' otherlv_2= 'relationship' otherlv_3= '.' otherlv_4= 'destination' ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) ) ( (otherlv_6= RULE_ID ) )? otherlv_7= ')'
            {
            // InternalStructurizrExpressions.g:1728:3: ()
            // InternalStructurizrExpressions.g:1729:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipDestinationConditionAccess().getRelationshipDestinationConditionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelationshipDestinationConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRelationshipDestinationConditionAccess().getRelationshipKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRelationshipDestinationConditionAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRelationshipDestinationConditionAccess().getDestinationKeyword_4());
              		
            }
            // InternalStructurizrExpressions.g:1754:3: ( (lv_comparisonOperation_5_0= ruleConditionComparisonOperation ) )
            // InternalStructurizrExpressions.g:1755:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            {
            // InternalStructurizrExpressions.g:1755:4: (lv_comparisonOperation_5_0= ruleConditionComparisonOperation )
            // InternalStructurizrExpressions.g:1756:5: lv_comparisonOperation_5_0= ruleConditionComparisonOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipDestinationConditionAccess().getComparisonOperationConditionComparisonOperationEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_comparisonOperation_5_0=ruleConditionComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipDestinationConditionRule());
              					}
              					set(
              						current,
              						"comparisonOperation",
              						lv_comparisonOperation_5_0,
              						"structurizr.expressions.StructurizrExpressions.ConditionComparisonOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStructurizrExpressions.g:1773:3: ( (otherlv_6= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalStructurizrExpressions.g:1774:4: (otherlv_6= RULE_ID )
                    {
                    // InternalStructurizrExpressions.g:1774:4: (otherlv_6= RULE_ID )
                    // InternalStructurizrExpressions.g:1775:5: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRelationshipDestinationConditionRule());
                      					}
                      				
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getRelationshipDestinationConditionAccess().getDestinationIdentifiableElementCrossReference_6_0());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRelationshipDestinationConditionAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleRelationshipDestinationCondition"


    // $ANTLR start "entryRuleEString"
    // InternalStructurizrExpressions.g:1797:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStructurizrExpressions.g:1797:47: (iv_ruleEString= ruleEString EOF )
            // InternalStructurizrExpressions.g:1798:2: iv_ruleEString= ruleEString EOF
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
    // InternalStructurizrExpressions.g:1804:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1810:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalStructurizrExpressions.g:1811:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalStructurizrExpressions.g:1811:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalStructurizrExpressions.g:1812:3: this_STRING_0= RULE_STRING
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
                    // InternalStructurizrExpressions.g:1820:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleConditionLogicalOperation"
    // InternalStructurizrExpressions.g:1831:1: ruleConditionLogicalOperation returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleConditionLogicalOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1837:2: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalStructurizrExpressions.g:1838:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalStructurizrExpressions.g:1838:2: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            else if ( (LA30_0==30) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalStructurizrExpressions.g:1839:3: (enumLiteral_0= '&&' )
                    {
                    // InternalStructurizrExpressions.g:1839:3: (enumLiteral_0= '&&' )
                    // InternalStructurizrExpressions.g:1840:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConditionLogicalOperationAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getConditionLogicalOperationAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStructurizrExpressions.g:1847:3: (enumLiteral_1= '||' )
                    {
                    // InternalStructurizrExpressions.g:1847:3: (enumLiteral_1= '||' )
                    // InternalStructurizrExpressions.g:1848:4: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConditionLogicalOperationAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getConditionLogicalOperationAccess().getOREnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleConditionLogicalOperation"


    // $ANTLR start "ruleConditionComparisonOperation"
    // InternalStructurizrExpressions.g:1858:1: ruleConditionComparisonOperation returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleConditionComparisonOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1864:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalStructurizrExpressions.g:1865:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalStructurizrExpressions.g:1865:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            else if ( (LA31_0==32) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalStructurizrExpressions.g:1866:3: (enumLiteral_0= '==' )
                    {
                    // InternalStructurizrExpressions.g:1866:3: (enumLiteral_0= '==' )
                    // InternalStructurizrExpressions.g:1867:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConditionComparisonOperationAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getConditionComparisonOperationAccess().getEQUALSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStructurizrExpressions.g:1874:3: (enumLiteral_1= '!=' )
                    {
                    // InternalStructurizrExpressions.g:1874:3: (enumLiteral_1= '!=' )
                    // InternalStructurizrExpressions.g:1875:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConditionComparisonOperationAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getConditionComparisonOperationAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleConditionComparisonOperation"


    // $ANTLR start "ruleFilterType"
    // InternalStructurizrExpressions.g:1885:1: ruleFilterType returns [Enumerator current=null] : ( (enumLiteral_0= 'Person' ) | (enumLiteral_1= 'SoftwareSystem' ) | (enumLiteral_2= 'Container' ) | (enumLiteral_3= 'Component' ) | (enumLiteral_4= 'DeploymentNode' ) ) ;
    public final Enumerator ruleFilterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalStructurizrExpressions.g:1891:2: ( ( (enumLiteral_0= 'Person' ) | (enumLiteral_1= 'SoftwareSystem' ) | (enumLiteral_2= 'Container' ) | (enumLiteral_3= 'Component' ) | (enumLiteral_4= 'DeploymentNode' ) ) )
            // InternalStructurizrExpressions.g:1892:2: ( (enumLiteral_0= 'Person' ) | (enumLiteral_1= 'SoftwareSystem' ) | (enumLiteral_2= 'Container' ) | (enumLiteral_3= 'Component' ) | (enumLiteral_4= 'DeploymentNode' ) )
            {
            // InternalStructurizrExpressions.g:1892:2: ( (enumLiteral_0= 'Person' ) | (enumLiteral_1= 'SoftwareSystem' ) | (enumLiteral_2= 'Container' ) | (enumLiteral_3= 'Component' ) | (enumLiteral_4= 'DeploymentNode' ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt32=1;
                }
                break;
            case 34:
                {
                alt32=2;
                }
                break;
            case 35:
                {
                alt32=3;
                }
                break;
            case 36:
                {
                alt32=4;
                }
                break;
            case 37:
                {
                alt32=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalStructurizrExpressions.g:1893:3: (enumLiteral_0= 'Person' )
                    {
                    // InternalStructurizrExpressions.g:1893:3: (enumLiteral_0= 'Person' )
                    // InternalStructurizrExpressions.g:1894:4: enumLiteral_0= 'Person'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFilterTypeAccess().getPersonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getFilterTypeAccess().getPersonEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStructurizrExpressions.g:1901:3: (enumLiteral_1= 'SoftwareSystem' )
                    {
                    // InternalStructurizrExpressions.g:1901:3: (enumLiteral_1= 'SoftwareSystem' )
                    // InternalStructurizrExpressions.g:1902:4: enumLiteral_1= 'SoftwareSystem'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFilterTypeAccess().getSoftwareSystemEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getFilterTypeAccess().getSoftwareSystemEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStructurizrExpressions.g:1909:3: (enumLiteral_2= 'Container' )
                    {
                    // InternalStructurizrExpressions.g:1909:3: (enumLiteral_2= 'Container' )
                    // InternalStructurizrExpressions.g:1910:4: enumLiteral_2= 'Container'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFilterTypeAccess().getContainerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getFilterTypeAccess().getContainerEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStructurizrExpressions.g:1917:3: (enumLiteral_3= 'Component' )
                    {
                    // InternalStructurizrExpressions.g:1917:3: (enumLiteral_3= 'Component' )
                    // InternalStructurizrExpressions.g:1918:4: enumLiteral_3= 'Component'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFilterTypeAccess().getComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getFilterTypeAccess().getComponentEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStructurizrExpressions.g:1925:3: (enumLiteral_4= 'DeploymentNode' )
                    {
                    // InternalStructurizrExpressions.g:1925:3: (enumLiteral_4= 'DeploymentNode' )
                    // InternalStructurizrExpressions.g:1926:4: enumLiteral_4= 'DeploymentNode'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFilterTypeAccess().getDeploymentNodeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getFilterTypeAccess().getDeploymentNodeEnumLiteralDeclaration_4());
                      			
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
    // $ANTLR end "ruleFilterType"

    // $ANTLR start synpred1_InternalStructurizrExpressions
    public final void synpred1_InternalStructurizrExpressions_fragment() throws RecognitionException {   
        EObject this_SystemLandscapeView_Include_0 = null;


        // InternalStructurizrExpressions.g:86:3: (this_SystemLandscapeView_Include_0= ruleSystemLandscapeView_Include )
        // InternalStructurizrExpressions.g:86:3: this_SystemLandscapeView_Include_0= ruleSystemLandscapeView_Include
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SystemLandscapeView_Include_0=ruleSystemLandscapeView_Include();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalStructurizrExpressions

    // $ANTLR start synpred2_InternalStructurizrExpressions
    public final void synpred2_InternalStructurizrExpressions_fragment() throws RecognitionException {   
        EObject this_SystemLandscapeView_Exclude_1 = null;


        // InternalStructurizrExpressions.g:98:3: (this_SystemLandscapeView_Exclude_1= ruleSystemLandscapeView_Exclude )
        // InternalStructurizrExpressions.g:98:3: this_SystemLandscapeView_Exclude_1= ruleSystemLandscapeView_Exclude
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SystemLandscapeView_Exclude_1=ruleSystemLandscapeView_Exclude();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalStructurizrExpressions

    // $ANTLR start synpred3_InternalStructurizrExpressions
    public final void synpred3_InternalStructurizrExpressions_fragment() throws RecognitionException {   
        EObject this_SystemContextView_Include_2 = null;


        // InternalStructurizrExpressions.g:110:3: (this_SystemContextView_Include_2= ruleSystemContextView_Include )
        // InternalStructurizrExpressions.g:110:3: this_SystemContextView_Include_2= ruleSystemContextView_Include
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SystemContextView_Include_2=ruleSystemContextView_Include();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalStructurizrExpressions

    // $ANTLR start synpred4_InternalStructurizrExpressions
    public final void synpred4_InternalStructurizrExpressions_fragment() throws RecognitionException {   
        EObject this_SystemContextView_Exclude_3 = null;


        // InternalStructurizrExpressions.g:122:3: (this_SystemContextView_Exclude_3= ruleSystemContextView_Exclude )
        // InternalStructurizrExpressions.g:122:3: this_SystemContextView_Exclude_3= ruleSystemContextView_Exclude
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SystemContextView_Exclude_3=ruleSystemContextView_Exclude();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalStructurizrExpressions

    // $ANTLR start synpred5_InternalStructurizrExpressions
    public final void synpred5_InternalStructurizrExpressions_fragment() throws RecognitionException {   
        EObject this_ContainerView_Include_4 = null;


        // InternalStructurizrExpressions.g:134:3: (this_ContainerView_Include_4= ruleContainerView_Include )
        // InternalStructurizrExpressions.g:134:3: this_ContainerView_Include_4= ruleContainerView_Include
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ContainerView_Include_4=ruleContainerView_Include();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalStructurizrExpressions

    // $ANTLR start synpred6_InternalStructurizrExpressions
    public final void synpred6_InternalStructurizrExpressions_fragment() throws RecognitionException {   
        EObject this_ContainerView_Exclude_5 = null;


        // InternalStructurizrExpressions.g:146:3: (this_ContainerView_Exclude_5= ruleContainerView_Exclude )
        // InternalStructurizrExpressions.g:146:3: this_ContainerView_Exclude_5= ruleContainerView_Exclude
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ContainerView_Exclude_5=ruleContainerView_Exclude();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalStructurizrExpressions

    // $ANTLR start synpred7_InternalStructurizrExpressions
    public final void synpred7_InternalStructurizrExpressions_fragment() throws RecognitionException {   
        EObject this_ComponentView_Include_6 = null;


        // InternalStructurizrExpressions.g:158:3: (this_ComponentView_Include_6= ruleComponentView_Include )
        // InternalStructurizrExpressions.g:158:3: this_ComponentView_Include_6= ruleComponentView_Include
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ComponentView_Include_6=ruleComponentView_Include();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalStructurizrExpressions

    // Delegated rules

    public final boolean synpred1_InternalStructurizrExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalStructurizrExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalStructurizrExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalStructurizrExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalStructurizrExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalStructurizrExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalStructurizrExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalStructurizrExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalStructurizrExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalStructurizrExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalStructurizrExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalStructurizrExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalStructurizrExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalStructurizrExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\14\uffff";
    static final String dfa_3s = "\1\13\4\0\10\uffff";
    static final String dfa_4s = "\1\16\4\0\10\uffff";
    static final String dfa_5s = "\5\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\1\uffff\1\0\1\1\1\2\1\3\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "85:2: (this_SystemLandscapeView_Include_0= ruleSystemLandscapeView_Include | this_SystemLandscapeView_Exclude_1= ruleSystemLandscapeView_Exclude | this_SystemContextView_Include_2= ruleSystemContextView_Include | this_SystemContextView_Exclude_3= ruleSystemContextView_Exclude | this_ContainerView_Include_4= ruleContainerView_Include | this_ContainerView_Exclude_5= ruleContainerView_Exclude | this_ComponentView_Include_6= ruleComponentView_Include | this_ComponentView_Exclude_7= ruleComponentView_Exclude )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalStructurizrExpressions()) ) {s = 5;}

                        else if ( (synpred2_InternalStructurizrExpressions()) ) {s = 6;}

                        else if ( (synpred3_InternalStructurizrExpressions()) ) {s = 7;}

                        else if ( (synpred4_InternalStructurizrExpressions()) ) {s = 8;}

                        else if ( (synpred5_InternalStructurizrExpressions()) ) {s = 9;}

                        else if ( (synpred6_InternalStructurizrExpressions()) ) {s = 10;}

                        else if ( (synpred7_InternalStructurizrExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalStructurizrExpressions()) ) {s = 5;}

                        else if ( (synpred2_InternalStructurizrExpressions()) ) {s = 6;}

                        else if ( (synpred3_InternalStructurizrExpressions()) ) {s = 7;}

                        else if ( (synpred4_InternalStructurizrExpressions()) ) {s = 8;}

                        else if ( (synpred5_InternalStructurizrExpressions()) ) {s = 9;}

                        else if ( (synpred6_InternalStructurizrExpressions()) ) {s = 10;}

                        else if ( (synpred7_InternalStructurizrExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalStructurizrExpressions()) ) {s = 5;}

                        else if ( (synpred2_InternalStructurizrExpressions()) ) {s = 6;}

                        else if ( (synpred3_InternalStructurizrExpressions()) ) {s = 7;}

                        else if ( (synpred4_InternalStructurizrExpressions()) ) {s = 8;}

                        else if ( (synpred5_InternalStructurizrExpressions()) ) {s = 9;}

                        else if ( (synpred6_InternalStructurizrExpressions()) ) {s = 10;}

                        else if ( (synpred7_InternalStructurizrExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalStructurizrExpressions()) ) {s = 5;}

                        else if ( (synpred2_InternalStructurizrExpressions()) ) {s = 6;}

                        else if ( (synpred3_InternalStructurizrExpressions()) ) {s = 7;}

                        else if ( (synpred4_InternalStructurizrExpressions()) ) {s = 8;}

                        else if ( (synpred5_InternalStructurizrExpressions()) ) {s = 9;}

                        else if ( (synpred6_InternalStructurizrExpressions()) ) {s = 10;}

                        else if ( (synpred7_InternalStructurizrExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000060005000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003E00080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}