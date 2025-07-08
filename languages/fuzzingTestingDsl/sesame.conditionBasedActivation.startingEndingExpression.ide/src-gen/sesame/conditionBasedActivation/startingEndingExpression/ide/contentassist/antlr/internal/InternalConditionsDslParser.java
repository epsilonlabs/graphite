package sesame.conditionBasedActivation.startingEndingExpression.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import sesame.conditionBasedActivation.startingEndingExpression.services.ConditionsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalConditionsDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'='", "'AND'", "'OR'", "'['", "']'", "'('", "')'", "'{'", "'}'", "'@'", "'-'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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


    	private ConditionsDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ConditionsDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMainRules"
    // InternalConditionsDsl.g:54:1: entryRuleMainRules : ruleMainRules EOF ;
    public final void entryRuleMainRules() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:55:1: ( ruleMainRules EOF )
            // InternalConditionsDsl.g:56:1: ruleMainRules EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainRulesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMainRules();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainRulesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainRules"


    // $ANTLR start "ruleMainRules"
    // InternalConditionsDsl.g:63:1: ruleMainRules : ( ( rule__MainRules__Alternatives ) ) ;
    public final void ruleMainRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:67:2: ( ( ( rule__MainRules__Alternatives ) ) )
            // InternalConditionsDsl.g:68:2: ( ( rule__MainRules__Alternatives ) )
            {
            // InternalConditionsDsl.g:68:2: ( ( rule__MainRules__Alternatives ) )
            // InternalConditionsDsl.g:69:3: ( rule__MainRules__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainRulesAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:70:3: ( rule__MainRules__Alternatives )
            // InternalConditionsDsl.g:70:4: rule__MainRules__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MainRules__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainRulesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainRules"


    // $ANTLR start "entryRuleConditionBasedActivationStarting"
    // InternalConditionsDsl.g:79:1: entryRuleConditionBasedActivationStarting : ruleConditionBasedActivationStarting EOF ;
    public final void entryRuleConditionBasedActivationStarting() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:80:1: ( ruleConditionBasedActivationStarting EOF )
            // InternalConditionsDsl.g:81:1: ruleConditionBasedActivationStarting EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationStartingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionBasedActivationStarting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationStartingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionBasedActivationStarting"


    // $ANTLR start "ruleConditionBasedActivationStarting"
    // InternalConditionsDsl.g:88:1: ruleConditionBasedActivationStarting : ( ( rule__ConditionBasedActivationStarting__Group__0 ) ) ;
    public final void ruleConditionBasedActivationStarting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:92:2: ( ( ( rule__ConditionBasedActivationStarting__Group__0 ) ) )
            // InternalConditionsDsl.g:93:2: ( ( rule__ConditionBasedActivationStarting__Group__0 ) )
            {
            // InternalConditionsDsl.g:93:2: ( ( rule__ConditionBasedActivationStarting__Group__0 ) )
            // InternalConditionsDsl.g:94:3: ( rule__ConditionBasedActivationStarting__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationStartingAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:95:3: ( rule__ConditionBasedActivationStarting__Group__0 )
            // InternalConditionsDsl.g:95:4: rule__ConditionBasedActivationStarting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBasedActivationStarting__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationStartingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionBasedActivationStarting"


    // $ANTLR start "entryRuleConditionBasedActivationEnding"
    // InternalConditionsDsl.g:104:1: entryRuleConditionBasedActivationEnding : ruleConditionBasedActivationEnding EOF ;
    public final void entryRuleConditionBasedActivationEnding() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:105:1: ( ruleConditionBasedActivationEnding EOF )
            // InternalConditionsDsl.g:106:1: ruleConditionBasedActivationEnding EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationEndingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionBasedActivationEnding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationEndingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionBasedActivationEnding"


    // $ANTLR start "ruleConditionBasedActivationEnding"
    // InternalConditionsDsl.g:113:1: ruleConditionBasedActivationEnding : ( ( rule__ConditionBasedActivationEnding__Group__0 ) ) ;
    public final void ruleConditionBasedActivationEnding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:117:2: ( ( ( rule__ConditionBasedActivationEnding__Group__0 ) ) )
            // InternalConditionsDsl.g:118:2: ( ( rule__ConditionBasedActivationEnding__Group__0 ) )
            {
            // InternalConditionsDsl.g:118:2: ( ( rule__ConditionBasedActivationEnding__Group__0 ) )
            // InternalConditionsDsl.g:119:3: ( rule__ConditionBasedActivationEnding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationEndingAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:120:3: ( rule__ConditionBasedActivationEnding__Group__0 )
            // InternalConditionsDsl.g:120:4: rule__ConditionBasedActivationEnding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBasedActivationEnding__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationEndingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionBasedActivationEnding"


    // $ANTLR start "entryRuleCondition"
    // InternalConditionsDsl.g:129:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:130:1: ( ruleCondition EOF )
            // InternalConditionsDsl.g:131:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalConditionsDsl.g:138:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:142:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalConditionsDsl.g:143:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalConditionsDsl.g:143:2: ( ( rule__Condition__Group__0 ) )
            // InternalConditionsDsl.g:144:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:145:3: ( rule__Condition__Group__0 )
            // InternalConditionsDsl.g:145:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionElement"
    // InternalConditionsDsl.g:154:1: entryRuleConditionElement : ruleConditionElement EOF ;
    public final void entryRuleConditionElement() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:155:1: ( ruleConditionElement EOF )
            // InternalConditionsDsl.g:156:1: ruleConditionElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionElement"


    // $ANTLR start "ruleConditionElement"
    // InternalConditionsDsl.g:163:1: ruleConditionElement : ( ( rule__ConditionElement__Alternatives ) ) ;
    public final void ruleConditionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:167:2: ( ( ( rule__ConditionElement__Alternatives ) ) )
            // InternalConditionsDsl.g:168:2: ( ( rule__ConditionElement__Alternatives ) )
            {
            // InternalConditionsDsl.g:168:2: ( ( rule__ConditionElement__Alternatives ) )
            // InternalConditionsDsl.g:169:3: ( rule__ConditionElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionElementAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:170:3: ( rule__ConditionElement__Alternatives )
            // InternalConditionsDsl.g:170:4: rule__ConditionElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionElement"


    // $ANTLR start "entryRuleBasicCondition"
    // InternalConditionsDsl.g:179:1: entryRuleBasicCondition : ruleBasicCondition EOF ;
    public final void entryRuleBasicCondition() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:180:1: ( ruleBasicCondition EOF )
            // InternalConditionsDsl.g:181:1: ruleBasicCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicCondition"


    // $ANTLR start "ruleBasicCondition"
    // InternalConditionsDsl.g:188:1: ruleBasicCondition : ( ( rule__BasicCondition__Group__0 ) ) ;
    public final void ruleBasicCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:192:2: ( ( ( rule__BasicCondition__Group__0 ) ) )
            // InternalConditionsDsl.g:193:2: ( ( rule__BasicCondition__Group__0 ) )
            {
            // InternalConditionsDsl.g:193:2: ( ( rule__BasicCondition__Group__0 ) )
            // InternalConditionsDsl.g:194:3: ( rule__BasicCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:195:3: ( rule__BasicCondition__Group__0 )
            // InternalConditionsDsl.g:195:4: rule__BasicCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // InternalConditionsDsl.g:204:1: entryRuleCompositeCondition : ruleCompositeCondition EOF ;
    public final void entryRuleCompositeCondition() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:205:1: ( ruleCompositeCondition EOF )
            // InternalConditionsDsl.g:206:1: ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // InternalConditionsDsl.g:213:1: ruleCompositeCondition : ( ( rule__CompositeCondition__Group__0 ) ) ;
    public final void ruleCompositeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:217:2: ( ( ( rule__CompositeCondition__Group__0 ) ) )
            // InternalConditionsDsl.g:218:2: ( ( rule__CompositeCondition__Group__0 ) )
            {
            // InternalConditionsDsl.g:218:2: ( ( rule__CompositeCondition__Group__0 ) )
            // InternalConditionsDsl.g:219:3: ( rule__CompositeCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:220:3: ( rule__CompositeCondition__Group__0 )
            // InternalConditionsDsl.g:220:4: rule__CompositeCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleConditionExpr"
    // InternalConditionsDsl.g:229:1: entryRuleConditionExpr : ruleConditionExpr EOF ;
    public final void entryRuleConditionExpr() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:230:1: ( ruleConditionExpr EOF )
            // InternalConditionsDsl.g:231:1: ruleConditionExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionExpr"


    // $ANTLR start "ruleConditionExpr"
    // InternalConditionsDsl.g:238:1: ruleConditionExpr : ( ( rule__ConditionExpr__Alternatives ) ) ;
    public final void ruleConditionExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:242:2: ( ( ( rule__ConditionExpr__Alternatives ) ) )
            // InternalConditionsDsl.g:243:2: ( ( rule__ConditionExpr__Alternatives ) )
            {
            // InternalConditionsDsl.g:243:2: ( ( rule__ConditionExpr__Alternatives ) )
            // InternalConditionsDsl.g:244:3: ( rule__ConditionExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionExprAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:245:3: ( rule__ConditionExpr__Alternatives )
            // InternalConditionsDsl.g:245:4: rule__ConditionExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionExpr"


    // $ANTLR start "entryRuleConditionVariable"
    // InternalConditionsDsl.g:254:1: entryRuleConditionVariable : ruleConditionVariable EOF ;
    public final void entryRuleConditionVariable() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:255:1: ( ruleConditionVariable EOF )
            // InternalConditionsDsl.g:256:1: ruleConditionVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionVariable"


    // $ANTLR start "ruleConditionVariable"
    // InternalConditionsDsl.g:263:1: ruleConditionVariable : ( ( rule__ConditionVariable__Group__0 ) ) ;
    public final void ruleConditionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:267:2: ( ( ( rule__ConditionVariable__Group__0 ) ) )
            // InternalConditionsDsl.g:268:2: ( ( rule__ConditionVariable__Group__0 ) )
            {
            // InternalConditionsDsl.g:268:2: ( ( rule__ConditionVariable__Group__0 ) )
            // InternalConditionsDsl.g:269:3: ( rule__ConditionVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:270:3: ( rule__ConditionVariable__Group__0 )
            // InternalConditionsDsl.g:270:4: rule__ConditionVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionVariable"


    // $ANTLR start "entryRuleConditionInteger"
    // InternalConditionsDsl.g:279:1: entryRuleConditionInteger : ruleConditionInteger EOF ;
    public final void entryRuleConditionInteger() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:280:1: ( ruleConditionInteger EOF )
            // InternalConditionsDsl.g:281:1: ruleConditionInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionIntegerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionInteger"


    // $ANTLR start "ruleConditionInteger"
    // InternalConditionsDsl.g:288:1: ruleConditionInteger : ( ( rule__ConditionInteger__Group__0 ) ) ;
    public final void ruleConditionInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:292:2: ( ( ( rule__ConditionInteger__Group__0 ) ) )
            // InternalConditionsDsl.g:293:2: ( ( rule__ConditionInteger__Group__0 ) )
            {
            // InternalConditionsDsl.g:293:2: ( ( rule__ConditionInteger__Group__0 ) )
            // InternalConditionsDsl.g:294:3: ( rule__ConditionInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionIntegerAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:295:3: ( rule__ConditionInteger__Group__0 )
            // InternalConditionsDsl.g:295:4: rule__ConditionInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionInteger__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionIntegerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionInteger"


    // $ANTLR start "entryRuleEInt"
    // InternalConditionsDsl.g:304:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:305:1: ( ruleEInt EOF )
            // InternalConditionsDsl.g:306:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalConditionsDsl.g:313:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:317:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalConditionsDsl.g:318:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalConditionsDsl.g:318:2: ( ( rule__EInt__Group__0 ) )
            // InternalConditionsDsl.g:319:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:320:3: ( rule__EInt__Group__0 )
            // InternalConditionsDsl.g:320:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleBinaryComparisonOperation"
    // InternalConditionsDsl.g:329:1: ruleBinaryComparisonOperation : ( ( rule__BinaryComparisonOperation__Alternatives ) ) ;
    public final void ruleBinaryComparisonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:333:1: ( ( ( rule__BinaryComparisonOperation__Alternatives ) ) )
            // InternalConditionsDsl.g:334:2: ( ( rule__BinaryComparisonOperation__Alternatives ) )
            {
            // InternalConditionsDsl.g:334:2: ( ( rule__BinaryComparisonOperation__Alternatives ) )
            // InternalConditionsDsl.g:335:3: ( rule__BinaryComparisonOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryComparisonOperationAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:336:3: ( rule__BinaryComparisonOperation__Alternatives )
            // InternalConditionsDsl.g:336:4: rule__BinaryComparisonOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryComparisonOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryComparisonOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryComparisonOperation"


    // $ANTLR start "ruleBinaryLogicalOperation"
    // InternalConditionsDsl.g:345:1: ruleBinaryLogicalOperation : ( ( rule__BinaryLogicalOperation__Alternatives ) ) ;
    public final void ruleBinaryLogicalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:349:1: ( ( ( rule__BinaryLogicalOperation__Alternatives ) ) )
            // InternalConditionsDsl.g:350:2: ( ( rule__BinaryLogicalOperation__Alternatives ) )
            {
            // InternalConditionsDsl.g:350:2: ( ( rule__BinaryLogicalOperation__Alternatives ) )
            // InternalConditionsDsl.g:351:3: ( rule__BinaryLogicalOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicalOperationAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:352:3: ( rule__BinaryLogicalOperation__Alternatives )
            // InternalConditionsDsl.g:352:4: rule__BinaryLogicalOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryLogicalOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicalOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryLogicalOperation"


    // $ANTLR start "rule__MainRules__Alternatives"
    // InternalConditionsDsl.g:360:1: rule__MainRules__Alternatives : ( ( ruleConditionBasedActivationStarting ) | ( ruleConditionBasedActivationEnding ) );
    public final void rule__MainRules__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:364:1: ( ( ruleConditionBasedActivationStarting ) | ( ruleConditionBasedActivationEnding ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                int LA1_1 = input.LA(2);

                if ( (synpred1_InternalConditionsDsl()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalConditionsDsl.g:365:2: ( ruleConditionBasedActivationStarting )
                    {
                    // InternalConditionsDsl.g:365:2: ( ruleConditionBasedActivationStarting )
                    // InternalConditionsDsl.g:366:3: ruleConditionBasedActivationStarting
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMainRulesAccess().getConditionBasedActivationStartingParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConditionBasedActivationStarting();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMainRulesAccess().getConditionBasedActivationStartingParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:371:2: ( ruleConditionBasedActivationEnding )
                    {
                    // InternalConditionsDsl.g:371:2: ( ruleConditionBasedActivationEnding )
                    // InternalConditionsDsl.g:372:3: ruleConditionBasedActivationEnding
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMainRulesAccess().getConditionBasedActivationEndingParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConditionBasedActivationEnding();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMainRulesAccess().getConditionBasedActivationEndingParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainRules__Alternatives"


    // $ANTLR start "rule__ConditionElement__Alternatives"
    // InternalConditionsDsl.g:381:1: rule__ConditionElement__Alternatives : ( ( ruleCompositeCondition ) | ( ruleBasicCondition ) );
    public final void rule__ConditionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:385:1: ( ( ruleCompositeCondition ) | ( ruleBasicCondition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalConditionsDsl.g:386:2: ( ruleCompositeCondition )
                    {
                    // InternalConditionsDsl.g:386:2: ( ruleCompositeCondition )
                    // InternalConditionsDsl.g:387:3: ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionElementAccess().getCompositeConditionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionElementAccess().getCompositeConditionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:392:2: ( ruleBasicCondition )
                    {
                    // InternalConditionsDsl.g:392:2: ( ruleBasicCondition )
                    // InternalConditionsDsl.g:393:3: ruleBasicCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionElementAccess().getBasicConditionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionElementAccess().getBasicConditionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionElement__Alternatives"


    // $ANTLR start "rule__ConditionExpr__Alternatives"
    // InternalConditionsDsl.g:402:1: rule__ConditionExpr__Alternatives : ( ( ruleConditionInteger ) | ( ruleConditionVariable ) );
    public final void rule__ConditionExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:406:1: ( ( ruleConditionInteger ) | ( ruleConditionVariable ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalConditionsDsl.g:407:2: ( ruleConditionInteger )
                    {
                    // InternalConditionsDsl.g:407:2: ( ruleConditionInteger )
                    // InternalConditionsDsl.g:408:3: ruleConditionInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionExprAccess().getConditionIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConditionInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionExprAccess().getConditionIntegerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:413:2: ( ruleConditionVariable )
                    {
                    // InternalConditionsDsl.g:413:2: ( ruleConditionVariable )
                    // InternalConditionsDsl.g:414:3: ruleConditionVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionExprAccess().getConditionVariableParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConditionVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionExprAccess().getConditionVariableParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionExpr__Alternatives"


    // $ANTLR start "rule__BinaryComparisonOperation__Alternatives"
    // InternalConditionsDsl.g:423:1: rule__BinaryComparisonOperation__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) );
    public final void rule__BinaryComparisonOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:427:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalConditionsDsl.g:428:2: ( ( '<' ) )
                    {
                    // InternalConditionsDsl.g:428:2: ( ( '<' ) )
                    // InternalConditionsDsl.g:429:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryComparisonOperationAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    }
                    // InternalConditionsDsl.g:430:3: ( '<' )
                    // InternalConditionsDsl.g:430:4: '<'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryComparisonOperationAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:434:2: ( ( '>' ) )
                    {
                    // InternalConditionsDsl.g:434:2: ( ( '>' ) )
                    // InternalConditionsDsl.g:435:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryComparisonOperationAccess().getGREATER_THANEnumLiteralDeclaration_1()); 
                    }
                    // InternalConditionsDsl.g:436:3: ( '>' )
                    // InternalConditionsDsl.g:436:4: '>'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryComparisonOperationAccess().getGREATER_THANEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalConditionsDsl.g:440:2: ( ( '=' ) )
                    {
                    // InternalConditionsDsl.g:440:2: ( ( '=' ) )
                    // InternalConditionsDsl.g:441:3: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryComparisonOperationAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    }
                    // InternalConditionsDsl.g:442:3: ( '=' )
                    // InternalConditionsDsl.g:442:4: '='
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryComparisonOperationAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryComparisonOperation__Alternatives"


    // $ANTLR start "rule__BinaryLogicalOperation__Alternatives"
    // InternalConditionsDsl.g:450:1: rule__BinaryLogicalOperation__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryLogicalOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:454:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalConditionsDsl.g:455:2: ( ( 'AND' ) )
                    {
                    // InternalConditionsDsl.g:455:2: ( ( 'AND' ) )
                    // InternalConditionsDsl.g:456:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicalOperationAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalConditionsDsl.g:457:3: ( 'AND' )
                    // InternalConditionsDsl.g:457:4: 'AND'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryLogicalOperationAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalConditionsDsl.g:461:2: ( ( 'OR' ) )
                    {
                    // InternalConditionsDsl.g:461:2: ( ( 'OR' ) )
                    // InternalConditionsDsl.g:462:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicalOperationAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalConditionsDsl.g:463:3: ( 'OR' )
                    // InternalConditionsDsl.g:463:4: 'OR'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryLogicalOperationAccess().getOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryLogicalOperation__Alternatives"


    // $ANTLR start "rule__ConditionBasedActivationStarting__Group__0"
    // InternalConditionsDsl.g:471:1: rule__ConditionBasedActivationStarting__Group__0 : rule__ConditionBasedActivationStarting__Group__0__Impl rule__ConditionBasedActivationStarting__Group__1 ;
    public final void rule__ConditionBasedActivationStarting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:475:1: ( rule__ConditionBasedActivationStarting__Group__0__Impl rule__ConditionBasedActivationStarting__Group__1 )
            // InternalConditionsDsl.g:476:2: rule__ConditionBasedActivationStarting__Group__0__Impl rule__ConditionBasedActivationStarting__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConditionBasedActivationStarting__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionBasedActivationStarting__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationStarting__Group__0"


    // $ANTLR start "rule__ConditionBasedActivationStarting__Group__0__Impl"
    // InternalConditionsDsl.g:483:1: rule__ConditionBasedActivationStarting__Group__0__Impl : ( () ) ;
    public final void rule__ConditionBasedActivationStarting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:487:1: ( ( () ) )
            // InternalConditionsDsl.g:488:1: ( () )
            {
            // InternalConditionsDsl.g:488:1: ( () )
            // InternalConditionsDsl.g:489:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationStartingAccess().getConditionBasedActivationAction_0()); 
            }
            // InternalConditionsDsl.g:490:2: ()
            // InternalConditionsDsl.g:490:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationStartingAccess().getConditionBasedActivationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationStarting__Group__0__Impl"


    // $ANTLR start "rule__ConditionBasedActivationStarting__Group__1"
    // InternalConditionsDsl.g:498:1: rule__ConditionBasedActivationStarting__Group__1 : rule__ConditionBasedActivationStarting__Group__1__Impl ;
    public final void rule__ConditionBasedActivationStarting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:502:1: ( rule__ConditionBasedActivationStarting__Group__1__Impl )
            // InternalConditionsDsl.g:503:2: rule__ConditionBasedActivationStarting__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBasedActivationStarting__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationStarting__Group__1"


    // $ANTLR start "rule__ConditionBasedActivationStarting__Group__1__Impl"
    // InternalConditionsDsl.g:509:1: rule__ConditionBasedActivationStarting__Group__1__Impl : ( ( rule__ConditionBasedActivationStarting__StartingAssignment_1 )? ) ;
    public final void rule__ConditionBasedActivationStarting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:513:1: ( ( ( rule__ConditionBasedActivationStarting__StartingAssignment_1 )? ) )
            // InternalConditionsDsl.g:514:1: ( ( rule__ConditionBasedActivationStarting__StartingAssignment_1 )? )
            {
            // InternalConditionsDsl.g:514:1: ( ( rule__ConditionBasedActivationStarting__StartingAssignment_1 )? )
            // InternalConditionsDsl.g:515:2: ( rule__ConditionBasedActivationStarting__StartingAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationStartingAccess().getStartingAssignment_1()); 
            }
            // InternalConditionsDsl.g:516:2: ( rule__ConditionBasedActivationStarting__StartingAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConditionsDsl.g:516:3: rule__ConditionBasedActivationStarting__StartingAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionBasedActivationStarting__StartingAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationStartingAccess().getStartingAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationStarting__Group__1__Impl"


    // $ANTLR start "rule__ConditionBasedActivationEnding__Group__0"
    // InternalConditionsDsl.g:525:1: rule__ConditionBasedActivationEnding__Group__0 : rule__ConditionBasedActivationEnding__Group__0__Impl rule__ConditionBasedActivationEnding__Group__1 ;
    public final void rule__ConditionBasedActivationEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:529:1: ( rule__ConditionBasedActivationEnding__Group__0__Impl rule__ConditionBasedActivationEnding__Group__1 )
            // InternalConditionsDsl.g:530:2: rule__ConditionBasedActivationEnding__Group__0__Impl rule__ConditionBasedActivationEnding__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConditionBasedActivationEnding__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionBasedActivationEnding__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationEnding__Group__0"


    // $ANTLR start "rule__ConditionBasedActivationEnding__Group__0__Impl"
    // InternalConditionsDsl.g:537:1: rule__ConditionBasedActivationEnding__Group__0__Impl : ( () ) ;
    public final void rule__ConditionBasedActivationEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:541:1: ( ( () ) )
            // InternalConditionsDsl.g:542:1: ( () )
            {
            // InternalConditionsDsl.g:542:1: ( () )
            // InternalConditionsDsl.g:543:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationEndingAccess().getConditionBasedActivationAction_0()); 
            }
            // InternalConditionsDsl.g:544:2: ()
            // InternalConditionsDsl.g:544:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationEndingAccess().getConditionBasedActivationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationEnding__Group__0__Impl"


    // $ANTLR start "rule__ConditionBasedActivationEnding__Group__1"
    // InternalConditionsDsl.g:552:1: rule__ConditionBasedActivationEnding__Group__1 : rule__ConditionBasedActivationEnding__Group__1__Impl ;
    public final void rule__ConditionBasedActivationEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:556:1: ( rule__ConditionBasedActivationEnding__Group__1__Impl )
            // InternalConditionsDsl.g:557:2: rule__ConditionBasedActivationEnding__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBasedActivationEnding__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationEnding__Group__1"


    // $ANTLR start "rule__ConditionBasedActivationEnding__Group__1__Impl"
    // InternalConditionsDsl.g:563:1: rule__ConditionBasedActivationEnding__Group__1__Impl : ( ( rule__ConditionBasedActivationEnding__EndingAssignment_1 )? ) ;
    public final void rule__ConditionBasedActivationEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:567:1: ( ( ( rule__ConditionBasedActivationEnding__EndingAssignment_1 )? ) )
            // InternalConditionsDsl.g:568:1: ( ( rule__ConditionBasedActivationEnding__EndingAssignment_1 )? )
            {
            // InternalConditionsDsl.g:568:1: ( ( rule__ConditionBasedActivationEnding__EndingAssignment_1 )? )
            // InternalConditionsDsl.g:569:2: ( rule__ConditionBasedActivationEnding__EndingAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationEndingAccess().getEndingAssignment_1()); 
            }
            // InternalConditionsDsl.g:570:2: ( rule__ConditionBasedActivationEnding__EndingAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConditionsDsl.g:570:3: rule__ConditionBasedActivationEnding__EndingAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionBasedActivationEnding__EndingAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationEndingAccess().getEndingAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationEnding__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalConditionsDsl.g:579:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:583:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalConditionsDsl.g:584:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalConditionsDsl.g:591:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:595:1: ( ( () ) )
            // InternalConditionsDsl.g:596:1: ( () )
            {
            // InternalConditionsDsl.g:596:1: ( () )
            // InternalConditionsDsl.g:597:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }
            // InternalConditionsDsl.g:598:2: ()
            // InternalConditionsDsl.g:598:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalConditionsDsl.g:606:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:610:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalConditionsDsl.g:611:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalConditionsDsl.g:618:1: rule__Condition__Group__1__Impl : ( '[' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:622:1: ( ( '[' ) )
            // InternalConditionsDsl.g:623:1: ( '[' )
            {
            // InternalConditionsDsl.g:623:1: ( '[' )
            // InternalConditionsDsl.g:624:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalConditionsDsl.g:633:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:637:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalConditionsDsl.g:638:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalConditionsDsl.g:645:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__CAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:649:1: ( ( ( rule__Condition__CAssignment_2 )? ) )
            // InternalConditionsDsl.g:650:1: ( ( rule__Condition__CAssignment_2 )? )
            {
            // InternalConditionsDsl.g:650:1: ( ( rule__Condition__CAssignment_2 )? )
            // InternalConditionsDsl.g:651:2: ( rule__Condition__CAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCAssignment_2()); 
            }
            // InternalConditionsDsl.g:652:2: ( rule__Condition__CAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18||LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConditionsDsl.g:652:3: rule__Condition__CAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__CAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getCAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalConditionsDsl.g:660:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:664:1: ( rule__Condition__Group__3__Impl )
            // InternalConditionsDsl.g:665:2: rule__Condition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalConditionsDsl.g:671:1: rule__Condition__Group__3__Impl : ( ']' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:675:1: ( ( ']' ) )
            // InternalConditionsDsl.g:676:1: ( ']' )
            {
            // InternalConditionsDsl.g:676:1: ( ']' )
            // InternalConditionsDsl.g:677:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__BasicCondition__Group__0"
    // InternalConditionsDsl.g:687:1: rule__BasicCondition__Group__0 : rule__BasicCondition__Group__0__Impl rule__BasicCondition__Group__1 ;
    public final void rule__BasicCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:691:1: ( rule__BasicCondition__Group__0__Impl rule__BasicCondition__Group__1 )
            // InternalConditionsDsl.g:692:2: rule__BasicCondition__Group__0__Impl rule__BasicCondition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BasicCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__0"


    // $ANTLR start "rule__BasicCondition__Group__0__Impl"
    // InternalConditionsDsl.g:699:1: rule__BasicCondition__Group__0__Impl : ( () ) ;
    public final void rule__BasicCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:703:1: ( ( () ) )
            // InternalConditionsDsl.g:704:1: ( () )
            {
            // InternalConditionsDsl.g:704:1: ( () )
            // InternalConditionsDsl.g:705:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getBasicConditionAction_0()); 
            }
            // InternalConditionsDsl.g:706:2: ()
            // InternalConditionsDsl.g:706:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getBasicConditionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__0__Impl"


    // $ANTLR start "rule__BasicCondition__Group__1"
    // InternalConditionsDsl.g:714:1: rule__BasicCondition__Group__1 : rule__BasicCondition__Group__1__Impl rule__BasicCondition__Group__2 ;
    public final void rule__BasicCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:718:1: ( rule__BasicCondition__Group__1__Impl rule__BasicCondition__Group__2 )
            // InternalConditionsDsl.g:719:2: rule__BasicCondition__Group__1__Impl rule__BasicCondition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BasicCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__1"


    // $ANTLR start "rule__BasicCondition__Group__1__Impl"
    // InternalConditionsDsl.g:726:1: rule__BasicCondition__Group__1__Impl : ( '(' ) ;
    public final void rule__BasicCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:730:1: ( ( '(' ) )
            // InternalConditionsDsl.g:731:1: ( '(' )
            {
            // InternalConditionsDsl.g:731:1: ( '(' )
            // InternalConditionsDsl.g:732:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__1__Impl"


    // $ANTLR start "rule__BasicCondition__Group__2"
    // InternalConditionsDsl.g:741:1: rule__BasicCondition__Group__2 : rule__BasicCondition__Group__2__Impl rule__BasicCondition__Group__3 ;
    public final void rule__BasicCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:745:1: ( rule__BasicCondition__Group__2__Impl rule__BasicCondition__Group__3 )
            // InternalConditionsDsl.g:746:2: rule__BasicCondition__Group__2__Impl rule__BasicCondition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__BasicCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__2"


    // $ANTLR start "rule__BasicCondition__Group__2__Impl"
    // InternalConditionsDsl.g:753:1: rule__BasicCondition__Group__2__Impl : ( ( rule__BasicCondition__LeftAssignment_2 )? ) ;
    public final void rule__BasicCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:757:1: ( ( ( rule__BasicCondition__LeftAssignment_2 )? ) )
            // InternalConditionsDsl.g:758:1: ( ( rule__BasicCondition__LeftAssignment_2 )? )
            {
            // InternalConditionsDsl.g:758:1: ( ( rule__BasicCondition__LeftAssignment_2 )? )
            // InternalConditionsDsl.g:759:2: ( rule__BasicCondition__LeftAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getLeftAssignment_2()); 
            }
            // InternalConditionsDsl.g:760:2: ( rule__BasicCondition__LeftAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConditionsDsl.g:760:3: rule__BasicCondition__LeftAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicCondition__LeftAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getLeftAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__2__Impl"


    // $ANTLR start "rule__BasicCondition__Group__3"
    // InternalConditionsDsl.g:768:1: rule__BasicCondition__Group__3 : rule__BasicCondition__Group__3__Impl rule__BasicCondition__Group__4 ;
    public final void rule__BasicCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:772:1: ( rule__BasicCondition__Group__3__Impl rule__BasicCondition__Group__4 )
            // InternalConditionsDsl.g:773:2: rule__BasicCondition__Group__3__Impl rule__BasicCondition__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__BasicCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicCondition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__3"


    // $ANTLR start "rule__BasicCondition__Group__3__Impl"
    // InternalConditionsDsl.g:780:1: rule__BasicCondition__Group__3__Impl : ( ( rule__BasicCondition__BincompAssignment_3 ) ) ;
    public final void rule__BasicCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:784:1: ( ( ( rule__BasicCondition__BincompAssignment_3 ) ) )
            // InternalConditionsDsl.g:785:1: ( ( rule__BasicCondition__BincompAssignment_3 ) )
            {
            // InternalConditionsDsl.g:785:1: ( ( rule__BasicCondition__BincompAssignment_3 ) )
            // InternalConditionsDsl.g:786:2: ( rule__BasicCondition__BincompAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getBincompAssignment_3()); 
            }
            // InternalConditionsDsl.g:787:2: ( rule__BasicCondition__BincompAssignment_3 )
            // InternalConditionsDsl.g:787:3: rule__BasicCondition__BincompAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicCondition__BincompAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getBincompAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__3__Impl"


    // $ANTLR start "rule__BasicCondition__Group__4"
    // InternalConditionsDsl.g:795:1: rule__BasicCondition__Group__4 : rule__BasicCondition__Group__4__Impl rule__BasicCondition__Group__5 ;
    public final void rule__BasicCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:799:1: ( rule__BasicCondition__Group__4__Impl rule__BasicCondition__Group__5 )
            // InternalConditionsDsl.g:800:2: rule__BasicCondition__Group__4__Impl rule__BasicCondition__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__BasicCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicCondition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__4"


    // $ANTLR start "rule__BasicCondition__Group__4__Impl"
    // InternalConditionsDsl.g:807:1: rule__BasicCondition__Group__4__Impl : ( ( rule__BasicCondition__RightAssignment_4 )? ) ;
    public final void rule__BasicCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:811:1: ( ( ( rule__BasicCondition__RightAssignment_4 )? ) )
            // InternalConditionsDsl.g:812:1: ( ( rule__BasicCondition__RightAssignment_4 )? )
            {
            // InternalConditionsDsl.g:812:1: ( ( rule__BasicCondition__RightAssignment_4 )? )
            // InternalConditionsDsl.g:813:2: ( rule__BasicCondition__RightAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getRightAssignment_4()); 
            }
            // InternalConditionsDsl.g:814:2: ( rule__BasicCondition__RightAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||(LA10_0>=22 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalConditionsDsl.g:814:3: rule__BasicCondition__RightAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicCondition__RightAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getRightAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__4__Impl"


    // $ANTLR start "rule__BasicCondition__Group__5"
    // InternalConditionsDsl.g:822:1: rule__BasicCondition__Group__5 : rule__BasicCondition__Group__5__Impl ;
    public final void rule__BasicCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:826:1: ( rule__BasicCondition__Group__5__Impl )
            // InternalConditionsDsl.g:827:2: rule__BasicCondition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__5"


    // $ANTLR start "rule__BasicCondition__Group__5__Impl"
    // InternalConditionsDsl.g:833:1: rule__BasicCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__BasicCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:837:1: ( ( ')' ) )
            // InternalConditionsDsl.g:838:1: ( ')' )
            {
            // InternalConditionsDsl.g:838:1: ( ')' )
            // InternalConditionsDsl.g:839:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__Group__5__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__0"
    // InternalConditionsDsl.g:849:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:853:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // InternalConditionsDsl.g:854:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0"


    // $ANTLR start "rule__CompositeCondition__Group__0__Impl"
    // InternalConditionsDsl.g:861:1: rule__CompositeCondition__Group__0__Impl : ( () ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:865:1: ( ( () ) )
            // InternalConditionsDsl.g:866:1: ( () )
            {
            // InternalConditionsDsl.g:866:1: ( () )
            // InternalConditionsDsl.g:867:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositeConditionAction_0()); 
            }
            // InternalConditionsDsl.g:868:2: ()
            // InternalConditionsDsl.g:868:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositeConditionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__1"
    // InternalConditionsDsl.g:876:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:880:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // InternalConditionsDsl.g:881:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1"


    // $ANTLR start "rule__CompositeCondition__Group__1__Impl"
    // InternalConditionsDsl.g:888:1: rule__CompositeCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:892:1: ( ( '{' ) )
            // InternalConditionsDsl.g:893:1: ( '{' )
            {
            // InternalConditionsDsl.g:893:1: ( '{' )
            // InternalConditionsDsl.g:894:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__2"
    // InternalConditionsDsl.g:903:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:907:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // InternalConditionsDsl.g:908:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2"


    // $ANTLR start "rule__CompositeCondition__Group__2__Impl"
    // InternalConditionsDsl.g:915:1: rule__CompositeCondition__Group__2__Impl : ( ( rule__CompositeCondition__LeftAssignment_2 )? ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:919:1: ( ( ( rule__CompositeCondition__LeftAssignment_2 )? ) )
            // InternalConditionsDsl.g:920:1: ( ( rule__CompositeCondition__LeftAssignment_2 )? )
            {
            // InternalConditionsDsl.g:920:1: ( ( rule__CompositeCondition__LeftAssignment_2 )? )
            // InternalConditionsDsl.g:921:2: ( rule__CompositeCondition__LeftAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftAssignment_2()); 
            }
            // InternalConditionsDsl.g:922:2: ( rule__CompositeCondition__LeftAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18||LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConditionsDsl.g:922:3: rule__CompositeCondition__LeftAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeCondition__LeftAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getLeftAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__3"
    // InternalConditionsDsl.g:930:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:934:1: ( rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 )
            // InternalConditionsDsl.g:935:2: rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CompositeCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3"


    // $ANTLR start "rule__CompositeCondition__Group__3__Impl"
    // InternalConditionsDsl.g:942:1: rule__CompositeCondition__Group__3__Impl : ( ( rule__CompositeCondition__BinopAssignment_3 ) ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:946:1: ( ( ( rule__CompositeCondition__BinopAssignment_3 ) ) )
            // InternalConditionsDsl.g:947:1: ( ( rule__CompositeCondition__BinopAssignment_3 ) )
            {
            // InternalConditionsDsl.g:947:1: ( ( rule__CompositeCondition__BinopAssignment_3 ) )
            // InternalConditionsDsl.g:948:2: ( rule__CompositeCondition__BinopAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getBinopAssignment_3()); 
            }
            // InternalConditionsDsl.g:949:2: ( rule__CompositeCondition__BinopAssignment_3 )
            // InternalConditionsDsl.g:949:3: rule__CompositeCondition__BinopAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__BinopAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getBinopAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__4"
    // InternalConditionsDsl.g:957:1: rule__CompositeCondition__Group__4 : rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 ;
    public final void rule__CompositeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:961:1: ( rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 )
            // InternalConditionsDsl.g:962:2: rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__CompositeCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__4"


    // $ANTLR start "rule__CompositeCondition__Group__4__Impl"
    // InternalConditionsDsl.g:969:1: rule__CompositeCondition__Group__4__Impl : ( ( rule__CompositeCondition__RightAssignment_4 )? ) ;
    public final void rule__CompositeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:973:1: ( ( ( rule__CompositeCondition__RightAssignment_4 )? ) )
            // InternalConditionsDsl.g:974:1: ( ( rule__CompositeCondition__RightAssignment_4 )? )
            {
            // InternalConditionsDsl.g:974:1: ( ( rule__CompositeCondition__RightAssignment_4 )? )
            // InternalConditionsDsl.g:975:2: ( rule__CompositeCondition__RightAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightAssignment_4()); 
            }
            // InternalConditionsDsl.g:976:2: ( rule__CompositeCondition__RightAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18||LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalConditionsDsl.g:976:3: rule__CompositeCondition__RightAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeCondition__RightAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getRightAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__4__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__5"
    // InternalConditionsDsl.g:984:1: rule__CompositeCondition__Group__5 : rule__CompositeCondition__Group__5__Impl ;
    public final void rule__CompositeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:988:1: ( rule__CompositeCondition__Group__5__Impl )
            // InternalConditionsDsl.g:989:2: rule__CompositeCondition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__5"


    // $ANTLR start "rule__CompositeCondition__Group__5__Impl"
    // InternalConditionsDsl.g:995:1: rule__CompositeCondition__Group__5__Impl : ( '}' ) ;
    public final void rule__CompositeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:999:1: ( ( '}' ) )
            // InternalConditionsDsl.g:1000:1: ( '}' )
            {
            // InternalConditionsDsl.g:1000:1: ( '}' )
            // InternalConditionsDsl.g:1001:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__5__Impl"


    // $ANTLR start "rule__ConditionVariable__Group__0"
    // InternalConditionsDsl.g:1011:1: rule__ConditionVariable__Group__0 : rule__ConditionVariable__Group__0__Impl rule__ConditionVariable__Group__1 ;
    public final void rule__ConditionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1015:1: ( rule__ConditionVariable__Group__0__Impl rule__ConditionVariable__Group__1 )
            // InternalConditionsDsl.g:1016:2: rule__ConditionVariable__Group__0__Impl rule__ConditionVariable__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ConditionVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariable__Group__0"


    // $ANTLR start "rule__ConditionVariable__Group__0__Impl"
    // InternalConditionsDsl.g:1023:1: rule__ConditionVariable__Group__0__Impl : ( () ) ;
    public final void rule__ConditionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1027:1: ( ( () ) )
            // InternalConditionsDsl.g:1028:1: ( () )
            {
            // InternalConditionsDsl.g:1028:1: ( () )
            // InternalConditionsDsl.g:1029:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getConditionVariableAction_0()); 
            }
            // InternalConditionsDsl.g:1030:2: ()
            // InternalConditionsDsl.g:1030:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionVariableAccess().getConditionVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariable__Group__0__Impl"


    // $ANTLR start "rule__ConditionVariable__Group__1"
    // InternalConditionsDsl.g:1038:1: rule__ConditionVariable__Group__1 : rule__ConditionVariable__Group__1__Impl rule__ConditionVariable__Group__2 ;
    public final void rule__ConditionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1042:1: ( rule__ConditionVariable__Group__1__Impl rule__ConditionVariable__Group__2 )
            // InternalConditionsDsl.g:1043:2: rule__ConditionVariable__Group__1__Impl rule__ConditionVariable__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ConditionVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariable__Group__1"


    // $ANTLR start "rule__ConditionVariable__Group__1__Impl"
    // InternalConditionsDsl.g:1050:1: rule__ConditionVariable__Group__1__Impl : ( '@' ) ;
    public final void rule__ConditionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1054:1: ( ( '@' ) )
            // InternalConditionsDsl.g:1055:1: ( '@' )
            {
            // InternalConditionsDsl.g:1055:1: ( '@' )
            // InternalConditionsDsl.g:1056:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getCommercialAtKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionVariableAccess().getCommercialAtKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariable__Group__1__Impl"


    // $ANTLR start "rule__ConditionVariable__Group__2"
    // InternalConditionsDsl.g:1065:1: rule__ConditionVariable__Group__2 : rule__ConditionVariable__Group__2__Impl ;
    public final void rule__ConditionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1069:1: ( rule__ConditionVariable__Group__2__Impl )
            // InternalConditionsDsl.g:1070:2: rule__ConditionVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariable__Group__2"


    // $ANTLR start "rule__ConditionVariable__Group__2__Impl"
    // InternalConditionsDsl.g:1076:1: rule__ConditionVariable__Group__2__Impl : ( ( rule__ConditionVariable__MetricAssignment_2 )? ) ;
    public final void rule__ConditionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1080:1: ( ( ( rule__ConditionVariable__MetricAssignment_2 )? ) )
            // InternalConditionsDsl.g:1081:1: ( ( rule__ConditionVariable__MetricAssignment_2 )? )
            {
            // InternalConditionsDsl.g:1081:1: ( ( rule__ConditionVariable__MetricAssignment_2 )? )
            // InternalConditionsDsl.g:1082:2: ( rule__ConditionVariable__MetricAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getMetricAssignment_2()); 
            }
            // InternalConditionsDsl.g:1083:2: ( rule__ConditionVariable__MetricAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalConditionsDsl.g:1083:3: rule__ConditionVariable__MetricAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionVariable__MetricAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionVariableAccess().getMetricAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariable__Group__2__Impl"


    // $ANTLR start "rule__ConditionInteger__Group__0"
    // InternalConditionsDsl.g:1092:1: rule__ConditionInteger__Group__0 : rule__ConditionInteger__Group__0__Impl rule__ConditionInteger__Group__1 ;
    public final void rule__ConditionInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1096:1: ( rule__ConditionInteger__Group__0__Impl rule__ConditionInteger__Group__1 )
            // InternalConditionsDsl.g:1097:2: rule__ConditionInteger__Group__0__Impl rule__ConditionInteger__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ConditionInteger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionInteger__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionInteger__Group__0"


    // $ANTLR start "rule__ConditionInteger__Group__0__Impl"
    // InternalConditionsDsl.g:1104:1: rule__ConditionInteger__Group__0__Impl : ( () ) ;
    public final void rule__ConditionInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1108:1: ( ( () ) )
            // InternalConditionsDsl.g:1109:1: ( () )
            {
            // InternalConditionsDsl.g:1109:1: ( () )
            // InternalConditionsDsl.g:1110:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionIntegerAccess().getConditionIntegerAction_0()); 
            }
            // InternalConditionsDsl.g:1111:2: ()
            // InternalConditionsDsl.g:1111:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionIntegerAccess().getConditionIntegerAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionInteger__Group__0__Impl"


    // $ANTLR start "rule__ConditionInteger__Group__1"
    // InternalConditionsDsl.g:1119:1: rule__ConditionInteger__Group__1 : rule__ConditionInteger__Group__1__Impl ;
    public final void rule__ConditionInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1123:1: ( rule__ConditionInteger__Group__1__Impl )
            // InternalConditionsDsl.g:1124:2: rule__ConditionInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionInteger__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionInteger__Group__1"


    // $ANTLR start "rule__ConditionInteger__Group__1__Impl"
    // InternalConditionsDsl.g:1130:1: rule__ConditionInteger__Group__1__Impl : ( ( rule__ConditionInteger__ValueAssignment_1 ) ) ;
    public final void rule__ConditionInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1134:1: ( ( ( rule__ConditionInteger__ValueAssignment_1 ) ) )
            // InternalConditionsDsl.g:1135:1: ( ( rule__ConditionInteger__ValueAssignment_1 ) )
            {
            // InternalConditionsDsl.g:1135:1: ( ( rule__ConditionInteger__ValueAssignment_1 ) )
            // InternalConditionsDsl.g:1136:2: ( rule__ConditionInteger__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionIntegerAccess().getValueAssignment_1()); 
            }
            // InternalConditionsDsl.g:1137:2: ( rule__ConditionInteger__ValueAssignment_1 )
            // InternalConditionsDsl.g:1137:3: rule__ConditionInteger__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionInteger__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionIntegerAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionInteger__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalConditionsDsl.g:1146:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1150:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalConditionsDsl.g:1151:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalConditionsDsl.g:1158:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1162:1: ( ( ( '-' )? ) )
            // InternalConditionsDsl.g:1163:1: ( ( '-' )? )
            {
            // InternalConditionsDsl.g:1163:1: ( ( '-' )? )
            // InternalConditionsDsl.g:1164:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalConditionsDsl.g:1165:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalConditionsDsl.g:1165:3: '-'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalConditionsDsl.g:1173:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1177:1: ( rule__EInt__Group__1__Impl )
            // InternalConditionsDsl.g:1178:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalConditionsDsl.g:1184:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1188:1: ( ( RULE_INT ) )
            // InternalConditionsDsl.g:1189:1: ( RULE_INT )
            {
            // InternalConditionsDsl.g:1189:1: ( RULE_INT )
            // InternalConditionsDsl.g:1190:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ConditionBasedActivationStarting__StartingAssignment_1"
    // InternalConditionsDsl.g:1200:1: rule__ConditionBasedActivationStarting__StartingAssignment_1 : ( ruleCondition ) ;
    public final void rule__ConditionBasedActivationStarting__StartingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1204:1: ( ( ruleCondition ) )
            // InternalConditionsDsl.g:1205:2: ( ruleCondition )
            {
            // InternalConditionsDsl.g:1205:2: ( ruleCondition )
            // InternalConditionsDsl.g:1206:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationStartingAccess().getStartingConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationStartingAccess().getStartingConditionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationStarting__StartingAssignment_1"


    // $ANTLR start "rule__ConditionBasedActivationEnding__EndingAssignment_1"
    // InternalConditionsDsl.g:1215:1: rule__ConditionBasedActivationEnding__EndingAssignment_1 : ( ruleCondition ) ;
    public final void rule__ConditionBasedActivationEnding__EndingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1219:1: ( ( ruleCondition ) )
            // InternalConditionsDsl.g:1220:2: ( ruleCondition )
            {
            // InternalConditionsDsl.g:1220:2: ( ruleCondition )
            // InternalConditionsDsl.g:1221:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedActivationEndingAccess().getEndingConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedActivationEndingAccess().getEndingConditionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedActivationEnding__EndingAssignment_1"


    // $ANTLR start "rule__Condition__CAssignment_2"
    // InternalConditionsDsl.g:1230:1: rule__Condition__CAssignment_2 : ( ruleConditionElement ) ;
    public final void rule__Condition__CAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1234:1: ( ( ruleConditionElement ) )
            // InternalConditionsDsl.g:1235:2: ( ruleConditionElement )
            {
            // InternalConditionsDsl.g:1235:2: ( ruleConditionElement )
            // InternalConditionsDsl.g:1236:3: ruleConditionElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCConditionElementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getCConditionElementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__CAssignment_2"


    // $ANTLR start "rule__BasicCondition__LeftAssignment_2"
    // InternalConditionsDsl.g:1245:1: rule__BasicCondition__LeftAssignment_2 : ( ruleConditionVariable ) ;
    public final void rule__BasicCondition__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1249:1: ( ( ruleConditionVariable ) )
            // InternalConditionsDsl.g:1250:2: ( ruleConditionVariable )
            {
            // InternalConditionsDsl.g:1250:2: ( ruleConditionVariable )
            // InternalConditionsDsl.g:1251:3: ruleConditionVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getLeftConditionVariableParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getLeftConditionVariableParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__LeftAssignment_2"


    // $ANTLR start "rule__BasicCondition__BincompAssignment_3"
    // InternalConditionsDsl.g:1260:1: rule__BasicCondition__BincompAssignment_3 : ( ruleBinaryComparisonOperation ) ;
    public final void rule__BasicCondition__BincompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1264:1: ( ( ruleBinaryComparisonOperation ) )
            // InternalConditionsDsl.g:1265:2: ( ruleBinaryComparisonOperation )
            {
            // InternalConditionsDsl.g:1265:2: ( ruleBinaryComparisonOperation )
            // InternalConditionsDsl.g:1266:3: ruleBinaryComparisonOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getBincompBinaryComparisonOperationEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryComparisonOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getBincompBinaryComparisonOperationEnumRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__BincompAssignment_3"


    // $ANTLR start "rule__BasicCondition__RightAssignment_4"
    // InternalConditionsDsl.g:1275:1: rule__BasicCondition__RightAssignment_4 : ( ruleConditionExpr ) ;
    public final void rule__BasicCondition__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1279:1: ( ( ruleConditionExpr ) )
            // InternalConditionsDsl.g:1280:2: ( ruleConditionExpr )
            {
            // InternalConditionsDsl.g:1280:2: ( ruleConditionExpr )
            // InternalConditionsDsl.g:1281:3: ruleConditionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getRightConditionExprParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConditionAccess().getRightConditionExprParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicCondition__RightAssignment_4"


    // $ANTLR start "rule__CompositeCondition__LeftAssignment_2"
    // InternalConditionsDsl.g:1290:1: rule__CompositeCondition__LeftAssignment_2 : ( ruleConditionElement ) ;
    public final void rule__CompositeCondition__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1294:1: ( ( ruleConditionElement ) )
            // InternalConditionsDsl.g:1295:2: ( ruleConditionElement )
            {
            // InternalConditionsDsl.g:1295:2: ( ruleConditionElement )
            // InternalConditionsDsl.g:1296:3: ruleConditionElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftConditionElementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getLeftConditionElementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__LeftAssignment_2"


    // $ANTLR start "rule__CompositeCondition__BinopAssignment_3"
    // InternalConditionsDsl.g:1305:1: rule__CompositeCondition__BinopAssignment_3 : ( ruleBinaryLogicalOperation ) ;
    public final void rule__CompositeCondition__BinopAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1309:1: ( ( ruleBinaryLogicalOperation ) )
            // InternalConditionsDsl.g:1310:2: ( ruleBinaryLogicalOperation )
            {
            // InternalConditionsDsl.g:1310:2: ( ruleBinaryLogicalOperation )
            // InternalConditionsDsl.g:1311:3: ruleBinaryLogicalOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getBinopBinaryLogicalOperationEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryLogicalOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getBinopBinaryLogicalOperationEnumRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__BinopAssignment_3"


    // $ANTLR start "rule__CompositeCondition__RightAssignment_4"
    // InternalConditionsDsl.g:1320:1: rule__CompositeCondition__RightAssignment_4 : ( ruleConditionElement ) ;
    public final void rule__CompositeCondition__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1324:1: ( ( ruleConditionElement ) )
            // InternalConditionsDsl.g:1325:2: ( ruleConditionElement )
            {
            // InternalConditionsDsl.g:1325:2: ( ruleConditionElement )
            // InternalConditionsDsl.g:1326:3: ruleConditionElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightConditionElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConditionElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getRightConditionElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__RightAssignment_4"


    // $ANTLR start "rule__ConditionVariable__MetricAssignment_2"
    // InternalConditionsDsl.g:1335:1: rule__ConditionVariable__MetricAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionVariable__MetricAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1339:1: ( ( ( RULE_ID ) ) )
            // InternalConditionsDsl.g:1340:2: ( ( RULE_ID ) )
            {
            // InternalConditionsDsl.g:1340:2: ( ( RULE_ID ) )
            // InternalConditionsDsl.g:1341:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getMetricMetricCrossReference_2_0()); 
            }
            // InternalConditionsDsl.g:1342:3: ( RULE_ID )
            // InternalConditionsDsl.g:1343:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getMetricMetricIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionVariableAccess().getMetricMetricIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionVariableAccess().getMetricMetricCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariable__MetricAssignment_2"


    // $ANTLR start "rule__ConditionInteger__ValueAssignment_1"
    // InternalConditionsDsl.g:1354:1: rule__ConditionInteger__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__ConditionInteger__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1358:1: ( ( ruleEInt ) )
            // InternalConditionsDsl.g:1359:2: ( ruleEInt )
            {
            // InternalConditionsDsl.g:1359:2: ( ruleEInt )
            // InternalConditionsDsl.g:1360:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionIntegerAccess().getValueEIntParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionIntegerAccess().getValueEIntParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionInteger__ValueAssignment_1"

    // $ANTLR start synpred1_InternalConditionsDsl
    public final void synpred1_InternalConditionsDsl_fragment() throws RecognitionException {   
        // InternalConditionsDsl.g:365:2: ( ( ruleConditionBasedActivationStarting ) )
        // InternalConditionsDsl.g:365:2: ( ruleConditionBasedActivationStarting )
        {
        // InternalConditionsDsl.g:365:2: ( ruleConditionBasedActivationStarting )
        // InternalConditionsDsl.g:366:3: ruleConditionBasedActivationStarting
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMainRulesAccess().getConditionBasedActivationStartingParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleConditionBasedActivationStarting();

        state._fsp--;
        if (state.failed) return ;

        }


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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000403800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C80010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000014C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800010L});

}