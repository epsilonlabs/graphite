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
import java.util.Map;
import java.util.HashMap;
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
    // InternalEfforts.g:54:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalEfforts.g:55:1: ( ruleMain EOF )
            // InternalEfforts.g:56:1: ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainRule()); 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalEfforts.g:63:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:67:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalEfforts.g:68:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalEfforts.g:68:2: ( ( rule__Main__Group__0 ) )
            // InternalEfforts.g:69:3: ( rule__Main__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getGroup()); 
            }
            // InternalEfforts.g:70:3: ( rule__Main__Group__0 )
            // InternalEfforts.g:70:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getGroup()); 
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleEffort"
    // InternalEfforts.g:79:1: entryRuleEffort : ruleEffort EOF ;
    public final void entryRuleEffort() throws RecognitionException {
        try {
            // InternalEfforts.g:80:1: ( ruleEffort EOF )
            // InternalEfforts.g:81:1: ruleEffort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEffort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortRule()); 
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
    // $ANTLR end "entryRuleEffort"


    // $ANTLR start "ruleEffort"
    // InternalEfforts.g:88:1: ruleEffort : ( ( rule__Effort__Group__0 ) ) ;
    public final void ruleEffort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:92:2: ( ( ( rule__Effort__Group__0 ) ) )
            // InternalEfforts.g:93:2: ( ( rule__Effort__Group__0 ) )
            {
            // InternalEfforts.g:93:2: ( ( rule__Effort__Group__0 ) )
            // InternalEfforts.g:94:3: ( rule__Effort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortAccess().getGroup()); 
            }
            // InternalEfforts.g:95:3: ( rule__Effort__Group__0 )
            // InternalEfforts.g:95:4: rule__Effort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortAccess().getGroup()); 
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
    // $ANTLR end "ruleEffort"


    // $ANTLR start "rule__Main__Group__0"
    // InternalEfforts.g:103:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:107:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalEfforts.g:108:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalEfforts.g:115:1: rule__Main__Group__0__Impl : ( () ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:119:1: ( ( () ) )
            // InternalEfforts.g:120:1: ( () )
            {
            // InternalEfforts.g:120:1: ( () )
            // InternalEfforts.g:121:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getTaskAction_0()); 
            }
            // InternalEfforts.g:122:2: ()
            // InternalEfforts.g:122:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getTaskAction_0()); 
            }

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
    // InternalEfforts.g:130:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:134:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalEfforts.g:135:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group__2();

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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalEfforts.g:142:1: rule__Main__Group__1__Impl : ( ( rule__Main__EffortsAssignment_1 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:146:1: ( ( ( rule__Main__EffortsAssignment_1 )? ) )
            // InternalEfforts.g:147:1: ( ( rule__Main__EffortsAssignment_1 )? )
            {
            // InternalEfforts.g:147:1: ( ( rule__Main__EffortsAssignment_1 )? )
            // InternalEfforts.g:148:2: ( rule__Main__EffortsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getEffortsAssignment_1()); 
            }
            // InternalEfforts.g:149:2: ( rule__Main__EffortsAssignment_1 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEfforts.g:149:3: rule__Main__EffortsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__EffortsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getEffortsAssignment_1()); 
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
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // InternalEfforts.g:157:1: rule__Main__Group__2 : rule__Main__Group__2__Impl ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:161:1: ( rule__Main__Group__2__Impl )
            // InternalEfforts.g:162:2: rule__Main__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__2__Impl();

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
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // InternalEfforts.g:168:1: rule__Main__Group__2__Impl : ( ( rule__Main__Group_2__0 )* ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:172:1: ( ( ( rule__Main__Group_2__0 )* ) )
            // InternalEfforts.g:173:1: ( ( rule__Main__Group_2__0 )* )
            {
            // InternalEfforts.g:173:1: ( ( rule__Main__Group_2__0 )* )
            // InternalEfforts.g:174:2: ( rule__Main__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getGroup_2()); 
            }
            // InternalEfforts.g:175:2: ( rule__Main__Group_2__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEfforts.g:175:3: rule__Main__Group_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Main__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group_2__0"
    // InternalEfforts.g:184:1: rule__Main__Group_2__0 : rule__Main__Group_2__0__Impl rule__Main__Group_2__1 ;
    public final void rule__Main__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:188:1: ( rule__Main__Group_2__0__Impl rule__Main__Group_2__1 )
            // InternalEfforts.g:189:2: rule__Main__Group_2__0__Impl rule__Main__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Main__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Main__Group_2__1();

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
    // $ANTLR end "rule__Main__Group_2__0"


    // $ANTLR start "rule__Main__Group_2__0__Impl"
    // InternalEfforts.g:196:1: rule__Main__Group_2__0__Impl : ( RULE_NEWLINE ) ;
    public final void rule__Main__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:200:1: ( ( RULE_NEWLINE ) )
            // InternalEfforts.g:201:1: ( RULE_NEWLINE )
            {
            // InternalEfforts.g:201:1: ( RULE_NEWLINE )
            // InternalEfforts.g:202:2: RULE_NEWLINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getNEWLINETerminalRuleCall_2_0()); 
            }
            match(input,RULE_NEWLINE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getNEWLINETerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Main__Group_2__0__Impl"


    // $ANTLR start "rule__Main__Group_2__1"
    // InternalEfforts.g:211:1: rule__Main__Group_2__1 : rule__Main__Group_2__1__Impl ;
    public final void rule__Main__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:215:1: ( rule__Main__Group_2__1__Impl )
            // InternalEfforts.g:216:2: rule__Main__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_2__1__Impl();

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
    // $ANTLR end "rule__Main__Group_2__1"


    // $ANTLR start "rule__Main__Group_2__1__Impl"
    // InternalEfforts.g:222:1: rule__Main__Group_2__1__Impl : ( ( rule__Main__EffortsAssignment_2_1 ) ) ;
    public final void rule__Main__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:226:1: ( ( ( rule__Main__EffortsAssignment_2_1 ) ) )
            // InternalEfforts.g:227:1: ( ( rule__Main__EffortsAssignment_2_1 ) )
            {
            // InternalEfforts.g:227:1: ( ( rule__Main__EffortsAssignment_2_1 ) )
            // InternalEfforts.g:228:2: ( rule__Main__EffortsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getEffortsAssignment_2_1()); 
            }
            // InternalEfforts.g:229:2: ( rule__Main__EffortsAssignment_2_1 )
            // InternalEfforts.g:229:3: rule__Main__EffortsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Main__EffortsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getEffortsAssignment_2_1()); 
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
    // $ANTLR end "rule__Main__Group_2__1__Impl"


    // $ANTLR start "rule__Effort__Group__0"
    // InternalEfforts.g:238:1: rule__Effort__Group__0 : rule__Effort__Group__0__Impl rule__Effort__Group__1 ;
    public final void rule__Effort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:242:1: ( rule__Effort__Group__0__Impl rule__Effort__Group__1 )
            // InternalEfforts.g:243:2: rule__Effort__Group__0__Impl rule__Effort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Effort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Effort__Group__1();

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
    // $ANTLR end "rule__Effort__Group__0"


    // $ANTLR start "rule__Effort__Group__0__Impl"
    // InternalEfforts.g:250:1: rule__Effort__Group__0__Impl : ( () ) ;
    public final void rule__Effort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:254:1: ( ( () ) )
            // InternalEfforts.g:255:1: ( () )
            {
            // InternalEfforts.g:255:1: ( () )
            // InternalEfforts.g:256:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortAccess().getEffortAction_0()); 
            }
            // InternalEfforts.g:257:2: ()
            // InternalEfforts.g:257:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortAccess().getEffortAction_0()); 
            }

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
    // InternalEfforts.g:265:1: rule__Effort__Group__1 : rule__Effort__Group__1__Impl rule__Effort__Group__2 ;
    public final void rule__Effort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:269:1: ( rule__Effort__Group__1__Impl rule__Effort__Group__2 )
            // InternalEfforts.g:270:2: rule__Effort__Group__1__Impl rule__Effort__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Effort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Effort__Group__2();

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
    // $ANTLR end "rule__Effort__Group__1"


    // $ANTLR start "rule__Effort__Group__1__Impl"
    // InternalEfforts.g:277:1: rule__Effort__Group__1__Impl : ( ( rule__Effort__PersonAssignment_1 )? ) ;
    public final void rule__Effort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:281:1: ( ( ( rule__Effort__PersonAssignment_1 )? ) )
            // InternalEfforts.g:282:1: ( ( rule__Effort__PersonAssignment_1 )? )
            {
            // InternalEfforts.g:282:1: ( ( rule__Effort__PersonAssignment_1 )? )
            // InternalEfforts.g:283:2: ( rule__Effort__PersonAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortAccess().getPersonAssignment_1()); 
            }
            // InternalEfforts.g:284:2: ( rule__Effort__PersonAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEfforts.g:284:3: rule__Effort__PersonAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Effort__PersonAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortAccess().getPersonAssignment_1()); 
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
    // $ANTLR end "rule__Effort__Group__1__Impl"


    // $ANTLR start "rule__Effort__Group__2"
    // InternalEfforts.g:292:1: rule__Effort__Group__2 : rule__Effort__Group__2__Impl rule__Effort__Group__3 ;
    public final void rule__Effort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:296:1: ( rule__Effort__Group__2__Impl rule__Effort__Group__3 )
            // InternalEfforts.g:297:2: rule__Effort__Group__2__Impl rule__Effort__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Effort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Effort__Group__3();

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
    // $ANTLR end "rule__Effort__Group__2"


    // $ANTLR start "rule__Effort__Group__2__Impl"
    // InternalEfforts.g:304:1: rule__Effort__Group__2__Impl : ( ':' ) ;
    public final void rule__Effort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:308:1: ( ( ':' ) )
            // InternalEfforts.g:309:1: ( ':' )
            {
            // InternalEfforts.g:309:1: ( ':' )
            // InternalEfforts.g:310:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortAccess().getColonKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Effort__Group__2__Impl"


    // $ANTLR start "rule__Effort__Group__3"
    // InternalEfforts.g:319:1: rule__Effort__Group__3 : rule__Effort__Group__3__Impl ;
    public final void rule__Effort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:323:1: ( rule__Effort__Group__3__Impl )
            // InternalEfforts.g:324:2: rule__Effort__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effort__Group__3__Impl();

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
    // $ANTLR end "rule__Effort__Group__3"


    // $ANTLR start "rule__Effort__Group__3__Impl"
    // InternalEfforts.g:330:1: rule__Effort__Group__3__Impl : ( ( rule__Effort__MonthsAssignment_3 ) ) ;
    public final void rule__Effort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:334:1: ( ( ( rule__Effort__MonthsAssignment_3 ) ) )
            // InternalEfforts.g:335:1: ( ( rule__Effort__MonthsAssignment_3 ) )
            {
            // InternalEfforts.g:335:1: ( ( rule__Effort__MonthsAssignment_3 ) )
            // InternalEfforts.g:336:2: ( rule__Effort__MonthsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortAccess().getMonthsAssignment_3()); 
            }
            // InternalEfforts.g:337:2: ( rule__Effort__MonthsAssignment_3 )
            // InternalEfforts.g:337:3: rule__Effort__MonthsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Effort__MonthsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortAccess().getMonthsAssignment_3()); 
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
    // $ANTLR end "rule__Effort__Group__3__Impl"


    // $ANTLR start "rule__Main__EffortsAssignment_1"
    // InternalEfforts.g:346:1: rule__Main__EffortsAssignment_1 : ( ruleEffort ) ;
    public final void rule__Main__EffortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:350:1: ( ( ruleEffort ) )
            // InternalEfforts.g:351:2: ( ruleEffort )
            {
            // InternalEfforts.g:351:2: ( ruleEffort )
            // InternalEfforts.g:352:3: ruleEffort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEffort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Main__EffortsAssignment_1"


    // $ANTLR start "rule__Main__EffortsAssignment_2_1"
    // InternalEfforts.g:361:1: rule__Main__EffortsAssignment_2_1 : ( ruleEffort ) ;
    public final void rule__Main__EffortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:365:1: ( ( ruleEffort ) )
            // InternalEfforts.g:366:2: ( ruleEffort )
            {
            // InternalEfforts.g:366:2: ( ruleEffort )
            // InternalEfforts.g:367:3: ruleEffort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEffort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getEffortsEffortParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Main__EffortsAssignment_2_1"


    // $ANTLR start "rule__Effort__PersonAssignment_1"
    // InternalEfforts.g:376:1: rule__Effort__PersonAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Effort__PersonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:380:1: ( ( ( RULE_ID ) ) )
            // InternalEfforts.g:381:2: ( ( RULE_ID ) )
            {
            // InternalEfforts.g:381:2: ( ( RULE_ID ) )
            // InternalEfforts.g:382:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortAccess().getPersonPersonCrossReference_1_0()); 
            }
            // InternalEfforts.g:383:3: ( RULE_ID )
            // InternalEfforts.g:384:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortAccess().getPersonPersonIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortAccess().getPersonPersonIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortAccess().getPersonPersonCrossReference_1_0()); 
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
    // $ANTLR end "rule__Effort__PersonAssignment_1"


    // $ANTLR start "rule__Effort__MonthsAssignment_3"
    // InternalEfforts.g:395:1: rule__Effort__MonthsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Effort__MonthsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEfforts.g:399:1: ( ( RULE_INT ) )
            // InternalEfforts.g:400:2: ( RULE_INT )
            {
            // InternalEfforts.g:400:2: ( RULE_INT )
            // InternalEfforts.g:401:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffortAccess().getMonthsINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffortAccess().getMonthsINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Effort__MonthsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});

}