package fr.obeo.dsl.designer.sample.flow.xtext.parser.antlr.internal;

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
import fr.obeo.dsl.designer.sample.flow.xtext.services.FlowDesignerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowDesignerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Case'", "'.'", "':'", "'Temperature'", "'Weight'", "'<'", "'>'", "'=='", "'\\u00B0C'", "'\\u00B0F'", "'kg'", "'lb'", "'LOW'", "'MEDIUM'", "'HIGH'", "'NON_CRITICAL'", "'CRITICAL'", "'BLOCKER'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

        public InternalFlowDesignerParser(TokenStream input, FlowDesignerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Main";
       	}

       	@Override
       	protected FlowDesignerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMain"
    // InternalFlowDesigner.g:65:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalFlowDesigner.g:65:45: (iv_ruleMain= ruleMain EOF )
            // InternalFlowDesigner.g:66:2: iv_ruleMain= ruleMain EOF
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
    // InternalFlowDesigner.g:72:1: ruleMain returns [EObject current=null] : ( () ( (lv_routingRulesList_1_0= ruleRoutingRule ) )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_routingRulesList_3_0= ruleRoutingRule ) ) )* ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_2=null;
        EObject lv_routingRulesList_1_0 = null;

        EObject lv_routingRulesList_3_0 = null;



        	enterRule();

        try {
            // InternalFlowDesigner.g:78:2: ( ( () ( (lv_routingRulesList_1_0= ruleRoutingRule ) )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_routingRulesList_3_0= ruleRoutingRule ) ) )* ) )
            // InternalFlowDesigner.g:79:2: ( () ( (lv_routingRulesList_1_0= ruleRoutingRule ) )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_routingRulesList_3_0= ruleRoutingRule ) ) )* )
            {
            // InternalFlowDesigner.g:79:2: ( () ( (lv_routingRulesList_1_0= ruleRoutingRule ) )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_routingRulesList_3_0= ruleRoutingRule ) ) )* )
            // InternalFlowDesigner.g:80:3: () ( (lv_routingRulesList_1_0= ruleRoutingRule ) )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_routingRulesList_3_0= ruleRoutingRule ) ) )*
            {
            // InternalFlowDesigner.g:80:3: ()
            // InternalFlowDesigner.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainAccess().getCompositeProcessorAction_0(),
            					current);
            			

            }

            // InternalFlowDesigner.g:87:3: ( (lv_routingRulesList_1_0= ruleRoutingRule ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFlowDesigner.g:88:4: (lv_routingRulesList_1_0= ruleRoutingRule )
                    {
                    // InternalFlowDesigner.g:88:4: (lv_routingRulesList_1_0= ruleRoutingRule )
                    // InternalFlowDesigner.g:89:5: lv_routingRulesList_1_0= ruleRoutingRule
                    {

                    					newCompositeNode(grammarAccess.getMainAccess().getRoutingRulesListRoutingRuleParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_routingRulesList_1_0=ruleRoutingRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainRule());
                    					}
                    					add(
                    						current,
                    						"routingRulesList",
                    						lv_routingRulesList_1_0,
                    						"fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner.RoutingRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFlowDesigner.g:106:3: (this_NEWLINE_2= RULE_NEWLINE ( (lv_routingRulesList_3_0= ruleRoutingRule ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFlowDesigner.g:107:4: this_NEWLINE_2= RULE_NEWLINE ( (lv_routingRulesList_3_0= ruleRoutingRule ) )
            	    {
            	    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            	    				newLeafNode(this_NEWLINE_2, grammarAccess.getMainAccess().getNEWLINETerminalRuleCall_2_0());
            	    			
            	    // InternalFlowDesigner.g:111:4: ( (lv_routingRulesList_3_0= ruleRoutingRule ) )
            	    // InternalFlowDesigner.g:112:5: (lv_routingRulesList_3_0= ruleRoutingRule )
            	    {
            	    // InternalFlowDesigner.g:112:5: (lv_routingRulesList_3_0= ruleRoutingRule )
            	    // InternalFlowDesigner.g:113:6: lv_routingRulesList_3_0= ruleRoutingRule
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getRoutingRulesListRoutingRuleParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_routingRulesList_3_0=ruleRoutingRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"routingRulesList",
            	    							lv_routingRulesList_3_0,
            	    							"fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner.RoutingRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleRoutingRule"
    // InternalFlowDesigner.g:135:1: entryRuleRoutingRule returns [EObject current=null] : iv_ruleRoutingRule= ruleRoutingRule EOF ;
    public final EObject entryRuleRoutingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoutingRule = null;


        try {
            // InternalFlowDesigner.g:135:52: (iv_ruleRoutingRule= ruleRoutingRule EOF )
            // InternalFlowDesigner.g:136:2: iv_ruleRoutingRule= ruleRoutingRule EOF
            {
             newCompositeNode(grammarAccess.getRoutingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoutingRule=ruleRoutingRule();

            state._fsp--;

             current =iv_ruleRoutingRule; 
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
    // $ANTLR end "entryRuleRoutingRule"


    // $ANTLR start "ruleRoutingRule"
    // InternalFlowDesigner.g:142:1: ruleRoutingRule returns [EObject current=null] : (otherlv_0= 'Case' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_propertyName_3_0= ruleSystemProperty ) ) ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_value_5_0= ruleEInt ) ) ( (lv_unit_6_0= rulePropertyUnit ) )? otherlv_7= ':' ( (lv_systemStatus_8_0= ruleSystemStatus ) ) ) ;
    public final EObject ruleRoutingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Enumerator lv_propertyName_3_0 = null;

        Enumerator lv_comparisonOperator_4_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        Enumerator lv_unit_6_0 = null;

        Enumerator lv_systemStatus_8_0 = null;



        	enterRule();

        try {
            // InternalFlowDesigner.g:148:2: ( (otherlv_0= 'Case' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_propertyName_3_0= ruleSystemProperty ) ) ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_value_5_0= ruleEInt ) ) ( (lv_unit_6_0= rulePropertyUnit ) )? otherlv_7= ':' ( (lv_systemStatus_8_0= ruleSystemStatus ) ) ) )
            // InternalFlowDesigner.g:149:2: (otherlv_0= 'Case' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_propertyName_3_0= ruleSystemProperty ) ) ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_value_5_0= ruleEInt ) ) ( (lv_unit_6_0= rulePropertyUnit ) )? otherlv_7= ':' ( (lv_systemStatus_8_0= ruleSystemStatus ) ) )
            {
            // InternalFlowDesigner.g:149:2: (otherlv_0= 'Case' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_propertyName_3_0= ruleSystemProperty ) ) ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_value_5_0= ruleEInt ) ) ( (lv_unit_6_0= rulePropertyUnit ) )? otherlv_7= ':' ( (lv_systemStatus_8_0= ruleSystemStatus ) ) )
            // InternalFlowDesigner.g:150:3: otherlv_0= 'Case' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_propertyName_3_0= ruleSystemProperty ) ) ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) ) ( (lv_value_5_0= ruleEInt ) ) ( (lv_unit_6_0= rulePropertyUnit ) )? otherlv_7= ':' ( (lv_systemStatus_8_0= ruleSystemStatus ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRoutingRuleAccess().getCaseKeyword_0());
            		
            // InternalFlowDesigner.g:154:3: ( (otherlv_1= RULE_ID ) )
            // InternalFlowDesigner.g:155:4: (otherlv_1= RULE_ID )
            {
            // InternalFlowDesigner.g:155:4: (otherlv_1= RULE_ID )
            // InternalFlowDesigner.g:156:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoutingRuleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getRoutingRuleAccess().getTargetSystemCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRoutingRuleAccess().getFullStopKeyword_2());
            		
            // InternalFlowDesigner.g:171:3: ( (lv_propertyName_3_0= ruleSystemProperty ) )
            // InternalFlowDesigner.g:172:4: (lv_propertyName_3_0= ruleSystemProperty )
            {
            // InternalFlowDesigner.g:172:4: (lv_propertyName_3_0= ruleSystemProperty )
            // InternalFlowDesigner.g:173:5: lv_propertyName_3_0= ruleSystemProperty
            {

            					newCompositeNode(grammarAccess.getRoutingRuleAccess().getPropertyNameSystemPropertyEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_propertyName_3_0=ruleSystemProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoutingRuleRule());
            					}
            					set(
            						current,
            						"propertyName",
            						lv_propertyName_3_0,
            						"fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner.SystemProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFlowDesigner.g:190:3: ( (lv_comparisonOperator_4_0= ruleComparisonOperator ) )
            // InternalFlowDesigner.g:191:4: (lv_comparisonOperator_4_0= ruleComparisonOperator )
            {
            // InternalFlowDesigner.g:191:4: (lv_comparisonOperator_4_0= ruleComparisonOperator )
            // InternalFlowDesigner.g:192:5: lv_comparisonOperator_4_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getRoutingRuleAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_comparisonOperator_4_0=ruleComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoutingRuleRule());
            					}
            					set(
            						current,
            						"comparisonOperator",
            						lv_comparisonOperator_4_0,
            						"fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner.ComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFlowDesigner.g:209:3: ( (lv_value_5_0= ruleEInt ) )
            // InternalFlowDesigner.g:210:4: (lv_value_5_0= ruleEInt )
            {
            // InternalFlowDesigner.g:210:4: (lv_value_5_0= ruleEInt )
            // InternalFlowDesigner.g:211:5: lv_value_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoutingRuleAccess().getValueEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoutingRuleRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFlowDesigner.g:228:3: ( (lv_unit_6_0= rulePropertyUnit ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=20 && LA3_0<=23)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFlowDesigner.g:229:4: (lv_unit_6_0= rulePropertyUnit )
                    {
                    // InternalFlowDesigner.g:229:4: (lv_unit_6_0= rulePropertyUnit )
                    // InternalFlowDesigner.g:230:5: lv_unit_6_0= rulePropertyUnit
                    {

                    					newCompositeNode(grammarAccess.getRoutingRuleAccess().getUnitPropertyUnitEnumRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_unit_6_0=rulePropertyUnit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoutingRuleRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_6_0,
                    						"fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner.PropertyUnit");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getRoutingRuleAccess().getColonKeyword_7());
            		
            // InternalFlowDesigner.g:251:3: ( (lv_systemStatus_8_0= ruleSystemStatus ) )
            // InternalFlowDesigner.g:252:4: (lv_systemStatus_8_0= ruleSystemStatus )
            {
            // InternalFlowDesigner.g:252:4: (lv_systemStatus_8_0= ruleSystemStatus )
            // InternalFlowDesigner.g:253:5: lv_systemStatus_8_0= ruleSystemStatus
            {

            					newCompositeNode(grammarAccess.getRoutingRuleAccess().getSystemStatusSystemStatusEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_systemStatus_8_0=ruleSystemStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoutingRuleRule());
            					}
            					set(
            						current,
            						"systemStatus",
            						lv_systemStatus_8_0,
            						"fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner.SystemStatus");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRoutingRule"


    // $ANTLR start "entryRuleEInt"
    // InternalFlowDesigner.g:274:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalFlowDesigner.g:274:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalFlowDesigner.g:275:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalFlowDesigner.g:281:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFlowDesigner.g:287:2: (this_INT_0= RULE_INT )
            // InternalFlowDesigner.g:288:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleSystemProperty"
    // InternalFlowDesigner.g:298:1: ruleSystemProperty returns [Enumerator current=null] : ( (enumLiteral_0= 'Temperature' ) | (enumLiteral_1= 'Weight' ) ) ;
    public final Enumerator ruleSystemProperty() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFlowDesigner.g:304:2: ( ( (enumLiteral_0= 'Temperature' ) | (enumLiteral_1= 'Weight' ) ) )
            // InternalFlowDesigner.g:305:2: ( (enumLiteral_0= 'Temperature' ) | (enumLiteral_1= 'Weight' ) )
            {
            // InternalFlowDesigner.g:305:2: ( (enumLiteral_0= 'Temperature' ) | (enumLiteral_1= 'Weight' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFlowDesigner.g:306:3: (enumLiteral_0= 'Temperature' )
                    {
                    // InternalFlowDesigner.g:306:3: (enumLiteral_0= 'Temperature' )
                    // InternalFlowDesigner.g:307:4: enumLiteral_0= 'Temperature'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getSystemPropertyAccess().getTemperatureEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSystemPropertyAccess().getTemperatureEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowDesigner.g:314:3: (enumLiteral_1= 'Weight' )
                    {
                    // InternalFlowDesigner.g:314:3: (enumLiteral_1= 'Weight' )
                    // InternalFlowDesigner.g:315:4: enumLiteral_1= 'Weight'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getSystemPropertyAccess().getWeightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSystemPropertyAccess().getWeightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSystemProperty"


    // $ANTLR start "ruleComparisonOperator"
    // InternalFlowDesigner.g:325:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFlowDesigner.g:331:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) ) )
            // InternalFlowDesigner.g:332:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) )
            {
            // InternalFlowDesigner.g:332:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFlowDesigner.g:333:3: (enumLiteral_0= '<' )
                    {
                    // InternalFlowDesigner.g:333:3: (enumLiteral_0= '<' )
                    // InternalFlowDesigner.g:334:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLower_thanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLower_thanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowDesigner.g:341:3: (enumLiteral_1= '>' )
                    {
                    // InternalFlowDesigner.g:341:3: (enumLiteral_1= '>' )
                    // InternalFlowDesigner.g:342:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGreather_thanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreather_thanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFlowDesigner.g:349:3: (enumLiteral_2= '==' )
                    {
                    // InternalFlowDesigner.g:349:3: (enumLiteral_2= '==' )
                    // InternalFlowDesigner.g:350:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "rulePropertyUnit"
    // InternalFlowDesigner.g:360:1: rulePropertyUnit returns [Enumerator current=null] : ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) | (enumLiteral_2= 'kg' ) | (enumLiteral_3= 'lb' ) ) ;
    public final Enumerator rulePropertyUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFlowDesigner.g:366:2: ( ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) | (enumLiteral_2= 'kg' ) | (enumLiteral_3= 'lb' ) ) )
            // InternalFlowDesigner.g:367:2: ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) | (enumLiteral_2= 'kg' ) | (enumLiteral_3= 'lb' ) )
            {
            // InternalFlowDesigner.g:367:2: ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) | (enumLiteral_2= 'kg' ) | (enumLiteral_3= 'lb' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFlowDesigner.g:368:3: (enumLiteral_0= '\\u00B0C' )
                    {
                    // InternalFlowDesigner.g:368:3: (enumLiteral_0= '\\u00B0C' )
                    // InternalFlowDesigner.g:369:4: enumLiteral_0= '\\u00B0C'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getPropertyUnitAccess().getCelsiusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyUnitAccess().getCelsiusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowDesigner.g:376:3: (enumLiteral_1= '\\u00B0F' )
                    {
                    // InternalFlowDesigner.g:376:3: (enumLiteral_1= '\\u00B0F' )
                    // InternalFlowDesigner.g:377:4: enumLiteral_1= '\\u00B0F'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getPropertyUnitAccess().getFahrenheitEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyUnitAccess().getFahrenheitEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFlowDesigner.g:384:3: (enumLiteral_2= 'kg' )
                    {
                    // InternalFlowDesigner.g:384:3: (enumLiteral_2= 'kg' )
                    // InternalFlowDesigner.g:385:4: enumLiteral_2= 'kg'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPropertyUnitAccess().getKilogramsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyUnitAccess().getKilogramsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFlowDesigner.g:392:3: (enumLiteral_3= 'lb' )
                    {
                    // InternalFlowDesigner.g:392:3: (enumLiteral_3= 'lb' )
                    // InternalFlowDesigner.g:393:4: enumLiteral_3= 'lb'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getPropertyUnitAccess().getPoundsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropertyUnitAccess().getPoundsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "rulePropertyUnit"


    // $ANTLR start "ruleSystemStatus"
    // InternalFlowDesigner.g:403:1: ruleSystemStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) | (enumLiteral_3= 'NON_CRITICAL' ) | (enumLiteral_4= 'CRITICAL' ) | (enumLiteral_5= 'BLOCKER' ) ) ;
    public final Enumerator ruleSystemStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalFlowDesigner.g:409:2: ( ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) | (enumLiteral_3= 'NON_CRITICAL' ) | (enumLiteral_4= 'CRITICAL' ) | (enumLiteral_5= 'BLOCKER' ) ) )
            // InternalFlowDesigner.g:410:2: ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) | (enumLiteral_3= 'NON_CRITICAL' ) | (enumLiteral_4= 'CRITICAL' ) | (enumLiteral_5= 'BLOCKER' ) )
            {
            // InternalFlowDesigner.g:410:2: ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) | (enumLiteral_3= 'NON_CRITICAL' ) | (enumLiteral_4= 'CRITICAL' ) | (enumLiteral_5= 'BLOCKER' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case 29:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFlowDesigner.g:411:3: (enumLiteral_0= 'LOW' )
                    {
                    // InternalFlowDesigner.g:411:3: (enumLiteral_0= 'LOW' )
                    // InternalFlowDesigner.g:412:4: enumLiteral_0= 'LOW'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getSystemStatusAccess().getLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSystemStatusAccess().getLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowDesigner.g:419:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalFlowDesigner.g:419:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalFlowDesigner.g:420:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getSystemStatusAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSystemStatusAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFlowDesigner.g:427:3: (enumLiteral_2= 'HIGH' )
                    {
                    // InternalFlowDesigner.g:427:3: (enumLiteral_2= 'HIGH' )
                    // InternalFlowDesigner.g:428:4: enumLiteral_2= 'HIGH'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getSystemStatusAccess().getHIGHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSystemStatusAccess().getHIGHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFlowDesigner.g:435:3: (enumLiteral_3= 'NON_CRITICAL' )
                    {
                    // InternalFlowDesigner.g:435:3: (enumLiteral_3= 'NON_CRITICAL' )
                    // InternalFlowDesigner.g:436:4: enumLiteral_3= 'NON_CRITICAL'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getSystemStatusAccess().getNON_CRITICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSystemStatusAccess().getNON_CRITICALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFlowDesigner.g:443:3: (enumLiteral_4= 'CRITICAL' )
                    {
                    // InternalFlowDesigner.g:443:3: (enumLiteral_4= 'CRITICAL' )
                    // InternalFlowDesigner.g:444:4: enumLiteral_4= 'CRITICAL'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getSystemStatusAccess().getCRITICALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSystemStatusAccess().getCRITICALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalFlowDesigner.g:451:3: (enumLiteral_5= 'BLOCKER' )
                    {
                    // InternalFlowDesigner.g:451:3: (enumLiteral_5= 'BLOCKER' )
                    // InternalFlowDesigner.g:452:4: enumLiteral_5= 'BLOCKER'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getSystemStatusAccess().getBLOCKEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSystemStatusAccess().getBLOCKEREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSystemStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F04000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003F000000L});

}