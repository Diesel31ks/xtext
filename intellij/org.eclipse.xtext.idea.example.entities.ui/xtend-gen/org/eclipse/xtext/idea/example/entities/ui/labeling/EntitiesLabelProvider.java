/**
 * generated by Xtext
 */
package org.eclipse.xtext.idea.example.entities.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class EntitiesLabelProvider extends XbaseLabelProvider {
  @Inject
  public EntitiesLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
