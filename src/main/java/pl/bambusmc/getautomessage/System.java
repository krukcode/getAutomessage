package pl.bambusmc.getautomessage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class System {

    static Main plugin;

    public System(Main m) {
        plugin = m;
    }

    public static void start() {
        new BukkitRunnable() {
            int i = 0;
            List<String> Messages = plugin.getConfig().getStringList("messages");
            String prefix = plugin.getConfig().getString("prefix");

            public void run() {
               if(i < Messages.size()) {
                   for(Player players : Bukkit.getOnlinePlayers()) {
                       players.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + Messages.get(i)));
                   }
                   i++;
               } else {
                   i = 0;
               }
            }
        }.runTaskTimer(plugin, 20L * plugin.getConfig().getInt("time"), 20L * plugin.getConfig().getInt("time"));
    }
}
