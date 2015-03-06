package basaki.togglz;

import java.io.File;

import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

/**
 * 
 * <tt>ToggleConfiguration</tt> contains all the information in regards to
 * Togglz configuration including the feature enum to be used, how the feature
 * state is persisted, and the way to obtain the current user.
 * <p/>
 * 
 * @author Indra Basak
 * 
 */
@Component
public class ToggleConfiguration implements TogglzConfig {

	/**
	 * Retrieves the Togglz feature enum to be used.
	 * 
	 * @return the feature enum, <tt>CustomerFeatures</tt>
	 */
	public Class<? extends Feature> getFeatureClass() {
		return CustomerFeatures.class;
	}

	/**
	 * Retrieves the persistence repository to be used by Togglz to save the
	 * feature state.
	 * 
	 * @return the repository used for storing Togglz feature state
	 */
	public StateRepository getStateRepository() {
		// return new InMemoryStateRepository();
		return new FileBasedStateRepository(
				new File("/tmp/features.properties"));
	}

	/**
	 * Retrieves the user provider used for logging on to Togglz console. This
	 * method is only only called once by Togglz.
	 * 
	 * @return the feature user provider
	 */
	public UserProvider getUserProvider() {
		return new UserProvider() {
			public FeatureUser getCurrentUser() {
				return new SimpleFeatureUser("admin", true);
			}
		};
	}
}
