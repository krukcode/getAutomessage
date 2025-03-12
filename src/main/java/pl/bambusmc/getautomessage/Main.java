package pl.bambusmc.getautomessage;

import org.bukkit.plugin.java.JavaPlugin;
import pl.bambusmc.getautomessage.Utils.Util;

public final class Main extends JavaPlugin {
    public static Main main;

    public void onEnable() {

        main = this;

        Util.Setup(main, "b");

        Util.sendToConsole("&b\n\n" + " _  __ ____   _   _  _  __  ____   ___   ____   _____              _     _   _  _____   ___   __  __  ____    ____ \n" +
                "| |/ /|  _ \\ | | | || |/ / / ___| / _ \\ |  _ \\ | ____|            / \\   | | | ||_   _| / _ \\ |  \\/  |/ ___|  / ___|\n" +
                "| ' / | |_) || | | || ' / | |    | | | || | | ||  _|    _____    / _ \\  | | | |  | |  | | | || |\\/| |\\___ \\ | |  _ \n" +
                "| . \\ |  _ < | |_| || . \\ | |___ | |_| || |_| || |___  |_____|  / ___ \\ | |_| |  | |  | |_| || |  | | ___) || |_| |\n" +
                "|_|\\_\\|_| \\_\\ \\___/ |_|\\_\\ \\____| \\___/ |____/ |_____|         /_/   \\_\\ \\___/   |_|   \\___/ |_|  |_||____/  \\____|\n" +
                "                                                                                                                   " + "\n\n&eVersion: &7" + Util.getVersion() + "&7\n\n&aLoading plugin...");

        saveDefaultConfig();
        Util.sendToConsole("Config loaded!");

        new System(this);
        Util.sendToConsole("AutoMessage system loaded!");

        System.start();
        Util.sendToConsole("AutoMessage system started!");

        Util.sendToConsole("&aPlugin loaded!\n&e>> Plugin download: &7https://www.spigotmc.org/resources/getautomessage.123123/");
    }

    public static Main getMain() {
        return main;
    }
}
