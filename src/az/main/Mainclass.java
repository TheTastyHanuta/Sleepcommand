package az.main;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import az.commands.Sleepcommand;

public class Mainclass extends JavaPlugin {

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Sleepcommand activated!");
        this.getCommand("sleep").setExecutor(new Sleepcommand());
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Sleepcommand deactivated!");
    }
}
