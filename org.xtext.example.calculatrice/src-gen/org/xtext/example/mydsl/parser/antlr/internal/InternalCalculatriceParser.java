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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'bool'", "'='", "'var'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'if'", "'then'", "'else'", "'end'", "'&&'", "'||'", "'true'", "'false'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "Calculatrice";
       	}

       	@Override
       	protected CalculatriceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCalculatrice"
    // InternalCalculatrice.g:64:1: entryRuleCalculatrice returns [EObject current=null] : iv_ruleCalculatrice= ruleCalculatrice EOF ;
    public final EObject entryRuleCalculatrice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculatrice = null;


        try {
            // InternalCalculatrice.g:64:53: (iv_ruleCalculatrice= ruleCalculatrice EOF )
            // InternalCalculatrice.g:65:2: iv_ruleCalculatrice= ruleCalculatrice EOF
            {
             newCompositeNode(grammarAccess.getCalculatriceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalculatrice=ruleCalculatrice();

            state._fsp--;

             current =iv_ruleCalculatrice; 
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
    // $ANTLR end "entryRuleCalculatrice"


    // $ANTLR start "ruleCalculatrice"
    // InternalCalculatrice.g:71:1: ruleCalculatrice returns [EObject current=null] : ( ( (lv_calculs_0_0= ruleCalc ) ) otherlv_1= '\\n' )* ;
    public final EObject ruleCalculatrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_calculs_0_0 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:77:2: ( ( ( (lv_calculs_0_0= ruleCalc ) ) otherlv_1= '\\n' )* )
            // InternalCalculatrice.g:78:2: ( ( (lv_calculs_0_0= ruleCalc ) ) otherlv_1= '\\n' )*
            {
            // InternalCalculatrice.g:78:2: ( ( (lv_calculs_0_0= ruleCalc ) ) otherlv_1= '\\n' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==12||LA1_0==14||LA1_0==16||LA1_0==19||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculatrice.g:79:3: ( (lv_calculs_0_0= ruleCalc ) ) otherlv_1= '\\n'
            	    {
            	    // InternalCalculatrice.g:79:3: ( (lv_calculs_0_0= ruleCalc ) )
            	    // InternalCalculatrice.g:80:4: (lv_calculs_0_0= ruleCalc )
            	    {
            	    // InternalCalculatrice.g:80:4: (lv_calculs_0_0= ruleCalc )
            	    // InternalCalculatrice.g:81:5: lv_calculs_0_0= ruleCalc
            	    {

            	    					newCompositeNode(grammarAccess.getCalculatriceAccess().getCalculsCalcParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_calculs_0_0=ruleCalc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCalculatriceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"calculs",
            	    						lv_calculs_0_0,
            	    						"org.xtext.example.mydsl.Calculatrice.Calc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	    			newLeafNode(otherlv_1, grammarAccess.getCalculatriceAccess().getControl000aKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleCalculatrice"


    // $ANTLR start "entryRuleCalc"
    // InternalCalculatrice.g:106:1: entryRuleCalc returns [EObject current=null] : iv_ruleCalc= ruleCalc EOF ;
    public final EObject entryRuleCalc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalc = null;


        try {
            // InternalCalculatrice.g:106:45: (iv_ruleCalc= ruleCalc EOF )
            // InternalCalculatrice.g:107:2: iv_ruleCalc= ruleCalc EOF
            {
             newCompositeNode(grammarAccess.getCalcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalc=ruleCalc();

            state._fsp--;

             current =iv_ruleCalc; 
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
    // $ANTLR end "entryRuleCalc"


    // $ANTLR start "ruleCalc"
    // InternalCalculatrice.g:113:1: ruleCalc returns [EObject current=null] : ( (otherlv_0= 'bool' ( (lv_boolName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_b_3_0= ruleBoolExpr ) ) ) | this_Condition_4= ruleCondition | ( ( ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '=' )? ( (lv_e_8_0= ruleCalcExpr ) ) ) ) ;
    public final EObject ruleCalc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_boolName_1_0=null;
        Token otherlv_2=null;
        Token lv_decl_5_0=null;
        Token lv_varName_6_0=null;
        Token otherlv_7=null;
        EObject lv_b_3_0 = null;

        EObject this_Condition_4 = null;

        EObject lv_e_8_0 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:119:2: ( ( (otherlv_0= 'bool' ( (lv_boolName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_b_3_0= ruleBoolExpr ) ) ) | this_Condition_4= ruleCondition | ( ( ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '=' )? ( (lv_e_8_0= ruleCalcExpr ) ) ) ) )
            // InternalCalculatrice.g:120:2: ( (otherlv_0= 'bool' ( (lv_boolName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_b_3_0= ruleBoolExpr ) ) ) | this_Condition_4= ruleCondition | ( ( ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '=' )? ( (lv_e_8_0= ruleCalcExpr ) ) ) )
            {
            // InternalCalculatrice.g:120:2: ( (otherlv_0= 'bool' ( (lv_boolName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_b_3_0= ruleBoolExpr ) ) ) | this_Condition_4= ruleCondition | ( ( ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '=' )? ( (lv_e_8_0= ruleCalcExpr ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 14:
            case 16:
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCalculatrice.g:121:3: (otherlv_0= 'bool' ( (lv_boolName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_b_3_0= ruleBoolExpr ) ) )
                    {
                    // InternalCalculatrice.g:121:3: (otherlv_0= 'bool' ( (lv_boolName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_b_3_0= ruleBoolExpr ) ) )
                    // InternalCalculatrice.g:122:4: otherlv_0= 'bool' ( (lv_boolName_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_b_3_0= ruleBoolExpr ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getCalcAccess().getBoolKeyword_0_0());
                    			
                    // InternalCalculatrice.g:126:4: ( (lv_boolName_1_0= RULE_ID ) )
                    // InternalCalculatrice.g:127:5: (lv_boolName_1_0= RULE_ID )
                    {
                    // InternalCalculatrice.g:127:5: (lv_boolName_1_0= RULE_ID )
                    // InternalCalculatrice.g:128:6: lv_boolName_1_0= RULE_ID
                    {
                    lv_boolName_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_boolName_1_0, grammarAccess.getCalcAccess().getBoolNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCalcRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"boolName",
                    							lv_boolName_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getCalcAccess().getEqualsSignKeyword_0_2());
                    			
                    // InternalCalculatrice.g:148:4: ( (lv_b_3_0= ruleBoolExpr ) )
                    // InternalCalculatrice.g:149:5: (lv_b_3_0= ruleBoolExpr )
                    {
                    // InternalCalculatrice.g:149:5: (lv_b_3_0= ruleBoolExpr )
                    // InternalCalculatrice.g:150:6: lv_b_3_0= ruleBoolExpr
                    {

                    						newCompositeNode(grammarAccess.getCalcAccess().getBBoolExprParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_b_3_0=ruleBoolExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalcRule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_3_0,
                    							"org.xtext.example.mydsl.Calculatrice.BoolExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:169:3: this_Condition_4= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getCalcAccess().getConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_4=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCalculatrice.g:178:3: ( ( ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '=' )? ( (lv_e_8_0= ruleCalcExpr ) ) )
                    {
                    // InternalCalculatrice.g:178:3: ( ( ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '=' )? ( (lv_e_8_0= ruleCalcExpr ) ) )
                    // InternalCalculatrice.g:179:4: ( ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '=' )? ( (lv_e_8_0= ruleCalcExpr ) )
                    {
                    // InternalCalculatrice.g:179:4: ( ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '=' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==RULE_ID) ) {
                        int LA3_2 = input.LA(2);

                        if ( (LA3_2==13) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCalculatrice.g:180:5: ( (lv_decl_5_0= 'var' ) )? ( (lv_varName_6_0= RULE_ID ) ) otherlv_7= '='
                            {
                            // InternalCalculatrice.g:180:5: ( (lv_decl_5_0= 'var' ) )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==14) ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // InternalCalculatrice.g:181:6: (lv_decl_5_0= 'var' )
                                    {
                                    // InternalCalculatrice.g:181:6: (lv_decl_5_0= 'var' )
                                    // InternalCalculatrice.g:182:7: lv_decl_5_0= 'var'
                                    {
                                    lv_decl_5_0=(Token)match(input,14,FOLLOW_5); 

                                    							newLeafNode(lv_decl_5_0, grammarAccess.getCalcAccess().getDeclVarKeyword_2_0_0_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getCalcRule());
                                    							}
                                    							setWithLastConsumed(current, "decl", true, "var");
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalCalculatrice.g:194:5: ( (lv_varName_6_0= RULE_ID ) )
                            // InternalCalculatrice.g:195:6: (lv_varName_6_0= RULE_ID )
                            {
                            // InternalCalculatrice.g:195:6: (lv_varName_6_0= RULE_ID )
                            // InternalCalculatrice.g:196:7: lv_varName_6_0= RULE_ID
                            {
                            lv_varName_6_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                            							newLeafNode(lv_varName_6_0, grammarAccess.getCalcAccess().getVarNameIDTerminalRuleCall_2_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCalcRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"varName",
                            								lv_varName_6_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            otherlv_7=(Token)match(input,13,FOLLOW_8); 

                            					newLeafNode(otherlv_7, grammarAccess.getCalcAccess().getEqualsSignKeyword_2_0_2());
                            				

                            }
                            break;

                    }

                    // InternalCalculatrice.g:217:4: ( (lv_e_8_0= ruleCalcExpr ) )
                    // InternalCalculatrice.g:218:5: (lv_e_8_0= ruleCalcExpr )
                    {
                    // InternalCalculatrice.g:218:5: (lv_e_8_0= ruleCalcExpr )
                    // InternalCalculatrice.g:219:6: lv_e_8_0= ruleCalcExpr
                    {

                    						newCompositeNode(grammarAccess.getCalcAccess().getECalcExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_e_8_0=ruleCalcExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalcRule());
                    						}
                    						set(
                    							current,
                    							"e",
                    							lv_e_8_0,
                    							"org.xtext.example.mydsl.Calculatrice.CalcExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleCalc"


    // $ANTLR start "entryRuleCalcExpr"
    // InternalCalculatrice.g:241:1: entryRuleCalcExpr returns [EObject current=null] : iv_ruleCalcExpr= ruleCalcExpr EOF ;
    public final EObject entryRuleCalcExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalcExpr = null;


        try {
            // InternalCalculatrice.g:241:49: (iv_ruleCalcExpr= ruleCalcExpr EOF )
            // InternalCalculatrice.g:242:2: iv_ruleCalcExpr= ruleCalcExpr EOF
            {
             newCompositeNode(grammarAccess.getCalcExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalcExpr=ruleCalcExpr();

            state._fsp--;

             current =iv_ruleCalcExpr; 
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
    // $ANTLR end "entryRuleCalcExpr"


    // $ANTLR start "ruleCalcExpr"
    // InternalCalculatrice.g:248:1: ruleCalcExpr returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleCalcExpr ) ) )? ) ;
    public final EObject ruleCalcExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Term_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:254:2: ( (this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleCalcExpr ) ) )? ) )
            // InternalCalculatrice.g:255:2: (this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleCalcExpr ) ) )? )
            {
            // InternalCalculatrice.g:255:2: (this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleCalcExpr ) ) )? )
            // InternalCalculatrice.g:256:3: this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleCalcExpr ) ) )?
            {

            			newCompositeNode(grammarAccess.getCalcExprAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCalculatrice.g:264:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleCalcExpr ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCalculatrice.g:265:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleCalcExpr ) )
                    {
                    // InternalCalculatrice.g:265:4: ()
                    // InternalCalculatrice.g:266:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getCalcExprAccess().getCalcExprLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCalculatrice.g:272:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
                    // InternalCalculatrice.g:273:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    {
                    // InternalCalculatrice.g:273:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    // InternalCalculatrice.g:274:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    {
                    // InternalCalculatrice.g:274:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==15) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==16) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalCalculatrice.g:275:7: lv_op_2_1= '+'
                            {
                            lv_op_2_1=(Token)match(input,15,FOLLOW_8); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getCalcExprAccess().getOpPlusSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCalcExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCalculatrice.g:286:7: lv_op_2_2= '-'
                            {
                            lv_op_2_2=(Token)match(input,16,FOLLOW_8); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getCalcExprAccess().getOpHyphenMinusKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCalcExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalCalculatrice.g:299:4: ( (lv_right_3_0= ruleCalcExpr ) )
                    // InternalCalculatrice.g:300:5: (lv_right_3_0= ruleCalcExpr )
                    {
                    // InternalCalculatrice.g:300:5: (lv_right_3_0= ruleCalcExpr )
                    // InternalCalculatrice.g:301:6: lv_right_3_0= ruleCalcExpr
                    {

                    						newCompositeNode(grammarAccess.getCalcExprAccess().getRightCalcExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleCalcExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalcExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.xtext.example.mydsl.Calculatrice.CalcExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCalcExpr"


    // $ANTLR start "entryRuleTerm"
    // InternalCalculatrice.g:323:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalCalculatrice.g:323:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalCalculatrice.g:324:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalCalculatrice.g:330:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )? ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Factor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:336:2: ( (this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )? ) )
            // InternalCalculatrice.g:337:2: (this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )? )
            {
            // InternalCalculatrice.g:337:2: (this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )? )
            // InternalCalculatrice.g:338:3: this_Factor_0= ruleFactor ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )?
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCalculatrice.g:346:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=17 && LA8_0<=18)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculatrice.g:347:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleTerm ) )
                    {
                    // InternalCalculatrice.g:347:4: ()
                    // InternalCalculatrice.g:348:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getTermAccess().getCalcExprLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCalculatrice.g:354:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
                    // InternalCalculatrice.g:355:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
                    {
                    // InternalCalculatrice.g:355:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
                    // InternalCalculatrice.g:356:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
                    {
                    // InternalCalculatrice.g:356:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==18) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCalculatrice.g:357:7: lv_op_2_1= '*'
                            {
                            lv_op_2_1=(Token)match(input,17,FOLLOW_8); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getTermAccess().getOpAsteriskKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTermRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCalculatrice.g:368:7: lv_op_2_2= '/'
                            {
                            lv_op_2_2=(Token)match(input,18,FOLLOW_8); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getTermAccess().getOpSolidusKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTermRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalCalculatrice.g:381:4: ( (lv_right_3_0= ruleTerm ) )
                    // InternalCalculatrice.g:382:5: (lv_right_3_0= ruleTerm )
                    {
                    // InternalCalculatrice.g:382:5: (lv_right_3_0= ruleTerm )
                    // InternalCalculatrice.g:383:6: lv_right_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getRightTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.xtext.example.mydsl.Calculatrice.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalCalculatrice.g:405:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalCalculatrice.g:405:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalCalculatrice.g:406:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalCalculatrice.g:412:1: ruleFactor returns [EObject current=null] : ( (otherlv_0= '(' this_CalcExpr_1= ruleCalcExpr otherlv_2= ')' ) | ( () ( (lv_neg_4_0= '-' ) )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_varCall_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_neg_4_0=null;
        Token lv_value_5_0=null;
        Token lv_varCall_7_0=null;
        EObject this_CalcExpr_1 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:418:2: ( ( (otherlv_0= '(' this_CalcExpr_1= ruleCalcExpr otherlv_2= ')' ) | ( () ( (lv_neg_4_0= '-' ) )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_varCall_7_0= RULE_ID ) ) ) ) )
            // InternalCalculatrice.g:419:2: ( (otherlv_0= '(' this_CalcExpr_1= ruleCalcExpr otherlv_2= ')' ) | ( () ( (lv_neg_4_0= '-' ) )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_varCall_7_0= RULE_ID ) ) ) )
            {
            // InternalCalculatrice.g:419:2: ( (otherlv_0= '(' this_CalcExpr_1= ruleCalcExpr otherlv_2= ')' ) | ( () ( (lv_neg_4_0= '-' ) )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_varCall_7_0= RULE_ID ) ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
            case 16:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCalculatrice.g:420:3: (otherlv_0= '(' this_CalcExpr_1= ruleCalcExpr otherlv_2= ')' )
                    {
                    // InternalCalculatrice.g:420:3: (otherlv_0= '(' this_CalcExpr_1= ruleCalcExpr otherlv_2= ')' )
                    // InternalCalculatrice.g:421:4: otherlv_0= '(' this_CalcExpr_1= ruleCalcExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getFactorAccess().getCalcExprParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_CalcExpr_1=ruleCalcExpr();

                    state._fsp--;


                    				current = this_CalcExpr_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:439:3: ( () ( (lv_neg_4_0= '-' ) )? ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalCalculatrice.g:439:3: ( () ( (lv_neg_4_0= '-' ) )? ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalCalculatrice.g:440:4: () ( (lv_neg_4_0= '-' ) )? ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalCalculatrice.g:440:4: ()
                    // InternalCalculatrice.g:441:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorAccess().getNumberAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCalculatrice.g:447:4: ( (lv_neg_4_0= '-' ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==16) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCalculatrice.g:448:5: (lv_neg_4_0= '-' )
                            {
                            // InternalCalculatrice.g:448:5: (lv_neg_4_0= '-' )
                            // InternalCalculatrice.g:449:6: lv_neg_4_0= '-'
                            {
                            lv_neg_4_0=(Token)match(input,16,FOLLOW_13); 

                            						newLeafNode(lv_neg_4_0, grammarAccess.getFactorAccess().getNegHyphenMinusKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFactorRule());
                            						}
                            						setWithLastConsumed(current, "neg", true, "-");
                            					

                            }


                            }
                            break;

                    }

                    // InternalCalculatrice.g:461:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalCalculatrice.g:462:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalCalculatrice.g:462:5: (lv_value_5_0= RULE_INT )
                    // InternalCalculatrice.g:463:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getFactorAccess().getValueINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFactorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatrice.g:481:3: ( () ( (lv_varCall_7_0= RULE_ID ) ) )
                    {
                    // InternalCalculatrice.g:481:3: ( () ( (lv_varCall_7_0= RULE_ID ) ) )
                    // InternalCalculatrice.g:482:4: () ( (lv_varCall_7_0= RULE_ID ) )
                    {
                    // InternalCalculatrice.g:482:4: ()
                    // InternalCalculatrice.g:483:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorAccess().getVarCallAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCalculatrice.g:489:4: ( (lv_varCall_7_0= RULE_ID ) )
                    // InternalCalculatrice.g:490:5: (lv_varCall_7_0= RULE_ID )
                    {
                    // InternalCalculatrice.g:490:5: (lv_varCall_7_0= RULE_ID )
                    // InternalCalculatrice.g:491:6: lv_varCall_7_0= RULE_ID
                    {
                    lv_varCall_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_varCall_7_0, grammarAccess.getFactorAccess().getVarCallIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFactorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"varCall",
                    							lv_varCall_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleCondition"
    // InternalCalculatrice.g:512:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCalculatrice.g:512:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCalculatrice.g:513:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCalculatrice.g:519:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' this_BoolExpr_1= ruleBoolExpr otherlv_2= 'then' ( (lv_thenBlock_3_0= ruleCalc ) ) (otherlv_4= 'else' ( (lv_elseBlock_5_0= ruleCalc ) ) )? otherlv_6= 'end' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_BoolExpr_1 = null;

        EObject lv_thenBlock_3_0 = null;

        EObject lv_elseBlock_5_0 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:525:2: ( (otherlv_0= 'if' this_BoolExpr_1= ruleBoolExpr otherlv_2= 'then' ( (lv_thenBlock_3_0= ruleCalc ) ) (otherlv_4= 'else' ( (lv_elseBlock_5_0= ruleCalc ) ) )? otherlv_6= 'end' ) )
            // InternalCalculatrice.g:526:2: (otherlv_0= 'if' this_BoolExpr_1= ruleBoolExpr otherlv_2= 'then' ( (lv_thenBlock_3_0= ruleCalc ) ) (otherlv_4= 'else' ( (lv_elseBlock_5_0= ruleCalc ) ) )? otherlv_6= 'end' )
            {
            // InternalCalculatrice.g:526:2: (otherlv_0= 'if' this_BoolExpr_1= ruleBoolExpr otherlv_2= 'then' ( (lv_thenBlock_3_0= ruleCalc ) ) (otherlv_4= 'else' ( (lv_elseBlock_5_0= ruleCalc ) ) )? otherlv_6= 'end' )
            // InternalCalculatrice.g:527:3: otherlv_0= 'if' this_BoolExpr_1= ruleBoolExpr otherlv_2= 'then' ( (lv_thenBlock_3_0= ruleCalc ) ) (otherlv_4= 'else' ( (lv_elseBlock_5_0= ruleCalc ) ) )? otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getConditionAccess().getBoolExprParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_BoolExpr_1=ruleBoolExpr();

            state._fsp--;


            			current = this_BoolExpr_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getThenKeyword_2());
            		
            // InternalCalculatrice.g:543:3: ( (lv_thenBlock_3_0= ruleCalc ) )
            // InternalCalculatrice.g:544:4: (lv_thenBlock_3_0= ruleCalc )
            {
            // InternalCalculatrice.g:544:4: (lv_thenBlock_3_0= ruleCalc )
            // InternalCalculatrice.g:545:5: lv_thenBlock_3_0= ruleCalc
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getThenBlockCalcParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_thenBlock_3_0=ruleCalc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"thenBlock",
            						lv_thenBlock_3_0,
            						"org.xtext.example.mydsl.Calculatrice.Calc");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCalculatrice.g:562:3: (otherlv_4= 'else' ( (lv_elseBlock_5_0= ruleCalc ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatrice.g:563:4: otherlv_4= 'else' ( (lv_elseBlock_5_0= ruleCalc ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getElseKeyword_4_0());
                    			
                    // InternalCalculatrice.g:567:4: ( (lv_elseBlock_5_0= ruleCalc ) )
                    // InternalCalculatrice.g:568:5: (lv_elseBlock_5_0= ruleCalc )
                    {
                    // InternalCalculatrice.g:568:5: (lv_elseBlock_5_0= ruleCalc )
                    // InternalCalculatrice.g:569:6: lv_elseBlock_5_0= ruleCalc
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getElseBlockCalcParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_elseBlock_5_0=ruleCalc();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"elseBlock",
                    							lv_elseBlock_5_0,
                    							"org.xtext.example.mydsl.Calculatrice.Calc");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleBoolExpr"
    // InternalCalculatrice.g:595:1: entryRuleBoolExpr returns [EObject current=null] : iv_ruleBoolExpr= ruleBoolExpr EOF ;
    public final EObject entryRuleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpr = null;


        try {
            // InternalCalculatrice.g:595:49: (iv_ruleBoolExpr= ruleBoolExpr EOF )
            // InternalCalculatrice.g:596:2: iv_ruleBoolExpr= ruleBoolExpr EOF
            {
             newCompositeNode(grammarAccess.getBoolExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolExpr=ruleBoolExpr();

            state._fsp--;

             current =iv_ruleBoolExpr; 
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
    // $ANTLR end "entryRuleBoolExpr"


    // $ANTLR start "ruleBoolExpr"
    // InternalCalculatrice.g:602:1: ruleBoolExpr returns [EObject current=null] : (this_Bool_0= ruleBool ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )? ) ;
    public final EObject ruleBoolExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Bool_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:608:2: ( (this_Bool_0= ruleBool ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )? ) )
            // InternalCalculatrice.g:609:2: (this_Bool_0= ruleBool ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )? )
            {
            // InternalCalculatrice.g:609:2: (this_Bool_0= ruleBool ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )? )
            // InternalCalculatrice.g:610:3: this_Bool_0= ruleBool ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )?
            {

            			newCompositeNode(grammarAccess.getBoolExprAccess().getBoolParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Bool_0=ruleBool();

            state._fsp--;


            			current = this_Bool_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCalculatrice.g:618:3: ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleBoolExpr ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=25 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalculatrice.g:619:4: () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleBoolExpr ) )
                    {
                    // InternalCalculatrice.g:619:4: ()
                    // InternalCalculatrice.g:620:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getBoolExprAccess().getBoolExprLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCalculatrice.g:626:4: ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) )
                    // InternalCalculatrice.g:627:5: ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) )
                    {
                    // InternalCalculatrice.g:627:5: ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) )
                    // InternalCalculatrice.g:628:6: (lv_op_2_1= '&&' | lv_op_2_2= '||' )
                    {
                    // InternalCalculatrice.g:628:6: (lv_op_2_1= '&&' | lv_op_2_2= '||' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==26) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalCalculatrice.g:629:7: lv_op_2_1= '&&'
                            {
                            lv_op_2_1=(Token)match(input,25,FOLLOW_7); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getBoolExprAccess().getOpAmpersandAmpersandKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBoolExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCalculatrice.g:640:7: lv_op_2_2= '||'
                            {
                            lv_op_2_2=(Token)match(input,26,FOLLOW_7); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getBoolExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBoolExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalCalculatrice.g:653:4: ( (lv_right_3_0= ruleBoolExpr ) )
                    // InternalCalculatrice.g:654:5: (lv_right_3_0= ruleBoolExpr )
                    {
                    // InternalCalculatrice.g:654:5: (lv_right_3_0= ruleBoolExpr )
                    // InternalCalculatrice.g:655:6: lv_right_3_0= ruleBoolExpr
                    {

                    						newCompositeNode(grammarAccess.getBoolExprAccess().getRightBoolExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleBoolExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoolExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.xtext.example.mydsl.Calculatrice.BoolExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleBoolExpr"


    // $ANTLR start "entryRuleBool"
    // InternalCalculatrice.g:677:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalCalculatrice.g:677:45: (iv_ruleBool= ruleBool EOF )
            // InternalCalculatrice.g:678:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalCalculatrice.g:684:1: ruleBool returns [EObject current=null] : ( (otherlv_0= '(' this_BoolExpr_1= ruleBoolExpr otherlv_2= ')' ) | ( () ( ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) ) ) ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_BoolValue_4_1=null;
        Token lv_BoolValue_4_2=null;
        EObject this_BoolExpr_1 = null;



        	enterRule();

        try {
            // InternalCalculatrice.g:690:2: ( ( (otherlv_0= '(' this_BoolExpr_1= ruleBoolExpr otherlv_2= ')' ) | ( () ( ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) ) ) ) ) )
            // InternalCalculatrice.g:691:2: ( (otherlv_0= '(' this_BoolExpr_1= ruleBoolExpr otherlv_2= ')' ) | ( () ( ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) ) ) ) )
            {
            // InternalCalculatrice.g:691:2: ( (otherlv_0= '(' this_BoolExpr_1= ruleBoolExpr otherlv_2= ')' ) | ( () ( ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=27 && LA15_0<=28)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatrice.g:692:3: (otherlv_0= '(' this_BoolExpr_1= ruleBoolExpr otherlv_2= ')' )
                    {
                    // InternalCalculatrice.g:692:3: (otherlv_0= '(' this_BoolExpr_1= ruleBoolExpr otherlv_2= ')' )
                    // InternalCalculatrice.g:693:4: otherlv_0= '(' this_BoolExpr_1= ruleBoolExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getBoolAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getBoolAccess().getBoolExprParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_BoolExpr_1=ruleBoolExpr();

                    state._fsp--;


                    				current = this_BoolExpr_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBoolAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:711:3: ( () ( ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) ) ) )
                    {
                    // InternalCalculatrice.g:711:3: ( () ( ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) ) ) )
                    // InternalCalculatrice.g:712:4: () ( ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) ) )
                    {
                    // InternalCalculatrice.g:712:4: ()
                    // InternalCalculatrice.g:713:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBoolAccess().getBooleanAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCalculatrice.g:719:4: ( ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) ) )
                    // InternalCalculatrice.g:720:5: ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) )
                    {
                    // InternalCalculatrice.g:720:5: ( (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' ) )
                    // InternalCalculatrice.g:721:6: (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' )
                    {
                    // InternalCalculatrice.g:721:6: (lv_BoolValue_4_1= 'true' | lv_BoolValue_4_2= 'false' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==28) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCalculatrice.g:722:7: lv_BoolValue_4_1= 'true'
                            {
                            lv_BoolValue_4_1=(Token)match(input,27,FOLLOW_2); 

                            							newLeafNode(lv_BoolValue_4_1, grammarAccess.getBoolAccess().getBoolValueTrueKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBoolRule());
                            							}
                            							setWithLastConsumed(current, "BoolValue", lv_BoolValue_4_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCalculatrice.g:733:7: lv_BoolValue_4_2= 'false'
                            {
                            lv_BoolValue_4_2=(Token)match(input,28,FOLLOW_2); 

                            							newLeafNode(lv_BoolValue_4_2, grammarAccess.getBoolAccess().getBoolValueFalseKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBoolRule());
                            							}
                            							setWithLastConsumed(current, "BoolValue", lv_BoolValue_4_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


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
    // $ANTLR end "ruleBool"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000295032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000018080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000295030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000395030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001A95030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001295030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000002L});

}