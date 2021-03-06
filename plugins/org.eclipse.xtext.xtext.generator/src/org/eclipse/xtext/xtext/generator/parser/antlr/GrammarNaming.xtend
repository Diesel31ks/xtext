/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.parser.antlr

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.TypeReference

import static extension org.eclipse.xtext.GrammarUtil.*

@Singleton
class GrammarNaming {

	@Inject
	extension XtextGeneratorNaming

	def TypeReference getGrammarClass(Grammar it, String prefix) {
		new TypeReference(parserPackage, '''«prefix»Internal«simpleName»''')
	}

	def TypeReference getInternalParserClassName(Grammar it) {
		new TypeReference(parserPackage, '''Internal«simpleName»Parser''')
	}

	def String getParserPackage(Grammar it) '''«runtimeBasePackage».idea.parser.antlr.internal'''

}
