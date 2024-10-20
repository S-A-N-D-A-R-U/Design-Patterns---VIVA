package singleton;

public class Configuration {
    private static Configuration instance;
    private String setting1;
    private String setting2;

    // Private constructor to prevent instantiation
    private Configuration() {
        // Load configuration settings from a file or environment variables
        setting1 = "Value1";
        setting2 = "Value2";
    }

    // Public method to provide access to the instance
    public static synchronized Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    // Getter methods for configuration settings
    public String getSetting1() {
        return setting1;
    }

    public String getSetting2() {
        return setting2;
    }
}
