package sesame.conditionBasedTimeLimited.startingExpression.ide.contentassist.antlr.internal;

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
import sesame.conditionBasedTimeLimited.startingExpression.services.ConditionsDslGrammarAccess;



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



    // $ANTLR start "entryRuleConditionBasedTimeLimited"
    // InternalConditionsDsl.g:54:1: entryRuleConditionBasedTimeLimited : ruleConditionBasedTimeLimited EOF ;
    public final void entryRuleConditionBasedTimeLimited() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:55:1: ( ruleConditionBasedTimeLimited EOF )
            // InternalConditionsDsl.g:56:1: ruleConditionBasedTimeLimited EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedTimeLimitedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionBasedTimeLimited();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedTimeLimitedRule()); 
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
    // $ANTLR end "entryRuleConditionBasedTimeLimited"


    // $ANTLR start "ruleConditionBasedTimeLimited"
    // InternalConditionsDsl.g:63:1: ruleConditionBasedTimeLimited : ( ( rule__ConditionBasedTimeLimited__Group__0 ) ) ;
    public final void ruleConditionBasedTimeLimited() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:67:2: ( ( ( rule__ConditionBasedTimeLimited__Group__0 ) ) )
            // InternalConditionsDsl.g:68:2: ( ( rule__ConditionBasedTimeLimited__Group__0 ) )
            {
            // InternalConditionsDsl.g:68:2: ( ( rule__ConditionBasedTimeLimited__Group__0 ) )
            // InternalConditionsDsl.g:69:3: ( rule__ConditionBasedTimeLimited__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedTimeLimitedAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:70:3: ( rule__ConditionBasedTimeLimited__Group__0 )
            // InternalConditionsDsl.g:70:4: rule__ConditionBasedTimeLimited__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBasedTimeLimited__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedTimeLimitedAccess().getGroup()); 
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
    // $ANTLR end "ruleConditionBasedTimeLimited"


    // $ANTLR start "entryRuleCondition"
    // InternalConditionsDsl.g:79:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:80:1: ( ruleCondition EOF )
            // InternalConditionsDsl.g:81:1: ruleCondition EOF
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
    // InternalConditionsDsl.g:88:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:92:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalConditionsDsl.g:93:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalConditionsDsl.g:93:2: ( ( rule__Condition__Group__0 ) )
            // InternalConditionsDsl.g:94:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:95:3: ( rule__Condition__Group__0 )
            // InternalConditionsDsl.g:95:4: rule__Condition__Group__0
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
    // InternalConditionsDsl.g:104:1: entryRuleConditionElement : ruleConditionElement EOF ;
    public final void entryRuleConditionElement() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:105:1: ( ruleConditionElement EOF )
            // InternalConditionsDsl.g:106:1: ruleConditionElement EOF
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
    // InternalConditionsDsl.g:113:1: ruleConditionElement : ( ( rule__ConditionElement__Alternatives ) ) ;
    public final void ruleConditionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:117:2: ( ( ( rule__ConditionElement__Alternatives ) ) )
            // InternalConditionsDsl.g:118:2: ( ( rule__ConditionElement__Alternatives ) )
            {
            // InternalConditionsDsl.g:118:2: ( ( rule__ConditionElement__Alternatives ) )
            // InternalConditionsDsl.g:119:3: ( rule__ConditionElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionElementAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:120:3: ( rule__ConditionElement__Alternatives )
            // InternalConditionsDsl.g:120:4: rule__ConditionElement__Alternatives
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
    // InternalConditionsDsl.g:129:1: entryRuleBasicCondition : ruleBasicCondition EOF ;
    public final void entryRuleBasicCondition() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:130:1: ( ruleBasicCondition EOF )
            // InternalConditionsDsl.g:131:1: ruleBasicCondition EOF
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
    // InternalConditionsDsl.g:138:1: ruleBasicCondition : ( ( rule__BasicCondition__Group__0 ) ) ;
    public final void ruleBasicCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:142:2: ( ( ( rule__BasicCondition__Group__0 ) ) )
            // InternalConditionsDsl.g:143:2: ( ( rule__BasicCondition__Group__0 ) )
            {
            // InternalConditionsDsl.g:143:2: ( ( rule__BasicCondition__Group__0 ) )
            // InternalConditionsDsl.g:144:3: ( rule__BasicCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:145:3: ( rule__BasicCondition__Group__0 )
            // InternalConditionsDsl.g:145:4: rule__BasicCondition__Group__0
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
    // InternalConditionsDsl.g:154:1: entryRuleCompositeCondition : ruleCompositeCondition EOF ;
    public final void entryRuleCompositeCondition() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:155:1: ( ruleCompositeCondition EOF )
            // InternalConditionsDsl.g:156:1: ruleCompositeCondition EOF
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
    // InternalConditionsDsl.g:163:1: ruleCompositeCondition : ( ( rule__CompositeCondition__Group__0 ) ) ;
    public final void ruleCompositeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:167:2: ( ( ( rule__CompositeCondition__Group__0 ) ) )
            // InternalConditionsDsl.g:168:2: ( ( rule__CompositeCondition__Group__0 ) )
            {
            // InternalConditionsDsl.g:168:2: ( ( rule__CompositeCondition__Group__0 ) )
            // InternalConditionsDsl.g:169:3: ( rule__CompositeCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:170:3: ( rule__CompositeCondition__Group__0 )
            // InternalConditionsDsl.g:170:4: rule__CompositeCondition__Group__0
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
    // InternalConditionsDsl.g:179:1: entryRuleConditionExpr : ruleConditionExpr EOF ;
    public final void entryRuleConditionExpr() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:180:1: ( ruleConditionExpr EOF )
            // InternalConditionsDsl.g:181:1: ruleConditionExpr EOF
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
    // InternalConditionsDsl.g:188:1: ruleConditionExpr : ( ( rule__ConditionExpr__Alternatives ) ) ;
    public final void ruleConditionExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:192:2: ( ( ( rule__ConditionExpr__Alternatives ) ) )
            // InternalConditionsDsl.g:193:2: ( ( rule__ConditionExpr__Alternatives ) )
            {
            // InternalConditionsDsl.g:193:2: ( ( rule__ConditionExpr__Alternatives ) )
            // InternalConditionsDsl.g:194:3: ( rule__ConditionExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionExprAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:195:3: ( rule__ConditionExpr__Alternatives )
            // InternalConditionsDsl.g:195:4: rule__ConditionExpr__Alternatives
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
    // InternalConditionsDsl.g:204:1: entryRuleConditionVariable : ruleConditionVariable EOF ;
    public final void entryRuleConditionVariable() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:205:1: ( ruleConditionVariable EOF )
            // InternalConditionsDsl.g:206:1: ruleConditionVariable EOF
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
    // InternalConditionsDsl.g:213:1: ruleConditionVariable : ( ( rule__ConditionVariable__Group__0 ) ) ;
    public final void ruleConditionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:217:2: ( ( ( rule__ConditionVariable__Group__0 ) ) )
            // InternalConditionsDsl.g:218:2: ( ( rule__ConditionVariable__Group__0 ) )
            {
            // InternalConditionsDsl.g:218:2: ( ( rule__ConditionVariable__Group__0 ) )
            // InternalConditionsDsl.g:219:3: ( rule__ConditionVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:220:3: ( rule__ConditionVariable__Group__0 )
            // InternalConditionsDsl.g:220:4: rule__ConditionVariable__Group__0
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
    // InternalConditionsDsl.g:229:1: entryRuleConditionInteger : ruleConditionInteger EOF ;
    public final void entryRuleConditionInteger() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:230:1: ( ruleConditionInteger EOF )
            // InternalConditionsDsl.g:231:1: ruleConditionInteger EOF
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
    // InternalConditionsDsl.g:238:1: ruleConditionInteger : ( ( rule__ConditionInteger__Group__0 ) ) ;
    public final void ruleConditionInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:242:2: ( ( ( rule__ConditionInteger__Group__0 ) ) )
            // InternalConditionsDsl.g:243:2: ( ( rule__ConditionInteger__Group__0 ) )
            {
            // InternalConditionsDsl.g:243:2: ( ( rule__ConditionInteger__Group__0 ) )
            // InternalConditionsDsl.g:244:3: ( rule__ConditionInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionIntegerAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:245:3: ( rule__ConditionInteger__Group__0 )
            // InternalConditionsDsl.g:245:4: rule__ConditionInteger__Group__0
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
    // InternalConditionsDsl.g:254:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalConditionsDsl.g:255:1: ( ruleEInt EOF )
            // InternalConditionsDsl.g:256:1: ruleEInt EOF
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
    // InternalConditionsDsl.g:263:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:267:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalConditionsDsl.g:268:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalConditionsDsl.g:268:2: ( ( rule__EInt__Group__0 ) )
            // InternalConditionsDsl.g:269:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalConditionsDsl.g:270:3: ( rule__EInt__Group__0 )
            // InternalConditionsDsl.g:270:4: rule__EInt__Group__0
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
    // InternalConditionsDsl.g:279:1: ruleBinaryComparisonOperation : ( ( rule__BinaryComparisonOperation__Alternatives ) ) ;
    public final void ruleBinaryComparisonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:283:1: ( ( ( rule__BinaryComparisonOperation__Alternatives ) ) )
            // InternalConditionsDsl.g:284:2: ( ( rule__BinaryComparisonOperation__Alternatives ) )
            {
            // InternalConditionsDsl.g:284:2: ( ( rule__BinaryComparisonOperation__Alternatives ) )
            // InternalConditionsDsl.g:285:3: ( rule__BinaryComparisonOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryComparisonOperationAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:286:3: ( rule__BinaryComparisonOperation__Alternatives )
            // InternalConditionsDsl.g:286:4: rule__BinaryComparisonOperation__Alternatives
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
    // InternalConditionsDsl.g:295:1: ruleBinaryLogicalOperation : ( ( rule__BinaryLogicalOperation__Alternatives ) ) ;
    public final void ruleBinaryLogicalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:299:1: ( ( ( rule__BinaryLogicalOperation__Alternatives ) ) )
            // InternalConditionsDsl.g:300:2: ( ( rule__BinaryLogicalOperation__Alternatives ) )
            {
            // InternalConditionsDsl.g:300:2: ( ( rule__BinaryLogicalOperation__Alternatives ) )
            // InternalConditionsDsl.g:301:3: ( rule__BinaryLogicalOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicalOperationAccess().getAlternatives()); 
            }
            // InternalConditionsDsl.g:302:3: ( rule__BinaryLogicalOperation__Alternatives )
            // InternalConditionsDsl.g:302:4: rule__BinaryLogicalOperation__Alternatives
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


    // $ANTLR start "rule__ConditionElement__Alternatives"
    // InternalConditionsDsl.g:310:1: rule__ConditionElement__Alternatives : ( ( ruleCompositeCondition ) | ( ruleBasicCondition ) );
    public final void rule__ConditionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:314:1: ( ( ruleCompositeCondition ) | ( ruleBasicCondition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalConditionsDsl.g:315:2: ( ruleCompositeCondition )
                    {
                    // InternalConditionsDsl.g:315:2: ( ruleCompositeCondition )
                    // InternalConditionsDsl.g:316:3: ruleCompositeCondition
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
                    // InternalConditionsDsl.g:321:2: ( ruleBasicCondition )
                    {
                    // InternalConditionsDsl.g:321:2: ( ruleBasicCondition )
                    // InternalConditionsDsl.g:322:3: ruleBasicCondition
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
    // InternalConditionsDsl.g:331:1: rule__ConditionExpr__Alternatives : ( ( ruleConditionInteger ) | ( ruleConditionVariable ) );
    public final void rule__ConditionExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:335:1: ( ( ruleConditionInteger ) | ( ruleConditionVariable ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
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
                    // InternalConditionsDsl.g:336:2: ( ruleConditionInteger )
                    {
                    // InternalConditionsDsl.g:336:2: ( ruleConditionInteger )
                    // InternalConditionsDsl.g:337:3: ruleConditionInteger
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
                    // InternalConditionsDsl.g:342:2: ( ruleConditionVariable )
                    {
                    // InternalConditionsDsl.g:342:2: ( ruleConditionVariable )
                    // InternalConditionsDsl.g:343:3: ruleConditionVariable
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
    // InternalConditionsDsl.g:352:1: rule__BinaryComparisonOperation__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) );
    public final void rule__BinaryComparisonOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:356:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalConditionsDsl.g:357:2: ( ( '<' ) )
                    {
                    // InternalConditionsDsl.g:357:2: ( ( '<' ) )
                    // InternalConditionsDsl.g:358:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryComparisonOperationAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    }
                    // InternalConditionsDsl.g:359:3: ( '<' )
                    // InternalConditionsDsl.g:359:4: '<'
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
                    // InternalConditionsDsl.g:363:2: ( ( '>' ) )
                    {
                    // InternalConditionsDsl.g:363:2: ( ( '>' ) )
                    // InternalConditionsDsl.g:364:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryComparisonOperationAccess().getGREATER_THANEnumLiteralDeclaration_1()); 
                    }
                    // InternalConditionsDsl.g:365:3: ( '>' )
                    // InternalConditionsDsl.g:365:4: '>'
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
                    // InternalConditionsDsl.g:369:2: ( ( '=' ) )
                    {
                    // InternalConditionsDsl.g:369:2: ( ( '=' ) )
                    // InternalConditionsDsl.g:370:3: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryComparisonOperationAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    }
                    // InternalConditionsDsl.g:371:3: ( '=' )
                    // InternalConditionsDsl.g:371:4: '='
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
    // InternalConditionsDsl.g:379:1: rule__BinaryLogicalOperation__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryLogicalOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:383:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalConditionsDsl.g:384:2: ( ( 'AND' ) )
                    {
                    // InternalConditionsDsl.g:384:2: ( ( 'AND' ) )
                    // InternalConditionsDsl.g:385:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicalOperationAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalConditionsDsl.g:386:3: ( 'AND' )
                    // InternalConditionsDsl.g:386:4: 'AND'
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
                    // InternalConditionsDsl.g:390:2: ( ( 'OR' ) )
                    {
                    // InternalConditionsDsl.g:390:2: ( ( 'OR' ) )
                    // InternalConditionsDsl.g:391:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicalOperationAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalConditionsDsl.g:392:3: ( 'OR' )
                    // InternalConditionsDsl.g:392:4: 'OR'
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


    // $ANTLR start "rule__ConditionBasedTimeLimited__Group__0"
    // InternalConditionsDsl.g:400:1: rule__ConditionBasedTimeLimited__Group__0 : rule__ConditionBasedTimeLimited__Group__0__Impl rule__ConditionBasedTimeLimited__Group__1 ;
    public final void rule__ConditionBasedTimeLimited__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:404:1: ( rule__ConditionBasedTimeLimited__Group__0__Impl rule__ConditionBasedTimeLimited__Group__1 )
            // InternalConditionsDsl.g:405:2: rule__ConditionBasedTimeLimited__Group__0__Impl rule__ConditionBasedTimeLimited__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConditionBasedTimeLimited__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionBasedTimeLimited__Group__1();

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
    // $ANTLR end "rule__ConditionBasedTimeLimited__Group__0"


    // $ANTLR start "rule__ConditionBasedTimeLimited__Group__0__Impl"
    // InternalConditionsDsl.g:412:1: rule__ConditionBasedTimeLimited__Group__0__Impl : ( () ) ;
    public final void rule__ConditionBasedTimeLimited__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:416:1: ( ( () ) )
            // InternalConditionsDsl.g:417:1: ( () )
            {
            // InternalConditionsDsl.g:417:1: ( () )
            // InternalConditionsDsl.g:418:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedTimeLimitedAccess().getConditionBasedTimeLimitedAction_0()); 
            }
            // InternalConditionsDsl.g:419:2: ()
            // InternalConditionsDsl.g:419:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedTimeLimitedAccess().getConditionBasedTimeLimitedAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBasedTimeLimited__Group__0__Impl"


    // $ANTLR start "rule__ConditionBasedTimeLimited__Group__1"
    // InternalConditionsDsl.g:427:1: rule__ConditionBasedTimeLimited__Group__1 : rule__ConditionBasedTimeLimited__Group__1__Impl ;
    public final void rule__ConditionBasedTimeLimited__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:431:1: ( rule__ConditionBasedTimeLimited__Group__1__Impl )
            // InternalConditionsDsl.g:432:2: rule__ConditionBasedTimeLimited__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBasedTimeLimited__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionBasedTimeLimited__Group__1"


    // $ANTLR start "rule__ConditionBasedTimeLimited__Group__1__Impl"
    // InternalConditionsDsl.g:438:1: rule__ConditionBasedTimeLimited__Group__1__Impl : ( ( rule__ConditionBasedTimeLimited__StartingAssignment_1 )? ) ;
    public final void rule__ConditionBasedTimeLimited__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:442:1: ( ( ( rule__ConditionBasedTimeLimited__StartingAssignment_1 )? ) )
            // InternalConditionsDsl.g:443:1: ( ( rule__ConditionBasedTimeLimited__StartingAssignment_1 )? )
            {
            // InternalConditionsDsl.g:443:1: ( ( rule__ConditionBasedTimeLimited__StartingAssignment_1 )? )
            // InternalConditionsDsl.g:444:2: ( rule__ConditionBasedTimeLimited__StartingAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedTimeLimitedAccess().getStartingAssignment_1()); 
            }
            // InternalConditionsDsl.g:445:2: ( rule__ConditionBasedTimeLimited__StartingAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalConditionsDsl.g:445:3: rule__ConditionBasedTimeLimited__StartingAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionBasedTimeLimited__StartingAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedTimeLimitedAccess().getStartingAssignment_1()); 
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
    // $ANTLR end "rule__ConditionBasedTimeLimited__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalConditionsDsl.g:454:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:458:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalConditionsDsl.g:459:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalConditionsDsl.g:466:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:470:1: ( ( () ) )
            // InternalConditionsDsl.g:471:1: ( () )
            {
            // InternalConditionsDsl.g:471:1: ( () )
            // InternalConditionsDsl.g:472:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }
            // InternalConditionsDsl.g:473:2: ()
            // InternalConditionsDsl.g:473:3: 
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
    // InternalConditionsDsl.g:481:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:485:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalConditionsDsl.g:486:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalConditionsDsl.g:493:1: rule__Condition__Group__1__Impl : ( '[' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:497:1: ( ( '[' ) )
            // InternalConditionsDsl.g:498:1: ( '[' )
            {
            // InternalConditionsDsl.g:498:1: ( '[' )
            // InternalConditionsDsl.g:499:2: '['
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
    // InternalConditionsDsl.g:508:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:512:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalConditionsDsl.g:513:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
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
    // InternalConditionsDsl.g:520:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__CAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:524:1: ( ( ( rule__Condition__CAssignment_2 )? ) )
            // InternalConditionsDsl.g:525:1: ( ( rule__Condition__CAssignment_2 )? )
            {
            // InternalConditionsDsl.g:525:1: ( ( rule__Condition__CAssignment_2 )? )
            // InternalConditionsDsl.g:526:2: ( rule__Condition__CAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCAssignment_2()); 
            }
            // InternalConditionsDsl.g:527:2: ( rule__Condition__CAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18||LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConditionsDsl.g:527:3: rule__Condition__CAssignment_2
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
    // InternalConditionsDsl.g:535:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:539:1: ( rule__Condition__Group__3__Impl )
            // InternalConditionsDsl.g:540:2: rule__Condition__Group__3__Impl
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
    // InternalConditionsDsl.g:546:1: rule__Condition__Group__3__Impl : ( ']' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:550:1: ( ( ']' ) )
            // InternalConditionsDsl.g:551:1: ( ']' )
            {
            // InternalConditionsDsl.g:551:1: ( ']' )
            // InternalConditionsDsl.g:552:2: ']'
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
    // InternalConditionsDsl.g:562:1: rule__BasicCondition__Group__0 : rule__BasicCondition__Group__0__Impl rule__BasicCondition__Group__1 ;
    public final void rule__BasicCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:566:1: ( rule__BasicCondition__Group__0__Impl rule__BasicCondition__Group__1 )
            // InternalConditionsDsl.g:567:2: rule__BasicCondition__Group__0__Impl rule__BasicCondition__Group__1
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
    // InternalConditionsDsl.g:574:1: rule__BasicCondition__Group__0__Impl : ( () ) ;
    public final void rule__BasicCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:578:1: ( ( () ) )
            // InternalConditionsDsl.g:579:1: ( () )
            {
            // InternalConditionsDsl.g:579:1: ( () )
            // InternalConditionsDsl.g:580:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getBasicConditionAction_0()); 
            }
            // InternalConditionsDsl.g:581:2: ()
            // InternalConditionsDsl.g:581:3: 
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
    // InternalConditionsDsl.g:589:1: rule__BasicCondition__Group__1 : rule__BasicCondition__Group__1__Impl rule__BasicCondition__Group__2 ;
    public final void rule__BasicCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:593:1: ( rule__BasicCondition__Group__1__Impl rule__BasicCondition__Group__2 )
            // InternalConditionsDsl.g:594:2: rule__BasicCondition__Group__1__Impl rule__BasicCondition__Group__2
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
    // InternalConditionsDsl.g:601:1: rule__BasicCondition__Group__1__Impl : ( '(' ) ;
    public final void rule__BasicCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:605:1: ( ( '(' ) )
            // InternalConditionsDsl.g:606:1: ( '(' )
            {
            // InternalConditionsDsl.g:606:1: ( '(' )
            // InternalConditionsDsl.g:607:2: '('
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
    // InternalConditionsDsl.g:616:1: rule__BasicCondition__Group__2 : rule__BasicCondition__Group__2__Impl rule__BasicCondition__Group__3 ;
    public final void rule__BasicCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:620:1: ( rule__BasicCondition__Group__2__Impl rule__BasicCondition__Group__3 )
            // InternalConditionsDsl.g:621:2: rule__BasicCondition__Group__2__Impl rule__BasicCondition__Group__3
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
    // InternalConditionsDsl.g:628:1: rule__BasicCondition__Group__2__Impl : ( ( rule__BasicCondition__LeftAssignment_2 )? ) ;
    public final void rule__BasicCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:632:1: ( ( ( rule__BasicCondition__LeftAssignment_2 )? ) )
            // InternalConditionsDsl.g:633:1: ( ( rule__BasicCondition__LeftAssignment_2 )? )
            {
            // InternalConditionsDsl.g:633:1: ( ( rule__BasicCondition__LeftAssignment_2 )? )
            // InternalConditionsDsl.g:634:2: ( rule__BasicCondition__LeftAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getLeftAssignment_2()); 
            }
            // InternalConditionsDsl.g:635:2: ( rule__BasicCondition__LeftAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConditionsDsl.g:635:3: rule__BasicCondition__LeftAssignment_2
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
    // InternalConditionsDsl.g:643:1: rule__BasicCondition__Group__3 : rule__BasicCondition__Group__3__Impl rule__BasicCondition__Group__4 ;
    public final void rule__BasicCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:647:1: ( rule__BasicCondition__Group__3__Impl rule__BasicCondition__Group__4 )
            // InternalConditionsDsl.g:648:2: rule__BasicCondition__Group__3__Impl rule__BasicCondition__Group__4
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
    // InternalConditionsDsl.g:655:1: rule__BasicCondition__Group__3__Impl : ( ( rule__BasicCondition__BincompAssignment_3 ) ) ;
    public final void rule__BasicCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:659:1: ( ( ( rule__BasicCondition__BincompAssignment_3 ) ) )
            // InternalConditionsDsl.g:660:1: ( ( rule__BasicCondition__BincompAssignment_3 ) )
            {
            // InternalConditionsDsl.g:660:1: ( ( rule__BasicCondition__BincompAssignment_3 ) )
            // InternalConditionsDsl.g:661:2: ( rule__BasicCondition__BincompAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getBincompAssignment_3()); 
            }
            // InternalConditionsDsl.g:662:2: ( rule__BasicCondition__BincompAssignment_3 )
            // InternalConditionsDsl.g:662:3: rule__BasicCondition__BincompAssignment_3
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
    // InternalConditionsDsl.g:670:1: rule__BasicCondition__Group__4 : rule__BasicCondition__Group__4__Impl rule__BasicCondition__Group__5 ;
    public final void rule__BasicCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:674:1: ( rule__BasicCondition__Group__4__Impl rule__BasicCondition__Group__5 )
            // InternalConditionsDsl.g:675:2: rule__BasicCondition__Group__4__Impl rule__BasicCondition__Group__5
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
    // InternalConditionsDsl.g:682:1: rule__BasicCondition__Group__4__Impl : ( ( rule__BasicCondition__RightAssignment_4 )? ) ;
    public final void rule__BasicCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:686:1: ( ( ( rule__BasicCondition__RightAssignment_4 )? ) )
            // InternalConditionsDsl.g:687:1: ( ( rule__BasicCondition__RightAssignment_4 )? )
            {
            // InternalConditionsDsl.g:687:1: ( ( rule__BasicCondition__RightAssignment_4 )? )
            // InternalConditionsDsl.g:688:2: ( rule__BasicCondition__RightAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConditionAccess().getRightAssignment_4()); 
            }
            // InternalConditionsDsl.g:689:2: ( rule__BasicCondition__RightAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||(LA8_0>=22 && LA8_0<=23)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConditionsDsl.g:689:3: rule__BasicCondition__RightAssignment_4
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
    // InternalConditionsDsl.g:697:1: rule__BasicCondition__Group__5 : rule__BasicCondition__Group__5__Impl ;
    public final void rule__BasicCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:701:1: ( rule__BasicCondition__Group__5__Impl )
            // InternalConditionsDsl.g:702:2: rule__BasicCondition__Group__5__Impl
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
    // InternalConditionsDsl.g:708:1: rule__BasicCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__BasicCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:712:1: ( ( ')' ) )
            // InternalConditionsDsl.g:713:1: ( ')' )
            {
            // InternalConditionsDsl.g:713:1: ( ')' )
            // InternalConditionsDsl.g:714:2: ')'
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
    // InternalConditionsDsl.g:724:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:728:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // InternalConditionsDsl.g:729:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
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
    // InternalConditionsDsl.g:736:1: rule__CompositeCondition__Group__0__Impl : ( () ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:740:1: ( ( () ) )
            // InternalConditionsDsl.g:741:1: ( () )
            {
            // InternalConditionsDsl.g:741:1: ( () )
            // InternalConditionsDsl.g:742:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositeConditionAction_0()); 
            }
            // InternalConditionsDsl.g:743:2: ()
            // InternalConditionsDsl.g:743:3: 
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
    // InternalConditionsDsl.g:751:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:755:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // InternalConditionsDsl.g:756:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
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
    // InternalConditionsDsl.g:763:1: rule__CompositeCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:767:1: ( ( '{' ) )
            // InternalConditionsDsl.g:768:1: ( '{' )
            {
            // InternalConditionsDsl.g:768:1: ( '{' )
            // InternalConditionsDsl.g:769:2: '{'
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
    // InternalConditionsDsl.g:778:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:782:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // InternalConditionsDsl.g:783:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
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
    // InternalConditionsDsl.g:790:1: rule__CompositeCondition__Group__2__Impl : ( ( rule__CompositeCondition__LeftAssignment_2 )? ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:794:1: ( ( ( rule__CompositeCondition__LeftAssignment_2 )? ) )
            // InternalConditionsDsl.g:795:1: ( ( rule__CompositeCondition__LeftAssignment_2 )? )
            {
            // InternalConditionsDsl.g:795:1: ( ( rule__CompositeCondition__LeftAssignment_2 )? )
            // InternalConditionsDsl.g:796:2: ( rule__CompositeCondition__LeftAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftAssignment_2()); 
            }
            // InternalConditionsDsl.g:797:2: ( rule__CompositeCondition__LeftAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18||LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConditionsDsl.g:797:3: rule__CompositeCondition__LeftAssignment_2
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
    // InternalConditionsDsl.g:805:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:809:1: ( rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 )
            // InternalConditionsDsl.g:810:2: rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4
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
    // InternalConditionsDsl.g:817:1: rule__CompositeCondition__Group__3__Impl : ( ( rule__CompositeCondition__BinopAssignment_3 ) ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:821:1: ( ( ( rule__CompositeCondition__BinopAssignment_3 ) ) )
            // InternalConditionsDsl.g:822:1: ( ( rule__CompositeCondition__BinopAssignment_3 ) )
            {
            // InternalConditionsDsl.g:822:1: ( ( rule__CompositeCondition__BinopAssignment_3 ) )
            // InternalConditionsDsl.g:823:2: ( rule__CompositeCondition__BinopAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getBinopAssignment_3()); 
            }
            // InternalConditionsDsl.g:824:2: ( rule__CompositeCondition__BinopAssignment_3 )
            // InternalConditionsDsl.g:824:3: rule__CompositeCondition__BinopAssignment_3
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
    // InternalConditionsDsl.g:832:1: rule__CompositeCondition__Group__4 : rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 ;
    public final void rule__CompositeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:836:1: ( rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 )
            // InternalConditionsDsl.g:837:2: rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5
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
    // InternalConditionsDsl.g:844:1: rule__CompositeCondition__Group__4__Impl : ( ( rule__CompositeCondition__RightAssignment_4 )? ) ;
    public final void rule__CompositeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:848:1: ( ( ( rule__CompositeCondition__RightAssignment_4 )? ) )
            // InternalConditionsDsl.g:849:1: ( ( rule__CompositeCondition__RightAssignment_4 )? )
            {
            // InternalConditionsDsl.g:849:1: ( ( rule__CompositeCondition__RightAssignment_4 )? )
            // InternalConditionsDsl.g:850:2: ( rule__CompositeCondition__RightAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightAssignment_4()); 
            }
            // InternalConditionsDsl.g:851:2: ( rule__CompositeCondition__RightAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18||LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalConditionsDsl.g:851:3: rule__CompositeCondition__RightAssignment_4
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
    // InternalConditionsDsl.g:859:1: rule__CompositeCondition__Group__5 : rule__CompositeCondition__Group__5__Impl ;
    public final void rule__CompositeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:863:1: ( rule__CompositeCondition__Group__5__Impl )
            // InternalConditionsDsl.g:864:2: rule__CompositeCondition__Group__5__Impl
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
    // InternalConditionsDsl.g:870:1: rule__CompositeCondition__Group__5__Impl : ( '}' ) ;
    public final void rule__CompositeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:874:1: ( ( '}' ) )
            // InternalConditionsDsl.g:875:1: ( '}' )
            {
            // InternalConditionsDsl.g:875:1: ( '}' )
            // InternalConditionsDsl.g:876:2: '}'
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
    // InternalConditionsDsl.g:886:1: rule__ConditionVariable__Group__0 : rule__ConditionVariable__Group__0__Impl rule__ConditionVariable__Group__1 ;
    public final void rule__ConditionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:890:1: ( rule__ConditionVariable__Group__0__Impl rule__ConditionVariable__Group__1 )
            // InternalConditionsDsl.g:891:2: rule__ConditionVariable__Group__0__Impl rule__ConditionVariable__Group__1
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
    // InternalConditionsDsl.g:898:1: rule__ConditionVariable__Group__0__Impl : ( () ) ;
    public final void rule__ConditionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:902:1: ( ( () ) )
            // InternalConditionsDsl.g:903:1: ( () )
            {
            // InternalConditionsDsl.g:903:1: ( () )
            // InternalConditionsDsl.g:904:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getConditionVariableAction_0()); 
            }
            // InternalConditionsDsl.g:905:2: ()
            // InternalConditionsDsl.g:905:3: 
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
    // InternalConditionsDsl.g:913:1: rule__ConditionVariable__Group__1 : rule__ConditionVariable__Group__1__Impl rule__ConditionVariable__Group__2 ;
    public final void rule__ConditionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:917:1: ( rule__ConditionVariable__Group__1__Impl rule__ConditionVariable__Group__2 )
            // InternalConditionsDsl.g:918:2: rule__ConditionVariable__Group__1__Impl rule__ConditionVariable__Group__2
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
    // InternalConditionsDsl.g:925:1: rule__ConditionVariable__Group__1__Impl : ( '@' ) ;
    public final void rule__ConditionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:929:1: ( ( '@' ) )
            // InternalConditionsDsl.g:930:1: ( '@' )
            {
            // InternalConditionsDsl.g:930:1: ( '@' )
            // InternalConditionsDsl.g:931:2: '@'
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
    // InternalConditionsDsl.g:940:1: rule__ConditionVariable__Group__2 : rule__ConditionVariable__Group__2__Impl ;
    public final void rule__ConditionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:944:1: ( rule__ConditionVariable__Group__2__Impl )
            // InternalConditionsDsl.g:945:2: rule__ConditionVariable__Group__2__Impl
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
    // InternalConditionsDsl.g:951:1: rule__ConditionVariable__Group__2__Impl : ( ( rule__ConditionVariable__MetricAssignment_2 )? ) ;
    public final void rule__ConditionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:955:1: ( ( ( rule__ConditionVariable__MetricAssignment_2 )? ) )
            // InternalConditionsDsl.g:956:1: ( ( rule__ConditionVariable__MetricAssignment_2 )? )
            {
            // InternalConditionsDsl.g:956:1: ( ( rule__ConditionVariable__MetricAssignment_2 )? )
            // InternalConditionsDsl.g:957:2: ( rule__ConditionVariable__MetricAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getMetricAssignment_2()); 
            }
            // InternalConditionsDsl.g:958:2: ( rule__ConditionVariable__MetricAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConditionsDsl.g:958:3: rule__ConditionVariable__MetricAssignment_2
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
    // InternalConditionsDsl.g:967:1: rule__ConditionInteger__Group__0 : rule__ConditionInteger__Group__0__Impl rule__ConditionInteger__Group__1 ;
    public final void rule__ConditionInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:971:1: ( rule__ConditionInteger__Group__0__Impl rule__ConditionInteger__Group__1 )
            // InternalConditionsDsl.g:972:2: rule__ConditionInteger__Group__0__Impl rule__ConditionInteger__Group__1
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
    // InternalConditionsDsl.g:979:1: rule__ConditionInteger__Group__0__Impl : ( () ) ;
    public final void rule__ConditionInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:983:1: ( ( () ) )
            // InternalConditionsDsl.g:984:1: ( () )
            {
            // InternalConditionsDsl.g:984:1: ( () )
            // InternalConditionsDsl.g:985:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionIntegerAccess().getConditionIntegerAction_0()); 
            }
            // InternalConditionsDsl.g:986:2: ()
            // InternalConditionsDsl.g:986:3: 
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
    // InternalConditionsDsl.g:994:1: rule__ConditionInteger__Group__1 : rule__ConditionInteger__Group__1__Impl ;
    public final void rule__ConditionInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:998:1: ( rule__ConditionInteger__Group__1__Impl )
            // InternalConditionsDsl.g:999:2: rule__ConditionInteger__Group__1__Impl
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
    // InternalConditionsDsl.g:1005:1: rule__ConditionInteger__Group__1__Impl : ( ( rule__ConditionInteger__ValueAssignment_1 ) ) ;
    public final void rule__ConditionInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1009:1: ( ( ( rule__ConditionInteger__ValueAssignment_1 ) ) )
            // InternalConditionsDsl.g:1010:1: ( ( rule__ConditionInteger__ValueAssignment_1 ) )
            {
            // InternalConditionsDsl.g:1010:1: ( ( rule__ConditionInteger__ValueAssignment_1 ) )
            // InternalConditionsDsl.g:1011:2: ( rule__ConditionInteger__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionIntegerAccess().getValueAssignment_1()); 
            }
            // InternalConditionsDsl.g:1012:2: ( rule__ConditionInteger__ValueAssignment_1 )
            // InternalConditionsDsl.g:1012:3: rule__ConditionInteger__ValueAssignment_1
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
    // InternalConditionsDsl.g:1021:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1025:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalConditionsDsl.g:1026:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalConditionsDsl.g:1033:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1037:1: ( ( ( '-' )? ) )
            // InternalConditionsDsl.g:1038:1: ( ( '-' )? )
            {
            // InternalConditionsDsl.g:1038:1: ( ( '-' )? )
            // InternalConditionsDsl.g:1039:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalConditionsDsl.g:1040:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalConditionsDsl.g:1040:3: '-'
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
    // InternalConditionsDsl.g:1048:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1052:1: ( rule__EInt__Group__1__Impl )
            // InternalConditionsDsl.g:1053:2: rule__EInt__Group__1__Impl
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
    // InternalConditionsDsl.g:1059:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1063:1: ( ( RULE_INT ) )
            // InternalConditionsDsl.g:1064:1: ( RULE_INT )
            {
            // InternalConditionsDsl.g:1064:1: ( RULE_INT )
            // InternalConditionsDsl.g:1065:2: RULE_INT
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


    // $ANTLR start "rule__ConditionBasedTimeLimited__StartingAssignment_1"
    // InternalConditionsDsl.g:1075:1: rule__ConditionBasedTimeLimited__StartingAssignment_1 : ( ruleCondition ) ;
    public final void rule__ConditionBasedTimeLimited__StartingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1079:1: ( ( ruleCondition ) )
            // InternalConditionsDsl.g:1080:2: ( ruleCondition )
            {
            // InternalConditionsDsl.g:1080:2: ( ruleCondition )
            // InternalConditionsDsl.g:1081:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionBasedTimeLimitedAccess().getStartingConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionBasedTimeLimitedAccess().getStartingConditionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ConditionBasedTimeLimited__StartingAssignment_1"


    // $ANTLR start "rule__Condition__CAssignment_2"
    // InternalConditionsDsl.g:1090:1: rule__Condition__CAssignment_2 : ( ruleConditionElement ) ;
    public final void rule__Condition__CAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1094:1: ( ( ruleConditionElement ) )
            // InternalConditionsDsl.g:1095:2: ( ruleConditionElement )
            {
            // InternalConditionsDsl.g:1095:2: ( ruleConditionElement )
            // InternalConditionsDsl.g:1096:3: ruleConditionElement
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
    // InternalConditionsDsl.g:1105:1: rule__BasicCondition__LeftAssignment_2 : ( ruleConditionVariable ) ;
    public final void rule__BasicCondition__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1109:1: ( ( ruleConditionVariable ) )
            // InternalConditionsDsl.g:1110:2: ( ruleConditionVariable )
            {
            // InternalConditionsDsl.g:1110:2: ( ruleConditionVariable )
            // InternalConditionsDsl.g:1111:3: ruleConditionVariable
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
    // InternalConditionsDsl.g:1120:1: rule__BasicCondition__BincompAssignment_3 : ( ruleBinaryComparisonOperation ) ;
    public final void rule__BasicCondition__BincompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1124:1: ( ( ruleBinaryComparisonOperation ) )
            // InternalConditionsDsl.g:1125:2: ( ruleBinaryComparisonOperation )
            {
            // InternalConditionsDsl.g:1125:2: ( ruleBinaryComparisonOperation )
            // InternalConditionsDsl.g:1126:3: ruleBinaryComparisonOperation
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
    // InternalConditionsDsl.g:1135:1: rule__BasicCondition__RightAssignment_4 : ( ruleConditionExpr ) ;
    public final void rule__BasicCondition__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1139:1: ( ( ruleConditionExpr ) )
            // InternalConditionsDsl.g:1140:2: ( ruleConditionExpr )
            {
            // InternalConditionsDsl.g:1140:2: ( ruleConditionExpr )
            // InternalConditionsDsl.g:1141:3: ruleConditionExpr
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
    // InternalConditionsDsl.g:1150:1: rule__CompositeCondition__LeftAssignment_2 : ( ruleConditionElement ) ;
    public final void rule__CompositeCondition__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1154:1: ( ( ruleConditionElement ) )
            // InternalConditionsDsl.g:1155:2: ( ruleConditionElement )
            {
            // InternalConditionsDsl.g:1155:2: ( ruleConditionElement )
            // InternalConditionsDsl.g:1156:3: ruleConditionElement
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
    // InternalConditionsDsl.g:1165:1: rule__CompositeCondition__BinopAssignment_3 : ( ruleBinaryLogicalOperation ) ;
    public final void rule__CompositeCondition__BinopAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1169:1: ( ( ruleBinaryLogicalOperation ) )
            // InternalConditionsDsl.g:1170:2: ( ruleBinaryLogicalOperation )
            {
            // InternalConditionsDsl.g:1170:2: ( ruleBinaryLogicalOperation )
            // InternalConditionsDsl.g:1171:3: ruleBinaryLogicalOperation
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
    // InternalConditionsDsl.g:1180:1: rule__CompositeCondition__RightAssignment_4 : ( ruleConditionElement ) ;
    public final void rule__CompositeCondition__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1184:1: ( ( ruleConditionElement ) )
            // InternalConditionsDsl.g:1185:2: ( ruleConditionElement )
            {
            // InternalConditionsDsl.g:1185:2: ( ruleConditionElement )
            // InternalConditionsDsl.g:1186:3: ruleConditionElement
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
    // InternalConditionsDsl.g:1195:1: rule__ConditionVariable__MetricAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionVariable__MetricAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1199:1: ( ( ( RULE_ID ) ) )
            // InternalConditionsDsl.g:1200:2: ( ( RULE_ID ) )
            {
            // InternalConditionsDsl.g:1200:2: ( ( RULE_ID ) )
            // InternalConditionsDsl.g:1201:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionVariableAccess().getMetricMetricCrossReference_2_0()); 
            }
            // InternalConditionsDsl.g:1202:3: ( RULE_ID )
            // InternalConditionsDsl.g:1203:4: RULE_ID
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
    // InternalConditionsDsl.g:1214:1: rule__ConditionInteger__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__ConditionInteger__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConditionsDsl.g:1218:1: ( ( ruleEInt ) )
            // InternalConditionsDsl.g:1219:2: ( ruleEInt )
            {
            // InternalConditionsDsl.g:1219:2: ( ruleEInt )
            // InternalConditionsDsl.g:1220:3: ruleEInt
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

    // Delegated rules


 

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