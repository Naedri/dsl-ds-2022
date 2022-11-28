package fr.imt.dsl.ds.jallais.exo2.ide.contentassist.antlr.internal;

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
import fr.imt.dsl.ds.jallais.exo2.services.Exo2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExo2Parser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(Exo2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGUI"
    // InternalExo2.g:53:1: entryRuleGUI : ruleGUI EOF ;
    public final void entryRuleGUI() throws RecognitionException {
        try {
            // InternalExo2.g:54:1: ( ruleGUI EOF )
            // InternalExo2.g:55:1: ruleGUI EOF
            {
             before(grammarAccess.getGUIRule()); 
            pushFollow(FOLLOW_1);
            ruleGUI();

            state._fsp--;

             after(grammarAccess.getGUIRule()); 
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
    // $ANTLR end "entryRuleGUI"


    // $ANTLR start "ruleGUI"
    // InternalExo2.g:62:1: ruleGUI : ( ( rule__GUI__FramesAssignment )* ) ;
    public final void ruleGUI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:66:2: ( ( ( rule__GUI__FramesAssignment )* ) )
            // InternalExo2.g:67:2: ( ( rule__GUI__FramesAssignment )* )
            {
            // InternalExo2.g:67:2: ( ( rule__GUI__FramesAssignment )* )
            // InternalExo2.g:68:3: ( rule__GUI__FramesAssignment )*
            {
             before(grammarAccess.getGUIAccess().getFramesAssignment()); 
            // InternalExo2.g:69:3: ( rule__GUI__FramesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExo2.g:69:4: rule__GUI__FramesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__GUI__FramesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGUIAccess().getFramesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGUI"


    // $ANTLR start "entryRuleFrame"
    // InternalExo2.g:78:1: entryRuleFrame : ruleFrame EOF ;
    public final void entryRuleFrame() throws RecognitionException {
        try {
            // InternalExo2.g:79:1: ( ruleFrame EOF )
            // InternalExo2.g:80:1: ruleFrame EOF
            {
             before(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getFrameRule()); 
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
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalExo2.g:87:1: ruleFrame : ( ( rule__Frame__Group__0 ) ) ;
    public final void ruleFrame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:91:2: ( ( ( rule__Frame__Group__0 ) ) )
            // InternalExo2.g:92:2: ( ( rule__Frame__Group__0 ) )
            {
            // InternalExo2.g:92:2: ( ( rule__Frame__Group__0 ) )
            // InternalExo2.g:93:3: ( rule__Frame__Group__0 )
            {
             before(grammarAccess.getFrameAccess().getGroup()); 
            // InternalExo2.g:94:3: ( rule__Frame__Group__0 )
            // InternalExo2.g:94:4: rule__Frame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleSection"
    // InternalExo2.g:103:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalExo2.g:104:1: ( ruleSection EOF )
            // InternalExo2.g:105:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalExo2.g:112:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:116:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalExo2.g:117:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalExo2.g:117:2: ( ( rule__Section__Group__0 ) )
            // InternalExo2.g:118:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalExo2.g:119:3: ( rule__Section__Group__0 )
            // InternalExo2.g:119:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleGuiComponent"
    // InternalExo2.g:128:1: entryRuleGuiComponent : ruleGuiComponent EOF ;
    public final void entryRuleGuiComponent() throws RecognitionException {
        try {
            // InternalExo2.g:129:1: ( ruleGuiComponent EOF )
            // InternalExo2.g:130:1: ruleGuiComponent EOF
            {
             before(grammarAccess.getGuiComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleGuiComponent();

            state._fsp--;

             after(grammarAccess.getGuiComponentRule()); 
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
    // $ANTLR end "entryRuleGuiComponent"


    // $ANTLR start "ruleGuiComponent"
    // InternalExo2.g:137:1: ruleGuiComponent : ( ( rule__GuiComponent__Alternatives ) ) ;
    public final void ruleGuiComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:141:2: ( ( ( rule__GuiComponent__Alternatives ) ) )
            // InternalExo2.g:142:2: ( ( rule__GuiComponent__Alternatives ) )
            {
            // InternalExo2.g:142:2: ( ( rule__GuiComponent__Alternatives ) )
            // InternalExo2.g:143:3: ( rule__GuiComponent__Alternatives )
            {
             before(grammarAccess.getGuiComponentAccess().getAlternatives()); 
            // InternalExo2.g:144:3: ( rule__GuiComponent__Alternatives )
            // InternalExo2.g:144:4: rule__GuiComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GuiComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGuiComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuiComponent"


    // $ANTLR start "entryRuleLabel"
    // InternalExo2.g:153:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalExo2.g:154:1: ( ruleLabel EOF )
            // InternalExo2.g:155:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalExo2.g:162:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:166:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalExo2.g:167:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalExo2.g:167:2: ( ( rule__Label__Group__0 ) )
            // InternalExo2.g:168:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalExo2.g:169:3: ( rule__Label__Group__0 )
            // InternalExo2.g:169:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalExo2.g:178:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalExo2.g:179:1: ( ruleButton EOF )
            // InternalExo2.g:180:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalExo2.g:187:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:191:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalExo2.g:192:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalExo2.g:192:2: ( ( rule__Button__Group__0 ) )
            // InternalExo2.g:193:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalExo2.g:194:3: ( rule__Button__Group__0 )
            // InternalExo2.g:194:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "rule__GuiComponent__Alternatives"
    // InternalExo2.g:202:1: rule__GuiComponent__Alternatives : ( ( ruleSection ) | ( ruleLabel ) | ( ruleButton ) );
    public final void rule__GuiComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:206:1: ( ( ruleSection ) | ( ruleLabel ) | ( ruleButton ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
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
                    // InternalExo2.g:207:2: ( ruleSection )
                    {
                    // InternalExo2.g:207:2: ( ruleSection )
                    // InternalExo2.g:208:3: ruleSection
                    {
                     before(grammarAccess.getGuiComponentAccess().getSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSection();

                    state._fsp--;

                     after(grammarAccess.getGuiComponentAccess().getSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExo2.g:213:2: ( ruleLabel )
                    {
                    // InternalExo2.g:213:2: ( ruleLabel )
                    // InternalExo2.g:214:3: ruleLabel
                    {
                     before(grammarAccess.getGuiComponentAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getGuiComponentAccess().getLabelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExo2.g:219:2: ( ruleButton )
                    {
                    // InternalExo2.g:219:2: ( ruleButton )
                    // InternalExo2.g:220:3: ruleButton
                    {
                     before(grammarAccess.getGuiComponentAccess().getButtonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getGuiComponentAccess().getButtonParserRuleCall_2()); 

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
    // $ANTLR end "rule__GuiComponent__Alternatives"


    // $ANTLR start "rule__Frame__Group__0"
    // InternalExo2.g:229:1: rule__Frame__Group__0 : rule__Frame__Group__0__Impl rule__Frame__Group__1 ;
    public final void rule__Frame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:233:1: ( rule__Frame__Group__0__Impl rule__Frame__Group__1 )
            // InternalExo2.g:234:2: rule__Frame__Group__0__Impl rule__Frame__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Frame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__1();

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
    // $ANTLR end "rule__Frame__Group__0"


    // $ANTLR start "rule__Frame__Group__0__Impl"
    // InternalExo2.g:241:1: rule__Frame__Group__0__Impl : ( 'frame' ) ;
    public final void rule__Frame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:245:1: ( ( 'frame' ) )
            // InternalExo2.g:246:1: ( 'frame' )
            {
            // InternalExo2.g:246:1: ( 'frame' )
            // InternalExo2.g:247:2: 'frame'
            {
             before(grammarAccess.getFrameAccess().getFrameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getFrameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__0__Impl"


    // $ANTLR start "rule__Frame__Group__1"
    // InternalExo2.g:256:1: rule__Frame__Group__1 : rule__Frame__Group__1__Impl rule__Frame__Group__2 ;
    public final void rule__Frame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:260:1: ( rule__Frame__Group__1__Impl rule__Frame__Group__2 )
            // InternalExo2.g:261:2: rule__Frame__Group__1__Impl rule__Frame__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Frame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__2();

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
    // $ANTLR end "rule__Frame__Group__1"


    // $ANTLR start "rule__Frame__Group__1__Impl"
    // InternalExo2.g:268:1: rule__Frame__Group__1__Impl : ( ( rule__Frame__NameAssignment_1 ) ) ;
    public final void rule__Frame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:272:1: ( ( ( rule__Frame__NameAssignment_1 ) ) )
            // InternalExo2.g:273:1: ( ( rule__Frame__NameAssignment_1 ) )
            {
            // InternalExo2.g:273:1: ( ( rule__Frame__NameAssignment_1 ) )
            // InternalExo2.g:274:2: ( rule__Frame__NameAssignment_1 )
            {
             before(grammarAccess.getFrameAccess().getNameAssignment_1()); 
            // InternalExo2.g:275:2: ( rule__Frame__NameAssignment_1 )
            // InternalExo2.g:275:3: rule__Frame__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Frame__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__1__Impl"


    // $ANTLR start "rule__Frame__Group__2"
    // InternalExo2.g:283:1: rule__Frame__Group__2 : rule__Frame__Group__2__Impl rule__Frame__Group__3 ;
    public final void rule__Frame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:287:1: ( rule__Frame__Group__2__Impl rule__Frame__Group__3 )
            // InternalExo2.g:288:2: rule__Frame__Group__2__Impl rule__Frame__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Frame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__3();

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
    // $ANTLR end "rule__Frame__Group__2"


    // $ANTLR start "rule__Frame__Group__2__Impl"
    // InternalExo2.g:295:1: rule__Frame__Group__2__Impl : ( '{' ) ;
    public final void rule__Frame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:299:1: ( ( '{' ) )
            // InternalExo2.g:300:1: ( '{' )
            {
            // InternalExo2.g:300:1: ( '{' )
            // InternalExo2.g:301:2: '{'
            {
             before(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__2__Impl"


    // $ANTLR start "rule__Frame__Group__3"
    // InternalExo2.g:310:1: rule__Frame__Group__3 : rule__Frame__Group__3__Impl rule__Frame__Group__4 ;
    public final void rule__Frame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:314:1: ( rule__Frame__Group__3__Impl rule__Frame__Group__4 )
            // InternalExo2.g:315:2: rule__Frame__Group__3__Impl rule__Frame__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Frame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__4();

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
    // $ANTLR end "rule__Frame__Group__3"


    // $ANTLR start "rule__Frame__Group__3__Impl"
    // InternalExo2.g:322:1: rule__Frame__Group__3__Impl : ( 'title:' ) ;
    public final void rule__Frame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:326:1: ( ( 'title:' ) )
            // InternalExo2.g:327:1: ( 'title:' )
            {
            // InternalExo2.g:327:1: ( 'title:' )
            // InternalExo2.g:328:2: 'title:'
            {
             before(grammarAccess.getFrameAccess().getTitleKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getTitleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__3__Impl"


    // $ANTLR start "rule__Frame__Group__4"
    // InternalExo2.g:337:1: rule__Frame__Group__4 : rule__Frame__Group__4__Impl rule__Frame__Group__5 ;
    public final void rule__Frame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:341:1: ( rule__Frame__Group__4__Impl rule__Frame__Group__5 )
            // InternalExo2.g:342:2: rule__Frame__Group__4__Impl rule__Frame__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Frame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__5();

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
    // $ANTLR end "rule__Frame__Group__4"


    // $ANTLR start "rule__Frame__Group__4__Impl"
    // InternalExo2.g:349:1: rule__Frame__Group__4__Impl : ( ( rule__Frame__TitleAssignment_4 ) ) ;
    public final void rule__Frame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:353:1: ( ( ( rule__Frame__TitleAssignment_4 ) ) )
            // InternalExo2.g:354:1: ( ( rule__Frame__TitleAssignment_4 ) )
            {
            // InternalExo2.g:354:1: ( ( rule__Frame__TitleAssignment_4 ) )
            // InternalExo2.g:355:2: ( rule__Frame__TitleAssignment_4 )
            {
             before(grammarAccess.getFrameAccess().getTitleAssignment_4()); 
            // InternalExo2.g:356:2: ( rule__Frame__TitleAssignment_4 )
            // InternalExo2.g:356:3: rule__Frame__TitleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Frame__TitleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getTitleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__4__Impl"


    // $ANTLR start "rule__Frame__Group__5"
    // InternalExo2.g:364:1: rule__Frame__Group__5 : rule__Frame__Group__5__Impl rule__Frame__Group__6 ;
    public final void rule__Frame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:368:1: ( rule__Frame__Group__5__Impl rule__Frame__Group__6 )
            // InternalExo2.g:369:2: rule__Frame__Group__5__Impl rule__Frame__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Frame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__6();

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
    // $ANTLR end "rule__Frame__Group__5"


    // $ANTLR start "rule__Frame__Group__5__Impl"
    // InternalExo2.g:376:1: rule__Frame__Group__5__Impl : ( 'size:' ) ;
    public final void rule__Frame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:380:1: ( ( 'size:' ) )
            // InternalExo2.g:381:1: ( 'size:' )
            {
            // InternalExo2.g:381:1: ( 'size:' )
            // InternalExo2.g:382:2: 'size:'
            {
             before(grammarAccess.getFrameAccess().getSizeKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getSizeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__5__Impl"


    // $ANTLR start "rule__Frame__Group__6"
    // InternalExo2.g:391:1: rule__Frame__Group__6 : rule__Frame__Group__6__Impl rule__Frame__Group__7 ;
    public final void rule__Frame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:395:1: ( rule__Frame__Group__6__Impl rule__Frame__Group__7 )
            // InternalExo2.g:396:2: rule__Frame__Group__6__Impl rule__Frame__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Frame__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__7();

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
    // $ANTLR end "rule__Frame__Group__6"


    // $ANTLR start "rule__Frame__Group__6__Impl"
    // InternalExo2.g:403:1: rule__Frame__Group__6__Impl : ( ( rule__Frame__WidthAssignment_6 ) ) ;
    public final void rule__Frame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:407:1: ( ( ( rule__Frame__WidthAssignment_6 ) ) )
            // InternalExo2.g:408:1: ( ( rule__Frame__WidthAssignment_6 ) )
            {
            // InternalExo2.g:408:1: ( ( rule__Frame__WidthAssignment_6 ) )
            // InternalExo2.g:409:2: ( rule__Frame__WidthAssignment_6 )
            {
             before(grammarAccess.getFrameAccess().getWidthAssignment_6()); 
            // InternalExo2.g:410:2: ( rule__Frame__WidthAssignment_6 )
            // InternalExo2.g:410:3: rule__Frame__WidthAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Frame__WidthAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getWidthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__6__Impl"


    // $ANTLR start "rule__Frame__Group__7"
    // InternalExo2.g:418:1: rule__Frame__Group__7 : rule__Frame__Group__7__Impl rule__Frame__Group__8 ;
    public final void rule__Frame__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:422:1: ( rule__Frame__Group__7__Impl rule__Frame__Group__8 )
            // InternalExo2.g:423:2: rule__Frame__Group__7__Impl rule__Frame__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Frame__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__8();

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
    // $ANTLR end "rule__Frame__Group__7"


    // $ANTLR start "rule__Frame__Group__7__Impl"
    // InternalExo2.g:430:1: rule__Frame__Group__7__Impl : ( 'x' ) ;
    public final void rule__Frame__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:434:1: ( ( 'x' ) )
            // InternalExo2.g:435:1: ( 'x' )
            {
            // InternalExo2.g:435:1: ( 'x' )
            // InternalExo2.g:436:2: 'x'
            {
             before(grammarAccess.getFrameAccess().getXKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getXKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__7__Impl"


    // $ANTLR start "rule__Frame__Group__8"
    // InternalExo2.g:445:1: rule__Frame__Group__8 : rule__Frame__Group__8__Impl rule__Frame__Group__9 ;
    public final void rule__Frame__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:449:1: ( rule__Frame__Group__8__Impl rule__Frame__Group__9 )
            // InternalExo2.g:450:2: rule__Frame__Group__8__Impl rule__Frame__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Frame__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__9();

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
    // $ANTLR end "rule__Frame__Group__8"


    // $ANTLR start "rule__Frame__Group__8__Impl"
    // InternalExo2.g:457:1: rule__Frame__Group__8__Impl : ( ( rule__Frame__LenghtAssignment_8 ) ) ;
    public final void rule__Frame__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:461:1: ( ( ( rule__Frame__LenghtAssignment_8 ) ) )
            // InternalExo2.g:462:1: ( ( rule__Frame__LenghtAssignment_8 ) )
            {
            // InternalExo2.g:462:1: ( ( rule__Frame__LenghtAssignment_8 ) )
            // InternalExo2.g:463:2: ( rule__Frame__LenghtAssignment_8 )
            {
             before(grammarAccess.getFrameAccess().getLenghtAssignment_8()); 
            // InternalExo2.g:464:2: ( rule__Frame__LenghtAssignment_8 )
            // InternalExo2.g:464:3: rule__Frame__LenghtAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Frame__LenghtAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getLenghtAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__8__Impl"


    // $ANTLR start "rule__Frame__Group__9"
    // InternalExo2.g:472:1: rule__Frame__Group__9 : rule__Frame__Group__9__Impl rule__Frame__Group__10 ;
    public final void rule__Frame__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:476:1: ( rule__Frame__Group__9__Impl rule__Frame__Group__10 )
            // InternalExo2.g:477:2: rule__Frame__Group__9__Impl rule__Frame__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Frame__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__10();

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
    // $ANTLR end "rule__Frame__Group__9"


    // $ANTLR start "rule__Frame__Group__9__Impl"
    // InternalExo2.g:484:1: rule__Frame__Group__9__Impl : ( ( rule__Frame__SectionsAssignment_9 )* ) ;
    public final void rule__Frame__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:488:1: ( ( ( rule__Frame__SectionsAssignment_9 )* ) )
            // InternalExo2.g:489:1: ( ( rule__Frame__SectionsAssignment_9 )* )
            {
            // InternalExo2.g:489:1: ( ( rule__Frame__SectionsAssignment_9 )* )
            // InternalExo2.g:490:2: ( rule__Frame__SectionsAssignment_9 )*
            {
             before(grammarAccess.getFrameAccess().getSectionsAssignment_9()); 
            // InternalExo2.g:491:2: ( rule__Frame__SectionsAssignment_9 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExo2.g:491:3: rule__Frame__SectionsAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Frame__SectionsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFrameAccess().getSectionsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__9__Impl"


    // $ANTLR start "rule__Frame__Group__10"
    // InternalExo2.g:499:1: rule__Frame__Group__10 : rule__Frame__Group__10__Impl ;
    public final void rule__Frame__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:503:1: ( rule__Frame__Group__10__Impl )
            // InternalExo2.g:504:2: rule__Frame__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__10__Impl();

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
    // $ANTLR end "rule__Frame__Group__10"


    // $ANTLR start "rule__Frame__Group__10__Impl"
    // InternalExo2.g:510:1: rule__Frame__Group__10__Impl : ( '}' ) ;
    public final void rule__Frame__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:514:1: ( ( '}' ) )
            // InternalExo2.g:515:1: ( '}' )
            {
            // InternalExo2.g:515:1: ( '}' )
            // InternalExo2.g:516:2: '}'
            {
             before(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__10__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalExo2.g:526:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:530:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalExo2.g:531:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

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
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalExo2.g:538:1: rule__Section__Group__0__Impl : ( 'section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:542:1: ( ( 'section' ) )
            // InternalExo2.g:543:1: ( 'section' )
            {
            // InternalExo2.g:543:1: ( 'section' )
            // InternalExo2.g:544:2: 'section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalExo2.g:553:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:557:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalExo2.g:558:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

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
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalExo2.g:565:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:569:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalExo2.g:570:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalExo2.g:570:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalExo2.g:571:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalExo2.g:572:2: ( rule__Section__NameAssignment_1 )
            // InternalExo2.g:572:3: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalExo2.g:580:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:584:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalExo2.g:585:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

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
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalExo2.g:592:1: rule__Section__Group__2__Impl : ( '{' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:596:1: ( ( '{' ) )
            // InternalExo2.g:597:1: ( '{' )
            {
            // InternalExo2.g:597:1: ( '{' )
            // InternalExo2.g:598:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalExo2.g:607:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:611:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalExo2.g:612:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

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
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalExo2.g:619:1: rule__Section__Group__3__Impl : ( ( rule__Section__ElementsAssignment_3 )* ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:623:1: ( ( ( rule__Section__ElementsAssignment_3 )* ) )
            // InternalExo2.g:624:1: ( ( rule__Section__ElementsAssignment_3 )* )
            {
            // InternalExo2.g:624:1: ( ( rule__Section__ElementsAssignment_3 )* )
            // InternalExo2.g:625:2: ( rule__Section__ElementsAssignment_3 )*
            {
             before(grammarAccess.getSectionAccess().getElementsAssignment_3()); 
            // InternalExo2.g:626:2: ( rule__Section__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=17 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExo2.g:626:3: rule__Section__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Section__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalExo2.g:634:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:638:1: ( rule__Section__Group__4__Impl )
            // InternalExo2.g:639:2: rule__Section__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__4__Impl();

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
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalExo2.g:645:1: rule__Section__Group__4__Impl : ( '}' ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:649:1: ( ( '}' ) )
            // InternalExo2.g:650:1: ( '}' )
            {
            // InternalExo2.g:650:1: ( '}' )
            // InternalExo2.g:651:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalExo2.g:661:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:665:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalExo2.g:666:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalExo2.g:673:1: rule__Label__Group__0__Impl : ( 'label:' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:677:1: ( ( 'label:' ) )
            // InternalExo2.g:678:1: ( 'label:' )
            {
            // InternalExo2.g:678:1: ( 'label:' )
            // InternalExo2.g:679:2: 'label:'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalExo2.g:688:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:692:1: ( rule__Label__Group__1__Impl )
            // InternalExo2.g:693:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__1__Impl();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalExo2.g:699:1: rule__Label__Group__1__Impl : ( ( rule__Label__TextAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:703:1: ( ( ( rule__Label__TextAssignment_1 ) ) )
            // InternalExo2.g:704:1: ( ( rule__Label__TextAssignment_1 ) )
            {
            // InternalExo2.g:704:1: ( ( rule__Label__TextAssignment_1 ) )
            // InternalExo2.g:705:2: ( rule__Label__TextAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getTextAssignment_1()); 
            // InternalExo2.g:706:2: ( rule__Label__TextAssignment_1 )
            // InternalExo2.g:706:3: rule__Label__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Label__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalExo2.g:715:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:719:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalExo2.g:720:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalExo2.g:727:1: rule__Button__Group__0__Impl : ( 'button:' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:731:1: ( ( 'button:' ) )
            // InternalExo2.g:732:1: ( 'button:' )
            {
            // InternalExo2.g:732:1: ( 'button:' )
            // InternalExo2.g:733:2: 'button:'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalExo2.g:742:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:746:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalExo2.g:747:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalExo2.g:754:1: rule__Button__Group__1__Impl : ( ( rule__Button__TextAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:758:1: ( ( ( rule__Button__TextAssignment_1 ) ) )
            // InternalExo2.g:759:1: ( ( rule__Button__TextAssignment_1 ) )
            {
            // InternalExo2.g:759:1: ( ( rule__Button__TextAssignment_1 ) )
            // InternalExo2.g:760:2: ( rule__Button__TextAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getTextAssignment_1()); 
            // InternalExo2.g:761:2: ( rule__Button__TextAssignment_1 )
            // InternalExo2.g:761:3: rule__Button__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalExo2.g:769:1: rule__Button__Group__2 : rule__Button__Group__2__Impl ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:773:1: ( rule__Button__Group__2__Impl )
            // InternalExo2.g:774:2: rule__Button__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__2__Impl();

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
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalExo2.g:780:1: rule__Button__Group__2__Impl : ( ( rule__Button__Group_2__0 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:784:1: ( ( ( rule__Button__Group_2__0 )? ) )
            // InternalExo2.g:785:1: ( ( rule__Button__Group_2__0 )? )
            {
            // InternalExo2.g:785:1: ( ( rule__Button__Group_2__0 )? )
            // InternalExo2.g:786:2: ( rule__Button__Group_2__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_2()); 
            // InternalExo2.g:787:2: ( rule__Button__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExo2.g:787:3: rule__Button__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group_2__0"
    // InternalExo2.g:796:1: rule__Button__Group_2__0 : rule__Button__Group_2__0__Impl rule__Button__Group_2__1 ;
    public final void rule__Button__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:800:1: ( rule__Button__Group_2__0__Impl rule__Button__Group_2__1 )
            // InternalExo2.g:801:2: rule__Button__Group_2__0__Impl rule__Button__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Button__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_2__1();

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
    // $ANTLR end "rule__Button__Group_2__0"


    // $ANTLR start "rule__Button__Group_2__0__Impl"
    // InternalExo2.g:808:1: rule__Button__Group_2__0__Impl : ( '->' ) ;
    public final void rule__Button__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:812:1: ( ( '->' ) )
            // InternalExo2.g:813:1: ( '->' )
            {
            // InternalExo2.g:813:1: ( '->' )
            // InternalExo2.g:814:2: '->'
            {
             before(grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_2__0__Impl"


    // $ANTLR start "rule__Button__Group_2__1"
    // InternalExo2.g:823:1: rule__Button__Group_2__1 : rule__Button__Group_2__1__Impl ;
    public final void rule__Button__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:827:1: ( rule__Button__Group_2__1__Impl )
            // InternalExo2.g:828:2: rule__Button__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group_2__1__Impl();

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
    // $ANTLR end "rule__Button__Group_2__1"


    // $ANTLR start "rule__Button__Group_2__1__Impl"
    // InternalExo2.g:834:1: rule__Button__Group_2__1__Impl : ( ( rule__Button__RedirectToAssignment_2_1 ) ) ;
    public final void rule__Button__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:838:1: ( ( ( rule__Button__RedirectToAssignment_2_1 ) ) )
            // InternalExo2.g:839:1: ( ( rule__Button__RedirectToAssignment_2_1 ) )
            {
            // InternalExo2.g:839:1: ( ( rule__Button__RedirectToAssignment_2_1 ) )
            // InternalExo2.g:840:2: ( rule__Button__RedirectToAssignment_2_1 )
            {
             before(grammarAccess.getButtonAccess().getRedirectToAssignment_2_1()); 
            // InternalExo2.g:841:2: ( rule__Button__RedirectToAssignment_2_1 )
            // InternalExo2.g:841:3: rule__Button__RedirectToAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__RedirectToAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getRedirectToAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_2__1__Impl"


    // $ANTLR start "rule__GUI__FramesAssignment"
    // InternalExo2.g:850:1: rule__GUI__FramesAssignment : ( ruleFrame ) ;
    public final void rule__GUI__FramesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:854:1: ( ( ruleFrame ) )
            // InternalExo2.g:855:2: ( ruleFrame )
            {
            // InternalExo2.g:855:2: ( ruleFrame )
            // InternalExo2.g:856:3: ruleFrame
            {
             before(grammarAccess.getGUIAccess().getFramesFrameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getGUIAccess().getFramesFrameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__FramesAssignment"


    // $ANTLR start "rule__Frame__NameAssignment_1"
    // InternalExo2.g:865:1: rule__Frame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Frame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:869:1: ( ( RULE_ID ) )
            // InternalExo2.g:870:2: ( RULE_ID )
            {
            // InternalExo2.g:870:2: ( RULE_ID )
            // InternalExo2.g:871:3: RULE_ID
            {
             before(grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__NameAssignment_1"


    // $ANTLR start "rule__Frame__TitleAssignment_4"
    // InternalExo2.g:880:1: rule__Frame__TitleAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Frame__TitleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:884:1: ( ( RULE_STRING ) )
            // InternalExo2.g:885:2: ( RULE_STRING )
            {
            // InternalExo2.g:885:2: ( RULE_STRING )
            // InternalExo2.g:886:3: RULE_STRING
            {
             before(grammarAccess.getFrameAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getTitleSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__TitleAssignment_4"


    // $ANTLR start "rule__Frame__WidthAssignment_6"
    // InternalExo2.g:895:1: rule__Frame__WidthAssignment_6 : ( RULE_INT ) ;
    public final void rule__Frame__WidthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:899:1: ( ( RULE_INT ) )
            // InternalExo2.g:900:2: ( RULE_INT )
            {
            // InternalExo2.g:900:2: ( RULE_INT )
            // InternalExo2.g:901:3: RULE_INT
            {
             before(grammarAccess.getFrameAccess().getWidthINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getWidthINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__WidthAssignment_6"


    // $ANTLR start "rule__Frame__LenghtAssignment_8"
    // InternalExo2.g:910:1: rule__Frame__LenghtAssignment_8 : ( RULE_INT ) ;
    public final void rule__Frame__LenghtAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:914:1: ( ( RULE_INT ) )
            // InternalExo2.g:915:2: ( RULE_INT )
            {
            // InternalExo2.g:915:2: ( RULE_INT )
            // InternalExo2.g:916:3: RULE_INT
            {
             before(grammarAccess.getFrameAccess().getLenghtINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getLenghtINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__LenghtAssignment_8"


    // $ANTLR start "rule__Frame__SectionsAssignment_9"
    // InternalExo2.g:925:1: rule__Frame__SectionsAssignment_9 : ( ruleSection ) ;
    public final void rule__Frame__SectionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:929:1: ( ( ruleSection ) )
            // InternalExo2.g:930:2: ( ruleSection )
            {
            // InternalExo2.g:930:2: ( ruleSection )
            // InternalExo2.g:931:3: ruleSection
            {
             before(grammarAccess.getFrameAccess().getSectionsSectionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getSectionsSectionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__SectionsAssignment_9"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalExo2.g:940:1: rule__Section__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:944:1: ( ( RULE_ID ) )
            // InternalExo2.g:945:2: ( RULE_ID )
            {
            // InternalExo2.g:945:2: ( RULE_ID )
            // InternalExo2.g:946:3: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__ElementsAssignment_3"
    // InternalExo2.g:955:1: rule__Section__ElementsAssignment_3 : ( ruleGuiComponent ) ;
    public final void rule__Section__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:959:1: ( ( ruleGuiComponent ) )
            // InternalExo2.g:960:2: ( ruleGuiComponent )
            {
            // InternalExo2.g:960:2: ( ruleGuiComponent )
            // InternalExo2.g:961:3: ruleGuiComponent
            {
             before(grammarAccess.getSectionAccess().getElementsGuiComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGuiComponent();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getElementsGuiComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ElementsAssignment_3"


    // $ANTLR start "rule__Label__TextAssignment_1"
    // InternalExo2.g:970:1: rule__Label__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Label__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:974:1: ( ( RULE_STRING ) )
            // InternalExo2.g:975:2: ( RULE_STRING )
            {
            // InternalExo2.g:975:2: ( RULE_STRING )
            // InternalExo2.g:976:3: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__TextAssignment_1"


    // $ANTLR start "rule__Button__TextAssignment_1"
    // InternalExo2.g:985:1: rule__Button__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Button__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:989:1: ( ( RULE_STRING ) )
            // InternalExo2.g:990:2: ( RULE_STRING )
            {
            // InternalExo2.g:990:2: ( RULE_STRING )
            // InternalExo2.g:991:3: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__TextAssignment_1"


    // $ANTLR start "rule__Button__RedirectToAssignment_2_1"
    // InternalExo2.g:1000:1: rule__Button__RedirectToAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Button__RedirectToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExo2.g:1004:1: ( ( ( RULE_ID ) ) )
            // InternalExo2.g:1005:2: ( ( RULE_ID ) )
            {
            // InternalExo2.g:1005:2: ( ( RULE_ID ) )
            // InternalExo2.g:1006:3: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getRedirectToFrameCrossReference_2_1_0()); 
            // InternalExo2.g:1007:3: ( RULE_ID )
            // InternalExo2.g:1008:4: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getRedirectToFrameIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getRedirectToFrameIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getRedirectToFrameCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__RedirectToAssignment_2_1"

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});

}