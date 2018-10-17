package helpers;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

public class ConfigManager {
    public static String getConfig(String configString) throws ConfigurationException {
        CompositeConfiguration config = new CompositeConfiguration();

        config.addConfiguration(new SystemConfiguration());
        config.addConfiguration(new PropertiesConfiguration("application.properties"));

        return config.getString(configString);
    }
}
