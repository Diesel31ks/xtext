/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

define([], function() {
	
	/**
	 * An editor context mediates between the Xtext services and the CodeMirror editor framework.
	 */
	function CodeMirrorEditorContext(editor) {
		this._editor = editor;
		this._serverState = {};
		this._serverStateListeners = [];
		this._clean = true;
		this._dirtyStateListeners = [];
	};

	CodeMirrorEditorContext.prototype = {
		
		getServerState: function() {
			return this._serverState;
		},
		
		updateServerState: function(currentText, currentStateId) {
			this._serverState.text = currentText;
			this._serverState.stateId = currentStateId;
			return this._serverStateListeners;
		},
		
		addServerStateListener: function(listener) {
			this._serverStateListeners.push(listener);
		},
		
		getCaretOffset: function() {
			var editor = this._editor;
			return editor.indexFromPos(editor.getCursor());
		},
		
		getLineStart: function(lineNumber) {
			var editor = this._editor;
			return editor.indexFromPos({line: lineNumber, ch: 0});
		},
		
		getSelection: function() {
			var editor = this._editor;
        	return {
        		start: editor.indexFromPos(editor.getCursor('from')),
        		end: editor.indexFromPos(editor.getCursor('to'))
        	};
		},
		
		getText: function(start, end) {
			var editor = this._editor;
			if (start && end) {
				return editor.getRange(editor.posFromIndex(start), editor.posFromIndex(end));
			} else {
				return editor.getValue();
			}
		},
		
		isDirty: function() {
			return !this._clean;
		},
		
		markClean: function(clean) {
			if (clean != this._clean) {
				for (var i = 0; i < this._dirtyStateListeners.length; i++) {
					this._dirtyStateListeners[i](clean);
				}
			}
			this._clean = clean;
		},
		
		addDirtyStateListener: function(listener) {
			this._dirtyStateListeners.push(listener);
		},
		
		clearUndoStack: function() {
			this._editor.clearHistory();
		},
		
		setCaretOffset: function(offset) {
			var editor = this._editor;
			editor.setCursor(editor.posFromIndex(offset));
		},
		
		setSelection: function(selection) {
			var editor = this._editor;
			editor.setSelection(editor.posFromIndex(selection.start), editor.posFromIndex(selection.end));
		},
		
		setText: function(text, start, end) {
			var editor = this._editor;
			if (!start)
				start = 0;
			if (!end)
				end = editor.getValue().length;
			var cursor = editor.getCursor();
			editor.replaceRange(text, editor.posFromIndex(start), editor.posFromIndex(end));
			editor.setCursor(cursor);
		}
		
	};
	
	return CodeMirrorEditorContext;
});