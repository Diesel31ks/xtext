package org.eclipse.xtext.testlanguages.backtracking.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.SemanticHighlightVisitor;
import org.eclipse.xtext.testlanguages.backtracking.idea.lang.ExBeeLangTestLanguageLanguage;

public class ExBeeLangTestLanguageSemanticHighlightVisitor extends SemanticHighlightVisitor {
	public ExBeeLangTestLanguageSemanticHighlightVisitor() {
		ExBeeLangTestLanguageLanguage.INSTANCE.injectMembers(this);
	}
}
