/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.common.types;

import org.eclipse.xtext.common.types.access.ClasspathTypeProviderFactory;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.common.types.xtext.ClasspathBasedTypeScopeProvider;
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.service.DefaultRuntimeModule;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @since 2.8
 */
public class DefaultCommonTypesRuntimeModule extends DefaultRuntimeModule {

	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}

	public TypesFactory bindTypesFactoryToInstance() {
		return TypesFactory.eINSTANCE;
	}

	public Class<? extends IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
		return ClasspathTypeProviderFactory.class;
	}

	public Class<? extends AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
		return ClasspathBasedTypeScopeProvider.class;
	}

	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return TypesAwareDefaultGlobalScopeProvider.class;
	}
}
