package serviceorphanage;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration orphanageServiceRegistration;


	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Orphanage(Publisher) Service Starting...");
		ServiceOrphanage serviceOrphanage = new ServiceOrphanageImpl();
		orphanageServiceRegistration = bundleContext.registerService(
				ServiceOrphanage.class.getName(), serviceOrphanage, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Orphanage Service Stopping.");
		orphanageServiceRegistration.unregister();
	}

}
