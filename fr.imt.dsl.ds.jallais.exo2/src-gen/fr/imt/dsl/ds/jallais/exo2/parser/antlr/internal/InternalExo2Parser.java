package fr.imt.dsl.ds.jallais.exo2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imt.dsl.ds.jallais.exo2.services.Exo2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExo2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frame'", "'{'", "'title:'", "'size:'", "'x'", "'}'", "'section'", "'label:'", "'button:'", "'->'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalExo2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExo2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExo2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalExo2.g"; }



     	private Exo2GrammarAccess grammarAccess;

        public InternalExo2Parser(TokenStream input, Exo2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GUI";
       	}

       	@Override
       	protected Exo2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGUI"
    // InternalExo2.g:64:1: entryRuleGUI returns [EObject current=null] : iv_ruleGUI= ruleGUI EOF ;
    public final EObject entryRuleGUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUI = null;


        try {
            // InternalExo2.g:64:44: (iv_ruleGUI= ruleGUI EOF )
            // InternalExo2.g:65:2: iv_ruleGUI= ruleGUI EOF
            {
             newCompositeNode(grammarAccess.getGUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUI=ruleGUI();

            state._fsp--;

             current =iv_ruleGUI; 
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
    // $ANTLR end "entryRuleGUI"


    // $ANTLR start "ruleGUI"
    // InternalExo2.g:71:1: ruleGUI returns [EObject current=null] : ( (lv_frames_0_0= ruleFrame ) )* ;
    public final EObject ruleGUI() throws RecognitionException {
        EObject current = null;

        EObject lv_frames_0_0 = null;



        	enterRule();

        try {
            // InternalExo2.g:77:2: ( ( (lv_frames_0_0= ruleFrame ) )* )
            // InternalExo2.g:78:2: ( (lv_frames_0_0= ruleFrame ) )*
            {
            // InternalExo2.g:78:2: ( (lv_frames_0_0= ruleFrame ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExo2.g:79:3: (lv_frames_0_0= ruleFrame )
            	    {
            	    // InternalExo2.g:79:3: (lv_frames_0_0= ruleFrame )
            	    // InternalExo2.g:80:4: lv_frames_0_0= ruleFrame
            	    {

            	    				newCompositeNode(grammarAccess.getGUIAccess().getFramesFrameParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_frames_0_0=ruleFrame();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGUIRule());
            	    				}
            	    				add(
            	    					current,
            	    					"frames",
            	    					lv_frames_0_0,
            	    					"fr.imt.dsl.ds.jallais.exo2.Exo2.Frame");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


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
    // $ANTLR end "ruleGUI"


    // $ANTLR start "entryRuleFrame"
    // InternalExo2.g:100:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalExo2.g:100:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalExo2.g:101:2: iv_ruleFrame= ruleFrame EOF
            {
             newCompositeNode(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrame=ruleFrame();

            state._fsp--;

             current =iv_ruleFrame; 
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
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalExo2.g:107:1: ruleFrame returns [EObject current=null] : (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title:' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'size:' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'x' ( (lv_lenght_8_0= RULE_INT ) ) ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}' ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token lv_width_6_0=null;
        Token otherlv_7=null;
        Token lv_lenght_8_0=null;
        Token otherlv_10=null;
        EObject lv_sections_9_0 = null;



        	enterRule();

        try {
            // InternalExo2.g:113:2: ( (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title:' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'size:' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'x' ( (lv_lenght_8_0= RULE_INT ) ) ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}' ) )
            // InternalExo2.g:114:2: (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title:' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'size:' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'x' ( (lv_lenght_8_0= RULE_INT ) ) ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}' )
            {
            // InternalExo2.g:114:2: (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title:' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'size:' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'x' ( (lv_lenght_8_0= RULE_INT ) ) ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}' )
            // InternalExo2.g:115:3: otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title:' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'size:' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'x' ( (lv_lenght_8_0= RULE_INT ) ) ( (lv_sections_9_0= ruleSection ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFrameAccess().getFrameKeyword_0());
            		
            // InternalExo2.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExo2.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExo2.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalExo2.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFrameAccess().getTitleKeyword_3());
            		
            // InternalExo2.g:145:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalExo2.g:146:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalExo2.g:146:4: (lv_title_4_0= RULE_STRING )
            // InternalExo2.g:147:5: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_title_4_0, grammarAccess.getFrameAccess().getTitleSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getFrameAccess().getSizeKeyword_5());
            		
            // InternalExo2.g:167:3: ( (lv_width_6_0= RULE_INT ) )
            // InternalExo2.g:168:4: (lv_width_6_0= RULE_INT )
            {
            // InternalExo2.g:168:4: (lv_width_6_0= RULE_INT )
            // InternalExo2.g:169:5: lv_width_6_0= RULE_INT
            {
            lv_width_6_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_width_6_0, grammarAccess.getFrameAccess().getWidthINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getFrameAccess().getXKeyword_7());
            		
            // InternalExo2.g:189:3: ( (lv_lenght_8_0= RULE_INT ) )
            // InternalExo2.g:190:4: (lv_lenght_8_0= RULE_INT )
            {
            // InternalExo2.g:190:4: (lv_lenght_8_0= RULE_INT )
            // InternalExo2.g:191:5: lv_lenght_8_0= RULE_INT
            {
            lv_lenght_8_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_lenght_8_0, grammarAccess.getFrameAccess().getLenghtINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lenght",
            						lv_lenght_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalExo2.g:207:3: ( (lv_sections_9_0= ruleSection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExo2.g:208:4: (lv_sections_9_0= ruleSection )
            	    {
            	    // InternalExo2.g:208:4: (lv_sections_9_0= ruleSection )
            	    // InternalExo2.g:209:5: lv_sections_9_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getFrameAccess().getSectionsSectionParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_sections_9_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFrameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_9_0,
            	    						"fr.imt.dsl.ds.jallais.exo2.Exo2.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleSection"
    // InternalExo2.g:234:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalExo2.g:234:48: (iv_ruleSection= ruleSection EOF )
            // InternalExo2.g:235:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalExo2.g:241:1: ruleSection returns [EObject current=null] : (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleGuiComponent ) )* otherlv_4= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalExo2.g:247:2: ( (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleGuiComponent ) )* otherlv_4= '}' ) )
            // InternalExo2.g:248:2: (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleGuiComponent ) )* otherlv_4= '}' )
            {
            // InternalExo2.g:248:2: (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleGuiComponent ) )* otherlv_4= '}' )
            // InternalExo2.g:249:3: otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleGuiComponent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalExo2.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExo2.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExo2.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalExo2.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalExo2.g:275:3: ( (lv_elements_3_0= ruleGuiComponent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExo2.g:276:4: (lv_elements_3_0= ruleGuiComponent )
            	    {
            	    // InternalExo2.g:276:4: (lv_elements_3_0= ruleGuiComponent )
            	    // InternalExo2.g:277:5: lv_elements_3_0= ruleGuiComponent
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getElementsGuiComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_elements_3_0=ruleGuiComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"fr.imt.dsl.ds.jallais.exo2.Exo2.GuiComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleGuiComponent"
    // InternalExo2.g:302:1: entryRuleGuiComponent returns [EObject current=null] : iv_ruleGuiComponent= ruleGuiComponent EOF ;
    public final EObject entryRuleGuiComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuiComponent = null;


        try {
            // InternalExo2.g:302:53: (iv_ruleGuiComponent= ruleGuiComponent EOF )
            // InternalExo2.g:303:2: iv_ruleGuiComponent= ruleGuiComponent EOF
            {
             newCompositeNode(grammarAccess.getGuiComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuiComponent=ruleGuiComponent();

            state._fsp--;

             current =iv_ruleGuiComponent; 
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
    // $ANTLR end "entryRuleGuiComponent"


    // $ANTLR start "ruleGuiComponent"
    // InternalExo2.g:309:1: ruleGuiComponent returns [EObject current=null] : (this_Section_0= ruleSection | this_Label_1= ruleLabel | this_Button_2= ruleButton ) ;
    public final EObject ruleGuiComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Section_0 = null;

        EObject this_Label_1 = null;

        EObject this_Button_2 = null;



        	enterRule();

        try {
            // InternalExo2.g:315:2: ( (this_Section_0= ruleSection | this_Label_1= ruleLabel | this_Button_2= ruleButton ) )
            // InternalExo2.g:316:2: (this_Section_0= ruleSection | this_Label_1= ruleLabel | this_Button_2= ruleButton )
            {
            // InternalExo2.g:316:2: (this_Section_0= ruleSection | this_Label_1= ruleLabel | this_Button_2= ruleButton )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
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
                    // InternalExo2.g:317:3: this_Section_0= ruleSection
                    {

                    			newCompositeNode(grammarAccess.getGuiComponentAccess().getSectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Section_0=ruleSection();

                    state._fsp--;


                    			current = this_Section_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExo2.g:326:3: this_Label_1= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getGuiComponentAccess().getLabelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_1=ruleLabel();

                    state._fsp--;


                    			current = this_Label_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExo2.g:335:3: this_Button_2= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getGuiComponentAccess().getButtonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;


                    			current = this_Button_2;
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
    // $ANTLR end "ruleGuiComponent"


    // $ANTLR start "entryRuleLabel"
    // InternalExo2.g:347:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalExo2.g:347:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalExo2.g:348:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalExo2.g:354:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label:' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalExo2.g:360:2: ( (otherlv_0= 'label:' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalExo2.g:361:2: (otherlv_0= 'label:' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalExo2.g:361:2: (otherlv_0= 'label:' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalExo2.g:362:3: otherlv_0= 'label:' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            // InternalExo2.g:366:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalExo2.g:367:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalExo2.g:367:4: (lv_text_1_0= RULE_STRING )
            // InternalExo2.g:368:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalExo2.g:388:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalExo2.g:388:47: (iv_ruleButton= ruleButton EOF )
            // InternalExo2.g:389:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalExo2.g:395:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button:' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExo2.g:401:2: ( (otherlv_0= 'button:' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalExo2.g:402:2: (otherlv_0= 'button:' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalExo2.g:402:2: (otherlv_0= 'button:' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )? )
            // InternalExo2.g:403:3: otherlv_0= 'button:' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalExo2.g:407:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalExo2.g:408:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalExo2.g:408:4: (lv_text_1_0= RULE_STRING )
            // InternalExo2.g:409:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_text_1_0, grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalExo2.g:425:3: (otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExo2.g:426:4: otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalExo2.g:430:4: ( (otherlv_3= RULE_ID ) )
                    // InternalExo2.g:431:5: (otherlv_3= RULE_ID )
                    {
                    // InternalExo2.g:431:5: (otherlv_3= RULE_ID )
                    // InternalExo2.g:432:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getButtonRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getRedirectToFrameCrossReference_2_1_0());
                    					

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
    // $ANTLR end "ruleButton"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});

}