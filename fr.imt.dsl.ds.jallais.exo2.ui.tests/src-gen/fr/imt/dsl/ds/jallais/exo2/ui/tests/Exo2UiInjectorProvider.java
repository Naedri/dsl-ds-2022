/*
 * generated by Xtext 2.28.0
 */
package fr.imt.dsl.ds.jallais.exo2.ui.tests;

import com.google.inject.Injector;
import fr.imt.dsl.ds.jallais.exo2.ui.internal.Exo2Activator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class Exo2UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Exo2Activator.getInstance().getInjector("fr.imt.dsl.ds.jallais.exo2.Exo2");
	}

}