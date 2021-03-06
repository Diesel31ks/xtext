/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.generator.parser.antlr.splitting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SimpleExpressionsRuntimeModule extends org.eclipse.xtext.generator.parser.antlr.splitting.AbstractSimpleExpressionsRuntimeModule {

	/**
	 * @since 2.9
	 */
	@Override
	public Class<? extends ISerializer> bindISerializer() {
		return Serializer.class;
	}
	
	/**
	 * @since 2.9
	 */
	public Class<? extends ISemanticNodeProvider> bindNodeProvider() {
		return NullProvider.class;
	}
	
	static class NullProvider implements ISemanticNodeProvider {

		@Override
		public INodesForEObjectProvider getNodesForSemanticObject(EObject semanticObject,
				ICompositeNode suggestedComposite) {
			return ISemanticNodeProvider.NULL_NODES_PROVIDER;
		}
		
	}
}
