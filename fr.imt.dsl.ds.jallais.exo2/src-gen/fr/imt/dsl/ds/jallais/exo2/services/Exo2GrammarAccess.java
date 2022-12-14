/*
 * generated by Xtext 2.28.0
 */
package fr.imt.dsl.ds.jallais.exo2.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Exo2GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GUIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.dsl.ds.jallais.exo2.Exo2.GUI");
		private final Assignment cFramesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFramesFrameParserRuleCall_0 = (RuleCall)cFramesAssignment.eContents().get(0);
		
		//GUI:
		//    (frames+=Frame)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(frames+=Frame)*
		public Assignment getFramesAssignment() { return cFramesAssignment; }
		
		//Frame
		public RuleCall getFramesFrameParserRuleCall_0() { return cFramesFrameParserRuleCall_0; }
	}
	public class FrameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.dsl.ds.jallais.exo2.Exo2.Frame");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFrameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTitleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cSizeKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cWidthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cWidthINTTerminalRuleCall_6_0 = (RuleCall)cWidthAssignment_6.eContents().get(0);
		private final Keyword cXKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLenghtAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLenghtINTTerminalRuleCall_8_0 = (RuleCall)cLenghtAssignment_8.eContents().get(0);
		private final Assignment cSectionsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cSectionsSectionParserRuleCall_9_0 = (RuleCall)cSectionsAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Frame:
		//    'frame' name=ID '{'
		//        'title:' title=STRING
		//        'size:' width=INT 'x' lenght=INT
		//        (sections+=Section)*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'frame' name=ID '{'
		//    'title:' title=STRING
		//    'size:' width=INT 'x' lenght=INT
		//    (sections+=Section)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'frame'
		public Keyword getFrameKeyword_0() { return cFrameKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'title:'
		public Keyword getTitleKeyword_3() { return cTitleKeyword_3; }
		
		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }
		
		//'size:'
		public Keyword getSizeKeyword_5() { return cSizeKeyword_5; }
		
		//width=INT
		public Assignment getWidthAssignment_6() { return cWidthAssignment_6; }
		
		//INT
		public RuleCall getWidthINTTerminalRuleCall_6_0() { return cWidthINTTerminalRuleCall_6_0; }
		
		//'x'
		public Keyword getXKeyword_7() { return cXKeyword_7; }
		
		//lenght=INT
		public Assignment getLenghtAssignment_8() { return cLenghtAssignment_8; }
		
		//INT
		public RuleCall getLenghtINTTerminalRuleCall_8_0() { return cLenghtINTTerminalRuleCall_8_0; }
		
		//(sections+=Section)*
		public Assignment getSectionsAssignment_9() { return cSectionsAssignment_9; }
		
		//Section
		public RuleCall getSectionsSectionParserRuleCall_9_0() { return cSectionsSectionParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.dsl.ds.jallais.exo2.Exo2.Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsGuiComponentParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Section:
		//    'section' name=ID '{'
		//        (elements+=GuiComponent)*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'section' name=ID '{'
		//    (elements+=GuiComponent)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'section'
		public Keyword getSectionKeyword_0() { return cSectionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(elements+=GuiComponent)*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//GuiComponent
		public RuleCall getElementsGuiComponentParserRuleCall_3_0() { return cElementsGuiComponentParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class GuiComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.dsl.ds.jallais.exo2.Exo2.GuiComponent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSectionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLabelParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cButtonParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//GuiComponent:
		//    Section | Label | Button;
		@Override public ParserRule getRule() { return rule; }
		
		//Section | Label | Button
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Section
		public RuleCall getSectionParserRuleCall_0() { return cSectionParserRuleCall_0; }
		
		//Label
		public RuleCall getLabelParserRuleCall_1() { return cLabelParserRuleCall_1; }
		
		//Button
		public RuleCall getButtonParserRuleCall_2() { return cButtonParserRuleCall_2; }
	}
	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.dsl.ds.jallais.exo2.Exo2.Label");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLabelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		
		//Label:
		//    'label:' text=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'label:' text=STRING
		public Group getGroup() { return cGroup; }
		
		//'label:'
		public Keyword getLabelKeyword_0() { return cLabelKeyword_0; }
		
		//text=STRING
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_1_0() { return cTextSTRINGTerminalRuleCall_1_0; }
	}
	public class ButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.dsl.ds.jallais.exo2.Exo2.Button");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cButtonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRedirectToAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cRedirectToFrameCrossReference_2_1_0 = (CrossReference)cRedirectToAssignment_2_1.eContents().get(0);
		private final RuleCall cRedirectToFrameIDTerminalRuleCall_2_1_0_1 = (RuleCall)cRedirectToFrameCrossReference_2_1_0.eContents().get(1);
		
		//Button:
		//    'button:' text=STRING ('->' redirectTo=[Frame])?;
		@Override public ParserRule getRule() { return rule; }
		
		//'button:' text=STRING ('->' redirectTo=[Frame])?
		public Group getGroup() { return cGroup; }
		
		//'button:'
		public Keyword getButtonKeyword_0() { return cButtonKeyword_0; }
		
		//text=STRING
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_1_0() { return cTextSTRINGTerminalRuleCall_1_0; }
		
		//('->' redirectTo=[Frame])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_2_0() { return cHyphenMinusGreaterThanSignKeyword_2_0; }
		
		//redirectTo=[Frame]
		public Assignment getRedirectToAssignment_2_1() { return cRedirectToAssignment_2_1; }
		
		//[Frame]
		public CrossReference getRedirectToFrameCrossReference_2_1_0() { return cRedirectToFrameCrossReference_2_1_0; }
		
		//ID
		public RuleCall getRedirectToFrameIDTerminalRuleCall_2_1_0_1() { return cRedirectToFrameIDTerminalRuleCall_2_1_0_1; }
	}
	
	
	private final GUIElements pGUI;
	private final FrameElements pFrame;
	private final SectionElements pSection;
	private final GuiComponentElements pGuiComponent;
	private final LabelElements pLabel;
	private final ButtonElements pButton;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Exo2GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGUI = new GUIElements();
		this.pFrame = new FrameElements();
		this.pSection = new SectionElements();
		this.pGuiComponent = new GuiComponentElements();
		this.pLabel = new LabelElements();
		this.pButton = new ButtonElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.imt.dsl.ds.jallais.exo2.Exo2".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GUI:
	//    (frames+=Frame)*;
	public GUIElements getGUIAccess() {
		return pGUI;
	}
	
	public ParserRule getGUIRule() {
		return getGUIAccess().getRule();
	}
	
	//Frame:
	//    'frame' name=ID '{'
	//        'title:' title=STRING
	//        'size:' width=INT 'x' lenght=INT
	//        (sections+=Section)*
	//    '}';
	public FrameElements getFrameAccess() {
		return pFrame;
	}
	
	public ParserRule getFrameRule() {
		return getFrameAccess().getRule();
	}
	
	//Section:
	//    'section' name=ID '{'
	//        (elements+=GuiComponent)*
	//    '}';
	public SectionElements getSectionAccess() {
		return pSection;
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}
	
	//GuiComponent:
	//    Section | Label | Button;
	public GuiComponentElements getGuiComponentAccess() {
		return pGuiComponent;
	}
	
	public ParserRule getGuiComponentRule() {
		return getGuiComponentAccess().getRule();
	}
	
	//Label:
	//    'label:' text=STRING;
	public LabelElements getLabelAccess() {
		return pLabel;
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}
	
	//Button:
	//    'button:' text=STRING ('->' redirectTo=[Frame])?;
	public ButtonElements getButtonAccess() {
		return pButton;
	}
	
	public ParserRule getButtonRule() {
		return getButtonAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
