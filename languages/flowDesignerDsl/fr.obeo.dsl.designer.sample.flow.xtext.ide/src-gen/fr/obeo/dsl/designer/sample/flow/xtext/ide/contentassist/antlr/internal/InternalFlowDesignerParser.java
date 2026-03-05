package fr.obeo.dsl.designer.sample.flow.xtext.ide.contentassist.antlr.internal;

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
import fr.obeo.dsl.designer.sample.flow.xtext.services.FlowDesignerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowDesignerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_NEWLINE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Temperature'", "'Weight'", "'<'", "'>'", "'=='", "'\\u00B0C'", "'\\u00B0F'", "'kg'", "'lb'", "'LOW'", "'MEDIUM'", "'HIGH'", "'NON_CRITICAL'", "'CRITICAL'", "'BLOCKER'", "'Case'", "'.'", "':'"
    };
    public static final int RULE_NEWLINE=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFlowDesignerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlowDesignerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlowDesignerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFlowDesigner.g"; }


    	private FlowDesignerGrammarAccess grammarAccess;

    	public void setGrammarAccess(FlowDesignerGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMain"
    // InternalFlowDesigner.g:53:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalFlowDesigner.g:54:1: ( ruleMain EOF )
            // InternalFlowDesigner.g:55:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalFlowDesigner.g:62:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:66:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalFlowDesigner.g:67:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalFlowDesigner.g:67:2: ( ( rule__Main__Group__0 ) )
            // InternalFlowDesigner.g:68:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalFlowDesigner.g:69:3: ( rule__Main__Group__0 )
            // InternalFlowDesigner.g:69:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleRoutingRule"
    // InternalFlowDesigner.g:78:1: entryRuleRoutingRule : ruleRoutingRule EOF ;
    public final void entryRuleRoutingRule() throws RecognitionException {
        try {
            // InternalFlowDesigner.g:79:1: ( ruleRoutingRule EOF )
            // InternalFlowDesigner.g:80:1: ruleRoutingRule EOF
            {
             before(grammarAccess.getRoutingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRoutingRule();

            state._fsp--;

             after(grammarAccess.getRoutingRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoutingRule"


    // $ANTLR start "ruleRoutingRule"
    // InternalFlowDesigner.g:87:1: ruleRoutingRule : ( ( rule__RoutingRule__Group__0 ) ) ;
    public final void ruleRoutingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:91:2: ( ( ( rule__RoutingRule__Group__0 ) ) )
            // InternalFlowDesigner.g:92:2: ( ( rule__RoutingRule__Group__0 ) )
            {
            // InternalFlowDesigner.g:92:2: ( ( rule__RoutingRule__Group__0 ) )
            // InternalFlowDesigner.g:93:3: ( rule__RoutingRule__Group__0 )
            {
             before(grammarAccess.getRoutingRuleAccess().getGroup()); 
            // InternalFlowDesigner.g:94:3: ( rule__RoutingRule__Group__0 )
            // InternalFlowDesigner.g:94:4: rule__RoutingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoutingRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRoutingRule"


    // $ANTLR start "entryRuleEInt"
    // InternalFlowDesigner.g:103:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalFlowDesigner.g:104:1: ( ruleEInt EOF )
            // InternalFlowDesigner.g:105:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFlowDesigner.g:112:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:116:2: ( ( RULE_INT ) )
            // InternalFlowDesigner.g:117:2: ( RULE_INT )
            {
            // InternalFlowDesigner.g:117:2: ( RULE_INT )
            // InternalFlowDesigner.g:118:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

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


    // $ANTLR start "ruleSystemProperty"
    // InternalFlowDesigner.g:128:1: ruleSystemProperty : ( ( rule__SystemProperty__Alternatives ) ) ;
    public final void ruleSystemProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:132:1: ( ( ( rule__SystemProperty__Alternatives ) ) )
            // InternalFlowDesigner.g:133:2: ( ( rule__SystemProperty__Alternatives ) )
            {
            // InternalFlowDesigner.g:133:2: ( ( rule__SystemProperty__Alternatives ) )
            // InternalFlowDesigner.g:134:3: ( rule__SystemProperty__Alternatives )
            {
             before(grammarAccess.getSystemPropertyAccess().getAlternatives()); 
            // InternalFlowDesigner.g:135:3: ( rule__SystemProperty__Alternatives )
            // InternalFlowDesigner.g:135:4: rule__SystemProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SystemProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSystemPropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSystemProperty"


    // $ANTLR start "ruleComparisonOperator"
    // InternalFlowDesigner.g:144:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:148:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalFlowDesigner.g:149:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalFlowDesigner.g:149:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalFlowDesigner.g:150:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalFlowDesigner.g:151:3: ( rule__ComparisonOperator__Alternatives )
            // InternalFlowDesigner.g:151:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "rulePropertyUnit"
    // InternalFlowDesigner.g:160:1: rulePropertyUnit : ( ( rule__PropertyUnit__Alternatives ) ) ;
    public final void rulePropertyUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:164:1: ( ( ( rule__PropertyUnit__Alternatives ) ) )
            // InternalFlowDesigner.g:165:2: ( ( rule__PropertyUnit__Alternatives ) )
            {
            // InternalFlowDesigner.g:165:2: ( ( rule__PropertyUnit__Alternatives ) )
            // InternalFlowDesigner.g:166:3: ( rule__PropertyUnit__Alternatives )
            {
             before(grammarAccess.getPropertyUnitAccess().getAlternatives()); 
            // InternalFlowDesigner.g:167:3: ( rule__PropertyUnit__Alternatives )
            // InternalFlowDesigner.g:167:4: rule__PropertyUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyUnitAccess().getAlternatives()); 

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
    // $ANTLR end "rulePropertyUnit"


    // $ANTLR start "ruleSystemStatus"
    // InternalFlowDesigner.g:176:1: ruleSystemStatus : ( ( rule__SystemStatus__Alternatives ) ) ;
    public final void ruleSystemStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:180:1: ( ( ( rule__SystemStatus__Alternatives ) ) )
            // InternalFlowDesigner.g:181:2: ( ( rule__SystemStatus__Alternatives ) )
            {
            // InternalFlowDesigner.g:181:2: ( ( rule__SystemStatus__Alternatives ) )
            // InternalFlowDesigner.g:182:3: ( rule__SystemStatus__Alternatives )
            {
             before(grammarAccess.getSystemStatusAccess().getAlternatives()); 
            // InternalFlowDesigner.g:183:3: ( rule__SystemStatus__Alternatives )
            // InternalFlowDesigner.g:183:4: rule__SystemStatus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SystemStatus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSystemStatusAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSystemStatus"


    // $ANTLR start "rule__SystemProperty__Alternatives"
    // InternalFlowDesigner.g:191:1: rule__SystemProperty__Alternatives : ( ( ( 'Temperature' ) ) | ( ( 'Weight' ) ) );
    public final void rule__SystemProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:195:1: ( ( ( 'Temperature' ) ) | ( ( 'Weight' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFlowDesigner.g:196:2: ( ( 'Temperature' ) )
                    {
                    // InternalFlowDesigner.g:196:2: ( ( 'Temperature' ) )
                    // InternalFlowDesigner.g:197:3: ( 'Temperature' )
                    {
                     before(grammarAccess.getSystemPropertyAccess().getTemperatureEnumLiteralDeclaration_0()); 
                    // InternalFlowDesigner.g:198:3: ( 'Temperature' )
                    // InternalFlowDesigner.g:198:4: 'Temperature'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSystemPropertyAccess().getTemperatureEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowDesigner.g:202:2: ( ( 'Weight' ) )
                    {
                    // InternalFlowDesigner.g:202:2: ( ( 'Weight' ) )
                    // InternalFlowDesigner.g:203:3: ( 'Weight' )
                    {
                     before(grammarAccess.getSystemPropertyAccess().getWeightEnumLiteralDeclaration_1()); 
                    // InternalFlowDesigner.g:204:3: ( 'Weight' )
                    // InternalFlowDesigner.g:204:4: 'Weight'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSystemPropertyAccess().getWeightEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SystemProperty__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalFlowDesigner.g:212:1: rule__ComparisonOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:216:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFlowDesigner.g:217:2: ( ( '<' ) )
                    {
                    // InternalFlowDesigner.g:217:2: ( ( '<' ) )
                    // InternalFlowDesigner.g:218:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLower_thanEnumLiteralDeclaration_0()); 
                    // InternalFlowDesigner.g:219:3: ( '<' )
                    // InternalFlowDesigner.g:219:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLower_thanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowDesigner.g:223:2: ( ( '>' ) )
                    {
                    // InternalFlowDesigner.g:223:2: ( ( '>' ) )
                    // InternalFlowDesigner.g:224:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreather_thanEnumLiteralDeclaration_1()); 
                    // InternalFlowDesigner.g:225:3: ( '>' )
                    // InternalFlowDesigner.g:225:4: '>'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGreather_thanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFlowDesigner.g:229:2: ( ( '==' ) )
                    {
                    // InternalFlowDesigner.g:229:2: ( ( '==' ) )
                    // InternalFlowDesigner.g:230:3: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_2()); 
                    // InternalFlowDesigner.g:231:3: ( '==' )
                    // InternalFlowDesigner.g:231:4: '=='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__PropertyUnit__Alternatives"
    // InternalFlowDesigner.g:239:1: rule__PropertyUnit__Alternatives : ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) | ( ( 'kg' ) ) | ( ( 'lb' ) ) );
    public final void rule__PropertyUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:243:1: ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) | ( ( 'kg' ) ) | ( ( 'lb' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFlowDesigner.g:244:2: ( ( '\\u00B0C' ) )
                    {
                    // InternalFlowDesigner.g:244:2: ( ( '\\u00B0C' ) )
                    // InternalFlowDesigner.g:245:3: ( '\\u00B0C' )
                    {
                     before(grammarAccess.getPropertyUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 
                    // InternalFlowDesigner.g:246:3: ( '\\u00B0C' )
                    // InternalFlowDesigner.g:246:4: '\\u00B0C'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowDesigner.g:250:2: ( ( '\\u00B0F' ) )
                    {
                    // InternalFlowDesigner.g:250:2: ( ( '\\u00B0F' ) )
                    // InternalFlowDesigner.g:251:3: ( '\\u00B0F' )
                    {
                     before(grammarAccess.getPropertyUnitAccess().getFahrenheitEnumLiteralDeclaration_1()); 
                    // InternalFlowDesigner.g:252:3: ( '\\u00B0F' )
                    // InternalFlowDesigner.g:252:4: '\\u00B0F'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyUnitAccess().getFahrenheitEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFlowDesigner.g:256:2: ( ( 'kg' ) )
                    {
                    // InternalFlowDesigner.g:256:2: ( ( 'kg' ) )
                    // InternalFlowDesigner.g:257:3: ( 'kg' )
                    {
                     before(grammarAccess.getPropertyUnitAccess().getKilogramsEnumLiteralDeclaration_2()); 
                    // InternalFlowDesigner.g:258:3: ( 'kg' )
                    // InternalFlowDesigner.g:258:4: 'kg'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyUnitAccess().getKilogramsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFlowDesigner.g:262:2: ( ( 'lb' ) )
                    {
                    // InternalFlowDesigner.g:262:2: ( ( 'lb' ) )
                    // InternalFlowDesigner.g:263:3: ( 'lb' )
                    {
                     before(grammarAccess.getPropertyUnitAccess().getPoundsEnumLiteralDeclaration_3()); 
                    // InternalFlowDesigner.g:264:3: ( 'lb' )
                    // InternalFlowDesigner.g:264:4: 'lb'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyUnitAccess().getPoundsEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__PropertyUnit__Alternatives"


    // $ANTLR start "rule__SystemStatus__Alternatives"
    // InternalFlowDesigner.g:272:1: rule__SystemStatus__Alternatives : ( ( ( 'LOW' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'HIGH' ) ) | ( ( 'NON_CRITICAL' ) ) | ( ( 'CRITICAL' ) ) | ( ( 'BLOCKER' ) ) );
    public final void rule__SystemStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:276:1: ( ( ( 'LOW' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'HIGH' ) ) | ( ( 'NON_CRITICAL' ) ) | ( ( 'CRITICAL' ) ) | ( ( 'BLOCKER' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 25:
                {
                alt4=5;
                }
                break;
            case 26:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFlowDesigner.g:277:2: ( ( 'LOW' ) )
                    {
                    // InternalFlowDesigner.g:277:2: ( ( 'LOW' ) )
                    // InternalFlowDesigner.g:278:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSystemStatusAccess().getLOWEnumLiteralDeclaration_0()); 
                    // InternalFlowDesigner.g:279:3: ( 'LOW' )
                    // InternalFlowDesigner.g:279:4: 'LOW'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getSystemStatusAccess().getLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowDesigner.g:283:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalFlowDesigner.g:283:2: ( ( 'MEDIUM' ) )
                    // InternalFlowDesigner.g:284:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getSystemStatusAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalFlowDesigner.g:285:3: ( 'MEDIUM' )
                    // InternalFlowDesigner.g:285:4: 'MEDIUM'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getSystemStatusAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFlowDesigner.g:289:2: ( ( 'HIGH' ) )
                    {
                    // InternalFlowDesigner.g:289:2: ( ( 'HIGH' ) )
                    // InternalFlowDesigner.g:290:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSystemStatusAccess().getHIGHEnumLiteralDeclaration_2()); 
                    // InternalFlowDesigner.g:291:3: ( 'HIGH' )
                    // InternalFlowDesigner.g:291:4: 'HIGH'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getSystemStatusAccess().getHIGHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFlowDesigner.g:295:2: ( ( 'NON_CRITICAL' ) )
                    {
                    // InternalFlowDesigner.g:295:2: ( ( 'NON_CRITICAL' ) )
                    // InternalFlowDesigner.g:296:3: ( 'NON_CRITICAL' )
                    {
                     before(grammarAccess.getSystemStatusAccess().getNON_CRITICALEnumLiteralDeclaration_3()); 
                    // InternalFlowDesigner.g:297:3: ( 'NON_CRITICAL' )
                    // InternalFlowDesigner.g:297:4: 'NON_CRITICAL'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSystemStatusAccess().getNON_CRITICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFlowDesigner.g:301:2: ( ( 'CRITICAL' ) )
                    {
                    // InternalFlowDesigner.g:301:2: ( ( 'CRITICAL' ) )
                    // InternalFlowDesigner.g:302:3: ( 'CRITICAL' )
                    {
                     before(grammarAccess.getSystemStatusAccess().getCRITICALEnumLiteralDeclaration_4()); 
                    // InternalFlowDesigner.g:303:3: ( 'CRITICAL' )
                    // InternalFlowDesigner.g:303:4: 'CRITICAL'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSystemStatusAccess().getCRITICALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFlowDesigner.g:307:2: ( ( 'BLOCKER' ) )
                    {
                    // InternalFlowDesigner.g:307:2: ( ( 'BLOCKER' ) )
                    // InternalFlowDesigner.g:308:3: ( 'BLOCKER' )
                    {
                     before(grammarAccess.getSystemStatusAccess().getBLOCKEREnumLiteralDeclaration_5()); 
                    // InternalFlowDesigner.g:309:3: ( 'BLOCKER' )
                    // InternalFlowDesigner.g:309:4: 'BLOCKER'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getSystemStatusAccess().getBLOCKEREnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__SystemStatus__Alternatives"


    // $ANTLR start "rule__Main__Group__0"
    // InternalFlowDesigner.g:317:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:321:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalFlowDesigner.g:322:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalFlowDesigner.g:329:1: rule__Main__Group__0__Impl : ( () ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:333:1: ( ( () ) )
            // InternalFlowDesigner.g:334:1: ( () )
            {
            // InternalFlowDesigner.g:334:1: ( () )
            // InternalFlowDesigner.g:335:2: ()
            {
             before(grammarAccess.getMainAccess().getCompositeProcessorAction_0()); 
            // InternalFlowDesigner.g:336:2: ()
            // InternalFlowDesigner.g:336:3: 
            {
            }

             after(grammarAccess.getMainAccess().getCompositeProcessorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalFlowDesigner.g:344:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:348:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalFlowDesigner.g:349:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalFlowDesigner.g:356:1: rule__Main__Group__1__Impl : ( ( rule__Main__RoutingRulesListAssignment_1 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:360:1: ( ( ( rule__Main__RoutingRulesListAssignment_1 )? ) )
            // InternalFlowDesigner.g:361:1: ( ( rule__Main__RoutingRulesListAssignment_1 )? )
            {
            // InternalFlowDesigner.g:361:1: ( ( rule__Main__RoutingRulesListAssignment_1 )? )
            // InternalFlowDesigner.g:362:2: ( rule__Main__RoutingRulesListAssignment_1 )?
            {
             before(grammarAccess.getMainAccess().getRoutingRulesListAssignment_1()); 
            // InternalFlowDesigner.g:363:2: ( rule__Main__RoutingRulesListAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFlowDesigner.g:363:3: rule__Main__RoutingRulesListAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__RoutingRulesListAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getRoutingRulesListAssignment_1()); 

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
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // InternalFlowDesigner.g:371:1: rule__Main__Group__2 : rule__Main__Group__2__Impl ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:375:1: ( rule__Main__Group__2__Impl )
            // InternalFlowDesigner.g:376:2: rule__Main__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // InternalFlowDesigner.g:382:1: rule__Main__Group__2__Impl : ( ( rule__Main__Group_2__0 )* ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:386:1: ( ( ( rule__Main__Group_2__0 )* ) )
            // InternalFlowDesigner.g:387:1: ( ( rule__Main__Group_2__0 )* )
            {
            // InternalFlowDesigner.g:387:1: ( ( rule__Main__Group_2__0 )* )
            // InternalFlowDesigner.g:388:2: ( rule__Main__Group_2__0 )*
            {
             before(grammarAccess.getMainAccess().getGroup_2()); 
            // InternalFlowDesigner.g:389:2: ( rule__Main__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFlowDesigner.g:389:3: rule__Main__Group_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Main__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group_2__0"
    // InternalFlowDesigner.g:398:1: rule__Main__Group_2__0 : rule__Main__Group_2__0__Impl rule__Main__Group_2__1 ;
    public final void rule__Main__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:402:1: ( rule__Main__Group_2__0__Impl rule__Main__Group_2__1 )
            // InternalFlowDesigner.g:403:2: rule__Main__Group_2__0__Impl rule__Main__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Main__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Main__Group_2__0"


    // $ANTLR start "rule__Main__Group_2__0__Impl"
    // InternalFlowDesigner.g:410:1: rule__Main__Group_2__0__Impl : ( RULE_NEWLINE ) ;
    public final void rule__Main__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:414:1: ( ( RULE_NEWLINE ) )
            // InternalFlowDesigner.g:415:1: ( RULE_NEWLINE )
            {
            // InternalFlowDesigner.g:415:1: ( RULE_NEWLINE )
            // InternalFlowDesigner.g:416:2: RULE_NEWLINE
            {
             before(grammarAccess.getMainAccess().getNEWLINETerminalRuleCall_2_0()); 
            match(input,RULE_NEWLINE,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getNEWLINETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Main__Group_2__0__Impl"


    // $ANTLR start "rule__Main__Group_2__1"
    // InternalFlowDesigner.g:425:1: rule__Main__Group_2__1 : rule__Main__Group_2__1__Impl ;
    public final void rule__Main__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:429:1: ( rule__Main__Group_2__1__Impl )
            // InternalFlowDesigner.g:430:2: rule__Main__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Main__Group_2__1"


    // $ANTLR start "rule__Main__Group_2__1__Impl"
    // InternalFlowDesigner.g:436:1: rule__Main__Group_2__1__Impl : ( ( rule__Main__RoutingRulesListAssignment_2_1 ) ) ;
    public final void rule__Main__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:440:1: ( ( ( rule__Main__RoutingRulesListAssignment_2_1 ) ) )
            // InternalFlowDesigner.g:441:1: ( ( rule__Main__RoutingRulesListAssignment_2_1 ) )
            {
            // InternalFlowDesigner.g:441:1: ( ( rule__Main__RoutingRulesListAssignment_2_1 ) )
            // InternalFlowDesigner.g:442:2: ( rule__Main__RoutingRulesListAssignment_2_1 )
            {
             before(grammarAccess.getMainAccess().getRoutingRulesListAssignment_2_1()); 
            // InternalFlowDesigner.g:443:2: ( rule__Main__RoutingRulesListAssignment_2_1 )
            // InternalFlowDesigner.g:443:3: rule__Main__RoutingRulesListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Main__RoutingRulesListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getRoutingRulesListAssignment_2_1()); 

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
    // $ANTLR end "rule__Main__Group_2__1__Impl"


    // $ANTLR start "rule__RoutingRule__Group__0"
    // InternalFlowDesigner.g:452:1: rule__RoutingRule__Group__0 : rule__RoutingRule__Group__0__Impl rule__RoutingRule__Group__1 ;
    public final void rule__RoutingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:456:1: ( rule__RoutingRule__Group__0__Impl rule__RoutingRule__Group__1 )
            // InternalFlowDesigner.g:457:2: rule__RoutingRule__Group__0__Impl rule__RoutingRule__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RoutingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__0"


    // $ANTLR start "rule__RoutingRule__Group__0__Impl"
    // InternalFlowDesigner.g:464:1: rule__RoutingRule__Group__0__Impl : ( 'Case' ) ;
    public final void rule__RoutingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:468:1: ( ( 'Case' ) )
            // InternalFlowDesigner.g:469:1: ( 'Case' )
            {
            // InternalFlowDesigner.g:469:1: ( 'Case' )
            // InternalFlowDesigner.g:470:2: 'Case'
            {
             before(grammarAccess.getRoutingRuleAccess().getCaseKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoutingRuleAccess().getCaseKeyword_0()); 

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
    // $ANTLR end "rule__RoutingRule__Group__0__Impl"


    // $ANTLR start "rule__RoutingRule__Group__1"
    // InternalFlowDesigner.g:479:1: rule__RoutingRule__Group__1 : rule__RoutingRule__Group__1__Impl rule__RoutingRule__Group__2 ;
    public final void rule__RoutingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:483:1: ( rule__RoutingRule__Group__1__Impl rule__RoutingRule__Group__2 )
            // InternalFlowDesigner.g:484:2: rule__RoutingRule__Group__1__Impl rule__RoutingRule__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RoutingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__1"


    // $ANTLR start "rule__RoutingRule__Group__1__Impl"
    // InternalFlowDesigner.g:491:1: rule__RoutingRule__Group__1__Impl : ( ( rule__RoutingRule__TargetAssignment_1 ) ) ;
    public final void rule__RoutingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:495:1: ( ( ( rule__RoutingRule__TargetAssignment_1 ) ) )
            // InternalFlowDesigner.g:496:1: ( ( rule__RoutingRule__TargetAssignment_1 ) )
            {
            // InternalFlowDesigner.g:496:1: ( ( rule__RoutingRule__TargetAssignment_1 ) )
            // InternalFlowDesigner.g:497:2: ( rule__RoutingRule__TargetAssignment_1 )
            {
             before(grammarAccess.getRoutingRuleAccess().getTargetAssignment_1()); 
            // InternalFlowDesigner.g:498:2: ( rule__RoutingRule__TargetAssignment_1 )
            // InternalFlowDesigner.g:498:3: rule__RoutingRule__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRule__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoutingRuleAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__RoutingRule__Group__1__Impl"


    // $ANTLR start "rule__RoutingRule__Group__2"
    // InternalFlowDesigner.g:506:1: rule__RoutingRule__Group__2 : rule__RoutingRule__Group__2__Impl rule__RoutingRule__Group__3 ;
    public final void rule__RoutingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:510:1: ( rule__RoutingRule__Group__2__Impl rule__RoutingRule__Group__3 )
            // InternalFlowDesigner.g:511:2: rule__RoutingRule__Group__2__Impl rule__RoutingRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RoutingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__2"


    // $ANTLR start "rule__RoutingRule__Group__2__Impl"
    // InternalFlowDesigner.g:518:1: rule__RoutingRule__Group__2__Impl : ( '.' ) ;
    public final void rule__RoutingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:522:1: ( ( '.' ) )
            // InternalFlowDesigner.g:523:1: ( '.' )
            {
            // InternalFlowDesigner.g:523:1: ( '.' )
            // InternalFlowDesigner.g:524:2: '.'
            {
             before(grammarAccess.getRoutingRuleAccess().getFullStopKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoutingRuleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__RoutingRule__Group__2__Impl"


    // $ANTLR start "rule__RoutingRule__Group__3"
    // InternalFlowDesigner.g:533:1: rule__RoutingRule__Group__3 : rule__RoutingRule__Group__3__Impl rule__RoutingRule__Group__4 ;
    public final void rule__RoutingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:537:1: ( rule__RoutingRule__Group__3__Impl rule__RoutingRule__Group__4 )
            // InternalFlowDesigner.g:538:2: rule__RoutingRule__Group__3__Impl rule__RoutingRule__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RoutingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__3"


    // $ANTLR start "rule__RoutingRule__Group__3__Impl"
    // InternalFlowDesigner.g:545:1: rule__RoutingRule__Group__3__Impl : ( ( rule__RoutingRule__PropertyNameAssignment_3 ) ) ;
    public final void rule__RoutingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:549:1: ( ( ( rule__RoutingRule__PropertyNameAssignment_3 ) ) )
            // InternalFlowDesigner.g:550:1: ( ( rule__RoutingRule__PropertyNameAssignment_3 ) )
            {
            // InternalFlowDesigner.g:550:1: ( ( rule__RoutingRule__PropertyNameAssignment_3 ) )
            // InternalFlowDesigner.g:551:2: ( rule__RoutingRule__PropertyNameAssignment_3 )
            {
             before(grammarAccess.getRoutingRuleAccess().getPropertyNameAssignment_3()); 
            // InternalFlowDesigner.g:552:2: ( rule__RoutingRule__PropertyNameAssignment_3 )
            // InternalFlowDesigner.g:552:3: rule__RoutingRule__PropertyNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRule__PropertyNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoutingRuleAccess().getPropertyNameAssignment_3()); 

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
    // $ANTLR end "rule__RoutingRule__Group__3__Impl"


    // $ANTLR start "rule__RoutingRule__Group__4"
    // InternalFlowDesigner.g:560:1: rule__RoutingRule__Group__4 : rule__RoutingRule__Group__4__Impl rule__RoutingRule__Group__5 ;
    public final void rule__RoutingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:564:1: ( rule__RoutingRule__Group__4__Impl rule__RoutingRule__Group__5 )
            // InternalFlowDesigner.g:565:2: rule__RoutingRule__Group__4__Impl rule__RoutingRule__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__RoutingRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__4"


    // $ANTLR start "rule__RoutingRule__Group__4__Impl"
    // InternalFlowDesigner.g:572:1: rule__RoutingRule__Group__4__Impl : ( ( rule__RoutingRule__ComparisonOperatorAssignment_4 ) ) ;
    public final void rule__RoutingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:576:1: ( ( ( rule__RoutingRule__ComparisonOperatorAssignment_4 ) ) )
            // InternalFlowDesigner.g:577:1: ( ( rule__RoutingRule__ComparisonOperatorAssignment_4 ) )
            {
            // InternalFlowDesigner.g:577:1: ( ( rule__RoutingRule__ComparisonOperatorAssignment_4 ) )
            // InternalFlowDesigner.g:578:2: ( rule__RoutingRule__ComparisonOperatorAssignment_4 )
            {
             before(grammarAccess.getRoutingRuleAccess().getComparisonOperatorAssignment_4()); 
            // InternalFlowDesigner.g:579:2: ( rule__RoutingRule__ComparisonOperatorAssignment_4 )
            // InternalFlowDesigner.g:579:3: rule__RoutingRule__ComparisonOperatorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRule__ComparisonOperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoutingRuleAccess().getComparisonOperatorAssignment_4()); 

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
    // $ANTLR end "rule__RoutingRule__Group__4__Impl"


    // $ANTLR start "rule__RoutingRule__Group__5"
    // InternalFlowDesigner.g:587:1: rule__RoutingRule__Group__5 : rule__RoutingRule__Group__5__Impl rule__RoutingRule__Group__6 ;
    public final void rule__RoutingRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:591:1: ( rule__RoutingRule__Group__5__Impl rule__RoutingRule__Group__6 )
            // InternalFlowDesigner.g:592:2: rule__RoutingRule__Group__5__Impl rule__RoutingRule__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__RoutingRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__5"


    // $ANTLR start "rule__RoutingRule__Group__5__Impl"
    // InternalFlowDesigner.g:599:1: rule__RoutingRule__Group__5__Impl : ( ( rule__RoutingRule__ValueAssignment_5 ) ) ;
    public final void rule__RoutingRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:603:1: ( ( ( rule__RoutingRule__ValueAssignment_5 ) ) )
            // InternalFlowDesigner.g:604:1: ( ( rule__RoutingRule__ValueAssignment_5 ) )
            {
            // InternalFlowDesigner.g:604:1: ( ( rule__RoutingRule__ValueAssignment_5 ) )
            // InternalFlowDesigner.g:605:2: ( rule__RoutingRule__ValueAssignment_5 )
            {
             before(grammarAccess.getRoutingRuleAccess().getValueAssignment_5()); 
            // InternalFlowDesigner.g:606:2: ( rule__RoutingRule__ValueAssignment_5 )
            // InternalFlowDesigner.g:606:3: rule__RoutingRule__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRule__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRoutingRuleAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__RoutingRule__Group__5__Impl"


    // $ANTLR start "rule__RoutingRule__Group__6"
    // InternalFlowDesigner.g:614:1: rule__RoutingRule__Group__6 : rule__RoutingRule__Group__6__Impl rule__RoutingRule__Group__7 ;
    public final void rule__RoutingRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:618:1: ( rule__RoutingRule__Group__6__Impl rule__RoutingRule__Group__7 )
            // InternalFlowDesigner.g:619:2: rule__RoutingRule__Group__6__Impl rule__RoutingRule__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__RoutingRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__6"


    // $ANTLR start "rule__RoutingRule__Group__6__Impl"
    // InternalFlowDesigner.g:626:1: rule__RoutingRule__Group__6__Impl : ( ( rule__RoutingRule__UnitAssignment_6 )? ) ;
    public final void rule__RoutingRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:630:1: ( ( ( rule__RoutingRule__UnitAssignment_6 )? ) )
            // InternalFlowDesigner.g:631:1: ( ( rule__RoutingRule__UnitAssignment_6 )? )
            {
            // InternalFlowDesigner.g:631:1: ( ( rule__RoutingRule__UnitAssignment_6 )? )
            // InternalFlowDesigner.g:632:2: ( rule__RoutingRule__UnitAssignment_6 )?
            {
             before(grammarAccess.getRoutingRuleAccess().getUnitAssignment_6()); 
            // InternalFlowDesigner.g:633:2: ( rule__RoutingRule__UnitAssignment_6 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=17 && LA7_0<=20)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFlowDesigner.g:633:3: rule__RoutingRule__UnitAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__RoutingRule__UnitAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoutingRuleAccess().getUnitAssignment_6()); 

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
    // $ANTLR end "rule__RoutingRule__Group__6__Impl"


    // $ANTLR start "rule__RoutingRule__Group__7"
    // InternalFlowDesigner.g:641:1: rule__RoutingRule__Group__7 : rule__RoutingRule__Group__7__Impl rule__RoutingRule__Group__8 ;
    public final void rule__RoutingRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:645:1: ( rule__RoutingRule__Group__7__Impl rule__RoutingRule__Group__8 )
            // InternalFlowDesigner.g:646:2: rule__RoutingRule__Group__7__Impl rule__RoutingRule__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__RoutingRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__7"


    // $ANTLR start "rule__RoutingRule__Group__7__Impl"
    // InternalFlowDesigner.g:653:1: rule__RoutingRule__Group__7__Impl : ( ':' ) ;
    public final void rule__RoutingRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:657:1: ( ( ':' ) )
            // InternalFlowDesigner.g:658:1: ( ':' )
            {
            // InternalFlowDesigner.g:658:1: ( ':' )
            // InternalFlowDesigner.g:659:2: ':'
            {
             before(grammarAccess.getRoutingRuleAccess().getColonKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRoutingRuleAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__RoutingRule__Group__7__Impl"


    // $ANTLR start "rule__RoutingRule__Group__8"
    // InternalFlowDesigner.g:668:1: rule__RoutingRule__Group__8 : rule__RoutingRule__Group__8__Impl ;
    public final void rule__RoutingRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:672:1: ( rule__RoutingRule__Group__8__Impl )
            // InternalFlowDesigner.g:673:2: rule__RoutingRule__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRule__Group__8__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__RoutingRule__Group__8"


    // $ANTLR start "rule__RoutingRule__Group__8__Impl"
    // InternalFlowDesigner.g:679:1: rule__RoutingRule__Group__8__Impl : ( ( rule__RoutingRule__SystemStatusAssignment_8 ) ) ;
    public final void rule__RoutingRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:683:1: ( ( ( rule__RoutingRule__SystemStatusAssignment_8 ) ) )
            // InternalFlowDesigner.g:684:1: ( ( rule__RoutingRule__SystemStatusAssignment_8 ) )
            {
            // InternalFlowDesigner.g:684:1: ( ( rule__RoutingRule__SystemStatusAssignment_8 ) )
            // InternalFlowDesigner.g:685:2: ( rule__RoutingRule__SystemStatusAssignment_8 )
            {
             before(grammarAccess.getRoutingRuleAccess().getSystemStatusAssignment_8()); 
            // InternalFlowDesigner.g:686:2: ( rule__RoutingRule__SystemStatusAssignment_8 )
            // InternalFlowDesigner.g:686:3: rule__RoutingRule__SystemStatusAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRule__SystemStatusAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRoutingRuleAccess().getSystemStatusAssignment_8()); 

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
    // $ANTLR end "rule__RoutingRule__Group__8__Impl"


    // $ANTLR start "rule__Main__RoutingRulesListAssignment_1"
    // InternalFlowDesigner.g:695:1: rule__Main__RoutingRulesListAssignment_1 : ( ruleRoutingRule ) ;
    public final void rule__Main__RoutingRulesListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:699:1: ( ( ruleRoutingRule ) )
            // InternalFlowDesigner.g:700:2: ( ruleRoutingRule )
            {
            // InternalFlowDesigner.g:700:2: ( ruleRoutingRule )
            // InternalFlowDesigner.g:701:3: ruleRoutingRule
            {
             before(grammarAccess.getMainAccess().getRoutingRulesListRoutingRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoutingRule();

            state._fsp--;

             after(grammarAccess.getMainAccess().getRoutingRulesListRoutingRuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Main__RoutingRulesListAssignment_1"


    // $ANTLR start "rule__Main__RoutingRulesListAssignment_2_1"
    // InternalFlowDesigner.g:710:1: rule__Main__RoutingRulesListAssignment_2_1 : ( ruleRoutingRule ) ;
    public final void rule__Main__RoutingRulesListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:714:1: ( ( ruleRoutingRule ) )
            // InternalFlowDesigner.g:715:2: ( ruleRoutingRule )
            {
            // InternalFlowDesigner.g:715:2: ( ruleRoutingRule )
            // InternalFlowDesigner.g:716:3: ruleRoutingRule
            {
             before(grammarAccess.getMainAccess().getRoutingRulesListRoutingRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoutingRule();

            state._fsp--;

             after(grammarAccess.getMainAccess().getRoutingRulesListRoutingRuleParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Main__RoutingRulesListAssignment_2_1"


    // $ANTLR start "rule__RoutingRule__TargetAssignment_1"
    // InternalFlowDesigner.g:725:1: rule__RoutingRule__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoutingRule__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:729:1: ( ( ( RULE_ID ) ) )
            // InternalFlowDesigner.g:730:2: ( ( RULE_ID ) )
            {
            // InternalFlowDesigner.g:730:2: ( ( RULE_ID ) )
            // InternalFlowDesigner.g:731:3: ( RULE_ID )
            {
             before(grammarAccess.getRoutingRuleAccess().getTargetSystemCrossReference_1_0()); 
            // InternalFlowDesigner.g:732:3: ( RULE_ID )
            // InternalFlowDesigner.g:733:4: RULE_ID
            {
             before(grammarAccess.getRoutingRuleAccess().getTargetSystemIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoutingRuleAccess().getTargetSystemIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRoutingRuleAccess().getTargetSystemCrossReference_1_0()); 

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
    // $ANTLR end "rule__RoutingRule__TargetAssignment_1"


    // $ANTLR start "rule__RoutingRule__PropertyNameAssignment_3"
    // InternalFlowDesigner.g:744:1: rule__RoutingRule__PropertyNameAssignment_3 : ( ruleSystemProperty ) ;
    public final void rule__RoutingRule__PropertyNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:748:1: ( ( ruleSystemProperty ) )
            // InternalFlowDesigner.g:749:2: ( ruleSystemProperty )
            {
            // InternalFlowDesigner.g:749:2: ( ruleSystemProperty )
            // InternalFlowDesigner.g:750:3: ruleSystemProperty
            {
             before(grammarAccess.getRoutingRuleAccess().getPropertyNameSystemPropertyEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemProperty();

            state._fsp--;

             after(grammarAccess.getRoutingRuleAccess().getPropertyNameSystemPropertyEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__RoutingRule__PropertyNameAssignment_3"


    // $ANTLR start "rule__RoutingRule__ComparisonOperatorAssignment_4"
    // InternalFlowDesigner.g:759:1: rule__RoutingRule__ComparisonOperatorAssignment_4 : ( ruleComparisonOperator ) ;
    public final void rule__RoutingRule__ComparisonOperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:763:1: ( ( ruleComparisonOperator ) )
            // InternalFlowDesigner.g:764:2: ( ruleComparisonOperator )
            {
            // InternalFlowDesigner.g:764:2: ( ruleComparisonOperator )
            // InternalFlowDesigner.g:765:3: ruleComparisonOperator
            {
             before(grammarAccess.getRoutingRuleAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getRoutingRuleAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__RoutingRule__ComparisonOperatorAssignment_4"


    // $ANTLR start "rule__RoutingRule__ValueAssignment_5"
    // InternalFlowDesigner.g:774:1: rule__RoutingRule__ValueAssignment_5 : ( ruleEInt ) ;
    public final void rule__RoutingRule__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:778:1: ( ( ruleEInt ) )
            // InternalFlowDesigner.g:779:2: ( ruleEInt )
            {
            // InternalFlowDesigner.g:779:2: ( ruleEInt )
            // InternalFlowDesigner.g:780:3: ruleEInt
            {
             before(grammarAccess.getRoutingRuleAccess().getValueEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoutingRuleAccess().getValueEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RoutingRule__ValueAssignment_5"


    // $ANTLR start "rule__RoutingRule__UnitAssignment_6"
    // InternalFlowDesigner.g:789:1: rule__RoutingRule__UnitAssignment_6 : ( rulePropertyUnit ) ;
    public final void rule__RoutingRule__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:793:1: ( ( rulePropertyUnit ) )
            // InternalFlowDesigner.g:794:2: ( rulePropertyUnit )
            {
            // InternalFlowDesigner.g:794:2: ( rulePropertyUnit )
            // InternalFlowDesigner.g:795:3: rulePropertyUnit
            {
             before(grammarAccess.getRoutingRuleAccess().getUnitPropertyUnitEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyUnit();

            state._fsp--;

             after(grammarAccess.getRoutingRuleAccess().getUnitPropertyUnitEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__RoutingRule__UnitAssignment_6"


    // $ANTLR start "rule__RoutingRule__SystemStatusAssignment_8"
    // InternalFlowDesigner.g:804:1: rule__RoutingRule__SystemStatusAssignment_8 : ( ruleSystemStatus ) ;
    public final void rule__RoutingRule__SystemStatusAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFlowDesigner.g:808:1: ( ( ruleSystemStatus ) )
            // InternalFlowDesigner.g:809:2: ( ruleSystemStatus )
            {
            // InternalFlowDesigner.g:809:2: ( ruleSystemStatus )
            // InternalFlowDesigner.g:810:3: ruleSystemStatus
            {
             before(grammarAccess.getRoutingRuleAccess().getSystemStatusSystemStatusEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemStatus();

            state._fsp--;

             after(grammarAccess.getRoutingRuleAccess().getSystemStatusSystemStatusEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__RoutingRule__SystemStatusAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000201E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007E00000L});

}