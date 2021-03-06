/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.AliasWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.AndWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.BooleanAttributeWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.Bug287941TestLanguagePackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.DoubleWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ElementScope;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.FromEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.Import;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.LongWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.MQLquery;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.Model;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.NullWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.OrWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ReferenceAliasWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ResourceScope;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ScopeClause;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.SelectEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.StringAttributeWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.SubselectWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.VariableWhereEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug287941TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug287941TestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Bug287941TestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Bug287941TestLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Bug287941TestLanguagePackage.ALIAS_WHERE_ENTRY:
				sequence_AliasWhereEntry(context, (AliasWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.AND_WHERE_ENTRY:
				sequence_AndWhereEntry(context, (AndWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.BOOLEAN_ATTRIBUTE_WHERE_ENTRY:
				sequence_BooleanAttributeWhereEntry(context, (BooleanAttributeWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.DOUBLE_WHERE_ENTRY:
				sequence_DoubleWhereEntry(context, (DoubleWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.ELEMENT_SCOPE:
				sequence_ElementScope(context, (ElementScope) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.FROM_ENTRY:
				sequence_FromEntry(context, (FromEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.LONG_WHERE_ENTRY:
				sequence_LongWhereEntry(context, (LongWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.MQ_LQUERY:
				sequence_MQLquery(context, (MQLquery) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.NULL_WHERE_ENTRY:
				sequence_NullWhereEntry(context, (NullWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.OR_WHERE_ENTRY:
				sequence_WhereEntry(context, (OrWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.REFERENCE_ALIAS_WHERE_ENTRY:
				sequence_ReferenceAliasWhereEntry(context, (ReferenceAliasWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.RESOURCE_SCOPE:
				sequence_ResourceScope(context, (ResourceScope) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.SCOPE_CLAUSE:
				sequence_ScopeClause(context, (ScopeClause) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.SELECT_ENTRY:
				sequence_SelectEntry(context, (SelectEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.STRING_ATTRIBUTE_WHERE_ENTRY:
				sequence_StringAttributeWhereEntry(context, (StringAttributeWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.SUBSELECT_WHERE_ENTRY:
				sequence_SubselectWhereEntry(context, (SubselectWhereEntry) semanticObject); 
				return; 
			case Bug287941TestLanguagePackage.VARIABLE_WHERE_ENTRY:
				sequence_VariableWhereEntry(context, (VariableWhereEntry) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] rightAlias=[FromEntry|ID])
	 */
	protected void sequence_AliasWhereEntry(EObject context, AliasWhereEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ALIAS_WHERE_ENTRY__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ALIAS_WHERE_ENTRY__ALIAS));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ALIAS_WHERE_ENTRY__RIGHT_ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ALIAS_WHERE_ENTRY__RIGHT_ALIAS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAliasWhereEntryAccess().getAliasFromEntryIDTerminalRuleCall_0_0_1(), semanticObject.getAlias());
		feeder.accept(grammarAccess.getAliasWhereEntryAccess().getRightAliasFromEntryIDTerminalRuleCall_2_0_1(), semanticObject.getRightAlias());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=AndWhereEntry_AndWhereEntry_1_0 entries+=ConcreteWhereEntry+)
	 */
	protected void sequence_AndWhereEntry(EObject context, AndWhereEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] attribute=[EAttribute|ID] operator=BooleanOperator isTrue?='true'?)
	 */
	protected void sequence_BooleanAttributeWhereEntry(EObject context, BooleanAttributeWhereEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] attribute=[EAttribute|ID] operator=NumericOperator value=SIGNED_DOUBLE)
	 */
	protected void sequence_DoubleWhereEntry(EObject context, DoubleWhereEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ALIAS));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.NUMERIC_ATTRIBUTE_WHERE_ENTRY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.NUMERIC_ATTRIBUTE_WHERE_ENTRY__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.DOUBLE_WHERE_ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.DOUBLE_WHERE_ENTRY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleWhereEntryAccess().getAliasFromEntryIDTerminalRuleCall_0_0_1(), semanticObject.getAlias());
		feeder.accept(grammarAccess.getDoubleWhereEntryAccess().getAttributeEAttributeIDTerminalRuleCall_2_0_1(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getDoubleWhereEntryAccess().getOperatorNumericOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getDoubleWhereEntryAccess().getValueSIGNED_DOUBLETerminalRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (uris+=STRING uris+=STRING*)
	 */
	protected void sequence_ElementScope(EObject context, ElementScope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[EClass|ID] withoutsubtypes?='withoutsubtypes'? alias=ID scopeClause=ScopeClause?)
	 */
	protected void sequence_FromEntry(EObject context, FromEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] attribute=[EAttribute|ID] operator=NumericOperator value=SINGED_LONG)
	 */
	protected void sequence_LongWhereEntry(EObject context, LongWhereEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ALIAS));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.NUMERIC_ATTRIBUTE_WHERE_ENTRY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.NUMERIC_ATTRIBUTE_WHERE_ENTRY__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.LONG_WHERE_ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.LONG_WHERE_ENTRY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLongWhereEntryAccess().getAliasFromEntryIDTerminalRuleCall_0_0_1(), semanticObject.getAlias());
		feeder.accept(grammarAccess.getLongWhereEntryAccess().getAttributeEAttributeIDTerminalRuleCall_2_0_1(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getLongWhereEntryAccess().getOperatorNumericOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getLongWhereEntryAccess().getValueSINGED_LONGTerminalRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (selectEntries+=SelectEntry selectEntries+=SelectEntry* fromEntries+=FromEntry fromEntries+=FromEntry* whereEntries+=WhereEntry*)
	 */
	protected void sequence_MQLquery(EObject context, MQLquery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* query=MQLquery)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] feature=[EStructuralFeature|ID] operator=BooleanOperator)
	 */
	protected void sequence_NullWhereEntry(EObject context, NullWhereEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.NULL_WHERE_ENTRY__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.NULL_WHERE_ENTRY__ALIAS));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.NULL_WHERE_ENTRY__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.NULL_WHERE_ENTRY__FEATURE));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.NULL_WHERE_ENTRY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.NULL_WHERE_ENTRY__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNullWhereEntryAccess().getAliasFromEntryIDTerminalRuleCall_0_0_1(), semanticObject.getAlias());
		feeder.accept(grammarAccess.getNullWhereEntryAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_2_0_1(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getNullWhereEntryAccess().getOperatorBooleanOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] reference=[EReference|ID] rightAlias=[FromEntry|ID])
	 */
	protected void sequence_ReferenceAliasWhereEntry(EObject context, ReferenceAliasWhereEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.REFERENCE_ALIAS_WHERE_ENTRY__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.REFERENCE_ALIAS_WHERE_ENTRY__ALIAS));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.REFERENCE_ALIAS_WHERE_ENTRY__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.REFERENCE_ALIAS_WHERE_ENTRY__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.REFERENCE_ALIAS_WHERE_ENTRY__RIGHT_ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.REFERENCE_ALIAS_WHERE_ENTRY__RIGHT_ALIAS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceAliasWhereEntryAccess().getAliasFromEntryIDTerminalRuleCall_0_0_1(), semanticObject.getAlias());
		feeder.accept(grammarAccess.getReferenceAliasWhereEntryAccess().getReferenceEReferenceIDTerminalRuleCall_2_0_1(), semanticObject.getReference());
		feeder.accept(grammarAccess.getReferenceAliasWhereEntryAccess().getRightAliasFromEntryIDTerminalRuleCall_4_0_1(), semanticObject.getRightAlias());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (uris+=STRING uris+=STRING*)
	 */
	protected void sequence_ResourceScope(EObject context, ResourceScope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (notIn?='not'? scope=Scope)
	 */
	protected void sequence_ScopeClause(EObject context, ScopeClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (select=[FromEntry|ID] attribute=[EAttribute|ID]?)
	 */
	protected void sequence_SelectEntry(EObject context, SelectEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] attribute=[EAttribute|ID] operator=StringOperator pattern=STRING)
	 */
	protected void sequence_StringAttributeWhereEntry(EObject context, StringAttributeWhereEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ALIAS));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.STRING_ATTRIBUTE_WHERE_ENTRY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.STRING_ATTRIBUTE_WHERE_ENTRY__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.STRING_ATTRIBUTE_WHERE_ENTRY__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.STRING_ATTRIBUTE_WHERE_ENTRY__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringAttributeWhereEntryAccess().getAliasFromEntryIDTerminalRuleCall_0_0_1(), semanticObject.getAlias());
		feeder.accept(grammarAccess.getStringAttributeWhereEntryAccess().getAttributeEAttributeIDTerminalRuleCall_2_0_1(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getStringAttributeWhereEntryAccess().getOperatorStringOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getStringAttributeWhereEntryAccess().getPatternSTRINGTerminalRuleCall_4_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] reference=[EReference|ID] notIn?='not'? subQuery=MQLquery)
	 */
	protected void sequence_SubselectWhereEntry(EObject context, SubselectWhereEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alias=[FromEntry|ID] attribute=[EAttribute|ID] operator=NumericOperator rightAlias=[FromEntry|ID] rightAttribute=[EAttribute|ID])
	 */
	protected void sequence_VariableWhereEntry(EObject context, VariableWhereEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ALIAS));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.ATTRIBUTE_WHERE_ENTRY__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.VARIABLE_WHERE_ENTRY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.VARIABLE_WHERE_ENTRY__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.VARIABLE_WHERE_ENTRY__RIGHT_ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.VARIABLE_WHERE_ENTRY__RIGHT_ALIAS));
			if(transientValues.isValueTransient(semanticObject, Bug287941TestLanguagePackage.Literals.VARIABLE_WHERE_ENTRY__RIGHT_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug287941TestLanguagePackage.Literals.VARIABLE_WHERE_ENTRY__RIGHT_ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableWhereEntryAccess().getAliasFromEntryIDTerminalRuleCall_0_0_1(), semanticObject.getAlias());
		feeder.accept(grammarAccess.getVariableWhereEntryAccess().getAttributeEAttributeIDTerminalRuleCall_2_0_1(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getVariableWhereEntryAccess().getOperatorNumericOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getVariableWhereEntryAccess().getRightAliasFromEntryIDTerminalRuleCall_4_0_1(), semanticObject.getRightAlias());
		feeder.accept(grammarAccess.getVariableWhereEntryAccess().getRightAttributeEAttributeIDTerminalRuleCall_6_0_1(), semanticObject.getRightAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=WhereEntry_OrWhereEntry_1_0 entries+=AndWhereEntry+)
	 */
	protected void sequence_WhereEntry(EObject context, OrWhereEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
