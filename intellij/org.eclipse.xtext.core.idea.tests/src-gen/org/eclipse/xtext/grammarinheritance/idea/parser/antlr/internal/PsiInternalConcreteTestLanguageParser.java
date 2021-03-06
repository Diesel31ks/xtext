package org.eclipse.xtext.grammarinheritance.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.grammarinheritance.idea.lang.ConcreteTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.grammarinheritance.services.ConcreteTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalConcreteTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REAL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "'overriddenelement'", "'overridden other element'", "'-'", "'subrule1'", "'subrule3'", "'element'", "'overridemodel'", "'extendedmodel'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=4;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public PsiInternalConcreteTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalConcreteTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalConcreteTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalConcreteTestLanguage.g"; }



    	protected ConcreteTestLanguageGrammarAccess grammarAccess;

    	protected ConcreteTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalConcreteTestLanguageParser(PsiBuilder builder, TokenStream input, ConcreteTestLanguageElementTypeProvider elementTypeProvider, ConcreteTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "RootRule";
    	}




    // $ANTLR start "entryRuleRootRule"
    // PsiInternalConcreteTestLanguage.g:52:1: entryRuleRootRule : ruleRootRule EOF ;
    public final void entryRuleRootRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:52:18: ( ruleRootRule EOF )
            // PsiInternalConcreteTestLanguage.g:53:2: ruleRootRule EOF
            {
             markComposite(elementTypeProvider.getRootRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRootRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRootRule"


    // $ANTLR start "ruleRootRule"
    // PsiInternalConcreteTestLanguage.g:58:1: ruleRootRule : ( ruleConcreteParserRule | ruleCallOverridenParserRule | ruleCallExtendedParserRule | ruleOverridableParserRule2 ) ;
    public final void ruleRootRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:58:13: ( ( ruleConcreteParserRule | ruleCallOverridenParserRule | ruleCallExtendedParserRule | ruleOverridableParserRule2 ) )
            // PsiInternalConcreteTestLanguage.g:59:2: ( ruleConcreteParserRule | ruleCallOverridenParserRule | ruleCallExtendedParserRule | ruleOverridableParserRule2 )
            {
            // PsiInternalConcreteTestLanguage.g:59:2: ( ruleConcreteParserRule | ruleCallOverridenParserRule | ruleCallExtendedParserRule | ruleOverridableParserRule2 )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // PsiInternalConcreteTestLanguage.g:60:3: ruleConcreteParserRule
                    {

                    			markComposite(elementTypeProvider.getRootRule_ConcreteParserRuleParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleConcreteParserRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalConcreteTestLanguage.g:68:3: ruleCallOverridenParserRule
                    {

                    			markComposite(elementTypeProvider.getRootRule_CallOverridenParserRuleParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCallOverridenParserRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalConcreteTestLanguage.g:76:3: ruleCallExtendedParserRule
                    {

                    			markComposite(elementTypeProvider.getRootRule_CallExtendedParserRuleParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCallExtendedParserRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalConcreteTestLanguage.g:84:3: ruleOverridableParserRule2
                    {

                    			markComposite(elementTypeProvider.getRootRule_OverridableParserRule2ParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOverridableParserRule2();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleRootRule"


    // $ANTLR start "entryRuleConcreteParserRule"
    // PsiInternalConcreteTestLanguage.g:95:1: entryRuleConcreteParserRule : ruleConcreteParserRule EOF ;
    public final void entryRuleConcreteParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:95:28: ( ruleConcreteParserRule EOF )
            // PsiInternalConcreteTestLanguage.g:96:2: ruleConcreteParserRule EOF
            {
             markComposite(elementTypeProvider.getConcreteParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConcreteParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleConcreteParserRule"


    // $ANTLR start "ruleConcreteParserRule"
    // PsiInternalConcreteTestLanguage.g:101:1: ruleConcreteParserRule : (otherlv_0= 'model' ( (lv_magicNumber_1_0= RULE_REAL ) ) otherlv_2= ':' ( (lv_elements_3_0= ruleInheritedParserRule ) )* ) ;
    public final void ruleConcreteParserRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_magicNumber_1_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalConcreteTestLanguage.g:101:23: ( (otherlv_0= 'model' ( (lv_magicNumber_1_0= RULE_REAL ) ) otherlv_2= ':' ( (lv_elements_3_0= ruleInheritedParserRule ) )* ) )
            // PsiInternalConcreteTestLanguage.g:102:2: (otherlv_0= 'model' ( (lv_magicNumber_1_0= RULE_REAL ) ) otherlv_2= ':' ( (lv_elements_3_0= ruleInheritedParserRule ) )* )
            {
            // PsiInternalConcreteTestLanguage.g:102:2: (otherlv_0= 'model' ( (lv_magicNumber_1_0= RULE_REAL ) ) otherlv_2= ':' ( (lv_elements_3_0= ruleInheritedParserRule ) )* )
            // PsiInternalConcreteTestLanguage.g:103:3: otherlv_0= 'model' ( (lv_magicNumber_1_0= RULE_REAL ) ) otherlv_2= ':' ( (lv_elements_3_0= ruleInheritedParserRule ) )*
            {

            			markLeaf(elementTypeProvider.getConcreteParserRule_ModelKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:110:3: ( (lv_magicNumber_1_0= RULE_REAL ) )
            // PsiInternalConcreteTestLanguage.g:111:4: (lv_magicNumber_1_0= RULE_REAL )
            {
            // PsiInternalConcreteTestLanguage.g:111:4: (lv_magicNumber_1_0= RULE_REAL )
            // PsiInternalConcreteTestLanguage.g:112:5: lv_magicNumber_1_0= RULE_REAL
            {

            					markLeaf(elementTypeProvider.getConcreteParserRule_MagicNumberREALTerminalRuleCall_1_0ElementType());
            				
            lv_magicNumber_1_0=(Token)match(input,RULE_REAL,FollowSets000.FOLLOW_4); 

            					doneLeaf(lv_magicNumber_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getConcreteParserRule_ColonKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalConcreteTestLanguage.g:128:3: ( (lv_elements_3_0= ruleInheritedParserRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalConcreteTestLanguage.g:129:4: (lv_elements_3_0= ruleInheritedParserRule )
            	    {
            	    // PsiInternalConcreteTestLanguage.g:129:4: (lv_elements_3_0= ruleInheritedParserRule )
            	    // PsiInternalConcreteTestLanguage.g:130:5: lv_elements_3_0= ruleInheritedParserRule
            	    {

            	    					markComposite(elementTypeProvider.getConcreteParserRule_ElementsInheritedParserRuleParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    ruleInheritedParserRule();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleConcreteParserRule"


    // $ANTLR start "entryRuleOverridableParserRule"
    // PsiInternalConcreteTestLanguage.g:143:1: entryRuleOverridableParserRule : ruleOverridableParserRule EOF ;
    public final void entryRuleOverridableParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:143:31: ( ruleOverridableParserRule EOF )
            // PsiInternalConcreteTestLanguage.g:144:2: ruleOverridableParserRule EOF
            {
             markComposite(elementTypeProvider.getOverridableParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOverridableParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleOverridableParserRule"


    // $ANTLR start "ruleOverridableParserRule"
    // PsiInternalConcreteTestLanguage.g:149:1: ruleOverridableParserRule : (otherlv_0= 'overriddenelement' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final void ruleOverridableParserRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalConcreteTestLanguage.g:149:26: ( (otherlv_0= 'overriddenelement' ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalConcreteTestLanguage.g:150:2: (otherlv_0= 'overriddenelement' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalConcreteTestLanguage.g:150:2: (otherlv_0= 'overriddenelement' ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalConcreteTestLanguage.g:151:3: otherlv_0= 'overriddenelement' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getOverridableParserRule_OverriddenelementKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:158:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalConcreteTestLanguage.g:159:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalConcreteTestLanguage.g:159:4: (lv_name_1_0= RULE_ID )
            // PsiInternalConcreteTestLanguage.g:160:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getOverridableParserRule_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_1_0);
            				

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
        }
        return ;
    }
    // $ANTLR end "ruleOverridableParserRule"


    // $ANTLR start "entryRuleCallOverridenParserRule"
    // PsiInternalConcreteTestLanguage.g:173:1: entryRuleCallOverridenParserRule : ruleCallOverridenParserRule EOF ;
    public final void entryRuleCallOverridenParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:173:33: ( ruleCallOverridenParserRule EOF )
            // PsiInternalConcreteTestLanguage.g:174:2: ruleCallOverridenParserRule EOF
            {
             markComposite(elementTypeProvider.getCallOverridenParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCallOverridenParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCallOverridenParserRule"


    // $ANTLR start "ruleCallOverridenParserRule"
    // PsiInternalConcreteTestLanguage.g:179:1: ruleCallOverridenParserRule : ( (lv_call_0_0= ruleAbstractCallOverridenParserRule ) ) ;
    public final void ruleCallOverridenParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:179:28: ( ( (lv_call_0_0= ruleAbstractCallOverridenParserRule ) ) )
            // PsiInternalConcreteTestLanguage.g:180:2: ( (lv_call_0_0= ruleAbstractCallOverridenParserRule ) )
            {
            // PsiInternalConcreteTestLanguage.g:180:2: ( (lv_call_0_0= ruleAbstractCallOverridenParserRule ) )
            // PsiInternalConcreteTestLanguage.g:181:3: (lv_call_0_0= ruleAbstractCallOverridenParserRule )
            {
            // PsiInternalConcreteTestLanguage.g:181:3: (lv_call_0_0= ruleAbstractCallOverridenParserRule )
            // PsiInternalConcreteTestLanguage.g:182:4: lv_call_0_0= ruleAbstractCallOverridenParserRule
            {

            				markComposite(elementTypeProvider.getCallOverridenParserRule_CallAbstractCallOverridenParserRuleParserRuleCall_0ElementType());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractCallOverridenParserRule();

            state._fsp--;


            				doneComposite();
            			

            }


            }


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
    // $ANTLR end "ruleCallOverridenParserRule"


    // $ANTLR start "entryRuleOverridableParserRule2"
    // PsiInternalConcreteTestLanguage.g:194:1: entryRuleOverridableParserRule2 : ruleOverridableParserRule2 EOF ;
    public final void entryRuleOverridableParserRule2() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:194:32: ( ruleOverridableParserRule2 EOF )
            // PsiInternalConcreteTestLanguage.g:195:2: ruleOverridableParserRule2 EOF
            {
             markComposite(elementTypeProvider.getOverridableParserRule2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOverridableParserRule2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleOverridableParserRule2"


    // $ANTLR start "ruleOverridableParserRule2"
    // PsiInternalConcreteTestLanguage.g:200:1: ruleOverridableParserRule2 : (otherlv_0= 'overridden other element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_age_3_0= RULE_INT ) ) ) ;
    public final void ruleOverridableParserRule2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_age_3_0=null;

        try {
            // PsiInternalConcreteTestLanguage.g:200:27: ( (otherlv_0= 'overridden other element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_age_3_0= RULE_INT ) ) ) )
            // PsiInternalConcreteTestLanguage.g:201:2: (otherlv_0= 'overridden other element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_age_3_0= RULE_INT ) ) )
            {
            // PsiInternalConcreteTestLanguage.g:201:2: (otherlv_0= 'overridden other element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_age_3_0= RULE_INT ) ) )
            // PsiInternalConcreteTestLanguage.g:202:3: otherlv_0= 'overridden other element' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '-' ( (lv_age_3_0= RULE_INT ) )
            {

            			markLeaf(elementTypeProvider.getOverridableParserRule2_OverriddenOtherElementKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:209:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalConcreteTestLanguage.g:210:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalConcreteTestLanguage.g:210:4: (lv_name_1_0= RULE_ID )
            // PsiInternalConcreteTestLanguage.g:211:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getOverridableParserRule2_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getOverridableParserRule2_HyphenMinusKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_8); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalConcreteTestLanguage.g:227:3: ( (lv_age_3_0= RULE_INT ) )
            // PsiInternalConcreteTestLanguage.g:228:4: (lv_age_3_0= RULE_INT )
            {
            // PsiInternalConcreteTestLanguage.g:228:4: (lv_age_3_0= RULE_INT )
            // PsiInternalConcreteTestLanguage.g:229:5: lv_age_3_0= RULE_INT
            {

            					markLeaf(elementTypeProvider.getOverridableParserRule2_AgeINTTerminalRuleCall_3_0ElementType());
            				
            lv_age_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_age_3_0);
            				

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
        }
        return ;
    }
    // $ANTLR end "ruleOverridableParserRule2"


    // $ANTLR start "entryRuleExtendableParserRule"
    // PsiInternalConcreteTestLanguage.g:242:1: entryRuleExtendableParserRule : ruleExtendableParserRule EOF ;
    public final void entryRuleExtendableParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:242:30: ( ruleExtendableParserRule EOF )
            // PsiInternalConcreteTestLanguage.g:243:2: ruleExtendableParserRule EOF
            {
             markComposite(elementTypeProvider.getExtendableParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExtendableParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleExtendableParserRule"


    // $ANTLR start "ruleExtendableParserRule"
    // PsiInternalConcreteTestLanguage.g:248:1: ruleExtendableParserRule : ( ruleSubrule1 | ruleSubrule2 | ruleSubrule3 ) ;
    public final void ruleExtendableParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:248:25: ( ( ruleSubrule1 | ruleSubrule2 | ruleSubrule3 ) )
            // PsiInternalConcreteTestLanguage.g:249:2: ( ruleSubrule1 | ruleSubrule2 | ruleSubrule3 )
            {
            // PsiInternalConcreteTestLanguage.g:249:2: ( ruleSubrule1 | ruleSubrule2 | ruleSubrule3 )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==RULE_INT) ) {
                        alt3=3;
                    }
                    else if ( (LA3_3==RULE_STRING) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalConcreteTestLanguage.g:250:3: ruleSubrule1
                    {

                    			markComposite(elementTypeProvider.getExtendableParserRule_Subrule1ParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSubrule1();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalConcreteTestLanguage.g:258:3: ruleSubrule2
                    {

                    			markComposite(elementTypeProvider.getExtendableParserRule_Subrule2ParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSubrule2();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalConcreteTestLanguage.g:266:3: ruleSubrule3
                    {

                    			markComposite(elementTypeProvider.getExtendableParserRule_Subrule3ParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSubrule3();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleExtendableParserRule"


    // $ANTLR start "entryRuleSubrule1"
    // PsiInternalConcreteTestLanguage.g:277:1: entryRuleSubrule1 : ruleSubrule1 EOF ;
    public final void entryRuleSubrule1() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:277:18: ( ruleSubrule1 EOF )
            // PsiInternalConcreteTestLanguage.g:278:2: ruleSubrule1 EOF
            {
             markComposite(elementTypeProvider.getSubrule1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubrule1();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubrule1"


    // $ANTLR start "ruleSubrule1"
    // PsiInternalConcreteTestLanguage.g:283:1: ruleSubrule1 : (otherlv_0= 'subrule1' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_ID ) ) ) ;
    public final void ruleSubrule1() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_sub1_2_0=null;

        try {
            // PsiInternalConcreteTestLanguage.g:283:13: ( (otherlv_0= 'subrule1' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_ID ) ) ) )
            // PsiInternalConcreteTestLanguage.g:284:2: (otherlv_0= 'subrule1' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_ID ) ) )
            {
            // PsiInternalConcreteTestLanguage.g:284:2: (otherlv_0= 'subrule1' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_ID ) ) )
            // PsiInternalConcreteTestLanguage.g:285:3: otherlv_0= 'subrule1' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getSubrule1_Subrule1Keyword_0ElementType());
            		
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:292:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalConcreteTestLanguage.g:293:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalConcreteTestLanguage.g:293:4: (lv_name_1_0= RULE_ID )
            // PsiInternalConcreteTestLanguage.g:294:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSubrule1_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalConcreteTestLanguage.g:303:3: ( (lv_sub1_2_0= RULE_ID ) )
            // PsiInternalConcreteTestLanguage.g:304:4: (lv_sub1_2_0= RULE_ID )
            {
            // PsiInternalConcreteTestLanguage.g:304:4: (lv_sub1_2_0= RULE_ID )
            // PsiInternalConcreteTestLanguage.g:305:5: lv_sub1_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSubrule1_Sub1IDTerminalRuleCall_2_0ElementType());
            				
            lv_sub1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_sub1_2_0);
            				

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
        }
        return ;
    }
    // $ANTLR end "ruleSubrule1"


    // $ANTLR start "entryRuleSubrule2"
    // PsiInternalConcreteTestLanguage.g:318:1: entryRuleSubrule2 : ruleSubrule2 EOF ;
    public final void entryRuleSubrule2() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:318:18: ( ruleSubrule2 EOF )
            // PsiInternalConcreteTestLanguage.g:319:2: ruleSubrule2 EOF
            {
             markComposite(elementTypeProvider.getSubrule2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubrule2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubrule2"


    // $ANTLR start "ruleSubrule2"
    // PsiInternalConcreteTestLanguage.g:324:1: ruleSubrule2 : (otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub2_2_0= RULE_STRING ) ) ) ;
    public final void ruleSubrule2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_sub2_2_0=null;

        try {
            // PsiInternalConcreteTestLanguage.g:324:13: ( (otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub2_2_0= RULE_STRING ) ) ) )
            // PsiInternalConcreteTestLanguage.g:325:2: (otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub2_2_0= RULE_STRING ) ) )
            {
            // PsiInternalConcreteTestLanguage.g:325:2: (otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub2_2_0= RULE_STRING ) ) )
            // PsiInternalConcreteTestLanguage.g:326:3: otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub2_2_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getSubrule2_Subrule3Keyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:333:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalConcreteTestLanguage.g:334:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalConcreteTestLanguage.g:334:4: (lv_name_1_0= RULE_ID )
            // PsiInternalConcreteTestLanguage.g:335:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSubrule2_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalConcreteTestLanguage.g:344:3: ( (lv_sub2_2_0= RULE_STRING ) )
            // PsiInternalConcreteTestLanguage.g:345:4: (lv_sub2_2_0= RULE_STRING )
            {
            // PsiInternalConcreteTestLanguage.g:345:4: (lv_sub2_2_0= RULE_STRING )
            // PsiInternalConcreteTestLanguage.g:346:5: lv_sub2_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getSubrule2_Sub2STRINGTerminalRuleCall_2_0ElementType());
            				
            lv_sub2_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_sub2_2_0);
            				

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
        }
        return ;
    }
    // $ANTLR end "ruleSubrule2"


    // $ANTLR start "entryRuleSubrule3"
    // PsiInternalConcreteTestLanguage.g:359:1: entryRuleSubrule3 : ruleSubrule3 EOF ;
    public final void entryRuleSubrule3() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:359:18: ( ruleSubrule3 EOF )
            // PsiInternalConcreteTestLanguage.g:360:2: ruleSubrule3 EOF
            {
             markComposite(elementTypeProvider.getSubrule3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubrule3();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubrule3"


    // $ANTLR start "ruleSubrule3"
    // PsiInternalConcreteTestLanguage.g:365:1: ruleSubrule3 : (otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_INT ) ) ) ;
    public final void ruleSubrule3() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_sub1_2_0=null;

        try {
            // PsiInternalConcreteTestLanguage.g:365:13: ( (otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_INT ) ) ) )
            // PsiInternalConcreteTestLanguage.g:366:2: (otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_INT ) ) )
            {
            // PsiInternalConcreteTestLanguage.g:366:2: (otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_INT ) ) )
            // PsiInternalConcreteTestLanguage.g:367:3: otherlv_0= 'subrule3' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sub1_2_0= RULE_INT ) )
            {

            			markLeaf(elementTypeProvider.getSubrule3_Subrule3Keyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:374:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalConcreteTestLanguage.g:375:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalConcreteTestLanguage.g:375:4: (lv_name_1_0= RULE_ID )
            // PsiInternalConcreteTestLanguage.g:376:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSubrule3_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalConcreteTestLanguage.g:385:3: ( (lv_sub1_2_0= RULE_INT ) )
            // PsiInternalConcreteTestLanguage.g:386:4: (lv_sub1_2_0= RULE_INT )
            {
            // PsiInternalConcreteTestLanguage.g:386:4: (lv_sub1_2_0= RULE_INT )
            // PsiInternalConcreteTestLanguage.g:387:5: lv_sub1_2_0= RULE_INT
            {

            					markLeaf(elementTypeProvider.getSubrule3_Sub1INTTerminalRuleCall_2_0ElementType());
            				
            lv_sub1_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_sub1_2_0);
            				

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
        }
        return ;
    }
    // $ANTLR end "ruleSubrule3"


    // $ANTLR start "entryRuleCallExtendedParserRule"
    // PsiInternalConcreteTestLanguage.g:400:1: entryRuleCallExtendedParserRule : ruleCallExtendedParserRule EOF ;
    public final void entryRuleCallExtendedParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:400:32: ( ruleCallExtendedParserRule EOF )
            // PsiInternalConcreteTestLanguage.g:401:2: ruleCallExtendedParserRule EOF
            {
             markComposite(elementTypeProvider.getCallExtendedParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCallExtendedParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCallExtendedParserRule"


    // $ANTLR start "ruleCallExtendedParserRule"
    // PsiInternalConcreteTestLanguage.g:406:1: ruleCallExtendedParserRule : ( (lv_call_0_0= ruleAbstractCallExtendedParserRule ) ) ;
    public final void ruleCallExtendedParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:406:27: ( ( (lv_call_0_0= ruleAbstractCallExtendedParserRule ) ) )
            // PsiInternalConcreteTestLanguage.g:407:2: ( (lv_call_0_0= ruleAbstractCallExtendedParserRule ) )
            {
            // PsiInternalConcreteTestLanguage.g:407:2: ( (lv_call_0_0= ruleAbstractCallExtendedParserRule ) )
            // PsiInternalConcreteTestLanguage.g:408:3: (lv_call_0_0= ruleAbstractCallExtendedParserRule )
            {
            // PsiInternalConcreteTestLanguage.g:408:3: (lv_call_0_0= ruleAbstractCallExtendedParserRule )
            // PsiInternalConcreteTestLanguage.g:409:4: lv_call_0_0= ruleAbstractCallExtendedParserRule
            {

            				markComposite(elementTypeProvider.getCallExtendedParserRule_CallAbstractCallExtendedParserRuleParserRuleCall_0ElementType());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractCallExtendedParserRule();

            state._fsp--;


            				doneComposite();
            			

            }


            }


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
    // $ANTLR end "ruleCallExtendedParserRule"


    // $ANTLR start "entryRuleInheritedParserRule"
    // PsiInternalConcreteTestLanguage.g:421:1: entryRuleInheritedParserRule : ruleInheritedParserRule EOF ;
    public final void entryRuleInheritedParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:421:29: ( ruleInheritedParserRule EOF )
            // PsiInternalConcreteTestLanguage.g:422:2: ruleInheritedParserRule EOF
            {
             markComposite(elementTypeProvider.getInheritedParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInheritedParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInheritedParserRule"


    // $ANTLR start "ruleInheritedParserRule"
    // PsiInternalConcreteTestLanguage.g:427:1: ruleInheritedParserRule : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final void ruleInheritedParserRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalConcreteTestLanguage.g:427:24: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalConcreteTestLanguage.g:428:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalConcreteTestLanguage.g:428:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalConcreteTestLanguage.g:429:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getInheritedParserRule_ElementKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:436:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalConcreteTestLanguage.g:437:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalConcreteTestLanguage.g:437:4: (lv_name_1_0= RULE_ID )
            // PsiInternalConcreteTestLanguage.g:438:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getInheritedParserRule_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_name_1_0);
            				

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
        }
        return ;
    }
    // $ANTLR end "ruleInheritedParserRule"


    // $ANTLR start "entryRuleAbstractCallOverridenParserRule"
    // PsiInternalConcreteTestLanguage.g:451:1: entryRuleAbstractCallOverridenParserRule : ruleAbstractCallOverridenParserRule EOF ;
    public final void entryRuleAbstractCallOverridenParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:451:41: ( ruleAbstractCallOverridenParserRule EOF )
            // PsiInternalConcreteTestLanguage.g:452:2: ruleAbstractCallOverridenParserRule EOF
            {
             markComposite(elementTypeProvider.getAbstractCallOverridenParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractCallOverridenParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractCallOverridenParserRule"


    // $ANTLR start "ruleAbstractCallOverridenParserRule"
    // PsiInternalConcreteTestLanguage.g:457:1: ruleAbstractCallOverridenParserRule : (otherlv_0= 'overridemodel' ( (lv_elements_1_0= ruleOverridableParserRule ) )* ) ;
    public final void ruleAbstractCallOverridenParserRule() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalConcreteTestLanguage.g:457:36: ( (otherlv_0= 'overridemodel' ( (lv_elements_1_0= ruleOverridableParserRule ) )* ) )
            // PsiInternalConcreteTestLanguage.g:458:2: (otherlv_0= 'overridemodel' ( (lv_elements_1_0= ruleOverridableParserRule ) )* )
            {
            // PsiInternalConcreteTestLanguage.g:458:2: (otherlv_0= 'overridemodel' ( (lv_elements_1_0= ruleOverridableParserRule ) )* )
            // PsiInternalConcreteTestLanguage.g:459:3: otherlv_0= 'overridemodel' ( (lv_elements_1_0= ruleOverridableParserRule ) )*
            {

            			markLeaf(elementTypeProvider.getAbstractCallOverridenParserRule_OverridemodelKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:466:3: ( (lv_elements_1_0= ruleOverridableParserRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PsiInternalConcreteTestLanguage.g:467:4: (lv_elements_1_0= ruleOverridableParserRule )
            	    {
            	    // PsiInternalConcreteTestLanguage.g:467:4: (lv_elements_1_0= ruleOverridableParserRule )
            	    // PsiInternalConcreteTestLanguage.g:468:5: lv_elements_1_0= ruleOverridableParserRule
            	    {

            	    					markComposite(elementTypeProvider.getAbstractCallOverridenParserRule_ElementsOverridableParserRuleParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    ruleOverridableParserRule();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleAbstractCallOverridenParserRule"


    // $ANTLR start "entryRuleAbstractCallExtendedParserRule"
    // PsiInternalConcreteTestLanguage.g:481:1: entryRuleAbstractCallExtendedParserRule : ruleAbstractCallExtendedParserRule EOF ;
    public final void entryRuleAbstractCallExtendedParserRule() throws RecognitionException {
        try {
            // PsiInternalConcreteTestLanguage.g:481:40: ( ruleAbstractCallExtendedParserRule EOF )
            // PsiInternalConcreteTestLanguage.g:482:2: ruleAbstractCallExtendedParserRule EOF
            {
             markComposite(elementTypeProvider.getAbstractCallExtendedParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractCallExtendedParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractCallExtendedParserRule"


    // $ANTLR start "ruleAbstractCallExtendedParserRule"
    // PsiInternalConcreteTestLanguage.g:487:1: ruleAbstractCallExtendedParserRule : (otherlv_0= 'extendedmodel' ( (lv_elements_1_0= ruleExtendableParserRule ) )* ) ;
    public final void ruleAbstractCallExtendedParserRule() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalConcreteTestLanguage.g:487:35: ( (otherlv_0= 'extendedmodel' ( (lv_elements_1_0= ruleExtendableParserRule ) )* ) )
            // PsiInternalConcreteTestLanguage.g:488:2: (otherlv_0= 'extendedmodel' ( (lv_elements_1_0= ruleExtendableParserRule ) )* )
            {
            // PsiInternalConcreteTestLanguage.g:488:2: (otherlv_0= 'extendedmodel' ( (lv_elements_1_0= ruleExtendableParserRule ) )* )
            // PsiInternalConcreteTestLanguage.g:489:3: otherlv_0= 'extendedmodel' ( (lv_elements_1_0= ruleExtendableParserRule ) )*
            {

            			markLeaf(elementTypeProvider.getAbstractCallExtendedParserRule_ExtendedmodelKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_11); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalConcreteTestLanguage.g:496:3: ( (lv_elements_1_0= ruleExtendableParserRule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=18)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PsiInternalConcreteTestLanguage.g:497:4: (lv_elements_1_0= ruleExtendableParserRule )
            	    {
            	    // PsiInternalConcreteTestLanguage.g:497:4: (lv_elements_1_0= ruleExtendableParserRule )
            	    // PsiInternalConcreteTestLanguage.g:498:5: lv_elements_1_0= ruleExtendableParserRule
            	    {

            	    					markComposite(elementTypeProvider.getAbstractCallExtendedParserRule_ElementsExtendableParserRuleParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    ruleExtendableParserRule();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleAbstractCallExtendedParserRule"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060002L});
    }


}