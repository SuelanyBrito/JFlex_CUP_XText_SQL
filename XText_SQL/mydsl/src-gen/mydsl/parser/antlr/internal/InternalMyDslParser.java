package mydsl.parser.antlr.internal;

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
import mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NOTNULL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'SELECT'", "'*'", "','", "'FROM'", "'WHERE'", "'AND'", "'OR'", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'LIKE'", "'#'", "'CREATE'", "'DATABASE'", "'TABLE'", "'('", "')'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'DROP'", "'TRUNCATE'", "'DELETE'", "'UPDATE'", "'SET'", "'ALTER'", "'COLUMN'", "'ADD'", "'var'", "'COUNT'", "'AVG'", "'SUM'", "'MIN'", "'MAX'", "'INSERT'", "'INTO'", "'VALUES'", "'VARCHAR'", "'char'", "'date'", "'int'", "'float'", "'time'", "'text'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_Element_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Element_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_Element_0_0= ruleElement ) )* )
            // InternalMyDsl.g:79:2: ( (lv_Element_0_0= ruleElement ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_Element_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==28||(LA1_0>=37 && LA1_0<=40)||LA1_0==42||LA1_0==45||LA1_0==51) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_Element_0_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_Element_0_0= ruleElement )
            	    // InternalMyDsl.g:81:4: lv_Element_0_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getElementElementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_Element_0_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"Element",
            	      					lv_Element_0_0,
            	      					"mydsl.MyDsl.Element");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:101:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:102:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:108:1: ruleElement returns [EObject current=null] : (this_CREATE_0= ruleCREATE | this_ALTER_1= ruleALTER | this_INSERT_2= ruleINSERT | this_SELECT_3= ruleSELECT | this_DELETE_4= ruleDELETE | this_DROPTABLE_5= ruleDROPTABLE | this_TRUNCATE_6= ruleTRUNCATE | this_UPDATE_7= ruleUPDATE | this_SELECTFUNCT_8= ruleSELECTFUNCT | this_DATABASE_9= ruleDATABASE | this_VariableDeclaration_10= ruleVariableDeclaration ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_CREATE_0 = null;

        EObject this_ALTER_1 = null;

        EObject this_INSERT_2 = null;

        EObject this_SELECT_3 = null;

        EObject this_DELETE_4 = null;

        EObject this_DROPTABLE_5 = null;

        EObject this_TRUNCATE_6 = null;

        EObject this_UPDATE_7 = null;

        EObject this_SELECTFUNCT_8 = null;

        EObject this_DATABASE_9 = null;

        EObject this_VariableDeclaration_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( (this_CREATE_0= ruleCREATE | this_ALTER_1= ruleALTER | this_INSERT_2= ruleINSERT | this_SELECT_3= ruleSELECT | this_DELETE_4= ruleDELETE | this_DROPTABLE_5= ruleDROPTABLE | this_TRUNCATE_6= ruleTRUNCATE | this_UPDATE_7= ruleUPDATE | this_SELECTFUNCT_8= ruleSELECTFUNCT | this_DATABASE_9= ruleDATABASE | this_VariableDeclaration_10= ruleVariableDeclaration ) )
            // InternalMyDsl.g:115:2: (this_CREATE_0= ruleCREATE | this_ALTER_1= ruleALTER | this_INSERT_2= ruleINSERT | this_SELECT_3= ruleSELECT | this_DELETE_4= ruleDELETE | this_DROPTABLE_5= ruleDROPTABLE | this_TRUNCATE_6= ruleTRUNCATE | this_UPDATE_7= ruleUPDATE | this_SELECTFUNCT_8= ruleSELECTFUNCT | this_DATABASE_9= ruleDATABASE | this_VariableDeclaration_10= ruleVariableDeclaration )
            {
            // InternalMyDsl.g:115:2: (this_CREATE_0= ruleCREATE | this_ALTER_1= ruleALTER | this_INSERT_2= ruleINSERT | this_SELECT_3= ruleSELECT | this_DELETE_4= ruleDELETE | this_DROPTABLE_5= ruleDROPTABLE | this_TRUNCATE_6= ruleTRUNCATE | this_UPDATE_7= ruleUPDATE | this_SELECTFUNCT_8= ruleSELECTFUNCT | this_DATABASE_9= ruleDATABASE | this_VariableDeclaration_10= ruleVariableDeclaration )
            int alt2=11;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:116:3: this_CREATE_0= ruleCREATE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getCREATEParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CREATE_0=ruleCREATE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CREATE_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:125:3: this_ALTER_1= ruleALTER
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getALTERParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ALTER_1=ruleALTER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ALTER_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:134:3: this_INSERT_2= ruleINSERT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getINSERTParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_INSERT_2=ruleINSERT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_INSERT_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:143:3: this_SELECT_3= ruleSELECT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getSELECTParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SELECT_3=ruleSELECT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SELECT_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:152:3: this_DELETE_4= ruleDELETE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getDELETEParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DELETE_4=ruleDELETE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DELETE_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:161:3: this_DROPTABLE_5= ruleDROPTABLE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getDROPTABLEParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DROPTABLE_5=ruleDROPTABLE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DROPTABLE_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:170:3: this_TRUNCATE_6= ruleTRUNCATE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getTRUNCATEParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TRUNCATE_6=ruleTRUNCATE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TRUNCATE_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:179:3: this_UPDATE_7= ruleUPDATE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getUPDATEParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UPDATE_7=ruleUPDATE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UPDATE_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:188:3: this_SELECTFUNCT_8= ruleSELECTFUNCT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getSELECTFUNCTParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SELECTFUNCT_8=ruleSELECTFUNCT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SELECTFUNCT_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:197:3: this_DATABASE_9= ruleDATABASE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getDATABASEParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DATABASE_9=ruleDATABASE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DATABASE_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:206:3: this_VariableDeclaration_10= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getVariableDeclarationParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_10=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_10;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleREAL"
    // InternalMyDsl.g:218:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:220:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalMyDsl.g:221:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalMyDsl.g:230:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:237:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyDsl.g:238:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyDsl.g:238:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalMyDsl.g:239:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalMyDsl.g:239:3: (this_INT_0= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:240:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
              		
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleSELECT"
    // InternalMyDsl.g:267:1: entryRuleSELECT returns [EObject current=null] : iv_ruleSELECT= ruleSELECT EOF ;
    public final EObject entryRuleSELECT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECT = null;


        try {
            // InternalMyDsl.g:267:47: (iv_ruleSELECT= ruleSELECT EOF )
            // InternalMyDsl.g:268:2: iv_ruleSELECT= ruleSELECT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSELECTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSELECT=ruleSELECT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSELECT; 
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
    // $ANTLR end "entryRuleSELECT"


    // $ANTLR start "ruleSELECT"
    // InternalMyDsl.g:274:1: ruleSELECT returns [EObject current=null] : (otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleSELECT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:280:2: ( (otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalMyDsl.g:281:2: (otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalMyDsl.g:281:2: (otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalMyDsl.g:282:3: otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSELECTAccess().getSELECTKeyword_0());
              		
            }
            // InternalMyDsl.g:286:3: (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:287:4: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSELECTAccess().getAsteriskKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:292:4: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )*
                    {
                    // InternalMyDsl.g:292:4: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:293:5: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    	    {
                    	    // InternalMyDsl.g:293:5: ( (otherlv_2= RULE_ID ) )
                    	    // InternalMyDsl.g:294:6: (otherlv_2= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:294:6: (otherlv_2= RULE_ID )
                    	    // InternalMyDsl.g:295:7: otherlv_2= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getSELECTRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_2, grammarAccess.getSELECTAccess().getColumnCDCrossReference_1_1_0_0());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalMyDsl.g:306:5: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    	    loop4:
                    	    do {
                    	        int alt4=2;
                    	        int LA4_0 = input.LA(1);

                    	        if ( (LA4_0==15) ) {
                    	            alt4=1;
                    	        }


                    	        switch (alt4) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:307:6: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    	    {
                    	    	    otherlv_3=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getCommaKeyword_1_1_1_0());
                    	    	      					
                    	    	    }
                    	    	    // InternalMyDsl.g:311:6: ( (otherlv_4= RULE_ID ) )
                    	    	    // InternalMyDsl.g:312:7: (otherlv_4= RULE_ID )
                    	    	    {
                    	    	    // InternalMyDsl.g:312:7: (otherlv_4= RULE_ID )
                    	    	    // InternalMyDsl.g:313:8: otherlv_4= RULE_ID
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {

                    	    	      								if (current==null) {
                    	    	      									current = createModelElement(grammarAccess.getSELECTRule());
                    	    	      								}
                    	    	      							
                    	    	    }
                    	    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      								newLeafNode(otherlv_4, grammarAccess.getSELECTAccess().getColumnCDCrossReference_1_1_1_1_0());
                    	    	      							
                    	    	    }

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop4;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:327:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:328:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:328:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalMyDsl.g:329:5: lv_x_5_0= ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSELECTAccess().getXFromAndWhereClausesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSELECTRule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_5_0,
              						"mydsl.MyDsl.FromAndWhereClauses");
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
    // $ANTLR end "ruleSELECT"


    // $ANTLR start "entryRuleFromAndWhereClauses"
    // InternalMyDsl.g:350:1: entryRuleFromAndWhereClauses returns [EObject current=null] : iv_ruleFromAndWhereClauses= ruleFromAndWhereClauses EOF ;
    public final EObject entryRuleFromAndWhereClauses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromAndWhereClauses = null;


        try {
            // InternalMyDsl.g:350:60: (iv_ruleFromAndWhereClauses= ruleFromAndWhereClauses EOF )
            // InternalMyDsl.g:351:2: iv_ruleFromAndWhereClauses= ruleFromAndWhereClauses EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromAndWhereClausesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFromAndWhereClauses=ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromAndWhereClauses; 
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
    // $ANTLR end "entryRuleFromAndWhereClauses"


    // $ANTLR start "ruleFromAndWhereClauses"
    // InternalMyDsl.g:357:1: ruleFromAndWhereClauses returns [EObject current=null] : (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWHERE ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) ) )* )? ) ;
    public final EObject ruleFromAndWhereClauses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_z_3_0 = null;

        EObject lv_z_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:363:2: ( (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWHERE ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) ) )* )? ) )
            // InternalMyDsl.g:364:2: (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWHERE ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) ) )* )? )
            {
            // InternalMyDsl.g:364:2: (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWHERE ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) ) )* )? )
            // InternalMyDsl.g:365:3: otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWHERE ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) ) )* )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFromAndWhereClausesAccess().getFROMKeyword_0());
              		
            }
            // InternalMyDsl.g:369:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:370:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:370:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:371:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFromAndWhereClausesRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getFromAndWhereClausesAccess().getTableTableNameCrossReference_1_0());
              				
            }

            }


            }

            // InternalMyDsl.g:382:3: (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWHERE ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:383:4: otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWHERE ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) ) )*
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFromAndWhereClausesAccess().getWHEREKeyword_2_0());
                      			
                    }
                    // InternalMyDsl.g:387:4: ( (lv_z_3_0= ruleWHERE ) )
                    // InternalMyDsl.g:388:5: (lv_z_3_0= ruleWHERE )
                    {
                    // InternalMyDsl.g:388:5: (lv_z_3_0= ruleWHERE )
                    // InternalMyDsl.g:389:6: lv_z_3_0= ruleWHERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFromAndWhereClausesAccess().getZWHEREParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_z_3_0=ruleWHERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFromAndWhereClausesRule());
                      						}
                      						add(
                      							current,
                      							"z",
                      							lv_z_3_0,
                      							"mydsl.MyDsl.WHERE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyDsl.g:406:4: ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:407:5: (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWHERE ) )
                    	    {
                    	    // InternalMyDsl.g:407:5: (otherlv_4= 'AND' | otherlv_5= 'OR' )
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==18) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( (LA7_0==19) ) {
                    	        alt7=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 7, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalMyDsl.g:408:6: otherlv_4= 'AND'
                    	            {
                    	            otherlv_4=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_4, grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:413:6: otherlv_5= 'OR'
                    	            {
                    	            otherlv_5=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_5, grammarAccess.getFromAndWhereClausesAccess().getORKeyword_2_2_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDsl.g:418:5: ( (lv_z_6_0= ruleWHERE ) )
                    	    // InternalMyDsl.g:419:6: (lv_z_6_0= ruleWHERE )
                    	    {
                    	    // InternalMyDsl.g:419:6: (lv_z_6_0= ruleWHERE )
                    	    // InternalMyDsl.g:420:7: lv_z_6_0= ruleWHERE
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFromAndWhereClausesAccess().getZWHEREParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_z_6_0=ruleWHERE();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFromAndWhereClausesRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"z",
                    	      								lv_z_6_0,
                    	      								"mydsl.MyDsl.WHERE");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "ruleFromAndWhereClauses"


    // $ANTLR start "entryRuleWHERE"
    // InternalMyDsl.g:443:1: entryRuleWHERE returns [EObject current=null] : iv_ruleWHERE= ruleWHERE EOF ;
    public final EObject entryRuleWHERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWHERE = null;


        try {
            // InternalMyDsl.g:443:46: (iv_ruleWHERE= ruleWHERE EOF )
            // InternalMyDsl.g:444:2: iv_ruleWHERE= ruleWHERE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWHERERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWHERE=ruleWHERE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWHERE; 
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
    // $ANTLR end "entryRuleWHERE"


    // $ANTLR start "ruleWHERE"
    // InternalMyDsl.g:450:1: ruleWHERE returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 ) ) ) ) ;
    public final EObject ruleWHERE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sign_1_1=null;
        Token lv_sign_1_2=null;
        Token lv_sign_1_3=null;
        Token lv_sign_1_4=null;
        Token lv_sign_1_5=null;
        Token lv_sign_1_6=null;
        Token lv_sign_1_7=null;
        EObject lv_Oper_2_1 = null;

        EObject lv_Oper_2_2 = null;

        EObject lv_Oper_2_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:456:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 ) ) ) ) )
            // InternalMyDsl.g:457:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 ) ) ) )
            {
            // InternalMyDsl.g:457:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 ) ) ) )
            // InternalMyDsl.g:458:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 ) ) )
            {
            // InternalMyDsl.g:458:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:459:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:459:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:460:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWHERERule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getWHEREAccess().getColumnCDCrossReference_0_0());
              				
            }

            }


            }

            // InternalMyDsl.g:471:3: ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) )
            // InternalMyDsl.g:472:4: ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) )
            {
            // InternalMyDsl.g:472:4: ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) )
            // InternalMyDsl.g:473:5: (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' )
            {
            // InternalMyDsl.g:473:5: (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 25:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:474:6: lv_sign_1_1= '='
                    {
                    lv_sign_1_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sign_1_1, grammarAccess.getWHEREAccess().getSignEqualsSignKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWHERERule());
                      						}
                      						setWithLastConsumed(current, "sign", lv_sign_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:485:6: lv_sign_1_2= '<'
                    {
                    lv_sign_1_2=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sign_1_2, grammarAccess.getWHEREAccess().getSignLessThanSignKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWHERERule());
                      						}
                      						setWithLastConsumed(current, "sign", lv_sign_1_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:496:6: lv_sign_1_3= '<='
                    {
                    lv_sign_1_3=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sign_1_3, grammarAccess.getWHEREAccess().getSignLessThanSignEqualsSignKeyword_1_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWHERERule());
                      						}
                      						setWithLastConsumed(current, "sign", lv_sign_1_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:507:6: lv_sign_1_4= '>'
                    {
                    lv_sign_1_4=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sign_1_4, grammarAccess.getWHEREAccess().getSignGreaterThanSignKeyword_1_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWHERERule());
                      						}
                      						setWithLastConsumed(current, "sign", lv_sign_1_4, null);
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:518:6: lv_sign_1_5= '>='
                    {
                    lv_sign_1_5=(Token)match(input,24,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sign_1_5, grammarAccess.getWHEREAccess().getSignGreaterThanSignEqualsSignKeyword_1_0_4());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWHERERule());
                      						}
                      						setWithLastConsumed(current, "sign", lv_sign_1_5, null);
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:529:6: lv_sign_1_6= '!='
                    {
                    lv_sign_1_6=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sign_1_6, grammarAccess.getWHEREAccess().getSignExclamationMarkEqualsSignKeyword_1_0_5());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWHERERule());
                      						}
                      						setWithLastConsumed(current, "sign", lv_sign_1_6, null);
                      					
                    }

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:540:6: lv_sign_1_7= 'LIKE'
                    {
                    lv_sign_1_7=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sign_1_7, grammarAccess.getWHEREAccess().getSignLIKEKeyword_1_0_6());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWHERERule());
                      						}
                      						setWithLastConsumed(current, "sign", lv_sign_1_7, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:553:3: ( ( (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 ) ) )
            // InternalMyDsl.g:554:4: ( (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 ) )
            {
            // InternalMyDsl.g:554:4: ( (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 ) )
            // InternalMyDsl.g:555:5: (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 )
            {
            // InternalMyDsl.g:555:5: (lv_Oper_2_1= ruleOper1 | lv_Oper_2_2= ruleOper2 | lv_Oper_2_3= ruleOper3 )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:556:6: lv_Oper_2_1= ruleOper1
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWHEREAccess().getOperOper1ParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_Oper_2_1=ruleOper1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWHERERule());
                      						}
                      						set(
                      							current,
                      							"Oper",
                      							lv_Oper_2_1,
                      							"mydsl.MyDsl.Oper1");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:572:6: lv_Oper_2_2= ruleOper2
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWHEREAccess().getOperOper2ParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_Oper_2_2=ruleOper2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWHERERule());
                      						}
                      						set(
                      							current,
                      							"Oper",
                      							lv_Oper_2_2,
                      							"mydsl.MyDsl.Oper2");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:588:6: lv_Oper_2_3= ruleOper3
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWHEREAccess().getOperOper3ParserRuleCall_2_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_Oper_2_3=ruleOper3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWHERERule());
                      						}
                      						set(
                      							current,
                      							"Oper",
                      							lv_Oper_2_3,
                      							"mydsl.MyDsl.Oper3");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

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
    // $ANTLR end "ruleWHERE"


    // $ANTLR start "entryRuleOper1"
    // InternalMyDsl.g:610:1: entryRuleOper1 returns [EObject current=null] : iv_ruleOper1= ruleOper1 EOF ;
    public final EObject entryRuleOper1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOper1 = null;


        try {
            // InternalMyDsl.g:610:46: (iv_ruleOper1= ruleOper1 EOF )
            // InternalMyDsl.g:611:2: iv_ruleOper1= ruleOper1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOper1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOper1=ruleOper1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOper1; 
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
    // $ANTLR end "entryRuleOper1"


    // $ANTLR start "ruleOper1"
    // InternalMyDsl.g:617:1: ruleOper1 returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#' ) ;
    public final EObject ruleOper1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:623:2: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#' ) )
            // InternalMyDsl.g:624:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#' )
            {
            // InternalMyDsl.g:624:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#' )
            // InternalMyDsl.g:625:3: otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOper1Access().getNumberSignKeyword_0());
              		
            }
            // InternalMyDsl.g:629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:630:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:631:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getOper1Access().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOper1Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOper1Access().getNumberSignKeyword_2());
              		
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
    // $ANTLR end "ruleOper1"


    // $ANTLR start "entryRuleOper2"
    // InternalMyDsl.g:655:1: entryRuleOper2 returns [EObject current=null] : iv_ruleOper2= ruleOper2 EOF ;
    public final EObject entryRuleOper2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOper2 = null;


        try {
            // InternalMyDsl.g:655:46: (iv_ruleOper2= ruleOper2 EOF )
            // InternalMyDsl.g:656:2: iv_ruleOper2= ruleOper2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOper2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOper2=ruleOper2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOper2; 
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
    // $ANTLR end "entryRuleOper2"


    // $ANTLR start "ruleOper2"
    // InternalMyDsl.g:662:1: ruleOper2 returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleOper2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:668:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyDsl.g:669:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyDsl.g:669:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:670:3: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:670:3: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:671:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getOper2Rule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getOper2Access().getColumnCDCrossReference_0());
              			
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
    // $ANTLR end "ruleOper2"


    // $ANTLR start "entryRuleOper3"
    // InternalMyDsl.g:685:1: entryRuleOper3 returns [EObject current=null] : iv_ruleOper3= ruleOper3 EOF ;
    public final EObject entryRuleOper3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOper3 = null;


        try {
            // InternalMyDsl.g:685:46: (iv_ruleOper3= ruleOper3 EOF )
            // InternalMyDsl.g:686:2: iv_ruleOper3= ruleOper3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOper3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOper3=ruleOper3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOper3; 
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
    // $ANTLR end "entryRuleOper3"


    // $ANTLR start "ruleOper3"
    // InternalMyDsl.g:692:1: ruleOper3 returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleOper3() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:698:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:699:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:699:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalMyDsl.g:700:3: (lv_val_0_0= RULE_INT )
            {
            // InternalMyDsl.g:700:3: (lv_val_0_0= RULE_INT )
            // InternalMyDsl.g:701:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_val_0_0, grammarAccess.getOper3Access().getValINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getOper3Rule());
              				}
              				setWithLastConsumed(
              					current,
              					"val",
              					lv_val_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleOper3"


    // $ANTLR start "entryRuleDATABASE"
    // InternalMyDsl.g:720:1: entryRuleDATABASE returns [EObject current=null] : iv_ruleDATABASE= ruleDATABASE EOF ;
    public final EObject entryRuleDATABASE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDATABASE = null;


        try {
            // InternalMyDsl.g:720:49: (iv_ruleDATABASE= ruleDATABASE EOF )
            // InternalMyDsl.g:721:2: iv_ruleDATABASE= ruleDATABASE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDATABASERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDATABASE=ruleDATABASE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDATABASE; 
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
    // $ANTLR end "entryRuleDATABASE"


    // $ANTLR start "ruleDATABASE"
    // InternalMyDsl.g:727:1: ruleDATABASE returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDATABASE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:733:2: ( (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:734:2: (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:734:2: (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:735:3: otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDATABASEAccess().getCREATEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDATABASEAccess().getDATABASEKeyword_1());
              		
            }
            // InternalMyDsl.g:743:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:744:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:744:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:745:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDATABASEAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDATABASERule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleDATABASE"


    // $ANTLR start "entryRuleCREATE"
    // InternalMyDsl.g:765:1: entryRuleCREATE returns [EObject current=null] : iv_ruleCREATE= ruleCREATE EOF ;
    public final EObject entryRuleCREATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCREATE = null;


        try {
            // InternalMyDsl.g:765:47: (iv_ruleCREATE= ruleCREATE EOF )
            // InternalMyDsl.g:766:2: iv_ruleCREATE= ruleCREATE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCREATERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCREATE=ruleCREATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCREATE; 
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
    // $ANTLR end "entryRuleCREATE"


    // $ANTLR start "ruleCREATE"
    // InternalMyDsl.g:772:1: ruleCREATE returns [EObject current=null] : ( (lv_tables_0_0= ruleTABLE ) )+ ;
    public final EObject ruleCREATE() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:778:2: ( ( (lv_tables_0_0= ruleTABLE ) )+ )
            // InternalMyDsl.g:779:2: ( (lv_tables_0_0= ruleTABLE ) )+
            {
            // InternalMyDsl.g:779:2: ( (lv_tables_0_0= ruleTABLE ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:780:3: (lv_tables_0_0= ruleTABLE )
            	    {
            	    // InternalMyDsl.g:780:3: (lv_tables_0_0= ruleTABLE )
            	    // InternalMyDsl.g:781:4: lv_tables_0_0= ruleTABLE
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCREATEAccess().getTablesTABLEParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_tables_0_0=ruleTABLE();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getCREATERule());
            	      				}
            	      				add(
            	      					current,
            	      					"tables",
            	      					lv_tables_0_0,
            	      					"mydsl.MyDsl.TABLE");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


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
    // $ANTLR end "ruleCREATE"


    // $ANTLR start "entryRuleTABLE"
    // InternalMyDsl.g:801:1: entryRuleTABLE returns [EObject current=null] : iv_ruleTABLE= ruleTABLE EOF ;
    public final EObject entryRuleTABLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTABLE = null;


        try {
            // InternalMyDsl.g:801:46: (iv_ruleTABLE= ruleTABLE EOF )
            // InternalMyDsl.g:802:2: iv_ruleTABLE= ruleTABLE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTABLERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTABLE=ruleTABLE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTABLE; 
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
    // $ANTLR end "entryRuleTABLE"


    // $ANTLR start "ruleTABLE"
    // InternalMyDsl.g:808:1: ruleTABLE returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleTABLE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_table_2_0 = null;

        EObject lv_attributes_4_1 = null;

        EObject lv_attributes_4_2 = null;

        EObject lv_attributes_4_3 = null;

        EObject lv_attributes_6_1 = null;

        EObject lv_attributes_6_2 = null;

        EObject lv_attributes_6_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:814:2: ( (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) )
            // InternalMyDsl.g:815:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            {
            // InternalMyDsl.g:815:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            // InternalMyDsl.g:816:3: otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTABLEAccess().getCREATEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTABLEAccess().getTABLEKeyword_1());
              		
            }
            // InternalMyDsl.g:824:3: ( (lv_table_2_0= ruletableName ) )
            // InternalMyDsl.g:825:4: (lv_table_2_0= ruletableName )
            {
            // InternalMyDsl.g:825:4: (lv_table_2_0= ruletableName )
            // InternalMyDsl.g:826:5: lv_table_2_0= ruletableName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTABLEAccess().getTableTableNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_table_2_0=ruletableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTABLERule());
              					}
              					add(
              						current,
              						"table",
              						lv_table_2_0,
              						"mydsl.MyDsl.tableName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTABLEAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalMyDsl.g:847:3: ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==33||LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:848:4: ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) )
            	    {
            	    // InternalMyDsl.g:848:4: ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) )
            	    // InternalMyDsl.g:849:5: (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey )
            	    {
            	    // InternalMyDsl.g:849:5: (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 35:
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
            	            // InternalMyDsl.g:850:6: lv_attributes_4_1= ruleColumnDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTABLEAccess().getAttributesColumnDeclarationParserRuleCall_4_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_attributes_4_1=ruleColumnDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTABLERule());
            	              						}
            	              						add(
            	              							current,
            	              							"attributes",
            	              							lv_attributes_4_1,
            	              							"mydsl.MyDsl.ColumnDeclaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:866:6: lv_attributes_4_2= rulePrimaryKey
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTABLEAccess().getAttributesPrimaryKeyParserRuleCall_4_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_attributes_4_2=rulePrimaryKey();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTABLERule());
            	              						}
            	              						add(
            	              							current,
            	              							"attributes",
            	              							lv_attributes_4_2,
            	              							"mydsl.MyDsl.PrimaryKey");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:882:6: lv_attributes_4_3= ruleForeignKey
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTABLEAccess().getAttributesForeignKeyParserRuleCall_4_0_2());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_attributes_4_3=ruleForeignKey();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTABLERule());
            	              						}
            	              						add(
            	              							current,
            	              							"attributes",
            	              							lv_attributes_4_3,
            	              							"mydsl.MyDsl.ForeignKey");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalMyDsl.g:900:3: (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:901:4: otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getTABLEAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalMyDsl.g:905:4: ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) )
            	    // InternalMyDsl.g:906:5: ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) )
            	    {
            	    // InternalMyDsl.g:906:5: ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) )
            	    // InternalMyDsl.g:907:6: (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey )
            	    {
            	    // InternalMyDsl.g:907:6: (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalMyDsl.g:908:7: lv_attributes_6_1= ruleColumnDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getTABLEAccess().getAttributesColumnDeclarationParserRuleCall_5_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_20);
            	            lv_attributes_6_1=ruleColumnDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getTABLERule());
            	              							}
            	              							add(
            	              								current,
            	              								"attributes",
            	              								lv_attributes_6_1,
            	              								"mydsl.MyDsl.ColumnDeclaration");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:924:7: lv_attributes_6_2= rulePrimaryKey
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getTABLEAccess().getAttributesPrimaryKeyParserRuleCall_5_1_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_20);
            	            lv_attributes_6_2=rulePrimaryKey();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getTABLERule());
            	              							}
            	              							add(
            	              								current,
            	              								"attributes",
            	              								lv_attributes_6_2,
            	              								"mydsl.MyDsl.PrimaryKey");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:940:7: lv_attributes_6_3= ruleForeignKey
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getTABLEAccess().getAttributesForeignKeyParserRuleCall_5_1_0_2());
            	              						
            	            }
            	            pushFollow(FOLLOW_20);
            	            lv_attributes_6_3=ruleForeignKey();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getTABLERule());
            	              							}
            	              							add(
            	              								current,
            	              								"attributes",
            	              								lv_attributes_6_3,
            	              								"mydsl.MyDsl.ForeignKey");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTABLEAccess().getRightParenthesisKeyword_6());
              		
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
    // $ANTLR end "ruleTABLE"


    // $ANTLR start "entryRuletableName"
    // InternalMyDsl.g:967:1: entryRuletableName returns [EObject current=null] : iv_ruletableName= ruletableName EOF ;
    public final EObject entryRuletableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletableName = null;


        try {
            // InternalMyDsl.g:967:50: (iv_ruletableName= ruletableName EOF )
            // InternalMyDsl.g:968:2: iv_ruletableName= ruletableName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletableName=ruletableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletableName; 
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
    // $ANTLR end "entryRuletableName"


    // $ANTLR start "ruletableName"
    // InternalMyDsl.g:974:1: ruletableName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruletableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:980:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:981:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:981:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:982:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:982:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:983:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTableNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // $ANTLR end "ruletableName"


    // $ANTLR start "entryRuleColumnDeclaration"
    // InternalMyDsl.g:1002:1: entryRuleColumnDeclaration returns [EObject current=null] : iv_ruleColumnDeclaration= ruleColumnDeclaration EOF ;
    public final EObject entryRuleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDeclaration = null;


        try {
            // InternalMyDsl.g:1002:58: (iv_ruleColumnDeclaration= ruleColumnDeclaration EOF )
            // InternalMyDsl.g:1003:2: iv_ruleColumnDeclaration= ruleColumnDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColumnDeclaration=ruleColumnDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDeclaration; 
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
    // $ANTLR end "entryRuleColumnDeclaration"


    // $ANTLR start "ruleColumnDeclaration"
    // InternalMyDsl.g:1009:1: ruleColumnDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDATATYPE ) ) ( (lv_notNull_2_0= RULE_NOTNULL ) )? ) ;
    public final EObject ruleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_notNull_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1015:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDATATYPE ) ) ( (lv_notNull_2_0= RULE_NOTNULL ) )? ) )
            // InternalMyDsl.g:1016:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDATATYPE ) ) ( (lv_notNull_2_0= RULE_NOTNULL ) )? )
            {
            // InternalMyDsl.g:1016:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDATATYPE ) ) ( (lv_notNull_2_0= RULE_NOTNULL ) )? )
            // InternalMyDsl.g:1017:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDATATYPE ) ) ( (lv_notNull_2_0= RULE_NOTNULL ) )?
            {
            // InternalMyDsl.g:1017:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1018:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1018:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1019:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getColumnDeclarationAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getColumnDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMyDsl.g:1035:3: ( (lv_type_1_0= ruleDATATYPE ) )
            // InternalMyDsl.g:1036:4: (lv_type_1_0= ruleDATATYPE )
            {
            // InternalMyDsl.g:1036:4: (lv_type_1_0= ruleDATATYPE )
            // InternalMyDsl.g:1037:5: lv_type_1_0= ruleDATATYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColumnDeclarationAccess().getTypeDATATYPEEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_type_1_0=ruleDATATYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColumnDeclarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"mydsl.MyDsl.DATATYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1054:3: ( (lv_notNull_2_0= RULE_NOTNULL ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_NOTNULL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1055:4: (lv_notNull_2_0= RULE_NOTNULL )
                    {
                    // InternalMyDsl.g:1055:4: (lv_notNull_2_0= RULE_NOTNULL )
                    // InternalMyDsl.g:1056:5: lv_notNull_2_0= RULE_NOTNULL
                    {
                    lv_notNull_2_0=(Token)match(input,RULE_NOTNULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_notNull_2_0, grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getColumnDeclarationRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"notNull",
                      						lv_notNull_2_0 != null,
                      						"mydsl.MyDsl.NOTNULL");
                      				
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
    // $ANTLR end "ruleColumnDeclaration"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalMyDsl.g:1076:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalMyDsl.g:1076:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalMyDsl.g:1077:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryKey; 
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
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalMyDsl.g:1083:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1089:2: ( (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalMyDsl.g:1090:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalMyDsl.g:1090:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalMyDsl.g:1091:3: otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMyDsl.g:1103:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1104:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1104:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1105:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrimaryKeyRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0());
              				
            }

            }


            }

            // InternalMyDsl.g:1116:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1117:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalMyDsl.g:1121:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalMyDsl.g:1122:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1122:5: (otherlv_5= RULE_ID )
            	    // InternalMyDsl.g:1123:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // InternalMyDsl.g:1143:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalMyDsl.g:1143:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalMyDsl.g:1144:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeignKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeignKey; 
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
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalMyDsl.g:1150:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1156:2: ( (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) )
            // InternalMyDsl.g:1157:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            {
            // InternalMyDsl.g:1157:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            // InternalMyDsl.g:1158:3: otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getKEYKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMyDsl.g:1170:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1171:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1171:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1172:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForeignKeyRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0());
              				
            }

            }


            }

            // InternalMyDsl.g:1183:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1184:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalMyDsl.g:1188:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalMyDsl.g:1189:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1189:5: (otherlv_5= RULE_ID )
            	    // InternalMyDsl.g:1190:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getForeignKeyRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6());
              		
            }
            // InternalMyDsl.g:1210:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:1211:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:1211:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:1212:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForeignKeyRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getForeignTableTABLECrossReference_7_0());
              				
            }

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8());
              		
            }
            // InternalMyDsl.g:1227:3: ( (otherlv_10= RULE_ID ) )
            // InternalMyDsl.g:1228:4: (otherlv_10= RULE_ID )
            {
            // InternalMyDsl.g:1228:4: (otherlv_10= RULE_ID )
            // InternalMyDsl.g:1229:5: otherlv_10= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForeignKeyRule());
              					}
              				
            }
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0());
              				
            }

            }


            }

            // InternalMyDsl.g:1240:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1241:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0());
            	      			
            	    }
            	    // InternalMyDsl.g:1245:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalMyDsl.g:1246:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1246:5: (otherlv_12= RULE_ID )
            	    // InternalMyDsl.g:1247:6: otherlv_12= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getForeignKeyRule());
            	      						}
            	      					
            	    }
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_12, grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_13=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11());
              		
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
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleDROPTABLE"
    // InternalMyDsl.g:1267:1: entryRuleDROPTABLE returns [EObject current=null] : iv_ruleDROPTABLE= ruleDROPTABLE EOF ;
    public final EObject entryRuleDROPTABLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDROPTABLE = null;


        try {
            // InternalMyDsl.g:1267:50: (iv_ruleDROPTABLE= ruleDROPTABLE EOF )
            // InternalMyDsl.g:1268:2: iv_ruleDROPTABLE= ruleDROPTABLE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDROPTABLERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDROPTABLE=ruleDROPTABLE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDROPTABLE; 
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
    // $ANTLR end "entryRuleDROPTABLE"


    // $ANTLR start "ruleDROPTABLE"
    // InternalMyDsl.g:1274:1: ruleDROPTABLE returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleDROPTABLE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1280:2: ( (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:1281:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:1281:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalMyDsl.g:1282:3: otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDROPTABLEAccess().getDROPKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDROPTABLEAccess().getTABLEKeyword_1());
              		
            }
            // InternalMyDsl.g:1290:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1291:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1291:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1292:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDROPTABLERule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDROPTABLEAccess().getTableTableNameCrossReference_2_0());
              				
            }

            }


            }

            // InternalMyDsl.g:1303:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1304:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDROPTABLEAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalMyDsl.g:1308:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalMyDsl.g:1309:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1309:5: (otherlv_4= RULE_ID )
            	    // InternalMyDsl.g:1310:6: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDROPTABLERule());
            	      						}
            	      					
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_4, grammarAccess.getDROPTABLEAccess().getTableTableNameCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleDROPTABLE"


    // $ANTLR start "entryRuleTRUNCATE"
    // InternalMyDsl.g:1326:1: entryRuleTRUNCATE returns [EObject current=null] : iv_ruleTRUNCATE= ruleTRUNCATE EOF ;
    public final EObject entryRuleTRUNCATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTRUNCATE = null;


        try {
            // InternalMyDsl.g:1326:49: (iv_ruleTRUNCATE= ruleTRUNCATE EOF )
            // InternalMyDsl.g:1327:2: iv_ruleTRUNCATE= ruleTRUNCATE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTRUNCATERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTRUNCATE=ruleTRUNCATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTRUNCATE; 
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
    // $ANTLR end "entryRuleTRUNCATE"


    // $ANTLR start "ruleTRUNCATE"
    // InternalMyDsl.g:1333:1: ruleTRUNCATE returns [EObject current=null] : (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleTRUNCATE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1339:2: ( (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:1340:2: (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:1340:2: (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalMyDsl.g:1341:3: otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTRUNCATEAccess().getTRUNCATEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTRUNCATEAccess().getTABLEKeyword_1());
              		
            }
            // InternalMyDsl.g:1349:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1350:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1350:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1351:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTRUNCATERule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getTRUNCATEAccess().getTableTableNameCrossReference_2_0());
              				
            }

            }


            }

            // InternalMyDsl.g:1362:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1363:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTRUNCATEAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalMyDsl.g:1367:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalMyDsl.g:1368:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1368:5: (otherlv_4= RULE_ID )
            	    // InternalMyDsl.g:1369:6: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getTRUNCATERule());
            	      						}
            	      					
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_4, grammarAccess.getTRUNCATEAccess().getTableTableNameCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleTRUNCATE"


    // $ANTLR start "entryRuleDELETE"
    // InternalMyDsl.g:1385:1: entryRuleDELETE returns [EObject current=null] : iv_ruleDELETE= ruleDELETE EOF ;
    public final EObject entryRuleDELETE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDELETE = null;


        try {
            // InternalMyDsl.g:1385:47: (iv_ruleDELETE= ruleDELETE EOF )
            // InternalMyDsl.g:1386:2: iv_ruleDELETE= ruleDELETE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDELETERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDELETE=ruleDELETE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDELETE; 
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
    // $ANTLR end "entryRuleDELETE"


    // $ANTLR start "ruleDELETE"
    // InternalMyDsl.g:1392:1: ruleDELETE returns [EObject current=null] : (otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleDELETE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_x_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1398:2: ( (otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) ) ) )
            // InternalMyDsl.g:1399:2: (otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalMyDsl.g:1399:2: (otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) ) )
            // InternalMyDsl.g:1400:3: otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDELETEAccess().getDELETEKeyword_0());
              		
            }
            // InternalMyDsl.g:1404:3: ( (lv_x_1_0= ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:1405:4: (lv_x_1_0= ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:1405:4: (lv_x_1_0= ruleFromAndWhereClauses )
            // InternalMyDsl.g:1406:5: lv_x_1_0= ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDELETEAccess().getXFromAndWhereClausesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_x_1_0=ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDELETERule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_1_0,
              						"mydsl.MyDsl.FromAndWhereClauses");
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
    // $ANTLR end "ruleDELETE"


    // $ANTLR start "entryRuleUPDATE"
    // InternalMyDsl.g:1427:1: entryRuleUPDATE returns [EObject current=null] : iv_ruleUPDATE= ruleUPDATE EOF ;
    public final EObject entryRuleUPDATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUPDATE = null;


        try {
            // InternalMyDsl.g:1427:47: (iv_ruleUPDATE= ruleUPDATE EOF )
            // InternalMyDsl.g:1428:2: iv_ruleUPDATE= ruleUPDATE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPDATERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUPDATE=ruleUPDATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPDATE; 
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
    // $ANTLR end "entryRuleUPDATE"


    // $ANTLR start "ruleUPDATE"
    // InternalMyDsl.g:1434:1: ruleUPDATE returns [EObject current=null] : (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWHERE ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) ) )* )? ) ;
    public final EObject ruleUPDATE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_sc_3_0 = null;

        EObject lv_sc_5_0 = null;

        EObject lv_z_7_0 = null;

        EObject lv_z_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1440:2: ( (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWHERE ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) ) )* )? ) )
            // InternalMyDsl.g:1441:2: (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWHERE ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) ) )* )? )
            {
            // InternalMyDsl.g:1441:2: (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWHERE ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) ) )* )? )
            // InternalMyDsl.g:1442:3: otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWHERE ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) ) )* )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUPDATEAccess().getUPDATEKeyword_0());
              		
            }
            // InternalMyDsl.g:1446:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1447:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1447:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1448:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUPDATERule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getUPDATEAccess().getTableTableNameCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUPDATEAccess().getSETKeyword_2());
              		
            }
            // InternalMyDsl.g:1463:3: ( (lv_sc_3_0= ruleSetClause ) )
            // InternalMyDsl.g:1464:4: (lv_sc_3_0= ruleSetClause )
            {
            // InternalMyDsl.g:1464:4: (lv_sc_3_0= ruleSetClause )
            // InternalMyDsl.g:1465:5: lv_sc_3_0= ruleSetClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUPDATEAccess().getScSetClauseParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_sc_3_0=ruleSetClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUPDATERule());
              					}
              					add(
              						current,
              						"sc",
              						lv_sc_3_0,
              						"mydsl.MyDsl.SetClause");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1482:3: (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1483:4: otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getUPDATEAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalMyDsl.g:1487:4: ( (lv_sc_5_0= ruleSetClause ) )
            	    // InternalMyDsl.g:1488:5: (lv_sc_5_0= ruleSetClause )
            	    {
            	    // InternalMyDsl.g:1488:5: (lv_sc_5_0= ruleSetClause )
            	    // InternalMyDsl.g:1489:6: lv_sc_5_0= ruleSetClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUPDATEAccess().getScSetClauseParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_sc_5_0=ruleSetClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUPDATERule());
            	      						}
            	      						add(
            	      							current,
            	      							"sc",
            	      							lv_sc_5_0,
            	      							"mydsl.MyDsl.SetClause");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalMyDsl.g:1507:3: (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWHERE ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1508:4: otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWHERE ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) ) )*
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getUPDATEAccess().getWHEREKeyword_5_0());
                      			
                    }
                    // InternalMyDsl.g:1512:4: ( (lv_z_7_0= ruleWHERE ) )
                    // InternalMyDsl.g:1513:5: (lv_z_7_0= ruleWHERE )
                    {
                    // InternalMyDsl.g:1513:5: (lv_z_7_0= ruleWHERE )
                    // InternalMyDsl.g:1514:6: lv_z_7_0= ruleWHERE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUPDATEAccess().getZWHEREParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_z_7_0=ruleWHERE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUPDATERule());
                      						}
                      						add(
                      							current,
                      							"z",
                      							lv_z_7_0,
                      							"mydsl.MyDsl.WHERE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyDsl.g:1531:4: ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=18 && LA25_0<=19)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyDsl.g:1532:5: (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWHERE ) )
                    	    {
                    	    // InternalMyDsl.g:1532:5: (otherlv_8= 'AND' | otherlv_9= 'OR' )
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==18) ) {
                    	        alt24=1;
                    	    }
                    	    else if ( (LA24_0==19) ) {
                    	        alt24=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 24, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // InternalMyDsl.g:1533:6: otherlv_8= 'AND'
                    	            {
                    	            otherlv_8=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_8, grammarAccess.getUPDATEAccess().getANDKeyword_5_2_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:1538:6: otherlv_9= 'OR'
                    	            {
                    	            otherlv_9=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_9, grammarAccess.getUPDATEAccess().getORKeyword_5_2_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDsl.g:1543:5: ( (lv_z_10_0= ruleWHERE ) )
                    	    // InternalMyDsl.g:1544:6: (lv_z_10_0= ruleWHERE )
                    	    {
                    	    // InternalMyDsl.g:1544:6: (lv_z_10_0= ruleWHERE )
                    	    // InternalMyDsl.g:1545:7: lv_z_10_0= ruleWHERE
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getUPDATEAccess().getZWHEREParserRuleCall_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_z_10_0=ruleWHERE();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getUPDATERule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"z",
                    	      								lv_z_10_0,
                    	      								"mydsl.MyDsl.WHERE");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


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
    // $ANTLR end "ruleUPDATE"


    // $ANTLR start "entryRuleSetClause"
    // InternalMyDsl.g:1568:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // InternalMyDsl.g:1568:50: (iv_ruleSetClause= ruleSetClause EOF )
            // InternalMyDsl.g:1569:2: iv_ruleSetClause= ruleSetClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetClause; 
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
    // $ANTLR end "entryRuleSetClause"


    // $ANTLR start "ruleSetClause"
    // InternalMyDsl.g:1575:1: ruleSetClause returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_val_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1581:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) ) ) )
            // InternalMyDsl.g:1582:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) ) )
            {
            // InternalMyDsl.g:1582:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:1583:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:1583:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1584:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1584:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1585:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSetClauseRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getColumnCDCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetClauseAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1600:3: ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_INT) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1601:4: (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' )
                    {
                    // InternalMyDsl.g:1601:4: (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' )
                    // InternalMyDsl.g:1602:5: otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_0());
                      				
                    }
                    // InternalMyDsl.g:1606:5: ( (lv_name_3_0= RULE_ID ) )
                    // InternalMyDsl.g:1607:6: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1607:6: (lv_name_3_0= RULE_ID )
                    // InternalMyDsl.g:1608:7: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_3_0, grammarAccess.getSetClauseAccess().getNameIDTerminalRuleCall_2_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getSetClauseRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_3_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1630:4: ( (lv_val_5_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:1630:4: ( (lv_val_5_0= RULE_INT ) )
                    // InternalMyDsl.g:1631:5: (lv_val_5_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1631:5: (lv_val_5_0= RULE_INT )
                    // InternalMyDsl.g:1632:6: lv_val_5_0= RULE_INT
                    {
                    lv_val_5_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_val_5_0, grammarAccess.getSetClauseAccess().getValINTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSetClauseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"val",
                      							lv_val_5_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

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
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRuleALTER"
    // InternalMyDsl.g:1653:1: entryRuleALTER returns [EObject current=null] : iv_ruleALTER= ruleALTER EOF ;
    public final EObject entryRuleALTER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALTER = null;


        try {
            // InternalMyDsl.g:1653:46: (iv_ruleALTER= ruleALTER EOF )
            // InternalMyDsl.g:1654:2: iv_ruleALTER= ruleALTER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALTERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALTER=ruleALTER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALTER; 
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
    // $ANTLR end "entryRuleALTER"


    // $ANTLR start "ruleALTER"
    // InternalMyDsl.g:1660:1: ruleALTER returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE ) ) ) ) ;
    public final EObject ruleALTER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_addDropUpdate_3_1 = null;

        EObject lv_addDropUpdate_3_2 = null;

        EObject lv_addDropUpdate_3_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1666:2: ( (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE ) ) ) ) )
            // InternalMyDsl.g:1667:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE ) ) ) )
            {
            // InternalMyDsl.g:1667:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE ) ) ) )
            // InternalMyDsl.g:1668:3: otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE ) ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getALTERAccess().getALTERKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getALTERAccess().getTABLEKeyword_1());
              		
            }
            // InternalMyDsl.g:1676:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1677:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1677:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1678:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getALTERRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getALTERAccess().getTableTableNameCrossReference_2_0());
              				
            }

            }


            }

            // InternalMyDsl.g:1689:3: ( ( (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE ) ) )
            // InternalMyDsl.g:1690:4: ( (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE ) )
            {
            // InternalMyDsl.g:1690:4: ( (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE ) )
            // InternalMyDsl.g:1691:5: (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE )
            {
            // InternalMyDsl.g:1691:5: (lv_addDropUpdate_3_1= ruleALTERDROP | lv_addDropUpdate_3_2= ruleALTERADD | lv_addDropUpdate_3_3= ruleALTERUPDATE )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt28=1;
                }
                break;
            case 44:
                {
                alt28=2;
                }
                break;
            case 42:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1692:6: lv_addDropUpdate_3_1= ruleALTERDROP
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getALTERAccess().getAddDropUpdateALTERDROPParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_addDropUpdate_3_1=ruleALTERDROP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getALTERRule());
                      						}
                      						set(
                      							current,
                      							"addDropUpdate",
                      							lv_addDropUpdate_3_1,
                      							"mydsl.MyDsl.ALTERDROP");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1708:6: lv_addDropUpdate_3_2= ruleALTERADD
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getALTERAccess().getAddDropUpdateALTERADDParserRuleCall_3_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_addDropUpdate_3_2=ruleALTERADD();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getALTERRule());
                      						}
                      						set(
                      							current,
                      							"addDropUpdate",
                      							lv_addDropUpdate_3_2,
                      							"mydsl.MyDsl.ALTERADD");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1724:6: lv_addDropUpdate_3_3= ruleALTERUPDATE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getALTERAccess().getAddDropUpdateALTERUPDATEParserRuleCall_3_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_addDropUpdate_3_3=ruleALTERUPDATE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getALTERRule());
                      						}
                      						set(
                      							current,
                      							"addDropUpdate",
                      							lv_addDropUpdate_3_3,
                      							"mydsl.MyDsl.ALTERUPDATE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

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
    // $ANTLR end "ruleALTER"


    // $ANTLR start "entryRuleALTERDROP"
    // InternalMyDsl.g:1746:1: entryRuleALTERDROP returns [EObject current=null] : iv_ruleALTERDROP= ruleALTERDROP EOF ;
    public final EObject entryRuleALTERDROP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALTERDROP = null;


        try {
            // InternalMyDsl.g:1746:50: (iv_ruleALTERDROP= ruleALTERDROP EOF )
            // InternalMyDsl.g:1747:2: iv_ruleALTERDROP= ruleALTERDROP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALTERDROPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALTERDROP=ruleALTERDROP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALTERDROP; 
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
    // $ANTLR end "entryRuleALTERDROP"


    // $ANTLR start "ruleALTERDROP"
    // InternalMyDsl.g:1753:1: ruleALTERDROP returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleALTERDROP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1759:2: ( (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:1760:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1760:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:1761:3: otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getALTERDROPAccess().getDROPKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getALTERDROPAccess().getCOLUMNKeyword_1());
              		
            }
            // InternalMyDsl.g:1769:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1770:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1770:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1771:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getALTERDROPRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getALTERDROPAccess().getColumnCDCrossReference_2_0());
              				
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
    // $ANTLR end "ruleALTERDROP"


    // $ANTLR start "entryRuleALTERADD"
    // InternalMyDsl.g:1786:1: entryRuleALTERADD returns [EObject current=null] : iv_ruleALTERADD= ruleALTERADD EOF ;
    public final EObject entryRuleALTERADD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALTERADD = null;


        try {
            // InternalMyDsl.g:1786:49: (iv_ruleALTERADD= ruleALTERADD EOF )
            // InternalMyDsl.g:1787:2: iv_ruleALTERADD= ruleALTERADD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALTERADDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALTERADD=ruleALTERADD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALTERADD; 
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
    // $ANTLR end "entryRuleALTERADD"


    // $ANTLR start "ruleALTERADD"
    // InternalMyDsl.g:1793:1: ruleALTERADD returns [EObject current=null] : (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleALTERADD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1799:2: ( (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1800:2: (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1800:2: (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1801:3: otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getALTERADDAccess().getADDKeyword_0());
              		
            }
            // InternalMyDsl.g:1805:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1806:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1806:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1807:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getALTERADDRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getALTERADDAccess().getColumnCDCrossReference_1_0());
              				
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
    // $ANTLR end "ruleALTERADD"


    // $ANTLR start "entryRuleALTERUPDATE"
    // InternalMyDsl.g:1822:1: entryRuleALTERUPDATE returns [EObject current=null] : iv_ruleALTERUPDATE= ruleALTERUPDATE EOF ;
    public final EObject entryRuleALTERUPDATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALTERUPDATE = null;


        try {
            // InternalMyDsl.g:1822:52: (iv_ruleALTERUPDATE= ruleALTERUPDATE EOF )
            // InternalMyDsl.g:1823:2: iv_ruleALTERUPDATE= ruleALTERUPDATE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALTERUPDATERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALTERUPDATE=ruleALTERUPDATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALTERUPDATE; 
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
    // $ANTLR end "entryRuleALTERUPDATE"


    // $ANTLR start "ruleALTERUPDATE"
    // InternalMyDsl.g:1829:1: ruleALTERUPDATE returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleALTERUPDATE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1835:2: ( (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:1836:2: (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1836:2: (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:1837:3: otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getALTERUPDATEAccess().getALTERKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getALTERUPDATEAccess().getCOLUMNKeyword_1());
              		
            }
            // InternalMyDsl.g:1845:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1846:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1846:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1847:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getALTERUPDATERule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getALTERUPDATEAccess().getColumnCDCrossReference_2_0());
              				
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
    // $ANTLR end "ruleALTERUPDATE"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMyDsl.g:1862:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMyDsl.g:1862:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMyDsl.g:1863:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMyDsl.g:1869:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1875:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:1876:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:1876:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:1877:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
              		
            }
            // InternalMyDsl.g:1881:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1882:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1882:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1883:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalMyDsl.g:1903:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalMyDsl.g:1904:4: (lv_value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:1904:4: (lv_value_3_0= RULE_INT )
            // InternalMyDsl.g:1905:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleSELECTFUNCT"
    // InternalMyDsl.g:1925:1: entryRuleSELECTFUNCT returns [EObject current=null] : iv_ruleSELECTFUNCT= ruleSELECTFUNCT EOF ;
    public final EObject entryRuleSELECTFUNCT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECTFUNCT = null;


        try {
            // InternalMyDsl.g:1925:52: (iv_ruleSELECTFUNCT= ruleSELECTFUNCT EOF )
            // InternalMyDsl.g:1926:2: iv_ruleSELECTFUNCT= ruleSELECTFUNCT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSELECTFUNCTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSELECTFUNCT=ruleSELECTFUNCT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSELECTFUNCT; 
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
    // $ANTLR end "entryRuleSELECTFUNCT"


    // $ANTLR start "ruleSELECTFUNCT"
    // InternalMyDsl.g:1932:1: ruleSELECTFUNCT returns [EObject current=null] : ( ( ( ruleCountFunction )=>this_CountFunction_0= ruleCountFunction ) | this_AvgFunction_1= ruleAvgFunction | this_SumFunction_2= ruleSumFunction | this_MinFunction_3= ruleMinFunction | this_MaxFunction_4= ruleMaxFunction ) ;
    public final EObject ruleSELECTFUNCT() throws RecognitionException {
        EObject current = null;

        EObject this_CountFunction_0 = null;

        EObject this_AvgFunction_1 = null;

        EObject this_SumFunction_2 = null;

        EObject this_MinFunction_3 = null;

        EObject this_MaxFunction_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1938:2: ( ( ( ( ruleCountFunction )=>this_CountFunction_0= ruleCountFunction ) | this_AvgFunction_1= ruleAvgFunction | this_SumFunction_2= ruleSumFunction | this_MinFunction_3= ruleMinFunction | this_MaxFunction_4= ruleMaxFunction ) )
            // InternalMyDsl.g:1939:2: ( ( ( ruleCountFunction )=>this_CountFunction_0= ruleCountFunction ) | this_AvgFunction_1= ruleAvgFunction | this_SumFunction_2= ruleSumFunction | this_MinFunction_3= ruleMinFunction | this_MaxFunction_4= ruleMaxFunction )
            {
            // InternalMyDsl.g:1939:2: ( ( ( ruleCountFunction )=>this_CountFunction_0= ruleCountFunction ) | this_AvgFunction_1= ruleAvgFunction | this_SumFunction_2= ruleSumFunction | this_MinFunction_3= ruleMinFunction | this_MaxFunction_4= ruleMaxFunction )
            int alt29=5;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==50) ) {
                    alt29=5;
                }
                else if ( (LA29_1==47) ) {
                    alt29=2;
                }
                else if ( (LA29_1==48) ) {
                    alt29=3;
                }
                else if ( (LA29_1==49) ) {
                    alt29=4;
                }
                else if ( (LA29_1==46) && (synpred1_InternalMyDsl())) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1940:3: ( ( ruleCountFunction )=>this_CountFunction_0= ruleCountFunction )
                    {
                    // InternalMyDsl.g:1940:3: ( ( ruleCountFunction )=>this_CountFunction_0= ruleCountFunction )
                    // InternalMyDsl.g:1941:4: ( ruleCountFunction )=>this_CountFunction_0= ruleCountFunction
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSELECTFUNCTAccess().getCountFunctionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_CountFunction_0=ruleCountFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CountFunction_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1952:3: this_AvgFunction_1= ruleAvgFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSELECTFUNCTAccess().getAvgFunctionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AvgFunction_1=ruleAvgFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AvgFunction_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1961:3: this_SumFunction_2= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSELECTFUNCTAccess().getSumFunctionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SumFunction_2=ruleSumFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SumFunction_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1970:3: this_MinFunction_3= ruleMinFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSELECTFUNCTAccess().getMinFunctionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MinFunction_3=ruleMinFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MinFunction_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1979:3: this_MaxFunction_4= ruleMaxFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSELECTFUNCTAccess().getMaxFunctionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MaxFunction_4=ruleMaxFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MaxFunction_4;
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
    // $ANTLR end "ruleSELECTFUNCT"


    // $ANTLR start "entryRuleCountFunction"
    // InternalMyDsl.g:1991:1: entryRuleCountFunction returns [EObject current=null] : iv_ruleCountFunction= ruleCountFunction EOF ;
    public final EObject entryRuleCountFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountFunction = null;


        try {
            // InternalMyDsl.g:1991:54: (iv_ruleCountFunction= ruleCountFunction EOF )
            // InternalMyDsl.g:1992:2: iv_ruleCountFunction= ruleCountFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCountFunction=ruleCountFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCountFunction; 
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
    // $ANTLR end "entryRuleCountFunction"


    // $ANTLR start "ruleCountFunction"
    // InternalMyDsl.g:1998:1: ruleCountFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleCountFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2004:2: ( (otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalMyDsl.g:2005:2: (otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalMyDsl.g:2005:2: (otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalMyDsl.g:2006:3: otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCountFunctionAccess().getSELECTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCountFunctionAccess().getCOUNTKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCountFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMyDsl.g:2018:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:2019:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:2019:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:2020:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCountFunctionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getCountFunctionAccess().getColumnCDCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCountFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMyDsl.g:2035:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:2036:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:2036:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalMyDsl.g:2037:5: lv_x_5_0= ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCountFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCountFunctionRule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_5_0,
              						"mydsl.MyDsl.FromAndWhereClauses");
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
    // $ANTLR end "ruleCountFunction"


    // $ANTLR start "entryRuleAvgFunction"
    // InternalMyDsl.g:2058:1: entryRuleAvgFunction returns [EObject current=null] : iv_ruleAvgFunction= ruleAvgFunction EOF ;
    public final EObject entryRuleAvgFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgFunction = null;


        try {
            // InternalMyDsl.g:2058:52: (iv_ruleAvgFunction= ruleAvgFunction EOF )
            // InternalMyDsl.g:2059:2: iv_ruleAvgFunction= ruleAvgFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAvgFunction=ruleAvgFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgFunction; 
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
    // $ANTLR end "entryRuleAvgFunction"


    // $ANTLR start "ruleAvgFunction"
    // InternalMyDsl.g:2065:1: ruleAvgFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleAvgFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2071:2: ( (otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalMyDsl.g:2072:2: (otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalMyDsl.g:2072:2: (otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalMyDsl.g:2073:3: otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAvgFunctionAccess().getSELECTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAvgFunctionAccess().getAVGKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAvgFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMyDsl.g:2085:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:2086:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:2086:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:2087:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAvgFunctionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getAvgFunctionAccess().getColumnCDCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAvgFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMyDsl.g:2102:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:2103:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:2103:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalMyDsl.g:2104:5: lv_x_5_0= ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAvgFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAvgFunctionRule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_5_0,
              						"mydsl.MyDsl.FromAndWhereClauses");
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
    // $ANTLR end "ruleAvgFunction"


    // $ANTLR start "entryRuleSumFunction"
    // InternalMyDsl.g:2125:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // InternalMyDsl.g:2125:52: (iv_ruleSumFunction= ruleSumFunction EOF )
            // InternalMyDsl.g:2126:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
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
    // $ANTLR end "entryRuleSumFunction"


    // $ANTLR start "ruleSumFunction"
    // InternalMyDsl.g:2132:1: ruleSumFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleSumFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2138:2: ( (otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalMyDsl.g:2139:2: (otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalMyDsl.g:2139:2: (otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalMyDsl.g:2140:3: otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSumFunctionAccess().getSELECTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,48,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getSUMKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMyDsl.g:2152:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:2153:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:2153:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:2154:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSumFunctionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getColumnCDCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSumFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMyDsl.g:2169:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:2170:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:2170:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalMyDsl.g:2171:5: lv_x_5_0= ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSumFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSumFunctionRule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_5_0,
              						"mydsl.MyDsl.FromAndWhereClauses");
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
    // $ANTLR end "ruleSumFunction"


    // $ANTLR start "entryRuleMinFunction"
    // InternalMyDsl.g:2192:1: entryRuleMinFunction returns [EObject current=null] : iv_ruleMinFunction= ruleMinFunction EOF ;
    public final EObject entryRuleMinFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinFunction = null;


        try {
            // InternalMyDsl.g:2192:52: (iv_ruleMinFunction= ruleMinFunction EOF )
            // InternalMyDsl.g:2193:2: iv_ruleMinFunction= ruleMinFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMinFunction=ruleMinFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinFunction; 
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
    // $ANTLR end "entryRuleMinFunction"


    // $ANTLR start "ruleMinFunction"
    // InternalMyDsl.g:2199:1: ruleMinFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleMinFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2205:2: ( (otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalMyDsl.g:2206:2: (otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalMyDsl.g:2206:2: (otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalMyDsl.g:2207:3: otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMinFunctionAccess().getSELECTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMinFunctionAccess().getMINKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMinFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMyDsl.g:2219:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:2220:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:2220:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:2221:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMinFunctionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getMinFunctionAccess().getColumnCDCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMinFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMyDsl.g:2236:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:2237:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:2237:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalMyDsl.g:2238:5: lv_x_5_0= ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMinFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMinFunctionRule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_5_0,
              						"mydsl.MyDsl.FromAndWhereClauses");
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
    // $ANTLR end "ruleMinFunction"


    // $ANTLR start "entryRuleMaxFunction"
    // InternalMyDsl.g:2259:1: entryRuleMaxFunction returns [EObject current=null] : iv_ruleMaxFunction= ruleMaxFunction EOF ;
    public final EObject entryRuleMaxFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxFunction = null;


        try {
            // InternalMyDsl.g:2259:52: (iv_ruleMaxFunction= ruleMaxFunction EOF )
            // InternalMyDsl.g:2260:2: iv_ruleMaxFunction= ruleMaxFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMaxFunction=ruleMaxFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxFunction; 
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
    // $ANTLR end "entryRuleMaxFunction"


    // $ANTLR start "ruleMaxFunction"
    // InternalMyDsl.g:2266:1: ruleMaxFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleMaxFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2272:2: ( (otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalMyDsl.g:2273:2: (otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalMyDsl.g:2273:2: (otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalMyDsl.g:2274:3: otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMaxFunctionAccess().getSELECTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,50,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMaxFunctionAccess().getMAXKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMaxFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMyDsl.g:2286:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:2287:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:2287:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:2288:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMaxFunctionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getMaxFunctionAccess().getColumnCDCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMaxFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalMyDsl.g:2303:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalMyDsl.g:2304:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalMyDsl.g:2304:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalMyDsl.g:2305:5: lv_x_5_0= ruleFromAndWhereClauses
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMaxFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMaxFunctionRule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_5_0,
              						"mydsl.MyDsl.FromAndWhereClauses");
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
    // $ANTLR end "ruleMaxFunction"


    // $ANTLR start "entryRuleINSERT"
    // InternalMyDsl.g:2326:1: entryRuleINSERT returns [EObject current=null] : iv_ruleINSERT= ruleINSERT EOF ;
    public final EObject entryRuleINSERT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSERT = null;


        try {
            // InternalMyDsl.g:2326:47: (iv_ruleINSERT= ruleINSERT EOF )
            // InternalMyDsl.g:2327:2: iv_ruleINSERT= ruleINSERT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINSERTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleINSERT=ruleINSERT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINSERT; 
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
    // $ANTLR end "entryRuleINSERT"


    // $ANTLR start "ruleINSERT"
    // InternalMyDsl.g:2333:1: ruleINSERT returns [EObject current=null] : (otherlv_0= 'INSERT' otherlv_1= 'INTO' ( (lv_nameT_2_0= RULE_ID ) ) otherlv_3= 'VALUES' otherlv_4= '(' ( (lv_literals_5_0= ruleDATATYPE ) )* otherlv_6= ')' ) ;
    public final EObject ruleINSERT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nameT_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_literals_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2339:2: ( (otherlv_0= 'INSERT' otherlv_1= 'INTO' ( (lv_nameT_2_0= RULE_ID ) ) otherlv_3= 'VALUES' otherlv_4= '(' ( (lv_literals_5_0= ruleDATATYPE ) )* otherlv_6= ')' ) )
            // InternalMyDsl.g:2340:2: (otherlv_0= 'INSERT' otherlv_1= 'INTO' ( (lv_nameT_2_0= RULE_ID ) ) otherlv_3= 'VALUES' otherlv_4= '(' ( (lv_literals_5_0= ruleDATATYPE ) )* otherlv_6= ')' )
            {
            // InternalMyDsl.g:2340:2: (otherlv_0= 'INSERT' otherlv_1= 'INTO' ( (lv_nameT_2_0= RULE_ID ) ) otherlv_3= 'VALUES' otherlv_4= '(' ( (lv_literals_5_0= ruleDATATYPE ) )* otherlv_6= ')' )
            // InternalMyDsl.g:2341:3: otherlv_0= 'INSERT' otherlv_1= 'INTO' ( (lv_nameT_2_0= RULE_ID ) ) otherlv_3= 'VALUES' otherlv_4= '(' ( (lv_literals_5_0= ruleDATATYPE ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getINSERTAccess().getINSERTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,52,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getINSERTAccess().getINTOKeyword_1());
              		
            }
            // InternalMyDsl.g:2349:3: ( (lv_nameT_2_0= RULE_ID ) )
            // InternalMyDsl.g:2350:4: (lv_nameT_2_0= RULE_ID )
            {
            // InternalMyDsl.g:2350:4: (lv_nameT_2_0= RULE_ID )
            // InternalMyDsl.g:2351:5: lv_nameT_2_0= RULE_ID
            {
            lv_nameT_2_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_nameT_2_0, grammarAccess.getINSERTAccess().getNameTIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getINSERTRule());
              					}
              					setWithLastConsumed(
              						current,
              						"nameT",
              						lv_nameT_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getINSERTAccess().getVALUESKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,31,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getINSERTAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalMyDsl.g:2375:3: ( (lv_literals_5_0= ruleDATATYPE ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=54 && LA30_0<=60)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:2376:4: (lv_literals_5_0= ruleDATATYPE )
            	    {
            	    // InternalMyDsl.g:2376:4: (lv_literals_5_0= ruleDATATYPE )
            	    // InternalMyDsl.g:2377:5: lv_literals_5_0= ruleDATATYPE
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getINSERTAccess().getLiteralsDATATYPEEnumRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_literals_5_0=ruleDATATYPE();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getINSERTRule());
            	      					}
            	      					add(
            	      						current,
            	      						"literals",
            	      						lv_literals_5_0,
            	      						"mydsl.MyDsl.DATATYPE");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getINSERTAccess().getRightParenthesisKeyword_6());
              		
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
    // $ANTLR end "ruleINSERT"


    // $ANTLR start "ruleDATATYPE"
    // InternalMyDsl.g:2402:1: ruleDATATYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) ) ;
    public final Enumerator ruleDATATYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2408:2: ( ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) ) )
            // InternalMyDsl.g:2409:2: ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) )
            {
            // InternalMyDsl.g:2409:2: ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt31=1;
                }
                break;
            case 55:
                {
                alt31=2;
                }
                break;
            case 56:
                {
                alt31=3;
                }
                break;
            case 57:
                {
                alt31=4;
                }
                break;
            case 58:
                {
                alt31=5;
                }
                break;
            case 59:
                {
                alt31=6;
                }
                break;
            case 60:
                {
                alt31=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2410:3: (enumLiteral_0= 'VARCHAR' )
                    {
                    // InternalMyDsl.g:2410:3: (enumLiteral_0= 'VARCHAR' )
                    // InternalMyDsl.g:2411:4: enumLiteral_0= 'VARCHAR'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDATATYPEAccess().getVARCHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDATATYPEAccess().getVARCHAREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2418:3: (enumLiteral_1= 'char' )
                    {
                    // InternalMyDsl.g:2418:3: (enumLiteral_1= 'char' )
                    // InternalMyDsl.g:2419:4: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDATATYPEAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDATATYPEAccess().getCHAREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2426:3: (enumLiteral_2= 'date' )
                    {
                    // InternalMyDsl.g:2426:3: (enumLiteral_2= 'date' )
                    // InternalMyDsl.g:2427:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDATATYPEAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDATATYPEAccess().getDATEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2434:3: (enumLiteral_3= 'int' )
                    {
                    // InternalMyDsl.g:2434:3: (enumLiteral_3= 'int' )
                    // InternalMyDsl.g:2435:4: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDATATYPEAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDATATYPEAccess().getINTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2442:3: (enumLiteral_4= 'float' )
                    {
                    // InternalMyDsl.g:2442:3: (enumLiteral_4= 'float' )
                    // InternalMyDsl.g:2443:4: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDATATYPEAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDATATYPEAccess().getFLOATEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2450:3: (enumLiteral_5= 'time' )
                    {
                    // InternalMyDsl.g:2450:3: (enumLiteral_5= 'time' )
                    // InternalMyDsl.g:2451:4: enumLiteral_5= 'time'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDATATYPEAccess().getTIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDATATYPEAccess().getTIMEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2458:3: (enumLiteral_6= 'text' )
                    {
                    // InternalMyDsl.g:2458:3: (enumLiteral_6= 'text' )
                    // InternalMyDsl.g:2459:4: enumLiteral_6= 'text'
                    {
                    enumLiteral_6=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDATATYPEAccess().getTEXTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDATATYPEAccess().getTEXTEnumLiteralDeclaration_6());
                      			
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
    // $ANTLR end "ruleDATATYPE"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1941:4: ( ruleCountFunction )
        // InternalMyDsl.g:1941:5: ruleCountFunction
        {
        pushFollow(FOLLOW_2);
        ruleCountFunction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // Delegated rules

    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
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
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\15\1\35\2\uffff\1\5\11\uffff";
    static final String dfa_3s = "\1\63\1\36\2\uffff\1\62\11\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\13\1\12\1\1\1\11\1\4";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\16\uffff\1\1\10\uffff\1\6\1\7\1\5\1\10\1\uffff\1\2\2\uffff\1\11\5\uffff\1\3",
            "\1\12\1\13",
            "",
            "",
            "\1\15\10\uffff\1\15\1\uffff\1\15\35\uffff\5\14",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:2: (this_CREATE_0= ruleCREATE | this_ALTER_1= ruleALTER | this_INSERT_2= ruleINSERT | this_SELECT_3= ruleSELECT | this_DELETE_4= ruleDELETE | this_DROPTABLE_5= ruleDROPTABLE | this_TRUNCATE_6= ruleTRUNCATE | this_UPDATE_7= ruleUPDATE | this_SELECTFUNCT_8= ruleSELECTFUNCT | this_DATABASE_9= ruleDATABASE | this_VariableDeclaration_10= ruleVariableDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000825E010002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000A00000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000B00008020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1FC0000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000142000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1FC0000100000000L});

}