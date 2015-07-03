/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.build;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.build.BuildRequest;
import org.eclipse.xtext.build.Source2GeneratedMapping;
import org.eclipse.xtext.index.IndexTestLanguageInjectorProvider;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.build.AbstractIncrementalBuilderTest;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@RunWith(XtextRunner.class)
@InjectWith(IndexTestLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class IncrementalBuilderTest extends AbstractIncrementalBuilderTest {
  @Inject
  private IResourceServiceProvider.Registry resourceServiceProviderFactory;
  
  @Override
  public IResourceServiceProvider.Registry getLanguages() {
    return this.resourceServiceProviderFactory;
  }
  
  @Test
  public void testSimpleFullBuild() {
    final Procedure1<BuildRequest> _function = new Procedure1<BuildRequest>() {
      @Override
      public void apply(final BuildRequest it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("foo {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("entity B {}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("entity A { foo.B myReference }");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        URI _minus = IncrementalBuilderTest.this.operator_minus(
          "src/MyFile.indextestlanguage", _builder.toString());
        it.setDirtyFiles(Collections.<URI>unmodifiableList(CollectionLiterals.<URI>newArrayList(_minus)));
      }
    };
    final BuildRequest buildRequest = this.newBuildRequest(_function);
    this.build(buildRequest);
    String _string = this.issues.toString();
    boolean _isEmpty = this.issues.isEmpty();
    Assert.assertTrue(_string, _isEmpty);
    int _size = this.generated.size();
    Assert.assertEquals(2, _size);
    Collection<URI> _values = this.generated.values();
    boolean _containsSuffix = this.containsSuffix(_values, "src-gen/B.txt");
    Assert.assertTrue(_containsSuffix);
    Collection<URI> _values_1 = this.generated.values();
    boolean _containsSuffix_1 = this.containsSuffix(_values_1, "src-gen/A.txt");
    Assert.assertTrue(_containsSuffix_1);
  }
  
  @Test
  public void testDelete_01() {
    final Procedure1<BuildRequest> _function = new Procedure1<BuildRequest>() {
      @Override
      public void apply(final BuildRequest it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("foo {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("entity A {foo.B references}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        URI _minus = IncrementalBuilderTest.this.operator_minus(
          "src/A.indextestlanguage", _builder.toString());
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("foo {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("entity B");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        URI _minus_1 = IncrementalBuilderTest.this.operator_minus(
          "src/B.indextestlanguage", _builder_1.toString());
        it.setDirtyFiles(Collections.<URI>unmodifiableList(CollectionLiterals.<URI>newArrayList(_minus, _minus_1)));
      }
    };
    BuildRequest _newBuildRequest = this.newBuildRequest(_function);
    this.build(_newBuildRequest);
    final AtomicBoolean validateCalled = new AtomicBoolean(false);
    final Procedure1<BuildRequest> _function_1 = new Procedure1<BuildRequest>() {
      @Override
      public void apply(final BuildRequest it) {
        URI _uri = IncrementalBuilderTest.this.uri("src/B.indextestlanguage");
        it.setDeletedFiles(Collections.<URI>unmodifiableList(CollectionLiterals.<URI>newArrayList(_uri)));
        final BuildRequest.IPostValidationCallback _function = new BuildRequest.IPostValidationCallback() {
          @Override
          public boolean afterValidate(final Resource uri, final Iterable<Issue> issues) {
            URI _uri = IncrementalBuilderTest.this.uri("src/A.indextestlanguage");
            Assert.assertEquals(_uri, uri);
            String _string = issues.toString();
            Issue _head = IterableExtensions.<Issue>head(issues);
            String _message = _head.getMessage();
            boolean _contains = _message.contains("Couldn\'t resolve reference to Type \'foo.B\'");
            Assert.assertTrue(_string, _contains);
            validateCalled.set(true);
            return false;
          }
        };
        it.setAfterValidate(_function);
      }
    };
    BuildRequest _newBuildRequest_1 = this.newBuildRequest(_function_1);
    this.build(_newBuildRequest_1);
    boolean _get = validateCalled.get();
    Assert.assertTrue(_get);
  }
  
  @Test
  public void testIncrementalBuild() {
    final Procedure1<BuildRequest> _function = new Procedure1<BuildRequest>() {
      @Override
      public void apply(final BuildRequest it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("foo {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("entity A {foo.B reference}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        URI _minus = IncrementalBuilderTest.this.operator_minus(
          "src/A.indextestlanguage", _builder.toString());
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("foo {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("entity B {foo.A reference}");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        URI _minus_1 = IncrementalBuilderTest.this.operator_minus(
          "src/B.indextestlanguage", _builder_1.toString());
        it.setDirtyFiles(Collections.<URI>unmodifiableList(CollectionLiterals.<URI>newArrayList(_minus, _minus_1)));
      }
    };
    BuildRequest _newBuildRequest = this.newBuildRequest(_function);
    this.build(_newBuildRequest);
    String _string = this.issues.toString();
    boolean _isEmpty = this.issues.isEmpty();
    Assert.assertTrue(_string, _isEmpty);
    int _size = this.generated.size();
    Assert.assertEquals(2, _size);
    Collection<URI> _values = this.generated.values();
    boolean _containsSuffix = this.containsSuffix(_values, "src-gen/B.txt");
    Assert.assertTrue(_containsSuffix);
    Collection<URI> _values_1 = this.generated.values();
    boolean _containsSuffix_1 = this.containsSuffix(_values_1, "src-gen/A.txt");
    Assert.assertTrue(_containsSuffix_1);
    final Procedure1<BuildRequest> _function_1 = new Procedure1<BuildRequest>() {
      @Override
      public void apply(final BuildRequest it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("foo {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("entity A {foo.B reference}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        URI _minus = IncrementalBuilderTest.this.operator_minus(
          "src/A.indextestlanguage", _builder.toString());
        it.setDirtyFiles(Collections.<URI>unmodifiableList(CollectionLiterals.<URI>newArrayList(_minus)));
      }
    };
    BuildRequest _newBuildRequest_1 = this.newBuildRequest(_function_1);
    this.build(_newBuildRequest_1);
    String _string_1 = this.issues.toString();
    boolean _isEmpty_1 = this.issues.isEmpty();
    Assert.assertTrue(_string_1, _isEmpty_1);
    int _size_1 = this.generated.size();
    Assert.assertEquals(1, _size_1);
    Collection<URI> _values_2 = this.generated.values();
    boolean _containsSuffix_2 = this.containsSuffix(_values_2, "src-gen/B.txt");
    Assert.assertFalse(_containsSuffix_2);
    Collection<URI> _values_3 = this.generated.values();
    boolean _containsSuffix_3 = this.containsSuffix(_values_3, "src-gen/A.txt");
    Assert.assertTrue(_containsSuffix_3);
    final Procedure1<BuildRequest> _function_2 = new Procedure1<BuildRequest>() {
      @Override
      public void apply(final BuildRequest it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("foo {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("entity X { foo.B reference }");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        URI _minus = IncrementalBuilderTest.this.operator_minus(
          "src/A.indextestlanguage", _builder.toString());
        it.setDirtyFiles(Collections.<URI>unmodifiableList(CollectionLiterals.<URI>newArrayList(_minus)));
      }
    };
    BuildRequest _newBuildRequest_2 = this.newBuildRequest(_function_2);
    this.build(_newBuildRequest_2);
    String _string_2 = this.issues.toString();
    int _size_2 = this.issues.size();
    Assert.assertEquals(_string_2, 1, _size_2);
    int _size_3 = this.generated.size();
    Assert.assertEquals(1, _size_3);
    Collection<URI> _values_4 = this.generated.values();
    boolean _containsSuffix_4 = this.containsSuffix(_values_4, "src-gen/B.txt");
    Assert.assertFalse(_containsSuffix_4);
    Collection<URI> _values_5 = this.generated.values();
    boolean _containsSuffix_5 = this.containsSuffix(_values_5, "src-gen/X.txt");
    Assert.assertTrue(_containsSuffix_5);
    Source2GeneratedMapping _fileMappings = this.indexState.getFileMappings();
    URI _uri = this.uri("src/A.indextestlanguage");
    Iterable<URI> _generated = _fileMappings.getGenerated(_uri);
    int _size_4 = IterableExtensions.size(_generated);
    Assert.assertEquals(1, _size_4);
    int _size_5 = this.deleted.size();
    Assert.assertEquals(1, _size_5);
    boolean _containsSuffix_6 = this.containsSuffix(this.deleted, "src-gen/A.txt");
    Assert.assertTrue(_containsSuffix_6);
    final Procedure1<BuildRequest> _function_3 = new Procedure1<BuildRequest>() {
      @Override
      public void apply(final BuildRequest it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("foo {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("entity A { foo.B reference }");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        URI _minus = IncrementalBuilderTest.this.operator_minus(
          "src/A.indextestlanguage", _builder.toString());
        it.setDirtyFiles(Collections.<URI>unmodifiableList(CollectionLiterals.<URI>newArrayList(_minus)));
      }
    };
    BuildRequest _newBuildRequest_3 = this.newBuildRequest(_function_3);
    this.build(_newBuildRequest_3);
    String _string_3 = this.issues.toString();
    boolean _isEmpty_2 = this.issues.isEmpty();
    Assert.assertTrue(_string_3, _isEmpty_2);
    int _size_6 = this.generated.size();
    Assert.assertEquals(2, _size_6);
    Collection<URI> _values_6 = this.generated.values();
    boolean _containsSuffix_7 = this.containsSuffix(_values_6, "src-gen/B.txt");
    Assert.assertTrue(_containsSuffix_7);
    Collection<URI> _values_7 = this.generated.values();
    boolean _containsSuffix_8 = this.containsSuffix(_values_7, "src-gen/A.txt");
    Assert.assertTrue(_containsSuffix_8);
    boolean _containsSuffix_9 = this.containsSuffix(this.deleted, "src-gen/X.txt");
    Assert.assertTrue(_containsSuffix_9);
    final Procedure1<BuildRequest> _function_4 = new Procedure1<BuildRequest>() {
      @Override
      public void apply(final BuildRequest it) {
        URI _uri = IncrementalBuilderTest.this.uri("src/A.indextestlanguage");
        URI _delete = IncrementalBuilderTest.this.delete(_uri);
        it.setDeletedFiles(Collections.<URI>unmodifiableList(CollectionLiterals.<URI>newArrayList(_delete)));
      }
    };
    BuildRequest _newBuildRequest_4 = this.newBuildRequest(_function_4);
    this.build(_newBuildRequest_4);
    String _string_4 = this.issues.toString();
    int _size_7 = this.issues.size();
    Assert.assertEquals(_string_4, 1, _size_7);
    int _size_8 = this.generated.size();
    Assert.assertEquals(0, _size_8);
    int _size_9 = this.deleted.size();
    Assert.assertEquals(1, _size_9);
    boolean _containsSuffix_10 = this.containsSuffix(this.deleted, "src-gen/A.txt");
    Assert.assertTrue(_containsSuffix_10);
  }
}
