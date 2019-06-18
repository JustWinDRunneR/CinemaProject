package cinemaproject.justwindrunner.com.github.util;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class QueriesManager {

    private static final Logger LOGGER = Logger.getLogger(QueriesManager.class.getSimpleName());

    public static Properties getProperties(String forWhom) {
        LOGGER.info("Method getProperties start with parameter: " + forWhom);

        String pathToProperties = "queries/" + forWhom + "/queries.properties";

        LOGGER.info("Generated path: " + pathToProperties);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        Properties properties = new Properties();

        try (InputStream resourceStream = loader.getResourceAsStream(pathToProperties)) {
            properties.load(resourceStream);
            LOGGER.info("Properties has been loaded");
        } catch (IOException e) {
            LOGGER.error("Method getProperties caught IOException");
            LOGGER.trace(e);
        }

        LOGGER.info("Method getProperties returns: " + properties);

        return properties;

    }
}
