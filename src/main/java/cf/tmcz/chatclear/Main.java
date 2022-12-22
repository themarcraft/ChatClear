package cf.tmcz.chatclear;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private Config config;
    public static String pre;
    private static Main instance;

    @Override
    public void onLoad() {
        instance = this;
        config = new Config();
    }

    @Override
    public void onEnable() {

        saveDefaultConfig();
        getCommand("ChatClear").setExecutor(new ChatClear());
        System.out.println("------------------");
        System.out.println("ChatClear von _TheMarCraft_");
        System.out.println("Aktiviert");
        System.out.println("------------------");

    }

    @Override
    public void onDisable() {
        System.out.println("------------------");
        System.out.println("ChatClear von _TheMarCraft_");
        System.out.println("Deaktiviert");
        System.out.println("------------------");
    }

    public static Main getInstance() {
        return instance;
    }

    public Config getConfiguration() {
        return config;
    }

}
