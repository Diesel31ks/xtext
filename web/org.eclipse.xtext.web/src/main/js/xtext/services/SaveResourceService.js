/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

define(['xtext/services/XtextService', 'jquery'], function(XtextService, jQuery) {
	
	/**
	 * Service class for saving resources.
	 */
	function SaveResourceService(serverUrl, resourceId) {
		this.initialize(serverUrl, resourceId, 'save');
	};

	SaveResourceService.prototype = new XtextService();

	SaveResourceService.prototype._initServerData = function(serverData, editorContext, params) {
		return {
			httpMethod: 'POST'
		};
	};
	
	SaveResourceService.prototype._processResult = function(result, editorContext) {
		editorContext.markClean(true);
	};
	
	return SaveResourceService;
});