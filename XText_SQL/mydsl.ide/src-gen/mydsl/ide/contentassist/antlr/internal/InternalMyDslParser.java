package mydsl.ide.contentassist.antlr.internal;

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
import mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NOTNULL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'AND'", "'OR'", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'LIKE'", "'VARCHAR'", "'char'", "'date'", "'int'", "'float'", "'time'", "'text'", "'.'", "'SELECT'", "','", "'FROM'", "'WHERE'", "'#'", "'CREATE'", "'DATABASE'", "'TABLE'", "'('", "')'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'DROP'", "'TRUNCATE'", "'DELETE'", "'UPDATE'", "'SET'", "'ALTER'", "'COLUMN'", "'ADD'", "'var'", "'COUNT'", "'AVG'", "'SUM'", "'MIN'", "'MAX'", "'INSERT'", "'INTO'", "'VALUES'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=5;
    public static final int RULE_NOTNULL=6;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:55:1: ( ruleModel EOF )
            // InternalMyDsl.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:63:1: ruleModel : ( ( rule__Model__ElementAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:67:2: ( ( ( rule__Model__ElementAssignment )* ) )
            // InternalMyDsl.g:68:2: ( ( rule__Model__ElementAssignment )* )
            {
            // InternalMyDsl.g:68:2: ( ( rule__Model__ElementAssignment )* )
            // InternalMyDsl.g:69:3: ( rule__Model__ElementAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementAssignment()); 
            }
            // InternalMyDsl.g:70:3: ( rule__Model__ElementAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30||LA1_0==35||(LA1_0>=44 && LA1_0<=47)||LA1_0==49||LA1_0==52||LA1_0==58) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:70:4: rule__Model__ElementAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementAssignment()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:79:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:80:1: ( ruleElement EOF )
            // InternalMyDsl.g:81:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:88:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:92:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalMyDsl.g:93:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalMyDsl.g:93:2: ( ( rule__Element__Alternatives ) )
            // InternalMyDsl.g:94:3: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:95:3: ( rule__Element__Alternatives )
            // InternalMyDsl.g:95:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleREAL"
    // InternalMyDsl.g:104:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:108:1: ( ruleREAL EOF )
            // InternalMyDsl.g:109:1: ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalMyDsl.g:119:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:124:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalMyDsl.g:125:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalMyDsl.g:125:2: ( ( rule__REAL__Group__0 ) )
            // InternalMyDsl.g:126:3: ( rule__REAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup()); 
            }
            // InternalMyDsl.g:127:3: ( rule__REAL__Group__0 )
            // InternalMyDsl.g:127:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleSELECT"
    // InternalMyDsl.g:137:1: entryRuleSELECT : ruleSELECT EOF ;
    public final void entryRuleSELECT() throws RecognitionException {
        try {
            // InternalMyDsl.g:138:1: ( ruleSELECT EOF )
            // InternalMyDsl.g:139:1: ruleSELECT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSELECT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTRule()); 
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
    // $ANTLR end "entryRuleSELECT"


    // $ANTLR start "ruleSELECT"
    // InternalMyDsl.g:146:1: ruleSELECT : ( ( rule__SELECT__Group__0 ) ) ;
    public final void ruleSELECT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:150:2: ( ( ( rule__SELECT__Group__0 ) ) )
            // InternalMyDsl.g:151:2: ( ( rule__SELECT__Group__0 ) )
            {
            // InternalMyDsl.g:151:2: ( ( rule__SELECT__Group__0 ) )
            // InternalMyDsl.g:152:3: ( rule__SELECT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getGroup()); 
            }
            // InternalMyDsl.g:153:3: ( rule__SELECT__Group__0 )
            // InternalMyDsl.g:153:4: rule__SELECT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getGroup()); 
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
    // $ANTLR end "ruleSELECT"


    // $ANTLR start "entryRuleFromAndWhereClauses"
    // InternalMyDsl.g:162:1: entryRuleFromAndWhereClauses : ruleFromAndWhereClauses EOF ;
    public final void entryRuleFromAndWhereClauses() throws RecognitionException {
        try {
            // InternalMyDsl.g:163:1: ( ruleFromAndWhereClauses EOF )
            // InternalMyDsl.g:164:1: ruleFromAndWhereClauses EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesRule()); 
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
    // $ANTLR end "entryRuleFromAndWhereClauses"


    // $ANTLR start "ruleFromAndWhereClauses"
    // InternalMyDsl.g:171:1: ruleFromAndWhereClauses : ( ( rule__FromAndWhereClauses__Group__0 ) ) ;
    public final void ruleFromAndWhereClauses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:175:2: ( ( ( rule__FromAndWhereClauses__Group__0 ) ) )
            // InternalMyDsl.g:176:2: ( ( rule__FromAndWhereClauses__Group__0 ) )
            {
            // InternalMyDsl.g:176:2: ( ( rule__FromAndWhereClauses__Group__0 ) )
            // InternalMyDsl.g:177:3: ( rule__FromAndWhereClauses__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getGroup()); 
            }
            // InternalMyDsl.g:178:3: ( rule__FromAndWhereClauses__Group__0 )
            // InternalMyDsl.g:178:4: rule__FromAndWhereClauses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getGroup()); 
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
    // $ANTLR end "ruleFromAndWhereClauses"


    // $ANTLR start "entryRuleWHERE"
    // InternalMyDsl.g:187:1: entryRuleWHERE : ruleWHERE EOF ;
    public final void entryRuleWHERE() throws RecognitionException {
        try {
            // InternalMyDsl.g:188:1: ( ruleWHERE EOF )
            // InternalMyDsl.g:189:1: ruleWHERE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHERERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWHERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHERERule()); 
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
    // $ANTLR end "entryRuleWHERE"


    // $ANTLR start "ruleWHERE"
    // InternalMyDsl.g:196:1: ruleWHERE : ( ( rule__WHERE__Group__0 ) ) ;
    public final void ruleWHERE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:200:2: ( ( ( rule__WHERE__Group__0 ) ) )
            // InternalMyDsl.g:201:2: ( ( rule__WHERE__Group__0 ) )
            {
            // InternalMyDsl.g:201:2: ( ( rule__WHERE__Group__0 ) )
            // InternalMyDsl.g:202:3: ( rule__WHERE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHEREAccess().getGroup()); 
            }
            // InternalMyDsl.g:203:3: ( rule__WHERE__Group__0 )
            // InternalMyDsl.g:203:4: rule__WHERE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHEREAccess().getGroup()); 
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
    // $ANTLR end "ruleWHERE"


    // $ANTLR start "entryRuleOper1"
    // InternalMyDsl.g:212:1: entryRuleOper1 : ruleOper1 EOF ;
    public final void entryRuleOper1() throws RecognitionException {
        try {
            // InternalMyDsl.g:213:1: ( ruleOper1 EOF )
            // InternalMyDsl.g:214:1: ruleOper1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOper1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper1Rule()); 
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
    // $ANTLR end "entryRuleOper1"


    // $ANTLR start "ruleOper1"
    // InternalMyDsl.g:221:1: ruleOper1 : ( ( rule__Oper1__Group__0 ) ) ;
    public final void ruleOper1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:225:2: ( ( ( rule__Oper1__Group__0 ) ) )
            // InternalMyDsl.g:226:2: ( ( rule__Oper1__Group__0 ) )
            {
            // InternalMyDsl.g:226:2: ( ( rule__Oper1__Group__0 ) )
            // InternalMyDsl.g:227:3: ( rule__Oper1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper1Access().getGroup()); 
            }
            // InternalMyDsl.g:228:3: ( rule__Oper1__Group__0 )
            // InternalMyDsl.g:228:4: rule__Oper1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Oper1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper1Access().getGroup()); 
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
    // $ANTLR end "ruleOper1"


    // $ANTLR start "entryRuleOper2"
    // InternalMyDsl.g:237:1: entryRuleOper2 : ruleOper2 EOF ;
    public final void entryRuleOper2() throws RecognitionException {
        try {
            // InternalMyDsl.g:238:1: ( ruleOper2 EOF )
            // InternalMyDsl.g:239:1: ruleOper2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOper2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper2Rule()); 
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
    // $ANTLR end "entryRuleOper2"


    // $ANTLR start "ruleOper2"
    // InternalMyDsl.g:246:1: ruleOper2 : ( ( rule__Oper2__ColumnAssignment ) ) ;
    public final void ruleOper2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:250:2: ( ( ( rule__Oper2__ColumnAssignment ) ) )
            // InternalMyDsl.g:251:2: ( ( rule__Oper2__ColumnAssignment ) )
            {
            // InternalMyDsl.g:251:2: ( ( rule__Oper2__ColumnAssignment ) )
            // InternalMyDsl.g:252:3: ( rule__Oper2__ColumnAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper2Access().getColumnAssignment()); 
            }
            // InternalMyDsl.g:253:3: ( rule__Oper2__ColumnAssignment )
            // InternalMyDsl.g:253:4: rule__Oper2__ColumnAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Oper2__ColumnAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper2Access().getColumnAssignment()); 
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
    // $ANTLR end "ruleOper2"


    // $ANTLR start "entryRuleOper3"
    // InternalMyDsl.g:262:1: entryRuleOper3 : ruleOper3 EOF ;
    public final void entryRuleOper3() throws RecognitionException {
        try {
            // InternalMyDsl.g:263:1: ( ruleOper3 EOF )
            // InternalMyDsl.g:264:1: ruleOper3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOper3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper3Rule()); 
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
    // $ANTLR end "entryRuleOper3"


    // $ANTLR start "ruleOper3"
    // InternalMyDsl.g:271:1: ruleOper3 : ( ( rule__Oper3__ValAssignment ) ) ;
    public final void ruleOper3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:275:2: ( ( ( rule__Oper3__ValAssignment ) ) )
            // InternalMyDsl.g:276:2: ( ( rule__Oper3__ValAssignment ) )
            {
            // InternalMyDsl.g:276:2: ( ( rule__Oper3__ValAssignment ) )
            // InternalMyDsl.g:277:3: ( rule__Oper3__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper3Access().getValAssignment()); 
            }
            // InternalMyDsl.g:278:3: ( rule__Oper3__ValAssignment )
            // InternalMyDsl.g:278:4: rule__Oper3__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Oper3__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper3Access().getValAssignment()); 
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
    // $ANTLR end "ruleOper3"


    // $ANTLR start "entryRuleDATABASE"
    // InternalMyDsl.g:287:1: entryRuleDATABASE : ruleDATABASE EOF ;
    public final void entryRuleDATABASE() throws RecognitionException {
        try {
            // InternalMyDsl.g:288:1: ( ruleDATABASE EOF )
            // InternalMyDsl.g:289:1: ruleDATABASE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDATABASERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDATABASE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDATABASERule()); 
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
    // $ANTLR end "entryRuleDATABASE"


    // $ANTLR start "ruleDATABASE"
    // InternalMyDsl.g:296:1: ruleDATABASE : ( ( rule__DATABASE__Group__0 ) ) ;
    public final void ruleDATABASE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:300:2: ( ( ( rule__DATABASE__Group__0 ) ) )
            // InternalMyDsl.g:301:2: ( ( rule__DATABASE__Group__0 ) )
            {
            // InternalMyDsl.g:301:2: ( ( rule__DATABASE__Group__0 ) )
            // InternalMyDsl.g:302:3: ( rule__DATABASE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDATABASEAccess().getGroup()); 
            }
            // InternalMyDsl.g:303:3: ( rule__DATABASE__Group__0 )
            // InternalMyDsl.g:303:4: rule__DATABASE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DATABASE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDATABASEAccess().getGroup()); 
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
    // $ANTLR end "ruleDATABASE"


    // $ANTLR start "entryRuleCREATE"
    // InternalMyDsl.g:312:1: entryRuleCREATE : ruleCREATE EOF ;
    public final void entryRuleCREATE() throws RecognitionException {
        try {
            // InternalMyDsl.g:313:1: ( ruleCREATE EOF )
            // InternalMyDsl.g:314:1: ruleCREATE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCREATERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCREATE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCREATERule()); 
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
    // $ANTLR end "entryRuleCREATE"


    // $ANTLR start "ruleCREATE"
    // InternalMyDsl.g:321:1: ruleCREATE : ( ( ( rule__CREATE__TablesAssignment ) ) ( ( rule__CREATE__TablesAssignment )* ) ) ;
    public final void ruleCREATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:325:2: ( ( ( ( rule__CREATE__TablesAssignment ) ) ( ( rule__CREATE__TablesAssignment )* ) ) )
            // InternalMyDsl.g:326:2: ( ( ( rule__CREATE__TablesAssignment ) ) ( ( rule__CREATE__TablesAssignment )* ) )
            {
            // InternalMyDsl.g:326:2: ( ( ( rule__CREATE__TablesAssignment ) ) ( ( rule__CREATE__TablesAssignment )* ) )
            // InternalMyDsl.g:327:3: ( ( rule__CREATE__TablesAssignment ) ) ( ( rule__CREATE__TablesAssignment )* )
            {
            // InternalMyDsl.g:327:3: ( ( rule__CREATE__TablesAssignment ) )
            // InternalMyDsl.g:328:4: ( rule__CREATE__TablesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCREATEAccess().getTablesAssignment()); 
            }
            // InternalMyDsl.g:329:4: ( rule__CREATE__TablesAssignment )
            // InternalMyDsl.g:329:5: rule__CREATE__TablesAssignment
            {
            pushFollow(FOLLOW_4);
            rule__CREATE__TablesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCREATEAccess().getTablesAssignment()); 
            }

            }

            // InternalMyDsl.g:332:3: ( ( rule__CREATE__TablesAssignment )* )
            // InternalMyDsl.g:333:4: ( rule__CREATE__TablesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCREATEAccess().getTablesAssignment()); 
            }
            // InternalMyDsl.g:334:4: ( rule__CREATE__TablesAssignment )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:334:5: rule__CREATE__TablesAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CREATE__TablesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCREATEAccess().getTablesAssignment()); 
            }

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
    // $ANTLR end "ruleCREATE"


    // $ANTLR start "entryRuleTABLE"
    // InternalMyDsl.g:344:1: entryRuleTABLE : ruleTABLE EOF ;
    public final void entryRuleTABLE() throws RecognitionException {
        try {
            // InternalMyDsl.g:345:1: ( ruleTABLE EOF )
            // InternalMyDsl.g:346:1: ruleTABLE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTABLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLERule()); 
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
    // $ANTLR end "entryRuleTABLE"


    // $ANTLR start "ruleTABLE"
    // InternalMyDsl.g:353:1: ruleTABLE : ( ( rule__TABLE__Group__0 ) ) ;
    public final void ruleTABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:2: ( ( ( rule__TABLE__Group__0 ) ) )
            // InternalMyDsl.g:358:2: ( ( rule__TABLE__Group__0 ) )
            {
            // InternalMyDsl.g:358:2: ( ( rule__TABLE__Group__0 ) )
            // InternalMyDsl.g:359:3: ( rule__TABLE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getGroup()); 
            }
            // InternalMyDsl.g:360:3: ( rule__TABLE__Group__0 )
            // InternalMyDsl.g:360:4: rule__TABLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TABLE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getGroup()); 
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
    // $ANTLR end "ruleTABLE"


    // $ANTLR start "entryRuletableName"
    // InternalMyDsl.g:369:1: entryRuletableName : ruletableName EOF ;
    public final void entryRuletableName() throws RecognitionException {
        try {
            // InternalMyDsl.g:370:1: ( ruletableName EOF )
            // InternalMyDsl.g:371:1: ruletableName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruletableName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableNameRule()); 
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
    // $ANTLR end "entryRuletableName"


    // $ANTLR start "ruletableName"
    // InternalMyDsl.g:378:1: ruletableName : ( ( rule__TableName__NameAssignment ) ) ;
    public final void ruletableName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:382:2: ( ( ( rule__TableName__NameAssignment ) ) )
            // InternalMyDsl.g:383:2: ( ( rule__TableName__NameAssignment ) )
            {
            // InternalMyDsl.g:383:2: ( ( rule__TableName__NameAssignment ) )
            // InternalMyDsl.g:384:3: ( rule__TableName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableNameAccess().getNameAssignment()); 
            }
            // InternalMyDsl.g:385:3: ( rule__TableName__NameAssignment )
            // InternalMyDsl.g:385:4: rule__TableName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TableName__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableNameAccess().getNameAssignment()); 
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
    // $ANTLR end "ruletableName"


    // $ANTLR start "entryRuleColumnDeclaration"
    // InternalMyDsl.g:394:1: entryRuleColumnDeclaration : ruleColumnDeclaration EOF ;
    public final void entryRuleColumnDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:395:1: ( ruleColumnDeclaration EOF )
            // InternalMyDsl.g:396:1: ruleColumnDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleColumnDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnDeclarationRule()); 
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
    // $ANTLR end "entryRuleColumnDeclaration"


    // $ANTLR start "ruleColumnDeclaration"
    // InternalMyDsl.g:403:1: ruleColumnDeclaration : ( ( rule__ColumnDeclaration__Group__0 ) ) ;
    public final void ruleColumnDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:2: ( ( ( rule__ColumnDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:408:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:408:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            // InternalMyDsl.g:409:3: ( rule__ColumnDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnDeclarationAccess().getGroup()); 
            }
            // InternalMyDsl.g:410:3: ( rule__ColumnDeclaration__Group__0 )
            // InternalMyDsl.g:410:4: rule__ColumnDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleColumnDeclaration"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalMyDsl.g:419:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalMyDsl.g:420:1: ( rulePrimaryKey EOF )
            // InternalMyDsl.g:421:1: rulePrimaryKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyRule()); 
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
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalMyDsl.g:428:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalMyDsl.g:433:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalMyDsl.g:433:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalMyDsl.g:434:3: ( rule__PrimaryKey__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            }
            // InternalMyDsl.g:435:3: ( rule__PrimaryKey__Group__0 )
            // InternalMyDsl.g:435:4: rule__PrimaryKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getGroup()); 
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
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // InternalMyDsl.g:444:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalMyDsl.g:445:1: ( ruleForeignKey EOF )
            // InternalMyDsl.g:446:1: ruleForeignKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForeignKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyRule()); 
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
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalMyDsl.g:453:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalMyDsl.g:458:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalMyDsl.g:458:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalMyDsl.g:459:3: ( rule__ForeignKey__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroup()); 
            }
            // InternalMyDsl.g:460:3: ( rule__ForeignKey__Group__0 )
            // InternalMyDsl.g:460:4: rule__ForeignKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getGroup()); 
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
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleDROPTABLE"
    // InternalMyDsl.g:469:1: entryRuleDROPTABLE : ruleDROPTABLE EOF ;
    public final void entryRuleDROPTABLE() throws RecognitionException {
        try {
            // InternalMyDsl.g:470:1: ( ruleDROPTABLE EOF )
            // InternalMyDsl.g:471:1: ruleDROPTABLE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDROPTABLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLERule()); 
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
    // $ANTLR end "entryRuleDROPTABLE"


    // $ANTLR start "ruleDROPTABLE"
    // InternalMyDsl.g:478:1: ruleDROPTABLE : ( ( rule__DROPTABLE__Group__0 ) ) ;
    public final void ruleDROPTABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:2: ( ( ( rule__DROPTABLE__Group__0 ) ) )
            // InternalMyDsl.g:483:2: ( ( rule__DROPTABLE__Group__0 ) )
            {
            // InternalMyDsl.g:483:2: ( ( rule__DROPTABLE__Group__0 ) )
            // InternalMyDsl.g:484:3: ( rule__DROPTABLE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getGroup()); 
            }
            // InternalMyDsl.g:485:3: ( rule__DROPTABLE__Group__0 )
            // InternalMyDsl.g:485:4: rule__DROPTABLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getGroup()); 
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
    // $ANTLR end "ruleDROPTABLE"


    // $ANTLR start "entryRuleTRUNCATE"
    // InternalMyDsl.g:494:1: entryRuleTRUNCATE : ruleTRUNCATE EOF ;
    public final void entryRuleTRUNCATE() throws RecognitionException {
        try {
            // InternalMyDsl.g:495:1: ( ruleTRUNCATE EOF )
            // InternalMyDsl.g:496:1: ruleTRUNCATE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTRUNCATE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATERule()); 
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
    // $ANTLR end "entryRuleTRUNCATE"


    // $ANTLR start "ruleTRUNCATE"
    // InternalMyDsl.g:503:1: ruleTRUNCATE : ( ( rule__TRUNCATE__Group__0 ) ) ;
    public final void ruleTRUNCATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:2: ( ( ( rule__TRUNCATE__Group__0 ) ) )
            // InternalMyDsl.g:508:2: ( ( rule__TRUNCATE__Group__0 ) )
            {
            // InternalMyDsl.g:508:2: ( ( rule__TRUNCATE__Group__0 ) )
            // InternalMyDsl.g:509:3: ( rule__TRUNCATE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getGroup()); 
            }
            // InternalMyDsl.g:510:3: ( rule__TRUNCATE__Group__0 )
            // InternalMyDsl.g:510:4: rule__TRUNCATE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getGroup()); 
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
    // $ANTLR end "ruleTRUNCATE"


    // $ANTLR start "entryRuleDELETE"
    // InternalMyDsl.g:519:1: entryRuleDELETE : ruleDELETE EOF ;
    public final void entryRuleDELETE() throws RecognitionException {
        try {
            // InternalMyDsl.g:520:1: ( ruleDELETE EOF )
            // InternalMyDsl.g:521:1: ruleDELETE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDELETERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDELETE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDELETERule()); 
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
    // $ANTLR end "entryRuleDELETE"


    // $ANTLR start "ruleDELETE"
    // InternalMyDsl.g:528:1: ruleDELETE : ( ( rule__DELETE__Group__0 ) ) ;
    public final void ruleDELETE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:2: ( ( ( rule__DELETE__Group__0 ) ) )
            // InternalMyDsl.g:533:2: ( ( rule__DELETE__Group__0 ) )
            {
            // InternalMyDsl.g:533:2: ( ( rule__DELETE__Group__0 ) )
            // InternalMyDsl.g:534:3: ( rule__DELETE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDELETEAccess().getGroup()); 
            }
            // InternalMyDsl.g:535:3: ( rule__DELETE__Group__0 )
            // InternalMyDsl.g:535:4: rule__DELETE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DELETE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDELETEAccess().getGroup()); 
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
    // $ANTLR end "ruleDELETE"


    // $ANTLR start "entryRuleUPDATE"
    // InternalMyDsl.g:544:1: entryRuleUPDATE : ruleUPDATE EOF ;
    public final void entryRuleUPDATE() throws RecognitionException {
        try {
            // InternalMyDsl.g:545:1: ( ruleUPDATE EOF )
            // InternalMyDsl.g:546:1: ruleUPDATE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUPDATE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATERule()); 
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
    // $ANTLR end "entryRuleUPDATE"


    // $ANTLR start "ruleUPDATE"
    // InternalMyDsl.g:553:1: ruleUPDATE : ( ( rule__UPDATE__Group__0 ) ) ;
    public final void ruleUPDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:2: ( ( ( rule__UPDATE__Group__0 ) ) )
            // InternalMyDsl.g:558:2: ( ( rule__UPDATE__Group__0 ) )
            {
            // InternalMyDsl.g:558:2: ( ( rule__UPDATE__Group__0 ) )
            // InternalMyDsl.g:559:3: ( rule__UPDATE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getGroup()); 
            }
            // InternalMyDsl.g:560:3: ( rule__UPDATE__Group__0 )
            // InternalMyDsl.g:560:4: rule__UPDATE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getGroup()); 
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
    // $ANTLR end "ruleUPDATE"


    // $ANTLR start "entryRuleSetClause"
    // InternalMyDsl.g:569:1: entryRuleSetClause : ruleSetClause EOF ;
    public final void entryRuleSetClause() throws RecognitionException {
        try {
            // InternalMyDsl.g:570:1: ( ruleSetClause EOF )
            // InternalMyDsl.g:571:1: ruleSetClause EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSetClause();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseRule()); 
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
    // $ANTLR end "entryRuleSetClause"


    // $ANTLR start "ruleSetClause"
    // InternalMyDsl.g:578:1: ruleSetClause : ( ( rule__SetClause__Group__0 ) ) ;
    public final void ruleSetClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:2: ( ( ( rule__SetClause__Group__0 ) ) )
            // InternalMyDsl.g:583:2: ( ( rule__SetClause__Group__0 ) )
            {
            // InternalMyDsl.g:583:2: ( ( rule__SetClause__Group__0 ) )
            // InternalMyDsl.g:584:3: ( rule__SetClause__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getGroup()); 
            }
            // InternalMyDsl.g:585:3: ( rule__SetClause__Group__0 )
            // InternalMyDsl.g:585:4: rule__SetClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getGroup()); 
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
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRuleALTER"
    // InternalMyDsl.g:594:1: entryRuleALTER : ruleALTER EOF ;
    public final void entryRuleALTER() throws RecognitionException {
        try {
            // InternalMyDsl.g:595:1: ( ruleALTER EOF )
            // InternalMyDsl.g:596:1: ruleALTER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALTER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERRule()); 
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
    // $ANTLR end "entryRuleALTER"


    // $ANTLR start "ruleALTER"
    // InternalMyDsl.g:603:1: ruleALTER : ( ( rule__ALTER__Group__0 ) ) ;
    public final void ruleALTER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:2: ( ( ( rule__ALTER__Group__0 ) ) )
            // InternalMyDsl.g:608:2: ( ( rule__ALTER__Group__0 ) )
            {
            // InternalMyDsl.g:608:2: ( ( rule__ALTER__Group__0 ) )
            // InternalMyDsl.g:609:3: ( rule__ALTER__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERAccess().getGroup()); 
            }
            // InternalMyDsl.g:610:3: ( rule__ALTER__Group__0 )
            // InternalMyDsl.g:610:4: rule__ALTER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALTER__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERAccess().getGroup()); 
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
    // $ANTLR end "ruleALTER"


    // $ANTLR start "entryRuleALTERDROP"
    // InternalMyDsl.g:619:1: entryRuleALTERDROP : ruleALTERDROP EOF ;
    public final void entryRuleALTERDROP() throws RecognitionException {
        try {
            // InternalMyDsl.g:620:1: ( ruleALTERDROP EOF )
            // InternalMyDsl.g:621:1: ruleALTERDROP EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERDROPRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALTERDROP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERDROPRule()); 
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
    // $ANTLR end "entryRuleALTERDROP"


    // $ANTLR start "ruleALTERDROP"
    // InternalMyDsl.g:628:1: ruleALTERDROP : ( ( rule__ALTERDROP__Group__0 ) ) ;
    public final void ruleALTERDROP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:2: ( ( ( rule__ALTERDROP__Group__0 ) ) )
            // InternalMyDsl.g:633:2: ( ( rule__ALTERDROP__Group__0 ) )
            {
            // InternalMyDsl.g:633:2: ( ( rule__ALTERDROP__Group__0 ) )
            // InternalMyDsl.g:634:3: ( rule__ALTERDROP__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERDROPAccess().getGroup()); 
            }
            // InternalMyDsl.g:635:3: ( rule__ALTERDROP__Group__0 )
            // InternalMyDsl.g:635:4: rule__ALTERDROP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALTERDROP__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERDROPAccess().getGroup()); 
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
    // $ANTLR end "ruleALTERDROP"


    // $ANTLR start "entryRuleALTERADD"
    // InternalMyDsl.g:644:1: entryRuleALTERADD : ruleALTERADD EOF ;
    public final void entryRuleALTERADD() throws RecognitionException {
        try {
            // InternalMyDsl.g:645:1: ( ruleALTERADD EOF )
            // InternalMyDsl.g:646:1: ruleALTERADD EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERADDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALTERADD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERADDRule()); 
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
    // $ANTLR end "entryRuleALTERADD"


    // $ANTLR start "ruleALTERADD"
    // InternalMyDsl.g:653:1: ruleALTERADD : ( ( rule__ALTERADD__Group__0 ) ) ;
    public final void ruleALTERADD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:2: ( ( ( rule__ALTERADD__Group__0 ) ) )
            // InternalMyDsl.g:658:2: ( ( rule__ALTERADD__Group__0 ) )
            {
            // InternalMyDsl.g:658:2: ( ( rule__ALTERADD__Group__0 ) )
            // InternalMyDsl.g:659:3: ( rule__ALTERADD__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERADDAccess().getGroup()); 
            }
            // InternalMyDsl.g:660:3: ( rule__ALTERADD__Group__0 )
            // InternalMyDsl.g:660:4: rule__ALTERADD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALTERADD__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERADDAccess().getGroup()); 
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
    // $ANTLR end "ruleALTERADD"


    // $ANTLR start "entryRuleALTERUPDATE"
    // InternalMyDsl.g:669:1: entryRuleALTERUPDATE : ruleALTERUPDATE EOF ;
    public final void entryRuleALTERUPDATE() throws RecognitionException {
        try {
            // InternalMyDsl.g:670:1: ( ruleALTERUPDATE EOF )
            // InternalMyDsl.g:671:1: ruleALTERUPDATE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERUPDATERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALTERUPDATE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERUPDATERule()); 
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
    // $ANTLR end "entryRuleALTERUPDATE"


    // $ANTLR start "ruleALTERUPDATE"
    // InternalMyDsl.g:678:1: ruleALTERUPDATE : ( ( rule__ALTERUPDATE__Group__0 ) ) ;
    public final void ruleALTERUPDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:2: ( ( ( rule__ALTERUPDATE__Group__0 ) ) )
            // InternalMyDsl.g:683:2: ( ( rule__ALTERUPDATE__Group__0 ) )
            {
            // InternalMyDsl.g:683:2: ( ( rule__ALTERUPDATE__Group__0 ) )
            // InternalMyDsl.g:684:3: ( rule__ALTERUPDATE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERUPDATEAccess().getGroup()); 
            }
            // InternalMyDsl.g:685:3: ( rule__ALTERUPDATE__Group__0 )
            // InternalMyDsl.g:685:4: rule__ALTERUPDATE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALTERUPDATE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERUPDATEAccess().getGroup()); 
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
    // $ANTLR end "ruleALTERUPDATE"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMyDsl.g:694:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:695:1: ( ruleVariableDeclaration EOF )
            // InternalMyDsl.g:696:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMyDsl.g:703:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:708:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:708:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalMyDsl.g:709:3: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // InternalMyDsl.g:710:3: ( rule__VariableDeclaration__Group__0 )
            // InternalMyDsl.g:710:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleSELECTFUNCT"
    // InternalMyDsl.g:719:1: entryRuleSELECTFUNCT : ruleSELECTFUNCT EOF ;
    public final void entryRuleSELECTFUNCT() throws RecognitionException {
        try {
            // InternalMyDsl.g:720:1: ( ruleSELECTFUNCT EOF )
            // InternalMyDsl.g:721:1: ruleSELECTFUNCT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTFUNCTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSELECTFUNCT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTFUNCTRule()); 
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
    // $ANTLR end "entryRuleSELECTFUNCT"


    // $ANTLR start "ruleSELECTFUNCT"
    // InternalMyDsl.g:728:1: ruleSELECTFUNCT : ( ( rule__SELECTFUNCT__Alternatives ) ) ;
    public final void ruleSELECTFUNCT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:2: ( ( ( rule__SELECTFUNCT__Alternatives ) ) )
            // InternalMyDsl.g:733:2: ( ( rule__SELECTFUNCT__Alternatives ) )
            {
            // InternalMyDsl.g:733:2: ( ( rule__SELECTFUNCT__Alternatives ) )
            // InternalMyDsl.g:734:3: ( rule__SELECTFUNCT__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTFUNCTAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:735:3: ( rule__SELECTFUNCT__Alternatives )
            // InternalMyDsl.g:735:4: rule__SELECTFUNCT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SELECTFUNCT__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTFUNCTAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSELECTFUNCT"


    // $ANTLR start "entryRuleCountFunction"
    // InternalMyDsl.g:744:1: entryRuleCountFunction : ruleCountFunction EOF ;
    public final void entryRuleCountFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:745:1: ( ruleCountFunction EOF )
            // InternalMyDsl.g:746:1: ruleCountFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCountFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionRule()); 
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
    // $ANTLR end "entryRuleCountFunction"


    // $ANTLR start "ruleCountFunction"
    // InternalMyDsl.g:753:1: ruleCountFunction : ( ( rule__CountFunction__Group__0 ) ) ;
    public final void ruleCountFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:2: ( ( ( rule__CountFunction__Group__0 ) ) )
            // InternalMyDsl.g:758:2: ( ( rule__CountFunction__Group__0 ) )
            {
            // InternalMyDsl.g:758:2: ( ( rule__CountFunction__Group__0 ) )
            // InternalMyDsl.g:759:3: ( rule__CountFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getGroup()); 
            }
            // InternalMyDsl.g:760:3: ( rule__CountFunction__Group__0 )
            // InternalMyDsl.g:760:4: rule__CountFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getGroup()); 
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
    // $ANTLR end "ruleCountFunction"


    // $ANTLR start "entryRuleAvgFunction"
    // InternalMyDsl.g:769:1: entryRuleAvgFunction : ruleAvgFunction EOF ;
    public final void entryRuleAvgFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:770:1: ( ruleAvgFunction EOF )
            // InternalMyDsl.g:771:1: ruleAvgFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAvgFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionRule()); 
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
    // $ANTLR end "entryRuleAvgFunction"


    // $ANTLR start "ruleAvgFunction"
    // InternalMyDsl.g:778:1: ruleAvgFunction : ( ( rule__AvgFunction__Group__0 ) ) ;
    public final void ruleAvgFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:2: ( ( ( rule__AvgFunction__Group__0 ) ) )
            // InternalMyDsl.g:783:2: ( ( rule__AvgFunction__Group__0 ) )
            {
            // InternalMyDsl.g:783:2: ( ( rule__AvgFunction__Group__0 ) )
            // InternalMyDsl.g:784:3: ( rule__AvgFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getGroup()); 
            }
            // InternalMyDsl.g:785:3: ( rule__AvgFunction__Group__0 )
            // InternalMyDsl.g:785:4: rule__AvgFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getGroup()); 
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
    // $ANTLR end "ruleAvgFunction"


    // $ANTLR start "entryRuleSumFunction"
    // InternalMyDsl.g:794:1: entryRuleSumFunction : ruleSumFunction EOF ;
    public final void entryRuleSumFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:795:1: ( ruleSumFunction EOF )
            // InternalMyDsl.g:796:1: ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSumFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionRule()); 
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
    // $ANTLR end "entryRuleSumFunction"


    // $ANTLR start "ruleSumFunction"
    // InternalMyDsl.g:803:1: ruleSumFunction : ( ( rule__SumFunction__Group__0 ) ) ;
    public final void ruleSumFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:807:2: ( ( ( rule__SumFunction__Group__0 ) ) )
            // InternalMyDsl.g:808:2: ( ( rule__SumFunction__Group__0 ) )
            {
            // InternalMyDsl.g:808:2: ( ( rule__SumFunction__Group__0 ) )
            // InternalMyDsl.g:809:3: ( rule__SumFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getGroup()); 
            }
            // InternalMyDsl.g:810:3: ( rule__SumFunction__Group__0 )
            // InternalMyDsl.g:810:4: rule__SumFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getGroup()); 
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
    // $ANTLR end "ruleSumFunction"


    // $ANTLR start "entryRuleMinFunction"
    // InternalMyDsl.g:819:1: entryRuleMinFunction : ruleMinFunction EOF ;
    public final void entryRuleMinFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:820:1: ( ruleMinFunction EOF )
            // InternalMyDsl.g:821:1: ruleMinFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMinFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionRule()); 
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
    // $ANTLR end "entryRuleMinFunction"


    // $ANTLR start "ruleMinFunction"
    // InternalMyDsl.g:828:1: ruleMinFunction : ( ( rule__MinFunction__Group__0 ) ) ;
    public final void ruleMinFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:2: ( ( ( rule__MinFunction__Group__0 ) ) )
            // InternalMyDsl.g:833:2: ( ( rule__MinFunction__Group__0 ) )
            {
            // InternalMyDsl.g:833:2: ( ( rule__MinFunction__Group__0 ) )
            // InternalMyDsl.g:834:3: ( rule__MinFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getGroup()); 
            }
            // InternalMyDsl.g:835:3: ( rule__MinFunction__Group__0 )
            // InternalMyDsl.g:835:4: rule__MinFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getGroup()); 
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
    // $ANTLR end "ruleMinFunction"


    // $ANTLR start "entryRuleMaxFunction"
    // InternalMyDsl.g:844:1: entryRuleMaxFunction : ruleMaxFunction EOF ;
    public final void entryRuleMaxFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:845:1: ( ruleMaxFunction EOF )
            // InternalMyDsl.g:846:1: ruleMaxFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMaxFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionRule()); 
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
    // $ANTLR end "entryRuleMaxFunction"


    // $ANTLR start "ruleMaxFunction"
    // InternalMyDsl.g:853:1: ruleMaxFunction : ( ( rule__MaxFunction__Group__0 ) ) ;
    public final void ruleMaxFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:857:2: ( ( ( rule__MaxFunction__Group__0 ) ) )
            // InternalMyDsl.g:858:2: ( ( rule__MaxFunction__Group__0 ) )
            {
            // InternalMyDsl.g:858:2: ( ( rule__MaxFunction__Group__0 ) )
            // InternalMyDsl.g:859:3: ( rule__MaxFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getGroup()); 
            }
            // InternalMyDsl.g:860:3: ( rule__MaxFunction__Group__0 )
            // InternalMyDsl.g:860:4: rule__MaxFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getGroup()); 
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
    // $ANTLR end "ruleMaxFunction"


    // $ANTLR start "entryRuleINSERT"
    // InternalMyDsl.g:869:1: entryRuleINSERT : ruleINSERT EOF ;
    public final void entryRuleINSERT() throws RecognitionException {
        try {
            // InternalMyDsl.g:870:1: ( ruleINSERT EOF )
            // InternalMyDsl.g:871:1: ruleINSERT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleINSERT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTRule()); 
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
    // $ANTLR end "entryRuleINSERT"


    // $ANTLR start "ruleINSERT"
    // InternalMyDsl.g:878:1: ruleINSERT : ( ( rule__INSERT__Group__0 ) ) ;
    public final void ruleINSERT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:2: ( ( ( rule__INSERT__Group__0 ) ) )
            // InternalMyDsl.g:883:2: ( ( rule__INSERT__Group__0 ) )
            {
            // InternalMyDsl.g:883:2: ( ( rule__INSERT__Group__0 ) )
            // InternalMyDsl.g:884:3: ( rule__INSERT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getGroup()); 
            }
            // InternalMyDsl.g:885:3: ( rule__INSERT__Group__0 )
            // InternalMyDsl.g:885:4: rule__INSERT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getGroup()); 
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
    // $ANTLR end "ruleINSERT"


    // $ANTLR start "ruleDATATYPE"
    // InternalMyDsl.g:894:1: ruleDATATYPE : ( ( rule__DATATYPE__Alternatives ) ) ;
    public final void ruleDATATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( ( rule__DATATYPE__Alternatives ) ) )
            // InternalMyDsl.g:899:2: ( ( rule__DATATYPE__Alternatives ) )
            {
            // InternalMyDsl.g:899:2: ( ( rule__DATATYPE__Alternatives ) )
            // InternalMyDsl.g:900:3: ( rule__DATATYPE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDATATYPEAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:901:3: ( rule__DATATYPE__Alternatives )
            // InternalMyDsl.g:901:4: rule__DATATYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DATATYPE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDATATYPEAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDATATYPE"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalMyDsl.g:909:1: rule__Element__Alternatives : ( ( ruleCREATE ) | ( ruleALTER ) | ( ruleINSERT ) | ( ruleSELECT ) | ( ruleDELETE ) | ( ruleDROPTABLE ) | ( ruleTRUNCATE ) | ( ruleUPDATE ) | ( ruleSELECTFUNCT ) | ( ruleDATABASE ) | ( ruleVariableDeclaration ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ruleCREATE ) | ( ruleALTER ) | ( ruleINSERT ) | ( ruleSELECT ) | ( ruleDELETE ) | ( ruleDROPTABLE ) | ( ruleTRUNCATE ) | ( ruleUPDATE ) | ( ruleSELECTFUNCT ) | ( ruleDATABASE ) | ( ruleVariableDeclaration ) )
            int alt3=11;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:914:2: ( ruleCREATE )
                    {
                    // InternalMyDsl.g:914:2: ( ruleCREATE )
                    // InternalMyDsl.g:915:3: ruleCREATE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getCREATEParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCREATE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getCREATEParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:920:2: ( ruleALTER )
                    {
                    // InternalMyDsl.g:920:2: ( ruleALTER )
                    // InternalMyDsl.g:921:3: ruleALTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getALTERParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALTER();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getALTERParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:926:2: ( ruleINSERT )
                    {
                    // InternalMyDsl.g:926:2: ( ruleINSERT )
                    // InternalMyDsl.g:927:3: ruleINSERT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getINSERTParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleINSERT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getINSERTParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:932:2: ( ruleSELECT )
                    {
                    // InternalMyDsl.g:932:2: ( ruleSELECT )
                    // InternalMyDsl.g:933:3: ruleSELECT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getSELECTParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSELECT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getSELECTParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:938:2: ( ruleDELETE )
                    {
                    // InternalMyDsl.g:938:2: ( ruleDELETE )
                    // InternalMyDsl.g:939:3: ruleDELETE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getDELETEParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDELETE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getDELETEParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:944:2: ( ruleDROPTABLE )
                    {
                    // InternalMyDsl.g:944:2: ( ruleDROPTABLE )
                    // InternalMyDsl.g:945:3: ruleDROPTABLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getDROPTABLEParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDROPTABLE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getDROPTABLEParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:950:2: ( ruleTRUNCATE )
                    {
                    // InternalMyDsl.g:950:2: ( ruleTRUNCATE )
                    // InternalMyDsl.g:951:3: ruleTRUNCATE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTRUNCATEParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTRUNCATE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTRUNCATEParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:956:2: ( ruleUPDATE )
                    {
                    // InternalMyDsl.g:956:2: ( ruleUPDATE )
                    // InternalMyDsl.g:957:3: ruleUPDATE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getUPDATEParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUPDATE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getUPDATEParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:962:2: ( ruleSELECTFUNCT )
                    {
                    // InternalMyDsl.g:962:2: ( ruleSELECTFUNCT )
                    // InternalMyDsl.g:963:3: ruleSELECTFUNCT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getSELECTFUNCTParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSELECTFUNCT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getSELECTFUNCTParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:968:2: ( ruleDATABASE )
                    {
                    // InternalMyDsl.g:968:2: ( ruleDATABASE )
                    // InternalMyDsl.g:969:3: ruleDATABASE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getDATABASEParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDATABASE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getDATABASEParserRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:974:2: ( ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:974:2: ( ruleVariableDeclaration )
                    // InternalMyDsl.g:975:3: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getVariableDeclarationParserRuleCall_10()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getVariableDeclarationParserRuleCall_10()); 
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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__SELECT__Alternatives_1"
    // InternalMyDsl.g:984:1: rule__SELECT__Alternatives_1 : ( ( '*' ) | ( ( rule__SELECT__Group_1_1__0 )* ) );
    public final void rule__SELECT__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( '*' ) | ( ( rule__SELECT__Group_1_1__0 )* ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==32) ) {
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
                    // InternalMyDsl.g:989:2: ( '*' )
                    {
                    // InternalMyDsl.g:989:2: ( '*' )
                    // InternalMyDsl.g:990:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSELECTAccess().getAsteriskKeyword_1_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSELECTAccess().getAsteriskKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:995:2: ( ( rule__SELECT__Group_1_1__0 )* )
                    {
                    // InternalMyDsl.g:995:2: ( ( rule__SELECT__Group_1_1__0 )* )
                    // InternalMyDsl.g:996:3: ( rule__SELECT__Group_1_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSELECTAccess().getGroup_1_1()); 
                    }
                    // InternalMyDsl.g:997:3: ( rule__SELECT__Group_1_1__0 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:997:4: rule__SELECT__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__SELECT__Group_1_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSELECTAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__SELECT__Alternatives_1"


    // $ANTLR start "rule__FromAndWhereClauses__Alternatives_2_2_0"
    // InternalMyDsl.g:1005:1: rule__FromAndWhereClauses__Alternatives_2_2_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__FromAndWhereClauses__Alternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1010:2: ( 'AND' )
                    {
                    // InternalMyDsl.g:1010:2: ( 'AND' )
                    // InternalMyDsl.g:1011:3: 'AND'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1016:2: ( 'OR' )
                    {
                    // InternalMyDsl.g:1016:2: ( 'OR' )
                    // InternalMyDsl.g:1017:3: 'OR'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFromAndWhereClausesAccess().getORKeyword_2_2_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFromAndWhereClausesAccess().getORKeyword_2_2_0_1()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Alternatives_2_2_0"


    // $ANTLR start "rule__WHERE__SignAlternatives_1_0"
    // InternalMyDsl.g:1026:1: rule__WHERE__SignAlternatives_1_0 : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '!=' ) | ( 'LIKE' ) );
    public final void rule__WHERE__SignAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '!=' ) | ( 'LIKE' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 21:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1031:2: ( '=' )
                    {
                    // InternalMyDsl.g:1031:2: ( '=' )
                    // InternalMyDsl.g:1032:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getSignEqualsSignKeyword_1_0_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getSignEqualsSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1037:2: ( '<' )
                    {
                    // InternalMyDsl.g:1037:2: ( '<' )
                    // InternalMyDsl.g:1038:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getSignLessThanSignKeyword_1_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getSignLessThanSignKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1043:2: ( '<=' )
                    {
                    // InternalMyDsl.g:1043:2: ( '<=' )
                    // InternalMyDsl.g:1044:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getSignLessThanSignEqualsSignKeyword_1_0_2()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getSignLessThanSignEqualsSignKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1049:2: ( '>' )
                    {
                    // InternalMyDsl.g:1049:2: ( '>' )
                    // InternalMyDsl.g:1050:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getSignGreaterThanSignKeyword_1_0_3()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getSignGreaterThanSignKeyword_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1055:2: ( '>=' )
                    {
                    // InternalMyDsl.g:1055:2: ( '>=' )
                    // InternalMyDsl.g:1056:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getSignGreaterThanSignEqualsSignKeyword_1_0_4()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getSignGreaterThanSignEqualsSignKeyword_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1061:2: ( '!=' )
                    {
                    // InternalMyDsl.g:1061:2: ( '!=' )
                    // InternalMyDsl.g:1062:3: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getSignExclamationMarkEqualsSignKeyword_1_0_5()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getSignExclamationMarkEqualsSignKeyword_1_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1067:2: ( 'LIKE' )
                    {
                    // InternalMyDsl.g:1067:2: ( 'LIKE' )
                    // InternalMyDsl.g:1068:3: 'LIKE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getSignLIKEKeyword_1_0_6()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getSignLIKEKeyword_1_0_6()); 
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
    // $ANTLR end "rule__WHERE__SignAlternatives_1_0"


    // $ANTLR start "rule__WHERE__OperAlternatives_2_0"
    // InternalMyDsl.g:1077:1: rule__WHERE__OperAlternatives_2_0 : ( ( ruleOper1 ) | ( ruleOper2 ) | ( ruleOper3 ) );
    public final void rule__WHERE__OperAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( ( ruleOper1 ) | ( ruleOper2 ) | ( ruleOper3 ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1082:2: ( ruleOper1 )
                    {
                    // InternalMyDsl.g:1082:2: ( ruleOper1 )
                    // InternalMyDsl.g:1083:3: ruleOper1
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getOperOper1ParserRuleCall_2_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOper1();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getOperOper1ParserRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1088:2: ( ruleOper2 )
                    {
                    // InternalMyDsl.g:1088:2: ( ruleOper2 )
                    // InternalMyDsl.g:1089:3: ruleOper2
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getOperOper2ParserRuleCall_2_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOper2();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getOperOper2ParserRuleCall_2_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1094:2: ( ruleOper3 )
                    {
                    // InternalMyDsl.g:1094:2: ( ruleOper3 )
                    // InternalMyDsl.g:1095:3: ruleOper3
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWHEREAccess().getOperOper3ParserRuleCall_2_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOper3();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWHEREAccess().getOperOper3ParserRuleCall_2_0_2()); 
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
    // $ANTLR end "rule__WHERE__OperAlternatives_2_0"


    // $ANTLR start "rule__TABLE__AttributesAlternatives_4_0"
    // InternalMyDsl.g:1104:1: rule__TABLE__AttributesAlternatives_4_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TABLE__AttributesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1109:2: ( ruleColumnDeclaration )
                    {
                    // InternalMyDsl.g:1109:2: ( ruleColumnDeclaration )
                    // InternalMyDsl.g:1110:3: ruleColumnDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTABLEAccess().getAttributesColumnDeclarationParserRuleCall_4_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleColumnDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTABLEAccess().getAttributesColumnDeclarationParserRuleCall_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1115:2: ( rulePrimaryKey )
                    {
                    // InternalMyDsl.g:1115:2: ( rulePrimaryKey )
                    // InternalMyDsl.g:1116:3: rulePrimaryKey
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTABLEAccess().getAttributesPrimaryKeyParserRuleCall_4_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTABLEAccess().getAttributesPrimaryKeyParserRuleCall_4_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1121:2: ( ruleForeignKey )
                    {
                    // InternalMyDsl.g:1121:2: ( ruleForeignKey )
                    // InternalMyDsl.g:1122:3: ruleForeignKey
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTABLEAccess().getAttributesForeignKeyParserRuleCall_4_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForeignKey();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTABLEAccess().getAttributesForeignKeyParserRuleCall_4_0_2()); 
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
    // $ANTLR end "rule__TABLE__AttributesAlternatives_4_0"


    // $ANTLR start "rule__TABLE__AttributesAlternatives_5_1_0"
    // InternalMyDsl.g:1131:1: rule__TABLE__AttributesAlternatives_5_1_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TABLE__AttributesAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1136:2: ( ruleColumnDeclaration )
                    {
                    // InternalMyDsl.g:1136:2: ( ruleColumnDeclaration )
                    // InternalMyDsl.g:1137:3: ruleColumnDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTABLEAccess().getAttributesColumnDeclarationParserRuleCall_5_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleColumnDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTABLEAccess().getAttributesColumnDeclarationParserRuleCall_5_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1142:2: ( rulePrimaryKey )
                    {
                    // InternalMyDsl.g:1142:2: ( rulePrimaryKey )
                    // InternalMyDsl.g:1143:3: rulePrimaryKey
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTABLEAccess().getAttributesPrimaryKeyParserRuleCall_5_1_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTABLEAccess().getAttributesPrimaryKeyParserRuleCall_5_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1148:2: ( ruleForeignKey )
                    {
                    // InternalMyDsl.g:1148:2: ( ruleForeignKey )
                    // InternalMyDsl.g:1149:3: ruleForeignKey
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTABLEAccess().getAttributesForeignKeyParserRuleCall_5_1_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForeignKey();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTABLEAccess().getAttributesForeignKeyParserRuleCall_5_1_0_2()); 
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
    // $ANTLR end "rule__TABLE__AttributesAlternatives_5_1_0"


    // $ANTLR start "rule__UPDATE__Alternatives_5_2_0"
    // InternalMyDsl.g:1158:1: rule__UPDATE__Alternatives_5_2_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__UPDATE__Alternatives_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1163:2: ( 'AND' )
                    {
                    // InternalMyDsl.g:1163:2: ( 'AND' )
                    // InternalMyDsl.g:1164:3: 'AND'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUPDATEAccess().getANDKeyword_5_2_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUPDATEAccess().getANDKeyword_5_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1169:2: ( 'OR' )
                    {
                    // InternalMyDsl.g:1169:2: ( 'OR' )
                    // InternalMyDsl.g:1170:3: 'OR'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUPDATEAccess().getORKeyword_5_2_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUPDATEAccess().getORKeyword_5_2_0_1()); 
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
    // $ANTLR end "rule__UPDATE__Alternatives_5_2_0"


    // $ANTLR start "rule__SetClause__Alternatives_2"
    // InternalMyDsl.g:1179:1: rule__SetClause__Alternatives_2 : ( ( ( rule__SetClause__Group_2_0__0 ) ) | ( ( rule__SetClause__ValAssignment_2_1 ) ) );
    public final void rule__SetClause__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( ( ( rule__SetClause__Group_2_0__0 ) ) | ( ( rule__SetClause__ValAssignment_2_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1184:2: ( ( rule__SetClause__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:1184:2: ( ( rule__SetClause__Group_2_0__0 ) )
                    // InternalMyDsl.g:1185:3: ( rule__SetClause__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetClauseAccess().getGroup_2_0()); 
                    }
                    // InternalMyDsl.g:1186:3: ( rule__SetClause__Group_2_0__0 )
                    // InternalMyDsl.g:1186:4: rule__SetClause__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetClause__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetClauseAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1190:2: ( ( rule__SetClause__ValAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:1190:2: ( ( rule__SetClause__ValAssignment_2_1 ) )
                    // InternalMyDsl.g:1191:3: ( rule__SetClause__ValAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSetClauseAccess().getValAssignment_2_1()); 
                    }
                    // InternalMyDsl.g:1192:3: ( rule__SetClause__ValAssignment_2_1 )
                    // InternalMyDsl.g:1192:4: rule__SetClause__ValAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetClause__ValAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSetClauseAccess().getValAssignment_2_1()); 
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
    // $ANTLR end "rule__SetClause__Alternatives_2"


    // $ANTLR start "rule__ALTER__AddDropUpdateAlternatives_3_0"
    // InternalMyDsl.g:1200:1: rule__ALTER__AddDropUpdateAlternatives_3_0 : ( ( ruleALTERDROP ) | ( ruleALTERADD ) | ( ruleALTERUPDATE ) );
    public final void rule__ALTER__AddDropUpdateAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ruleALTERDROP ) | ( ruleALTERADD ) | ( ruleALTERUPDATE ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt13=1;
                }
                break;
            case 51:
                {
                alt13=2;
                }
                break;
            case 49:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1205:2: ( ruleALTERDROP )
                    {
                    // InternalMyDsl.g:1205:2: ( ruleALTERDROP )
                    // InternalMyDsl.g:1206:3: ruleALTERDROP
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALTERAccess().getAddDropUpdateALTERDROPParserRuleCall_3_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALTERDROP();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALTERAccess().getAddDropUpdateALTERDROPParserRuleCall_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1211:2: ( ruleALTERADD )
                    {
                    // InternalMyDsl.g:1211:2: ( ruleALTERADD )
                    // InternalMyDsl.g:1212:3: ruleALTERADD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALTERAccess().getAddDropUpdateALTERADDParserRuleCall_3_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALTERADD();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALTERAccess().getAddDropUpdateALTERADDParserRuleCall_3_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1217:2: ( ruleALTERUPDATE )
                    {
                    // InternalMyDsl.g:1217:2: ( ruleALTERUPDATE )
                    // InternalMyDsl.g:1218:3: ruleALTERUPDATE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALTERAccess().getAddDropUpdateALTERUPDATEParserRuleCall_3_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALTERUPDATE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALTERAccess().getAddDropUpdateALTERUPDATEParserRuleCall_3_0_2()); 
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
    // $ANTLR end "rule__ALTER__AddDropUpdateAlternatives_3_0"


    // $ANTLR start "rule__SELECTFUNCT__Alternatives"
    // InternalMyDsl.g:1227:1: rule__SELECTFUNCT__Alternatives : ( ( ( ruleCountFunction ) ) | ( ruleAvgFunction ) | ( ruleSumFunction ) | ( ruleMinFunction ) | ( ruleMaxFunction ) );
    public final void rule__SELECTFUNCT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( ( ruleCountFunction ) ) | ( ruleAvgFunction ) | ( ruleSumFunction ) | ( ruleMinFunction ) | ( ruleMaxFunction ) )
            int alt14=5;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt14=1;
                    }
                    break;
                case 55:
                    {
                    alt14=3;
                    }
                    break;
                case 57:
                    {
                    alt14=5;
                    }
                    break;
                case 54:
                    {
                    alt14=2;
                    }
                    break;
                case 56:
                    {
                    alt14=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1232:2: ( ( ruleCountFunction ) )
                    {
                    // InternalMyDsl.g:1232:2: ( ( ruleCountFunction ) )
                    // InternalMyDsl.g:1233:3: ( ruleCountFunction )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSELECTFUNCTAccess().getCountFunctionParserRuleCall_0()); 
                    }
                    // InternalMyDsl.g:1234:3: ( ruleCountFunction )
                    // InternalMyDsl.g:1234:4: ruleCountFunction
                    {
                    pushFollow(FOLLOW_2);
                    ruleCountFunction();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSELECTFUNCTAccess().getCountFunctionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1238:2: ( ruleAvgFunction )
                    {
                    // InternalMyDsl.g:1238:2: ( ruleAvgFunction )
                    // InternalMyDsl.g:1239:3: ruleAvgFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSELECTFUNCTAccess().getAvgFunctionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAvgFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSELECTFUNCTAccess().getAvgFunctionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1244:2: ( ruleSumFunction )
                    {
                    // InternalMyDsl.g:1244:2: ( ruleSumFunction )
                    // InternalMyDsl.g:1245:3: ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSELECTFUNCTAccess().getSumFunctionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSumFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSELECTFUNCTAccess().getSumFunctionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1250:2: ( ruleMinFunction )
                    {
                    // InternalMyDsl.g:1250:2: ( ruleMinFunction )
                    // InternalMyDsl.g:1251:3: ruleMinFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSELECTFUNCTAccess().getMinFunctionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMinFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSELECTFUNCTAccess().getMinFunctionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1256:2: ( ruleMaxFunction )
                    {
                    // InternalMyDsl.g:1256:2: ( ruleMaxFunction )
                    // InternalMyDsl.g:1257:3: ruleMaxFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSELECTFUNCTAccess().getMaxFunctionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMaxFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSELECTFUNCTAccess().getMaxFunctionParserRuleCall_4()); 
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
    // $ANTLR end "rule__SELECTFUNCT__Alternatives"


    // $ANTLR start "rule__DATATYPE__Alternatives"
    // InternalMyDsl.g:1266:1: rule__DATATYPE__Alternatives : ( ( ( 'VARCHAR' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) );
    public final void rule__DATATYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ( 'VARCHAR' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt15=1;
                }
                break;
            case 23:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            case 25:
                {
                alt15=4;
                }
                break;
            case 26:
                {
                alt15=5;
                }
                break;
            case 27:
                {
                alt15=6;
                }
                break;
            case 28:
                {
                alt15=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1271:2: ( ( 'VARCHAR' ) )
                    {
                    // InternalMyDsl.g:1271:2: ( ( 'VARCHAR' ) )
                    // InternalMyDsl.g:1272:3: ( 'VARCHAR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDATATYPEAccess().getVARCHAREnumLiteralDeclaration_0()); 
                    }
                    // InternalMyDsl.g:1273:3: ( 'VARCHAR' )
                    // InternalMyDsl.g:1273:4: 'VARCHAR'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDATATYPEAccess().getVARCHAREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1277:2: ( ( 'char' ) )
                    {
                    // InternalMyDsl.g:1277:2: ( ( 'char' ) )
                    // InternalMyDsl.g:1278:3: ( 'char' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDATATYPEAccess().getCHAREnumLiteralDeclaration_1()); 
                    }
                    // InternalMyDsl.g:1279:3: ( 'char' )
                    // InternalMyDsl.g:1279:4: 'char'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDATATYPEAccess().getCHAREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1283:2: ( ( 'date' ) )
                    {
                    // InternalMyDsl.g:1283:2: ( ( 'date' ) )
                    // InternalMyDsl.g:1284:3: ( 'date' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDATATYPEAccess().getDATEEnumLiteralDeclaration_2()); 
                    }
                    // InternalMyDsl.g:1285:3: ( 'date' )
                    // InternalMyDsl.g:1285:4: 'date'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDATATYPEAccess().getDATEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1289:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:1289:2: ( ( 'int' ) )
                    // InternalMyDsl.g:1290:3: ( 'int' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDATATYPEAccess().getINTEnumLiteralDeclaration_3()); 
                    }
                    // InternalMyDsl.g:1291:3: ( 'int' )
                    // InternalMyDsl.g:1291:4: 'int'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDATATYPEAccess().getINTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1295:2: ( ( 'float' ) )
                    {
                    // InternalMyDsl.g:1295:2: ( ( 'float' ) )
                    // InternalMyDsl.g:1296:3: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDATATYPEAccess().getFLOATEnumLiteralDeclaration_4()); 
                    }
                    // InternalMyDsl.g:1297:3: ( 'float' )
                    // InternalMyDsl.g:1297:4: 'float'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDATATYPEAccess().getFLOATEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1301:2: ( ( 'time' ) )
                    {
                    // InternalMyDsl.g:1301:2: ( ( 'time' ) )
                    // InternalMyDsl.g:1302:3: ( 'time' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDATATYPEAccess().getTIMEEnumLiteralDeclaration_5()); 
                    }
                    // InternalMyDsl.g:1303:3: ( 'time' )
                    // InternalMyDsl.g:1303:4: 'time'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDATATYPEAccess().getTIMEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1307:2: ( ( 'text' ) )
                    {
                    // InternalMyDsl.g:1307:2: ( ( 'text' ) )
                    // InternalMyDsl.g:1308:3: ( 'text' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDATATYPEAccess().getTEXTEnumLiteralDeclaration_6()); 
                    }
                    // InternalMyDsl.g:1309:3: ( 'text' )
                    // InternalMyDsl.g:1309:4: 'text'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDATATYPEAccess().getTEXTEnumLiteralDeclaration_6()); 
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
    // $ANTLR end "rule__DATATYPE__Alternatives"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalMyDsl.g:1317:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalMyDsl.g:1322:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__REAL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

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
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalMyDsl.g:1329:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:1334:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:1334:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:1335:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            }
            // InternalMyDsl.g:1336:2: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1336:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalMyDsl.g:1344:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalMyDsl.g:1349:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__REAL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

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
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalMyDsl.g:1356:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( '.' ) )
            // InternalMyDsl.g:1361:1: ( '.' )
            {
            // InternalMyDsl.g:1361:1: ( '.' )
            // InternalMyDsl.g:1362:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalMyDsl.g:1371:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__REAL__Group__2__Impl )
            // InternalMyDsl.g:1376:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

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
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalMyDsl.g:1382:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1387:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1387:1: ( RULE_INT )
            // InternalMyDsl.g:1388:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__SELECT__Group__0"
    // InternalMyDsl.g:1398:1: rule__SELECT__Group__0 : rule__SELECT__Group__0__Impl rule__SELECT__Group__1 ;
    public final void rule__SELECT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__SELECT__Group__0__Impl rule__SELECT__Group__1 )
            // InternalMyDsl.g:1403:2: rule__SELECT__Group__0__Impl rule__SELECT__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SELECT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SELECT__Group__1();

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
    // $ANTLR end "rule__SELECT__Group__0"


    // $ANTLR start "rule__SELECT__Group__0__Impl"
    // InternalMyDsl.g:1410:1: rule__SELECT__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SELECT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( ( 'SELECT' ) )
            // InternalMyDsl.g:1415:1: ( 'SELECT' )
            {
            // InternalMyDsl.g:1415:1: ( 'SELECT' )
            // InternalMyDsl.g:1416:2: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getSELECTKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getSELECTKeyword_0()); 
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
    // $ANTLR end "rule__SELECT__Group__0__Impl"


    // $ANTLR start "rule__SELECT__Group__1"
    // InternalMyDsl.g:1425:1: rule__SELECT__Group__1 : rule__SELECT__Group__1__Impl rule__SELECT__Group__2 ;
    public final void rule__SELECT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__SELECT__Group__1__Impl rule__SELECT__Group__2 )
            // InternalMyDsl.g:1430:2: rule__SELECT__Group__1__Impl rule__SELECT__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SELECT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SELECT__Group__2();

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
    // $ANTLR end "rule__SELECT__Group__1"


    // $ANTLR start "rule__SELECT__Group__1__Impl"
    // InternalMyDsl.g:1437:1: rule__SELECT__Group__1__Impl : ( ( rule__SELECT__Alternatives_1 ) ) ;
    public final void rule__SELECT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( ( ( rule__SELECT__Alternatives_1 ) ) )
            // InternalMyDsl.g:1442:1: ( ( rule__SELECT__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1442:1: ( ( rule__SELECT__Alternatives_1 ) )
            // InternalMyDsl.g:1443:2: ( rule__SELECT__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getAlternatives_1()); 
            }
            // InternalMyDsl.g:1444:2: ( rule__SELECT__Alternatives_1 )
            // InternalMyDsl.g:1444:3: rule__SELECT__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__SELECT__Group__1__Impl"


    // $ANTLR start "rule__SELECT__Group__2"
    // InternalMyDsl.g:1452:1: rule__SELECT__Group__2 : rule__SELECT__Group__2__Impl ;
    public final void rule__SELECT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__SELECT__Group__2__Impl )
            // InternalMyDsl.g:1457:2: rule__SELECT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Group__2__Impl();

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
    // $ANTLR end "rule__SELECT__Group__2"


    // $ANTLR start "rule__SELECT__Group__2__Impl"
    // InternalMyDsl.g:1463:1: rule__SELECT__Group__2__Impl : ( ( rule__SELECT__XAssignment_2 ) ) ;
    public final void rule__SELECT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( ( rule__SELECT__XAssignment_2 ) ) )
            // InternalMyDsl.g:1468:1: ( ( rule__SELECT__XAssignment_2 ) )
            {
            // InternalMyDsl.g:1468:1: ( ( rule__SELECT__XAssignment_2 ) )
            // InternalMyDsl.g:1469:2: ( rule__SELECT__XAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getXAssignment_2()); 
            }
            // InternalMyDsl.g:1470:2: ( rule__SELECT__XAssignment_2 )
            // InternalMyDsl.g:1470:3: rule__SELECT__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__XAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getXAssignment_2()); 
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
    // $ANTLR end "rule__SELECT__Group__2__Impl"


    // $ANTLR start "rule__SELECT__Group_1_1__0"
    // InternalMyDsl.g:1479:1: rule__SELECT__Group_1_1__0 : rule__SELECT__Group_1_1__0__Impl rule__SELECT__Group_1_1__1 ;
    public final void rule__SELECT__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__SELECT__Group_1_1__0__Impl rule__SELECT__Group_1_1__1 )
            // InternalMyDsl.g:1484:2: rule__SELECT__Group_1_1__0__Impl rule__SELECT__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__SELECT__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SELECT__Group_1_1__1();

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
    // $ANTLR end "rule__SELECT__Group_1_1__0"


    // $ANTLR start "rule__SELECT__Group_1_1__0__Impl"
    // InternalMyDsl.g:1491:1: rule__SELECT__Group_1_1__0__Impl : ( ( rule__SELECT__ColumnAssignment_1_1_0 ) ) ;
    public final void rule__SELECT__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( ( rule__SELECT__ColumnAssignment_1_1_0 ) ) )
            // InternalMyDsl.g:1496:1: ( ( rule__SELECT__ColumnAssignment_1_1_0 ) )
            {
            // InternalMyDsl.g:1496:1: ( ( rule__SELECT__ColumnAssignment_1_1_0 ) )
            // InternalMyDsl.g:1497:2: ( rule__SELECT__ColumnAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getColumnAssignment_1_1_0()); 
            }
            // InternalMyDsl.g:1498:2: ( rule__SELECT__ColumnAssignment_1_1_0 )
            // InternalMyDsl.g:1498:3: rule__SELECT__ColumnAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__ColumnAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getColumnAssignment_1_1_0()); 
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
    // $ANTLR end "rule__SELECT__Group_1_1__0__Impl"


    // $ANTLR start "rule__SELECT__Group_1_1__1"
    // InternalMyDsl.g:1506:1: rule__SELECT__Group_1_1__1 : rule__SELECT__Group_1_1__1__Impl ;
    public final void rule__SELECT__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__SELECT__Group_1_1__1__Impl )
            // InternalMyDsl.g:1511:2: rule__SELECT__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__SELECT__Group_1_1__1"


    // $ANTLR start "rule__SELECT__Group_1_1__1__Impl"
    // InternalMyDsl.g:1517:1: rule__SELECT__Group_1_1__1__Impl : ( ( rule__SELECT__Group_1_1_1__0 )* ) ;
    public final void rule__SELECT__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( ( ( rule__SELECT__Group_1_1_1__0 )* ) )
            // InternalMyDsl.g:1522:1: ( ( rule__SELECT__Group_1_1_1__0 )* )
            {
            // InternalMyDsl.g:1522:1: ( ( rule__SELECT__Group_1_1_1__0 )* )
            // InternalMyDsl.g:1523:2: ( rule__SELECT__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getGroup_1_1_1()); 
            }
            // InternalMyDsl.g:1524:2: ( rule__SELECT__Group_1_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1524:3: rule__SELECT__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SELECT__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__SELECT__Group_1_1__1__Impl"


    // $ANTLR start "rule__SELECT__Group_1_1_1__0"
    // InternalMyDsl.g:1533:1: rule__SELECT__Group_1_1_1__0 : rule__SELECT__Group_1_1_1__0__Impl rule__SELECT__Group_1_1_1__1 ;
    public final void rule__SELECT__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__SELECT__Group_1_1_1__0__Impl rule__SELECT__Group_1_1_1__1 )
            // InternalMyDsl.g:1538:2: rule__SELECT__Group_1_1_1__0__Impl rule__SELECT__Group_1_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__SELECT__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SELECT__Group_1_1_1__1();

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
    // $ANTLR end "rule__SELECT__Group_1_1_1__0"


    // $ANTLR start "rule__SELECT__Group_1_1_1__0__Impl"
    // InternalMyDsl.g:1545:1: rule__SELECT__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__SELECT__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( ',' ) )
            // InternalMyDsl.g:1550:1: ( ',' )
            {
            // InternalMyDsl.g:1550:1: ( ',' )
            // InternalMyDsl.g:1551:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getCommaKeyword_1_1_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getCommaKeyword_1_1_1_0()); 
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
    // $ANTLR end "rule__SELECT__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__SELECT__Group_1_1_1__1"
    // InternalMyDsl.g:1560:1: rule__SELECT__Group_1_1_1__1 : rule__SELECT__Group_1_1_1__1__Impl ;
    public final void rule__SELECT__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__SELECT__Group_1_1_1__1__Impl )
            // InternalMyDsl.g:1565:2: rule__SELECT__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__SELECT__Group_1_1_1__1"


    // $ANTLR start "rule__SELECT__Group_1_1_1__1__Impl"
    // InternalMyDsl.g:1571:1: rule__SELECT__Group_1_1_1__1__Impl : ( ( rule__SELECT__ColumnAssignment_1_1_1_1 ) ) ;
    public final void rule__SELECT__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( ( ( rule__SELECT__ColumnAssignment_1_1_1_1 ) ) )
            // InternalMyDsl.g:1576:1: ( ( rule__SELECT__ColumnAssignment_1_1_1_1 ) )
            {
            // InternalMyDsl.g:1576:1: ( ( rule__SELECT__ColumnAssignment_1_1_1_1 ) )
            // InternalMyDsl.g:1577:2: ( rule__SELECT__ColumnAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getColumnAssignment_1_1_1_1()); 
            }
            // InternalMyDsl.g:1578:2: ( rule__SELECT__ColumnAssignment_1_1_1_1 )
            // InternalMyDsl.g:1578:3: rule__SELECT__ColumnAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__ColumnAssignment_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getColumnAssignment_1_1_1_1()); 
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
    // $ANTLR end "rule__SELECT__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group__0"
    // InternalMyDsl.g:1587:1: rule__FromAndWhereClauses__Group__0 : rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1 ;
    public final void rule__FromAndWhereClauses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1 )
            // InternalMyDsl.g:1592:2: rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FromAndWhereClauses__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group__1();

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
    // $ANTLR end "rule__FromAndWhereClauses__Group__0"


    // $ANTLR start "rule__FromAndWhereClauses__Group__0__Impl"
    // InternalMyDsl.g:1599:1: rule__FromAndWhereClauses__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__FromAndWhereClauses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( 'FROM' ) )
            // InternalMyDsl.g:1604:1: ( 'FROM' )
            {
            // InternalMyDsl.g:1604:1: ( 'FROM' )
            // InternalMyDsl.g:1605:2: 'FROM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getFROMKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getFROMKeyword_0()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Group__0__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group__1"
    // InternalMyDsl.g:1614:1: rule__FromAndWhereClauses__Group__1 : rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2 ;
    public final void rule__FromAndWhereClauses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2 )
            // InternalMyDsl.g:1619:2: rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FromAndWhereClauses__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group__2();

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
    // $ANTLR end "rule__FromAndWhereClauses__Group__1"


    // $ANTLR start "rule__FromAndWhereClauses__Group__1__Impl"
    // InternalMyDsl.g:1626:1: rule__FromAndWhereClauses__Group__1__Impl : ( ( rule__FromAndWhereClauses__TableAssignment_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( ( rule__FromAndWhereClauses__TableAssignment_1 ) ) )
            // InternalMyDsl.g:1631:1: ( ( rule__FromAndWhereClauses__TableAssignment_1 ) )
            {
            // InternalMyDsl.g:1631:1: ( ( rule__FromAndWhereClauses__TableAssignment_1 ) )
            // InternalMyDsl.g:1632:2: ( rule__FromAndWhereClauses__TableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getTableAssignment_1()); 
            }
            // InternalMyDsl.g:1633:2: ( rule__FromAndWhereClauses__TableAssignment_1 )
            // InternalMyDsl.g:1633:3: rule__FromAndWhereClauses__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__TableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getTableAssignment_1()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Group__1__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group__2"
    // InternalMyDsl.g:1641:1: rule__FromAndWhereClauses__Group__2 : rule__FromAndWhereClauses__Group__2__Impl ;
    public final void rule__FromAndWhereClauses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__FromAndWhereClauses__Group__2__Impl )
            // InternalMyDsl.g:1646:2: rule__FromAndWhereClauses__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group__2__Impl();

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
    // $ANTLR end "rule__FromAndWhereClauses__Group__2"


    // $ANTLR start "rule__FromAndWhereClauses__Group__2__Impl"
    // InternalMyDsl.g:1652:1: rule__FromAndWhereClauses__Group__2__Impl : ( ( rule__FromAndWhereClauses__Group_2__0 )? ) ;
    public final void rule__FromAndWhereClauses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ( rule__FromAndWhereClauses__Group_2__0 )? ) )
            // InternalMyDsl.g:1657:1: ( ( rule__FromAndWhereClauses__Group_2__0 )? )
            {
            // InternalMyDsl.g:1657:1: ( ( rule__FromAndWhereClauses__Group_2__0 )? )
            // InternalMyDsl.g:1658:2: ( rule__FromAndWhereClauses__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getGroup_2()); 
            }
            // InternalMyDsl.g:1659:2: ( rule__FromAndWhereClauses__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1659:3: rule__FromAndWhereClauses__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FromAndWhereClauses__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getGroup_2()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Group__2__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__0"
    // InternalMyDsl.g:1668:1: rule__FromAndWhereClauses__Group_2__0 : rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1 ;
    public final void rule__FromAndWhereClauses__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1 )
            // InternalMyDsl.g:1673:2: rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__FromAndWhereClauses__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2__1();

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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__0"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__0__Impl"
    // InternalMyDsl.g:1680:1: rule__FromAndWhereClauses__Group_2__0__Impl : ( 'WHERE' ) ;
    public final void rule__FromAndWhereClauses__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( 'WHERE' ) )
            // InternalMyDsl.g:1685:1: ( 'WHERE' )
            {
            // InternalMyDsl.g:1685:1: ( 'WHERE' )
            // InternalMyDsl.g:1686:2: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getWHEREKeyword_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getWHEREKeyword_2_0()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__0__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__1"
    // InternalMyDsl.g:1695:1: rule__FromAndWhereClauses__Group_2__1 : rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2 ;
    public final void rule__FromAndWhereClauses__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2 )
            // InternalMyDsl.g:1700:2: rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__FromAndWhereClauses__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2__2();

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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__1"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__1__Impl"
    // InternalMyDsl.g:1707:1: rule__FromAndWhereClauses__Group_2__1__Impl : ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) ) )
            // InternalMyDsl.g:1712:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1712:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) )
            // InternalMyDsl.g:1713:2: ( rule__FromAndWhereClauses__ZAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_1()); 
            }
            // InternalMyDsl.g:1714:2: ( rule__FromAndWhereClauses__ZAssignment_2_1 )
            // InternalMyDsl.g:1714:3: rule__FromAndWhereClauses__ZAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__ZAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_1()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__1__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__2"
    // InternalMyDsl.g:1722:1: rule__FromAndWhereClauses__Group_2__2 : rule__FromAndWhereClauses__Group_2__2__Impl ;
    public final void rule__FromAndWhereClauses__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__FromAndWhereClauses__Group_2__2__Impl )
            // InternalMyDsl.g:1727:2: rule__FromAndWhereClauses__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2__2__Impl();

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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__2"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__2__Impl"
    // InternalMyDsl.g:1733:1: rule__FromAndWhereClauses__Group_2__2__Impl : ( ( rule__FromAndWhereClauses__Group_2_2__0 )* ) ;
    public final void rule__FromAndWhereClauses__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( ( ( rule__FromAndWhereClauses__Group_2_2__0 )* ) )
            // InternalMyDsl.g:1738:1: ( ( rule__FromAndWhereClauses__Group_2_2__0 )* )
            {
            // InternalMyDsl.g:1738:1: ( ( rule__FromAndWhereClauses__Group_2_2__0 )* )
            // InternalMyDsl.g:1739:2: ( rule__FromAndWhereClauses__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getGroup_2_2()); 
            }
            // InternalMyDsl.g:1740:2: ( rule__FromAndWhereClauses__Group_2_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=13 && LA19_0<=14)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1740:3: rule__FromAndWhereClauses__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__FromAndWhereClauses__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getGroup_2_2()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__2__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2_2__0"
    // InternalMyDsl.g:1749:1: rule__FromAndWhereClauses__Group_2_2__0 : rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1 ;
    public final void rule__FromAndWhereClauses__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1 )
            // InternalMyDsl.g:1754:2: rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1
            {
            pushFollow(FOLLOW_12);
            rule__FromAndWhereClauses__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2_2__1();

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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2_2__0"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2_2__0__Impl"
    // InternalMyDsl.g:1761:1: rule__FromAndWhereClauses__Group_2_2__0__Impl : ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) ) )
            // InternalMyDsl.g:1766:1: ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) )
            {
            // InternalMyDsl.g:1766:1: ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) )
            // InternalMyDsl.g:1767:2: ( rule__FromAndWhereClauses__Alternatives_2_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getAlternatives_2_2_0()); 
            }
            // InternalMyDsl.g:1768:2: ( rule__FromAndWhereClauses__Alternatives_2_2_0 )
            // InternalMyDsl.g:1768:3: rule__FromAndWhereClauses__Alternatives_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Alternatives_2_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getAlternatives_2_2_0()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2_2__0__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2_2__1"
    // InternalMyDsl.g:1776:1: rule__FromAndWhereClauses__Group_2_2__1 : rule__FromAndWhereClauses__Group_2_2__1__Impl ;
    public final void rule__FromAndWhereClauses__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__FromAndWhereClauses__Group_2_2__1__Impl )
            // InternalMyDsl.g:1781:2: rule__FromAndWhereClauses__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2_2__1"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2_2__1__Impl"
    // InternalMyDsl.g:1787:1: rule__FromAndWhereClauses__Group_2_2__1__Impl : ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) ) )
            // InternalMyDsl.g:1792:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) )
            {
            // InternalMyDsl.g:1792:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) )
            // InternalMyDsl.g:1793:2: ( rule__FromAndWhereClauses__ZAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_2_1()); 
            }
            // InternalMyDsl.g:1794:2: ( rule__FromAndWhereClauses__ZAssignment_2_2_1 )
            // InternalMyDsl.g:1794:3: rule__FromAndWhereClauses__ZAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__ZAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_2_1()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__Group_2_2__1__Impl"


    // $ANTLR start "rule__WHERE__Group__0"
    // InternalMyDsl.g:1803:1: rule__WHERE__Group__0 : rule__WHERE__Group__0__Impl rule__WHERE__Group__1 ;
    public final void rule__WHERE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__WHERE__Group__0__Impl rule__WHERE__Group__1 )
            // InternalMyDsl.g:1808:2: rule__WHERE__Group__0__Impl rule__WHERE__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__WHERE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WHERE__Group__1();

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
    // $ANTLR end "rule__WHERE__Group__0"


    // $ANTLR start "rule__WHERE__Group__0__Impl"
    // InternalMyDsl.g:1815:1: rule__WHERE__Group__0__Impl : ( ( rule__WHERE__ColumnAssignment_0 ) ) ;
    public final void rule__WHERE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( ( rule__WHERE__ColumnAssignment_0 ) ) )
            // InternalMyDsl.g:1820:1: ( ( rule__WHERE__ColumnAssignment_0 ) )
            {
            // InternalMyDsl.g:1820:1: ( ( rule__WHERE__ColumnAssignment_0 ) )
            // InternalMyDsl.g:1821:2: ( rule__WHERE__ColumnAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHEREAccess().getColumnAssignment_0()); 
            }
            // InternalMyDsl.g:1822:2: ( rule__WHERE__ColumnAssignment_0 )
            // InternalMyDsl.g:1822:3: rule__WHERE__ColumnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__ColumnAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHEREAccess().getColumnAssignment_0()); 
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
    // $ANTLR end "rule__WHERE__Group__0__Impl"


    // $ANTLR start "rule__WHERE__Group__1"
    // InternalMyDsl.g:1830:1: rule__WHERE__Group__1 : rule__WHERE__Group__1__Impl rule__WHERE__Group__2 ;
    public final void rule__WHERE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__WHERE__Group__1__Impl rule__WHERE__Group__2 )
            // InternalMyDsl.g:1835:2: rule__WHERE__Group__1__Impl rule__WHERE__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__WHERE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WHERE__Group__2();

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
    // $ANTLR end "rule__WHERE__Group__1"


    // $ANTLR start "rule__WHERE__Group__1__Impl"
    // InternalMyDsl.g:1842:1: rule__WHERE__Group__1__Impl : ( ( rule__WHERE__SignAssignment_1 ) ) ;
    public final void rule__WHERE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ( rule__WHERE__SignAssignment_1 ) ) )
            // InternalMyDsl.g:1847:1: ( ( rule__WHERE__SignAssignment_1 ) )
            {
            // InternalMyDsl.g:1847:1: ( ( rule__WHERE__SignAssignment_1 ) )
            // InternalMyDsl.g:1848:2: ( rule__WHERE__SignAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHEREAccess().getSignAssignment_1()); 
            }
            // InternalMyDsl.g:1849:2: ( rule__WHERE__SignAssignment_1 )
            // InternalMyDsl.g:1849:3: rule__WHERE__SignAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__SignAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHEREAccess().getSignAssignment_1()); 
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
    // $ANTLR end "rule__WHERE__Group__1__Impl"


    // $ANTLR start "rule__WHERE__Group__2"
    // InternalMyDsl.g:1857:1: rule__WHERE__Group__2 : rule__WHERE__Group__2__Impl ;
    public final void rule__WHERE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__WHERE__Group__2__Impl )
            // InternalMyDsl.g:1862:2: rule__WHERE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__Group__2__Impl();

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
    // $ANTLR end "rule__WHERE__Group__2"


    // $ANTLR start "rule__WHERE__Group__2__Impl"
    // InternalMyDsl.g:1868:1: rule__WHERE__Group__2__Impl : ( ( rule__WHERE__OperAssignment_2 ) ) ;
    public final void rule__WHERE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( ( ( rule__WHERE__OperAssignment_2 ) ) )
            // InternalMyDsl.g:1873:1: ( ( rule__WHERE__OperAssignment_2 ) )
            {
            // InternalMyDsl.g:1873:1: ( ( rule__WHERE__OperAssignment_2 ) )
            // InternalMyDsl.g:1874:2: ( rule__WHERE__OperAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHEREAccess().getOperAssignment_2()); 
            }
            // InternalMyDsl.g:1875:2: ( rule__WHERE__OperAssignment_2 )
            // InternalMyDsl.g:1875:3: rule__WHERE__OperAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__OperAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHEREAccess().getOperAssignment_2()); 
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
    // $ANTLR end "rule__WHERE__Group__2__Impl"


    // $ANTLR start "rule__Oper1__Group__0"
    // InternalMyDsl.g:1884:1: rule__Oper1__Group__0 : rule__Oper1__Group__0__Impl rule__Oper1__Group__1 ;
    public final void rule__Oper1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__Oper1__Group__0__Impl rule__Oper1__Group__1 )
            // InternalMyDsl.g:1889:2: rule__Oper1__Group__0__Impl rule__Oper1__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Oper1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oper1__Group__1();

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
    // $ANTLR end "rule__Oper1__Group__0"


    // $ANTLR start "rule__Oper1__Group__0__Impl"
    // InternalMyDsl.g:1896:1: rule__Oper1__Group__0__Impl : ( '#' ) ;
    public final void rule__Oper1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( ( '#' ) )
            // InternalMyDsl.g:1901:1: ( '#' )
            {
            // InternalMyDsl.g:1901:1: ( '#' )
            // InternalMyDsl.g:1902:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper1Access().getNumberSignKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper1Access().getNumberSignKeyword_0()); 
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
    // $ANTLR end "rule__Oper1__Group__0__Impl"


    // $ANTLR start "rule__Oper1__Group__1"
    // InternalMyDsl.g:1911:1: rule__Oper1__Group__1 : rule__Oper1__Group__1__Impl rule__Oper1__Group__2 ;
    public final void rule__Oper1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__Oper1__Group__1__Impl rule__Oper1__Group__2 )
            // InternalMyDsl.g:1916:2: rule__Oper1__Group__1__Impl rule__Oper1__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Oper1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Oper1__Group__2();

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
    // $ANTLR end "rule__Oper1__Group__1"


    // $ANTLR start "rule__Oper1__Group__1__Impl"
    // InternalMyDsl.g:1923:1: rule__Oper1__Group__1__Impl : ( ( rule__Oper1__NameAssignment_1 ) ) ;
    public final void rule__Oper1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( ( rule__Oper1__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1928:1: ( ( rule__Oper1__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1928:1: ( ( rule__Oper1__NameAssignment_1 ) )
            // InternalMyDsl.g:1929:2: ( rule__Oper1__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper1Access().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:1930:2: ( rule__Oper1__NameAssignment_1 )
            // InternalMyDsl.g:1930:3: rule__Oper1__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Oper1__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper1Access().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Oper1__Group__1__Impl"


    // $ANTLR start "rule__Oper1__Group__2"
    // InternalMyDsl.g:1938:1: rule__Oper1__Group__2 : rule__Oper1__Group__2__Impl ;
    public final void rule__Oper1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__Oper1__Group__2__Impl )
            // InternalMyDsl.g:1943:2: rule__Oper1__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Oper1__Group__2__Impl();

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
    // $ANTLR end "rule__Oper1__Group__2"


    // $ANTLR start "rule__Oper1__Group__2__Impl"
    // InternalMyDsl.g:1949:1: rule__Oper1__Group__2__Impl : ( '#' ) ;
    public final void rule__Oper1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( '#' ) )
            // InternalMyDsl.g:1954:1: ( '#' )
            {
            // InternalMyDsl.g:1954:1: ( '#' )
            // InternalMyDsl.g:1955:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper1Access().getNumberSignKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper1Access().getNumberSignKeyword_2()); 
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
    // $ANTLR end "rule__Oper1__Group__2__Impl"


    // $ANTLR start "rule__DATABASE__Group__0"
    // InternalMyDsl.g:1965:1: rule__DATABASE__Group__0 : rule__DATABASE__Group__0__Impl rule__DATABASE__Group__1 ;
    public final void rule__DATABASE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__DATABASE__Group__0__Impl rule__DATABASE__Group__1 )
            // InternalMyDsl.g:1970:2: rule__DATABASE__Group__0__Impl rule__DATABASE__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DATABASE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DATABASE__Group__1();

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
    // $ANTLR end "rule__DATABASE__Group__0"


    // $ANTLR start "rule__DATABASE__Group__0__Impl"
    // InternalMyDsl.g:1977:1: rule__DATABASE__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__DATABASE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( ( 'CREATE' ) )
            // InternalMyDsl.g:1982:1: ( 'CREATE' )
            {
            // InternalMyDsl.g:1982:1: ( 'CREATE' )
            // InternalMyDsl.g:1983:2: 'CREATE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDATABASEAccess().getCREATEKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDATABASEAccess().getCREATEKeyword_0()); 
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
    // $ANTLR end "rule__DATABASE__Group__0__Impl"


    // $ANTLR start "rule__DATABASE__Group__1"
    // InternalMyDsl.g:1992:1: rule__DATABASE__Group__1 : rule__DATABASE__Group__1__Impl rule__DATABASE__Group__2 ;
    public final void rule__DATABASE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__DATABASE__Group__1__Impl rule__DATABASE__Group__2 )
            // InternalMyDsl.g:1997:2: rule__DATABASE__Group__1__Impl rule__DATABASE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DATABASE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DATABASE__Group__2();

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
    // $ANTLR end "rule__DATABASE__Group__1"


    // $ANTLR start "rule__DATABASE__Group__1__Impl"
    // InternalMyDsl.g:2004:1: rule__DATABASE__Group__1__Impl : ( 'DATABASE' ) ;
    public final void rule__DATABASE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( 'DATABASE' ) )
            // InternalMyDsl.g:2009:1: ( 'DATABASE' )
            {
            // InternalMyDsl.g:2009:1: ( 'DATABASE' )
            // InternalMyDsl.g:2010:2: 'DATABASE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDATABASEAccess().getDATABASEKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDATABASEAccess().getDATABASEKeyword_1()); 
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
    // $ANTLR end "rule__DATABASE__Group__1__Impl"


    // $ANTLR start "rule__DATABASE__Group__2"
    // InternalMyDsl.g:2019:1: rule__DATABASE__Group__2 : rule__DATABASE__Group__2__Impl ;
    public final void rule__DATABASE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__DATABASE__Group__2__Impl )
            // InternalMyDsl.g:2024:2: rule__DATABASE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DATABASE__Group__2__Impl();

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
    // $ANTLR end "rule__DATABASE__Group__2"


    // $ANTLR start "rule__DATABASE__Group__2__Impl"
    // InternalMyDsl.g:2030:1: rule__DATABASE__Group__2__Impl : ( ( rule__DATABASE__NameAssignment_2 ) ) ;
    public final void rule__DATABASE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( ( rule__DATABASE__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2035:1: ( ( rule__DATABASE__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2035:1: ( ( rule__DATABASE__NameAssignment_2 ) )
            // InternalMyDsl.g:2036:2: ( rule__DATABASE__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDATABASEAccess().getNameAssignment_2()); 
            }
            // InternalMyDsl.g:2037:2: ( rule__DATABASE__NameAssignment_2 )
            // InternalMyDsl.g:2037:3: rule__DATABASE__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DATABASE__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDATABASEAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__DATABASE__Group__2__Impl"


    // $ANTLR start "rule__TABLE__Group__0"
    // InternalMyDsl.g:2046:1: rule__TABLE__Group__0 : rule__TABLE__Group__0__Impl rule__TABLE__Group__1 ;
    public final void rule__TABLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__TABLE__Group__0__Impl rule__TABLE__Group__1 )
            // InternalMyDsl.g:2051:2: rule__TABLE__Group__0__Impl rule__TABLE__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TABLE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TABLE__Group__1();

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
    // $ANTLR end "rule__TABLE__Group__0"


    // $ANTLR start "rule__TABLE__Group__0__Impl"
    // InternalMyDsl.g:2058:1: rule__TABLE__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__TABLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( 'CREATE' ) )
            // InternalMyDsl.g:2063:1: ( 'CREATE' )
            {
            // InternalMyDsl.g:2063:1: ( 'CREATE' )
            // InternalMyDsl.g:2064:2: 'CREATE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getCREATEKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getCREATEKeyword_0()); 
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
    // $ANTLR end "rule__TABLE__Group__0__Impl"


    // $ANTLR start "rule__TABLE__Group__1"
    // InternalMyDsl.g:2073:1: rule__TABLE__Group__1 : rule__TABLE__Group__1__Impl rule__TABLE__Group__2 ;
    public final void rule__TABLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__TABLE__Group__1__Impl rule__TABLE__Group__2 )
            // InternalMyDsl.g:2078:2: rule__TABLE__Group__1__Impl rule__TABLE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TABLE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TABLE__Group__2();

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
    // $ANTLR end "rule__TABLE__Group__1"


    // $ANTLR start "rule__TABLE__Group__1__Impl"
    // InternalMyDsl.g:2085:1: rule__TABLE__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TABLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( ( 'TABLE' ) )
            // InternalMyDsl.g:2090:1: ( 'TABLE' )
            {
            // InternalMyDsl.g:2090:1: ( 'TABLE' )
            // InternalMyDsl.g:2091:2: 'TABLE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getTABLEKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getTABLEKeyword_1()); 
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
    // $ANTLR end "rule__TABLE__Group__1__Impl"


    // $ANTLR start "rule__TABLE__Group__2"
    // InternalMyDsl.g:2100:1: rule__TABLE__Group__2 : rule__TABLE__Group__2__Impl rule__TABLE__Group__3 ;
    public final void rule__TABLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__TABLE__Group__2__Impl rule__TABLE__Group__3 )
            // InternalMyDsl.g:2105:2: rule__TABLE__Group__2__Impl rule__TABLE__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__TABLE__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TABLE__Group__3();

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
    // $ANTLR end "rule__TABLE__Group__2"


    // $ANTLR start "rule__TABLE__Group__2__Impl"
    // InternalMyDsl.g:2112:1: rule__TABLE__Group__2__Impl : ( ( rule__TABLE__TableAssignment_2 ) ) ;
    public final void rule__TABLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( ( rule__TABLE__TableAssignment_2 ) ) )
            // InternalMyDsl.g:2117:1: ( ( rule__TABLE__TableAssignment_2 ) )
            {
            // InternalMyDsl.g:2117:1: ( ( rule__TABLE__TableAssignment_2 ) )
            // InternalMyDsl.g:2118:2: ( rule__TABLE__TableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getTableAssignment_2()); 
            }
            // InternalMyDsl.g:2119:2: ( rule__TABLE__TableAssignment_2 )
            // InternalMyDsl.g:2119:3: rule__TABLE__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TABLE__TableAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getTableAssignment_2()); 
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
    // $ANTLR end "rule__TABLE__Group__2__Impl"


    // $ANTLR start "rule__TABLE__Group__3"
    // InternalMyDsl.g:2127:1: rule__TABLE__Group__3 : rule__TABLE__Group__3__Impl rule__TABLE__Group__4 ;
    public final void rule__TABLE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__TABLE__Group__3__Impl rule__TABLE__Group__4 )
            // InternalMyDsl.g:2132:2: rule__TABLE__Group__3__Impl rule__TABLE__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__TABLE__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TABLE__Group__4();

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
    // $ANTLR end "rule__TABLE__Group__3"


    // $ANTLR start "rule__TABLE__Group__3__Impl"
    // InternalMyDsl.g:2139:1: rule__TABLE__Group__3__Impl : ( '(' ) ;
    public final void rule__TABLE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( ( '(' ) )
            // InternalMyDsl.g:2144:1: ( '(' )
            {
            // InternalMyDsl.g:2144:1: ( '(' )
            // InternalMyDsl.g:2145:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getLeftParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__TABLE__Group__3__Impl"


    // $ANTLR start "rule__TABLE__Group__4"
    // InternalMyDsl.g:2154:1: rule__TABLE__Group__4 : rule__TABLE__Group__4__Impl rule__TABLE__Group__5 ;
    public final void rule__TABLE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__TABLE__Group__4__Impl rule__TABLE__Group__5 )
            // InternalMyDsl.g:2159:2: rule__TABLE__Group__4__Impl rule__TABLE__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__TABLE__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TABLE__Group__5();

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
    // $ANTLR end "rule__TABLE__Group__4"


    // $ANTLR start "rule__TABLE__Group__4__Impl"
    // InternalMyDsl.g:2166:1: rule__TABLE__Group__4__Impl : ( ( ( rule__TABLE__AttributesAssignment_4 ) ) ( ( rule__TABLE__AttributesAssignment_4 )* ) ) ;
    public final void rule__TABLE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( ( ( rule__TABLE__AttributesAssignment_4 ) ) ( ( rule__TABLE__AttributesAssignment_4 )* ) ) )
            // InternalMyDsl.g:2171:1: ( ( ( rule__TABLE__AttributesAssignment_4 ) ) ( ( rule__TABLE__AttributesAssignment_4 )* ) )
            {
            // InternalMyDsl.g:2171:1: ( ( ( rule__TABLE__AttributesAssignment_4 ) ) ( ( rule__TABLE__AttributesAssignment_4 )* ) )
            // InternalMyDsl.g:2172:2: ( ( rule__TABLE__AttributesAssignment_4 ) ) ( ( rule__TABLE__AttributesAssignment_4 )* )
            {
            // InternalMyDsl.g:2172:2: ( ( rule__TABLE__AttributesAssignment_4 ) )
            // InternalMyDsl.g:2173:3: ( rule__TABLE__AttributesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getAttributesAssignment_4()); 
            }
            // InternalMyDsl.g:2174:3: ( rule__TABLE__AttributesAssignment_4 )
            // InternalMyDsl.g:2174:4: rule__TABLE__AttributesAssignment_4
            {
            pushFollow(FOLLOW_24);
            rule__TABLE__AttributesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getAttributesAssignment_4()); 
            }

            }

            // InternalMyDsl.g:2177:2: ( ( rule__TABLE__AttributesAssignment_4 )* )
            // InternalMyDsl.g:2178:3: ( rule__TABLE__AttributesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getAttributesAssignment_4()); 
            }
            // InternalMyDsl.g:2179:3: ( rule__TABLE__AttributesAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==40||LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2179:4: rule__TABLE__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__TABLE__AttributesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getAttributesAssignment_4()); 
            }

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
    // $ANTLR end "rule__TABLE__Group__4__Impl"


    // $ANTLR start "rule__TABLE__Group__5"
    // InternalMyDsl.g:2188:1: rule__TABLE__Group__5 : rule__TABLE__Group__5__Impl rule__TABLE__Group__6 ;
    public final void rule__TABLE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__TABLE__Group__5__Impl rule__TABLE__Group__6 )
            // InternalMyDsl.g:2193:2: rule__TABLE__Group__5__Impl rule__TABLE__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__TABLE__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TABLE__Group__6();

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
    // $ANTLR end "rule__TABLE__Group__5"


    // $ANTLR start "rule__TABLE__Group__5__Impl"
    // InternalMyDsl.g:2200:1: rule__TABLE__Group__5__Impl : ( ( rule__TABLE__Group_5__0 )* ) ;
    public final void rule__TABLE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( ( rule__TABLE__Group_5__0 )* ) )
            // InternalMyDsl.g:2205:1: ( ( rule__TABLE__Group_5__0 )* )
            {
            // InternalMyDsl.g:2205:1: ( ( rule__TABLE__Group_5__0 )* )
            // InternalMyDsl.g:2206:2: ( rule__TABLE__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getGroup_5()); 
            }
            // InternalMyDsl.g:2207:2: ( rule__TABLE__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2207:3: rule__TABLE__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TABLE__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getGroup_5()); 
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
    // $ANTLR end "rule__TABLE__Group__5__Impl"


    // $ANTLR start "rule__TABLE__Group__6"
    // InternalMyDsl.g:2215:1: rule__TABLE__Group__6 : rule__TABLE__Group__6__Impl ;
    public final void rule__TABLE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__TABLE__Group__6__Impl )
            // InternalMyDsl.g:2220:2: rule__TABLE__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TABLE__Group__6__Impl();

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
    // $ANTLR end "rule__TABLE__Group__6"


    // $ANTLR start "rule__TABLE__Group__6__Impl"
    // InternalMyDsl.g:2226:1: rule__TABLE__Group__6__Impl : ( ')' ) ;
    public final void rule__TABLE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( ')' ) )
            // InternalMyDsl.g:2231:1: ( ')' )
            {
            // InternalMyDsl.g:2231:1: ( ')' )
            // InternalMyDsl.g:2232:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getRightParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__TABLE__Group__6__Impl"


    // $ANTLR start "rule__TABLE__Group_5__0"
    // InternalMyDsl.g:2242:1: rule__TABLE__Group_5__0 : rule__TABLE__Group_5__0__Impl rule__TABLE__Group_5__1 ;
    public final void rule__TABLE__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__TABLE__Group_5__0__Impl rule__TABLE__Group_5__1 )
            // InternalMyDsl.g:2247:2: rule__TABLE__Group_5__0__Impl rule__TABLE__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__TABLE__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TABLE__Group_5__1();

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
    // $ANTLR end "rule__TABLE__Group_5__0"


    // $ANTLR start "rule__TABLE__Group_5__0__Impl"
    // InternalMyDsl.g:2254:1: rule__TABLE__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TABLE__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( ( ',' ) )
            // InternalMyDsl.g:2259:1: ( ',' )
            {
            // InternalMyDsl.g:2259:1: ( ',' )
            // InternalMyDsl.g:2260:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getCommaKeyword_5_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getCommaKeyword_5_0()); 
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
    // $ANTLR end "rule__TABLE__Group_5__0__Impl"


    // $ANTLR start "rule__TABLE__Group_5__1"
    // InternalMyDsl.g:2269:1: rule__TABLE__Group_5__1 : rule__TABLE__Group_5__1__Impl ;
    public final void rule__TABLE__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__TABLE__Group_5__1__Impl )
            // InternalMyDsl.g:2274:2: rule__TABLE__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TABLE__Group_5__1__Impl();

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
    // $ANTLR end "rule__TABLE__Group_5__1"


    // $ANTLR start "rule__TABLE__Group_5__1__Impl"
    // InternalMyDsl.g:2280:1: rule__TABLE__Group_5__1__Impl : ( ( rule__TABLE__AttributesAssignment_5_1 ) ) ;
    public final void rule__TABLE__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( ( ( rule__TABLE__AttributesAssignment_5_1 ) ) )
            // InternalMyDsl.g:2285:1: ( ( rule__TABLE__AttributesAssignment_5_1 ) )
            {
            // InternalMyDsl.g:2285:1: ( ( rule__TABLE__AttributesAssignment_5_1 ) )
            // InternalMyDsl.g:2286:2: ( rule__TABLE__AttributesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getAttributesAssignment_5_1()); 
            }
            // InternalMyDsl.g:2287:2: ( rule__TABLE__AttributesAssignment_5_1 )
            // InternalMyDsl.g:2287:3: rule__TABLE__AttributesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TABLE__AttributesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getAttributesAssignment_5_1()); 
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
    // $ANTLR end "rule__TABLE__Group_5__1__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__0"
    // InternalMyDsl.g:2296:1: rule__ColumnDeclaration__Group__0 : rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 ;
    public final void rule__ColumnDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 )
            // InternalMyDsl.g:2301:2: rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ColumnDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__1();

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
    // $ANTLR end "rule__ColumnDeclaration__Group__0"


    // $ANTLR start "rule__ColumnDeclaration__Group__0__Impl"
    // InternalMyDsl.g:2308:1: rule__ColumnDeclaration__Group__0__Impl : ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ColumnDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2313:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2313:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            // InternalMyDsl.g:2314:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnDeclarationAccess().getNameAssignment_0()); 
            }
            // InternalMyDsl.g:2315:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            // InternalMyDsl.g:2315:3: rule__ColumnDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnDeclarationAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__ColumnDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__1"
    // InternalMyDsl.g:2323:1: rule__ColumnDeclaration__Group__1 : rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 ;
    public final void rule__ColumnDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 )
            // InternalMyDsl.g:2328:2: rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ColumnDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__2();

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
    // $ANTLR end "rule__ColumnDeclaration__Group__1"


    // $ANTLR start "rule__ColumnDeclaration__Group__1__Impl"
    // InternalMyDsl.g:2335:1: rule__ColumnDeclaration__Group__1__Impl : ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__ColumnDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:2340:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:2340:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            // InternalMyDsl.g:2341:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_1()); 
            }
            // InternalMyDsl.g:2342:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            // InternalMyDsl.g:2342:3: rule__ColumnDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__ColumnDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__2"
    // InternalMyDsl.g:2350:1: rule__ColumnDeclaration__Group__2 : rule__ColumnDeclaration__Group__2__Impl ;
    public final void rule__ColumnDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( rule__ColumnDeclaration__Group__2__Impl )
            // InternalMyDsl.g:2355:2: rule__ColumnDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__ColumnDeclaration__Group__2"


    // $ANTLR start "rule__ColumnDeclaration__Group__2__Impl"
    // InternalMyDsl.g:2361:1: rule__ColumnDeclaration__Group__2__Impl : ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) ;
    public final void rule__ColumnDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) )
            // InternalMyDsl.g:2366:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            {
            // InternalMyDsl.g:2366:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            // InternalMyDsl.g:2367:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnDeclarationAccess().getNotNullAssignment_2()); 
            }
            // InternalMyDsl.g:2368:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_NOTNULL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2368:3: rule__ColumnDeclaration__NotNullAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnDeclaration__NotNullAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnDeclarationAccess().getNotNullAssignment_2()); 
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
    // $ANTLR end "rule__ColumnDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalMyDsl.g:2377:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalMyDsl.g:2382:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__PrimaryKey__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__1();

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
    // $ANTLR end "rule__PrimaryKey__Group__0"


    // $ANTLR start "rule__PrimaryKey__Group__0__Impl"
    // InternalMyDsl.g:2389:1: rule__PrimaryKey__Group__0__Impl : ( 'PRIMARY' ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( ( 'PRIMARY' ) )
            // InternalMyDsl.g:2394:1: ( 'PRIMARY' )
            {
            // InternalMyDsl.g:2394:1: ( 'PRIMARY' )
            // InternalMyDsl.g:2395:2: 'PRIMARY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 
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
    // $ANTLR end "rule__PrimaryKey__Group__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__1"
    // InternalMyDsl.g:2404:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalMyDsl.g:2409:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__PrimaryKey__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__2();

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
    // $ANTLR end "rule__PrimaryKey__Group__1"


    // $ANTLR start "rule__PrimaryKey__Group__1__Impl"
    // InternalMyDsl.g:2416:1: rule__PrimaryKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( ( 'KEY' ) )
            // InternalMyDsl.g:2421:1: ( 'KEY' )
            {
            // InternalMyDsl.g:2421:1: ( 'KEY' )
            // InternalMyDsl.g:2422:2: 'KEY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 
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
    // $ANTLR end "rule__PrimaryKey__Group__1__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__2"
    // InternalMyDsl.g:2431:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalMyDsl.g:2436:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryKey__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__3();

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
    // $ANTLR end "rule__PrimaryKey__Group__2"


    // $ANTLR start "rule__PrimaryKey__Group__2__Impl"
    // InternalMyDsl.g:2443:1: rule__PrimaryKey__Group__2__Impl : ( '(' ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( ( '(' ) )
            // InternalMyDsl.g:2448:1: ( '(' )
            {
            // InternalMyDsl.g:2448:1: ( '(' )
            // InternalMyDsl.g:2449:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__PrimaryKey__Group__2__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__3"
    // InternalMyDsl.g:2458:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalMyDsl.g:2463:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__PrimaryKey__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__4();

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
    // $ANTLR end "rule__PrimaryKey__Group__3"


    // $ANTLR start "rule__PrimaryKey__Group__3__Impl"
    // InternalMyDsl.g:2470:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) )
            // InternalMyDsl.g:2475:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            {
            // InternalMyDsl.g:2475:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            // InternalMyDsl.g:2476:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_3()); 
            }
            // InternalMyDsl.g:2477:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            // InternalMyDsl.g:2477:3: rule__PrimaryKey__ColumnAsPKAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColumnAsPKAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_3()); 
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
    // $ANTLR end "rule__PrimaryKey__Group__3__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__4"
    // InternalMyDsl.g:2485:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalMyDsl.g:2490:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__PrimaryKey__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__5();

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
    // $ANTLR end "rule__PrimaryKey__Group__4"


    // $ANTLR start "rule__PrimaryKey__Group__4__Impl"
    // InternalMyDsl.g:2497:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalMyDsl.g:2502:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalMyDsl.g:2502:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalMyDsl.g:2503:2: ( rule__PrimaryKey__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            }
            // InternalMyDsl.g:2504:2: ( rule__PrimaryKey__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2504:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PrimaryKey__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
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
    // $ANTLR end "rule__PrimaryKey__Group__4__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__5"
    // InternalMyDsl.g:2512:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalMyDsl.g:2517:2: rule__PrimaryKey__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__5__Impl();

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
    // $ANTLR end "rule__PrimaryKey__Group__5"


    // $ANTLR start "rule__PrimaryKey__Group__5__Impl"
    // InternalMyDsl.g:2523:1: rule__PrimaryKey__Group__5__Impl : ( ')' ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( ')' ) )
            // InternalMyDsl.g:2528:1: ( ')' )
            {
            // InternalMyDsl.g:2528:1: ( ')' )
            // InternalMyDsl.g:2529:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__PrimaryKey__Group__5__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__0"
    // InternalMyDsl.g:2539:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalMyDsl.g:2544:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryKey__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__1();

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
    // $ANTLR end "rule__PrimaryKey__Group_4__0"


    // $ANTLR start "rule__PrimaryKey__Group_4__0__Impl"
    // InternalMyDsl.g:2551:1: rule__PrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( ( ',' ) )
            // InternalMyDsl.g:2556:1: ( ',' )
            {
            // InternalMyDsl.g:2556:1: ( ',' )
            // InternalMyDsl.g:2557:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__PrimaryKey__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__1"
    // InternalMyDsl.g:2566:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalMyDsl.g:2571:2: rule__PrimaryKey__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__1__Impl();

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
    // $ANTLR end "rule__PrimaryKey__Group_4__1"


    // $ANTLR start "rule__PrimaryKey__Group_4__1__Impl"
    // InternalMyDsl.g:2577:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) )
            // InternalMyDsl.g:2582:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2582:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            // InternalMyDsl.g:2583:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_4_1()); 
            }
            // InternalMyDsl.g:2584:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            // InternalMyDsl.g:2584:3: rule__PrimaryKey__ColumnAsPKAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColumnAsPKAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_4_1()); 
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
    // $ANTLR end "rule__PrimaryKey__Group_4__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__0"
    // InternalMyDsl.g:2593:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalMyDsl.g:2598:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ForeignKey__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__1();

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
    // $ANTLR end "rule__ForeignKey__Group__0"


    // $ANTLR start "rule__ForeignKey__Group__0__Impl"
    // InternalMyDsl.g:2605:1: rule__ForeignKey__Group__0__Impl : ( 'FOREIGN' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( ( 'FOREIGN' ) )
            // InternalMyDsl.g:2610:1: ( 'FOREIGN' )
            {
            // InternalMyDsl.g:2610:1: ( 'FOREIGN' )
            // InternalMyDsl.g:2611:2: 'FOREIGN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 
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
    // $ANTLR end "rule__ForeignKey__Group__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group__1"
    // InternalMyDsl.g:2620:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalMyDsl.g:2625:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ForeignKey__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__2();

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
    // $ANTLR end "rule__ForeignKey__Group__1"


    // $ANTLR start "rule__ForeignKey__Group__1__Impl"
    // InternalMyDsl.g:2632:1: rule__ForeignKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( 'KEY' ) )
            // InternalMyDsl.g:2637:1: ( 'KEY' )
            {
            // InternalMyDsl.g:2637:1: ( 'KEY' )
            // InternalMyDsl.g:2638:2: 'KEY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 
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
    // $ANTLR end "rule__ForeignKey__Group__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__2"
    // InternalMyDsl.g:2647:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalMyDsl.g:2652:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ForeignKey__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__3();

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
    // $ANTLR end "rule__ForeignKey__Group__2"


    // $ANTLR start "rule__ForeignKey__Group__2__Impl"
    // InternalMyDsl.g:2659:1: rule__ForeignKey__Group__2__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2663:1: ( ( '(' ) )
            // InternalMyDsl.g:2664:1: ( '(' )
            {
            // InternalMyDsl.g:2664:1: ( '(' )
            // InternalMyDsl.g:2665:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ForeignKey__Group__2__Impl"


    // $ANTLR start "rule__ForeignKey__Group__3"
    // InternalMyDsl.g:2674:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2678:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalMyDsl.g:2679:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ForeignKey__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__4();

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
    // $ANTLR end "rule__ForeignKey__Group__3"


    // $ANTLR start "rule__ForeignKey__Group__3__Impl"
    // InternalMyDsl.g:2686:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) )
            // InternalMyDsl.g:2691:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            {
            // InternalMyDsl.g:2691:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            // InternalMyDsl.g:2692:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_3()); 
            }
            // InternalMyDsl.g:2693:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            // InternalMyDsl.g:2693:3: rule__ForeignKey__ColumnAsFKAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnAsFKAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_3()); 
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
    // $ANTLR end "rule__ForeignKey__Group__3__Impl"


    // $ANTLR start "rule__ForeignKey__Group__4"
    // InternalMyDsl.g:2701:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalMyDsl.g:2706:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ForeignKey__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__5();

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
    // $ANTLR end "rule__ForeignKey__Group__4"


    // $ANTLR start "rule__ForeignKey__Group__4__Impl"
    // InternalMyDsl.g:2713:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2717:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalMyDsl.g:2718:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalMyDsl.g:2718:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalMyDsl.g:2719:2: ( rule__ForeignKey__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            }
            // InternalMyDsl.g:2720:2: ( rule__ForeignKey__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:2720:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForeignKey__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getGroup_4()); 
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
    // $ANTLR end "rule__ForeignKey__Group__4__Impl"


    // $ANTLR start "rule__ForeignKey__Group__5"
    // InternalMyDsl.g:2728:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2732:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalMyDsl.g:2733:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__ForeignKey__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__6();

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
    // $ANTLR end "rule__ForeignKey__Group__5"


    // $ANTLR start "rule__ForeignKey__Group__5__Impl"
    // InternalMyDsl.g:2740:1: rule__ForeignKey__Group__5__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( ( ')' ) )
            // InternalMyDsl.g:2745:1: ( ')' )
            {
            // InternalMyDsl.g:2745:1: ( ')' )
            // InternalMyDsl.g:2746:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__ForeignKey__Group__5__Impl"


    // $ANTLR start "rule__ForeignKey__Group__6"
    // InternalMyDsl.g:2755:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2759:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalMyDsl.g:2760:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ForeignKey__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__7();

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
    // $ANTLR end "rule__ForeignKey__Group__6"


    // $ANTLR start "rule__ForeignKey__Group__6__Impl"
    // InternalMyDsl.g:2767:1: rule__ForeignKey__Group__6__Impl : ( 'REFERENCES' ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( ( 'REFERENCES' ) )
            // InternalMyDsl.g:2772:1: ( 'REFERENCES' )
            {
            // InternalMyDsl.g:2772:1: ( 'REFERENCES' )
            // InternalMyDsl.g:2773:2: 'REFERENCES'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); 
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
    // $ANTLR end "rule__ForeignKey__Group__6__Impl"


    // $ANTLR start "rule__ForeignKey__Group__7"
    // InternalMyDsl.g:2782:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2786:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalMyDsl.g:2787:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__ForeignKey__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__8();

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
    // $ANTLR end "rule__ForeignKey__Group__7"


    // $ANTLR start "rule__ForeignKey__Group__7__Impl"
    // InternalMyDsl.g:2794:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) )
            // InternalMyDsl.g:2799:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            {
            // InternalMyDsl.g:2799:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            // InternalMyDsl.g:2800:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 
            }
            // InternalMyDsl.g:2801:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            // InternalMyDsl.g:2801:3: rule__ForeignKey__ForeignTableAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignTableAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 
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
    // $ANTLR end "rule__ForeignKey__Group__7__Impl"


    // $ANTLR start "rule__ForeignKey__Group__8"
    // InternalMyDsl.g:2809:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalMyDsl.g:2814:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__ForeignKey__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__9();

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
    // $ANTLR end "rule__ForeignKey__Group__8"


    // $ANTLR start "rule__ForeignKey__Group__8__Impl"
    // InternalMyDsl.g:2821:1: rule__ForeignKey__Group__8__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( ( '(' ) )
            // InternalMyDsl.g:2826:1: ( '(' )
            {
            // InternalMyDsl.g:2826:1: ( '(' )
            // InternalMyDsl.g:2827:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); 
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
    // $ANTLR end "rule__ForeignKey__Group__8__Impl"


    // $ANTLR start "rule__ForeignKey__Group__9"
    // InternalMyDsl.g:2836:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2840:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalMyDsl.g:2841:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__ForeignKey__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__10();

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
    // $ANTLR end "rule__ForeignKey__Group__9"


    // $ANTLR start "rule__ForeignKey__Group__9__Impl"
    // InternalMyDsl.g:2848:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) )
            // InternalMyDsl.g:2853:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            {
            // InternalMyDsl.g:2853:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            // InternalMyDsl.g:2854:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 
            }
            // InternalMyDsl.g:2855:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            // InternalMyDsl.g:2855:3: rule__ForeignKey__ForeignColumnsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignColumnsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 
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
    // $ANTLR end "rule__ForeignKey__Group__9__Impl"


    // $ANTLR start "rule__ForeignKey__Group__10"
    // InternalMyDsl.g:2863:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalMyDsl.g:2868:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__ForeignKey__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__11();

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
    // $ANTLR end "rule__ForeignKey__Group__10"


    // $ANTLR start "rule__ForeignKey__Group__10__Impl"
    // InternalMyDsl.g:2875:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2879:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalMyDsl.g:2880:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalMyDsl.g:2880:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalMyDsl.g:2881:2: ( rule__ForeignKey__Group_10__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            }
            // InternalMyDsl.g:2882:2: ( rule__ForeignKey__Group_10__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2882:3: rule__ForeignKey__Group_10__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForeignKey__Group_10__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getGroup_10()); 
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
    // $ANTLR end "rule__ForeignKey__Group__10__Impl"


    // $ANTLR start "rule__ForeignKey__Group__11"
    // InternalMyDsl.g:2890:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2894:1: ( rule__ForeignKey__Group__11__Impl )
            // InternalMyDsl.g:2895:2: rule__ForeignKey__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__11__Impl();

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
    // $ANTLR end "rule__ForeignKey__Group__11"


    // $ANTLR start "rule__ForeignKey__Group__11__Impl"
    // InternalMyDsl.g:2901:1: rule__ForeignKey__Group__11__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( ( ')' ) )
            // InternalMyDsl.g:2906:1: ( ')' )
            {
            // InternalMyDsl.g:2906:1: ( ')' )
            // InternalMyDsl.g:2907:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); 
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
    // $ANTLR end "rule__ForeignKey__Group__11__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__0"
    // InternalMyDsl.g:2917:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2921:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalMyDsl.g:2922:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ForeignKey__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_4__1();

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
    // $ANTLR end "rule__ForeignKey__Group_4__0"


    // $ANTLR start "rule__ForeignKey__Group_4__0__Impl"
    // InternalMyDsl.g:2929:1: rule__ForeignKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( ( ',' ) )
            // InternalMyDsl.g:2934:1: ( ',' )
            {
            // InternalMyDsl.g:2934:1: ( ',' )
            // InternalMyDsl.g:2935:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__ForeignKey__Group_4__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__1"
    // InternalMyDsl.g:2944:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2948:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalMyDsl.g:2949:2: rule__ForeignKey__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_4__1__Impl();

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
    // $ANTLR end "rule__ForeignKey__Group_4__1"


    // $ANTLR start "rule__ForeignKey__Group_4__1__Impl"
    // InternalMyDsl.g:2955:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2959:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) )
            // InternalMyDsl.g:2960:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2960:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            // InternalMyDsl.g:2961:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_4_1()); 
            }
            // InternalMyDsl.g:2962:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            // InternalMyDsl.g:2962:3: rule__ForeignKey__ColumnAsFKAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnAsFKAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_4_1()); 
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
    // $ANTLR end "rule__ForeignKey__Group_4__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group_10__0"
    // InternalMyDsl.g:2971:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2975:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalMyDsl.g:2976:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
            {
            pushFollow(FOLLOW_12);
            rule__ForeignKey__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_10__1();

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
    // $ANTLR end "rule__ForeignKey__Group_10__0"


    // $ANTLR start "rule__ForeignKey__Group_10__0__Impl"
    // InternalMyDsl.g:2983:1: rule__ForeignKey__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2987:1: ( ( ',' ) )
            // InternalMyDsl.g:2988:1: ( ',' )
            {
            // InternalMyDsl.g:2988:1: ( ',' )
            // InternalMyDsl.g:2989:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); 
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
    // $ANTLR end "rule__ForeignKey__Group_10__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group_10__1"
    // InternalMyDsl.g:2998:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3002:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalMyDsl.g:3003:2: rule__ForeignKey__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_10__1__Impl();

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
    // $ANTLR end "rule__ForeignKey__Group_10__1"


    // $ANTLR start "rule__ForeignKey__Group_10__1__Impl"
    // InternalMyDsl.g:3009:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) )
            // InternalMyDsl.g:3014:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            {
            // InternalMyDsl.g:3014:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            // InternalMyDsl.g:3015:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 
            }
            // InternalMyDsl.g:3016:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            // InternalMyDsl.g:3016:3: rule__ForeignKey__ForeignColumnsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignColumnsAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 
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
    // $ANTLR end "rule__ForeignKey__Group_10__1__Impl"


    // $ANTLR start "rule__DROPTABLE__Group__0"
    // InternalMyDsl.g:3025:1: rule__DROPTABLE__Group__0 : rule__DROPTABLE__Group__0__Impl rule__DROPTABLE__Group__1 ;
    public final void rule__DROPTABLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3029:1: ( rule__DROPTABLE__Group__0__Impl rule__DROPTABLE__Group__1 )
            // InternalMyDsl.g:3030:2: rule__DROPTABLE__Group__0__Impl rule__DROPTABLE__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__DROPTABLE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__Group__1();

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
    // $ANTLR end "rule__DROPTABLE__Group__0"


    // $ANTLR start "rule__DROPTABLE__Group__0__Impl"
    // InternalMyDsl.g:3037:1: rule__DROPTABLE__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DROPTABLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( ( 'DROP' ) )
            // InternalMyDsl.g:3042:1: ( 'DROP' )
            {
            // InternalMyDsl.g:3042:1: ( 'DROP' )
            // InternalMyDsl.g:3043:2: 'DROP'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getDROPKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getDROPKeyword_0()); 
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
    // $ANTLR end "rule__DROPTABLE__Group__0__Impl"


    // $ANTLR start "rule__DROPTABLE__Group__1"
    // InternalMyDsl.g:3052:1: rule__DROPTABLE__Group__1 : rule__DROPTABLE__Group__1__Impl rule__DROPTABLE__Group__2 ;
    public final void rule__DROPTABLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3056:1: ( rule__DROPTABLE__Group__1__Impl rule__DROPTABLE__Group__2 )
            // InternalMyDsl.g:3057:2: rule__DROPTABLE__Group__1__Impl rule__DROPTABLE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DROPTABLE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__Group__2();

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
    // $ANTLR end "rule__DROPTABLE__Group__1"


    // $ANTLR start "rule__DROPTABLE__Group__1__Impl"
    // InternalMyDsl.g:3064:1: rule__DROPTABLE__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__DROPTABLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( ( 'TABLE' ) )
            // InternalMyDsl.g:3069:1: ( 'TABLE' )
            {
            // InternalMyDsl.g:3069:1: ( 'TABLE' )
            // InternalMyDsl.g:3070:2: 'TABLE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getTABLEKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getTABLEKeyword_1()); 
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
    // $ANTLR end "rule__DROPTABLE__Group__1__Impl"


    // $ANTLR start "rule__DROPTABLE__Group__2"
    // InternalMyDsl.g:3079:1: rule__DROPTABLE__Group__2 : rule__DROPTABLE__Group__2__Impl rule__DROPTABLE__Group__3 ;
    public final void rule__DROPTABLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3083:1: ( rule__DROPTABLE__Group__2__Impl rule__DROPTABLE__Group__3 )
            // InternalMyDsl.g:3084:2: rule__DROPTABLE__Group__2__Impl rule__DROPTABLE__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DROPTABLE__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__Group__3();

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
    // $ANTLR end "rule__DROPTABLE__Group__2"


    // $ANTLR start "rule__DROPTABLE__Group__2__Impl"
    // InternalMyDsl.g:3091:1: rule__DROPTABLE__Group__2__Impl : ( ( rule__DROPTABLE__TableAssignment_2 ) ) ;
    public final void rule__DROPTABLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3095:1: ( ( ( rule__DROPTABLE__TableAssignment_2 ) ) )
            // InternalMyDsl.g:3096:1: ( ( rule__DROPTABLE__TableAssignment_2 ) )
            {
            // InternalMyDsl.g:3096:1: ( ( rule__DROPTABLE__TableAssignment_2 ) )
            // InternalMyDsl.g:3097:2: ( rule__DROPTABLE__TableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getTableAssignment_2()); 
            }
            // InternalMyDsl.g:3098:2: ( rule__DROPTABLE__TableAssignment_2 )
            // InternalMyDsl.g:3098:3: rule__DROPTABLE__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__TableAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getTableAssignment_2()); 
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
    // $ANTLR end "rule__DROPTABLE__Group__2__Impl"


    // $ANTLR start "rule__DROPTABLE__Group__3"
    // InternalMyDsl.g:3106:1: rule__DROPTABLE__Group__3 : rule__DROPTABLE__Group__3__Impl ;
    public final void rule__DROPTABLE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3110:1: ( rule__DROPTABLE__Group__3__Impl )
            // InternalMyDsl.g:3111:2: rule__DROPTABLE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__Group__3__Impl();

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
    // $ANTLR end "rule__DROPTABLE__Group__3"


    // $ANTLR start "rule__DROPTABLE__Group__3__Impl"
    // InternalMyDsl.g:3117:1: rule__DROPTABLE__Group__3__Impl : ( ( rule__DROPTABLE__Group_3__0 )* ) ;
    public final void rule__DROPTABLE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( ( ( rule__DROPTABLE__Group_3__0 )* ) )
            // InternalMyDsl.g:3122:1: ( ( rule__DROPTABLE__Group_3__0 )* )
            {
            // InternalMyDsl.g:3122:1: ( ( rule__DROPTABLE__Group_3__0 )* )
            // InternalMyDsl.g:3123:2: ( rule__DROPTABLE__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3124:2: ( rule__DROPTABLE__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:3124:3: rule__DROPTABLE__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DROPTABLE__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getGroup_3()); 
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
    // $ANTLR end "rule__DROPTABLE__Group__3__Impl"


    // $ANTLR start "rule__DROPTABLE__Group_3__0"
    // InternalMyDsl.g:3133:1: rule__DROPTABLE__Group_3__0 : rule__DROPTABLE__Group_3__0__Impl rule__DROPTABLE__Group_3__1 ;
    public final void rule__DROPTABLE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3137:1: ( rule__DROPTABLE__Group_3__0__Impl rule__DROPTABLE__Group_3__1 )
            // InternalMyDsl.g:3138:2: rule__DROPTABLE__Group_3__0__Impl rule__DROPTABLE__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__DROPTABLE__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__Group_3__1();

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
    // $ANTLR end "rule__DROPTABLE__Group_3__0"


    // $ANTLR start "rule__DROPTABLE__Group_3__0__Impl"
    // InternalMyDsl.g:3145:1: rule__DROPTABLE__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DROPTABLE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3149:1: ( ( ',' ) )
            // InternalMyDsl.g:3150:1: ( ',' )
            {
            // InternalMyDsl.g:3150:1: ( ',' )
            // InternalMyDsl.g:3151:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getCommaKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getCommaKeyword_3_0()); 
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
    // $ANTLR end "rule__DROPTABLE__Group_3__0__Impl"


    // $ANTLR start "rule__DROPTABLE__Group_3__1"
    // InternalMyDsl.g:3160:1: rule__DROPTABLE__Group_3__1 : rule__DROPTABLE__Group_3__1__Impl ;
    public final void rule__DROPTABLE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3164:1: ( rule__DROPTABLE__Group_3__1__Impl )
            // InternalMyDsl.g:3165:2: rule__DROPTABLE__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__Group_3__1__Impl();

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
    // $ANTLR end "rule__DROPTABLE__Group_3__1"


    // $ANTLR start "rule__DROPTABLE__Group_3__1__Impl"
    // InternalMyDsl.g:3171:1: rule__DROPTABLE__Group_3__1__Impl : ( ( rule__DROPTABLE__TableAssignment_3_1 ) ) ;
    public final void rule__DROPTABLE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3175:1: ( ( ( rule__DROPTABLE__TableAssignment_3_1 ) ) )
            // InternalMyDsl.g:3176:1: ( ( rule__DROPTABLE__TableAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3176:1: ( ( rule__DROPTABLE__TableAssignment_3_1 ) )
            // InternalMyDsl.g:3177:2: ( rule__DROPTABLE__TableAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getTableAssignment_3_1()); 
            }
            // InternalMyDsl.g:3178:2: ( rule__DROPTABLE__TableAssignment_3_1 )
            // InternalMyDsl.g:3178:3: rule__DROPTABLE__TableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DROPTABLE__TableAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getTableAssignment_3_1()); 
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
    // $ANTLR end "rule__DROPTABLE__Group_3__1__Impl"


    // $ANTLR start "rule__TRUNCATE__Group__0"
    // InternalMyDsl.g:3187:1: rule__TRUNCATE__Group__0 : rule__TRUNCATE__Group__0__Impl rule__TRUNCATE__Group__1 ;
    public final void rule__TRUNCATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( rule__TRUNCATE__Group__0__Impl rule__TRUNCATE__Group__1 )
            // InternalMyDsl.g:3192:2: rule__TRUNCATE__Group__0__Impl rule__TRUNCATE__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TRUNCATE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__Group__1();

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
    // $ANTLR end "rule__TRUNCATE__Group__0"


    // $ANTLR start "rule__TRUNCATE__Group__0__Impl"
    // InternalMyDsl.g:3199:1: rule__TRUNCATE__Group__0__Impl : ( 'TRUNCATE' ) ;
    public final void rule__TRUNCATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3203:1: ( ( 'TRUNCATE' ) )
            // InternalMyDsl.g:3204:1: ( 'TRUNCATE' )
            {
            // InternalMyDsl.g:3204:1: ( 'TRUNCATE' )
            // InternalMyDsl.g:3205:2: 'TRUNCATE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getTRUNCATEKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getTRUNCATEKeyword_0()); 
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
    // $ANTLR end "rule__TRUNCATE__Group__0__Impl"


    // $ANTLR start "rule__TRUNCATE__Group__1"
    // InternalMyDsl.g:3214:1: rule__TRUNCATE__Group__1 : rule__TRUNCATE__Group__1__Impl rule__TRUNCATE__Group__2 ;
    public final void rule__TRUNCATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3218:1: ( rule__TRUNCATE__Group__1__Impl rule__TRUNCATE__Group__2 )
            // InternalMyDsl.g:3219:2: rule__TRUNCATE__Group__1__Impl rule__TRUNCATE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TRUNCATE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__Group__2();

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
    // $ANTLR end "rule__TRUNCATE__Group__1"


    // $ANTLR start "rule__TRUNCATE__Group__1__Impl"
    // InternalMyDsl.g:3226:1: rule__TRUNCATE__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TRUNCATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3230:1: ( ( 'TABLE' ) )
            // InternalMyDsl.g:3231:1: ( 'TABLE' )
            {
            // InternalMyDsl.g:3231:1: ( 'TABLE' )
            // InternalMyDsl.g:3232:2: 'TABLE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getTABLEKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getTABLEKeyword_1()); 
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
    // $ANTLR end "rule__TRUNCATE__Group__1__Impl"


    // $ANTLR start "rule__TRUNCATE__Group__2"
    // InternalMyDsl.g:3241:1: rule__TRUNCATE__Group__2 : rule__TRUNCATE__Group__2__Impl rule__TRUNCATE__Group__3 ;
    public final void rule__TRUNCATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3245:1: ( rule__TRUNCATE__Group__2__Impl rule__TRUNCATE__Group__3 )
            // InternalMyDsl.g:3246:2: rule__TRUNCATE__Group__2__Impl rule__TRUNCATE__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__TRUNCATE__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__Group__3();

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
    // $ANTLR end "rule__TRUNCATE__Group__2"


    // $ANTLR start "rule__TRUNCATE__Group__2__Impl"
    // InternalMyDsl.g:3253:1: rule__TRUNCATE__Group__2__Impl : ( ( rule__TRUNCATE__TableAssignment_2 ) ) ;
    public final void rule__TRUNCATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3257:1: ( ( ( rule__TRUNCATE__TableAssignment_2 ) ) )
            // InternalMyDsl.g:3258:1: ( ( rule__TRUNCATE__TableAssignment_2 ) )
            {
            // InternalMyDsl.g:3258:1: ( ( rule__TRUNCATE__TableAssignment_2 ) )
            // InternalMyDsl.g:3259:2: ( rule__TRUNCATE__TableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getTableAssignment_2()); 
            }
            // InternalMyDsl.g:3260:2: ( rule__TRUNCATE__TableAssignment_2 )
            // InternalMyDsl.g:3260:3: rule__TRUNCATE__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__TableAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getTableAssignment_2()); 
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
    // $ANTLR end "rule__TRUNCATE__Group__2__Impl"


    // $ANTLR start "rule__TRUNCATE__Group__3"
    // InternalMyDsl.g:3268:1: rule__TRUNCATE__Group__3 : rule__TRUNCATE__Group__3__Impl ;
    public final void rule__TRUNCATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3272:1: ( rule__TRUNCATE__Group__3__Impl )
            // InternalMyDsl.g:3273:2: rule__TRUNCATE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__Group__3__Impl();

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
    // $ANTLR end "rule__TRUNCATE__Group__3"


    // $ANTLR start "rule__TRUNCATE__Group__3__Impl"
    // InternalMyDsl.g:3279:1: rule__TRUNCATE__Group__3__Impl : ( ( rule__TRUNCATE__Group_3__0 )* ) ;
    public final void rule__TRUNCATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3283:1: ( ( ( rule__TRUNCATE__Group_3__0 )* ) )
            // InternalMyDsl.g:3284:1: ( ( rule__TRUNCATE__Group_3__0 )* )
            {
            // InternalMyDsl.g:3284:1: ( ( rule__TRUNCATE__Group_3__0 )* )
            // InternalMyDsl.g:3285:2: ( rule__TRUNCATE__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3286:2: ( rule__TRUNCATE__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:3286:3: rule__TRUNCATE__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TRUNCATE__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getGroup_3()); 
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
    // $ANTLR end "rule__TRUNCATE__Group__3__Impl"


    // $ANTLR start "rule__TRUNCATE__Group_3__0"
    // InternalMyDsl.g:3295:1: rule__TRUNCATE__Group_3__0 : rule__TRUNCATE__Group_3__0__Impl rule__TRUNCATE__Group_3__1 ;
    public final void rule__TRUNCATE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3299:1: ( rule__TRUNCATE__Group_3__0__Impl rule__TRUNCATE__Group_3__1 )
            // InternalMyDsl.g:3300:2: rule__TRUNCATE__Group_3__0__Impl rule__TRUNCATE__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__TRUNCATE__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__Group_3__1();

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
    // $ANTLR end "rule__TRUNCATE__Group_3__0"


    // $ANTLR start "rule__TRUNCATE__Group_3__0__Impl"
    // InternalMyDsl.g:3307:1: rule__TRUNCATE__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TRUNCATE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( ( ',' ) )
            // InternalMyDsl.g:3312:1: ( ',' )
            {
            // InternalMyDsl.g:3312:1: ( ',' )
            // InternalMyDsl.g:3313:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getCommaKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getCommaKeyword_3_0()); 
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
    // $ANTLR end "rule__TRUNCATE__Group_3__0__Impl"


    // $ANTLR start "rule__TRUNCATE__Group_3__1"
    // InternalMyDsl.g:3322:1: rule__TRUNCATE__Group_3__1 : rule__TRUNCATE__Group_3__1__Impl ;
    public final void rule__TRUNCATE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3326:1: ( rule__TRUNCATE__Group_3__1__Impl )
            // InternalMyDsl.g:3327:2: rule__TRUNCATE__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__Group_3__1__Impl();

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
    // $ANTLR end "rule__TRUNCATE__Group_3__1"


    // $ANTLR start "rule__TRUNCATE__Group_3__1__Impl"
    // InternalMyDsl.g:3333:1: rule__TRUNCATE__Group_3__1__Impl : ( ( rule__TRUNCATE__TableAssignment_3_1 ) ) ;
    public final void rule__TRUNCATE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3337:1: ( ( ( rule__TRUNCATE__TableAssignment_3_1 ) ) )
            // InternalMyDsl.g:3338:1: ( ( rule__TRUNCATE__TableAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3338:1: ( ( rule__TRUNCATE__TableAssignment_3_1 ) )
            // InternalMyDsl.g:3339:2: ( rule__TRUNCATE__TableAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getTableAssignment_3_1()); 
            }
            // InternalMyDsl.g:3340:2: ( rule__TRUNCATE__TableAssignment_3_1 )
            // InternalMyDsl.g:3340:3: rule__TRUNCATE__TableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TRUNCATE__TableAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getTableAssignment_3_1()); 
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
    // $ANTLR end "rule__TRUNCATE__Group_3__1__Impl"


    // $ANTLR start "rule__DELETE__Group__0"
    // InternalMyDsl.g:3349:1: rule__DELETE__Group__0 : rule__DELETE__Group__0__Impl rule__DELETE__Group__1 ;
    public final void rule__DELETE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3353:1: ( rule__DELETE__Group__0__Impl rule__DELETE__Group__1 )
            // InternalMyDsl.g:3354:2: rule__DELETE__Group__0__Impl rule__DELETE__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DELETE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DELETE__Group__1();

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
    // $ANTLR end "rule__DELETE__Group__0"


    // $ANTLR start "rule__DELETE__Group__0__Impl"
    // InternalMyDsl.g:3361:1: rule__DELETE__Group__0__Impl : ( 'DELETE' ) ;
    public final void rule__DELETE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3365:1: ( ( 'DELETE' ) )
            // InternalMyDsl.g:3366:1: ( 'DELETE' )
            {
            // InternalMyDsl.g:3366:1: ( 'DELETE' )
            // InternalMyDsl.g:3367:2: 'DELETE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDELETEAccess().getDELETEKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDELETEAccess().getDELETEKeyword_0()); 
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
    // $ANTLR end "rule__DELETE__Group__0__Impl"


    // $ANTLR start "rule__DELETE__Group__1"
    // InternalMyDsl.g:3376:1: rule__DELETE__Group__1 : rule__DELETE__Group__1__Impl ;
    public final void rule__DELETE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3380:1: ( rule__DELETE__Group__1__Impl )
            // InternalMyDsl.g:3381:2: rule__DELETE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DELETE__Group__1__Impl();

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
    // $ANTLR end "rule__DELETE__Group__1"


    // $ANTLR start "rule__DELETE__Group__1__Impl"
    // InternalMyDsl.g:3387:1: rule__DELETE__Group__1__Impl : ( ( rule__DELETE__XAssignment_1 ) ) ;
    public final void rule__DELETE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3391:1: ( ( ( rule__DELETE__XAssignment_1 ) ) )
            // InternalMyDsl.g:3392:1: ( ( rule__DELETE__XAssignment_1 ) )
            {
            // InternalMyDsl.g:3392:1: ( ( rule__DELETE__XAssignment_1 ) )
            // InternalMyDsl.g:3393:2: ( rule__DELETE__XAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDELETEAccess().getXAssignment_1()); 
            }
            // InternalMyDsl.g:3394:2: ( rule__DELETE__XAssignment_1 )
            // InternalMyDsl.g:3394:3: rule__DELETE__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DELETE__XAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDELETEAccess().getXAssignment_1()); 
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
    // $ANTLR end "rule__DELETE__Group__1__Impl"


    // $ANTLR start "rule__UPDATE__Group__0"
    // InternalMyDsl.g:3403:1: rule__UPDATE__Group__0 : rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1 ;
    public final void rule__UPDATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3407:1: ( rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1 )
            // InternalMyDsl.g:3408:2: rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__UPDATE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__1();

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
    // $ANTLR end "rule__UPDATE__Group__0"


    // $ANTLR start "rule__UPDATE__Group__0__Impl"
    // InternalMyDsl.g:3415:1: rule__UPDATE__Group__0__Impl : ( 'UPDATE' ) ;
    public final void rule__UPDATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3419:1: ( ( 'UPDATE' ) )
            // InternalMyDsl.g:3420:1: ( 'UPDATE' )
            {
            // InternalMyDsl.g:3420:1: ( 'UPDATE' )
            // InternalMyDsl.g:3421:2: 'UPDATE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getUPDATEKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getUPDATEKeyword_0()); 
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
    // $ANTLR end "rule__UPDATE__Group__0__Impl"


    // $ANTLR start "rule__UPDATE__Group__1"
    // InternalMyDsl.g:3430:1: rule__UPDATE__Group__1 : rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2 ;
    public final void rule__UPDATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3434:1: ( rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2 )
            // InternalMyDsl.g:3435:2: rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__UPDATE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__2();

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
    // $ANTLR end "rule__UPDATE__Group__1"


    // $ANTLR start "rule__UPDATE__Group__1__Impl"
    // InternalMyDsl.g:3442:1: rule__UPDATE__Group__1__Impl : ( ( rule__UPDATE__TableAssignment_1 ) ) ;
    public final void rule__UPDATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3446:1: ( ( ( rule__UPDATE__TableAssignment_1 ) ) )
            // InternalMyDsl.g:3447:1: ( ( rule__UPDATE__TableAssignment_1 ) )
            {
            // InternalMyDsl.g:3447:1: ( ( rule__UPDATE__TableAssignment_1 ) )
            // InternalMyDsl.g:3448:2: ( rule__UPDATE__TableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getTableAssignment_1()); 
            }
            // InternalMyDsl.g:3449:2: ( rule__UPDATE__TableAssignment_1 )
            // InternalMyDsl.g:3449:3: rule__UPDATE__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__TableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getTableAssignment_1()); 
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
    // $ANTLR end "rule__UPDATE__Group__1__Impl"


    // $ANTLR start "rule__UPDATE__Group__2"
    // InternalMyDsl.g:3457:1: rule__UPDATE__Group__2 : rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3 ;
    public final void rule__UPDATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3461:1: ( rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3 )
            // InternalMyDsl.g:3462:2: rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__UPDATE__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__3();

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
    // $ANTLR end "rule__UPDATE__Group__2"


    // $ANTLR start "rule__UPDATE__Group__2__Impl"
    // InternalMyDsl.g:3469:1: rule__UPDATE__Group__2__Impl : ( 'SET' ) ;
    public final void rule__UPDATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3473:1: ( ( 'SET' ) )
            // InternalMyDsl.g:3474:1: ( 'SET' )
            {
            // InternalMyDsl.g:3474:1: ( 'SET' )
            // InternalMyDsl.g:3475:2: 'SET'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getSETKeyword_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getSETKeyword_2()); 
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
    // $ANTLR end "rule__UPDATE__Group__2__Impl"


    // $ANTLR start "rule__UPDATE__Group__3"
    // InternalMyDsl.g:3484:1: rule__UPDATE__Group__3 : rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4 ;
    public final void rule__UPDATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3488:1: ( rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4 )
            // InternalMyDsl.g:3489:2: rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__UPDATE__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__4();

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
    // $ANTLR end "rule__UPDATE__Group__3"


    // $ANTLR start "rule__UPDATE__Group__3__Impl"
    // InternalMyDsl.g:3496:1: rule__UPDATE__Group__3__Impl : ( ( rule__UPDATE__ScAssignment_3 ) ) ;
    public final void rule__UPDATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3500:1: ( ( ( rule__UPDATE__ScAssignment_3 ) ) )
            // InternalMyDsl.g:3501:1: ( ( rule__UPDATE__ScAssignment_3 ) )
            {
            // InternalMyDsl.g:3501:1: ( ( rule__UPDATE__ScAssignment_3 ) )
            // InternalMyDsl.g:3502:2: ( rule__UPDATE__ScAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getScAssignment_3()); 
            }
            // InternalMyDsl.g:3503:2: ( rule__UPDATE__ScAssignment_3 )
            // InternalMyDsl.g:3503:3: rule__UPDATE__ScAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__ScAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getScAssignment_3()); 
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
    // $ANTLR end "rule__UPDATE__Group__3__Impl"


    // $ANTLR start "rule__UPDATE__Group__4"
    // InternalMyDsl.g:3511:1: rule__UPDATE__Group__4 : rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5 ;
    public final void rule__UPDATE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3515:1: ( rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5 )
            // InternalMyDsl.g:3516:2: rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__UPDATE__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__5();

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
    // $ANTLR end "rule__UPDATE__Group__4"


    // $ANTLR start "rule__UPDATE__Group__4__Impl"
    // InternalMyDsl.g:3523:1: rule__UPDATE__Group__4__Impl : ( ( rule__UPDATE__Group_4__0 )* ) ;
    public final void rule__UPDATE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3527:1: ( ( ( rule__UPDATE__Group_4__0 )* ) )
            // InternalMyDsl.g:3528:1: ( ( rule__UPDATE__Group_4__0 )* )
            {
            // InternalMyDsl.g:3528:1: ( ( rule__UPDATE__Group_4__0 )* )
            // InternalMyDsl.g:3529:2: ( rule__UPDATE__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getGroup_4()); 
            }
            // InternalMyDsl.g:3530:2: ( rule__UPDATE__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:3530:3: rule__UPDATE__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UPDATE__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getGroup_4()); 
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
    // $ANTLR end "rule__UPDATE__Group__4__Impl"


    // $ANTLR start "rule__UPDATE__Group__5"
    // InternalMyDsl.g:3538:1: rule__UPDATE__Group__5 : rule__UPDATE__Group__5__Impl ;
    public final void rule__UPDATE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3542:1: ( rule__UPDATE__Group__5__Impl )
            // InternalMyDsl.g:3543:2: rule__UPDATE__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__5__Impl();

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
    // $ANTLR end "rule__UPDATE__Group__5"


    // $ANTLR start "rule__UPDATE__Group__5__Impl"
    // InternalMyDsl.g:3549:1: rule__UPDATE__Group__5__Impl : ( ( rule__UPDATE__Group_5__0 )? ) ;
    public final void rule__UPDATE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3553:1: ( ( ( rule__UPDATE__Group_5__0 )? ) )
            // InternalMyDsl.g:3554:1: ( ( rule__UPDATE__Group_5__0 )? )
            {
            // InternalMyDsl.g:3554:1: ( ( rule__UPDATE__Group_5__0 )? )
            // InternalMyDsl.g:3555:2: ( rule__UPDATE__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getGroup_5()); 
            }
            // InternalMyDsl.g:3556:2: ( rule__UPDATE__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3556:3: rule__UPDATE__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UPDATE__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getGroup_5()); 
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
    // $ANTLR end "rule__UPDATE__Group__5__Impl"


    // $ANTLR start "rule__UPDATE__Group_4__0"
    // InternalMyDsl.g:3565:1: rule__UPDATE__Group_4__0 : rule__UPDATE__Group_4__0__Impl rule__UPDATE__Group_4__1 ;
    public final void rule__UPDATE__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3569:1: ( rule__UPDATE__Group_4__0__Impl rule__UPDATE__Group_4__1 )
            // InternalMyDsl.g:3570:2: rule__UPDATE__Group_4__0__Impl rule__UPDATE__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__UPDATE__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group_4__1();

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
    // $ANTLR end "rule__UPDATE__Group_4__0"


    // $ANTLR start "rule__UPDATE__Group_4__0__Impl"
    // InternalMyDsl.g:3577:1: rule__UPDATE__Group_4__0__Impl : ( ',' ) ;
    public final void rule__UPDATE__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3581:1: ( ( ',' ) )
            // InternalMyDsl.g:3582:1: ( ',' )
            {
            // InternalMyDsl.g:3582:1: ( ',' )
            // InternalMyDsl.g:3583:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getCommaKeyword_4_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__UPDATE__Group_4__0__Impl"


    // $ANTLR start "rule__UPDATE__Group_4__1"
    // InternalMyDsl.g:3592:1: rule__UPDATE__Group_4__1 : rule__UPDATE__Group_4__1__Impl ;
    public final void rule__UPDATE__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3596:1: ( rule__UPDATE__Group_4__1__Impl )
            // InternalMyDsl.g:3597:2: rule__UPDATE__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group_4__1__Impl();

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
    // $ANTLR end "rule__UPDATE__Group_4__1"


    // $ANTLR start "rule__UPDATE__Group_4__1__Impl"
    // InternalMyDsl.g:3603:1: rule__UPDATE__Group_4__1__Impl : ( ( rule__UPDATE__ScAssignment_4_1 ) ) ;
    public final void rule__UPDATE__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3607:1: ( ( ( rule__UPDATE__ScAssignment_4_1 ) ) )
            // InternalMyDsl.g:3608:1: ( ( rule__UPDATE__ScAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3608:1: ( ( rule__UPDATE__ScAssignment_4_1 ) )
            // InternalMyDsl.g:3609:2: ( rule__UPDATE__ScAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getScAssignment_4_1()); 
            }
            // InternalMyDsl.g:3610:2: ( rule__UPDATE__ScAssignment_4_1 )
            // InternalMyDsl.g:3610:3: rule__UPDATE__ScAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__ScAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getScAssignment_4_1()); 
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
    // $ANTLR end "rule__UPDATE__Group_4__1__Impl"


    // $ANTLR start "rule__UPDATE__Group_5__0"
    // InternalMyDsl.g:3619:1: rule__UPDATE__Group_5__0 : rule__UPDATE__Group_5__0__Impl rule__UPDATE__Group_5__1 ;
    public final void rule__UPDATE__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3623:1: ( rule__UPDATE__Group_5__0__Impl rule__UPDATE__Group_5__1 )
            // InternalMyDsl.g:3624:2: rule__UPDATE__Group_5__0__Impl rule__UPDATE__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__UPDATE__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group_5__1();

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
    // $ANTLR end "rule__UPDATE__Group_5__0"


    // $ANTLR start "rule__UPDATE__Group_5__0__Impl"
    // InternalMyDsl.g:3631:1: rule__UPDATE__Group_5__0__Impl : ( 'WHERE' ) ;
    public final void rule__UPDATE__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3635:1: ( ( 'WHERE' ) )
            // InternalMyDsl.g:3636:1: ( 'WHERE' )
            {
            // InternalMyDsl.g:3636:1: ( 'WHERE' )
            // InternalMyDsl.g:3637:2: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getWHEREKeyword_5_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getWHEREKeyword_5_0()); 
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
    // $ANTLR end "rule__UPDATE__Group_5__0__Impl"


    // $ANTLR start "rule__UPDATE__Group_5__1"
    // InternalMyDsl.g:3646:1: rule__UPDATE__Group_5__1 : rule__UPDATE__Group_5__1__Impl rule__UPDATE__Group_5__2 ;
    public final void rule__UPDATE__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3650:1: ( rule__UPDATE__Group_5__1__Impl rule__UPDATE__Group_5__2 )
            // InternalMyDsl.g:3651:2: rule__UPDATE__Group_5__1__Impl rule__UPDATE__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__UPDATE__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group_5__2();

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
    // $ANTLR end "rule__UPDATE__Group_5__1"


    // $ANTLR start "rule__UPDATE__Group_5__1__Impl"
    // InternalMyDsl.g:3658:1: rule__UPDATE__Group_5__1__Impl : ( ( rule__UPDATE__ZAssignment_5_1 ) ) ;
    public final void rule__UPDATE__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3662:1: ( ( ( rule__UPDATE__ZAssignment_5_1 ) ) )
            // InternalMyDsl.g:3663:1: ( ( rule__UPDATE__ZAssignment_5_1 ) )
            {
            // InternalMyDsl.g:3663:1: ( ( rule__UPDATE__ZAssignment_5_1 ) )
            // InternalMyDsl.g:3664:2: ( rule__UPDATE__ZAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getZAssignment_5_1()); 
            }
            // InternalMyDsl.g:3665:2: ( rule__UPDATE__ZAssignment_5_1 )
            // InternalMyDsl.g:3665:3: rule__UPDATE__ZAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__ZAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getZAssignment_5_1()); 
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
    // $ANTLR end "rule__UPDATE__Group_5__1__Impl"


    // $ANTLR start "rule__UPDATE__Group_5__2"
    // InternalMyDsl.g:3673:1: rule__UPDATE__Group_5__2 : rule__UPDATE__Group_5__2__Impl ;
    public final void rule__UPDATE__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3677:1: ( rule__UPDATE__Group_5__2__Impl )
            // InternalMyDsl.g:3678:2: rule__UPDATE__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group_5__2__Impl();

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
    // $ANTLR end "rule__UPDATE__Group_5__2"


    // $ANTLR start "rule__UPDATE__Group_5__2__Impl"
    // InternalMyDsl.g:3684:1: rule__UPDATE__Group_5__2__Impl : ( ( rule__UPDATE__Group_5_2__0 )* ) ;
    public final void rule__UPDATE__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3688:1: ( ( ( rule__UPDATE__Group_5_2__0 )* ) )
            // InternalMyDsl.g:3689:1: ( ( rule__UPDATE__Group_5_2__0 )* )
            {
            // InternalMyDsl.g:3689:1: ( ( rule__UPDATE__Group_5_2__0 )* )
            // InternalMyDsl.g:3690:2: ( rule__UPDATE__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getGroup_5_2()); 
            }
            // InternalMyDsl.g:3691:2: ( rule__UPDATE__Group_5_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=13 && LA30_0<=14)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3691:3: rule__UPDATE__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UPDATE__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getGroup_5_2()); 
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
    // $ANTLR end "rule__UPDATE__Group_5__2__Impl"


    // $ANTLR start "rule__UPDATE__Group_5_2__0"
    // InternalMyDsl.g:3700:1: rule__UPDATE__Group_5_2__0 : rule__UPDATE__Group_5_2__0__Impl rule__UPDATE__Group_5_2__1 ;
    public final void rule__UPDATE__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3704:1: ( rule__UPDATE__Group_5_2__0__Impl rule__UPDATE__Group_5_2__1 )
            // InternalMyDsl.g:3705:2: rule__UPDATE__Group_5_2__0__Impl rule__UPDATE__Group_5_2__1
            {
            pushFollow(FOLLOW_12);
            rule__UPDATE__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group_5_2__1();

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
    // $ANTLR end "rule__UPDATE__Group_5_2__0"


    // $ANTLR start "rule__UPDATE__Group_5_2__0__Impl"
    // InternalMyDsl.g:3712:1: rule__UPDATE__Group_5_2__0__Impl : ( ( rule__UPDATE__Alternatives_5_2_0 ) ) ;
    public final void rule__UPDATE__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3716:1: ( ( ( rule__UPDATE__Alternatives_5_2_0 ) ) )
            // InternalMyDsl.g:3717:1: ( ( rule__UPDATE__Alternatives_5_2_0 ) )
            {
            // InternalMyDsl.g:3717:1: ( ( rule__UPDATE__Alternatives_5_2_0 ) )
            // InternalMyDsl.g:3718:2: ( rule__UPDATE__Alternatives_5_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getAlternatives_5_2_0()); 
            }
            // InternalMyDsl.g:3719:2: ( rule__UPDATE__Alternatives_5_2_0 )
            // InternalMyDsl.g:3719:3: rule__UPDATE__Alternatives_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Alternatives_5_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getAlternatives_5_2_0()); 
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
    // $ANTLR end "rule__UPDATE__Group_5_2__0__Impl"


    // $ANTLR start "rule__UPDATE__Group_5_2__1"
    // InternalMyDsl.g:3727:1: rule__UPDATE__Group_5_2__1 : rule__UPDATE__Group_5_2__1__Impl ;
    public final void rule__UPDATE__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3731:1: ( rule__UPDATE__Group_5_2__1__Impl )
            // InternalMyDsl.g:3732:2: rule__UPDATE__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__UPDATE__Group_5_2__1"


    // $ANTLR start "rule__UPDATE__Group_5_2__1__Impl"
    // InternalMyDsl.g:3738:1: rule__UPDATE__Group_5_2__1__Impl : ( ( rule__UPDATE__ZAssignment_5_2_1 ) ) ;
    public final void rule__UPDATE__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3742:1: ( ( ( rule__UPDATE__ZAssignment_5_2_1 ) ) )
            // InternalMyDsl.g:3743:1: ( ( rule__UPDATE__ZAssignment_5_2_1 ) )
            {
            // InternalMyDsl.g:3743:1: ( ( rule__UPDATE__ZAssignment_5_2_1 ) )
            // InternalMyDsl.g:3744:2: ( rule__UPDATE__ZAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getZAssignment_5_2_1()); 
            }
            // InternalMyDsl.g:3745:2: ( rule__UPDATE__ZAssignment_5_2_1 )
            // InternalMyDsl.g:3745:3: rule__UPDATE__ZAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__ZAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getZAssignment_5_2_1()); 
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
    // $ANTLR end "rule__UPDATE__Group_5_2__1__Impl"


    // $ANTLR start "rule__SetClause__Group__0"
    // InternalMyDsl.g:3754:1: rule__SetClause__Group__0 : rule__SetClause__Group__0__Impl rule__SetClause__Group__1 ;
    public final void rule__SetClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3758:1: ( rule__SetClause__Group__0__Impl rule__SetClause__Group__1 )
            // InternalMyDsl.g:3759:2: rule__SetClause__Group__0__Impl rule__SetClause__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SetClause__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetClause__Group__1();

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
    // $ANTLR end "rule__SetClause__Group__0"


    // $ANTLR start "rule__SetClause__Group__0__Impl"
    // InternalMyDsl.g:3766:1: rule__SetClause__Group__0__Impl : ( ( rule__SetClause__ColumnAssignment_0 ) ) ;
    public final void rule__SetClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3770:1: ( ( ( rule__SetClause__ColumnAssignment_0 ) ) )
            // InternalMyDsl.g:3771:1: ( ( rule__SetClause__ColumnAssignment_0 ) )
            {
            // InternalMyDsl.g:3771:1: ( ( rule__SetClause__ColumnAssignment_0 ) )
            // InternalMyDsl.g:3772:2: ( rule__SetClause__ColumnAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getColumnAssignment_0()); 
            }
            // InternalMyDsl.g:3773:2: ( rule__SetClause__ColumnAssignment_0 )
            // InternalMyDsl.g:3773:3: rule__SetClause__ColumnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__ColumnAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getColumnAssignment_0()); 
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
    // $ANTLR end "rule__SetClause__Group__0__Impl"


    // $ANTLR start "rule__SetClause__Group__1"
    // InternalMyDsl.g:3781:1: rule__SetClause__Group__1 : rule__SetClause__Group__1__Impl rule__SetClause__Group__2 ;
    public final void rule__SetClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3785:1: ( rule__SetClause__Group__1__Impl rule__SetClause__Group__2 )
            // InternalMyDsl.g:3786:2: rule__SetClause__Group__1__Impl rule__SetClause__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__SetClause__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetClause__Group__2();

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
    // $ANTLR end "rule__SetClause__Group__1"


    // $ANTLR start "rule__SetClause__Group__1__Impl"
    // InternalMyDsl.g:3793:1: rule__SetClause__Group__1__Impl : ( '=' ) ;
    public final void rule__SetClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3797:1: ( ( '=' ) )
            // InternalMyDsl.g:3798:1: ( '=' )
            {
            // InternalMyDsl.g:3798:1: ( '=' )
            // InternalMyDsl.g:3799:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getEqualsSignKeyword_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__SetClause__Group__1__Impl"


    // $ANTLR start "rule__SetClause__Group__2"
    // InternalMyDsl.g:3808:1: rule__SetClause__Group__2 : rule__SetClause__Group__2__Impl ;
    public final void rule__SetClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3812:1: ( rule__SetClause__Group__2__Impl )
            // InternalMyDsl.g:3813:2: rule__SetClause__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__Group__2__Impl();

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
    // $ANTLR end "rule__SetClause__Group__2"


    // $ANTLR start "rule__SetClause__Group__2__Impl"
    // InternalMyDsl.g:3819:1: rule__SetClause__Group__2__Impl : ( ( rule__SetClause__Alternatives_2 ) ) ;
    public final void rule__SetClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3823:1: ( ( ( rule__SetClause__Alternatives_2 ) ) )
            // InternalMyDsl.g:3824:1: ( ( rule__SetClause__Alternatives_2 ) )
            {
            // InternalMyDsl.g:3824:1: ( ( rule__SetClause__Alternatives_2 ) )
            // InternalMyDsl.g:3825:2: ( rule__SetClause__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getAlternatives_2()); 
            }
            // InternalMyDsl.g:3826:2: ( rule__SetClause__Alternatives_2 )
            // InternalMyDsl.g:3826:3: rule__SetClause__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__SetClause__Group__2__Impl"


    // $ANTLR start "rule__SetClause__Group_2_0__0"
    // InternalMyDsl.g:3835:1: rule__SetClause__Group_2_0__0 : rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1 ;
    public final void rule__SetClause__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3839:1: ( rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1 )
            // InternalMyDsl.g:3840:2: rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1
            {
            pushFollow(FOLLOW_12);
            rule__SetClause__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetClause__Group_2_0__1();

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
    // $ANTLR end "rule__SetClause__Group_2_0__0"


    // $ANTLR start "rule__SetClause__Group_2_0__0__Impl"
    // InternalMyDsl.g:3847:1: rule__SetClause__Group_2_0__0__Impl : ( '#' ) ;
    public final void rule__SetClause__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3851:1: ( ( '#' ) )
            // InternalMyDsl.g:3852:1: ( '#' )
            {
            // InternalMyDsl.g:3852:1: ( '#' )
            // InternalMyDsl.g:3853:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_0()); 
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
    // $ANTLR end "rule__SetClause__Group_2_0__0__Impl"


    // $ANTLR start "rule__SetClause__Group_2_0__1"
    // InternalMyDsl.g:3862:1: rule__SetClause__Group_2_0__1 : rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2 ;
    public final void rule__SetClause__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3866:1: ( rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2 )
            // InternalMyDsl.g:3867:2: rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2
            {
            pushFollow(FOLLOW_18);
            rule__SetClause__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetClause__Group_2_0__2();

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
    // $ANTLR end "rule__SetClause__Group_2_0__1"


    // $ANTLR start "rule__SetClause__Group_2_0__1__Impl"
    // InternalMyDsl.g:3874:1: rule__SetClause__Group_2_0__1__Impl : ( ( rule__SetClause__NameAssignment_2_0_1 ) ) ;
    public final void rule__SetClause__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3878:1: ( ( ( rule__SetClause__NameAssignment_2_0_1 ) ) )
            // InternalMyDsl.g:3879:1: ( ( rule__SetClause__NameAssignment_2_0_1 ) )
            {
            // InternalMyDsl.g:3879:1: ( ( rule__SetClause__NameAssignment_2_0_1 ) )
            // InternalMyDsl.g:3880:2: ( rule__SetClause__NameAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getNameAssignment_2_0_1()); 
            }
            // InternalMyDsl.g:3881:2: ( rule__SetClause__NameAssignment_2_0_1 )
            // InternalMyDsl.g:3881:3: rule__SetClause__NameAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__NameAssignment_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getNameAssignment_2_0_1()); 
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
    // $ANTLR end "rule__SetClause__Group_2_0__1__Impl"


    // $ANTLR start "rule__SetClause__Group_2_0__2"
    // InternalMyDsl.g:3889:1: rule__SetClause__Group_2_0__2 : rule__SetClause__Group_2_0__2__Impl ;
    public final void rule__SetClause__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3893:1: ( rule__SetClause__Group_2_0__2__Impl )
            // InternalMyDsl.g:3894:2: rule__SetClause__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__SetClause__Group_2_0__2"


    // $ANTLR start "rule__SetClause__Group_2_0__2__Impl"
    // InternalMyDsl.g:3900:1: rule__SetClause__Group_2_0__2__Impl : ( '#' ) ;
    public final void rule__SetClause__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3904:1: ( ( '#' ) )
            // InternalMyDsl.g:3905:1: ( '#' )
            {
            // InternalMyDsl.g:3905:1: ( '#' )
            // InternalMyDsl.g:3906:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_2()); 
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
    // $ANTLR end "rule__SetClause__Group_2_0__2__Impl"


    // $ANTLR start "rule__ALTER__Group__0"
    // InternalMyDsl.g:3916:1: rule__ALTER__Group__0 : rule__ALTER__Group__0__Impl rule__ALTER__Group__1 ;
    public final void rule__ALTER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3920:1: ( rule__ALTER__Group__0__Impl rule__ALTER__Group__1 )
            // InternalMyDsl.g:3921:2: rule__ALTER__Group__0__Impl rule__ALTER__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ALTER__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALTER__Group__1();

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
    // $ANTLR end "rule__ALTER__Group__0"


    // $ANTLR start "rule__ALTER__Group__0__Impl"
    // InternalMyDsl.g:3928:1: rule__ALTER__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__ALTER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3932:1: ( ( 'ALTER' ) )
            // InternalMyDsl.g:3933:1: ( 'ALTER' )
            {
            // InternalMyDsl.g:3933:1: ( 'ALTER' )
            // InternalMyDsl.g:3934:2: 'ALTER'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERAccess().getALTERKeyword_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERAccess().getALTERKeyword_0()); 
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
    // $ANTLR end "rule__ALTER__Group__0__Impl"


    // $ANTLR start "rule__ALTER__Group__1"
    // InternalMyDsl.g:3943:1: rule__ALTER__Group__1 : rule__ALTER__Group__1__Impl rule__ALTER__Group__2 ;
    public final void rule__ALTER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3947:1: ( rule__ALTER__Group__1__Impl rule__ALTER__Group__2 )
            // InternalMyDsl.g:3948:2: rule__ALTER__Group__1__Impl rule__ALTER__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ALTER__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALTER__Group__2();

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
    // $ANTLR end "rule__ALTER__Group__1"


    // $ANTLR start "rule__ALTER__Group__1__Impl"
    // InternalMyDsl.g:3955:1: rule__ALTER__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__ALTER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3959:1: ( ( 'TABLE' ) )
            // InternalMyDsl.g:3960:1: ( 'TABLE' )
            {
            // InternalMyDsl.g:3960:1: ( 'TABLE' )
            // InternalMyDsl.g:3961:2: 'TABLE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERAccess().getTABLEKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERAccess().getTABLEKeyword_1()); 
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
    // $ANTLR end "rule__ALTER__Group__1__Impl"


    // $ANTLR start "rule__ALTER__Group__2"
    // InternalMyDsl.g:3970:1: rule__ALTER__Group__2 : rule__ALTER__Group__2__Impl rule__ALTER__Group__3 ;
    public final void rule__ALTER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3974:1: ( rule__ALTER__Group__2__Impl rule__ALTER__Group__3 )
            // InternalMyDsl.g:3975:2: rule__ALTER__Group__2__Impl rule__ALTER__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ALTER__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALTER__Group__3();

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
    // $ANTLR end "rule__ALTER__Group__2"


    // $ANTLR start "rule__ALTER__Group__2__Impl"
    // InternalMyDsl.g:3982:1: rule__ALTER__Group__2__Impl : ( ( rule__ALTER__TableAssignment_2 ) ) ;
    public final void rule__ALTER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3986:1: ( ( ( rule__ALTER__TableAssignment_2 ) ) )
            // InternalMyDsl.g:3987:1: ( ( rule__ALTER__TableAssignment_2 ) )
            {
            // InternalMyDsl.g:3987:1: ( ( rule__ALTER__TableAssignment_2 ) )
            // InternalMyDsl.g:3988:2: ( rule__ALTER__TableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERAccess().getTableAssignment_2()); 
            }
            // InternalMyDsl.g:3989:2: ( rule__ALTER__TableAssignment_2 )
            // InternalMyDsl.g:3989:3: rule__ALTER__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ALTER__TableAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERAccess().getTableAssignment_2()); 
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
    // $ANTLR end "rule__ALTER__Group__2__Impl"


    // $ANTLR start "rule__ALTER__Group__3"
    // InternalMyDsl.g:3997:1: rule__ALTER__Group__3 : rule__ALTER__Group__3__Impl ;
    public final void rule__ALTER__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4001:1: ( rule__ALTER__Group__3__Impl )
            // InternalMyDsl.g:4002:2: rule__ALTER__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALTER__Group__3__Impl();

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
    // $ANTLR end "rule__ALTER__Group__3"


    // $ANTLR start "rule__ALTER__Group__3__Impl"
    // InternalMyDsl.g:4008:1: rule__ALTER__Group__3__Impl : ( ( rule__ALTER__AddDropUpdateAssignment_3 ) ) ;
    public final void rule__ALTER__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4012:1: ( ( ( rule__ALTER__AddDropUpdateAssignment_3 ) ) )
            // InternalMyDsl.g:4013:1: ( ( rule__ALTER__AddDropUpdateAssignment_3 ) )
            {
            // InternalMyDsl.g:4013:1: ( ( rule__ALTER__AddDropUpdateAssignment_3 ) )
            // InternalMyDsl.g:4014:2: ( rule__ALTER__AddDropUpdateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERAccess().getAddDropUpdateAssignment_3()); 
            }
            // InternalMyDsl.g:4015:2: ( rule__ALTER__AddDropUpdateAssignment_3 )
            // InternalMyDsl.g:4015:3: rule__ALTER__AddDropUpdateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ALTER__AddDropUpdateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERAccess().getAddDropUpdateAssignment_3()); 
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
    // $ANTLR end "rule__ALTER__Group__3__Impl"


    // $ANTLR start "rule__ALTERDROP__Group__0"
    // InternalMyDsl.g:4024:1: rule__ALTERDROP__Group__0 : rule__ALTERDROP__Group__0__Impl rule__ALTERDROP__Group__1 ;
    public final void rule__ALTERDROP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4028:1: ( rule__ALTERDROP__Group__0__Impl rule__ALTERDROP__Group__1 )
            // InternalMyDsl.g:4029:2: rule__ALTERDROP__Group__0__Impl rule__ALTERDROP__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ALTERDROP__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALTERDROP__Group__1();

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
    // $ANTLR end "rule__ALTERDROP__Group__0"


    // $ANTLR start "rule__ALTERDROP__Group__0__Impl"
    // InternalMyDsl.g:4036:1: rule__ALTERDROP__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__ALTERDROP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4040:1: ( ( 'DROP' ) )
            // InternalMyDsl.g:4041:1: ( 'DROP' )
            {
            // InternalMyDsl.g:4041:1: ( 'DROP' )
            // InternalMyDsl.g:4042:2: 'DROP'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERDROPAccess().getDROPKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERDROPAccess().getDROPKeyword_0()); 
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
    // $ANTLR end "rule__ALTERDROP__Group__0__Impl"


    // $ANTLR start "rule__ALTERDROP__Group__1"
    // InternalMyDsl.g:4051:1: rule__ALTERDROP__Group__1 : rule__ALTERDROP__Group__1__Impl rule__ALTERDROP__Group__2 ;
    public final void rule__ALTERDROP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4055:1: ( rule__ALTERDROP__Group__1__Impl rule__ALTERDROP__Group__2 )
            // InternalMyDsl.g:4056:2: rule__ALTERDROP__Group__1__Impl rule__ALTERDROP__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ALTERDROP__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALTERDROP__Group__2();

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
    // $ANTLR end "rule__ALTERDROP__Group__1"


    // $ANTLR start "rule__ALTERDROP__Group__1__Impl"
    // InternalMyDsl.g:4063:1: rule__ALTERDROP__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__ALTERDROP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4067:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:4068:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:4068:1: ( 'COLUMN' )
            // InternalMyDsl.g:4069:2: 'COLUMN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERDROPAccess().getCOLUMNKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERDROPAccess().getCOLUMNKeyword_1()); 
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
    // $ANTLR end "rule__ALTERDROP__Group__1__Impl"


    // $ANTLR start "rule__ALTERDROP__Group__2"
    // InternalMyDsl.g:4078:1: rule__ALTERDROP__Group__2 : rule__ALTERDROP__Group__2__Impl ;
    public final void rule__ALTERDROP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4082:1: ( rule__ALTERDROP__Group__2__Impl )
            // InternalMyDsl.g:4083:2: rule__ALTERDROP__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALTERDROP__Group__2__Impl();

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
    // $ANTLR end "rule__ALTERDROP__Group__2"


    // $ANTLR start "rule__ALTERDROP__Group__2__Impl"
    // InternalMyDsl.g:4089:1: rule__ALTERDROP__Group__2__Impl : ( ( rule__ALTERDROP__ColumnAssignment_2 ) ) ;
    public final void rule__ALTERDROP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4093:1: ( ( ( rule__ALTERDROP__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:4094:1: ( ( rule__ALTERDROP__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:4094:1: ( ( rule__ALTERDROP__ColumnAssignment_2 ) )
            // InternalMyDsl.g:4095:2: ( rule__ALTERDROP__ColumnAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERDROPAccess().getColumnAssignment_2()); 
            }
            // InternalMyDsl.g:4096:2: ( rule__ALTERDROP__ColumnAssignment_2 )
            // InternalMyDsl.g:4096:3: rule__ALTERDROP__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ALTERDROP__ColumnAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERDROPAccess().getColumnAssignment_2()); 
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
    // $ANTLR end "rule__ALTERDROP__Group__2__Impl"


    // $ANTLR start "rule__ALTERADD__Group__0"
    // InternalMyDsl.g:4105:1: rule__ALTERADD__Group__0 : rule__ALTERADD__Group__0__Impl rule__ALTERADD__Group__1 ;
    public final void rule__ALTERADD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4109:1: ( rule__ALTERADD__Group__0__Impl rule__ALTERADD__Group__1 )
            // InternalMyDsl.g:4110:2: rule__ALTERADD__Group__0__Impl rule__ALTERADD__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ALTERADD__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALTERADD__Group__1();

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
    // $ANTLR end "rule__ALTERADD__Group__0"


    // $ANTLR start "rule__ALTERADD__Group__0__Impl"
    // InternalMyDsl.g:4117:1: rule__ALTERADD__Group__0__Impl : ( 'ADD' ) ;
    public final void rule__ALTERADD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4121:1: ( ( 'ADD' ) )
            // InternalMyDsl.g:4122:1: ( 'ADD' )
            {
            // InternalMyDsl.g:4122:1: ( 'ADD' )
            // InternalMyDsl.g:4123:2: 'ADD'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERADDAccess().getADDKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERADDAccess().getADDKeyword_0()); 
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
    // $ANTLR end "rule__ALTERADD__Group__0__Impl"


    // $ANTLR start "rule__ALTERADD__Group__1"
    // InternalMyDsl.g:4132:1: rule__ALTERADD__Group__1 : rule__ALTERADD__Group__1__Impl ;
    public final void rule__ALTERADD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4136:1: ( rule__ALTERADD__Group__1__Impl )
            // InternalMyDsl.g:4137:2: rule__ALTERADD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALTERADD__Group__1__Impl();

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
    // $ANTLR end "rule__ALTERADD__Group__1"


    // $ANTLR start "rule__ALTERADD__Group__1__Impl"
    // InternalMyDsl.g:4143:1: rule__ALTERADD__Group__1__Impl : ( ( rule__ALTERADD__ColumnAssignment_1 ) ) ;
    public final void rule__ALTERADD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4147:1: ( ( ( rule__ALTERADD__ColumnAssignment_1 ) ) )
            // InternalMyDsl.g:4148:1: ( ( rule__ALTERADD__ColumnAssignment_1 ) )
            {
            // InternalMyDsl.g:4148:1: ( ( rule__ALTERADD__ColumnAssignment_1 ) )
            // InternalMyDsl.g:4149:2: ( rule__ALTERADD__ColumnAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERADDAccess().getColumnAssignment_1()); 
            }
            // InternalMyDsl.g:4150:2: ( rule__ALTERADD__ColumnAssignment_1 )
            // InternalMyDsl.g:4150:3: rule__ALTERADD__ColumnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ALTERADD__ColumnAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERADDAccess().getColumnAssignment_1()); 
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
    // $ANTLR end "rule__ALTERADD__Group__1__Impl"


    // $ANTLR start "rule__ALTERUPDATE__Group__0"
    // InternalMyDsl.g:4159:1: rule__ALTERUPDATE__Group__0 : rule__ALTERUPDATE__Group__0__Impl rule__ALTERUPDATE__Group__1 ;
    public final void rule__ALTERUPDATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4163:1: ( rule__ALTERUPDATE__Group__0__Impl rule__ALTERUPDATE__Group__1 )
            // InternalMyDsl.g:4164:2: rule__ALTERUPDATE__Group__0__Impl rule__ALTERUPDATE__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ALTERUPDATE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALTERUPDATE__Group__1();

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
    // $ANTLR end "rule__ALTERUPDATE__Group__0"


    // $ANTLR start "rule__ALTERUPDATE__Group__0__Impl"
    // InternalMyDsl.g:4171:1: rule__ALTERUPDATE__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__ALTERUPDATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4175:1: ( ( 'ALTER' ) )
            // InternalMyDsl.g:4176:1: ( 'ALTER' )
            {
            // InternalMyDsl.g:4176:1: ( 'ALTER' )
            // InternalMyDsl.g:4177:2: 'ALTER'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERUPDATEAccess().getALTERKeyword_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERUPDATEAccess().getALTERKeyword_0()); 
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
    // $ANTLR end "rule__ALTERUPDATE__Group__0__Impl"


    // $ANTLR start "rule__ALTERUPDATE__Group__1"
    // InternalMyDsl.g:4186:1: rule__ALTERUPDATE__Group__1 : rule__ALTERUPDATE__Group__1__Impl rule__ALTERUPDATE__Group__2 ;
    public final void rule__ALTERUPDATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4190:1: ( rule__ALTERUPDATE__Group__1__Impl rule__ALTERUPDATE__Group__2 )
            // InternalMyDsl.g:4191:2: rule__ALTERUPDATE__Group__1__Impl rule__ALTERUPDATE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ALTERUPDATE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALTERUPDATE__Group__2();

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
    // $ANTLR end "rule__ALTERUPDATE__Group__1"


    // $ANTLR start "rule__ALTERUPDATE__Group__1__Impl"
    // InternalMyDsl.g:4198:1: rule__ALTERUPDATE__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__ALTERUPDATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4202:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:4203:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:4203:1: ( 'COLUMN' )
            // InternalMyDsl.g:4204:2: 'COLUMN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERUPDATEAccess().getCOLUMNKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERUPDATEAccess().getCOLUMNKeyword_1()); 
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
    // $ANTLR end "rule__ALTERUPDATE__Group__1__Impl"


    // $ANTLR start "rule__ALTERUPDATE__Group__2"
    // InternalMyDsl.g:4213:1: rule__ALTERUPDATE__Group__2 : rule__ALTERUPDATE__Group__2__Impl ;
    public final void rule__ALTERUPDATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4217:1: ( rule__ALTERUPDATE__Group__2__Impl )
            // InternalMyDsl.g:4218:2: rule__ALTERUPDATE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALTERUPDATE__Group__2__Impl();

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
    // $ANTLR end "rule__ALTERUPDATE__Group__2"


    // $ANTLR start "rule__ALTERUPDATE__Group__2__Impl"
    // InternalMyDsl.g:4224:1: rule__ALTERUPDATE__Group__2__Impl : ( ( rule__ALTERUPDATE__ColumnAssignment_2 ) ) ;
    public final void rule__ALTERUPDATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4228:1: ( ( ( rule__ALTERUPDATE__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:4229:1: ( ( rule__ALTERUPDATE__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:4229:1: ( ( rule__ALTERUPDATE__ColumnAssignment_2 ) )
            // InternalMyDsl.g:4230:2: ( rule__ALTERUPDATE__ColumnAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERUPDATEAccess().getColumnAssignment_2()); 
            }
            // InternalMyDsl.g:4231:2: ( rule__ALTERUPDATE__ColumnAssignment_2 )
            // InternalMyDsl.g:4231:3: rule__ALTERUPDATE__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ALTERUPDATE__ColumnAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERUPDATEAccess().getColumnAssignment_2()); 
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
    // $ANTLR end "rule__ALTERUPDATE__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalMyDsl.g:4240:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4244:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalMyDsl.g:4245:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalMyDsl.g:4252:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4256:1: ( ( 'var' ) )
            // InternalMyDsl.g:4257:1: ( 'var' )
            {
            // InternalMyDsl.g:4257:1: ( 'var' )
            // InternalMyDsl.g:4258:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalMyDsl.g:4267:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4271:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalMyDsl.g:4272:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalMyDsl.g:4279:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4283:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4284:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4284:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalMyDsl.g:4285:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:4286:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalMyDsl.g:4286:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalMyDsl.g:4294:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4298:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalMyDsl.g:4299:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalMyDsl.g:4306:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4310:1: ( ( '=' ) )
            // InternalMyDsl.g:4311:1: ( '=' )
            {
            // InternalMyDsl.g:4311:1: ( '=' )
            // InternalMyDsl.g:4312:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalMyDsl.g:4321:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4325:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalMyDsl.g:4326:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalMyDsl.g:4332:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4336:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:4337:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:4337:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalMyDsl.g:4338:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            }
            // InternalMyDsl.g:4339:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalMyDsl.g:4339:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__CountFunction__Group__0"
    // InternalMyDsl.g:4348:1: rule__CountFunction__Group__0 : rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1 ;
    public final void rule__CountFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4352:1: ( rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1 )
            // InternalMyDsl.g:4353:2: rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__CountFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__1();

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
    // $ANTLR end "rule__CountFunction__Group__0"


    // $ANTLR start "rule__CountFunction__Group__0__Impl"
    // InternalMyDsl.g:4360:1: rule__CountFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__CountFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4364:1: ( ( 'SELECT' ) )
            // InternalMyDsl.g:4365:1: ( 'SELECT' )
            {
            // InternalMyDsl.g:4365:1: ( 'SELECT' )
            // InternalMyDsl.g:4366:2: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getSELECTKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getSELECTKeyword_0()); 
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
    // $ANTLR end "rule__CountFunction__Group__0__Impl"


    // $ANTLR start "rule__CountFunction__Group__1"
    // InternalMyDsl.g:4375:1: rule__CountFunction__Group__1 : rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2 ;
    public final void rule__CountFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4379:1: ( rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2 )
            // InternalMyDsl.g:4380:2: rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CountFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__2();

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
    // $ANTLR end "rule__CountFunction__Group__1"


    // $ANTLR start "rule__CountFunction__Group__1__Impl"
    // InternalMyDsl.g:4387:1: rule__CountFunction__Group__1__Impl : ( 'COUNT' ) ;
    public final void rule__CountFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4391:1: ( ( 'COUNT' ) )
            // InternalMyDsl.g:4392:1: ( 'COUNT' )
            {
            // InternalMyDsl.g:4392:1: ( 'COUNT' )
            // InternalMyDsl.g:4393:2: 'COUNT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getCOUNTKeyword_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getCOUNTKeyword_1()); 
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
    // $ANTLR end "rule__CountFunction__Group__1__Impl"


    // $ANTLR start "rule__CountFunction__Group__2"
    // InternalMyDsl.g:4402:1: rule__CountFunction__Group__2 : rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3 ;
    public final void rule__CountFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4406:1: ( rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3 )
            // InternalMyDsl.g:4407:2: rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CountFunction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__3();

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
    // $ANTLR end "rule__CountFunction__Group__2"


    // $ANTLR start "rule__CountFunction__Group__2__Impl"
    // InternalMyDsl.g:4414:1: rule__CountFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__CountFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4418:1: ( ( '(' ) )
            // InternalMyDsl.g:4419:1: ( '(' )
            {
            // InternalMyDsl.g:4419:1: ( '(' )
            // InternalMyDsl.g:4420:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__CountFunction__Group__2__Impl"


    // $ANTLR start "rule__CountFunction__Group__3"
    // InternalMyDsl.g:4429:1: rule__CountFunction__Group__3 : rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4 ;
    public final void rule__CountFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4433:1: ( rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4 )
            // InternalMyDsl.g:4434:2: rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__CountFunction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__4();

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
    // $ANTLR end "rule__CountFunction__Group__3"


    // $ANTLR start "rule__CountFunction__Group__3__Impl"
    // InternalMyDsl.g:4441:1: rule__CountFunction__Group__3__Impl : ( ( rule__CountFunction__ColumnAssignment_3 ) ) ;
    public final void rule__CountFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4445:1: ( ( ( rule__CountFunction__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:4446:1: ( ( rule__CountFunction__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:4446:1: ( ( rule__CountFunction__ColumnAssignment_3 ) )
            // InternalMyDsl.g:4447:2: ( rule__CountFunction__ColumnAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getColumnAssignment_3()); 
            }
            // InternalMyDsl.g:4448:2: ( rule__CountFunction__ColumnAssignment_3 )
            // InternalMyDsl.g:4448:3: rule__CountFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CountFunction__ColumnAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getColumnAssignment_3()); 
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
    // $ANTLR end "rule__CountFunction__Group__3__Impl"


    // $ANTLR start "rule__CountFunction__Group__4"
    // InternalMyDsl.g:4456:1: rule__CountFunction__Group__4 : rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5 ;
    public final void rule__CountFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4460:1: ( rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5 )
            // InternalMyDsl.g:4461:2: rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__CountFunction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__5();

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
    // $ANTLR end "rule__CountFunction__Group__4"


    // $ANTLR start "rule__CountFunction__Group__4__Impl"
    // InternalMyDsl.g:4468:1: rule__CountFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__CountFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4472:1: ( ( ')' ) )
            // InternalMyDsl.g:4473:1: ( ')' )
            {
            // InternalMyDsl.g:4473:1: ( ')' )
            // InternalMyDsl.g:4474:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__CountFunction__Group__4__Impl"


    // $ANTLR start "rule__CountFunction__Group__5"
    // InternalMyDsl.g:4483:1: rule__CountFunction__Group__5 : rule__CountFunction__Group__5__Impl ;
    public final void rule__CountFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4487:1: ( rule__CountFunction__Group__5__Impl )
            // InternalMyDsl.g:4488:2: rule__CountFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__5__Impl();

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
    // $ANTLR end "rule__CountFunction__Group__5"


    // $ANTLR start "rule__CountFunction__Group__5__Impl"
    // InternalMyDsl.g:4494:1: rule__CountFunction__Group__5__Impl : ( ( rule__CountFunction__XAssignment_5 ) ) ;
    public final void rule__CountFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4498:1: ( ( ( rule__CountFunction__XAssignment_5 ) ) )
            // InternalMyDsl.g:4499:1: ( ( rule__CountFunction__XAssignment_5 ) )
            {
            // InternalMyDsl.g:4499:1: ( ( rule__CountFunction__XAssignment_5 ) )
            // InternalMyDsl.g:4500:2: ( rule__CountFunction__XAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getXAssignment_5()); 
            }
            // InternalMyDsl.g:4501:2: ( rule__CountFunction__XAssignment_5 )
            // InternalMyDsl.g:4501:3: rule__CountFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CountFunction__XAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getXAssignment_5()); 
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
    // $ANTLR end "rule__CountFunction__Group__5__Impl"


    // $ANTLR start "rule__AvgFunction__Group__0"
    // InternalMyDsl.g:4510:1: rule__AvgFunction__Group__0 : rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1 ;
    public final void rule__AvgFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4514:1: ( rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1 )
            // InternalMyDsl.g:4515:2: rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__AvgFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__1();

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
    // $ANTLR end "rule__AvgFunction__Group__0"


    // $ANTLR start "rule__AvgFunction__Group__0__Impl"
    // InternalMyDsl.g:4522:1: rule__AvgFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__AvgFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4526:1: ( ( 'SELECT' ) )
            // InternalMyDsl.g:4527:1: ( 'SELECT' )
            {
            // InternalMyDsl.g:4527:1: ( 'SELECT' )
            // InternalMyDsl.g:4528:2: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getSELECTKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getSELECTKeyword_0()); 
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
    // $ANTLR end "rule__AvgFunction__Group__0__Impl"


    // $ANTLR start "rule__AvgFunction__Group__1"
    // InternalMyDsl.g:4537:1: rule__AvgFunction__Group__1 : rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2 ;
    public final void rule__AvgFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4541:1: ( rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2 )
            // InternalMyDsl.g:4542:2: rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__AvgFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__2();

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
    // $ANTLR end "rule__AvgFunction__Group__1"


    // $ANTLR start "rule__AvgFunction__Group__1__Impl"
    // InternalMyDsl.g:4549:1: rule__AvgFunction__Group__1__Impl : ( 'AVG' ) ;
    public final void rule__AvgFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4553:1: ( ( 'AVG' ) )
            // InternalMyDsl.g:4554:1: ( 'AVG' )
            {
            // InternalMyDsl.g:4554:1: ( 'AVG' )
            // InternalMyDsl.g:4555:2: 'AVG'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getAVGKeyword_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getAVGKeyword_1()); 
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
    // $ANTLR end "rule__AvgFunction__Group__1__Impl"


    // $ANTLR start "rule__AvgFunction__Group__2"
    // InternalMyDsl.g:4564:1: rule__AvgFunction__Group__2 : rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3 ;
    public final void rule__AvgFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4568:1: ( rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3 )
            // InternalMyDsl.g:4569:2: rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AvgFunction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__3();

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
    // $ANTLR end "rule__AvgFunction__Group__2"


    // $ANTLR start "rule__AvgFunction__Group__2__Impl"
    // InternalMyDsl.g:4576:1: rule__AvgFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__AvgFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4580:1: ( ( '(' ) )
            // InternalMyDsl.g:4581:1: ( '(' )
            {
            // InternalMyDsl.g:4581:1: ( '(' )
            // InternalMyDsl.g:4582:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__AvgFunction__Group__2__Impl"


    // $ANTLR start "rule__AvgFunction__Group__3"
    // InternalMyDsl.g:4591:1: rule__AvgFunction__Group__3 : rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4 ;
    public final void rule__AvgFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4595:1: ( rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4 )
            // InternalMyDsl.g:4596:2: rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__AvgFunction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__4();

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
    // $ANTLR end "rule__AvgFunction__Group__3"


    // $ANTLR start "rule__AvgFunction__Group__3__Impl"
    // InternalMyDsl.g:4603:1: rule__AvgFunction__Group__3__Impl : ( ( rule__AvgFunction__ColumnAssignment_3 ) ) ;
    public final void rule__AvgFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4607:1: ( ( ( rule__AvgFunction__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:4608:1: ( ( rule__AvgFunction__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:4608:1: ( ( rule__AvgFunction__ColumnAssignment_3 ) )
            // InternalMyDsl.g:4609:2: ( rule__AvgFunction__ColumnAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getColumnAssignment_3()); 
            }
            // InternalMyDsl.g:4610:2: ( rule__AvgFunction__ColumnAssignment_3 )
            // InternalMyDsl.g:4610:3: rule__AvgFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AvgFunction__ColumnAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getColumnAssignment_3()); 
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
    // $ANTLR end "rule__AvgFunction__Group__3__Impl"


    // $ANTLR start "rule__AvgFunction__Group__4"
    // InternalMyDsl.g:4618:1: rule__AvgFunction__Group__4 : rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5 ;
    public final void rule__AvgFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4622:1: ( rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5 )
            // InternalMyDsl.g:4623:2: rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__AvgFunction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__5();

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
    // $ANTLR end "rule__AvgFunction__Group__4"


    // $ANTLR start "rule__AvgFunction__Group__4__Impl"
    // InternalMyDsl.g:4630:1: rule__AvgFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__AvgFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4634:1: ( ( ')' ) )
            // InternalMyDsl.g:4635:1: ( ')' )
            {
            // InternalMyDsl.g:4635:1: ( ')' )
            // InternalMyDsl.g:4636:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__AvgFunction__Group__4__Impl"


    // $ANTLR start "rule__AvgFunction__Group__5"
    // InternalMyDsl.g:4645:1: rule__AvgFunction__Group__5 : rule__AvgFunction__Group__5__Impl ;
    public final void rule__AvgFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4649:1: ( rule__AvgFunction__Group__5__Impl )
            // InternalMyDsl.g:4650:2: rule__AvgFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__5__Impl();

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
    // $ANTLR end "rule__AvgFunction__Group__5"


    // $ANTLR start "rule__AvgFunction__Group__5__Impl"
    // InternalMyDsl.g:4656:1: rule__AvgFunction__Group__5__Impl : ( ( rule__AvgFunction__XAssignment_5 ) ) ;
    public final void rule__AvgFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4660:1: ( ( ( rule__AvgFunction__XAssignment_5 ) ) )
            // InternalMyDsl.g:4661:1: ( ( rule__AvgFunction__XAssignment_5 ) )
            {
            // InternalMyDsl.g:4661:1: ( ( rule__AvgFunction__XAssignment_5 ) )
            // InternalMyDsl.g:4662:2: ( rule__AvgFunction__XAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getXAssignment_5()); 
            }
            // InternalMyDsl.g:4663:2: ( rule__AvgFunction__XAssignment_5 )
            // InternalMyDsl.g:4663:3: rule__AvgFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AvgFunction__XAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getXAssignment_5()); 
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
    // $ANTLR end "rule__AvgFunction__Group__5__Impl"


    // $ANTLR start "rule__SumFunction__Group__0"
    // InternalMyDsl.g:4672:1: rule__SumFunction__Group__0 : rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1 ;
    public final void rule__SumFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4676:1: ( rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1 )
            // InternalMyDsl.g:4677:2: rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__SumFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__1();

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
    // $ANTLR end "rule__SumFunction__Group__0"


    // $ANTLR start "rule__SumFunction__Group__0__Impl"
    // InternalMyDsl.g:4684:1: rule__SumFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SumFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4688:1: ( ( 'SELECT' ) )
            // InternalMyDsl.g:4689:1: ( 'SELECT' )
            {
            // InternalMyDsl.g:4689:1: ( 'SELECT' )
            // InternalMyDsl.g:4690:2: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getSELECTKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getSELECTKeyword_0()); 
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
    // $ANTLR end "rule__SumFunction__Group__0__Impl"


    // $ANTLR start "rule__SumFunction__Group__1"
    // InternalMyDsl.g:4699:1: rule__SumFunction__Group__1 : rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2 ;
    public final void rule__SumFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4703:1: ( rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2 )
            // InternalMyDsl.g:4704:2: rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__SumFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__2();

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
    // $ANTLR end "rule__SumFunction__Group__1"


    // $ANTLR start "rule__SumFunction__Group__1__Impl"
    // InternalMyDsl.g:4711:1: rule__SumFunction__Group__1__Impl : ( 'SUM' ) ;
    public final void rule__SumFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4715:1: ( ( 'SUM' ) )
            // InternalMyDsl.g:4716:1: ( 'SUM' )
            {
            // InternalMyDsl.g:4716:1: ( 'SUM' )
            // InternalMyDsl.g:4717:2: 'SUM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getSUMKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getSUMKeyword_1()); 
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
    // $ANTLR end "rule__SumFunction__Group__1__Impl"


    // $ANTLR start "rule__SumFunction__Group__2"
    // InternalMyDsl.g:4726:1: rule__SumFunction__Group__2 : rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3 ;
    public final void rule__SumFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4730:1: ( rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3 )
            // InternalMyDsl.g:4731:2: rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SumFunction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__3();

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
    // $ANTLR end "rule__SumFunction__Group__2"


    // $ANTLR start "rule__SumFunction__Group__2__Impl"
    // InternalMyDsl.g:4738:1: rule__SumFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__SumFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4742:1: ( ( '(' ) )
            // InternalMyDsl.g:4743:1: ( '(' )
            {
            // InternalMyDsl.g:4743:1: ( '(' )
            // InternalMyDsl.g:4744:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__SumFunction__Group__2__Impl"


    // $ANTLR start "rule__SumFunction__Group__3"
    // InternalMyDsl.g:4753:1: rule__SumFunction__Group__3 : rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4 ;
    public final void rule__SumFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4757:1: ( rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4 )
            // InternalMyDsl.g:4758:2: rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__SumFunction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__4();

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
    // $ANTLR end "rule__SumFunction__Group__3"


    // $ANTLR start "rule__SumFunction__Group__3__Impl"
    // InternalMyDsl.g:4765:1: rule__SumFunction__Group__3__Impl : ( ( rule__SumFunction__ColumnAssignment_3 ) ) ;
    public final void rule__SumFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4769:1: ( ( ( rule__SumFunction__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:4770:1: ( ( rule__SumFunction__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:4770:1: ( ( rule__SumFunction__ColumnAssignment_3 ) )
            // InternalMyDsl.g:4771:2: ( rule__SumFunction__ColumnAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getColumnAssignment_3()); 
            }
            // InternalMyDsl.g:4772:2: ( rule__SumFunction__ColumnAssignment_3 )
            // InternalMyDsl.g:4772:3: rule__SumFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SumFunction__ColumnAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getColumnAssignment_3()); 
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
    // $ANTLR end "rule__SumFunction__Group__3__Impl"


    // $ANTLR start "rule__SumFunction__Group__4"
    // InternalMyDsl.g:4780:1: rule__SumFunction__Group__4 : rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5 ;
    public final void rule__SumFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4784:1: ( rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5 )
            // InternalMyDsl.g:4785:2: rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SumFunction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__5();

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
    // $ANTLR end "rule__SumFunction__Group__4"


    // $ANTLR start "rule__SumFunction__Group__4__Impl"
    // InternalMyDsl.g:4792:1: rule__SumFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SumFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4796:1: ( ( ')' ) )
            // InternalMyDsl.g:4797:1: ( ')' )
            {
            // InternalMyDsl.g:4797:1: ( ')' )
            // InternalMyDsl.g:4798:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__SumFunction__Group__4__Impl"


    // $ANTLR start "rule__SumFunction__Group__5"
    // InternalMyDsl.g:4807:1: rule__SumFunction__Group__5 : rule__SumFunction__Group__5__Impl ;
    public final void rule__SumFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4811:1: ( rule__SumFunction__Group__5__Impl )
            // InternalMyDsl.g:4812:2: rule__SumFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__5__Impl();

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
    // $ANTLR end "rule__SumFunction__Group__5"


    // $ANTLR start "rule__SumFunction__Group__5__Impl"
    // InternalMyDsl.g:4818:1: rule__SumFunction__Group__5__Impl : ( ( rule__SumFunction__XAssignment_5 ) ) ;
    public final void rule__SumFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4822:1: ( ( ( rule__SumFunction__XAssignment_5 ) ) )
            // InternalMyDsl.g:4823:1: ( ( rule__SumFunction__XAssignment_5 ) )
            {
            // InternalMyDsl.g:4823:1: ( ( rule__SumFunction__XAssignment_5 ) )
            // InternalMyDsl.g:4824:2: ( rule__SumFunction__XAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getXAssignment_5()); 
            }
            // InternalMyDsl.g:4825:2: ( rule__SumFunction__XAssignment_5 )
            // InternalMyDsl.g:4825:3: rule__SumFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SumFunction__XAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getXAssignment_5()); 
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
    // $ANTLR end "rule__SumFunction__Group__5__Impl"


    // $ANTLR start "rule__MinFunction__Group__0"
    // InternalMyDsl.g:4834:1: rule__MinFunction__Group__0 : rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1 ;
    public final void rule__MinFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4838:1: ( rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1 )
            // InternalMyDsl.g:4839:2: rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__MinFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__1();

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
    // $ANTLR end "rule__MinFunction__Group__0"


    // $ANTLR start "rule__MinFunction__Group__0__Impl"
    // InternalMyDsl.g:4846:1: rule__MinFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__MinFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4850:1: ( ( 'SELECT' ) )
            // InternalMyDsl.g:4851:1: ( 'SELECT' )
            {
            // InternalMyDsl.g:4851:1: ( 'SELECT' )
            // InternalMyDsl.g:4852:2: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getSELECTKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getSELECTKeyword_0()); 
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
    // $ANTLR end "rule__MinFunction__Group__0__Impl"


    // $ANTLR start "rule__MinFunction__Group__1"
    // InternalMyDsl.g:4861:1: rule__MinFunction__Group__1 : rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2 ;
    public final void rule__MinFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4865:1: ( rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2 )
            // InternalMyDsl.g:4866:2: rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MinFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__2();

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
    // $ANTLR end "rule__MinFunction__Group__1"


    // $ANTLR start "rule__MinFunction__Group__1__Impl"
    // InternalMyDsl.g:4873:1: rule__MinFunction__Group__1__Impl : ( 'MIN' ) ;
    public final void rule__MinFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4877:1: ( ( 'MIN' ) )
            // InternalMyDsl.g:4878:1: ( 'MIN' )
            {
            // InternalMyDsl.g:4878:1: ( 'MIN' )
            // InternalMyDsl.g:4879:2: 'MIN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getMINKeyword_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getMINKeyword_1()); 
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
    // $ANTLR end "rule__MinFunction__Group__1__Impl"


    // $ANTLR start "rule__MinFunction__Group__2"
    // InternalMyDsl.g:4888:1: rule__MinFunction__Group__2 : rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3 ;
    public final void rule__MinFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4892:1: ( rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3 )
            // InternalMyDsl.g:4893:2: rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MinFunction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__3();

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
    // $ANTLR end "rule__MinFunction__Group__2"


    // $ANTLR start "rule__MinFunction__Group__2__Impl"
    // InternalMyDsl.g:4900:1: rule__MinFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__MinFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4904:1: ( ( '(' ) )
            // InternalMyDsl.g:4905:1: ( '(' )
            {
            // InternalMyDsl.g:4905:1: ( '(' )
            // InternalMyDsl.g:4906:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__MinFunction__Group__2__Impl"


    // $ANTLR start "rule__MinFunction__Group__3"
    // InternalMyDsl.g:4915:1: rule__MinFunction__Group__3 : rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4 ;
    public final void rule__MinFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4919:1: ( rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4 )
            // InternalMyDsl.g:4920:2: rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__MinFunction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__4();

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
    // $ANTLR end "rule__MinFunction__Group__3"


    // $ANTLR start "rule__MinFunction__Group__3__Impl"
    // InternalMyDsl.g:4927:1: rule__MinFunction__Group__3__Impl : ( ( rule__MinFunction__ColumnAssignment_3 ) ) ;
    public final void rule__MinFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4931:1: ( ( ( rule__MinFunction__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:4932:1: ( ( rule__MinFunction__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:4932:1: ( ( rule__MinFunction__ColumnAssignment_3 ) )
            // InternalMyDsl.g:4933:2: ( rule__MinFunction__ColumnAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getColumnAssignment_3()); 
            }
            // InternalMyDsl.g:4934:2: ( rule__MinFunction__ColumnAssignment_3 )
            // InternalMyDsl.g:4934:3: rule__MinFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MinFunction__ColumnAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getColumnAssignment_3()); 
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
    // $ANTLR end "rule__MinFunction__Group__3__Impl"


    // $ANTLR start "rule__MinFunction__Group__4"
    // InternalMyDsl.g:4942:1: rule__MinFunction__Group__4 : rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5 ;
    public final void rule__MinFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4946:1: ( rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5 )
            // InternalMyDsl.g:4947:2: rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MinFunction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__5();

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
    // $ANTLR end "rule__MinFunction__Group__4"


    // $ANTLR start "rule__MinFunction__Group__4__Impl"
    // InternalMyDsl.g:4954:1: rule__MinFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__MinFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4958:1: ( ( ')' ) )
            // InternalMyDsl.g:4959:1: ( ')' )
            {
            // InternalMyDsl.g:4959:1: ( ')' )
            // InternalMyDsl.g:4960:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__MinFunction__Group__4__Impl"


    // $ANTLR start "rule__MinFunction__Group__5"
    // InternalMyDsl.g:4969:1: rule__MinFunction__Group__5 : rule__MinFunction__Group__5__Impl ;
    public final void rule__MinFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4973:1: ( rule__MinFunction__Group__5__Impl )
            // InternalMyDsl.g:4974:2: rule__MinFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__5__Impl();

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
    // $ANTLR end "rule__MinFunction__Group__5"


    // $ANTLR start "rule__MinFunction__Group__5__Impl"
    // InternalMyDsl.g:4980:1: rule__MinFunction__Group__5__Impl : ( ( rule__MinFunction__XAssignment_5 ) ) ;
    public final void rule__MinFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4984:1: ( ( ( rule__MinFunction__XAssignment_5 ) ) )
            // InternalMyDsl.g:4985:1: ( ( rule__MinFunction__XAssignment_5 ) )
            {
            // InternalMyDsl.g:4985:1: ( ( rule__MinFunction__XAssignment_5 ) )
            // InternalMyDsl.g:4986:2: ( rule__MinFunction__XAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getXAssignment_5()); 
            }
            // InternalMyDsl.g:4987:2: ( rule__MinFunction__XAssignment_5 )
            // InternalMyDsl.g:4987:3: rule__MinFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MinFunction__XAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getXAssignment_5()); 
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
    // $ANTLR end "rule__MinFunction__Group__5__Impl"


    // $ANTLR start "rule__MaxFunction__Group__0"
    // InternalMyDsl.g:4996:1: rule__MaxFunction__Group__0 : rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1 ;
    public final void rule__MaxFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5000:1: ( rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1 )
            // InternalMyDsl.g:5001:2: rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__MaxFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__1();

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
    // $ANTLR end "rule__MaxFunction__Group__0"


    // $ANTLR start "rule__MaxFunction__Group__0__Impl"
    // InternalMyDsl.g:5008:1: rule__MaxFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__MaxFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5012:1: ( ( 'SELECT' ) )
            // InternalMyDsl.g:5013:1: ( 'SELECT' )
            {
            // InternalMyDsl.g:5013:1: ( 'SELECT' )
            // InternalMyDsl.g:5014:2: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getSELECTKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getSELECTKeyword_0()); 
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
    // $ANTLR end "rule__MaxFunction__Group__0__Impl"


    // $ANTLR start "rule__MaxFunction__Group__1"
    // InternalMyDsl.g:5023:1: rule__MaxFunction__Group__1 : rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2 ;
    public final void rule__MaxFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5027:1: ( rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2 )
            // InternalMyDsl.g:5028:2: rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MaxFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__2();

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
    // $ANTLR end "rule__MaxFunction__Group__1"


    // $ANTLR start "rule__MaxFunction__Group__1__Impl"
    // InternalMyDsl.g:5035:1: rule__MaxFunction__Group__1__Impl : ( 'MAX' ) ;
    public final void rule__MaxFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5039:1: ( ( 'MAX' ) )
            // InternalMyDsl.g:5040:1: ( 'MAX' )
            {
            // InternalMyDsl.g:5040:1: ( 'MAX' )
            // InternalMyDsl.g:5041:2: 'MAX'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getMAXKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getMAXKeyword_1()); 
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
    // $ANTLR end "rule__MaxFunction__Group__1__Impl"


    // $ANTLR start "rule__MaxFunction__Group__2"
    // InternalMyDsl.g:5050:1: rule__MaxFunction__Group__2 : rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3 ;
    public final void rule__MaxFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5054:1: ( rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3 )
            // InternalMyDsl.g:5055:2: rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MaxFunction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__3();

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
    // $ANTLR end "rule__MaxFunction__Group__2"


    // $ANTLR start "rule__MaxFunction__Group__2__Impl"
    // InternalMyDsl.g:5062:1: rule__MaxFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__MaxFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5066:1: ( ( '(' ) )
            // InternalMyDsl.g:5067:1: ( '(' )
            {
            // InternalMyDsl.g:5067:1: ( '(' )
            // InternalMyDsl.g:5068:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__MaxFunction__Group__2__Impl"


    // $ANTLR start "rule__MaxFunction__Group__3"
    // InternalMyDsl.g:5077:1: rule__MaxFunction__Group__3 : rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4 ;
    public final void rule__MaxFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5081:1: ( rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4 )
            // InternalMyDsl.g:5082:2: rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__MaxFunction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__4();

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
    // $ANTLR end "rule__MaxFunction__Group__3"


    // $ANTLR start "rule__MaxFunction__Group__3__Impl"
    // InternalMyDsl.g:5089:1: rule__MaxFunction__Group__3__Impl : ( ( rule__MaxFunction__ColumnAssignment_3 ) ) ;
    public final void rule__MaxFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5093:1: ( ( ( rule__MaxFunction__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:5094:1: ( ( rule__MaxFunction__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:5094:1: ( ( rule__MaxFunction__ColumnAssignment_3 ) )
            // InternalMyDsl.g:5095:2: ( rule__MaxFunction__ColumnAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getColumnAssignment_3()); 
            }
            // InternalMyDsl.g:5096:2: ( rule__MaxFunction__ColumnAssignment_3 )
            // InternalMyDsl.g:5096:3: rule__MaxFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MaxFunction__ColumnAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getColumnAssignment_3()); 
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
    // $ANTLR end "rule__MaxFunction__Group__3__Impl"


    // $ANTLR start "rule__MaxFunction__Group__4"
    // InternalMyDsl.g:5104:1: rule__MaxFunction__Group__4 : rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5 ;
    public final void rule__MaxFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5108:1: ( rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5 )
            // InternalMyDsl.g:5109:2: rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MaxFunction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__5();

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
    // $ANTLR end "rule__MaxFunction__Group__4"


    // $ANTLR start "rule__MaxFunction__Group__4__Impl"
    // InternalMyDsl.g:5116:1: rule__MaxFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__MaxFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5120:1: ( ( ')' ) )
            // InternalMyDsl.g:5121:1: ( ')' )
            {
            // InternalMyDsl.g:5121:1: ( ')' )
            // InternalMyDsl.g:5122:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__MaxFunction__Group__4__Impl"


    // $ANTLR start "rule__MaxFunction__Group__5"
    // InternalMyDsl.g:5131:1: rule__MaxFunction__Group__5 : rule__MaxFunction__Group__5__Impl ;
    public final void rule__MaxFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5135:1: ( rule__MaxFunction__Group__5__Impl )
            // InternalMyDsl.g:5136:2: rule__MaxFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__5__Impl();

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
    // $ANTLR end "rule__MaxFunction__Group__5"


    // $ANTLR start "rule__MaxFunction__Group__5__Impl"
    // InternalMyDsl.g:5142:1: rule__MaxFunction__Group__5__Impl : ( ( rule__MaxFunction__XAssignment_5 ) ) ;
    public final void rule__MaxFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5146:1: ( ( ( rule__MaxFunction__XAssignment_5 ) ) )
            // InternalMyDsl.g:5147:1: ( ( rule__MaxFunction__XAssignment_5 ) )
            {
            // InternalMyDsl.g:5147:1: ( ( rule__MaxFunction__XAssignment_5 ) )
            // InternalMyDsl.g:5148:2: ( rule__MaxFunction__XAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getXAssignment_5()); 
            }
            // InternalMyDsl.g:5149:2: ( rule__MaxFunction__XAssignment_5 )
            // InternalMyDsl.g:5149:3: rule__MaxFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MaxFunction__XAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getXAssignment_5()); 
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
    // $ANTLR end "rule__MaxFunction__Group__5__Impl"


    // $ANTLR start "rule__INSERT__Group__0"
    // InternalMyDsl.g:5158:1: rule__INSERT__Group__0 : rule__INSERT__Group__0__Impl rule__INSERT__Group__1 ;
    public final void rule__INSERT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5162:1: ( rule__INSERT__Group__0__Impl rule__INSERT__Group__1 )
            // InternalMyDsl.g:5163:2: rule__INSERT__Group__0__Impl rule__INSERT__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__INSERT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__1();

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
    // $ANTLR end "rule__INSERT__Group__0"


    // $ANTLR start "rule__INSERT__Group__0__Impl"
    // InternalMyDsl.g:5170:1: rule__INSERT__Group__0__Impl : ( 'INSERT' ) ;
    public final void rule__INSERT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5174:1: ( ( 'INSERT' ) )
            // InternalMyDsl.g:5175:1: ( 'INSERT' )
            {
            // InternalMyDsl.g:5175:1: ( 'INSERT' )
            // InternalMyDsl.g:5176:2: 'INSERT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getINSERTKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getINSERTKeyword_0()); 
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
    // $ANTLR end "rule__INSERT__Group__0__Impl"


    // $ANTLR start "rule__INSERT__Group__1"
    // InternalMyDsl.g:5185:1: rule__INSERT__Group__1 : rule__INSERT__Group__1__Impl rule__INSERT__Group__2 ;
    public final void rule__INSERT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5189:1: ( rule__INSERT__Group__1__Impl rule__INSERT__Group__2 )
            // InternalMyDsl.g:5190:2: rule__INSERT__Group__1__Impl rule__INSERT__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__INSERT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__2();

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
    // $ANTLR end "rule__INSERT__Group__1"


    // $ANTLR start "rule__INSERT__Group__1__Impl"
    // InternalMyDsl.g:5197:1: rule__INSERT__Group__1__Impl : ( 'INTO' ) ;
    public final void rule__INSERT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5201:1: ( ( 'INTO' ) )
            // InternalMyDsl.g:5202:1: ( 'INTO' )
            {
            // InternalMyDsl.g:5202:1: ( 'INTO' )
            // InternalMyDsl.g:5203:2: 'INTO'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getINTOKeyword_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getINTOKeyword_1()); 
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
    // $ANTLR end "rule__INSERT__Group__1__Impl"


    // $ANTLR start "rule__INSERT__Group__2"
    // InternalMyDsl.g:5212:1: rule__INSERT__Group__2 : rule__INSERT__Group__2__Impl rule__INSERT__Group__3 ;
    public final void rule__INSERT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5216:1: ( rule__INSERT__Group__2__Impl rule__INSERT__Group__3 )
            // InternalMyDsl.g:5217:2: rule__INSERT__Group__2__Impl rule__INSERT__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__INSERT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__3();

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
    // $ANTLR end "rule__INSERT__Group__2"


    // $ANTLR start "rule__INSERT__Group__2__Impl"
    // InternalMyDsl.g:5224:1: rule__INSERT__Group__2__Impl : ( ( rule__INSERT__NameTAssignment_2 ) ) ;
    public final void rule__INSERT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5228:1: ( ( ( rule__INSERT__NameTAssignment_2 ) ) )
            // InternalMyDsl.g:5229:1: ( ( rule__INSERT__NameTAssignment_2 ) )
            {
            // InternalMyDsl.g:5229:1: ( ( rule__INSERT__NameTAssignment_2 ) )
            // InternalMyDsl.g:5230:2: ( rule__INSERT__NameTAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getNameTAssignment_2()); 
            }
            // InternalMyDsl.g:5231:2: ( rule__INSERT__NameTAssignment_2 )
            // InternalMyDsl.g:5231:3: rule__INSERT__NameTAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__INSERT__NameTAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getNameTAssignment_2()); 
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
    // $ANTLR end "rule__INSERT__Group__2__Impl"


    // $ANTLR start "rule__INSERT__Group__3"
    // InternalMyDsl.g:5239:1: rule__INSERT__Group__3 : rule__INSERT__Group__3__Impl rule__INSERT__Group__4 ;
    public final void rule__INSERT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5243:1: ( rule__INSERT__Group__3__Impl rule__INSERT__Group__4 )
            // InternalMyDsl.g:5244:2: rule__INSERT__Group__3__Impl rule__INSERT__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__INSERT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__4();

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
    // $ANTLR end "rule__INSERT__Group__3"


    // $ANTLR start "rule__INSERT__Group__3__Impl"
    // InternalMyDsl.g:5251:1: rule__INSERT__Group__3__Impl : ( 'VALUES' ) ;
    public final void rule__INSERT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5255:1: ( ( 'VALUES' ) )
            // InternalMyDsl.g:5256:1: ( 'VALUES' )
            {
            // InternalMyDsl.g:5256:1: ( 'VALUES' )
            // InternalMyDsl.g:5257:2: 'VALUES'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getVALUESKeyword_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getVALUESKeyword_3()); 
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
    // $ANTLR end "rule__INSERT__Group__3__Impl"


    // $ANTLR start "rule__INSERT__Group__4"
    // InternalMyDsl.g:5266:1: rule__INSERT__Group__4 : rule__INSERT__Group__4__Impl rule__INSERT__Group__5 ;
    public final void rule__INSERT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5270:1: ( rule__INSERT__Group__4__Impl rule__INSERT__Group__5 )
            // InternalMyDsl.g:5271:2: rule__INSERT__Group__4__Impl rule__INSERT__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__INSERT__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__5();

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
    // $ANTLR end "rule__INSERT__Group__4"


    // $ANTLR start "rule__INSERT__Group__4__Impl"
    // InternalMyDsl.g:5278:1: rule__INSERT__Group__4__Impl : ( '(' ) ;
    public final void rule__INSERT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5282:1: ( ( '(' ) )
            // InternalMyDsl.g:5283:1: ( '(' )
            {
            // InternalMyDsl.g:5283:1: ( '(' )
            // InternalMyDsl.g:5284:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getLeftParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__INSERT__Group__4__Impl"


    // $ANTLR start "rule__INSERT__Group__5"
    // InternalMyDsl.g:5293:1: rule__INSERT__Group__5 : rule__INSERT__Group__5__Impl rule__INSERT__Group__6 ;
    public final void rule__INSERT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5297:1: ( rule__INSERT__Group__5__Impl rule__INSERT__Group__6 )
            // InternalMyDsl.g:5298:2: rule__INSERT__Group__5__Impl rule__INSERT__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__INSERT__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__6();

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
    // $ANTLR end "rule__INSERT__Group__5"


    // $ANTLR start "rule__INSERT__Group__5__Impl"
    // InternalMyDsl.g:5305:1: rule__INSERT__Group__5__Impl : ( ( rule__INSERT__LiteralsAssignment_5 )* ) ;
    public final void rule__INSERT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5309:1: ( ( ( rule__INSERT__LiteralsAssignment_5 )* ) )
            // InternalMyDsl.g:5310:1: ( ( rule__INSERT__LiteralsAssignment_5 )* )
            {
            // InternalMyDsl.g:5310:1: ( ( rule__INSERT__LiteralsAssignment_5 )* )
            // InternalMyDsl.g:5311:2: ( rule__INSERT__LiteralsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getLiteralsAssignment_5()); 
            }
            // InternalMyDsl.g:5312:2: ( rule__INSERT__LiteralsAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=22 && LA31_0<=28)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:5312:3: rule__INSERT__LiteralsAssignment_5
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__INSERT__LiteralsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getLiteralsAssignment_5()); 
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
    // $ANTLR end "rule__INSERT__Group__5__Impl"


    // $ANTLR start "rule__INSERT__Group__6"
    // InternalMyDsl.g:5320:1: rule__INSERT__Group__6 : rule__INSERT__Group__6__Impl ;
    public final void rule__INSERT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5324:1: ( rule__INSERT__Group__6__Impl )
            // InternalMyDsl.g:5325:2: rule__INSERT__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__6__Impl();

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
    // $ANTLR end "rule__INSERT__Group__6"


    // $ANTLR start "rule__INSERT__Group__6__Impl"
    // InternalMyDsl.g:5331:1: rule__INSERT__Group__6__Impl : ( ')' ) ;
    public final void rule__INSERT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5335:1: ( ( ')' ) )
            // InternalMyDsl.g:5336:1: ( ')' )
            {
            // InternalMyDsl.g:5336:1: ( ')' )
            // InternalMyDsl.g:5337:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getRightParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__INSERT__Group__6__Impl"


    // $ANTLR start "rule__Model__ElementAssignment"
    // InternalMyDsl.g:5347:1: rule__Model__ElementAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5351:1: ( ( ruleElement ) )
            // InternalMyDsl.g:5352:2: ( ruleElement )
            {
            // InternalMyDsl.g:5352:2: ( ruleElement )
            // InternalMyDsl.g:5353:3: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementElementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementElementParserRuleCall_0()); 
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
    // $ANTLR end "rule__Model__ElementAssignment"


    // $ANTLR start "rule__SELECT__ColumnAssignment_1_1_0"
    // InternalMyDsl.g:5362:1: rule__SELECT__ColumnAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__SELECT__ColumnAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5366:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5367:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5367:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5368:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getColumnCDCrossReference_1_1_0_0()); 
            }
            // InternalMyDsl.g:5369:3: ( RULE_ID )
            // InternalMyDsl.g:5370:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getColumnCDIDTerminalRuleCall_1_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getColumnCDIDTerminalRuleCall_1_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getColumnCDCrossReference_1_1_0_0()); 
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
    // $ANTLR end "rule__SELECT__ColumnAssignment_1_1_0"


    // $ANTLR start "rule__SELECT__ColumnAssignment_1_1_1_1"
    // InternalMyDsl.g:5381:1: rule__SELECT__ColumnAssignment_1_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SELECT__ColumnAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5385:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5386:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5386:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5387:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getColumnCDCrossReference_1_1_1_1_0()); 
            }
            // InternalMyDsl.g:5388:3: ( RULE_ID )
            // InternalMyDsl.g:5389:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getColumnCDIDTerminalRuleCall_1_1_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getColumnCDIDTerminalRuleCall_1_1_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getColumnCDCrossReference_1_1_1_1_0()); 
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
    // $ANTLR end "rule__SELECT__ColumnAssignment_1_1_1_1"


    // $ANTLR start "rule__SELECT__XAssignment_2"
    // InternalMyDsl.g:5400:1: rule__SELECT__XAssignment_2 : ( ruleFromAndWhereClauses ) ;
    public final void rule__SELECT__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5404:1: ( ( ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:5405:2: ( ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:5405:2: ( ruleFromAndWhereClauses )
            // InternalMyDsl.g:5406:3: ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSELECTAccess().getXFromAndWhereClausesParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSELECTAccess().getXFromAndWhereClausesParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SELECT__XAssignment_2"


    // $ANTLR start "rule__FromAndWhereClauses__TableAssignment_1"
    // InternalMyDsl.g:5415:1: rule__FromAndWhereClauses__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FromAndWhereClauses__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5419:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5420:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5420:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5421:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameCrossReference_1_0()); 
            }
            // InternalMyDsl.g:5422:3: ( RULE_ID )
            // InternalMyDsl.g:5423:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameCrossReference_1_0()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__TableAssignment_1"


    // $ANTLR start "rule__FromAndWhereClauses__ZAssignment_2_1"
    // InternalMyDsl.g:5434:1: rule__FromAndWhereClauses__ZAssignment_2_1 : ( ruleWHERE ) ;
    public final void rule__FromAndWhereClauses__ZAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5438:1: ( ( ruleWHERE ) )
            // InternalMyDsl.g:5439:2: ( ruleWHERE )
            {
            // InternalMyDsl.g:5439:2: ( ruleWHERE )
            // InternalMyDsl.g:5440:3: ruleWHERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getZWHEREParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWHERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getZWHEREParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__ZAssignment_2_1"


    // $ANTLR start "rule__FromAndWhereClauses__ZAssignment_2_2_1"
    // InternalMyDsl.g:5449:1: rule__FromAndWhereClauses__ZAssignment_2_2_1 : ( ruleWHERE ) ;
    public final void rule__FromAndWhereClauses__ZAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5453:1: ( ( ruleWHERE ) )
            // InternalMyDsl.g:5454:2: ( ruleWHERE )
            {
            // InternalMyDsl.g:5454:2: ( ruleWHERE )
            // InternalMyDsl.g:5455:3: ruleWHERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFromAndWhereClausesAccess().getZWHEREParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWHERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFromAndWhereClausesAccess().getZWHEREParserRuleCall_2_2_1_0()); 
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
    // $ANTLR end "rule__FromAndWhereClauses__ZAssignment_2_2_1"


    // $ANTLR start "rule__WHERE__ColumnAssignment_0"
    // InternalMyDsl.g:5464:1: rule__WHERE__ColumnAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WHERE__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5468:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5469:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5469:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5470:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHEREAccess().getColumnCDCrossReference_0_0()); 
            }
            // InternalMyDsl.g:5471:3: ( RULE_ID )
            // InternalMyDsl.g:5472:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHEREAccess().getColumnCDIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHEREAccess().getColumnCDIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHEREAccess().getColumnCDCrossReference_0_0()); 
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
    // $ANTLR end "rule__WHERE__ColumnAssignment_0"


    // $ANTLR start "rule__WHERE__SignAssignment_1"
    // InternalMyDsl.g:5483:1: rule__WHERE__SignAssignment_1 : ( ( rule__WHERE__SignAlternatives_1_0 ) ) ;
    public final void rule__WHERE__SignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5487:1: ( ( ( rule__WHERE__SignAlternatives_1_0 ) ) )
            // InternalMyDsl.g:5488:2: ( ( rule__WHERE__SignAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:5488:2: ( ( rule__WHERE__SignAlternatives_1_0 ) )
            // InternalMyDsl.g:5489:3: ( rule__WHERE__SignAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHEREAccess().getSignAlternatives_1_0()); 
            }
            // InternalMyDsl.g:5490:3: ( rule__WHERE__SignAlternatives_1_0 )
            // InternalMyDsl.g:5490:4: rule__WHERE__SignAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__SignAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHEREAccess().getSignAlternatives_1_0()); 
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
    // $ANTLR end "rule__WHERE__SignAssignment_1"


    // $ANTLR start "rule__WHERE__OperAssignment_2"
    // InternalMyDsl.g:5498:1: rule__WHERE__OperAssignment_2 : ( ( rule__WHERE__OperAlternatives_2_0 ) ) ;
    public final void rule__WHERE__OperAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5502:1: ( ( ( rule__WHERE__OperAlternatives_2_0 ) ) )
            // InternalMyDsl.g:5503:2: ( ( rule__WHERE__OperAlternatives_2_0 ) )
            {
            // InternalMyDsl.g:5503:2: ( ( rule__WHERE__OperAlternatives_2_0 ) )
            // InternalMyDsl.g:5504:3: ( rule__WHERE__OperAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWHEREAccess().getOperAlternatives_2_0()); 
            }
            // InternalMyDsl.g:5505:3: ( rule__WHERE__OperAlternatives_2_0 )
            // InternalMyDsl.g:5505:4: rule__WHERE__OperAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__OperAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWHEREAccess().getOperAlternatives_2_0()); 
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
    // $ANTLR end "rule__WHERE__OperAssignment_2"


    // $ANTLR start "rule__Oper1__NameAssignment_1"
    // InternalMyDsl.g:5513:1: rule__Oper1__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oper1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5517:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5518:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5518:2: ( RULE_ID )
            // InternalMyDsl.g:5519:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper1Access().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper1Access().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Oper1__NameAssignment_1"


    // $ANTLR start "rule__Oper2__ColumnAssignment"
    // InternalMyDsl.g:5528:1: rule__Oper2__ColumnAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Oper2__ColumnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5532:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5533:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5533:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5534:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper2Access().getColumnCDCrossReference_0()); 
            }
            // InternalMyDsl.g:5535:3: ( RULE_ID )
            // InternalMyDsl.g:5536:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper2Access().getColumnCDIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper2Access().getColumnCDIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper2Access().getColumnCDCrossReference_0()); 
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
    // $ANTLR end "rule__Oper2__ColumnAssignment"


    // $ANTLR start "rule__Oper3__ValAssignment"
    // InternalMyDsl.g:5547:1: rule__Oper3__ValAssignment : ( RULE_INT ) ;
    public final void rule__Oper3__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5551:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5552:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5552:2: ( RULE_INT )
            // InternalMyDsl.g:5553:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOper3Access().getValINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOper3Access().getValINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Oper3__ValAssignment"


    // $ANTLR start "rule__DATABASE__NameAssignment_2"
    // InternalMyDsl.g:5562:1: rule__DATABASE__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DATABASE__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5566:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5567:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5567:2: ( RULE_ID )
            // InternalMyDsl.g:5568:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDATABASEAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDATABASEAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__DATABASE__NameAssignment_2"


    // $ANTLR start "rule__CREATE__TablesAssignment"
    // InternalMyDsl.g:5577:1: rule__CREATE__TablesAssignment : ( ruleTABLE ) ;
    public final void rule__CREATE__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5581:1: ( ( ruleTABLE ) )
            // InternalMyDsl.g:5582:2: ( ruleTABLE )
            {
            // InternalMyDsl.g:5582:2: ( ruleTABLE )
            // InternalMyDsl.g:5583:3: ruleTABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCREATEAccess().getTablesTABLEParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTABLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCREATEAccess().getTablesTABLEParserRuleCall_0()); 
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
    // $ANTLR end "rule__CREATE__TablesAssignment"


    // $ANTLR start "rule__TABLE__TableAssignment_2"
    // InternalMyDsl.g:5592:1: rule__TABLE__TableAssignment_2 : ( ruletableName ) ;
    public final void rule__TABLE__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5596:1: ( ( ruletableName ) )
            // InternalMyDsl.g:5597:2: ( ruletableName )
            {
            // InternalMyDsl.g:5597:2: ( ruletableName )
            // InternalMyDsl.g:5598:3: ruletableName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getTableTableNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletableName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getTableTableNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TABLE__TableAssignment_2"


    // $ANTLR start "rule__TABLE__AttributesAssignment_4"
    // InternalMyDsl.g:5607:1: rule__TABLE__AttributesAssignment_4 : ( ( rule__TABLE__AttributesAlternatives_4_0 ) ) ;
    public final void rule__TABLE__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5611:1: ( ( ( rule__TABLE__AttributesAlternatives_4_0 ) ) )
            // InternalMyDsl.g:5612:2: ( ( rule__TABLE__AttributesAlternatives_4_0 ) )
            {
            // InternalMyDsl.g:5612:2: ( ( rule__TABLE__AttributesAlternatives_4_0 ) )
            // InternalMyDsl.g:5613:3: ( rule__TABLE__AttributesAlternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getAttributesAlternatives_4_0()); 
            }
            // InternalMyDsl.g:5614:3: ( rule__TABLE__AttributesAlternatives_4_0 )
            // InternalMyDsl.g:5614:4: rule__TABLE__AttributesAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TABLE__AttributesAlternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getAttributesAlternatives_4_0()); 
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
    // $ANTLR end "rule__TABLE__AttributesAssignment_4"


    // $ANTLR start "rule__TABLE__AttributesAssignment_5_1"
    // InternalMyDsl.g:5622:1: rule__TABLE__AttributesAssignment_5_1 : ( ( rule__TABLE__AttributesAlternatives_5_1_0 ) ) ;
    public final void rule__TABLE__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5626:1: ( ( ( rule__TABLE__AttributesAlternatives_5_1_0 ) ) )
            // InternalMyDsl.g:5627:2: ( ( rule__TABLE__AttributesAlternatives_5_1_0 ) )
            {
            // InternalMyDsl.g:5627:2: ( ( rule__TABLE__AttributesAlternatives_5_1_0 ) )
            // InternalMyDsl.g:5628:3: ( rule__TABLE__AttributesAlternatives_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTABLEAccess().getAttributesAlternatives_5_1_0()); 
            }
            // InternalMyDsl.g:5629:3: ( rule__TABLE__AttributesAlternatives_5_1_0 )
            // InternalMyDsl.g:5629:4: rule__TABLE__AttributesAlternatives_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TABLE__AttributesAlternatives_5_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTABLEAccess().getAttributesAlternatives_5_1_0()); 
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
    // $ANTLR end "rule__TABLE__AttributesAssignment_5_1"


    // $ANTLR start "rule__TableName__NameAssignment"
    // InternalMyDsl.g:5637:1: rule__TableName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TableName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5641:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5642:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5642:2: ( RULE_ID )
            // InternalMyDsl.g:5643:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__TableName__NameAssignment"


    // $ANTLR start "rule__ColumnDeclaration__NameAssignment_0"
    // InternalMyDsl.g:5652:1: rule__ColumnDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColumnDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5656:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5657:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5657:2: ( RULE_ID )
            // InternalMyDsl.g:5658:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__ColumnDeclaration__NameAssignment_0"


    // $ANTLR start "rule__ColumnDeclaration__TypeAssignment_1"
    // InternalMyDsl.g:5667:1: rule__ColumnDeclaration__TypeAssignment_1 : ( ruleDATATYPE ) ;
    public final void rule__ColumnDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5671:1: ( ( ruleDATATYPE ) )
            // InternalMyDsl.g:5672:2: ( ruleDATATYPE )
            {
            // InternalMyDsl.g:5672:2: ( ruleDATATYPE )
            // InternalMyDsl.g:5673:3: ruleDATATYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnDeclarationAccess().getTypeDATATYPEEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDATATYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnDeclarationAccess().getTypeDATATYPEEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__ColumnDeclaration__TypeAssignment_1"


    // $ANTLR start "rule__ColumnDeclaration__NotNullAssignment_2"
    // InternalMyDsl.g:5682:1: rule__ColumnDeclaration__NotNullAssignment_2 : ( RULE_NOTNULL ) ;
    public final void rule__ColumnDeclaration__NotNullAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5686:1: ( ( RULE_NOTNULL ) )
            // InternalMyDsl.g:5687:2: ( RULE_NOTNULL )
            {
            // InternalMyDsl.g:5687:2: ( RULE_NOTNULL )
            // InternalMyDsl.g:5688:3: RULE_NOTNULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NOTNULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__ColumnDeclaration__NotNullAssignment_2"


    // $ANTLR start "rule__PrimaryKey__ColumnAsPKAssignment_3"
    // InternalMyDsl.g:5697:1: rule__PrimaryKey__ColumnAsPKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5701:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5702:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5702:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5703:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0()); 
            }
            // InternalMyDsl.g:5704:3: ( RULE_ID )
            // InternalMyDsl.g:5705:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0()); 
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
    // $ANTLR end "rule__PrimaryKey__ColumnAsPKAssignment_3"


    // $ANTLR start "rule__PrimaryKey__ColumnAsPKAssignment_4_1"
    // InternalMyDsl.g:5716:1: rule__PrimaryKey__ColumnAsPKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5720:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5721:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5721:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5722:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0()); 
            }
            // InternalMyDsl.g:5723:3: ( RULE_ID )
            // InternalMyDsl.g:5724:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__PrimaryKey__ColumnAsPKAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__ColumnAsFKAssignment_3"
    // InternalMyDsl.g:5735:1: rule__ForeignKey__ColumnAsFKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5739:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5740:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5740:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5741:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0()); 
            }
            // InternalMyDsl.g:5742:3: ( RULE_ID )
            // InternalMyDsl.g:5743:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getColumnAsFKCDIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0()); 
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
    // $ANTLR end "rule__ForeignKey__ColumnAsFKAssignment_3"


    // $ANTLR start "rule__ForeignKey__ColumnAsFKAssignment_4_1"
    // InternalMyDsl.g:5754:1: rule__ForeignKey__ColumnAsFKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5758:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5759:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5759:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5760:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0()); 
            }
            // InternalMyDsl.g:5761:3: ( RULE_ID )
            // InternalMyDsl.g:5762:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getColumnAsFKCDIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__ForeignKey__ColumnAsFKAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__ForeignTableAssignment_7"
    // InternalMyDsl.g:5773:1: rule__ForeignKey__ForeignTableAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignTableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5777:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5778:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5778:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5779:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignTableTABLECrossReference_7_0()); 
            }
            // InternalMyDsl.g:5780:3: ( RULE_ID )
            // InternalMyDsl.g:5781:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignTableTABLEIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignTableTABLEIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignTableTABLECrossReference_7_0()); 
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
    // $ANTLR end "rule__ForeignKey__ForeignTableAssignment_7"


    // $ANTLR start "rule__ForeignKey__ForeignColumnsAssignment_9"
    // InternalMyDsl.g:5792:1: rule__ForeignKey__ForeignColumnsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5796:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5797:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5797:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5798:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0()); 
            }
            // InternalMyDsl.g:5799:3: ( RULE_ID )
            // InternalMyDsl.g:5800:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDIDTerminalRuleCall_9_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignColumnsCDIDTerminalRuleCall_9_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0()); 
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
    // $ANTLR end "rule__ForeignKey__ForeignColumnsAssignment_9"


    // $ANTLR start "rule__ForeignKey__ForeignColumnsAssignment_10_1"
    // InternalMyDsl.g:5811:1: rule__ForeignKey__ForeignColumnsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5815:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5816:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5816:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5817:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0()); 
            }
            // InternalMyDsl.g:5818:3: ( RULE_ID )
            // InternalMyDsl.g:5819:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDIDTerminalRuleCall_10_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignColumnsCDIDTerminalRuleCall_10_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0()); 
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
    // $ANTLR end "rule__ForeignKey__ForeignColumnsAssignment_10_1"


    // $ANTLR start "rule__DROPTABLE__TableAssignment_2"
    // InternalMyDsl.g:5830:1: rule__DROPTABLE__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DROPTABLE__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5834:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5835:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5835:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5836:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getTableTableNameCrossReference_2_0()); 
            }
            // InternalMyDsl.g:5837:3: ( RULE_ID )
            // InternalMyDsl.g:5838:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getTableTableNameCrossReference_2_0()); 
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
    // $ANTLR end "rule__DROPTABLE__TableAssignment_2"


    // $ANTLR start "rule__DROPTABLE__TableAssignment_3_1"
    // InternalMyDsl.g:5849:1: rule__DROPTABLE__TableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DROPTABLE__TableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5853:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5854:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5854:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5855:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getTableTableNameCrossReference_3_1_0()); 
            }
            // InternalMyDsl.g:5856:3: ( RULE_ID )
            // InternalMyDsl.g:5857:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDROPTABLEAccess().getTableTableNameIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getTableTableNameIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDROPTABLEAccess().getTableTableNameCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__DROPTABLE__TableAssignment_3_1"


    // $ANTLR start "rule__TRUNCATE__TableAssignment_2"
    // InternalMyDsl.g:5868:1: rule__TRUNCATE__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TRUNCATE__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5872:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5873:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5873:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5874:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getTableTableNameCrossReference_2_0()); 
            }
            // InternalMyDsl.g:5875:3: ( RULE_ID )
            // InternalMyDsl.g:5876:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getTableTableNameCrossReference_2_0()); 
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
    // $ANTLR end "rule__TRUNCATE__TableAssignment_2"


    // $ANTLR start "rule__TRUNCATE__TableAssignment_3_1"
    // InternalMyDsl.g:5887:1: rule__TRUNCATE__TableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__TRUNCATE__TableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5891:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5892:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5892:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5893:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getTableTableNameCrossReference_3_1_0()); 
            }
            // InternalMyDsl.g:5894:3: ( RULE_ID )
            // InternalMyDsl.g:5895:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRUNCATEAccess().getTableTableNameIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getTableTableNameIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRUNCATEAccess().getTableTableNameCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__TRUNCATE__TableAssignment_3_1"


    // $ANTLR start "rule__DELETE__XAssignment_1"
    // InternalMyDsl.g:5906:1: rule__DELETE__XAssignment_1 : ( ruleFromAndWhereClauses ) ;
    public final void rule__DELETE__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5910:1: ( ( ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:5911:2: ( ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:5911:2: ( ruleFromAndWhereClauses )
            // InternalMyDsl.g:5912:3: ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDELETEAccess().getXFromAndWhereClausesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDELETEAccess().getXFromAndWhereClausesParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__DELETE__XAssignment_1"


    // $ANTLR start "rule__UPDATE__TableAssignment_1"
    // InternalMyDsl.g:5921:1: rule__UPDATE__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UPDATE__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5925:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5926:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5926:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5927:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getTableTableNameCrossReference_1_0()); 
            }
            // InternalMyDsl.g:5928:3: ( RULE_ID )
            // InternalMyDsl.g:5929:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getTableTableNameIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getTableTableNameIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getTableTableNameCrossReference_1_0()); 
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
    // $ANTLR end "rule__UPDATE__TableAssignment_1"


    // $ANTLR start "rule__UPDATE__ScAssignment_3"
    // InternalMyDsl.g:5940:1: rule__UPDATE__ScAssignment_3 : ( ruleSetClause ) ;
    public final void rule__UPDATE__ScAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5944:1: ( ( ruleSetClause ) )
            // InternalMyDsl.g:5945:2: ( ruleSetClause )
            {
            // InternalMyDsl.g:5945:2: ( ruleSetClause )
            // InternalMyDsl.g:5946:3: ruleSetClause
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getScSetClauseParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetClause();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getScSetClauseParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__UPDATE__ScAssignment_3"


    // $ANTLR start "rule__UPDATE__ScAssignment_4_1"
    // InternalMyDsl.g:5955:1: rule__UPDATE__ScAssignment_4_1 : ( ruleSetClause ) ;
    public final void rule__UPDATE__ScAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5959:1: ( ( ruleSetClause ) )
            // InternalMyDsl.g:5960:2: ( ruleSetClause )
            {
            // InternalMyDsl.g:5960:2: ( ruleSetClause )
            // InternalMyDsl.g:5961:3: ruleSetClause
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getScSetClauseParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSetClause();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getScSetClauseParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__UPDATE__ScAssignment_4_1"


    // $ANTLR start "rule__UPDATE__ZAssignment_5_1"
    // InternalMyDsl.g:5970:1: rule__UPDATE__ZAssignment_5_1 : ( ruleWHERE ) ;
    public final void rule__UPDATE__ZAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5974:1: ( ( ruleWHERE ) )
            // InternalMyDsl.g:5975:2: ( ruleWHERE )
            {
            // InternalMyDsl.g:5975:2: ( ruleWHERE )
            // InternalMyDsl.g:5976:3: ruleWHERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getZWHEREParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWHERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getZWHEREParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__UPDATE__ZAssignment_5_1"


    // $ANTLR start "rule__UPDATE__ZAssignment_5_2_1"
    // InternalMyDsl.g:5985:1: rule__UPDATE__ZAssignment_5_2_1 : ( ruleWHERE ) ;
    public final void rule__UPDATE__ZAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5989:1: ( ( ruleWHERE ) )
            // InternalMyDsl.g:5990:2: ( ruleWHERE )
            {
            // InternalMyDsl.g:5990:2: ( ruleWHERE )
            // InternalMyDsl.g:5991:3: ruleWHERE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUPDATEAccess().getZWHEREParserRuleCall_5_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWHERE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUPDATEAccess().getZWHEREParserRuleCall_5_2_1_0()); 
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
    // $ANTLR end "rule__UPDATE__ZAssignment_5_2_1"


    // $ANTLR start "rule__SetClause__ColumnAssignment_0"
    // InternalMyDsl.g:6000:1: rule__SetClause__ColumnAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SetClause__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6004:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6005:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6005:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6006:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getColumnCDCrossReference_0_0()); 
            }
            // InternalMyDsl.g:6007:3: ( RULE_ID )
            // InternalMyDsl.g:6008:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getColumnCDIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getColumnCDIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getColumnCDCrossReference_0_0()); 
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
    // $ANTLR end "rule__SetClause__ColumnAssignment_0"


    // $ANTLR start "rule__SetClause__NameAssignment_2_0_1"
    // InternalMyDsl.g:6019:1: rule__SetClause__NameAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__SetClause__NameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6023:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6024:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6024:2: ( RULE_ID )
            // InternalMyDsl.g:6025:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getNameIDTerminalRuleCall_2_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getNameIDTerminalRuleCall_2_0_1_0()); 
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
    // $ANTLR end "rule__SetClause__NameAssignment_2_0_1"


    // $ANTLR start "rule__SetClause__ValAssignment_2_1"
    // InternalMyDsl.g:6034:1: rule__SetClause__ValAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SetClause__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6038:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6039:2: ( RULE_INT )
            {
            // InternalMyDsl.g:6039:2: ( RULE_INT )
            // InternalMyDsl.g:6040:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetClauseAccess().getValINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetClauseAccess().getValINTTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__SetClause__ValAssignment_2_1"


    // $ANTLR start "rule__ALTER__TableAssignment_2"
    // InternalMyDsl.g:6049:1: rule__ALTER__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ALTER__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6053:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6054:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6054:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6055:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERAccess().getTableTableNameCrossReference_2_0()); 
            }
            // InternalMyDsl.g:6056:3: ( RULE_ID )
            // InternalMyDsl.g:6057:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERAccess().getTableTableNameCrossReference_2_0()); 
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
    // $ANTLR end "rule__ALTER__TableAssignment_2"


    // $ANTLR start "rule__ALTER__AddDropUpdateAssignment_3"
    // InternalMyDsl.g:6068:1: rule__ALTER__AddDropUpdateAssignment_3 : ( ( rule__ALTER__AddDropUpdateAlternatives_3_0 ) ) ;
    public final void rule__ALTER__AddDropUpdateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6072:1: ( ( ( rule__ALTER__AddDropUpdateAlternatives_3_0 ) ) )
            // InternalMyDsl.g:6073:2: ( ( rule__ALTER__AddDropUpdateAlternatives_3_0 ) )
            {
            // InternalMyDsl.g:6073:2: ( ( rule__ALTER__AddDropUpdateAlternatives_3_0 ) )
            // InternalMyDsl.g:6074:3: ( rule__ALTER__AddDropUpdateAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERAccess().getAddDropUpdateAlternatives_3_0()); 
            }
            // InternalMyDsl.g:6075:3: ( rule__ALTER__AddDropUpdateAlternatives_3_0 )
            // InternalMyDsl.g:6075:4: rule__ALTER__AddDropUpdateAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ALTER__AddDropUpdateAlternatives_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERAccess().getAddDropUpdateAlternatives_3_0()); 
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
    // $ANTLR end "rule__ALTER__AddDropUpdateAssignment_3"


    // $ANTLR start "rule__ALTERDROP__ColumnAssignment_2"
    // InternalMyDsl.g:6083:1: rule__ALTERDROP__ColumnAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ALTERDROP__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6087:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6088:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6088:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6089:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERDROPAccess().getColumnCDCrossReference_2_0()); 
            }
            // InternalMyDsl.g:6090:3: ( RULE_ID )
            // InternalMyDsl.g:6091:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERDROPAccess().getColumnCDIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERDROPAccess().getColumnCDIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERDROPAccess().getColumnCDCrossReference_2_0()); 
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
    // $ANTLR end "rule__ALTERDROP__ColumnAssignment_2"


    // $ANTLR start "rule__ALTERADD__ColumnAssignment_1"
    // InternalMyDsl.g:6102:1: rule__ALTERADD__ColumnAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ALTERADD__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6106:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6107:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6107:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6108:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERADDAccess().getColumnCDCrossReference_1_0()); 
            }
            // InternalMyDsl.g:6109:3: ( RULE_ID )
            // InternalMyDsl.g:6110:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERADDAccess().getColumnCDIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERADDAccess().getColumnCDIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERADDAccess().getColumnCDCrossReference_1_0()); 
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
    // $ANTLR end "rule__ALTERADD__ColumnAssignment_1"


    // $ANTLR start "rule__ALTERUPDATE__ColumnAssignment_2"
    // InternalMyDsl.g:6121:1: rule__ALTERUPDATE__ColumnAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ALTERUPDATE__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6125:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6126:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6126:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6127:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERUPDATEAccess().getColumnCDCrossReference_2_0()); 
            }
            // InternalMyDsl.g:6128:3: ( RULE_ID )
            // InternalMyDsl.g:6129:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALTERUPDATEAccess().getColumnCDIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERUPDATEAccess().getColumnCDIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALTERUPDATEAccess().getColumnCDCrossReference_2_0()); 
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
    // $ANTLR end "rule__ALTERUPDATE__ColumnAssignment_2"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalMyDsl.g:6140:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6144:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6145:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6145:2: ( RULE_ID )
            // InternalMyDsl.g:6146:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalMyDsl.g:6155:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6159:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6160:2: ( RULE_INT )
            {
            // InternalMyDsl.g:6160:2: ( RULE_INT )
            // InternalMyDsl.g:6161:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__CountFunction__ColumnAssignment_3"
    // InternalMyDsl.g:6170:1: rule__CountFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CountFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6174:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6175:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6175:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6176:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getColumnCDCrossReference_3_0()); 
            }
            // InternalMyDsl.g:6177:3: ( RULE_ID )
            // InternalMyDsl.g:6178:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getColumnCDCrossReference_3_0()); 
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
    // $ANTLR end "rule__CountFunction__ColumnAssignment_3"


    // $ANTLR start "rule__CountFunction__XAssignment_5"
    // InternalMyDsl.g:6189:1: rule__CountFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__CountFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6193:1: ( ( ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:6194:2: ( ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:6194:2: ( ruleFromAndWhereClauses )
            // InternalMyDsl.g:6195:3: ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCountFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCountFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__CountFunction__XAssignment_5"


    // $ANTLR start "rule__AvgFunction__ColumnAssignment_3"
    // InternalMyDsl.g:6204:1: rule__AvgFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AvgFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6208:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6209:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6209:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6210:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getColumnCDCrossReference_3_0()); 
            }
            // InternalMyDsl.g:6211:3: ( RULE_ID )
            // InternalMyDsl.g:6212:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getColumnCDCrossReference_3_0()); 
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
    // $ANTLR end "rule__AvgFunction__ColumnAssignment_3"


    // $ANTLR start "rule__AvgFunction__XAssignment_5"
    // InternalMyDsl.g:6223:1: rule__AvgFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__AvgFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6227:1: ( ( ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:6228:2: ( ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:6228:2: ( ruleFromAndWhereClauses )
            // InternalMyDsl.g:6229:3: ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAvgFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAvgFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__AvgFunction__XAssignment_5"


    // $ANTLR start "rule__SumFunction__ColumnAssignment_3"
    // InternalMyDsl.g:6238:1: rule__SumFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SumFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6242:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6243:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6243:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6244:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getColumnCDCrossReference_3_0()); 
            }
            // InternalMyDsl.g:6245:3: ( RULE_ID )
            // InternalMyDsl.g:6246:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getColumnCDCrossReference_3_0()); 
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
    // $ANTLR end "rule__SumFunction__ColumnAssignment_3"


    // $ANTLR start "rule__SumFunction__XAssignment_5"
    // InternalMyDsl.g:6257:1: rule__SumFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__SumFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6261:1: ( ( ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:6262:2: ( ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:6262:2: ( ruleFromAndWhereClauses )
            // InternalMyDsl.g:6263:3: ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__SumFunction__XAssignment_5"


    // $ANTLR start "rule__MinFunction__ColumnAssignment_3"
    // InternalMyDsl.g:6272:1: rule__MinFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MinFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6276:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6277:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6277:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6278:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getColumnCDCrossReference_3_0()); 
            }
            // InternalMyDsl.g:6279:3: ( RULE_ID )
            // InternalMyDsl.g:6280:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getColumnCDCrossReference_3_0()); 
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
    // $ANTLR end "rule__MinFunction__ColumnAssignment_3"


    // $ANTLR start "rule__MinFunction__XAssignment_5"
    // InternalMyDsl.g:6291:1: rule__MinFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__MinFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6295:1: ( ( ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:6296:2: ( ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:6296:2: ( ruleFromAndWhereClauses )
            // InternalMyDsl.g:6297:3: ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__MinFunction__XAssignment_5"


    // $ANTLR start "rule__MaxFunction__ColumnAssignment_3"
    // InternalMyDsl.g:6306:1: rule__MaxFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MaxFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6310:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6311:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6311:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6312:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getColumnCDCrossReference_3_0()); 
            }
            // InternalMyDsl.g:6313:3: ( RULE_ID )
            // InternalMyDsl.g:6314:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getColumnCDCrossReference_3_0()); 
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
    // $ANTLR end "rule__MaxFunction__ColumnAssignment_3"


    // $ANTLR start "rule__MaxFunction__XAssignment_5"
    // InternalMyDsl.g:6325:1: rule__MaxFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__MaxFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6329:1: ( ( ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:6330:2: ( ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:6330:2: ( ruleFromAndWhereClauses )
            // InternalMyDsl.g:6331:3: ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__MaxFunction__XAssignment_5"


    // $ANTLR start "rule__INSERT__NameTAssignment_2"
    // InternalMyDsl.g:6340:1: rule__INSERT__NameTAssignment_2 : ( RULE_ID ) ;
    public final void rule__INSERT__NameTAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6344:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6345:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6345:2: ( RULE_ID )
            // InternalMyDsl.g:6346:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getNameTIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getNameTIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__INSERT__NameTAssignment_2"


    // $ANTLR start "rule__INSERT__LiteralsAssignment_5"
    // InternalMyDsl.g:6355:1: rule__INSERT__LiteralsAssignment_5 : ( ruleDATATYPE ) ;
    public final void rule__INSERT__LiteralsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6359:1: ( ( ruleDATATYPE ) )
            // InternalMyDsl.g:6360:2: ( ruleDATATYPE )
            {
            // InternalMyDsl.g:6360:2: ( ruleDATATYPE )
            // InternalMyDsl.g:6361:3: ruleDATATYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINSERTAccess().getLiteralsDATATYPEEnumRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDATATYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINSERTAccess().getLiteralsDATATYPEEnumRuleCall_5_0()); 
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
    // $ANTLR end "rule__INSERT__LiteralsAssignment_5"

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:334:5: ( rule__CREATE__TablesAssignment )
        // InternalMyDsl.g:334:5: rule__CREATE__TablesAssignment
        {
        pushFollow(FOLLOW_2);
        rule__CREATE__TablesAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // Delegated rules

    public final boolean synpred2_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\143\uffff";
    static final String dfa_2s = "\1\1\142\uffff";
    static final String dfa_3s = "\1\36\1\uffff\1\44\1\5\1\46\1\5\1\26\2\51\7\5\2\46\1\5\1\26\2\51\1\5\1\0\11\5\2\46\1\26\2\51\1\uffff\2\37\3\5\7\6\2\46\3\5\1\53\3\37\2\5\2\37\4\5\1\53\2\37\1\46\2\37\2\5\1\37\1\5\1\53\1\5\1\46\2\37\1\5\1\37\1\5\1\46\2\5\1\37\1\5\1\37\2\5\2\37\1\5\2\37";
    static final String dfa_4s = "\1\72\1\uffff\1\45\1\5\1\46\1\52\1\34\2\51\7\52\2\46\1\52\1\34\2\51\1\52\1\0\2\5\7\52\2\46\1\34\2\51\1\uffff\2\47\1\52\2\5\7\47\2\46\1\5\1\52\1\5\1\53\3\47\2\5\2\47\2\5\1\52\1\5\1\53\2\47\1\46\2\47\2\5\1\47\1\5\1\53\1\5\1\46\2\47\1\5\1\47\1\5\1\46\1\5\1\52\1\47\1\5\1\47\1\5\1\52\2\47\1\5\2\47";
    static final String dfa_5s = "\1\uffff\1\2\44\uffff\1\1\74\uffff";
    static final String dfa_6s = "\27\uffff\1\0\113\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2\10\uffff\4\1\1\uffff\1\1\2\uffff\1\1\5\uffff\1\1",
            "",
            "\1\1\1\3",
            "\1\4",
            "\1\5",
            "\1\6\42\uffff\1\7\1\uffff\1\10",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\20",
            "\1\21",
            "\1\23\1\22\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\22\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\22\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\22\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\22\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\22\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\22\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\30",
            "\1\31",
            "\1\23\31\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40",
            "\1\41",
            "\1\42",
            "\1\43\42\uffff\1\44\1\uffff\1\45",
            "\1\uffff",
            "\1\47",
            "\1\50",
            "\1\23\1\51\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\51\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\51\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\51\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\51\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\51\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\23\1\51\30\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\52",
            "\1\53",
            "\1\54\1\55\1\56\1\57\1\60\1\61\1\62",
            "\1\63",
            "\1\64",
            "",
            "\1\65\7\uffff\1\66",
            "\1\67\7\uffff\1\70",
            "\1\23\31\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\71",
            "\1\72",
            "\1\73\30\uffff\1\26\7\uffff\1\27",
            "\1\73\30\uffff\1\26\7\uffff\1\27",
            "\1\73\30\uffff\1\26\7\uffff\1\27",
            "\1\73\30\uffff\1\26\7\uffff\1\27",
            "\1\73\30\uffff\1\26\7\uffff\1\27",
            "\1\73\30\uffff\1\26\7\uffff\1\27",
            "\1\73\30\uffff\1\26\7\uffff\1\27",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\23\31\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\77",
            "\1\100",
            "\1\101\7\uffff\1\102",
            "\1\103\7\uffff\1\104",
            "\1\26\7\uffff\1\27",
            "\1\105",
            "\1\106",
            "\1\65\7\uffff\1\66",
            "\1\67\7\uffff\1\70",
            "\1\107",
            "\1\110",
            "\1\23\31\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\111",
            "\1\112",
            "\1\113\7\uffff\1\114",
            "\1\115\7\uffff\1\116",
            "\1\117",
            "\1\101\7\uffff\1\102",
            "\1\103\7\uffff\1\104",
            "\1\120",
            "\1\121",
            "\1\26\7\uffff\1\27",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\113\7\uffff\1\114",
            "\1\115\7\uffff\1\116",
            "\1\126",
            "\1\127\7\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\23\31\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\134\7\uffff\1\135",
            "\1\136",
            "\1\127\7\uffff\1\130",
            "\1\137",
            "\1\23\31\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\140\7\uffff\1\141",
            "\1\134\7\uffff\1\135",
            "\1\142",
            "\1\26\7\uffff\1\27",
            "\1\140\7\uffff\1\141"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 334:4: ( rule__CREATE__TablesAssignment )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_23 = input.LA(1);

                         
                        int index2_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\36\1\44\2\uffff\1\5\11\uffff";
    static final String dfa_10s = "\1\72\1\45\2\uffff\1\71\11\uffff";
    static final String dfa_11s = "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\13\1\1\1\12\1\11\1\4";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\4\4\uffff\1\1\10\uffff\1\6\1\7\1\5\1\10\1\uffff\1\2\2\uffff\1\11\5\uffff\1\3",
            "\1\13\1\12",
            "",
            "",
            "\1\15\6\uffff\1\15\23\uffff\1\15\24\uffff\5\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "909:1: rule__Element__Alternatives : ( ( ruleCREATE ) | ( ruleALTER ) | ( ruleINSERT ) | ( ruleSELECT ) | ( ruleDELETE ) | ( ruleDROPTABLE ) | ( ruleTRUNCATE ) | ( ruleUPDATE ) | ( ruleSELECTFUNCT ) | ( ruleDATABASE ) | ( ruleVariableDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0412F00840000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000050000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000050000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000A100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000801FC00000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000001FC00002L});

}