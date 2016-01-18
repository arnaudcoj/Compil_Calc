package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.CalculatriceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalculatriceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENTIER", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ENTIER=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalCalculatriceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCalculatriceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCalculatriceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCalculatrice.g"; }



     	private CalculatriceGrammarAccess grammarAccess;

        public InternalCalculatriceParser(TokenStream input, CalculatriceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CalculatriceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCalculatrice.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCalculatrice.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCalculatrice.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCalculatrice.g:71:1: ruleModel returns [EObject current=null] : ( (lv_formule_0_0= ruleFormule ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_formule_0_0 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:77:2: ( ( (lv_formule_0_0= ruleFormule ) ) )
            // InternalCalculatrice.g:78:2: ( (lv_formule_0_0= ruleFormule ) )
            {
            // InternalCalculatrice.g:78:2: ( (lv_formule_0_0= ruleFormule ) )
            // InternalCalculatrice.g:79:3: (lv_formule_0_0= ruleFormule )
            {
            // InternalCalculatrice.g:79:3: (lv_formule_0_0= ruleFormule )
            // InternalCalculatrice.g:80:4: lv_formule_0_0= ruleFormule
            {

            				newCompositeNode(grammarAccess.getModelAccess().getFormuleFormuleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_formule_0_0=ruleFormule();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"formule",
            					lv_formule_0_0,
            					"org.xtext.example.mydsl.Calculatrice.Formule");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFormule"
    // InternalCalculatrice.g:100:1: entryRuleFormule returns [String current=null] : iv_ruleFormule= ruleFormule EOF ;
    public final String entryRuleFormule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFormule = null;


        try {
            // InternalCalculatrice.g:100:47: (iv_ruleFormule= ruleFormule EOF )
            // InternalCalculatrice.g:101:2: iv_ruleFormule= ruleFormule EOF
            {
             newCompositeNode(grammarAccess.getFormuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormule=ruleFormule();

            state._fsp--;

             current =iv_ruleFormule.getText(); 
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
    // $ANTLR end "entryRuleFormule"


    // $ANTLR start "ruleFormule"
    // InternalCalculatrice.g:107:1: ruleFormule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Terme_0= ruleTerme this_Expr_1= ruleExpr ) ;
    public final AntlrDatatypeRuleToken ruleFormule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Terme_0 = null;

        AntlrDatatypeRuleToken this_Expr_1 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:113:2: ( (this_Terme_0= ruleTerme this_Expr_1= ruleExpr ) )
            // InternalCalculatrice.g:114:2: (this_Terme_0= ruleTerme this_Expr_1= ruleExpr )
            {
            // InternalCalculatrice.g:114:2: (this_Terme_0= ruleTerme this_Expr_1= ruleExpr )
            // InternalCalculatrice.g:115:3: this_Terme_0= ruleTerme this_Expr_1= ruleExpr
            {

            			newCompositeNode(grammarAccess.getFormuleAccess().getTermeParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_Terme_0=ruleTerme();

            state._fsp--;


            			current.merge(this_Terme_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getFormuleAccess().getExprParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Expr_1=ruleExpr();

            state._fsp--;


            			current.merge(this_Expr_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleFormule"


    // $ANTLR start "entryRuleExpr"
    // InternalCalculatrice.g:139:1: entryRuleExpr returns [String current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final String entryRuleExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpr = null;


        try {
            // InternalCalculatrice.g:139:44: (iv_ruleExpr= ruleExpr EOF )
            // InternalCalculatrice.g:140:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr.getText(); 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalCalculatrice.g:146:1: ruleExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' ) this_Terme_2= ruleTerme this_Expr_3= ruleExpr )? ;
    public final AntlrDatatypeRuleToken ruleExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Terme_2 = null;

        AntlrDatatypeRuleToken this_Expr_3 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:152:2: ( ( (kw= '+' | kw= '-' ) this_Terme_2= ruleTerme this_Expr_3= ruleExpr )? )
            // InternalCalculatrice.g:153:2: ( (kw= '+' | kw= '-' ) this_Terme_2= ruleTerme this_Expr_3= ruleExpr )?
            {
            // InternalCalculatrice.g:153:2: ( (kw= '+' | kw= '-' ) this_Terme_2= ruleTerme this_Expr_3= ruleExpr )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCalculatrice.g:154:3: (kw= '+' | kw= '-' ) this_Terme_2= ruleTerme this_Expr_3= ruleExpr
                    {
                    // InternalCalculatrice.g:154:3: (kw= '+' | kw= '-' )
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
                            // InternalCalculatrice.g:155:4: kw= '+'
                            {
                            kw=(Token)match(input,12,FOLLOW_4); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getExprAccess().getPlusSignKeyword_0_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalCalculatrice.g:161:4: kw= '-'
                            {
                            kw=(Token)match(input,13,FOLLOW_4); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getExprAccess().getHyphenMinusKeyword_0_1());
                            			

                            }
                            break;

                    }


                    			newCompositeNode(grammarAccess.getExprAccess().getTermeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_3);
                    this_Terme_2=ruleTerme();

                    state._fsp--;


                    			current.merge(this_Terme_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    			newCompositeNode(grammarAccess.getExprAccess().getExprParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expr_3=ruleExpr();

                    state._fsp--;


                    			current.merge(this_Expr_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleTerme"
    // InternalCalculatrice.g:191:1: entryRuleTerme returns [String current=null] : iv_ruleTerme= ruleTerme EOF ;
    public final String entryRuleTerme() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerme = null;


        try {
            // InternalCalculatrice.g:191:45: (iv_ruleTerme= ruleTerme EOF )
            // InternalCalculatrice.g:192:2: iv_ruleTerme= ruleTerme EOF
            {
             newCompositeNode(grammarAccess.getTermeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerme=ruleTerme();

            state._fsp--;

             current =iv_ruleTerme.getText(); 
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
    // $ANTLR end "entryRuleTerme"


    // $ANTLR start "ruleTerme"
    // InternalCalculatrice.g:198:1: ruleTerme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Facteur_0= ruleFacteur this_Termep_1= ruleTermep ) ;
    public final AntlrDatatypeRuleToken ruleTerme() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Facteur_0 = null;

        AntlrDatatypeRuleToken this_Termep_1 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:204:2: ( (this_Facteur_0= ruleFacteur this_Termep_1= ruleTermep ) )
            // InternalCalculatrice.g:205:2: (this_Facteur_0= ruleFacteur this_Termep_1= ruleTermep )
            {
            // InternalCalculatrice.g:205:2: (this_Facteur_0= ruleFacteur this_Termep_1= ruleTermep )
            // InternalCalculatrice.g:206:3: this_Facteur_0= ruleFacteur this_Termep_1= ruleTermep
            {

            			newCompositeNode(grammarAccess.getTermeAccess().getFacteurParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Facteur_0=ruleFacteur();

            state._fsp--;


            			current.merge(this_Facteur_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getTermeAccess().getTermepParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Termep_1=ruleTermep();

            state._fsp--;


            			current.merge(this_Termep_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleTerme"


    // $ANTLR start "entryRuleTermep"
    // InternalCalculatrice.g:230:1: entryRuleTermep returns [String current=null] : iv_ruleTermep= ruleTermep EOF ;
    public final String entryRuleTermep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTermep = null;


        try {
            // InternalCalculatrice.g:230:46: (iv_ruleTermep= ruleTermep EOF )
            // InternalCalculatrice.g:231:2: iv_ruleTermep= ruleTermep EOF
            {
             newCompositeNode(grammarAccess.getTermepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermep=ruleTermep();

            state._fsp--;

             current =iv_ruleTermep.getText(); 
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
    // $ANTLR end "entryRuleTermep"


    // $ANTLR start "ruleTermep"
    // InternalCalculatrice.g:237:1: ruleTermep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' | kw= '/' ) this_Facteur_2= ruleFacteur this_Termep_3= ruleTermep )? ;
    public final AntlrDatatypeRuleToken ruleTermep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Facteur_2 = null;

        AntlrDatatypeRuleToken this_Termep_3 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:243:2: ( ( (kw= '*' | kw= '/' ) this_Facteur_2= ruleFacteur this_Termep_3= ruleTermep )? )
            // InternalCalculatrice.g:244:2: ( (kw= '*' | kw= '/' ) this_Facteur_2= ruleFacteur this_Termep_3= ruleTermep )?
            {
            // InternalCalculatrice.g:244:2: ( (kw= '*' | kw= '/' ) this_Facteur_2= ruleFacteur this_Termep_3= ruleTermep )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCalculatrice.g:245:3: (kw= '*' | kw= '/' ) this_Facteur_2= ruleFacteur this_Termep_3= ruleTermep
                    {
                    // InternalCalculatrice.g:245:3: (kw= '*' | kw= '/' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==15) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCalculatrice.g:246:4: kw= '*'
                            {
                            kw=(Token)match(input,14,FOLLOW_4); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getTermepAccess().getAsteriskKeyword_0_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalCalculatrice.g:252:4: kw= '/'
                            {
                            kw=(Token)match(input,15,FOLLOW_4); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getTermepAccess().getSolidusKeyword_0_1());
                            			

                            }
                            break;

                    }


                    			newCompositeNode(grammarAccess.getTermepAccess().getFacteurParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_5);
                    this_Facteur_2=ruleFacteur();

                    state._fsp--;


                    			current.merge(this_Facteur_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    			newCompositeNode(grammarAccess.getTermepAccess().getTermepParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Termep_3=ruleTermep();

                    state._fsp--;


                    			current.merge(this_Termep_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTermep"


    // $ANTLR start "entryRuleFacteur"
    // InternalCalculatrice.g:282:1: entryRuleFacteur returns [String current=null] : iv_ruleFacteur= ruleFacteur EOF ;
    public final String entryRuleFacteur() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFacteur = null;


        try {
            // InternalCalculatrice.g:282:47: (iv_ruleFacteur= ruleFacteur EOF )
            // InternalCalculatrice.g:283:2: iv_ruleFacteur= ruleFacteur EOF
            {
             newCompositeNode(grammarAccess.getFacteurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacteur=ruleFacteur();

            state._fsp--;

             current =iv_ruleFacteur.getText(); 
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
    // $ANTLR end "entryRuleFacteur"


    // $ANTLR start "ruleFacteur"
    // InternalCalculatrice.g:289:1: ruleFacteur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_Formule_1= ruleFormule kw= ')' ) | this_Entier_3= RULE_ENTIER ) ;
    public final AntlrDatatypeRuleToken ruleFacteur() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Entier_3=null;
        AntlrDatatypeRuleToken this_Formule_1 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:295:2: ( ( (kw= '(' this_Formule_1= ruleFormule kw= ')' ) | this_Entier_3= RULE_ENTIER ) )
            // InternalCalculatrice.g:296:2: ( (kw= '(' this_Formule_1= ruleFormule kw= ')' ) | this_Entier_3= RULE_ENTIER )
            {
            // InternalCalculatrice.g:296:2: ( (kw= '(' this_Formule_1= ruleFormule kw= ')' ) | this_Entier_3= RULE_ENTIER )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ENTIER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCalculatrice.g:297:3: (kw= '(' this_Formule_1= ruleFormule kw= ')' )
                    {
                    // InternalCalculatrice.g:297:3: (kw= '(' this_Formule_1= ruleFormule kw= ')' )
                    // InternalCalculatrice.g:298:4: kw= '(' this_Formule_1= ruleFormule kw= ')'
                    {
                    kw=(Token)match(input,16,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFacteurAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getFacteurAccess().getFormuleParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Formule_1=ruleFormule();

                    state._fsp--;


                    				current.merge(this_Formule_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFacteurAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:320:3: this_Entier_3= RULE_ENTIER
                    {
                    this_Entier_3=(Token)match(input,RULE_ENTIER,FOLLOW_2); 

                    			current.merge(this_Entier_3);
                    		

                    			newLeafNode(this_Entier_3, grammarAccess.getFacteurAccess().getEntierTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleFacteur"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});

}