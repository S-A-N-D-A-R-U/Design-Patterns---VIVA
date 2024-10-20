package singleton;

public class Main {
    public static void main(String[] args) {
        Configuration config1 = Configuration.getInstance();
        System.out.println("Setting1: " + config1.getSetting1());
        System.out.println("Setting2: " + config1.getSetting2());

        Configuration config2 = Configuration.getInstance();
        System.out.println("Setting1: " + config2.getSetting1());
        System.out.println("Setting2: " + config2.getSetting2());

        // Verify that config1 and config2 are the same instance
        System.out.println("config1 and config2 are the same instance: " + (config1 == config2));
    }
}
