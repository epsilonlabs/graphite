package org.netapp.pcs.grammarSnapMirror.ide.contentassist.antlr.internal;

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
import org.netapp.pcs.grammarSnapMirror.services.ReplicationMappingsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalReplicationMappingsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'.'", "'{'", "'}'", "'policy'", "':'", "','", "'max_transfer_rate'", "'-'", "'<->'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
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


    	private ReplicationMappingsGrammarAccess grammarAccess;

    	public void setGrammarAccess(ReplicationMappingsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleReplicationPolicy"
    // InternalReplicationMappings.g:54:1: entryRuleReplicationPolicy : ruleReplicationPolicy EOF ;
    public final void entryRuleReplicationPolicy() throws RecognitionException {
        try {
            // InternalReplicationMappings.g:55:1: ( ruleReplicationPolicy EOF )
            // InternalReplicationMappings.g:56:1: ruleReplicationPolicy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReplicationPolicy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyRule()); 
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
    // $ANTLR end "entryRuleReplicationPolicy"


    // $ANTLR start "ruleReplicationPolicy"
    // InternalReplicationMappings.g:63:1: ruleReplicationPolicy : ( ( rule__ReplicationPolicy__Group__0 ) ) ;
    public final void ruleReplicationPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:67:2: ( ( ( rule__ReplicationPolicy__Group__0 ) ) )
            // InternalReplicationMappings.g:68:2: ( ( rule__ReplicationPolicy__Group__0 ) )
            {
            // InternalReplicationMappings.g:68:2: ( ( rule__ReplicationPolicy__Group__0 ) )
            // InternalReplicationMappings.g:69:3: ( rule__ReplicationPolicy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyAccess().getGroup()); 
            }
            // InternalReplicationMappings.g:70:3: ( rule__ReplicationPolicy__Group__0 )
            // InternalReplicationMappings.g:70:4: rule__ReplicationPolicy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationPolicy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyAccess().getGroup()); 
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
    // $ANTLR end "ruleReplicationPolicy"


    // $ANTLR start "entryRuleReplicationMappings"
    // InternalReplicationMappings.g:79:1: entryRuleReplicationMappings : ruleReplicationMappings EOF ;
    public final void entryRuleReplicationMappings() throws RecognitionException {
        try {
            // InternalReplicationMappings.g:80:1: ( ruleReplicationMappings EOF )
            // InternalReplicationMappings.g:81:1: ruleReplicationMappings EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReplicationMappings();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsRule()); 
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
    // $ANTLR end "entryRuleReplicationMappings"


    // $ANTLR start "ruleReplicationMappings"
    // InternalReplicationMappings.g:88:1: ruleReplicationMappings : ( ( rule__ReplicationMappings__Group__0 ) ) ;
    public final void ruleReplicationMappings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:92:2: ( ( ( rule__ReplicationMappings__Group__0 ) ) )
            // InternalReplicationMappings.g:93:2: ( ( rule__ReplicationMappings__Group__0 ) )
            {
            // InternalReplicationMappings.g:93:2: ( ( rule__ReplicationMappings__Group__0 ) )
            // InternalReplicationMappings.g:94:3: ( rule__ReplicationMappings__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getGroup()); 
            }
            // InternalReplicationMappings.g:95:3: ( rule__ReplicationMappings__Group__0 )
            // InternalReplicationMappings.g:95:4: rule__ReplicationMappings__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getGroup()); 
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
    // $ANTLR end "ruleReplicationMappings"


    // $ANTLR start "entryRuleEInt"
    // InternalReplicationMappings.g:104:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalReplicationMappings.g:105:1: ( ruleEInt EOF )
            // InternalReplicationMappings.g:106:1: ruleEInt EOF
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
    // InternalReplicationMappings.g:113:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:117:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalReplicationMappings.g:118:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalReplicationMappings.g:118:2: ( ( rule__EInt__Group__0 ) )
            // InternalReplicationMappings.g:119:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalReplicationMappings.g:120:3: ( rule__EInt__Group__0 )
            // InternalReplicationMappings.g:120:4: rule__EInt__Group__0
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


    // $ANTLR start "rule__ReplicationMappings__Alternatives_2"
    // InternalReplicationMappings.g:128:1: rule__ReplicationMappings__Alternatives_2 : ( ( '->' ) | ( ( rule__ReplicationMappings__BidirectionalAssignment_2_1 ) ) );
    public final void rule__ReplicationMappings__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:132:1: ( ( '->' ) | ( ( rule__ReplicationMappings__BidirectionalAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
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
                    // InternalReplicationMappings.g:133:2: ( '->' )
                    {
                    // InternalReplicationMappings.g:133:2: ( '->' )
                    // InternalReplicationMappings.g:134:3: '->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReplicationMappingsAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReplicationMappingsAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReplicationMappings.g:139:2: ( ( rule__ReplicationMappings__BidirectionalAssignment_2_1 ) )
                    {
                    // InternalReplicationMappings.g:139:2: ( ( rule__ReplicationMappings__BidirectionalAssignment_2_1 ) )
                    // InternalReplicationMappings.g:140:3: ( rule__ReplicationMappings__BidirectionalAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReplicationMappingsAccess().getBidirectionalAssignment_2_1()); 
                    }
                    // InternalReplicationMappings.g:141:3: ( rule__ReplicationMappings__BidirectionalAssignment_2_1 )
                    // InternalReplicationMappings.g:141:4: rule__ReplicationMappings__BidirectionalAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReplicationMappings__BidirectionalAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReplicationMappingsAccess().getBidirectionalAssignment_2_1()); 
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
    // $ANTLR end "rule__ReplicationMappings__Alternatives_2"


    // $ANTLR start "rule__ReplicationPolicy__Group__0"
    // InternalReplicationMappings.g:149:1: rule__ReplicationPolicy__Group__0 : rule__ReplicationPolicy__Group__0__Impl rule__ReplicationPolicy__Group__1 ;
    public final void rule__ReplicationPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:153:1: ( rule__ReplicationPolicy__Group__0__Impl rule__ReplicationPolicy__Group__1 )
            // InternalReplicationMappings.g:154:2: rule__ReplicationPolicy__Group__0__Impl rule__ReplicationPolicy__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReplicationPolicy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationPolicy__Group__1();

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
    // $ANTLR end "rule__ReplicationPolicy__Group__0"


    // $ANTLR start "rule__ReplicationPolicy__Group__0__Impl"
    // InternalReplicationMappings.g:161:1: rule__ReplicationPolicy__Group__0__Impl : ( () ) ;
    public final void rule__ReplicationPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:165:1: ( ( () ) )
            // InternalReplicationMappings.g:166:1: ( () )
            {
            // InternalReplicationMappings.g:166:1: ( () )
            // InternalReplicationMappings.g:167:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyAccess().getReplicationPolicyAction_0()); 
            }
            // InternalReplicationMappings.g:168:2: ()
            // InternalReplicationMappings.g:168:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyAccess().getReplicationPolicyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReplicationPolicy__Group__0__Impl"


    // $ANTLR start "rule__ReplicationPolicy__Group__1"
    // InternalReplicationMappings.g:176:1: rule__ReplicationPolicy__Group__1 : rule__ReplicationPolicy__Group__1__Impl rule__ReplicationPolicy__Group__2 ;
    public final void rule__ReplicationPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:180:1: ( rule__ReplicationPolicy__Group__1__Impl rule__ReplicationPolicy__Group__2 )
            // InternalReplicationMappings.g:181:2: rule__ReplicationPolicy__Group__1__Impl rule__ReplicationPolicy__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReplicationPolicy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationPolicy__Group__2();

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
    // $ANTLR end "rule__ReplicationPolicy__Group__1"


    // $ANTLR start "rule__ReplicationPolicy__Group__1__Impl"
    // InternalReplicationMappings.g:188:1: rule__ReplicationPolicy__Group__1__Impl : ( ( rule__ReplicationPolicy__Replication_mappingsAssignment_1 ) ) ;
    public final void rule__ReplicationPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:192:1: ( ( ( rule__ReplicationPolicy__Replication_mappingsAssignment_1 ) ) )
            // InternalReplicationMappings.g:193:1: ( ( rule__ReplicationPolicy__Replication_mappingsAssignment_1 ) )
            {
            // InternalReplicationMappings.g:193:1: ( ( rule__ReplicationPolicy__Replication_mappingsAssignment_1 ) )
            // InternalReplicationMappings.g:194:2: ( rule__ReplicationPolicy__Replication_mappingsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsAssignment_1()); 
            }
            // InternalReplicationMappings.g:195:2: ( rule__ReplicationPolicy__Replication_mappingsAssignment_1 )
            // InternalReplicationMappings.g:195:3: rule__ReplicationPolicy__Replication_mappingsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationPolicy__Replication_mappingsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsAssignment_1()); 
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
    // $ANTLR end "rule__ReplicationPolicy__Group__1__Impl"


    // $ANTLR start "rule__ReplicationPolicy__Group__2"
    // InternalReplicationMappings.g:203:1: rule__ReplicationPolicy__Group__2 : rule__ReplicationPolicy__Group__2__Impl ;
    public final void rule__ReplicationPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:207:1: ( rule__ReplicationPolicy__Group__2__Impl )
            // InternalReplicationMappings.g:208:2: rule__ReplicationPolicy__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationPolicy__Group__2__Impl();

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
    // $ANTLR end "rule__ReplicationPolicy__Group__2"


    // $ANTLR start "rule__ReplicationPolicy__Group__2__Impl"
    // InternalReplicationMappings.g:214:1: rule__ReplicationPolicy__Group__2__Impl : ( ( rule__ReplicationPolicy__Group_2__0 )* ) ;
    public final void rule__ReplicationPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:218:1: ( ( ( rule__ReplicationPolicy__Group_2__0 )* ) )
            // InternalReplicationMappings.g:219:1: ( ( rule__ReplicationPolicy__Group_2__0 )* )
            {
            // InternalReplicationMappings.g:219:1: ( ( rule__ReplicationPolicy__Group_2__0 )* )
            // InternalReplicationMappings.g:220:2: ( rule__ReplicationPolicy__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyAccess().getGroup_2()); 
            }
            // InternalReplicationMappings.g:221:2: ( rule__ReplicationPolicy__Group_2__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReplicationMappings.g:221:3: rule__ReplicationPolicy__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ReplicationPolicy__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ReplicationPolicy__Group__2__Impl"


    // $ANTLR start "rule__ReplicationPolicy__Group_2__0"
    // InternalReplicationMappings.g:230:1: rule__ReplicationPolicy__Group_2__0 : rule__ReplicationPolicy__Group_2__0__Impl rule__ReplicationPolicy__Group_2__1 ;
    public final void rule__ReplicationPolicy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:234:1: ( rule__ReplicationPolicy__Group_2__0__Impl rule__ReplicationPolicy__Group_2__1 )
            // InternalReplicationMappings.g:235:2: rule__ReplicationPolicy__Group_2__0__Impl rule__ReplicationPolicy__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ReplicationPolicy__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationPolicy__Group_2__1();

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
    // $ANTLR end "rule__ReplicationPolicy__Group_2__0"


    // $ANTLR start "rule__ReplicationPolicy__Group_2__0__Impl"
    // InternalReplicationMappings.g:242:1: rule__ReplicationPolicy__Group_2__0__Impl : ( RULE_NEWLINE ) ;
    public final void rule__ReplicationPolicy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:246:1: ( ( RULE_NEWLINE ) )
            // InternalReplicationMappings.g:247:1: ( RULE_NEWLINE )
            {
            // InternalReplicationMappings.g:247:1: ( RULE_NEWLINE )
            // InternalReplicationMappings.g:248:2: RULE_NEWLINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyAccess().getNEWLINETerminalRuleCall_2_0()); 
            }
            match(input,RULE_NEWLINE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyAccess().getNEWLINETerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__ReplicationPolicy__Group_2__0__Impl"


    // $ANTLR start "rule__ReplicationPolicy__Group_2__1"
    // InternalReplicationMappings.g:257:1: rule__ReplicationPolicy__Group_2__1 : rule__ReplicationPolicy__Group_2__1__Impl ;
    public final void rule__ReplicationPolicy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:261:1: ( rule__ReplicationPolicy__Group_2__1__Impl )
            // InternalReplicationMappings.g:262:2: rule__ReplicationPolicy__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationPolicy__Group_2__1__Impl();

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
    // $ANTLR end "rule__ReplicationPolicy__Group_2__1"


    // $ANTLR start "rule__ReplicationPolicy__Group_2__1__Impl"
    // InternalReplicationMappings.g:268:1: rule__ReplicationPolicy__Group_2__1__Impl : ( ( rule__ReplicationPolicy__Replication_mappingsAssignment_2_1 ) ) ;
    public final void rule__ReplicationPolicy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:272:1: ( ( ( rule__ReplicationPolicy__Replication_mappingsAssignment_2_1 ) ) )
            // InternalReplicationMappings.g:273:1: ( ( rule__ReplicationPolicy__Replication_mappingsAssignment_2_1 ) )
            {
            // InternalReplicationMappings.g:273:1: ( ( rule__ReplicationPolicy__Replication_mappingsAssignment_2_1 ) )
            // InternalReplicationMappings.g:274:2: ( rule__ReplicationPolicy__Replication_mappingsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsAssignment_2_1()); 
            }
            // InternalReplicationMappings.g:275:2: ( rule__ReplicationPolicy__Replication_mappingsAssignment_2_1 )
            // InternalReplicationMappings.g:275:3: rule__ReplicationPolicy__Replication_mappingsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationPolicy__Replication_mappingsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsAssignment_2_1()); 
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
    // $ANTLR end "rule__ReplicationPolicy__Group_2__1__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group__0"
    // InternalReplicationMappings.g:284:1: rule__ReplicationMappings__Group__0 : rule__ReplicationMappings__Group__0__Impl rule__ReplicationMappings__Group__1 ;
    public final void rule__ReplicationMappings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:288:1: ( rule__ReplicationMappings__Group__0__Impl rule__ReplicationMappings__Group__1 )
            // InternalReplicationMappings.g:289:2: rule__ReplicationMappings__Group__0__Impl rule__ReplicationMappings__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReplicationMappings__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group__1();

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
    // $ANTLR end "rule__ReplicationMappings__Group__0"


    // $ANTLR start "rule__ReplicationMappings__Group__0__Impl"
    // InternalReplicationMappings.g:296:1: rule__ReplicationMappings__Group__0__Impl : ( () ) ;
    public final void rule__ReplicationMappings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:300:1: ( ( () ) )
            // InternalReplicationMappings.g:301:1: ( () )
            {
            // InternalReplicationMappings.g:301:1: ( () )
            // InternalReplicationMappings.g:302:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getSnapMirrorAction_0()); 
            }
            // InternalReplicationMappings.g:303:2: ()
            // InternalReplicationMappings.g:303:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getSnapMirrorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReplicationMappings__Group__0__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group__1"
    // InternalReplicationMappings.g:311:1: rule__ReplicationMappings__Group__1 : rule__ReplicationMappings__Group__1__Impl rule__ReplicationMappings__Group__2 ;
    public final void rule__ReplicationMappings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:315:1: ( rule__ReplicationMappings__Group__1__Impl rule__ReplicationMappings__Group__2 )
            // InternalReplicationMappings.g:316:2: rule__ReplicationMappings__Group__1__Impl rule__ReplicationMappings__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ReplicationMappings__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group__2();

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
    // $ANTLR end "rule__ReplicationMappings__Group__1"


    // $ANTLR start "rule__ReplicationMappings__Group__1__Impl"
    // InternalReplicationMappings.g:323:1: rule__ReplicationMappings__Group__1__Impl : ( ( rule__ReplicationMappings__Group_1__0 )? ) ;
    public final void rule__ReplicationMappings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:327:1: ( ( ( rule__ReplicationMappings__Group_1__0 )? ) )
            // InternalReplicationMappings.g:328:1: ( ( rule__ReplicationMappings__Group_1__0 )? )
            {
            // InternalReplicationMappings.g:328:1: ( ( rule__ReplicationMappings__Group_1__0 )? )
            // InternalReplicationMappings.g:329:2: ( rule__ReplicationMappings__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getGroup_1()); 
            }
            // InternalReplicationMappings.g:330:2: ( rule__ReplicationMappings__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReplicationMappings.g:330:3: rule__ReplicationMappings__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReplicationMappings__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group__1__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group__2"
    // InternalReplicationMappings.g:338:1: rule__ReplicationMappings__Group__2 : rule__ReplicationMappings__Group__2__Impl rule__ReplicationMappings__Group__3 ;
    public final void rule__ReplicationMappings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:342:1: ( rule__ReplicationMappings__Group__2__Impl rule__ReplicationMappings__Group__3 )
            // InternalReplicationMappings.g:343:2: rule__ReplicationMappings__Group__2__Impl rule__ReplicationMappings__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ReplicationMappings__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group__3();

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
    // $ANTLR end "rule__ReplicationMappings__Group__2"


    // $ANTLR start "rule__ReplicationMappings__Group__2__Impl"
    // InternalReplicationMappings.g:350:1: rule__ReplicationMappings__Group__2__Impl : ( ( rule__ReplicationMappings__Alternatives_2 ) ) ;
    public final void rule__ReplicationMappings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:354:1: ( ( ( rule__ReplicationMappings__Alternatives_2 ) ) )
            // InternalReplicationMappings.g:355:1: ( ( rule__ReplicationMappings__Alternatives_2 ) )
            {
            // InternalReplicationMappings.g:355:1: ( ( rule__ReplicationMappings__Alternatives_2 ) )
            // InternalReplicationMappings.g:356:2: ( rule__ReplicationMappings__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getAlternatives_2()); 
            }
            // InternalReplicationMappings.g:357:2: ( rule__ReplicationMappings__Alternatives_2 )
            // InternalReplicationMappings.g:357:3: rule__ReplicationMappings__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group__2__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group__3"
    // InternalReplicationMappings.g:365:1: rule__ReplicationMappings__Group__3 : rule__ReplicationMappings__Group__3__Impl rule__ReplicationMappings__Group__4 ;
    public final void rule__ReplicationMappings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:369:1: ( rule__ReplicationMappings__Group__3__Impl rule__ReplicationMappings__Group__4 )
            // InternalReplicationMappings.g:370:2: rule__ReplicationMappings__Group__3__Impl rule__ReplicationMappings__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ReplicationMappings__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group__4();

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
    // $ANTLR end "rule__ReplicationMappings__Group__3"


    // $ANTLR start "rule__ReplicationMappings__Group__3__Impl"
    // InternalReplicationMappings.g:377:1: rule__ReplicationMappings__Group__3__Impl : ( ( rule__ReplicationMappings__Group_3__0 )? ) ;
    public final void rule__ReplicationMappings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:381:1: ( ( ( rule__ReplicationMappings__Group_3__0 )? ) )
            // InternalReplicationMappings.g:382:1: ( ( rule__ReplicationMappings__Group_3__0 )? )
            {
            // InternalReplicationMappings.g:382:1: ( ( rule__ReplicationMappings__Group_3__0 )? )
            // InternalReplicationMappings.g:383:2: ( rule__ReplicationMappings__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getGroup_3()); 
            }
            // InternalReplicationMappings.g:384:2: ( rule__ReplicationMappings__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReplicationMappings.g:384:3: rule__ReplicationMappings__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReplicationMappings__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getGroup_3()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group__3__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group__4"
    // InternalReplicationMappings.g:392:1: rule__ReplicationMappings__Group__4 : rule__ReplicationMappings__Group__4__Impl ;
    public final void rule__ReplicationMappings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:396:1: ( rule__ReplicationMappings__Group__4__Impl )
            // InternalReplicationMappings.g:397:2: rule__ReplicationMappings__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group__4__Impl();

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
    // $ANTLR end "rule__ReplicationMappings__Group__4"


    // $ANTLR start "rule__ReplicationMappings__Group__4__Impl"
    // InternalReplicationMappings.g:403:1: rule__ReplicationMappings__Group__4__Impl : ( ( rule__ReplicationMappings__Group_4__0 )? ) ;
    public final void rule__ReplicationMappings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:407:1: ( ( ( rule__ReplicationMappings__Group_4__0 )? ) )
            // InternalReplicationMappings.g:408:1: ( ( rule__ReplicationMappings__Group_4__0 )? )
            {
            // InternalReplicationMappings.g:408:1: ( ( rule__ReplicationMappings__Group_4__0 )? )
            // InternalReplicationMappings.g:409:2: ( rule__ReplicationMappings__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getGroup_4()); 
            }
            // InternalReplicationMappings.g:410:2: ( rule__ReplicationMappings__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReplicationMappings.g:410:3: rule__ReplicationMappings__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReplicationMappings__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getGroup_4()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group__4__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_1__0"
    // InternalReplicationMappings.g:419:1: rule__ReplicationMappings__Group_1__0 : rule__ReplicationMappings__Group_1__0__Impl rule__ReplicationMappings__Group_1__1 ;
    public final void rule__ReplicationMappings__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:423:1: ( rule__ReplicationMappings__Group_1__0__Impl rule__ReplicationMappings__Group_1__1 )
            // InternalReplicationMappings.g:424:2: rule__ReplicationMappings__Group_1__0__Impl rule__ReplicationMappings__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ReplicationMappings__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_1__1();

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
    // $ANTLR end "rule__ReplicationMappings__Group_1__0"


    // $ANTLR start "rule__ReplicationMappings__Group_1__0__Impl"
    // InternalReplicationMappings.g:431:1: rule__ReplicationMappings__Group_1__0__Impl : ( ( rule__ReplicationMappings__Source_cvoAssignment_1_0 ) ) ;
    public final void rule__ReplicationMappings__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:435:1: ( ( ( rule__ReplicationMappings__Source_cvoAssignment_1_0 ) ) )
            // InternalReplicationMappings.g:436:1: ( ( rule__ReplicationMappings__Source_cvoAssignment_1_0 ) )
            {
            // InternalReplicationMappings.g:436:1: ( ( rule__ReplicationMappings__Source_cvoAssignment_1_0 ) )
            // InternalReplicationMappings.g:437:2: ( rule__ReplicationMappings__Source_cvoAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getSource_cvoAssignment_1_0()); 
            }
            // InternalReplicationMappings.g:438:2: ( rule__ReplicationMappings__Source_cvoAssignment_1_0 )
            // InternalReplicationMappings.g:438:3: rule__ReplicationMappings__Source_cvoAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Source_cvoAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getSource_cvoAssignment_1_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_1__0__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_1__1"
    // InternalReplicationMappings.g:446:1: rule__ReplicationMappings__Group_1__1 : rule__ReplicationMappings__Group_1__1__Impl rule__ReplicationMappings__Group_1__2 ;
    public final void rule__ReplicationMappings__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:450:1: ( rule__ReplicationMappings__Group_1__1__Impl rule__ReplicationMappings__Group_1__2 )
            // InternalReplicationMappings.g:451:2: rule__ReplicationMappings__Group_1__1__Impl rule__ReplicationMappings__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ReplicationMappings__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_1__2();

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
    // $ANTLR end "rule__ReplicationMappings__Group_1__1"


    // $ANTLR start "rule__ReplicationMappings__Group_1__1__Impl"
    // InternalReplicationMappings.g:458:1: rule__ReplicationMappings__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ReplicationMappings__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:462:1: ( ( '.' ) )
            // InternalReplicationMappings.g:463:1: ( '.' )
            {
            // InternalReplicationMappings.g:463:1: ( '.' )
            // InternalReplicationMappings.g:464:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getFullStopKeyword_1_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getFullStopKeyword_1_1()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_1__1__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_1__2"
    // InternalReplicationMappings.g:473:1: rule__ReplicationMappings__Group_1__2 : rule__ReplicationMappings__Group_1__2__Impl ;
    public final void rule__ReplicationMappings__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:477:1: ( rule__ReplicationMappings__Group_1__2__Impl )
            // InternalReplicationMappings.g:478:2: rule__ReplicationMappings__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_1__2__Impl();

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
    // $ANTLR end "rule__ReplicationMappings__Group_1__2"


    // $ANTLR start "rule__ReplicationMappings__Group_1__2__Impl"
    // InternalReplicationMappings.g:484:1: rule__ReplicationMappings__Group_1__2__Impl : ( ( rule__ReplicationMappings__Source_volumeAssignment_1_2 )? ) ;
    public final void rule__ReplicationMappings__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:488:1: ( ( ( rule__ReplicationMappings__Source_volumeAssignment_1_2 )? ) )
            // InternalReplicationMappings.g:489:1: ( ( rule__ReplicationMappings__Source_volumeAssignment_1_2 )? )
            {
            // InternalReplicationMappings.g:489:1: ( ( rule__ReplicationMappings__Source_volumeAssignment_1_2 )? )
            // InternalReplicationMappings.g:490:2: ( rule__ReplicationMappings__Source_volumeAssignment_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getSource_volumeAssignment_1_2()); 
            }
            // InternalReplicationMappings.g:491:2: ( rule__ReplicationMappings__Source_volumeAssignment_1_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReplicationMappings.g:491:3: rule__ReplicationMappings__Source_volumeAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReplicationMappings__Source_volumeAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getSource_volumeAssignment_1_2()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_1__2__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_3__0"
    // InternalReplicationMappings.g:500:1: rule__ReplicationMappings__Group_3__0 : rule__ReplicationMappings__Group_3__0__Impl rule__ReplicationMappings__Group_3__1 ;
    public final void rule__ReplicationMappings__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:504:1: ( rule__ReplicationMappings__Group_3__0__Impl rule__ReplicationMappings__Group_3__1 )
            // InternalReplicationMappings.g:505:2: rule__ReplicationMappings__Group_3__0__Impl rule__ReplicationMappings__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ReplicationMappings__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_3__1();

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
    // $ANTLR end "rule__ReplicationMappings__Group_3__0"


    // $ANTLR start "rule__ReplicationMappings__Group_3__0__Impl"
    // InternalReplicationMappings.g:512:1: rule__ReplicationMappings__Group_3__0__Impl : ( ( rule__ReplicationMappings__Destination_cvoAssignment_3_0 ) ) ;
    public final void rule__ReplicationMappings__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:516:1: ( ( ( rule__ReplicationMappings__Destination_cvoAssignment_3_0 ) ) )
            // InternalReplicationMappings.g:517:1: ( ( rule__ReplicationMappings__Destination_cvoAssignment_3_0 ) )
            {
            // InternalReplicationMappings.g:517:1: ( ( rule__ReplicationMappings__Destination_cvoAssignment_3_0 ) )
            // InternalReplicationMappings.g:518:2: ( rule__ReplicationMappings__Destination_cvoAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getDestination_cvoAssignment_3_0()); 
            }
            // InternalReplicationMappings.g:519:2: ( rule__ReplicationMappings__Destination_cvoAssignment_3_0 )
            // InternalReplicationMappings.g:519:3: rule__ReplicationMappings__Destination_cvoAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Destination_cvoAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getDestination_cvoAssignment_3_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_3__0__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_3__1"
    // InternalReplicationMappings.g:527:1: rule__ReplicationMappings__Group_3__1 : rule__ReplicationMappings__Group_3__1__Impl rule__ReplicationMappings__Group_3__2 ;
    public final void rule__ReplicationMappings__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:531:1: ( rule__ReplicationMappings__Group_3__1__Impl rule__ReplicationMappings__Group_3__2 )
            // InternalReplicationMappings.g:532:2: rule__ReplicationMappings__Group_3__1__Impl rule__ReplicationMappings__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__ReplicationMappings__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_3__2();

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
    // $ANTLR end "rule__ReplicationMappings__Group_3__1"


    // $ANTLR start "rule__ReplicationMappings__Group_3__1__Impl"
    // InternalReplicationMappings.g:539:1: rule__ReplicationMappings__Group_3__1__Impl : ( '.' ) ;
    public final void rule__ReplicationMappings__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:543:1: ( ( '.' ) )
            // InternalReplicationMappings.g:544:1: ( '.' )
            {
            // InternalReplicationMappings.g:544:1: ( '.' )
            // InternalReplicationMappings.g:545:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getFullStopKeyword_3_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getFullStopKeyword_3_1()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_3__1__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_3__2"
    // InternalReplicationMappings.g:554:1: rule__ReplicationMappings__Group_3__2 : rule__ReplicationMappings__Group_3__2__Impl ;
    public final void rule__ReplicationMappings__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:558:1: ( rule__ReplicationMappings__Group_3__2__Impl )
            // InternalReplicationMappings.g:559:2: rule__ReplicationMappings__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_3__2__Impl();

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
    // $ANTLR end "rule__ReplicationMappings__Group_3__2"


    // $ANTLR start "rule__ReplicationMappings__Group_3__2__Impl"
    // InternalReplicationMappings.g:565:1: rule__ReplicationMappings__Group_3__2__Impl : ( ( rule__ReplicationMappings__Destination_volumeAssignment_3_2 )? ) ;
    public final void rule__ReplicationMappings__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:569:1: ( ( ( rule__ReplicationMappings__Destination_volumeAssignment_3_2 )? ) )
            // InternalReplicationMappings.g:570:1: ( ( rule__ReplicationMappings__Destination_volumeAssignment_3_2 )? )
            {
            // InternalReplicationMappings.g:570:1: ( ( rule__ReplicationMappings__Destination_volumeAssignment_3_2 )? )
            // InternalReplicationMappings.g:571:2: ( rule__ReplicationMappings__Destination_volumeAssignment_3_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getDestination_volumeAssignment_3_2()); 
            }
            // InternalReplicationMappings.g:572:2: ( rule__ReplicationMappings__Destination_volumeAssignment_3_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReplicationMappings.g:572:3: rule__ReplicationMappings__Destination_volumeAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReplicationMappings__Destination_volumeAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getDestination_volumeAssignment_3_2()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_3__2__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4__0"
    // InternalReplicationMappings.g:581:1: rule__ReplicationMappings__Group_4__0 : rule__ReplicationMappings__Group_4__0__Impl rule__ReplicationMappings__Group_4__1 ;
    public final void rule__ReplicationMappings__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:585:1: ( rule__ReplicationMappings__Group_4__0__Impl rule__ReplicationMappings__Group_4__1 )
            // InternalReplicationMappings.g:586:2: rule__ReplicationMappings__Group_4__0__Impl rule__ReplicationMappings__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__ReplicationMappings__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4__1();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4__0"


    // $ANTLR start "rule__ReplicationMappings__Group_4__0__Impl"
    // InternalReplicationMappings.g:593:1: rule__ReplicationMappings__Group_4__0__Impl : ( '{' ) ;
    public final void rule__ReplicationMappings__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:597:1: ( ( '{' ) )
            // InternalReplicationMappings.g:598:1: ( '{' )
            {
            // InternalReplicationMappings.g:598:1: ( '{' )
            // InternalReplicationMappings.g:599:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getLeftCurlyBracketKeyword_4_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getLeftCurlyBracketKeyword_4_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4__0__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4__1"
    // InternalReplicationMappings.g:608:1: rule__ReplicationMappings__Group_4__1 : rule__ReplicationMappings__Group_4__1__Impl rule__ReplicationMappings__Group_4__2 ;
    public final void rule__ReplicationMappings__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:612:1: ( rule__ReplicationMappings__Group_4__1__Impl rule__ReplicationMappings__Group_4__2 )
            // InternalReplicationMappings.g:613:2: rule__ReplicationMappings__Group_4__1__Impl rule__ReplicationMappings__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__ReplicationMappings__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4__2();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4__1"


    // $ANTLR start "rule__ReplicationMappings__Group_4__1__Impl"
    // InternalReplicationMappings.g:620:1: rule__ReplicationMappings__Group_4__1__Impl : ( ( rule__ReplicationMappings__Group_4_1__0 )? ) ;
    public final void rule__ReplicationMappings__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:624:1: ( ( ( rule__ReplicationMappings__Group_4_1__0 )? ) )
            // InternalReplicationMappings.g:625:1: ( ( rule__ReplicationMappings__Group_4_1__0 )? )
            {
            // InternalReplicationMappings.g:625:1: ( ( rule__ReplicationMappings__Group_4_1__0 )? )
            // InternalReplicationMappings.g:626:2: ( rule__ReplicationMappings__Group_4_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getGroup_4_1()); 
            }
            // InternalReplicationMappings.g:627:2: ( rule__ReplicationMappings__Group_4_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReplicationMappings.g:627:3: rule__ReplicationMappings__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReplicationMappings__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4__1__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4__2"
    // InternalReplicationMappings.g:635:1: rule__ReplicationMappings__Group_4__2 : rule__ReplicationMappings__Group_4__2__Impl rule__ReplicationMappings__Group_4__3 ;
    public final void rule__ReplicationMappings__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:639:1: ( rule__ReplicationMappings__Group_4__2__Impl rule__ReplicationMappings__Group_4__3 )
            // InternalReplicationMappings.g:640:2: rule__ReplicationMappings__Group_4__2__Impl rule__ReplicationMappings__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__ReplicationMappings__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4__3();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4__2"


    // $ANTLR start "rule__ReplicationMappings__Group_4__2__Impl"
    // InternalReplicationMappings.g:647:1: rule__ReplicationMappings__Group_4__2__Impl : ( ( rule__ReplicationMappings__Group_4_2__0 )? ) ;
    public final void rule__ReplicationMappings__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:651:1: ( ( ( rule__ReplicationMappings__Group_4_2__0 )? ) )
            // InternalReplicationMappings.g:652:1: ( ( rule__ReplicationMappings__Group_4_2__0 )? )
            {
            // InternalReplicationMappings.g:652:1: ( ( rule__ReplicationMappings__Group_4_2__0 )? )
            // InternalReplicationMappings.g:653:2: ( rule__ReplicationMappings__Group_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getGroup_4_2()); 
            }
            // InternalReplicationMappings.g:654:2: ( rule__ReplicationMappings__Group_4_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReplicationMappings.g:654:3: rule__ReplicationMappings__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReplicationMappings__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getGroup_4_2()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4__2__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4__3"
    // InternalReplicationMappings.g:662:1: rule__ReplicationMappings__Group_4__3 : rule__ReplicationMappings__Group_4__3__Impl ;
    public final void rule__ReplicationMappings__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:666:1: ( rule__ReplicationMappings__Group_4__3__Impl )
            // InternalReplicationMappings.g:667:2: rule__ReplicationMappings__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4__3__Impl();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4__3"


    // $ANTLR start "rule__ReplicationMappings__Group_4__3__Impl"
    // InternalReplicationMappings.g:673:1: rule__ReplicationMappings__Group_4__3__Impl : ( '}' ) ;
    public final void rule__ReplicationMappings__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:677:1: ( ( '}' ) )
            // InternalReplicationMappings.g:678:1: ( '}' )
            {
            // InternalReplicationMappings.g:678:1: ( '}' )
            // InternalReplicationMappings.g:679:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getRightCurlyBracketKeyword_4_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getRightCurlyBracketKeyword_4_3()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4__3__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4_1__0"
    // InternalReplicationMappings.g:689:1: rule__ReplicationMappings__Group_4_1__0 : rule__ReplicationMappings__Group_4_1__0__Impl rule__ReplicationMappings__Group_4_1__1 ;
    public final void rule__ReplicationMappings__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:693:1: ( rule__ReplicationMappings__Group_4_1__0__Impl rule__ReplicationMappings__Group_4_1__1 )
            // InternalReplicationMappings.g:694:2: rule__ReplicationMappings__Group_4_1__0__Impl rule__ReplicationMappings__Group_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ReplicationMappings__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4_1__1();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4_1__0"


    // $ANTLR start "rule__ReplicationMappings__Group_4_1__0__Impl"
    // InternalReplicationMappings.g:701:1: rule__ReplicationMappings__Group_4_1__0__Impl : ( 'policy' ) ;
    public final void rule__ReplicationMappings__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:705:1: ( ( 'policy' ) )
            // InternalReplicationMappings.g:706:1: ( 'policy' )
            {
            // InternalReplicationMappings.g:706:1: ( 'policy' )
            // InternalReplicationMappings.g:707:2: 'policy'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getPolicyKeyword_4_1_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getPolicyKeyword_4_1_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4_1__0__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4_1__1"
    // InternalReplicationMappings.g:716:1: rule__ReplicationMappings__Group_4_1__1 : rule__ReplicationMappings__Group_4_1__1__Impl rule__ReplicationMappings__Group_4_1__2 ;
    public final void rule__ReplicationMappings__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:720:1: ( rule__ReplicationMappings__Group_4_1__1__Impl rule__ReplicationMappings__Group_4_1__2 )
            // InternalReplicationMappings.g:721:2: rule__ReplicationMappings__Group_4_1__1__Impl rule__ReplicationMappings__Group_4_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ReplicationMappings__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4_1__2();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4_1__1"


    // $ANTLR start "rule__ReplicationMappings__Group_4_1__1__Impl"
    // InternalReplicationMappings.g:728:1: rule__ReplicationMappings__Group_4_1__1__Impl : ( ':' ) ;
    public final void rule__ReplicationMappings__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:732:1: ( ( ':' ) )
            // InternalReplicationMappings.g:733:1: ( ':' )
            {
            // InternalReplicationMappings.g:733:1: ( ':' )
            // InternalReplicationMappings.g:734:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getColonKeyword_4_1_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getColonKeyword_4_1_1()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4_1__1__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4_1__2"
    // InternalReplicationMappings.g:743:1: rule__ReplicationMappings__Group_4_1__2 : rule__ReplicationMappings__Group_4_1__2__Impl rule__ReplicationMappings__Group_4_1__3 ;
    public final void rule__ReplicationMappings__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:747:1: ( rule__ReplicationMappings__Group_4_1__2__Impl rule__ReplicationMappings__Group_4_1__3 )
            // InternalReplicationMappings.g:748:2: rule__ReplicationMappings__Group_4_1__2__Impl rule__ReplicationMappings__Group_4_1__3
            {
            pushFollow(FOLLOW_11);
            rule__ReplicationMappings__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4_1__3();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4_1__2"


    // $ANTLR start "rule__ReplicationMappings__Group_4_1__2__Impl"
    // InternalReplicationMappings.g:755:1: rule__ReplicationMappings__Group_4_1__2__Impl : ( ( rule__ReplicationMappings__PolicyAssignment_4_1_2 ) ) ;
    public final void rule__ReplicationMappings__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:759:1: ( ( ( rule__ReplicationMappings__PolicyAssignment_4_1_2 ) ) )
            // InternalReplicationMappings.g:760:1: ( ( rule__ReplicationMappings__PolicyAssignment_4_1_2 ) )
            {
            // InternalReplicationMappings.g:760:1: ( ( rule__ReplicationMappings__PolicyAssignment_4_1_2 ) )
            // InternalReplicationMappings.g:761:2: ( rule__ReplicationMappings__PolicyAssignment_4_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getPolicyAssignment_4_1_2()); 
            }
            // InternalReplicationMappings.g:762:2: ( rule__ReplicationMappings__PolicyAssignment_4_1_2 )
            // InternalReplicationMappings.g:762:3: rule__ReplicationMappings__PolicyAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__PolicyAssignment_4_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getPolicyAssignment_4_1_2()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4_1__2__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4_1__3"
    // InternalReplicationMappings.g:770:1: rule__ReplicationMappings__Group_4_1__3 : rule__ReplicationMappings__Group_4_1__3__Impl ;
    public final void rule__ReplicationMappings__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:774:1: ( rule__ReplicationMappings__Group_4_1__3__Impl )
            // InternalReplicationMappings.g:775:2: rule__ReplicationMappings__Group_4_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4_1__3__Impl();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4_1__3"


    // $ANTLR start "rule__ReplicationMappings__Group_4_1__3__Impl"
    // InternalReplicationMappings.g:781:1: rule__ReplicationMappings__Group_4_1__3__Impl : ( ',' ) ;
    public final void rule__ReplicationMappings__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:785:1: ( ( ',' ) )
            // InternalReplicationMappings.g:786:1: ( ',' )
            {
            // InternalReplicationMappings.g:786:1: ( ',' )
            // InternalReplicationMappings.g:787:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getCommaKeyword_4_1_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getCommaKeyword_4_1_3()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4_1__3__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4_2__0"
    // InternalReplicationMappings.g:797:1: rule__ReplicationMappings__Group_4_2__0 : rule__ReplicationMappings__Group_4_2__0__Impl rule__ReplicationMappings__Group_4_2__1 ;
    public final void rule__ReplicationMappings__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:801:1: ( rule__ReplicationMappings__Group_4_2__0__Impl rule__ReplicationMappings__Group_4_2__1 )
            // InternalReplicationMappings.g:802:2: rule__ReplicationMappings__Group_4_2__0__Impl rule__ReplicationMappings__Group_4_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ReplicationMappings__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4_2__1();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4_2__0"


    // $ANTLR start "rule__ReplicationMappings__Group_4_2__0__Impl"
    // InternalReplicationMappings.g:809:1: rule__ReplicationMappings__Group_4_2__0__Impl : ( 'max_transfer_rate' ) ;
    public final void rule__ReplicationMappings__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:813:1: ( ( 'max_transfer_rate' ) )
            // InternalReplicationMappings.g:814:1: ( 'max_transfer_rate' )
            {
            // InternalReplicationMappings.g:814:1: ( 'max_transfer_rate' )
            // InternalReplicationMappings.g:815:2: 'max_transfer_rate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getMax_transfer_rateKeyword_4_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getMax_transfer_rateKeyword_4_2_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4_2__0__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4_2__1"
    // InternalReplicationMappings.g:824:1: rule__ReplicationMappings__Group_4_2__1 : rule__ReplicationMappings__Group_4_2__1__Impl rule__ReplicationMappings__Group_4_2__2 ;
    public final void rule__ReplicationMappings__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:828:1: ( rule__ReplicationMappings__Group_4_2__1__Impl rule__ReplicationMappings__Group_4_2__2 )
            // InternalReplicationMappings.g:829:2: rule__ReplicationMappings__Group_4_2__1__Impl rule__ReplicationMappings__Group_4_2__2
            {
            pushFollow(FOLLOW_12);
            rule__ReplicationMappings__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4_2__2();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4_2__1"


    // $ANTLR start "rule__ReplicationMappings__Group_4_2__1__Impl"
    // InternalReplicationMappings.g:836:1: rule__ReplicationMappings__Group_4_2__1__Impl : ( ':' ) ;
    public final void rule__ReplicationMappings__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:840:1: ( ( ':' ) )
            // InternalReplicationMappings.g:841:1: ( ':' )
            {
            // InternalReplicationMappings.g:841:1: ( ':' )
            // InternalReplicationMappings.g:842:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getColonKeyword_4_2_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getColonKeyword_4_2_1()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4_2__1__Impl"


    // $ANTLR start "rule__ReplicationMappings__Group_4_2__2"
    // InternalReplicationMappings.g:851:1: rule__ReplicationMappings__Group_4_2__2 : rule__ReplicationMappings__Group_4_2__2__Impl ;
    public final void rule__ReplicationMappings__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:855:1: ( rule__ReplicationMappings__Group_4_2__2__Impl )
            // InternalReplicationMappings.g:856:2: rule__ReplicationMappings__Group_4_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Group_4_2__2__Impl();

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
    // $ANTLR end "rule__ReplicationMappings__Group_4_2__2"


    // $ANTLR start "rule__ReplicationMappings__Group_4_2__2__Impl"
    // InternalReplicationMappings.g:862:1: rule__ReplicationMappings__Group_4_2__2__Impl : ( ( rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2 ) ) ;
    public final void rule__ReplicationMappings__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:866:1: ( ( ( rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2 ) ) )
            // InternalReplicationMappings.g:867:1: ( ( rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2 ) )
            {
            // InternalReplicationMappings.g:867:1: ( ( rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2 ) )
            // InternalReplicationMappings.g:868:2: ( rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getMax_transfer_rateAssignment_4_2_2()); 
            }
            // InternalReplicationMappings.g:869:2: ( rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2 )
            // InternalReplicationMappings.g:869:3: rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getMax_transfer_rateAssignment_4_2_2()); 
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
    // $ANTLR end "rule__ReplicationMappings__Group_4_2__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalReplicationMappings.g:878:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:882:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalReplicationMappings.g:883:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalReplicationMappings.g:890:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:894:1: ( ( ( '-' )? ) )
            // InternalReplicationMappings.g:895:1: ( ( '-' )? )
            {
            // InternalReplicationMappings.g:895:1: ( ( '-' )? )
            // InternalReplicationMappings.g:896:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalReplicationMappings.g:897:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReplicationMappings.g:897:3: '-'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

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
    // InternalReplicationMappings.g:905:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:909:1: ( rule__EInt__Group__1__Impl )
            // InternalReplicationMappings.g:910:2: rule__EInt__Group__1__Impl
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
    // InternalReplicationMappings.g:916:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:920:1: ( ( RULE_INT ) )
            // InternalReplicationMappings.g:921:1: ( RULE_INT )
            {
            // InternalReplicationMappings.g:921:1: ( RULE_INT )
            // InternalReplicationMappings.g:922:2: RULE_INT
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


    // $ANTLR start "rule__ReplicationPolicy__Replication_mappingsAssignment_1"
    // InternalReplicationMappings.g:932:1: rule__ReplicationPolicy__Replication_mappingsAssignment_1 : ( ruleReplicationMappings ) ;
    public final void rule__ReplicationPolicy__Replication_mappingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:936:1: ( ( ruleReplicationMappings ) )
            // InternalReplicationMappings.g:937:2: ( ruleReplicationMappings )
            {
            // InternalReplicationMappings.g:937:2: ( ruleReplicationMappings )
            // InternalReplicationMappings.g:938:3: ruleReplicationMappings
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsReplicationMappingsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReplicationMappings();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsReplicationMappingsParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ReplicationPolicy__Replication_mappingsAssignment_1"


    // $ANTLR start "rule__ReplicationPolicy__Replication_mappingsAssignment_2_1"
    // InternalReplicationMappings.g:947:1: rule__ReplicationPolicy__Replication_mappingsAssignment_2_1 : ( ruleReplicationMappings ) ;
    public final void rule__ReplicationPolicy__Replication_mappingsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:951:1: ( ( ruleReplicationMappings ) )
            // InternalReplicationMappings.g:952:2: ( ruleReplicationMappings )
            {
            // InternalReplicationMappings.g:952:2: ( ruleReplicationMappings )
            // InternalReplicationMappings.g:953:3: ruleReplicationMappings
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsReplicationMappingsParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReplicationMappings();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationPolicyAccess().getReplication_mappingsReplicationMappingsParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__ReplicationPolicy__Replication_mappingsAssignment_2_1"


    // $ANTLR start "rule__ReplicationMappings__Source_cvoAssignment_1_0"
    // InternalReplicationMappings.g:962:1: rule__ReplicationMappings__Source_cvoAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReplicationMappings__Source_cvoAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:966:1: ( ( ( RULE_ID ) ) )
            // InternalReplicationMappings.g:967:2: ( ( RULE_ID ) )
            {
            // InternalReplicationMappings.g:967:2: ( ( RULE_ID ) )
            // InternalReplicationMappings.g:968:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getSource_cvoCVOCrossReference_1_0_0()); 
            }
            // InternalReplicationMappings.g:969:3: ( RULE_ID )
            // InternalReplicationMappings.g:970:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getSource_cvoCVOIDTerminalRuleCall_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getSource_cvoCVOIDTerminalRuleCall_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getSource_cvoCVOCrossReference_1_0_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Source_cvoAssignment_1_0"


    // $ANTLR start "rule__ReplicationMappings__Source_volumeAssignment_1_2"
    // InternalReplicationMappings.g:981:1: rule__ReplicationMappings__Source_volumeAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReplicationMappings__Source_volumeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:985:1: ( ( ( RULE_ID ) ) )
            // InternalReplicationMappings.g:986:2: ( ( RULE_ID ) )
            {
            // InternalReplicationMappings.g:986:2: ( ( RULE_ID ) )
            // InternalReplicationMappings.g:987:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getSource_volumeVolumeCrossReference_1_2_0()); 
            }
            // InternalReplicationMappings.g:988:3: ( RULE_ID )
            // InternalReplicationMappings.g:989:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getSource_volumeVolumeIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getSource_volumeVolumeIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getSource_volumeVolumeCrossReference_1_2_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Source_volumeAssignment_1_2"


    // $ANTLR start "rule__ReplicationMappings__BidirectionalAssignment_2_1"
    // InternalReplicationMappings.g:1000:1: rule__ReplicationMappings__BidirectionalAssignment_2_1 : ( ( '<->' ) ) ;
    public final void rule__ReplicationMappings__BidirectionalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:1004:1: ( ( ( '<->' ) ) )
            // InternalReplicationMappings.g:1005:2: ( ( '<->' ) )
            {
            // InternalReplicationMappings.g:1005:2: ( ( '<->' ) )
            // InternalReplicationMappings.g:1006:3: ( '<->' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_2_1_0()); 
            }
            // InternalReplicationMappings.g:1007:3: ( '<->' )
            // InternalReplicationMappings.g:1008:4: '<->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_2_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_2_1_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__BidirectionalAssignment_2_1"


    // $ANTLR start "rule__ReplicationMappings__Destination_cvoAssignment_3_0"
    // InternalReplicationMappings.g:1019:1: rule__ReplicationMappings__Destination_cvoAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReplicationMappings__Destination_cvoAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:1023:1: ( ( ( RULE_ID ) ) )
            // InternalReplicationMappings.g:1024:2: ( ( RULE_ID ) )
            {
            // InternalReplicationMappings.g:1024:2: ( ( RULE_ID ) )
            // InternalReplicationMappings.g:1025:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getDestination_cvoCVOCrossReference_3_0_0()); 
            }
            // InternalReplicationMappings.g:1026:3: ( RULE_ID )
            // InternalReplicationMappings.g:1027:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getDestination_cvoCVOIDTerminalRuleCall_3_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getDestination_cvoCVOIDTerminalRuleCall_3_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getDestination_cvoCVOCrossReference_3_0_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Destination_cvoAssignment_3_0"


    // $ANTLR start "rule__ReplicationMappings__Destination_volumeAssignment_3_2"
    // InternalReplicationMappings.g:1038:1: rule__ReplicationMappings__Destination_volumeAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReplicationMappings__Destination_volumeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:1042:1: ( ( ( RULE_ID ) ) )
            // InternalReplicationMappings.g:1043:2: ( ( RULE_ID ) )
            {
            // InternalReplicationMappings.g:1043:2: ( ( RULE_ID ) )
            // InternalReplicationMappings.g:1044:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getDestination_volumeVolumeCrossReference_3_2_0()); 
            }
            // InternalReplicationMappings.g:1045:3: ( RULE_ID )
            // InternalReplicationMappings.g:1046:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getDestination_volumeVolumeIDTerminalRuleCall_3_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getDestination_volumeVolumeIDTerminalRuleCall_3_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getDestination_volumeVolumeCrossReference_3_2_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Destination_volumeAssignment_3_2"


    // $ANTLR start "rule__ReplicationMappings__PolicyAssignment_4_1_2"
    // InternalReplicationMappings.g:1057:1: rule__ReplicationMappings__PolicyAssignment_4_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReplicationMappings__PolicyAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:1061:1: ( ( ( RULE_ID ) ) )
            // InternalReplicationMappings.g:1062:2: ( ( RULE_ID ) )
            {
            // InternalReplicationMappings.g:1062:2: ( ( RULE_ID ) )
            // InternalReplicationMappings.g:1063:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getPolicySnapshotPolicyCrossReference_4_1_2_0()); 
            }
            // InternalReplicationMappings.g:1064:3: ( RULE_ID )
            // InternalReplicationMappings.g:1065:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getPolicySnapshotPolicyIDTerminalRuleCall_4_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getPolicySnapshotPolicyIDTerminalRuleCall_4_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getPolicySnapshotPolicyCrossReference_4_1_2_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__PolicyAssignment_4_1_2"


    // $ANTLR start "rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2"
    // InternalReplicationMappings.g:1076:1: rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2 : ( ruleEInt ) ;
    public final void rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReplicationMappings.g:1080:1: ( ( ruleEInt ) )
            // InternalReplicationMappings.g:1081:2: ( ruleEInt )
            {
            // InternalReplicationMappings.g:1081:2: ( ruleEInt )
            // InternalReplicationMappings.g:1082:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplicationMappingsAccess().getMax_transfer_rateEIntParserRuleCall_4_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplicationMappingsAccess().getMax_transfer_rateEIntParserRuleCall_4_2_2_0()); 
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
    // $ANTLR end "rule__ReplicationMappings__Max_transfer_rateAssignment_4_2_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000201040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100020L});

}