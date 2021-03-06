/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.generator.normalization;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.RuleNames;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.generator.normalization.FlattenedGrammarAccess;
import org.eclipse.xtext.generator.normalization.RuleFilter;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class GrammarFlatteningTest extends AbstractXtextTests {
  @Override
  public void setUp() throws Exception {
    super.setUp();
    this.with(XtextStandaloneSetup.class);
  }
  
  @Override
  public Grammar getModel(final String model) throws Exception {
    return this.getModel(model, false);
  }
  
  public Grammar getModel(final String model, final boolean dropUnreachable) throws Exception {
    EObject _model = super.getModel(model);
    Grammar grammar = ((Grammar) _model);
    RuleNames ruleNames = RuleNames.getRuleNames(grammar, false);
    RuleFilter filter = new RuleFilter();
    filter.setDiscardUnreachableRules(dropUnreachable);
    FlattenedGrammarAccess _flattenedGrammarAccess = new FlattenedGrammarAccess(grammar, ruleNames, filter);
    Grammar result = _flattenedGrammarAccess.getFlattenedGrammar();
    XtextResource resource = this.<XtextResource>get(XtextResource.class);
    EList<EObject> _contents = resource.getContents();
    _contents.add(result);
    URI _createURI = URI.createURI("synthetic://flattened.xtext");
    resource.setURI(_createURI);
    return result;
  }
  
  @Test
  public void test_01() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule: name=ID;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString());
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("ruleRule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
  
  @Test
  public void test_02() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule: name=ID;");
    _builder.newLine();
    _builder.append("terminal ID: super;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString());
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("ruleRule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("SUPER_ID;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal fragment SUPER_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
  
  @Test
  public void test_03() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule<A, B>: <A> name=ID | <!B> name=ID | name=STRING;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString());
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm0_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID | name=RULE_STRING;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm1_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID | name=RULE_ID | name=RULE_STRING;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm2_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_STRING;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm3_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID | name=RULE_STRING;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
  
  @Test
  public void test_04() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule<A>: name=ID child=Rule<A>?;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString());
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm0_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID child=norm0_Rule?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm1_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID child=norm1_Rule?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
  
  @Test
  public void test_05() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule<A>: name=ID (<A>child=Rule<A>|<!A>child=Rule<true>+)?;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString());
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm0_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID child=norm1_Rule*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm1_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID child=norm1_Rule?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
  
  @Test
  public void test_06() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule<A>: name=ID (<A>child=Rule<!A>)?;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString());
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm0_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm1_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID child=norm0_Rule?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
  
  @Test
  public void test_07() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule<A>: name=ID (<A>child=Rule<!A>)?;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString(), true);
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm0_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
  
  @Test
  public void test_08() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule<A>: name=ID =>(<A> ->child=Rule<!A> | <!A> ->\'keyword\')?;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString(), true);
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm0_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID => \"keyword\"?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
  
  @Test
  public void test_09() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grammar com.foo.bar with org.eclipse.xtext.common.Terminals");
    _builder.newLine();
    _builder.append("generate myPack \'http://myURI\'");
    _builder.newLine();
    _builder.append("Rule<A>: name=ID ->(<A> =>child=Rule<!A> | <!A> =>\'keyword\')?;");
    _builder.newLine();
    Grammar flattened = this.getModel(_builder.toString(), true);
    ISerializer _serializer = this.getSerializer();
    String serialized = _serializer.serialize(flattened);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("grammar com.foo.bar hidden(RULE_WS, RULE_ML_COMMENT, RULE_SL_COMMENT)");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("norm0_Rule:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("name=RULE_ID => \"keyword\"?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ID:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"^\"? (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\") (\"a\"..\"z\" | \"A\"..\"Z\" | \"_\" | \"0\"..\"9\")*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_INT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"0\"..\"9\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_STRING:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"\\\"\" (\"\\\\\" . | !(\"\\\\\" | \"\\\"\"))* \"\\\"\" | \"\\\'\" (\"\\\\\" . | !(\"\\\\\" | \"\\\'\"))* \"\\\'\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ML_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"/*\"->\"*/\";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_SL_COMMENT:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\"//\" !(\"\\n\" | \"\\r\")* (\"\\r\"? \"\\n\")?;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_WS:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("\" \" | \"\\t\" | \"\\r\" | \"\\n\"+;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("terminal RULE_ANY_OTHER:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(".;");
    String _string = _builder_1.toString();
    Assert.assertEquals(_string, serialized);
  }
}
