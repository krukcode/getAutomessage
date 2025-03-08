package pl.bambusmc.getautomessage;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Main extends JavaPlugin {
    public static Main main;

    public void onEnable() {

        getLogger().log(Level.INFO, "Starting plugin...");
        getConfig().options().copyDefaults(true);
        saveConfig();
        getLogger().log(Level.INFO, "Config loaded.");

        main = this;

        new System(this);
        getLogger().log(Level.INFO, "AutoMessage system created.");

        System.start();
        getLogger().log(Level.INFO, "AutoMessage system started.");
        getLogger().log(Level.INFO, "Plugin loaded!");
    }

    public static Main getMain() {
        return main;
    }
}
