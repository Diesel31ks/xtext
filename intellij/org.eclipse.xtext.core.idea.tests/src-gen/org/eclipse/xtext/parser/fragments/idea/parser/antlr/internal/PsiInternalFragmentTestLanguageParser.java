package org.eclipse.xtext.parser.fragments.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parser.fragments.idea.lang.FragmentTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalFragmentTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#1'", "'#2'", "'->'", "'#3'", "'#4'", "'#5'", "'#6'", "'#7'", "'#8'", "':'", "'-'", "'<-'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public PsiInternalFragmentTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalFragmentTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalFragmentTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalFragmentTestLanguage.g"; }



    	protected FragmentTestLanguageGrammarAccess grammarAccess;

    	protected FragmentTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalFragmentTestLanguageParser(PsiBuilder builder, TokenStream input, FragmentTestLanguageElementTypeProvider elementTypeProvider, FragmentTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "ParserRuleFragments";
    	}




    // $ANTLR start "entryRuleParserRuleFragments"
    // PsiInternalFragmentTestLanguage.g:52:1: entryRuleParserRuleFragments : ruleParserRuleFragments EOF ;
    public final void entryRuleParserRuleFragments() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:52:29: ( ruleParserRuleFragments EOF )
            // PsiInternalFragmentTestLanguage.g:53:2: ruleParserRuleFragments EOF
            {
             markComposite(elementTypeProvider.getParserRuleFragmentsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParserRuleFragments();

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
    // $ANTLR end "entryRuleParserRuleFragments"


    // $ANTLR start "ruleParserRuleFragments"
    // PsiInternalFragmentTestLanguage.g:58:1: ruleParserRuleFragments : ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) | (otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) ) ) ) ) ;
    public final void ruleParserRuleFragments() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;

        try {
            // PsiInternalFragmentTestLanguage.g:58:24: ( ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) | (otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) ) ) ) ) )
            // PsiInternalFragmentTestLanguage.g:59:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) | (otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) ) ) ) )
            {
            // PsiInternalFragmentTestLanguage.g:59:2: ( () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) | (otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) ) ) ) )
            // PsiInternalFragmentTestLanguage.g:60:3: () ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) | (otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) ) ) )
            {
            // PsiInternalFragmentTestLanguage.g:60:3: ()
            // PsiInternalFragmentTestLanguage.g:61:4: 
            {

            				precedeComposite(elementTypeProvider.getParserRuleFragments_ParserRuleFragmentsAction_0ElementType());
            				doneComposite();
            			

            }

            // PsiInternalFragmentTestLanguage.g:66:3: ( (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) ) | (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) ) | (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) ) | (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) ) | (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) ) | (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) ) | (otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) ) ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            case 18:
                {
                alt1=7;
                }
                break;
            case 19:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:67:4: (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:67:4: (otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) ) )
                    // PsiInternalFragmentTestLanguage.g:68:5: otherlv_1= '#1' ( (lv_element_2_0= rulePRFNamed ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitOneKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_1);
                    				
                    // PsiInternalFragmentTestLanguage.g:75:5: ( (lv_element_2_0= rulePRFNamed ) )
                    // PsiInternalFragmentTestLanguage.g:76:6: (lv_element_2_0= rulePRFNamed )
                    {
                    // PsiInternalFragmentTestLanguage.g:76:6: (lv_element_2_0= rulePRFNamed )
                    // PsiInternalFragmentTestLanguage.g:77:7: lv_element_2_0= rulePRFNamed
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedParserRuleCall_1_0_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePRFNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalFragmentTestLanguage.g:88:4: (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:88:4: (otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )
                    // PsiInternalFragmentTestLanguage.g:89:5: otherlv_3= '#2' ( (lv_element_4_0= rulePRFNamed ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitTwoKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_3);
                    				
                    // PsiInternalFragmentTestLanguage.g:96:5: ( (lv_element_4_0= rulePRFNamed ) )
                    // PsiInternalFragmentTestLanguage.g:97:6: (lv_element_4_0= rulePRFNamed )
                    {
                    // PsiInternalFragmentTestLanguage.g:97:6: (lv_element_4_0= rulePRFNamed )
                    // PsiInternalFragmentTestLanguage.g:98:7: lv_element_4_0= rulePRFNamed
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedParserRuleCall_1_1_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_4);
                    rulePRFNamed();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getParserRuleFragments_HyphenMinusGreaterThanSignKeyword_1_1_2ElementType());
                    				
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_5);
                    				
                    // PsiInternalFragmentTestLanguage.g:114:5: ( (otherlv_6= RULE_ID ) )
                    // PsiInternalFragmentTestLanguage.g:115:6: (otherlv_6= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:115:6: (otherlv_6= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:116:7: otherlv_6= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getParserRuleFragments_RefPRFNamedCrossReference_1_1_3_0ElementType());
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(otherlv_6);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalFragmentTestLanguage.g:127:4: (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:127:4: (otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) ) )
                    // PsiInternalFragmentTestLanguage.g:128:5: otherlv_7= '#3' ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitThreeKeyword_1_2_0ElementType());
                    				
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_7);
                    				
                    // PsiInternalFragmentTestLanguage.g:135:5: ( (lv_element_8_0= rulePRFNamedRefFirst ) )
                    // PsiInternalFragmentTestLanguage.g:136:6: (lv_element_8_0= rulePRFNamedRefFirst )
                    {
                    // PsiInternalFragmentTestLanguage.g:136:6: (lv_element_8_0= rulePRFNamedRefFirst )
                    // PsiInternalFragmentTestLanguage.g:137:7: lv_element_8_0= rulePRFNamedRefFirst
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedRefFirstParserRuleCall_1_2_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePRFNamedRefFirst();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // PsiInternalFragmentTestLanguage.g:148:4: (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:148:4: (otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) ) )
                    // PsiInternalFragmentTestLanguage.g:149:5: otherlv_9= '#4' ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitFourKeyword_1_3_0ElementType());
                    				
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_9);
                    				
                    // PsiInternalFragmentTestLanguage.g:156:5: ( (lv_element_10_0= rulePRFNamedWithAction ) )
                    // PsiInternalFragmentTestLanguage.g:157:6: (lv_element_10_0= rulePRFNamedWithAction )
                    {
                    // PsiInternalFragmentTestLanguage.g:157:6: (lv_element_10_0= rulePRFNamedWithAction )
                    // PsiInternalFragmentTestLanguage.g:158:7: lv_element_10_0= rulePRFNamedWithAction
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionParserRuleCall_1_3_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePRFNamedWithAction();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // PsiInternalFragmentTestLanguage.g:169:4: (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:169:4: (otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) ) )
                    // PsiInternalFragmentTestLanguage.g:170:5: otherlv_11= '#5' ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitFiveKeyword_1_4_0ElementType());
                    				
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_11);
                    				
                    // PsiInternalFragmentTestLanguage.g:177:5: ( (lv_element_12_0= rulePRFNamedWithActionInFragment ) )
                    // PsiInternalFragmentTestLanguage.g:178:6: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    {
                    // PsiInternalFragmentTestLanguage.g:178:6: (lv_element_12_0= rulePRFNamedWithActionInFragment )
                    // PsiInternalFragmentTestLanguage.g:179:7: lv_element_12_0= rulePRFNamedWithActionInFragment
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragmentParserRuleCall_1_4_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePRFNamedWithActionInFragment();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // PsiInternalFragmentTestLanguage.g:190:4: (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:190:4: (otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) ) )
                    // PsiInternalFragmentTestLanguage.g:191:5: otherlv_13= '#6' ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitSixKeyword_1_5_0ElementType());
                    				
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_13);
                    				
                    // PsiInternalFragmentTestLanguage.g:198:5: ( (lv_element_14_0= rulePRFNamedWithActionInFragment2 ) )
                    // PsiInternalFragmentTestLanguage.g:199:6: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    {
                    // PsiInternalFragmentTestLanguage.g:199:6: (lv_element_14_0= rulePRFNamedWithActionInFragment2 )
                    // PsiInternalFragmentTestLanguage.g:200:7: lv_element_14_0= rulePRFNamedWithActionInFragment2
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePRFNamedWithActionInFragment2();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // PsiInternalFragmentTestLanguage.g:211:4: (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:211:4: (otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) ) )
                    // PsiInternalFragmentTestLanguage.g:212:5: otherlv_15= '#7' ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitSevenKeyword_1_6_0ElementType());
                    				
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_15);
                    				
                    // PsiInternalFragmentTestLanguage.g:219:5: ( (lv_element_16_0= rulePRFNamedWithActionInFragment3 ) )
                    // PsiInternalFragmentTestLanguage.g:220:6: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    {
                    // PsiInternalFragmentTestLanguage.g:220:6: (lv_element_16_0= rulePRFNamedWithActionInFragment3 )
                    // PsiInternalFragmentTestLanguage.g:221:7: lv_element_16_0= rulePRFNamedWithActionInFragment3
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithActionInFragment3ParserRuleCall_1_6_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePRFNamedWithActionInFragment3();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // PsiInternalFragmentTestLanguage.g:232:4: (otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:232:4: (otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) ) )
                    // PsiInternalFragmentTestLanguage.g:233:5: otherlv_17= '#8' ( (lv_element_18_0= rulePRFNamedWithFQN ) )
                    {

                    					markLeaf(elementTypeProvider.getParserRuleFragments_NumberSignDigitEightKeyword_1_7_0ElementType());
                    				
                    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_17);
                    				
                    // PsiInternalFragmentTestLanguage.g:240:5: ( (lv_element_18_0= rulePRFNamedWithFQN ) )
                    // PsiInternalFragmentTestLanguage.g:241:6: (lv_element_18_0= rulePRFNamedWithFQN )
                    {
                    // PsiInternalFragmentTestLanguage.g:241:6: (lv_element_18_0= rulePRFNamedWithFQN )
                    // PsiInternalFragmentTestLanguage.g:242:7: lv_element_18_0= rulePRFNamedWithFQN
                    {

                    							markComposite(elementTypeProvider.getParserRuleFragments_ElementPRFNamedWithFQNParserRuleCall_1_7_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePRFNamedWithFQN();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleParserRuleFragments"


    // $ANTLR start "entryRulePRFNamed"
    // PsiInternalFragmentTestLanguage.g:257:1: entryRulePRFNamed : rulePRFNamed EOF ;
    public final void entryRulePRFNamed() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:257:18: ( rulePRFNamed EOF )
            // PsiInternalFragmentTestLanguage.g:258:2: rulePRFNamed EOF
            {
             markComposite(elementTypeProvider.getPRFNamedElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePRFNamed();

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
    // $ANTLR end "entryRulePRFNamed"


    // $ANTLR start "rulePRFNamed"
    // PsiInternalFragmentTestLanguage.g:263:1: rulePRFNamed : ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? ) ;
    public final void rulePRFNamed() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // PsiInternalFragmentTestLanguage.g:263:13: ( ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? ) )
            // PsiInternalFragmentTestLanguage.g:264:2: ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? )
            {
            // PsiInternalFragmentTestLanguage.g:264:2: ( rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )? )
            // PsiInternalFragmentTestLanguage.g:265:3: rulePRFNamedFragment ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamed_PRFNamedFragmentParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_5);
            rulePRFNamedFragment();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalFragmentTestLanguage.g:272:3: ( (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= '-' rulePRFNamedRef ) )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:273:4: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:273:4: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
                    // PsiInternalFragmentTestLanguage.g:274:5: otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getPRFNamed_ColonKeyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_1);
                    				
                    // PsiInternalFragmentTestLanguage.g:281:5: ( (otherlv_2= RULE_ID ) )
                    // PsiInternalFragmentTestLanguage.g:282:6: (otherlv_2= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:282:6: (otherlv_2= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:283:7: otherlv_2= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getPRFNamed_RefPRFNamedCrossReference_1_0_1_0ElementType());
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(otherlv_2);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalFragmentTestLanguage.g:294:4: (otherlv_3= '-' rulePRFNamedRef )
                    {
                    // PsiInternalFragmentTestLanguage.g:294:4: (otherlv_3= '-' rulePRFNamedRef )
                    // PsiInternalFragmentTestLanguage.g:295:5: otherlv_3= '-' rulePRFNamedRef
                    {

                    					markLeaf(elementTypeProvider.getPRFNamed_HyphenMinusKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_3);
                    				

                    					markComposite(elementTypeProvider.getPRFNamed_PRFNamedRefParserRuleCall_1_1_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePRFNamedRef();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulePRFNamed"


    // $ANTLR start "entryRulePRFNamedRefFirst"
    // PsiInternalFragmentTestLanguage.g:315:1: entryRulePRFNamedRefFirst : rulePRFNamedRefFirst EOF ;
    public final void entryRulePRFNamedRefFirst() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:315:26: ( rulePRFNamedRefFirst EOF )
            // PsiInternalFragmentTestLanguage.g:316:2: rulePRFNamedRefFirst EOF
            {
             markComposite(elementTypeProvider.getPRFNamedRefFirstElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePRFNamedRefFirst();

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
    // $ANTLR end "entryRulePRFNamedRefFirst"


    // $ANTLR start "rulePRFNamedRefFirst"
    // PsiInternalFragmentTestLanguage.g:321:1: rulePRFNamedRefFirst : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment ) ;
    public final void rulePRFNamedRefFirst() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // PsiInternalFragmentTestLanguage.g:321:21: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment ) )
            // PsiInternalFragmentTestLanguage.g:322:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment )
            {
            // PsiInternalFragmentTestLanguage.g:322:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment )
            // PsiInternalFragmentTestLanguage.g:323:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<-' rulePRFNamedFragment
            {
            // PsiInternalFragmentTestLanguage.g:323:3: ( (otherlv_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:324:4: (otherlv_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:324:4: (otherlv_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:325:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedRefFirst_RefPRFNamedCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					doneLeaf(otherlv_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getPRFNamedRefFirst_LessThanSignHyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_1);
            		

            			markComposite(elementTypeProvider.getPRFNamedRefFirst_PRFNamedFragmentParserRuleCall_2ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_2);
            rulePRFNamedFragment();

            state._fsp--;


            			doneComposite();
            		

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
    // $ANTLR end "rulePRFNamedRefFirst"


    // $ANTLR start "entryRulePRFNamedWithAction"
    // PsiInternalFragmentTestLanguage.g:352:1: entryRulePRFNamedWithAction : rulePRFNamedWithAction EOF ;
    public final void entryRulePRFNamedWithAction() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:352:28: ( rulePRFNamedWithAction EOF )
            // PsiInternalFragmentTestLanguage.g:353:2: rulePRFNamedWithAction EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePRFNamedWithAction();

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
    // $ANTLR end "entryRulePRFNamedWithAction"


    // $ANTLR start "rulePRFNamedWithAction"
    // PsiInternalFragmentTestLanguage.g:358:1: rulePRFNamedWithAction : ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithAction() throws RecognitionException {
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalFragmentTestLanguage.g:358:23: ( ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // PsiInternalFragmentTestLanguage.g:359:2: ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // PsiInternalFragmentTestLanguage.g:359:2: ( rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // PsiInternalFragmentTestLanguage.g:360:3: rulePRFNamed () ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithAction_PRFNamedParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_3);
            rulePRFNamed();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalFragmentTestLanguage.g:367:3: ()
            // PsiInternalFragmentTestLanguage.g:368:4: 
            {

            				precedeComposite(elementTypeProvider.getPRFNamedWithAction_PRFNamedWithActionPrevAction_1ElementType());
            				doneComposite();
            			

            }

            // PsiInternalFragmentTestLanguage.g:373:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:374:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:374:4: (lv_name_2_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:375:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedWithAction_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalFragmentTestLanguage.g:384:3: ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:385:4: ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // PsiInternalFragmentTestLanguage.g:385:4: ( (otherlv_3= RULE_ID ) )
                    // PsiInternalFragmentTestLanguage.g:386:5: (otherlv_3= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:386:5: (otherlv_3= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:387:6: otherlv_3= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithAction_RefPRFNamedCrossReference_3_0_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

                    						doneLeaf(otherlv_3);
                    					

                    }


                    }

                    // PsiInternalFragmentTestLanguage.g:396:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalFragmentTestLanguage.g:397:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:397:5: (otherlv_4= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:398:6: otherlv_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithAction_Ref2PRFNamedCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePRFNamedWithAction"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment"
    // PsiInternalFragmentTestLanguage.g:412:1: entryRulePRFNamedWithActionInFragment : rulePRFNamedWithActionInFragment EOF ;
    public final void entryRulePRFNamedWithActionInFragment() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:412:38: ( rulePRFNamedWithActionInFragment EOF )
            // PsiInternalFragmentTestLanguage.g:413:2: rulePRFNamedWithActionInFragment EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePRFNamedWithActionInFragment();

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
    // $ANTLR end "entryRulePRFNamedWithActionInFragment"


    // $ANTLR start "rulePRFNamedWithActionInFragment"
    // PsiInternalFragmentTestLanguage.g:418:1: rulePRFNamedWithActionInFragment : ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // PsiInternalFragmentTestLanguage.g:418:33: ( ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // PsiInternalFragmentTestLanguage.g:419:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // PsiInternalFragmentTestLanguage.g:419:2: ( ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // PsiInternalFragmentTestLanguage.g:420:3: ruleFragmentWithAction (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_8);
            ruleFragmentWithAction();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalFragmentTestLanguage.g:427:3: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:428:4: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_1);
                    			
                    // PsiInternalFragmentTestLanguage.g:435:4: ( (otherlv_2= RULE_ID ) )
                    // PsiInternalFragmentTestLanguage.g:436:5: (otherlv_2= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:436:5: (otherlv_2= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:437:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment_RefPRFNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(otherlv_2);
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePRFNamedWithActionInFragment"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment2"
    // PsiInternalFragmentTestLanguage.g:451:1: entryRulePRFNamedWithActionInFragment2 : rulePRFNamedWithActionInFragment2 EOF ;
    public final void entryRulePRFNamedWithActionInFragment2() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:451:39: ( rulePRFNamedWithActionInFragment2 EOF )
            // PsiInternalFragmentTestLanguage.g:452:2: rulePRFNamedWithActionInFragment2 EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragment2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePRFNamedWithActionInFragment2();

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
    // $ANTLR end "entryRulePRFNamedWithActionInFragment2"


    // $ANTLR start "rulePRFNamedWithActionInFragment2"
    // PsiInternalFragmentTestLanguage.g:457:1: rulePRFNamedWithActionInFragment2 : ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment2() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // PsiInternalFragmentTestLanguage.g:457:34: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? ) )
            // PsiInternalFragmentTestLanguage.g:458:2: ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // PsiInternalFragmentTestLanguage.g:458:2: ( ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )? )
            // PsiInternalFragmentTestLanguage.g:459:3: ( (lv_name_0_0= RULE_ID ) ) ruleFragmentWithAction2 (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )?
            {
            // PsiInternalFragmentTestLanguage.g:459:3: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:460:4: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:460:4: (lv_name_0_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:461:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }


            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_8);
            ruleFragmentWithAction2();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalFragmentTestLanguage.g:477:3: (otherlv_2= '-' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:478:4: otherlv_2= '-' ( (otherlv_3= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_HyphenMinusKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalFragmentTestLanguage.g:485:4: ( (otherlv_3= RULE_ID ) )
                    // PsiInternalFragmentTestLanguage.g:486:5: (otherlv_3= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:486:5: (otherlv_3= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:487:6: otherlv_3= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment2_RefPRFNamedCrossReference_2_1_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(otherlv_3);
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePRFNamedWithActionInFragment2"


    // $ANTLR start "entryRulePRFNamedWithActionInFragment3"
    // PsiInternalFragmentTestLanguage.g:501:1: entryRulePRFNamedWithActionInFragment3 : rulePRFNamedWithActionInFragment3 EOF ;
    public final void entryRulePRFNamedWithActionInFragment3() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:501:39: ( rulePRFNamedWithActionInFragment3 EOF )
            // PsiInternalFragmentTestLanguage.g:502:2: rulePRFNamedWithActionInFragment3 EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithActionInFragment3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePRFNamedWithActionInFragment3();

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
    // $ANTLR end "entryRulePRFNamedWithActionInFragment3"


    // $ANTLR start "rulePRFNamedWithActionInFragment3"
    // PsiInternalFragmentTestLanguage.g:507:1: rulePRFNamedWithActionInFragment3 : ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final void rulePRFNamedWithActionInFragment3() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // PsiInternalFragmentTestLanguage.g:507:34: ( ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? ) )
            // PsiInternalFragmentTestLanguage.g:508:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // PsiInternalFragmentTestLanguage.g:508:2: ( ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )? )
            // PsiInternalFragmentTestLanguage.g:509:3: ruleFragmentWithAction3 (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            {

            			markComposite(elementTypeProvider.getPRFNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_8);
            ruleFragmentWithAction3();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalFragmentTestLanguage.g:516:3: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:517:4: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment3_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_1);
                    			
                    // PsiInternalFragmentTestLanguage.g:524:4: ( (otherlv_2= RULE_ID ) )
                    // PsiInternalFragmentTestLanguage.g:525:5: (otherlv_2= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:525:5: (otherlv_2= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:526:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getPRFNamedWithActionInFragment3_RefPRFNamedCrossReference_1_1_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(otherlv_2);
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePRFNamedWithActionInFragment3"


    // $ANTLR start "entryRulePRFNamedWithFQN"
    // PsiInternalFragmentTestLanguage.g:540:1: entryRulePRFNamedWithFQN : rulePRFNamedWithFQN EOF ;
    public final void entryRulePRFNamedWithFQN() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:540:25: ( rulePRFNamedWithFQN EOF )
            // PsiInternalFragmentTestLanguage.g:541:2: rulePRFNamedWithFQN EOF
            {
             markComposite(elementTypeProvider.getPRFNamedWithFQNElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePRFNamedWithFQN();

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
    // $ANTLR end "entryRulePRFNamedWithFQN"


    // $ANTLR start "rulePRFNamedWithFQN"
    // PsiInternalFragmentTestLanguage.g:546:1: rulePRFNamedWithFQN : ( ( (lv_name_0_0= ruleFQN ) ) (otherlv_1= '-' ( ( ruleFQN2 ) ) )? ) ;
    public final void rulePRFNamedWithFQN() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // PsiInternalFragmentTestLanguage.g:546:20: ( ( ( (lv_name_0_0= ruleFQN ) ) (otherlv_1= '-' ( ( ruleFQN2 ) ) )? ) )
            // PsiInternalFragmentTestLanguage.g:547:2: ( ( (lv_name_0_0= ruleFQN ) ) (otherlv_1= '-' ( ( ruleFQN2 ) ) )? )
            {
            // PsiInternalFragmentTestLanguage.g:547:2: ( ( (lv_name_0_0= ruleFQN ) ) (otherlv_1= '-' ( ( ruleFQN2 ) ) )? )
            // PsiInternalFragmentTestLanguage.g:548:3: ( (lv_name_0_0= ruleFQN ) ) (otherlv_1= '-' ( ( ruleFQN2 ) ) )?
            {
            // PsiInternalFragmentTestLanguage.g:548:3: ( (lv_name_0_0= ruleFQN ) )
            // PsiInternalFragmentTestLanguage.g:549:4: (lv_name_0_0= ruleFQN )
            {
            // PsiInternalFragmentTestLanguage.g:549:4: (lv_name_0_0= ruleFQN )
            // PsiInternalFragmentTestLanguage.g:550:5: lv_name_0_0= ruleFQN
            {

            					markComposite(elementTypeProvider.getPRFNamedWithFQN_NameFQNParserRuleCall_0_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalFragmentTestLanguage.g:559:3: (otherlv_1= '-' ( ( ruleFQN2 ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:560:4: otherlv_1= '-' ( ( ruleFQN2 ) )
                    {

                    				markLeaf(elementTypeProvider.getPRFNamedWithFQN_HyphenMinusKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_1);
                    			
                    // PsiInternalFragmentTestLanguage.g:567:4: ( ( ruleFQN2 ) )
                    // PsiInternalFragmentTestLanguage.g:568:5: ( ruleFQN2 )
                    {
                    // PsiInternalFragmentTestLanguage.g:568:5: ( ruleFQN2 )
                    // PsiInternalFragmentTestLanguage.g:569:6: ruleFQN2
                    {

                    						markComposite(elementTypeProvider.getPRFNamedWithFQN_RefPRFNamedCrossReference_1_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFQN2();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePRFNamedWithFQN"


    // $ANTLR start "entryRuleFQN"
    // PsiInternalFragmentTestLanguage.g:583:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:583:13: ( ruleFQN EOF )
            // PsiInternalFragmentTestLanguage.g:584:2: ruleFQN EOF
            {
             markComposite(elementTypeProvider.getFQNElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFQN();

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // PsiInternalFragmentTestLanguage.g:589:1: ruleFQN : (this_ID_0= RULE_ID ( ruleSuffix )? ) ;
    public final void ruleFQN() throws RecognitionException {
        Token this_ID_0=null;

        try {
            // PsiInternalFragmentTestLanguage.g:589:8: ( (this_ID_0= RULE_ID ( ruleSuffix )? ) )
            // PsiInternalFragmentTestLanguage.g:590:2: (this_ID_0= RULE_ID ( ruleSuffix )? )
            {
            // PsiInternalFragmentTestLanguage.g:590:2: (this_ID_0= RULE_ID ( ruleSuffix )? )
            // PsiInternalFragmentTestLanguage.g:591:3: this_ID_0= RULE_ID ( ruleSuffix )?
            {

            			markLeaf(elementTypeProvider.getFQN_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalFragmentTestLanguage.g:598:3: ( ruleSuffix )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:599:4: ruleSuffix
                    {

                    				markComposite(elementTypeProvider.getFQN_SuffixParserRuleCall_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSuffix();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFQN2"
    // PsiInternalFragmentTestLanguage.g:611:1: entryRuleFQN2 : ruleFQN2 EOF ;
    public final void entryRuleFQN2() throws RecognitionException {
        try {
            // PsiInternalFragmentTestLanguage.g:611:14: ( ruleFQN2 EOF )
            // PsiInternalFragmentTestLanguage.g:612:2: ruleFQN2 EOF
            {
             markComposite(elementTypeProvider.getFQN2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFQN2();

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
    // $ANTLR end "entryRuleFQN2"


    // $ANTLR start "ruleFQN2"
    // PsiInternalFragmentTestLanguage.g:617:1: ruleFQN2 : (this_ID_0= RULE_ID ( ruleSuffix2 )* ) ;
    public final void ruleFQN2() throws RecognitionException {
        Token this_ID_0=null;

        try {
            // PsiInternalFragmentTestLanguage.g:617:9: ( (this_ID_0= RULE_ID ( ruleSuffix2 )* ) )
            // PsiInternalFragmentTestLanguage.g:618:2: (this_ID_0= RULE_ID ( ruleSuffix2 )* )
            {
            // PsiInternalFragmentTestLanguage.g:618:2: (this_ID_0= RULE_ID ( ruleSuffix2 )* )
            // PsiInternalFragmentTestLanguage.g:619:3: this_ID_0= RULE_ID ( ruleSuffix2 )*
            {

            			markLeaf(elementTypeProvider.getFQN2_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalFragmentTestLanguage.g:626:3: ( ruleSuffix2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PsiInternalFragmentTestLanguage.g:627:4: ruleSuffix2
            	    {

            	    				markComposite(elementTypeProvider.getFQN2_Suffix2ParserRuleCall_1ElementType());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    ruleSuffix2();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleFQN2"


    // $ANTLR start "ruleSuffix"
    // PsiInternalFragmentTestLanguage.g:640:1: ruleSuffix : (kw= '.' this_ID_1= RULE_ID ( ruleSuffix )? ) ;
    public final void ruleSuffix() throws RecognitionException {
        Token kw=null;
        Token this_ID_1=null;

        try {
            // PsiInternalFragmentTestLanguage.g:640:11: ( (kw= '.' this_ID_1= RULE_ID ( ruleSuffix )? ) )
            // PsiInternalFragmentTestLanguage.g:641:2: (kw= '.' this_ID_1= RULE_ID ( ruleSuffix )? )
            {
            // PsiInternalFragmentTestLanguage.g:641:2: (kw= '.' this_ID_1= RULE_ID ( ruleSuffix )? )
            // PsiInternalFragmentTestLanguage.g:642:3: kw= '.' this_ID_1= RULE_ID ( ruleSuffix )?
            {

            			markLeaf(elementTypeProvider.getSuffix_FullStopKeyword_0ElementType());
            		
            kw=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getSuffix_IDTerminalRuleCall_1ElementType());
            		
            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            			doneLeaf(this_ID_1);
            		
            // PsiInternalFragmentTestLanguage.g:656:3: ( ruleSuffix )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:657:4: ruleSuffix
                    {

                    				markComposite(elementTypeProvider.getSuffix_SuffixParserRuleCall_2ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSuffix();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleSuffix"


    // $ANTLR start "ruleSuffix2"
    // PsiInternalFragmentTestLanguage.g:670:1: ruleSuffix2 : (kw= '.' this_ID_1= RULE_ID ) ;
    public final void ruleSuffix2() throws RecognitionException {
        Token kw=null;
        Token this_ID_1=null;

        try {
            // PsiInternalFragmentTestLanguage.g:670:12: ( (kw= '.' this_ID_1= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:671:2: (kw= '.' this_ID_1= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:671:2: (kw= '.' this_ID_1= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:672:3: kw= '.' this_ID_1= RULE_ID
            {

            			markLeaf(elementTypeProvider.getSuffix2_FullStopKeyword_0ElementType());
            		
            kw=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getSuffix2_IDTerminalRuleCall_1ElementType());
            		
            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			doneLeaf(this_ID_1);
            		

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
    // $ANTLR end "ruleSuffix2"


    // $ANTLR start "ruleFragmentWithAction"
    // PsiInternalFragmentTestLanguage.g:691:1: ruleFragmentWithAction : ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) ;
    public final void ruleFragmentWithAction() throws RecognitionException {
        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

        try {
            // PsiInternalFragmentTestLanguage.g:691:23: ( ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? ) )
            // PsiInternalFragmentTestLanguage.g:692:2: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            {
            // PsiInternalFragmentTestLanguage.g:692:2: ( ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )? )
            // PsiInternalFragmentTestLanguage.g:693:3: ( (lv_name_0_0= RULE_ID ) ) () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )?
            {
            // PsiInternalFragmentTestLanguage.g:693:3: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:694:4: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:694:4: (lv_name_0_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:695:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // PsiInternalFragmentTestLanguage.g:704:3: ()
            // PsiInternalFragmentTestLanguage.g:705:4: 
            {

            				precedeComposite(elementTypeProvider.getFragmentWithAction_PRFNamedWithActionPrevAction_1ElementType());
            				doneComposite();
            			

            }

            // PsiInternalFragmentTestLanguage.g:710:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:711:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:711:4: (lv_name_2_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:712:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalFragmentTestLanguage.g:721:3: ( (otherlv_3= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:722:4: (otherlv_3= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:722:4: (otherlv_3= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:723:5: otherlv_3= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getFragmentWithAction_Ref2PRFNamedCrossReference_3_0ElementType());
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					doneLeaf(otherlv_3);
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFragmentWithAction"


    // $ANTLR start "ruleFragmentWithAction2"
    // PsiInternalFragmentTestLanguage.g:737:1: ruleFragmentWithAction2 : ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) ;
    public final void ruleFragmentWithAction2() throws RecognitionException {
        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalFragmentTestLanguage.g:737:24: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) )
            // PsiInternalFragmentTestLanguage.g:738:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            {
            // PsiInternalFragmentTestLanguage.g:738:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            // PsiInternalFragmentTestLanguage.g:739:3: () ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )?
            {
            // PsiInternalFragmentTestLanguage.g:739:3: ()
            // PsiInternalFragmentTestLanguage.g:740:4: 
            {

            				precedeComposite(elementTypeProvider.getFragmentWithAction2_PRFNamedWithActionPrevAction_0ElementType());
            				doneComposite();
            			

            }

            // PsiInternalFragmentTestLanguage.g:745:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:746:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:746:4: (lv_name_1_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:747:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction2_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalFragmentTestLanguage.g:756:3: ( (otherlv_2= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalFragmentTestLanguage.g:757:4: (otherlv_2= RULE_ID )
                    {
                    // PsiInternalFragmentTestLanguage.g:757:4: (otherlv_2= RULE_ID )
                    // PsiInternalFragmentTestLanguage.g:758:5: otherlv_2= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getFragmentWithAction2_Ref2PRFNamedCrossReference_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					doneLeaf(otherlv_2);
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFragmentWithAction2"


    // $ANTLR start "ruleFragmentWithAction3"
    // PsiInternalFragmentTestLanguage.g:772:1: ruleFragmentWithAction3 : ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) ;
    public final void ruleFragmentWithAction3() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

        try {
            // PsiInternalFragmentTestLanguage.g:772:24: ( ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* ) )
            // PsiInternalFragmentTestLanguage.g:773:2: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            {
            // PsiInternalFragmentTestLanguage.g:773:2: ( ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )* )
            // PsiInternalFragmentTestLanguage.g:774:3: ( (lv_name_0_0= RULE_ID ) ) ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            {
            // PsiInternalFragmentTestLanguage.g:774:3: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:775:4: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:775:4: (lv_name_0_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:776:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // PsiInternalFragmentTestLanguage.g:785:3: ( () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PsiInternalFragmentTestLanguage.g:786:4: () otherlv_2= '->' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )?
            	    {
            	    // PsiInternalFragmentTestLanguage.g:786:4: ()
            	    // PsiInternalFragmentTestLanguage.g:787:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getFragmentWithAction3_PRFNamedWithActionPrevAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }


            	    				markLeaf(elementTypeProvider.getFragmentWithAction3_HyphenMinusGreaterThanSignKeyword_1_1ElementType());
            	    			
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_3); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalFragmentTestLanguage.g:799:4: ( (lv_name_3_0= RULE_ID ) )
            	    // PsiInternalFragmentTestLanguage.g:800:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // PsiInternalFragmentTestLanguage.g:800:5: (lv_name_3_0= RULE_ID )
            	    // PsiInternalFragmentTestLanguage.g:801:6: lv_name_3_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_1_2_0ElementType());
            	    					
            	    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            	    						doneLeaf(lv_name_3_0);
            	    					

            	    }


            	    }

            	    // PsiInternalFragmentTestLanguage.g:810:4: ( (otherlv_4= RULE_ID ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_ID) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // PsiInternalFragmentTestLanguage.g:811:5: (otherlv_4= RULE_ID )
            	            {
            	            // PsiInternalFragmentTestLanguage.g:811:5: (otherlv_4= RULE_ID )
            	            // PsiInternalFragmentTestLanguage.g:812:6: otherlv_4= RULE_ID
            	            {

            	            						markLeaf(elementTypeProvider.getFragmentWithAction3_Ref2PRFNamedCrossReference_1_3_0ElementType());
            	            					
            	            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            	            						doneLeaf(otherlv_4);
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleFragmentWithAction3"


    // $ANTLR start "rulePRFNamedFragment"
    // PsiInternalFragmentTestLanguage.g:827:1: rulePRFNamedFragment : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void rulePRFNamedFragment() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // PsiInternalFragmentTestLanguage.g:827:21: ( ( (lv_name_0_0= RULE_ID ) ) )
            // PsiInternalFragmentTestLanguage.g:828:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // PsiInternalFragmentTestLanguage.g:828:2: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:829:3: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:829:3: (lv_name_0_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:830:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getPRFNamedFragment_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_name_0_0);
            			

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
    // $ANTLR end "rulePRFNamedFragment"


    // $ANTLR start "rulePRFNamedRef"
    // PsiInternalFragmentTestLanguage.g:843:1: rulePRFNamedRef : ( (otherlv_0= RULE_ID ) ) ;
    public final void rulePRFNamedRef() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalFragmentTestLanguage.g:843:16: ( ( (otherlv_0= RULE_ID ) ) )
            // PsiInternalFragmentTestLanguage.g:844:2: ( (otherlv_0= RULE_ID ) )
            {
            // PsiInternalFragmentTestLanguage.g:844:2: ( (otherlv_0= RULE_ID ) )
            // PsiInternalFragmentTestLanguage.g:845:3: (otherlv_0= RULE_ID )
            {
            // PsiInternalFragmentTestLanguage.g:845:3: (otherlv_0= RULE_ID )
            // PsiInternalFragmentTestLanguage.g:846:4: otherlv_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getPRFNamedRef_RefPRFNamedCrossReference_0ElementType());
            			
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				doneLeaf(otherlv_0);
            			

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
    // $ANTLR end "rulePRFNamedRef"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000300002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002012L});
    }


}