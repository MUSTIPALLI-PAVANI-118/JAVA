enum ConfigManager {
    INSTANCE;

    private String appName = "MyApp";
    private int version = 1;

    void printConfig() {
        System.out.println(appName + " v" + version);
    }

    void updateVersion(int version) {
        this.version = version;
    }
}

public class EnumSingleton {
    public static void main(String[] args) {
        ConfigManager.INSTANCE.printConfig();
        ConfigManager.INSTANCE.updateVersion(2);
        ConfigManager.INSTANCE.printConfig();

        // Same instance everywhere
        System.out.println(ConfigManager.INSTANCE == ConfigManager.INSTANCE);
    }
}
