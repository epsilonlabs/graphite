package workload.xtext_grammar.ide.contentassist.antlr.internal;

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
import workload.xtext_grammar.services.EffortsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEffortsParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(EffortsGrammarAccess grammarAccess) {
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
    // InternalEfforts.g:53:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalEfforts.g:54:1: ( ruleMain EOF )
            // InternalEfforts.g:55:1: ruleMain EOF
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
    // InternalEfforts.g:62:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:66:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalEfforts.g:67:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalEfforts.g:67:2: ( ( rule__Main__Group__0 ) )
            // InternalEfforts.g:68:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalEfforts.g:69:3: ( rule__Main__Group__0 )
            // InternalEfforts.g:69:4: rule__Main__Group__0
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


    // $ANTLR start "entryRuleEffort"
    // InternalEfforts.g:78:1: entryRuleEffort : ruleEffort EOF ;
    public final void entryRuleEffort() throws RecognitionException {
        try {
            // InternalEfforts.g:79:1: ( ruleEffort EOF )
            // InternalEfforts.g:80:1: ruleEffort EOF
            {
             before(grammarAccess.getEffortRule()); 
            pushFollow(FOLLOW_1);
            ruleEffort();

            state._fsp--;

             after(grammarAccess.getEffortRule()); 
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
    // $ANTLR end "entryRuleEffort"


    // $ANTLR start "ruleEffort"
    // InternalEfforts.g:87:1: ruleEffort : ( ( rule__Effort__Group__0 ) ) ;
    public final void ruleEffort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:91:2: ( ( ( rule__Effort__Group__0 ) ) )
            // InternalEfforts.g:92:2: ( ( rule__Effort__Group__0 ) )
            {
            // InternalEfforts.g:92:2: ( ( rule__Effort__Group__0 ) )
            // InternalEfforts.g:93:3: ( rule__Effort__Group__0 )
            {
             before(grammarAccess.getEffortAccess().getGroup()); 
            // InternalEfforts.g:94:3: ( rule__Effort__Group__0 )
            // InternalEfforts.g:94:4: rule__Effort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffortAccess().getGroup()); 

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
    // $ANTLR end "ruleEffort"


    // $ANTLR start "rule__Main__Group__0"
    // InternalEfforts.g:102:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:106:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalEfforts.g:107:2: rule__Main__Group__0__Impl rule__Main__Group__1
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
    // InternalEfforts.g:114:1: rule__Main__Group__0__Impl : ( () ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:118:1: ( ( () ) )
            // InternalEfforts.g:119:1: ( () )
            {
            // InternalEfforts.g:119:1: ( () )
            // InternalEfforts.g:120:2: ()
            {
             before(grammarAccess.getMainAccess().getTaskAction_0()); 
            // InternalEfforts.g:121:2: ()
            // InternalEfforts.g:121:3: 
            {
            }

             after(grammarAccess.getMainAccess().getTaskAction_0()); 

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
    // InternalEfforts.g:129:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:133:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalEfforts.g:134:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalEfforts.g:141:1: rule__Main__Group__1__Impl : ( ( rule__Main__EffortsAssignment_1 ) ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:145:1: ( ( ( rule__Main__EffortsAssignment_1 ) ) )
            // InternalEfforts.g:146:1: ( ( rule__Main__EffortsAssignment_1 ) )
            {
            // InternalEfforts.g:146:1: ( ( rule__Main__EffortsAssignment_1 ) )
            // InternalEfforts.g:147:2: ( rule__Main__EffortsAssignment_1 )
            {
             before(grammarAccess.getMainAccess().getEffortsAssignment_1()); 
            // InternalEfforts.g:148:2: ( rule__Main__EffortsAssignment_1 )
            // InternalEfforts.g:148:3: rule__Main__EffortsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Main__EffortsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getEffortsAssignment_1()); 

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
    // InternalEfforts.g:156:1: rule__Main__Group__2 : rule__Main__Group__2__Impl ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:160:1: ( rule__Main__Group__2__Impl )
            // InternalEfforts.g:161:2: rule__Main__Group__2__Impl
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
    // InternalEfforts.g:167:1: rule__Main__Group__2__Impl : ( ( rule__Main__Group_2__0 )* ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:171:1: ( ( ( rule__Main__Group_2__0 )* ) )
            // InternalEfforts.g:172:1: ( ( rule__Main__Group_2__0 )* )
            {
            // InternalEfforts.g:172:1: ( ( rule__Main__Group_2__0 )* )
            // InternalEfforts.g:173:2: ( rule__Main__Group_2__0 )*
            {
             before(grammarAccess.getMainAccess().getGroup_2()); 
            // InternalEfforts.g:174:2: ( rule__Main__Group_2__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEfforts.g:174:3: rule__Main__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Main__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalEfforts.g:183:1: rule__Main__Group_2__0 : rule__Main__Group_2__0__Impl rule__Main__Group_2__1 ;
    public final void rule__Main__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:187:1: ( rule__Main__Group_2__0__Impl rule__Main__Group_2__1 )
            // InternalEfforts.g:188:2: rule__Main__Group_2__0__Impl rule__Main__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEfforts.g:195:1: rule__Main__Group_2__0__Impl : ( RULE_NEWLINE ) ;
    public final void rule__Main__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:199:1: ( ( RULE_NEWLINE ) )
            // InternalEfforts.g:200:1: ( RULE_NEWLINE )
            {
            // InternalEfforts.g:200:1: ( RULE_NEWLINE )
            // InternalEfforts.g:201:2: RULE_NEWLINE
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
    // InternalEfforts.g:210:1: rule__Main__Group_2__1 : rule__Main__Group_2__1__Impl ;
    public final void rule__Main__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:214:1: ( rule__Main__Group_2__1__Impl )
            // InternalEfforts.g:215:2: rule__Main__Group_2__1__Impl
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
    // InternalEfforts.g:221:1: rule__Main__Group_2__1__Impl : ( ( rule__Main__EffortsAssignment_2_1 ) ) ;
    public final void rule__Main__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:225:1: ( ( ( rule__Main__EffortsAssignment_2_1 ) ) )
            // InternalEfforts.g:226:1: ( ( rule__Main__EffortsAssignment_2_1 ) )
            {
            // InternalEfforts.g:226:1: ( ( rule__Main__EffortsAssignment_2_1 ) )
            // InternalEfforts.g:227:2: ( rule__Main__EffortsAssignment_2_1 )
            {
             before(grammarAccess.getMainAccess().getEffortsAssignment_2_1()); 
            // InternalEfforts.g:228:2: ( rule__Main__EffortsAssignment_2_1 )
            // InternalEfforts.g:228:3: rule__Main__EffortsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Main__EffortsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getEffortsAssignment_2_1()); 

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


    // $ANTLR start "rule__Effort__Group__0"
    // InternalEfforts.g:237:1: rule__Effort__Group__0 : rule__Effort__Group__0__Impl rule__Effort__Group__1 ;
    public final void rule__Effort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:241:1: ( rule__Effort__Group__0__Impl rule__Effort__Group__1 )
            // InternalEfforts.g:242:2: rule__Effort__Group__0__Impl rule__Effort__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Effort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effort__Group__1();

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
    // $ANTLR end "rule__Effort__Group__0"


    // $ANTLR start "rule__Effort__Group__0__Impl"
    // InternalEfforts.g:249:1: rule__Effort__Group__0__Impl : ( () ) ;
    public final void rule__Effort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:253:1: ( ( () ) )
            // InternalEfforts.g:254:1: ( () )
            {
            // InternalEfforts.g:254:1: ( () )
            // InternalEfforts.g:255:2: ()
            {
             before(grammarAccess.getEffortAccess().getEffortAction_0()); 
            // InternalEfforts.g:256:2: ()
            // InternalEfforts.g:256:3: 
            {
            }

             after(grammarAccess.getEffortAccess().getEffortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__0__Impl"


    // $ANTLR start "rule__Effort__Group__1"
    // InternalEfforts.g:264:1: rule__Effort__Group__1 : rule__Effort__Group__1__Impl rule__Effort__Group__2 ;
    public final void rule__Effort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:268:1: ( rule__Effort__Group__1__Impl rule__Effort__Group__2 )
            // InternalEfforts.g:269:2: rule__Effort__Group__1__Impl rule__Effort__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Effort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effort__Group__2();

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
    // $ANTLR end "rule__Effort__Group__1"


    // $ANTLR start "rule__Effort__Group__1__Impl"
    // InternalEfforts.g:276:1: rule__Effort__Group__1__Impl : ( ( rule__Effort__PersonAssignment_1 )? ) ;
    public final void rule__Effort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:280:1: ( ( ( rule__Effort__PersonAssignment_1 )? ) )
            // InternalEfforts.g:281:1: ( ( rule__Effort__PersonAssignment_1 )? )
            {
            // InternalEfforts.g:281:1: ( ( rule__Effort__PersonAssignment_1 )? )
            // InternalEfforts.g:282:2: ( rule__Effort__PersonAssignment_1 )?
            {
             before(grammarAccess.getEffortAccess().getPersonAssignment_1()); 
            // InternalEfforts.g:283:2: ( rule__Effort__PersonAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEfforts.g:283:3: rule__Effort__PersonAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Effort__PersonAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEffortAccess().getPersonAssignment_1()); 

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
    // $ANTLR end "rule__Effort__Group__1__Impl"


    // $ANTLR start "rule__Effort__Group__2"
    // InternalEfforts.g:291:1: rule__Effort__Group__2 : rule__Effort__Group__2__Impl rule__Effort__Group__3 ;
    public final void rule__Effort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:295:1: ( rule__Effort__Group__2__Impl rule__Effort__Group__3 )
            // InternalEfforts.g:296:2: rule__Effort__Group__2__Impl rule__Effort__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Effort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effort__Group__3();

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
    // $ANTLR end "rule__Effort__Group__2"


    // $ANTLR start "rule__Effort__Group__2__Impl"
    // InternalEfforts.g:303:1: rule__Effort__Group__2__Impl : ( ':' ) ;
    public final void rule__Effort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:307:1: ( ( ':' ) )
            // InternalEfforts.g:308:1: ( ':' )
            {
            // InternalEfforts.g:308:1: ( ':' )
            // InternalEfforts.g:309:2: ':'
            {
             before(grammarAccess.getEffortAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEffortAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Effort__Group__2__Impl"


    // $ANTLR start "rule__Effort__Group__3"
    // InternalEfforts.g:318:1: rule__Effort__Group__3 : rule__Effort__Group__3__Impl ;
    public final void rule__Effort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:322:1: ( rule__Effort__Group__3__Impl )
            // InternalEfforts.g:323:2: rule__Effort__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effort__Group__3__Impl();

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
    // $ANTLR end "rule__Effort__Group__3"


    // $ANTLR start "rule__Effort__Group__3__Impl"
    // InternalEfforts.g:329:1: rule__Effort__Group__3__Impl : ( ( rule__Effort__MonthsAssignment_3 ) ) ;
    public final void rule__Effort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:333:1: ( ( ( rule__Effort__MonthsAssignment_3 ) ) )
            // InternalEfforts.g:334:1: ( ( rule__Effort__MonthsAssignment_3 ) )
            {
            // InternalEfforts.g:334:1: ( ( rule__Effort__MonthsAssignment_3 ) )
            // InternalEfforts.g:335:2: ( rule__Effort__MonthsAssignment_3 )
            {
             before(grammarAccess.getEffortAccess().getMonthsAssignment_3()); 
            // InternalEfforts.g:336:2: ( rule__Effort__MonthsAssignment_3 )
            // InternalEfforts.g:336:3: rule__Effort__MonthsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Effort__MonthsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffortAccess().getMonthsAssignment_3()); 

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
    // $ANTLR end "rule__Effort__Group__3__Impl"


    // $ANTLR start "rule__Main__EffortsAssignment_1"
    // InternalEfforts.g:345:1: rule__Main__EffortsAssignment_1 : ( ruleEffort ) ;
    public final void rule__Main__EffortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:349:1: ( ( ruleEffort ) )
            // InternalEfforts.g:350:2: ( ruleEffort )
            {
            // InternalEfforts.g:350:2: ( ruleEffort )
            // InternalEfforts.g:351:3: ruleEffort
            {
             before(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffort();

            state._fsp--;

             after(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Main__EffortsAssignment_1"


    // $ANTLR start "rule__Main__EffortsAssignment_2_1"
    // InternalEfforts.g:360:1: rule__Main__EffortsAssignment_2_1 : ( ruleEffort ) ;
    public final void rule__Main__EffortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:364:1: ( ( ruleEffort ) )
            // InternalEfforts.g:365:2: ( ruleEffort )
            {
            // InternalEfforts.g:365:2: ( ruleEffort )
            // InternalEfforts.g:366:3: ruleEffort
            {
             before(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffort();

            state._fsp--;

             after(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Main__EffortsAssignment_2_1"


    // $ANTLR start "rule__Effort__PersonAssignment_1"
    // InternalEfforts.g:375:1: rule__Effort__PersonAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Effort__PersonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:379:1: ( ( ( RULE_ID ) ) )
            // InternalEfforts.g:380:2: ( ( RULE_ID ) )
            {
            // InternalEfforts.g:380:2: ( ( RULE_ID ) )
            // InternalEfforts.g:381:3: ( RULE_ID )
            {
             before(grammarAccess.getEffortAccess().getPersonPersonCrossReference_1_0()); 
            // InternalEfforts.g:382:3: ( RULE_ID )
            // InternalEfforts.g:383:4: RULE_ID
            {
             before(grammarAccess.getEffortAccess().getPersonPersonIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffortAccess().getPersonPersonIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEffortAccess().getPersonPersonCrossReference_1_0()); 

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
    // $ANTLR end "rule__Effort__PersonAssignment_1"


    // $ANTLR start "rule__Effort__MonthsAssignment_3"
    // InternalEfforts.g:394:1: rule__Effort__MonthsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Effort__MonthsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:398:1: ( ( RULE_INT ) )
            // InternalEfforts.g:399:2: ( RULE_INT )
            {
            // InternalEfforts.g:399:2: ( RULE_INT )
            // InternalEfforts.g:400:3: RULE_INT
            {
             before(grammarAccess.getEffortAccess().getMonthsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffortAccess().getMonthsINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Effort__MonthsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});

}