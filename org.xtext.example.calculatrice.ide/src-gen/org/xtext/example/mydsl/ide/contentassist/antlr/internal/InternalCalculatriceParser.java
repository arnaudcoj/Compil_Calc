package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.CalculatriceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalculatriceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'true'", "'false'", "'\\n'", "'bool'", "'='", "'('", "')'", "'if'", "'then'", "'end'", "'else'", "'var'"
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

    	public void setGrammarAccess(CalculatriceGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCalculatrice"
    // InternalCalculatrice.g:53:1: entryRuleCalculatrice : ruleCalculatrice EOF ;
    public final void entryRuleCalculatrice() throws RecognitionException {
        try {
            // InternalCalculatrice.g:54:1: ( ruleCalculatrice EOF )
            // InternalCalculatrice.g:55:1: ruleCalculatrice EOF
            {
             before(grammarAccess.getCalculatriceRule()); 
            pushFollow(FOLLOW_1);
            ruleCalculatrice();

            state._fsp--;

             after(grammarAccess.getCalculatriceRule()); 
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
    // $ANTLR end "entryRuleCalculatrice"


    // $ANTLR start "ruleCalculatrice"
    // InternalCalculatrice.g:62:1: ruleCalculatrice : ( ( rule__Calculatrice__Group__0 )* ) ;
    public final void ruleCalculatrice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:66:2: ( ( ( rule__Calculatrice__Group__0 )* ) )
            // InternalCalculatrice.g:67:2: ( ( rule__Calculatrice__Group__0 )* )
            {
            // InternalCalculatrice.g:67:2: ( ( rule__Calculatrice__Group__0 )* )
            // InternalCalculatrice.g:68:3: ( rule__Calculatrice__Group__0 )*
            {
             before(grammarAccess.getCalculatriceAccess().getGroup()); 
            // InternalCalculatrice.g:69:3: ( rule__Calculatrice__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==12||LA1_0==20||LA1_0==22||LA1_0==24||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculatrice.g:69:4: rule__Calculatrice__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Calculatrice__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCalculatriceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalculatrice"


    // $ANTLR start "entryRuleCalc"
    // InternalCalculatrice.g:78:1: entryRuleCalc : ruleCalc EOF ;
    public final void entryRuleCalc() throws RecognitionException {
        try {
            // InternalCalculatrice.g:79:1: ( ruleCalc EOF )
            // InternalCalculatrice.g:80:1: ruleCalc EOF
            {
             before(grammarAccess.getCalcRule()); 
            pushFollow(FOLLOW_1);
            ruleCalc();

            state._fsp--;

             after(grammarAccess.getCalcRule()); 
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
    // $ANTLR end "entryRuleCalc"


    // $ANTLR start "ruleCalc"
    // InternalCalculatrice.g:87:1: ruleCalc : ( ( rule__Calc__Alternatives ) ) ;
    public final void ruleCalc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:91:2: ( ( ( rule__Calc__Alternatives ) ) )
            // InternalCalculatrice.g:92:2: ( ( rule__Calc__Alternatives ) )
            {
            // InternalCalculatrice.g:92:2: ( ( rule__Calc__Alternatives ) )
            // InternalCalculatrice.g:93:3: ( rule__Calc__Alternatives )
            {
             before(grammarAccess.getCalcAccess().getAlternatives()); 
            // InternalCalculatrice.g:94:3: ( rule__Calc__Alternatives )
            // InternalCalculatrice.g:94:4: rule__Calc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Calc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCalcAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalc"


    // $ANTLR start "entryRuleCalcExpr"
    // InternalCalculatrice.g:103:1: entryRuleCalcExpr : ruleCalcExpr EOF ;
    public final void entryRuleCalcExpr() throws RecognitionException {
        try {
            // InternalCalculatrice.g:104:1: ( ruleCalcExpr EOF )
            // InternalCalculatrice.g:105:1: ruleCalcExpr EOF
            {
             before(grammarAccess.getCalcExprRule()); 
            pushFollow(FOLLOW_1);
            ruleCalcExpr();

            state._fsp--;

             after(grammarAccess.getCalcExprRule()); 
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
    // $ANTLR end "entryRuleCalcExpr"


    // $ANTLR start "ruleCalcExpr"
    // InternalCalculatrice.g:112:1: ruleCalcExpr : ( ( rule__CalcExpr__Group__0 ) ) ;
    public final void ruleCalcExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:116:2: ( ( ( rule__CalcExpr__Group__0 ) ) )
            // InternalCalculatrice.g:117:2: ( ( rule__CalcExpr__Group__0 ) )
            {
            // InternalCalculatrice.g:117:2: ( ( rule__CalcExpr__Group__0 ) )
            // InternalCalculatrice.g:118:3: ( rule__CalcExpr__Group__0 )
            {
             before(grammarAccess.getCalcExprAccess().getGroup()); 
            // InternalCalculatrice.g:119:3: ( rule__CalcExpr__Group__0 )
            // InternalCalculatrice.g:119:4: rule__CalcExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CalcExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalcExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalcExpr"


    // $ANTLR start "entryRuleTerm"
    // InternalCalculatrice.g:128:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalCalculatrice.g:129:1: ( ruleTerm EOF )
            // InternalCalculatrice.g:130:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalCalculatrice.g:137:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:141:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalCalculatrice.g:142:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalCalculatrice.g:142:2: ( ( rule__Term__Group__0 ) )
            // InternalCalculatrice.g:143:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalCalculatrice.g:144:3: ( rule__Term__Group__0 )
            // InternalCalculatrice.g:144:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalCalculatrice.g:153:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalCalculatrice.g:154:1: ( ruleFactor EOF )
            // InternalCalculatrice.g:155:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalCalculatrice.g:162:1: ruleFactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:166:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalCalculatrice.g:167:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalCalculatrice.g:167:2: ( ( rule__Factor__Alternatives ) )
            // InternalCalculatrice.g:168:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalCalculatrice.g:169:3: ( rule__Factor__Alternatives )
            // InternalCalculatrice.g:169:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleCondition"
    // InternalCalculatrice.g:178:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCalculatrice.g:179:1: ( ruleCondition EOF )
            // InternalCalculatrice.g:180:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCalculatrice.g:187:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:191:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalCalculatrice.g:192:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalCalculatrice.g:192:2: ( ( rule__Condition__Group__0 ) )
            // InternalCalculatrice.g:193:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalCalculatrice.g:194:3: ( rule__Condition__Group__0 )
            // InternalCalculatrice.g:194:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBoolExpr"
    // InternalCalculatrice.g:203:1: entryRuleBoolExpr : ruleBoolExpr EOF ;
    public final void entryRuleBoolExpr() throws RecognitionException {
        try {
            // InternalCalculatrice.g:204:1: ( ruleBoolExpr EOF )
            // InternalCalculatrice.g:205:1: ruleBoolExpr EOF
            {
             before(grammarAccess.getBoolExprRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolExpr();

            state._fsp--;

             after(grammarAccess.getBoolExprRule()); 
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
    // $ANTLR end "entryRuleBoolExpr"


    // $ANTLR start "ruleBoolExpr"
    // InternalCalculatrice.g:212:1: ruleBoolExpr : ( ( rule__BoolExpr__Group__0 ) ) ;
    public final void ruleBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:216:2: ( ( ( rule__BoolExpr__Group__0 ) ) )
            // InternalCalculatrice.g:217:2: ( ( rule__BoolExpr__Group__0 ) )
            {
            // InternalCalculatrice.g:217:2: ( ( rule__BoolExpr__Group__0 ) )
            // InternalCalculatrice.g:218:3: ( rule__BoolExpr__Group__0 )
            {
             before(grammarAccess.getBoolExprAccess().getGroup()); 
            // InternalCalculatrice.g:219:3: ( rule__BoolExpr__Group__0 )
            // InternalCalculatrice.g:219:4: rule__BoolExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolExpr"


    // $ANTLR start "entryRuleBool"
    // InternalCalculatrice.g:228:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // InternalCalculatrice.g:229:1: ( ruleBool EOF )
            // InternalCalculatrice.g:230:1: ruleBool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalCalculatrice.g:237:1: ruleBool : ( ( rule__Bool__Alternatives ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:241:2: ( ( ( rule__Bool__Alternatives ) ) )
            // InternalCalculatrice.g:242:2: ( ( rule__Bool__Alternatives ) )
            {
            // InternalCalculatrice.g:242:2: ( ( rule__Bool__Alternatives ) )
            // InternalCalculatrice.g:243:3: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // InternalCalculatrice.g:244:3: ( rule__Bool__Alternatives )
            // InternalCalculatrice.g:244:4: rule__Bool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "rule__Calc__Alternatives"
    // InternalCalculatrice.g:252:1: rule__Calc__Alternatives : ( ( ( rule__Calc__Group_0__0 ) ) | ( ruleCondition ) | ( ( rule__Calc__Group_2__0 ) ) );
    public final void rule__Calc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:256:1: ( ( ( rule__Calc__Group_0__0 ) ) | ( ruleCondition ) | ( ( rule__Calc__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 12:
            case 22:
            case 28:
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
                    // InternalCalculatrice.g:257:2: ( ( rule__Calc__Group_0__0 ) )
                    {
                    // InternalCalculatrice.g:257:2: ( ( rule__Calc__Group_0__0 ) )
                    // InternalCalculatrice.g:258:3: ( rule__Calc__Group_0__0 )
                    {
                     before(grammarAccess.getCalcAccess().getGroup_0()); 
                    // InternalCalculatrice.g:259:3: ( rule__Calc__Group_0__0 )
                    // InternalCalculatrice.g:259:4: rule__Calc__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calc__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalcAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:263:2: ( ruleCondition )
                    {
                    // InternalCalculatrice.g:263:2: ( ruleCondition )
                    // InternalCalculatrice.g:264:3: ruleCondition
                    {
                     before(grammarAccess.getCalcAccess().getConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;

                     after(grammarAccess.getCalcAccess().getConditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatrice.g:269:2: ( ( rule__Calc__Group_2__0 ) )
                    {
                    // InternalCalculatrice.g:269:2: ( ( rule__Calc__Group_2__0 ) )
                    // InternalCalculatrice.g:270:3: ( rule__Calc__Group_2__0 )
                    {
                     before(grammarAccess.getCalcAccess().getGroup_2()); 
                    // InternalCalculatrice.g:271:3: ( rule__Calc__Group_2__0 )
                    // InternalCalculatrice.g:271:4: rule__Calc__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calc__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalcAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Calc__Alternatives"


    // $ANTLR start "rule__CalcExpr__OpAlternatives_1_1_0"
    // InternalCalculatrice.g:279:1: rule__CalcExpr__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__CalcExpr__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:283:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCalculatrice.g:284:2: ( '+' )
                    {
                    // InternalCalculatrice.g:284:2: ( '+' )
                    // InternalCalculatrice.g:285:3: '+'
                    {
                     before(grammarAccess.getCalcExprAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCalcExprAccess().getOpPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:290:2: ( '-' )
                    {
                    // InternalCalculatrice.g:290:2: ( '-' )
                    // InternalCalculatrice.g:291:3: '-'
                    {
                     before(grammarAccess.getCalcExprAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCalcExprAccess().getOpHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__CalcExpr__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Term__OpAlternatives_1_1_0"
    // InternalCalculatrice.g:300:1: rule__Term__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Term__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:304:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCalculatrice.g:305:2: ( '*' )
                    {
                    // InternalCalculatrice.g:305:2: ( '*' )
                    // InternalCalculatrice.g:306:3: '*'
                    {
                     before(grammarAccess.getTermAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTermAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:311:2: ( '/' )
                    {
                    // InternalCalculatrice.g:311:2: ( '/' )
                    // InternalCalculatrice.g:312:3: '/'
                    {
                     before(grammarAccess.getTermAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTermAccess().getOpSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Term__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalCalculatrice.g:321:1: rule__Factor__Alternatives : ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ( rule__Factor__Group_2__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:325:1: ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ( rule__Factor__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
            case 12:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
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
                    // InternalCalculatrice.g:326:2: ( ( rule__Factor__Group_0__0 ) )
                    {
                    // InternalCalculatrice.g:326:2: ( ( rule__Factor__Group_0__0 ) )
                    // InternalCalculatrice.g:327:3: ( rule__Factor__Group_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_0()); 
                    // InternalCalculatrice.g:328:3: ( rule__Factor__Group_0__0 )
                    // InternalCalculatrice.g:328:4: rule__Factor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:332:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalCalculatrice.g:332:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalCalculatrice.g:333:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalCalculatrice.g:334:3: ( rule__Factor__Group_1__0 )
                    // InternalCalculatrice.g:334:4: rule__Factor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatrice.g:338:2: ( ( rule__Factor__Group_2__0 ) )
                    {
                    // InternalCalculatrice.g:338:2: ( ( rule__Factor__Group_2__0 ) )
                    // InternalCalculatrice.g:339:3: ( rule__Factor__Group_2__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_2()); 
                    // InternalCalculatrice.g:340:3: ( rule__Factor__Group_2__0 )
                    // InternalCalculatrice.g:340:4: rule__Factor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__BoolExpr__OpAlternatives_1_1_0"
    // InternalCalculatrice.g:348:1: rule__BoolExpr__OpAlternatives_1_1_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__BoolExpr__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:352:1: ( ( '&&' ) | ( '||' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCalculatrice.g:353:2: ( '&&' )
                    {
                    // InternalCalculatrice.g:353:2: ( '&&' )
                    // InternalCalculatrice.g:354:3: '&&'
                    {
                     before(grammarAccess.getBoolExprAccess().getOpAmpersandAmpersandKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBoolExprAccess().getOpAmpersandAmpersandKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:359:2: ( '||' )
                    {
                    // InternalCalculatrice.g:359:2: ( '||' )
                    // InternalCalculatrice.g:360:3: '||'
                    {
                     before(grammarAccess.getBoolExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBoolExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__BoolExpr__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Bool__Alternatives"
    // InternalCalculatrice.g:369:1: rule__Bool__Alternatives : ( ( ( rule__Bool__Group_0__0 ) ) | ( ( rule__Bool__Group_1__0 ) ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:373:1: ( ( ( rule__Bool__Group_0__0 ) ) | ( ( rule__Bool__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCalculatrice.g:374:2: ( ( rule__Bool__Group_0__0 ) )
                    {
                    // InternalCalculatrice.g:374:2: ( ( rule__Bool__Group_0__0 ) )
                    // InternalCalculatrice.g:375:3: ( rule__Bool__Group_0__0 )
                    {
                     before(grammarAccess.getBoolAccess().getGroup_0()); 
                    // InternalCalculatrice.g:376:3: ( rule__Bool__Group_0__0 )
                    // InternalCalculatrice.g:376:4: rule__Bool__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bool__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoolAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:380:2: ( ( rule__Bool__Group_1__0 ) )
                    {
                    // InternalCalculatrice.g:380:2: ( ( rule__Bool__Group_1__0 ) )
                    // InternalCalculatrice.g:381:3: ( rule__Bool__Group_1__0 )
                    {
                     before(grammarAccess.getBoolAccess().getGroup_1()); 
                    // InternalCalculatrice.g:382:3: ( rule__Bool__Group_1__0 )
                    // InternalCalculatrice.g:382:4: rule__Bool__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bool__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoolAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Bool__Alternatives"


    // $ANTLR start "rule__Bool__BoolValueAlternatives_1_1_0"
    // InternalCalculatrice.g:390:1: rule__Bool__BoolValueAlternatives_1_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Bool__BoolValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:394:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculatrice.g:395:2: ( 'true' )
                    {
                    // InternalCalculatrice.g:395:2: ( 'true' )
                    // InternalCalculatrice.g:396:3: 'true'
                    {
                     before(grammarAccess.getBoolAccess().getBoolValueTrueKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getBoolValueTrueKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatrice.g:401:2: ( 'false' )
                    {
                    // InternalCalculatrice.g:401:2: ( 'false' )
                    // InternalCalculatrice.g:402:3: 'false'
                    {
                     before(grammarAccess.getBoolAccess().getBoolValueFalseKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getBoolValueFalseKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Bool__BoolValueAlternatives_1_1_0"


    // $ANTLR start "rule__Calculatrice__Group__0"
    // InternalCalculatrice.g:411:1: rule__Calculatrice__Group__0 : rule__Calculatrice__Group__0__Impl rule__Calculatrice__Group__1 ;
    public final void rule__Calculatrice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:415:1: ( rule__Calculatrice__Group__0__Impl rule__Calculatrice__Group__1 )
            // InternalCalculatrice.g:416:2: rule__Calculatrice__Group__0__Impl rule__Calculatrice__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Calculatrice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculatrice__Group__1();

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
    // $ANTLR end "rule__Calculatrice__Group__0"


    // $ANTLR start "rule__Calculatrice__Group__0__Impl"
    // InternalCalculatrice.g:423:1: rule__Calculatrice__Group__0__Impl : ( ( rule__Calculatrice__CalculsAssignment_0 ) ) ;
    public final void rule__Calculatrice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:427:1: ( ( ( rule__Calculatrice__CalculsAssignment_0 ) ) )
            // InternalCalculatrice.g:428:1: ( ( rule__Calculatrice__CalculsAssignment_0 ) )
            {
            // InternalCalculatrice.g:428:1: ( ( rule__Calculatrice__CalculsAssignment_0 ) )
            // InternalCalculatrice.g:429:2: ( rule__Calculatrice__CalculsAssignment_0 )
            {
             before(grammarAccess.getCalculatriceAccess().getCalculsAssignment_0()); 
            // InternalCalculatrice.g:430:2: ( rule__Calculatrice__CalculsAssignment_0 )
            // InternalCalculatrice.g:430:3: rule__Calculatrice__CalculsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Calculatrice__CalculsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCalculatriceAccess().getCalculsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculatrice__Group__0__Impl"


    // $ANTLR start "rule__Calculatrice__Group__1"
    // InternalCalculatrice.g:438:1: rule__Calculatrice__Group__1 : rule__Calculatrice__Group__1__Impl ;
    public final void rule__Calculatrice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:442:1: ( rule__Calculatrice__Group__1__Impl )
            // InternalCalculatrice.g:443:2: rule__Calculatrice__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calculatrice__Group__1__Impl();

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
    // $ANTLR end "rule__Calculatrice__Group__1"


    // $ANTLR start "rule__Calculatrice__Group__1__Impl"
    // InternalCalculatrice.g:449:1: rule__Calculatrice__Group__1__Impl : ( '\\n' ) ;
    public final void rule__Calculatrice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:453:1: ( ( '\\n' ) )
            // InternalCalculatrice.g:454:1: ( '\\n' )
            {
            // InternalCalculatrice.g:454:1: ( '\\n' )
            // InternalCalculatrice.g:455:2: '\\n'
            {
             before(grammarAccess.getCalculatriceAccess().getControl000aKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCalculatriceAccess().getControl000aKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculatrice__Group__1__Impl"


    // $ANTLR start "rule__Calc__Group_0__0"
    // InternalCalculatrice.g:465:1: rule__Calc__Group_0__0 : rule__Calc__Group_0__0__Impl rule__Calc__Group_0__1 ;
    public final void rule__Calc__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:469:1: ( rule__Calc__Group_0__0__Impl rule__Calc__Group_0__1 )
            // InternalCalculatrice.g:470:2: rule__Calc__Group_0__0__Impl rule__Calc__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Calc__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calc__Group_0__1();

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
    // $ANTLR end "rule__Calc__Group_0__0"


    // $ANTLR start "rule__Calc__Group_0__0__Impl"
    // InternalCalculatrice.g:477:1: rule__Calc__Group_0__0__Impl : ( 'bool' ) ;
    public final void rule__Calc__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:481:1: ( ( 'bool' ) )
            // InternalCalculatrice.g:482:1: ( 'bool' )
            {
            // InternalCalculatrice.g:482:1: ( 'bool' )
            // InternalCalculatrice.g:483:2: 'bool'
            {
             before(grammarAccess.getCalcAccess().getBoolKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCalcAccess().getBoolKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_0__0__Impl"


    // $ANTLR start "rule__Calc__Group_0__1"
    // InternalCalculatrice.g:492:1: rule__Calc__Group_0__1 : rule__Calc__Group_0__1__Impl rule__Calc__Group_0__2 ;
    public final void rule__Calc__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:496:1: ( rule__Calc__Group_0__1__Impl rule__Calc__Group_0__2 )
            // InternalCalculatrice.g:497:2: rule__Calc__Group_0__1__Impl rule__Calc__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Calc__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calc__Group_0__2();

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
    // $ANTLR end "rule__Calc__Group_0__1"


    // $ANTLR start "rule__Calc__Group_0__1__Impl"
    // InternalCalculatrice.g:504:1: rule__Calc__Group_0__1__Impl : ( ( rule__Calc__BoolNameAssignment_0_1 ) ) ;
    public final void rule__Calc__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:508:1: ( ( ( rule__Calc__BoolNameAssignment_0_1 ) ) )
            // InternalCalculatrice.g:509:1: ( ( rule__Calc__BoolNameAssignment_0_1 ) )
            {
            // InternalCalculatrice.g:509:1: ( ( rule__Calc__BoolNameAssignment_0_1 ) )
            // InternalCalculatrice.g:510:2: ( rule__Calc__BoolNameAssignment_0_1 )
            {
             before(grammarAccess.getCalcAccess().getBoolNameAssignment_0_1()); 
            // InternalCalculatrice.g:511:2: ( rule__Calc__BoolNameAssignment_0_1 )
            // InternalCalculatrice.g:511:3: rule__Calc__BoolNameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Calc__BoolNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCalcAccess().getBoolNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_0__1__Impl"


    // $ANTLR start "rule__Calc__Group_0__2"
    // InternalCalculatrice.g:519:1: rule__Calc__Group_0__2 : rule__Calc__Group_0__2__Impl rule__Calc__Group_0__3 ;
    public final void rule__Calc__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:523:1: ( rule__Calc__Group_0__2__Impl rule__Calc__Group_0__3 )
            // InternalCalculatrice.g:524:2: rule__Calc__Group_0__2__Impl rule__Calc__Group_0__3
            {
            pushFollow(FOLLOW_7);
            rule__Calc__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calc__Group_0__3();

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
    // $ANTLR end "rule__Calc__Group_0__2"


    // $ANTLR start "rule__Calc__Group_0__2__Impl"
    // InternalCalculatrice.g:531:1: rule__Calc__Group_0__2__Impl : ( '=' ) ;
    public final void rule__Calc__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:535:1: ( ( '=' ) )
            // InternalCalculatrice.g:536:1: ( '=' )
            {
            // InternalCalculatrice.g:536:1: ( '=' )
            // InternalCalculatrice.g:537:2: '='
            {
             before(grammarAccess.getCalcAccess().getEqualsSignKeyword_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCalcAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_0__2__Impl"


    // $ANTLR start "rule__Calc__Group_0__3"
    // InternalCalculatrice.g:546:1: rule__Calc__Group_0__3 : rule__Calc__Group_0__3__Impl ;
    public final void rule__Calc__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:550:1: ( rule__Calc__Group_0__3__Impl )
            // InternalCalculatrice.g:551:2: rule__Calc__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calc__Group_0__3__Impl();

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
    // $ANTLR end "rule__Calc__Group_0__3"


    // $ANTLR start "rule__Calc__Group_0__3__Impl"
    // InternalCalculatrice.g:557:1: rule__Calc__Group_0__3__Impl : ( ( rule__Calc__BAssignment_0_3 ) ) ;
    public final void rule__Calc__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:561:1: ( ( ( rule__Calc__BAssignment_0_3 ) ) )
            // InternalCalculatrice.g:562:1: ( ( rule__Calc__BAssignment_0_3 ) )
            {
            // InternalCalculatrice.g:562:1: ( ( rule__Calc__BAssignment_0_3 ) )
            // InternalCalculatrice.g:563:2: ( rule__Calc__BAssignment_0_3 )
            {
             before(grammarAccess.getCalcAccess().getBAssignment_0_3()); 
            // InternalCalculatrice.g:564:2: ( rule__Calc__BAssignment_0_3 )
            // InternalCalculatrice.g:564:3: rule__Calc__BAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Calc__BAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getCalcAccess().getBAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_0__3__Impl"


    // $ANTLR start "rule__Calc__Group_2__0"
    // InternalCalculatrice.g:573:1: rule__Calc__Group_2__0 : rule__Calc__Group_2__0__Impl rule__Calc__Group_2__1 ;
    public final void rule__Calc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:577:1: ( rule__Calc__Group_2__0__Impl rule__Calc__Group_2__1 )
            // InternalCalculatrice.g:578:2: rule__Calc__Group_2__0__Impl rule__Calc__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Calc__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calc__Group_2__1();

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
    // $ANTLR end "rule__Calc__Group_2__0"


    // $ANTLR start "rule__Calc__Group_2__0__Impl"
    // InternalCalculatrice.g:585:1: rule__Calc__Group_2__0__Impl : ( ( rule__Calc__Group_2_0__0 )? ) ;
    public final void rule__Calc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:589:1: ( ( ( rule__Calc__Group_2_0__0 )? ) )
            // InternalCalculatrice.g:590:1: ( ( rule__Calc__Group_2_0__0 )? )
            {
            // InternalCalculatrice.g:590:1: ( ( rule__Calc__Group_2_0__0 )? )
            // InternalCalculatrice.g:591:2: ( rule__Calc__Group_2_0__0 )?
            {
             before(grammarAccess.getCalcAccess().getGroup_2_0()); 
            // InternalCalculatrice.g:592:2: ( rule__Calc__Group_2_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==21) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalCalculatrice.g:592:3: rule__Calc__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calc__Group_2_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalcAccess().getGroup_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_2__0__Impl"


    // $ANTLR start "rule__Calc__Group_2__1"
    // InternalCalculatrice.g:600:1: rule__Calc__Group_2__1 : rule__Calc__Group_2__1__Impl ;
    public final void rule__Calc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:604:1: ( rule__Calc__Group_2__1__Impl )
            // InternalCalculatrice.g:605:2: rule__Calc__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calc__Group_2__1__Impl();

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
    // $ANTLR end "rule__Calc__Group_2__1"


    // $ANTLR start "rule__Calc__Group_2__1__Impl"
    // InternalCalculatrice.g:611:1: rule__Calc__Group_2__1__Impl : ( ( rule__Calc__EAssignment_2_1 ) ) ;
    public final void rule__Calc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:615:1: ( ( ( rule__Calc__EAssignment_2_1 ) ) )
            // InternalCalculatrice.g:616:1: ( ( rule__Calc__EAssignment_2_1 ) )
            {
            // InternalCalculatrice.g:616:1: ( ( rule__Calc__EAssignment_2_1 ) )
            // InternalCalculatrice.g:617:2: ( rule__Calc__EAssignment_2_1 )
            {
             before(grammarAccess.getCalcAccess().getEAssignment_2_1()); 
            // InternalCalculatrice.g:618:2: ( rule__Calc__EAssignment_2_1 )
            // InternalCalculatrice.g:618:3: rule__Calc__EAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Calc__EAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCalcAccess().getEAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_2__1__Impl"


    // $ANTLR start "rule__Calc__Group_2_0__0"
    // InternalCalculatrice.g:627:1: rule__Calc__Group_2_0__0 : rule__Calc__Group_2_0__0__Impl rule__Calc__Group_2_0__1 ;
    public final void rule__Calc__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:631:1: ( rule__Calc__Group_2_0__0__Impl rule__Calc__Group_2_0__1 )
            // InternalCalculatrice.g:632:2: rule__Calc__Group_2_0__0__Impl rule__Calc__Group_2_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Calc__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calc__Group_2_0__1();

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
    // $ANTLR end "rule__Calc__Group_2_0__0"


    // $ANTLR start "rule__Calc__Group_2_0__0__Impl"
    // InternalCalculatrice.g:639:1: rule__Calc__Group_2_0__0__Impl : ( ( rule__Calc__DeclAssignment_2_0_0 )? ) ;
    public final void rule__Calc__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:643:1: ( ( ( rule__Calc__DeclAssignment_2_0_0 )? ) )
            // InternalCalculatrice.g:644:1: ( ( rule__Calc__DeclAssignment_2_0_0 )? )
            {
            // InternalCalculatrice.g:644:1: ( ( rule__Calc__DeclAssignment_2_0_0 )? )
            // InternalCalculatrice.g:645:2: ( rule__Calc__DeclAssignment_2_0_0 )?
            {
             before(grammarAccess.getCalcAccess().getDeclAssignment_2_0_0()); 
            // InternalCalculatrice.g:646:2: ( rule__Calc__DeclAssignment_2_0_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCalculatrice.g:646:3: rule__Calc__DeclAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calc__DeclAssignment_2_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalcAccess().getDeclAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_2_0__0__Impl"


    // $ANTLR start "rule__Calc__Group_2_0__1"
    // InternalCalculatrice.g:654:1: rule__Calc__Group_2_0__1 : rule__Calc__Group_2_0__1__Impl rule__Calc__Group_2_0__2 ;
    public final void rule__Calc__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:658:1: ( rule__Calc__Group_2_0__1__Impl rule__Calc__Group_2_0__2 )
            // InternalCalculatrice.g:659:2: rule__Calc__Group_2_0__1__Impl rule__Calc__Group_2_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Calc__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calc__Group_2_0__2();

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
    // $ANTLR end "rule__Calc__Group_2_0__1"


    // $ANTLR start "rule__Calc__Group_2_0__1__Impl"
    // InternalCalculatrice.g:666:1: rule__Calc__Group_2_0__1__Impl : ( ( rule__Calc__VarNameAssignment_2_0_1 ) ) ;
    public final void rule__Calc__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:670:1: ( ( ( rule__Calc__VarNameAssignment_2_0_1 ) ) )
            // InternalCalculatrice.g:671:1: ( ( rule__Calc__VarNameAssignment_2_0_1 ) )
            {
            // InternalCalculatrice.g:671:1: ( ( rule__Calc__VarNameAssignment_2_0_1 ) )
            // InternalCalculatrice.g:672:2: ( rule__Calc__VarNameAssignment_2_0_1 )
            {
             before(grammarAccess.getCalcAccess().getVarNameAssignment_2_0_1()); 
            // InternalCalculatrice.g:673:2: ( rule__Calc__VarNameAssignment_2_0_1 )
            // InternalCalculatrice.g:673:3: rule__Calc__VarNameAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Calc__VarNameAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCalcAccess().getVarNameAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_2_0__1__Impl"


    // $ANTLR start "rule__Calc__Group_2_0__2"
    // InternalCalculatrice.g:681:1: rule__Calc__Group_2_0__2 : rule__Calc__Group_2_0__2__Impl ;
    public final void rule__Calc__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:685:1: ( rule__Calc__Group_2_0__2__Impl )
            // InternalCalculatrice.g:686:2: rule__Calc__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calc__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__Calc__Group_2_0__2"


    // $ANTLR start "rule__Calc__Group_2_0__2__Impl"
    // InternalCalculatrice.g:692:1: rule__Calc__Group_2_0__2__Impl : ( '=' ) ;
    public final void rule__Calc__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:696:1: ( ( '=' ) )
            // InternalCalculatrice.g:697:1: ( '=' )
            {
            // InternalCalculatrice.g:697:1: ( '=' )
            // InternalCalculatrice.g:698:2: '='
            {
             before(grammarAccess.getCalcAccess().getEqualsSignKeyword_2_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCalcAccess().getEqualsSignKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__Group_2_0__2__Impl"


    // $ANTLR start "rule__CalcExpr__Group__0"
    // InternalCalculatrice.g:708:1: rule__CalcExpr__Group__0 : rule__CalcExpr__Group__0__Impl rule__CalcExpr__Group__1 ;
    public final void rule__CalcExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:712:1: ( rule__CalcExpr__Group__0__Impl rule__CalcExpr__Group__1 )
            // InternalCalculatrice.g:713:2: rule__CalcExpr__Group__0__Impl rule__CalcExpr__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CalcExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalcExpr__Group__1();

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
    // $ANTLR end "rule__CalcExpr__Group__0"


    // $ANTLR start "rule__CalcExpr__Group__0__Impl"
    // InternalCalculatrice.g:720:1: rule__CalcExpr__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__CalcExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:724:1: ( ( ruleTerm ) )
            // InternalCalculatrice.g:725:1: ( ruleTerm )
            {
            // InternalCalculatrice.g:725:1: ( ruleTerm )
            // InternalCalculatrice.g:726:2: ruleTerm
            {
             before(grammarAccess.getCalcExprAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getCalcExprAccess().getTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExpr__Group__0__Impl"


    // $ANTLR start "rule__CalcExpr__Group__1"
    // InternalCalculatrice.g:735:1: rule__CalcExpr__Group__1 : rule__CalcExpr__Group__1__Impl ;
    public final void rule__CalcExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:739:1: ( rule__CalcExpr__Group__1__Impl )
            // InternalCalculatrice.g:740:2: rule__CalcExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalcExpr__Group__1__Impl();

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
    // $ANTLR end "rule__CalcExpr__Group__1"


    // $ANTLR start "rule__CalcExpr__Group__1__Impl"
    // InternalCalculatrice.g:746:1: rule__CalcExpr__Group__1__Impl : ( ( rule__CalcExpr__Group_1__0 )? ) ;
    public final void rule__CalcExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:750:1: ( ( ( rule__CalcExpr__Group_1__0 )? ) )
            // InternalCalculatrice.g:751:1: ( ( rule__CalcExpr__Group_1__0 )? )
            {
            // InternalCalculatrice.g:751:1: ( ( rule__CalcExpr__Group_1__0 )? )
            // InternalCalculatrice.g:752:2: ( rule__CalcExpr__Group_1__0 )?
            {
             before(grammarAccess.getCalcExprAccess().getGroup_1()); 
            // InternalCalculatrice.g:753:2: ( rule__CalcExpr__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatrice.g:753:3: rule__CalcExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalcExpr__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalcExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExpr__Group__1__Impl"


    // $ANTLR start "rule__CalcExpr__Group_1__0"
    // InternalCalculatrice.g:762:1: rule__CalcExpr__Group_1__0 : rule__CalcExpr__Group_1__0__Impl rule__CalcExpr__Group_1__1 ;
    public final void rule__CalcExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:766:1: ( rule__CalcExpr__Group_1__0__Impl rule__CalcExpr__Group_1__1 )
            // InternalCalculatrice.g:767:2: rule__CalcExpr__Group_1__0__Impl rule__CalcExpr__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__CalcExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalcExpr__Group_1__1();

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
    // $ANTLR end "rule__CalcExpr__Group_1__0"


    // $ANTLR start "rule__CalcExpr__Group_1__0__Impl"
    // InternalCalculatrice.g:774:1: rule__CalcExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CalcExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:778:1: ( ( () ) )
            // InternalCalculatrice.g:779:1: ( () )
            {
            // InternalCalculatrice.g:779:1: ( () )
            // InternalCalculatrice.g:780:2: ()
            {
             before(grammarAccess.getCalcExprAccess().getCalcExprLeftAction_1_0()); 
            // InternalCalculatrice.g:781:2: ()
            // InternalCalculatrice.g:781:3: 
            {
            }

             after(grammarAccess.getCalcExprAccess().getCalcExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExpr__Group_1__0__Impl"


    // $ANTLR start "rule__CalcExpr__Group_1__1"
    // InternalCalculatrice.g:789:1: rule__CalcExpr__Group_1__1 : rule__CalcExpr__Group_1__1__Impl rule__CalcExpr__Group_1__2 ;
    public final void rule__CalcExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:793:1: ( rule__CalcExpr__Group_1__1__Impl rule__CalcExpr__Group_1__2 )
            // InternalCalculatrice.g:794:2: rule__CalcExpr__Group_1__1__Impl rule__CalcExpr__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__CalcExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalcExpr__Group_1__2();

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
    // $ANTLR end "rule__CalcExpr__Group_1__1"


    // $ANTLR start "rule__CalcExpr__Group_1__1__Impl"
    // InternalCalculatrice.g:801:1: rule__CalcExpr__Group_1__1__Impl : ( ( rule__CalcExpr__OpAssignment_1_1 ) ) ;
    public final void rule__CalcExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:805:1: ( ( ( rule__CalcExpr__OpAssignment_1_1 ) ) )
            // InternalCalculatrice.g:806:1: ( ( rule__CalcExpr__OpAssignment_1_1 ) )
            {
            // InternalCalculatrice.g:806:1: ( ( rule__CalcExpr__OpAssignment_1_1 ) )
            // InternalCalculatrice.g:807:2: ( rule__CalcExpr__OpAssignment_1_1 )
            {
             before(grammarAccess.getCalcExprAccess().getOpAssignment_1_1()); 
            // InternalCalculatrice.g:808:2: ( rule__CalcExpr__OpAssignment_1_1 )
            // InternalCalculatrice.g:808:3: rule__CalcExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CalcExpr__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCalcExprAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExpr__Group_1__1__Impl"


    // $ANTLR start "rule__CalcExpr__Group_1__2"
    // InternalCalculatrice.g:816:1: rule__CalcExpr__Group_1__2 : rule__CalcExpr__Group_1__2__Impl ;
    public final void rule__CalcExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:820:1: ( rule__CalcExpr__Group_1__2__Impl )
            // InternalCalculatrice.g:821:2: rule__CalcExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalcExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__CalcExpr__Group_1__2"


    // $ANTLR start "rule__CalcExpr__Group_1__2__Impl"
    // InternalCalculatrice.g:827:1: rule__CalcExpr__Group_1__2__Impl : ( ( rule__CalcExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CalcExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:831:1: ( ( ( rule__CalcExpr__RightAssignment_1_2 ) ) )
            // InternalCalculatrice.g:832:1: ( ( rule__CalcExpr__RightAssignment_1_2 ) )
            {
            // InternalCalculatrice.g:832:1: ( ( rule__CalcExpr__RightAssignment_1_2 ) )
            // InternalCalculatrice.g:833:2: ( rule__CalcExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getCalcExprAccess().getRightAssignment_1_2()); 
            // InternalCalculatrice.g:834:2: ( rule__CalcExpr__RightAssignment_1_2 )
            // InternalCalculatrice.g:834:3: rule__CalcExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CalcExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCalcExprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExpr__Group_1__2__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalCalculatrice.g:843:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:847:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalCalculatrice.g:848:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

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
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalCalculatrice.g:855:1: rule__Term__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:859:1: ( ( ruleFactor ) )
            // InternalCalculatrice.g:860:1: ( ruleFactor )
            {
            // InternalCalculatrice.g:860:1: ( ruleFactor )
            // InternalCalculatrice.g:861:2: ruleFactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalCalculatrice.g:870:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:874:1: ( rule__Term__Group__1__Impl )
            // InternalCalculatrice.g:875:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

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
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalCalculatrice.g:881:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:885:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // InternalCalculatrice.g:886:1: ( ( rule__Term__Group_1__0 )? )
            {
            // InternalCalculatrice.g:886:1: ( ( rule__Term__Group_1__0 )? )
            // InternalCalculatrice.g:887:2: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalCalculatrice.g:888:2: ( rule__Term__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCalculatrice.g:888:3: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalCalculatrice.g:897:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:901:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalCalculatrice.g:902:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

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
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalCalculatrice.g:909:1: rule__Term__Group_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:913:1: ( ( () ) )
            // InternalCalculatrice.g:914:1: ( () )
            {
            // InternalCalculatrice.g:914:1: ( () )
            // InternalCalculatrice.g:915:2: ()
            {
             before(grammarAccess.getTermAccess().getCalcExprLeftAction_1_0()); 
            // InternalCalculatrice.g:916:2: ()
            // InternalCalculatrice.g:916:3: 
            {
            }

             after(grammarAccess.getTermAccess().getCalcExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalCalculatrice.g:924:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl rule__Term__Group_1__2 ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:928:1: ( rule__Term__Group_1__1__Impl rule__Term__Group_1__2 )
            // InternalCalculatrice.g:929:2: rule__Term__Group_1__1__Impl rule__Term__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Term__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__2();

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
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalCalculatrice.g:936:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__OpAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:940:1: ( ( ( rule__Term__OpAssignment_1_1 ) ) )
            // InternalCalculatrice.g:941:1: ( ( rule__Term__OpAssignment_1_1 ) )
            {
            // InternalCalculatrice.g:941:1: ( ( rule__Term__OpAssignment_1_1 ) )
            // InternalCalculatrice.g:942:2: ( rule__Term__OpAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getOpAssignment_1_1()); 
            // InternalCalculatrice.g:943:2: ( rule__Term__OpAssignment_1_1 )
            // InternalCalculatrice.g:943:3: rule__Term__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1__2"
    // InternalCalculatrice.g:951:1: rule__Term__Group_1__2 : rule__Term__Group_1__2__Impl ;
    public final void rule__Term__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:955:1: ( rule__Term__Group_1__2__Impl )
            // InternalCalculatrice.g:956:2: rule__Term__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__2__Impl();

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
    // $ANTLR end "rule__Term__Group_1__2"


    // $ANTLR start "rule__Term__Group_1__2__Impl"
    // InternalCalculatrice.g:962:1: rule__Term__Group_1__2__Impl : ( ( rule__Term__RightAssignment_1_2 ) ) ;
    public final void rule__Term__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:966:1: ( ( ( rule__Term__RightAssignment_1_2 ) ) )
            // InternalCalculatrice.g:967:1: ( ( rule__Term__RightAssignment_1_2 ) )
            {
            // InternalCalculatrice.g:967:1: ( ( rule__Term__RightAssignment_1_2 ) )
            // InternalCalculatrice.g:968:2: ( rule__Term__RightAssignment_1_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_2()); 
            // InternalCalculatrice.g:969:2: ( rule__Term__RightAssignment_1_2 )
            // InternalCalculatrice.g:969:3: rule__Term__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group_0__0"
    // InternalCalculatrice.g:978:1: rule__Factor__Group_0__0 : rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 ;
    public final void rule__Factor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:982:1: ( rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 )
            // InternalCalculatrice.g:983:2: rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Factor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__1();

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
    // $ANTLR end "rule__Factor__Group_0__0"


    // $ANTLR start "rule__Factor__Group_0__0__Impl"
    // InternalCalculatrice.g:990:1: rule__Factor__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:994:1: ( ( '(' ) )
            // InternalCalculatrice.g:995:1: ( '(' )
            {
            // InternalCalculatrice.g:995:1: ( '(' )
            // InternalCalculatrice.g:996:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_0__1"
    // InternalCalculatrice.g:1005:1: rule__Factor__Group_0__1 : rule__Factor__Group_0__1__Impl rule__Factor__Group_0__2 ;
    public final void rule__Factor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1009:1: ( rule__Factor__Group_0__1__Impl rule__Factor__Group_0__2 )
            // InternalCalculatrice.g:1010:2: rule__Factor__Group_0__1__Impl rule__Factor__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Factor__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__2();

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
    // $ANTLR end "rule__Factor__Group_0__1"


    // $ANTLR start "rule__Factor__Group_0__1__Impl"
    // InternalCalculatrice.g:1017:1: rule__Factor__Group_0__1__Impl : ( ruleCalcExpr ) ;
    public final void rule__Factor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1021:1: ( ( ruleCalcExpr ) )
            // InternalCalculatrice.g:1022:1: ( ruleCalcExpr )
            {
            // InternalCalculatrice.g:1022:1: ( ruleCalcExpr )
            // InternalCalculatrice.g:1023:2: ruleCalcExpr
            {
             before(grammarAccess.getFactorAccess().getCalcExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleCalcExpr();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getCalcExprParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_0__2"
    // InternalCalculatrice.g:1032:1: rule__Factor__Group_0__2 : rule__Factor__Group_0__2__Impl ;
    public final void rule__Factor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1036:1: ( rule__Factor__Group_0__2__Impl )
            // InternalCalculatrice.g:1037:2: rule__Factor__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__2__Impl();

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
    // $ANTLR end "rule__Factor__Group_0__2"


    // $ANTLR start "rule__Factor__Group_0__2__Impl"
    // InternalCalculatrice.g:1043:1: rule__Factor__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1047:1: ( ( ')' ) )
            // InternalCalculatrice.g:1048:1: ( ')' )
            {
            // InternalCalculatrice.g:1048:1: ( ')' )
            // InternalCalculatrice.g:1049:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_0_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__2__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalCalculatrice.g:1059:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1063:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalCalculatrice.g:1064:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

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
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalCalculatrice.g:1071:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1075:1: ( ( () ) )
            // InternalCalculatrice.g:1076:1: ( () )
            {
            // InternalCalculatrice.g:1076:1: ( () )
            // InternalCalculatrice.g:1077:2: ()
            {
             before(grammarAccess.getFactorAccess().getNumberAction_1_0()); 
            // InternalCalculatrice.g:1078:2: ()
            // InternalCalculatrice.g:1078:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getNumberAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalCalculatrice.g:1086:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1090:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalCalculatrice.g:1091:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2();

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
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalCalculatrice.g:1098:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__NegAssignment_1_1 )? ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1102:1: ( ( ( rule__Factor__NegAssignment_1_1 )? ) )
            // InternalCalculatrice.g:1103:1: ( ( rule__Factor__NegAssignment_1_1 )? )
            {
            // InternalCalculatrice.g:1103:1: ( ( rule__Factor__NegAssignment_1_1 )? )
            // InternalCalculatrice.g:1104:2: ( rule__Factor__NegAssignment_1_1 )?
            {
             before(grammarAccess.getFactorAccess().getNegAssignment_1_1()); 
            // InternalCalculatrice.g:1105:2: ( rule__Factor__NegAssignment_1_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalculatrice.g:1105:3: rule__Factor__NegAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NegAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getNegAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__2"
    // InternalCalculatrice.g:1113:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1117:1: ( rule__Factor__Group_1__2__Impl )
            // InternalCalculatrice.g:1118:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2__Impl();

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
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // InternalCalculatrice.g:1124:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__ValueAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1128:1: ( ( ( rule__Factor__ValueAssignment_1_2 ) ) )
            // InternalCalculatrice.g:1129:1: ( ( rule__Factor__ValueAssignment_1_2 ) )
            {
            // InternalCalculatrice.g:1129:1: ( ( rule__Factor__ValueAssignment_1_2 ) )
            // InternalCalculatrice.g:1130:2: ( rule__Factor__ValueAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getValueAssignment_1_2()); 
            // InternalCalculatrice.g:1131:2: ( rule__Factor__ValueAssignment_1_2 )
            // InternalCalculatrice.g:1131:3: rule__Factor__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group_2__0"
    // InternalCalculatrice.g:1140:1: rule__Factor__Group_2__0 : rule__Factor__Group_2__0__Impl rule__Factor__Group_2__1 ;
    public final void rule__Factor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1144:1: ( rule__Factor__Group_2__0__Impl rule__Factor__Group_2__1 )
            // InternalCalculatrice.g:1145:2: rule__Factor__Group_2__0__Impl rule__Factor__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Factor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_2__1();

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
    // $ANTLR end "rule__Factor__Group_2__0"


    // $ANTLR start "rule__Factor__Group_2__0__Impl"
    // InternalCalculatrice.g:1152:1: rule__Factor__Group_2__0__Impl : ( () ) ;
    public final void rule__Factor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1156:1: ( ( () ) )
            // InternalCalculatrice.g:1157:1: ( () )
            {
            // InternalCalculatrice.g:1157:1: ( () )
            // InternalCalculatrice.g:1158:2: ()
            {
             before(grammarAccess.getFactorAccess().getVarCallAction_2_0()); 
            // InternalCalculatrice.g:1159:2: ()
            // InternalCalculatrice.g:1159:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getVarCallAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_2__0__Impl"


    // $ANTLR start "rule__Factor__Group_2__1"
    // InternalCalculatrice.g:1167:1: rule__Factor__Group_2__1 : rule__Factor__Group_2__1__Impl ;
    public final void rule__Factor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1171:1: ( rule__Factor__Group_2__1__Impl )
            // InternalCalculatrice.g:1172:2: rule__Factor__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_2__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_2__1"


    // $ANTLR start "rule__Factor__Group_2__1__Impl"
    // InternalCalculatrice.g:1178:1: rule__Factor__Group_2__1__Impl : ( ( rule__Factor__VarCallAssignment_2_1 ) ) ;
    public final void rule__Factor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1182:1: ( ( ( rule__Factor__VarCallAssignment_2_1 ) ) )
            // InternalCalculatrice.g:1183:1: ( ( rule__Factor__VarCallAssignment_2_1 ) )
            {
            // InternalCalculatrice.g:1183:1: ( ( rule__Factor__VarCallAssignment_2_1 ) )
            // InternalCalculatrice.g:1184:2: ( rule__Factor__VarCallAssignment_2_1 )
            {
             before(grammarAccess.getFactorAccess().getVarCallAssignment_2_1()); 
            // InternalCalculatrice.g:1185:2: ( rule__Factor__VarCallAssignment_2_1 )
            // InternalCalculatrice.g:1185:3: rule__Factor__VarCallAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__VarCallAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getVarCallAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_2__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalCalculatrice.g:1194:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1198:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalCalculatrice.g:1199:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalCalculatrice.g:1206:1: rule__Condition__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1210:1: ( ( 'if' ) )
            // InternalCalculatrice.g:1211:1: ( 'if' )
            {
            // InternalCalculatrice.g:1211:1: ( 'if' )
            // InternalCalculatrice.g:1212:2: 'if'
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalCalculatrice.g:1221:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1225:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalCalculatrice.g:1226:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalCalculatrice.g:1233:1: rule__Condition__Group__1__Impl : ( ruleBoolExpr ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1237:1: ( ( ruleBoolExpr ) )
            // InternalCalculatrice.g:1238:1: ( ruleBoolExpr )
            {
            // InternalCalculatrice.g:1238:1: ( ruleBoolExpr )
            // InternalCalculatrice.g:1239:2: ruleBoolExpr
            {
             before(grammarAccess.getConditionAccess().getBoolExprParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleBoolExpr();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getBoolExprParserRuleCall_1()); 

            }


            }

        }
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
    // InternalCalculatrice.g:1248:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1252:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalCalculatrice.g:1253:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalCalculatrice.g:1260:1: rule__Condition__Group__2__Impl : ( 'then' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1264:1: ( ( 'then' ) )
            // InternalCalculatrice.g:1265:1: ( 'then' )
            {
            // InternalCalculatrice.g:1265:1: ( 'then' )
            // InternalCalculatrice.g:1266:2: 'then'
            {
             before(grammarAccess.getConditionAccess().getThenKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getThenKeyword_2()); 

            }


            }

        }
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
    // InternalCalculatrice.g:1275:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1279:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalCalculatrice.g:1280:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalCalculatrice.g:1287:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ThenBlockAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1291:1: ( ( ( rule__Condition__ThenBlockAssignment_3 ) ) )
            // InternalCalculatrice.g:1292:1: ( ( rule__Condition__ThenBlockAssignment_3 ) )
            {
            // InternalCalculatrice.g:1292:1: ( ( rule__Condition__ThenBlockAssignment_3 ) )
            // InternalCalculatrice.g:1293:2: ( rule__Condition__ThenBlockAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getThenBlockAssignment_3()); 
            // InternalCalculatrice.g:1294:2: ( rule__Condition__ThenBlockAssignment_3 )
            // InternalCalculatrice.g:1294:3: rule__Condition__ThenBlockAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ThenBlockAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getThenBlockAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Condition__Group__4"
    // InternalCalculatrice.g:1302:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1306:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalCalculatrice.g:1307:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

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
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalCalculatrice.g:1314:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__Group_4__0 )? ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1318:1: ( ( ( rule__Condition__Group_4__0 )? ) )
            // InternalCalculatrice.g:1319:1: ( ( rule__Condition__Group_4__0 )? )
            {
            // InternalCalculatrice.g:1319:1: ( ( rule__Condition__Group_4__0 )? )
            // InternalCalculatrice.g:1320:2: ( rule__Condition__Group_4__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_4()); 
            // InternalCalculatrice.g:1321:2: ( rule__Condition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCalculatrice.g:1321:3: rule__Condition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalCalculatrice.g:1329:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1333:1: ( rule__Condition__Group__5__Impl )
            // InternalCalculatrice.g:1334:2: rule__Condition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__5__Impl();

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
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalCalculatrice.g:1340:1: rule__Condition__Group__5__Impl : ( 'end' ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1344:1: ( ( 'end' ) )
            // InternalCalculatrice.g:1345:1: ( 'end' )
            {
            // InternalCalculatrice.g:1345:1: ( 'end' )
            // InternalCalculatrice.g:1346:2: 'end'
            {
             before(grammarAccess.getConditionAccess().getEndKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group_4__0"
    // InternalCalculatrice.g:1356:1: rule__Condition__Group_4__0 : rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1 ;
    public final void rule__Condition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1360:1: ( rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1 )
            // InternalCalculatrice.g:1361:2: rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Condition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_4__1();

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
    // $ANTLR end "rule__Condition__Group_4__0"


    // $ANTLR start "rule__Condition__Group_4__0__Impl"
    // InternalCalculatrice.g:1368:1: rule__Condition__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__Condition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1372:1: ( ( 'else' ) )
            // InternalCalculatrice.g:1373:1: ( 'else' )
            {
            // InternalCalculatrice.g:1373:1: ( 'else' )
            // InternalCalculatrice.g:1374:2: 'else'
            {
             before(grammarAccess.getConditionAccess().getElseKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getElseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__0__Impl"


    // $ANTLR start "rule__Condition__Group_4__1"
    // InternalCalculatrice.g:1383:1: rule__Condition__Group_4__1 : rule__Condition__Group_4__1__Impl ;
    public final void rule__Condition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1387:1: ( rule__Condition__Group_4__1__Impl )
            // InternalCalculatrice.g:1388:2: rule__Condition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_4__1__Impl();

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
    // $ANTLR end "rule__Condition__Group_4__1"


    // $ANTLR start "rule__Condition__Group_4__1__Impl"
    // InternalCalculatrice.g:1394:1: rule__Condition__Group_4__1__Impl : ( ( rule__Condition__ElseBlockAssignment_4_1 ) ) ;
    public final void rule__Condition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1398:1: ( ( ( rule__Condition__ElseBlockAssignment_4_1 ) ) )
            // InternalCalculatrice.g:1399:1: ( ( rule__Condition__ElseBlockAssignment_4_1 ) )
            {
            // InternalCalculatrice.g:1399:1: ( ( rule__Condition__ElseBlockAssignment_4_1 ) )
            // InternalCalculatrice.g:1400:2: ( rule__Condition__ElseBlockAssignment_4_1 )
            {
             before(grammarAccess.getConditionAccess().getElseBlockAssignment_4_1()); 
            // InternalCalculatrice.g:1401:2: ( rule__Condition__ElseBlockAssignment_4_1 )
            // InternalCalculatrice.g:1401:3: rule__Condition__ElseBlockAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ElseBlockAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getElseBlockAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__1__Impl"


    // $ANTLR start "rule__BoolExpr__Group__0"
    // InternalCalculatrice.g:1410:1: rule__BoolExpr__Group__0 : rule__BoolExpr__Group__0__Impl rule__BoolExpr__Group__1 ;
    public final void rule__BoolExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1414:1: ( rule__BoolExpr__Group__0__Impl rule__BoolExpr__Group__1 )
            // InternalCalculatrice.g:1415:2: rule__BoolExpr__Group__0__Impl rule__BoolExpr__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BoolExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group__1();

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
    // $ANTLR end "rule__BoolExpr__Group__0"


    // $ANTLR start "rule__BoolExpr__Group__0__Impl"
    // InternalCalculatrice.g:1422:1: rule__BoolExpr__Group__0__Impl : ( ruleBool ) ;
    public final void rule__BoolExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1426:1: ( ( ruleBool ) )
            // InternalCalculatrice.g:1427:1: ( ruleBool )
            {
            // InternalCalculatrice.g:1427:1: ( ruleBool )
            // InternalCalculatrice.g:1428:2: ruleBool
            {
             before(grammarAccess.getBoolExprAccess().getBoolParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolExprAccess().getBoolParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group__0__Impl"


    // $ANTLR start "rule__BoolExpr__Group__1"
    // InternalCalculatrice.g:1437:1: rule__BoolExpr__Group__1 : rule__BoolExpr__Group__1__Impl ;
    public final void rule__BoolExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1441:1: ( rule__BoolExpr__Group__1__Impl )
            // InternalCalculatrice.g:1442:2: rule__BoolExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group__1__Impl();

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
    // $ANTLR end "rule__BoolExpr__Group__1"


    // $ANTLR start "rule__BoolExpr__Group__1__Impl"
    // InternalCalculatrice.g:1448:1: rule__BoolExpr__Group__1__Impl : ( ( rule__BoolExpr__Group_1__0 )? ) ;
    public final void rule__BoolExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1452:1: ( ( ( rule__BoolExpr__Group_1__0 )? ) )
            // InternalCalculatrice.g:1453:1: ( ( rule__BoolExpr__Group_1__0 )? )
            {
            // InternalCalculatrice.g:1453:1: ( ( rule__BoolExpr__Group_1__0 )? )
            // InternalCalculatrice.g:1454:2: ( rule__BoolExpr__Group_1__0 )?
            {
             before(grammarAccess.getBoolExprAccess().getGroup_1()); 
            // InternalCalculatrice.g:1455:2: ( rule__BoolExpr__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=15 && LA15_0<=16)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatrice.g:1455:3: rule__BoolExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolExpr__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group__1__Impl"


    // $ANTLR start "rule__BoolExpr__Group_1__0"
    // InternalCalculatrice.g:1464:1: rule__BoolExpr__Group_1__0 : rule__BoolExpr__Group_1__0__Impl rule__BoolExpr__Group_1__1 ;
    public final void rule__BoolExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1468:1: ( rule__BoolExpr__Group_1__0__Impl rule__BoolExpr__Group_1__1 )
            // InternalCalculatrice.g:1469:2: rule__BoolExpr__Group_1__0__Impl rule__BoolExpr__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__BoolExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group_1__1();

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
    // $ANTLR end "rule__BoolExpr__Group_1__0"


    // $ANTLR start "rule__BoolExpr__Group_1__0__Impl"
    // InternalCalculatrice.g:1476:1: rule__BoolExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1480:1: ( ( () ) )
            // InternalCalculatrice.g:1481:1: ( () )
            {
            // InternalCalculatrice.g:1481:1: ( () )
            // InternalCalculatrice.g:1482:2: ()
            {
             before(grammarAccess.getBoolExprAccess().getBoolExprLeftAction_1_0()); 
            // InternalCalculatrice.g:1483:2: ()
            // InternalCalculatrice.g:1483:3: 
            {
            }

             after(grammarAccess.getBoolExprAccess().getBoolExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__0__Impl"


    // $ANTLR start "rule__BoolExpr__Group_1__1"
    // InternalCalculatrice.g:1491:1: rule__BoolExpr__Group_1__1 : rule__BoolExpr__Group_1__1__Impl rule__BoolExpr__Group_1__2 ;
    public final void rule__BoolExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1495:1: ( rule__BoolExpr__Group_1__1__Impl rule__BoolExpr__Group_1__2 )
            // InternalCalculatrice.g:1496:2: rule__BoolExpr__Group_1__1__Impl rule__BoolExpr__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__BoolExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group_1__2();

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
    // $ANTLR end "rule__BoolExpr__Group_1__1"


    // $ANTLR start "rule__BoolExpr__Group_1__1__Impl"
    // InternalCalculatrice.g:1503:1: rule__BoolExpr__Group_1__1__Impl : ( ( rule__BoolExpr__OpAssignment_1_1 ) ) ;
    public final void rule__BoolExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1507:1: ( ( ( rule__BoolExpr__OpAssignment_1_1 ) ) )
            // InternalCalculatrice.g:1508:1: ( ( rule__BoolExpr__OpAssignment_1_1 ) )
            {
            // InternalCalculatrice.g:1508:1: ( ( rule__BoolExpr__OpAssignment_1_1 ) )
            // InternalCalculatrice.g:1509:2: ( rule__BoolExpr__OpAssignment_1_1 )
            {
             before(grammarAccess.getBoolExprAccess().getOpAssignment_1_1()); 
            // InternalCalculatrice.g:1510:2: ( rule__BoolExpr__OpAssignment_1_1 )
            // InternalCalculatrice.g:1510:3: rule__BoolExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolExprAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__1__Impl"


    // $ANTLR start "rule__BoolExpr__Group_1__2"
    // InternalCalculatrice.g:1518:1: rule__BoolExpr__Group_1__2 : rule__BoolExpr__Group_1__2__Impl ;
    public final void rule__BoolExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1522:1: ( rule__BoolExpr__Group_1__2__Impl )
            // InternalCalculatrice.g:1523:2: rule__BoolExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__BoolExpr__Group_1__2"


    // $ANTLR start "rule__BoolExpr__Group_1__2__Impl"
    // InternalCalculatrice.g:1529:1: rule__BoolExpr__Group_1__2__Impl : ( ( rule__BoolExpr__RightAssignment_1_2 ) ) ;
    public final void rule__BoolExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1533:1: ( ( ( rule__BoolExpr__RightAssignment_1_2 ) ) )
            // InternalCalculatrice.g:1534:1: ( ( rule__BoolExpr__RightAssignment_1_2 ) )
            {
            // InternalCalculatrice.g:1534:1: ( ( rule__BoolExpr__RightAssignment_1_2 ) )
            // InternalCalculatrice.g:1535:2: ( rule__BoolExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getBoolExprAccess().getRightAssignment_1_2()); 
            // InternalCalculatrice.g:1536:2: ( rule__BoolExpr__RightAssignment_1_2 )
            // InternalCalculatrice.g:1536:3: rule__BoolExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBoolExprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__Group_1__2__Impl"


    // $ANTLR start "rule__Bool__Group_0__0"
    // InternalCalculatrice.g:1545:1: rule__Bool__Group_0__0 : rule__Bool__Group_0__0__Impl rule__Bool__Group_0__1 ;
    public final void rule__Bool__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1549:1: ( rule__Bool__Group_0__0__Impl rule__Bool__Group_0__1 )
            // InternalCalculatrice.g:1550:2: rule__Bool__Group_0__0__Impl rule__Bool__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Bool__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bool__Group_0__1();

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
    // $ANTLR end "rule__Bool__Group_0__0"


    // $ANTLR start "rule__Bool__Group_0__0__Impl"
    // InternalCalculatrice.g:1557:1: rule__Bool__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Bool__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1561:1: ( ( '(' ) )
            // InternalCalculatrice.g:1562:1: ( '(' )
            {
            // InternalCalculatrice.g:1562:1: ( '(' )
            // InternalCalculatrice.g:1563:2: '('
            {
             before(grammarAccess.getBoolAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoolAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_0__0__Impl"


    // $ANTLR start "rule__Bool__Group_0__1"
    // InternalCalculatrice.g:1572:1: rule__Bool__Group_0__1 : rule__Bool__Group_0__1__Impl rule__Bool__Group_0__2 ;
    public final void rule__Bool__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1576:1: ( rule__Bool__Group_0__1__Impl rule__Bool__Group_0__2 )
            // InternalCalculatrice.g:1577:2: rule__Bool__Group_0__1__Impl rule__Bool__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Bool__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bool__Group_0__2();

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
    // $ANTLR end "rule__Bool__Group_0__1"


    // $ANTLR start "rule__Bool__Group_0__1__Impl"
    // InternalCalculatrice.g:1584:1: rule__Bool__Group_0__1__Impl : ( ruleBoolExpr ) ;
    public final void rule__Bool__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1588:1: ( ( ruleBoolExpr ) )
            // InternalCalculatrice.g:1589:1: ( ruleBoolExpr )
            {
            // InternalCalculatrice.g:1589:1: ( ruleBoolExpr )
            // InternalCalculatrice.g:1590:2: ruleBoolExpr
            {
             before(grammarAccess.getBoolAccess().getBoolExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleBoolExpr();

            state._fsp--;

             after(grammarAccess.getBoolAccess().getBoolExprParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_0__1__Impl"


    // $ANTLR start "rule__Bool__Group_0__2"
    // InternalCalculatrice.g:1599:1: rule__Bool__Group_0__2 : rule__Bool__Group_0__2__Impl ;
    public final void rule__Bool__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1603:1: ( rule__Bool__Group_0__2__Impl )
            // InternalCalculatrice.g:1604:2: rule__Bool__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group_0__2__Impl();

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
    // $ANTLR end "rule__Bool__Group_0__2"


    // $ANTLR start "rule__Bool__Group_0__2__Impl"
    // InternalCalculatrice.g:1610:1: rule__Bool__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Bool__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1614:1: ( ( ')' ) )
            // InternalCalculatrice.g:1615:1: ( ')' )
            {
            // InternalCalculatrice.g:1615:1: ( ')' )
            // InternalCalculatrice.g:1616:2: ')'
            {
             before(grammarAccess.getBoolAccess().getRightParenthesisKeyword_0_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoolAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_0__2__Impl"


    // $ANTLR start "rule__Bool__Group_1__0"
    // InternalCalculatrice.g:1626:1: rule__Bool__Group_1__0 : rule__Bool__Group_1__0__Impl rule__Bool__Group_1__1 ;
    public final void rule__Bool__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1630:1: ( rule__Bool__Group_1__0__Impl rule__Bool__Group_1__1 )
            // InternalCalculatrice.g:1631:2: rule__Bool__Group_1__0__Impl rule__Bool__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Bool__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bool__Group_1__1();

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
    // $ANTLR end "rule__Bool__Group_1__0"


    // $ANTLR start "rule__Bool__Group_1__0__Impl"
    // InternalCalculatrice.g:1638:1: rule__Bool__Group_1__0__Impl : ( () ) ;
    public final void rule__Bool__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1642:1: ( ( () ) )
            // InternalCalculatrice.g:1643:1: ( () )
            {
            // InternalCalculatrice.g:1643:1: ( () )
            // InternalCalculatrice.g:1644:2: ()
            {
             before(grammarAccess.getBoolAccess().getBooleanAction_1_0()); 
            // InternalCalculatrice.g:1645:2: ()
            // InternalCalculatrice.g:1645:3: 
            {
            }

             after(grammarAccess.getBoolAccess().getBooleanAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_1__0__Impl"


    // $ANTLR start "rule__Bool__Group_1__1"
    // InternalCalculatrice.g:1653:1: rule__Bool__Group_1__1 : rule__Bool__Group_1__1__Impl ;
    public final void rule__Bool__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1657:1: ( rule__Bool__Group_1__1__Impl )
            // InternalCalculatrice.g:1658:2: rule__Bool__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group_1__1__Impl();

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
    // $ANTLR end "rule__Bool__Group_1__1"


    // $ANTLR start "rule__Bool__Group_1__1__Impl"
    // InternalCalculatrice.g:1664:1: rule__Bool__Group_1__1__Impl : ( ( rule__Bool__BoolValueAssignment_1_1 ) ) ;
    public final void rule__Bool__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1668:1: ( ( ( rule__Bool__BoolValueAssignment_1_1 ) ) )
            // InternalCalculatrice.g:1669:1: ( ( rule__Bool__BoolValueAssignment_1_1 ) )
            {
            // InternalCalculatrice.g:1669:1: ( ( rule__Bool__BoolValueAssignment_1_1 ) )
            // InternalCalculatrice.g:1670:2: ( rule__Bool__BoolValueAssignment_1_1 )
            {
             before(grammarAccess.getBoolAccess().getBoolValueAssignment_1_1()); 
            // InternalCalculatrice.g:1671:2: ( rule__Bool__BoolValueAssignment_1_1 )
            // InternalCalculatrice.g:1671:3: rule__Bool__BoolValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Bool__BoolValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getBoolValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_1__1__Impl"


    // $ANTLR start "rule__Calculatrice__CalculsAssignment_0"
    // InternalCalculatrice.g:1680:1: rule__Calculatrice__CalculsAssignment_0 : ( ruleCalc ) ;
    public final void rule__Calculatrice__CalculsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1684:1: ( ( ruleCalc ) )
            // InternalCalculatrice.g:1685:2: ( ruleCalc )
            {
            // InternalCalculatrice.g:1685:2: ( ruleCalc )
            // InternalCalculatrice.g:1686:3: ruleCalc
            {
             before(grammarAccess.getCalculatriceAccess().getCalculsCalcParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCalc();

            state._fsp--;

             after(grammarAccess.getCalculatriceAccess().getCalculsCalcParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculatrice__CalculsAssignment_0"


    // $ANTLR start "rule__Calc__BoolNameAssignment_0_1"
    // InternalCalculatrice.g:1695:1: rule__Calc__BoolNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Calc__BoolNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1699:1: ( ( RULE_ID ) )
            // InternalCalculatrice.g:1700:2: ( RULE_ID )
            {
            // InternalCalculatrice.g:1700:2: ( RULE_ID )
            // InternalCalculatrice.g:1701:3: RULE_ID
            {
             before(grammarAccess.getCalcAccess().getBoolNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalcAccess().getBoolNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__BoolNameAssignment_0_1"


    // $ANTLR start "rule__Calc__BAssignment_0_3"
    // InternalCalculatrice.g:1710:1: rule__Calc__BAssignment_0_3 : ( ruleBoolExpr ) ;
    public final void rule__Calc__BAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1714:1: ( ( ruleBoolExpr ) )
            // InternalCalculatrice.g:1715:2: ( ruleBoolExpr )
            {
            // InternalCalculatrice.g:1715:2: ( ruleBoolExpr )
            // InternalCalculatrice.g:1716:3: ruleBoolExpr
            {
             before(grammarAccess.getCalcAccess().getBBoolExprParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolExpr();

            state._fsp--;

             after(grammarAccess.getCalcAccess().getBBoolExprParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__BAssignment_0_3"


    // $ANTLR start "rule__Calc__DeclAssignment_2_0_0"
    // InternalCalculatrice.g:1725:1: rule__Calc__DeclAssignment_2_0_0 : ( ( 'var' ) ) ;
    public final void rule__Calc__DeclAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1729:1: ( ( ( 'var' ) ) )
            // InternalCalculatrice.g:1730:2: ( ( 'var' ) )
            {
            // InternalCalculatrice.g:1730:2: ( ( 'var' ) )
            // InternalCalculatrice.g:1731:3: ( 'var' )
            {
             before(grammarAccess.getCalcAccess().getDeclVarKeyword_2_0_0_0()); 
            // InternalCalculatrice.g:1732:3: ( 'var' )
            // InternalCalculatrice.g:1733:4: 'var'
            {
             before(grammarAccess.getCalcAccess().getDeclVarKeyword_2_0_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCalcAccess().getDeclVarKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getCalcAccess().getDeclVarKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__DeclAssignment_2_0_0"


    // $ANTLR start "rule__Calc__VarNameAssignment_2_0_1"
    // InternalCalculatrice.g:1744:1: rule__Calc__VarNameAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__Calc__VarNameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1748:1: ( ( RULE_ID ) )
            // InternalCalculatrice.g:1749:2: ( RULE_ID )
            {
            // InternalCalculatrice.g:1749:2: ( RULE_ID )
            // InternalCalculatrice.g:1750:3: RULE_ID
            {
             before(grammarAccess.getCalcAccess().getVarNameIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalcAccess().getVarNameIDTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__VarNameAssignment_2_0_1"


    // $ANTLR start "rule__Calc__EAssignment_2_1"
    // InternalCalculatrice.g:1759:1: rule__Calc__EAssignment_2_1 : ( ruleCalcExpr ) ;
    public final void rule__Calc__EAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1763:1: ( ( ruleCalcExpr ) )
            // InternalCalculatrice.g:1764:2: ( ruleCalcExpr )
            {
            // InternalCalculatrice.g:1764:2: ( ruleCalcExpr )
            // InternalCalculatrice.g:1765:3: ruleCalcExpr
            {
             before(grammarAccess.getCalcAccess().getECalcExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalcExpr();

            state._fsp--;

             after(grammarAccess.getCalcAccess().getECalcExprParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calc__EAssignment_2_1"


    // $ANTLR start "rule__CalcExpr__OpAssignment_1_1"
    // InternalCalculatrice.g:1774:1: rule__CalcExpr__OpAssignment_1_1 : ( ( rule__CalcExpr__OpAlternatives_1_1_0 ) ) ;
    public final void rule__CalcExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1778:1: ( ( ( rule__CalcExpr__OpAlternatives_1_1_0 ) ) )
            // InternalCalculatrice.g:1779:2: ( ( rule__CalcExpr__OpAlternatives_1_1_0 ) )
            {
            // InternalCalculatrice.g:1779:2: ( ( rule__CalcExpr__OpAlternatives_1_1_0 ) )
            // InternalCalculatrice.g:1780:3: ( rule__CalcExpr__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getCalcExprAccess().getOpAlternatives_1_1_0()); 
            // InternalCalculatrice.g:1781:3: ( rule__CalcExpr__OpAlternatives_1_1_0 )
            // InternalCalculatrice.g:1781:4: rule__CalcExpr__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CalcExpr__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCalcExprAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExpr__OpAssignment_1_1"


    // $ANTLR start "rule__CalcExpr__RightAssignment_1_2"
    // InternalCalculatrice.g:1789:1: rule__CalcExpr__RightAssignment_1_2 : ( ruleCalcExpr ) ;
    public final void rule__CalcExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1793:1: ( ( ruleCalcExpr ) )
            // InternalCalculatrice.g:1794:2: ( ruleCalcExpr )
            {
            // InternalCalculatrice.g:1794:2: ( ruleCalcExpr )
            // InternalCalculatrice.g:1795:3: ruleCalcExpr
            {
             before(grammarAccess.getCalcExprAccess().getRightCalcExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCalcExpr();

            state._fsp--;

             after(grammarAccess.getCalcExprAccess().getRightCalcExprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExpr__RightAssignment_1_2"


    // $ANTLR start "rule__Term__OpAssignment_1_1"
    // InternalCalculatrice.g:1804:1: rule__Term__OpAssignment_1_1 : ( ( rule__Term__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Term__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1808:1: ( ( ( rule__Term__OpAlternatives_1_1_0 ) ) )
            // InternalCalculatrice.g:1809:2: ( ( rule__Term__OpAlternatives_1_1_0 ) )
            {
            // InternalCalculatrice.g:1809:2: ( ( rule__Term__OpAlternatives_1_1_0 ) )
            // InternalCalculatrice.g:1810:3: ( rule__Term__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getTermAccess().getOpAlternatives_1_1_0()); 
            // InternalCalculatrice.g:1811:3: ( rule__Term__OpAlternatives_1_1_0 )
            // InternalCalculatrice.g:1811:4: rule__Term__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__OpAssignment_1_1"


    // $ANTLR start "rule__Term__RightAssignment_1_2"
    // InternalCalculatrice.g:1819:1: rule__Term__RightAssignment_1_2 : ( ruleTerm ) ;
    public final void rule__Term__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1823:1: ( ( ruleTerm ) )
            // InternalCalculatrice.g:1824:2: ( ruleTerm )
            {
            // InternalCalculatrice.g:1824:2: ( ruleTerm )
            // InternalCalculatrice.g:1825:3: ruleTerm
            {
             before(grammarAccess.getTermAccess().getRightTermParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightTermParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RightAssignment_1_2"


    // $ANTLR start "rule__Factor__NegAssignment_1_1"
    // InternalCalculatrice.g:1834:1: rule__Factor__NegAssignment_1_1 : ( ( '-' ) ) ;
    public final void rule__Factor__NegAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1838:1: ( ( ( '-' ) ) )
            // InternalCalculatrice.g:1839:2: ( ( '-' ) )
            {
            // InternalCalculatrice.g:1839:2: ( ( '-' ) )
            // InternalCalculatrice.g:1840:3: ( '-' )
            {
             before(grammarAccess.getFactorAccess().getNegHyphenMinusKeyword_1_1_0()); 
            // InternalCalculatrice.g:1841:3: ( '-' )
            // InternalCalculatrice.g:1842:4: '-'
            {
             before(grammarAccess.getFactorAccess().getNegHyphenMinusKeyword_1_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNegHyphenMinusKeyword_1_1_0()); 

            }

             after(grammarAccess.getFactorAccess().getNegHyphenMinusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NegAssignment_1_1"


    // $ANTLR start "rule__Factor__ValueAssignment_1_2"
    // InternalCalculatrice.g:1853:1: rule__Factor__ValueAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Factor__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1857:1: ( ( RULE_INT ) )
            // InternalCalculatrice.g:1858:2: ( RULE_INT )
            {
            // InternalCalculatrice.g:1858:2: ( RULE_INT )
            // InternalCalculatrice.g:1859:3: RULE_INT
            {
             before(grammarAccess.getFactorAccess().getValueINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getValueINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ValueAssignment_1_2"


    // $ANTLR start "rule__Factor__VarCallAssignment_2_1"
    // InternalCalculatrice.g:1868:1: rule__Factor__VarCallAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Factor__VarCallAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1872:1: ( ( RULE_ID ) )
            // InternalCalculatrice.g:1873:2: ( RULE_ID )
            {
            // InternalCalculatrice.g:1873:2: ( RULE_ID )
            // InternalCalculatrice.g:1874:3: RULE_ID
            {
             before(grammarAccess.getFactorAccess().getVarCallIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getVarCallIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__VarCallAssignment_2_1"


    // $ANTLR start "rule__Condition__ThenBlockAssignment_3"
    // InternalCalculatrice.g:1883:1: rule__Condition__ThenBlockAssignment_3 : ( ruleCalc ) ;
    public final void rule__Condition__ThenBlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1887:1: ( ( ruleCalc ) )
            // InternalCalculatrice.g:1888:2: ( ruleCalc )
            {
            // InternalCalculatrice.g:1888:2: ( ruleCalc )
            // InternalCalculatrice.g:1889:3: ruleCalc
            {
             before(grammarAccess.getConditionAccess().getThenBlockCalcParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCalc();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getThenBlockCalcParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ThenBlockAssignment_3"


    // $ANTLR start "rule__Condition__ElseBlockAssignment_4_1"
    // InternalCalculatrice.g:1898:1: rule__Condition__ElseBlockAssignment_4_1 : ( ruleCalc ) ;
    public final void rule__Condition__ElseBlockAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1902:1: ( ( ruleCalc ) )
            // InternalCalculatrice.g:1903:2: ( ruleCalc )
            {
            // InternalCalculatrice.g:1903:2: ( ruleCalc )
            // InternalCalculatrice.g:1904:3: ruleCalc
            {
             before(grammarAccess.getConditionAccess().getElseBlockCalcParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalc();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getElseBlockCalcParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ElseBlockAssignment_4_1"


    // $ANTLR start "rule__BoolExpr__OpAssignment_1_1"
    // InternalCalculatrice.g:1913:1: rule__BoolExpr__OpAssignment_1_1 : ( ( rule__BoolExpr__OpAlternatives_1_1_0 ) ) ;
    public final void rule__BoolExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1917:1: ( ( ( rule__BoolExpr__OpAlternatives_1_1_0 ) ) )
            // InternalCalculatrice.g:1918:2: ( ( rule__BoolExpr__OpAlternatives_1_1_0 ) )
            {
            // InternalCalculatrice.g:1918:2: ( ( rule__BoolExpr__OpAlternatives_1_1_0 ) )
            // InternalCalculatrice.g:1919:3: ( rule__BoolExpr__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getBoolExprAccess().getOpAlternatives_1_1_0()); 
            // InternalCalculatrice.g:1920:3: ( rule__BoolExpr__OpAlternatives_1_1_0 )
            // InternalCalculatrice.g:1920:4: rule__BoolExpr__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpr__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolExprAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__OpAssignment_1_1"


    // $ANTLR start "rule__BoolExpr__RightAssignment_1_2"
    // InternalCalculatrice.g:1928:1: rule__BoolExpr__RightAssignment_1_2 : ( ruleBoolExpr ) ;
    public final void rule__BoolExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1932:1: ( ( ruleBoolExpr ) )
            // InternalCalculatrice.g:1933:2: ( ruleBoolExpr )
            {
            // InternalCalculatrice.g:1933:2: ( ruleBoolExpr )
            // InternalCalculatrice.g:1934:3: ruleBoolExpr
            {
             before(grammarAccess.getBoolExprAccess().getRightBoolExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolExpr();

            state._fsp--;

             after(grammarAccess.getBoolExprAccess().getRightBoolExprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpr__RightAssignment_1_2"


    // $ANTLR start "rule__Bool__BoolValueAssignment_1_1"
    // InternalCalculatrice.g:1943:1: rule__Bool__BoolValueAssignment_1_1 : ( ( rule__Bool__BoolValueAlternatives_1_1_0 ) ) ;
    public final void rule__Bool__BoolValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatrice.g:1947:1: ( ( ( rule__Bool__BoolValueAlternatives_1_1_0 ) ) )
            // InternalCalculatrice.g:1948:2: ( ( rule__Bool__BoolValueAlternatives_1_1_0 ) )
            {
            // InternalCalculatrice.g:1948:2: ( ( rule__Bool__BoolValueAlternatives_1_1_0 ) )
            // InternalCalculatrice.g:1949:3: ( rule__Bool__BoolValueAlternatives_1_1_0 )
            {
             before(grammarAccess.getBoolAccess().getBoolValueAlternatives_1_1_0()); 
            // InternalCalculatrice.g:1950:3: ( rule__Bool__BoolValueAlternatives_1_1_0 )
            // InternalCalculatrice.g:1950:4: rule__Bool__BoolValueAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Bool__BoolValueAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getBoolValueAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__BoolValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000011501032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000011501030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000018000L});

}