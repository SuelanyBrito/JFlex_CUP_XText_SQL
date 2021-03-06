/*
 * generated by Xtext 2.23.0
 */
package mydsl.ui;

import com.google.inject.Injector;
import mydsl.ui.internal.MydslActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MydslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MydslActivator activator = MydslActivator.getInstance();
		return activator != null ? activator.getInjector(MydslActivator.MYDSL_MYDSL) : null;
	}

}
