package me.sman.simplechatcolors;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){

        getLogger().info("Simple Chat Colors Loaded Successfully!");

        getServer().getPluginCommand("color").setExecutor(new ChatColor());
        getServer().getPluginCommand("colorlist").setExecutor(new ColorHelp());
    }

    @Override
    public void onDisable(){

        getLogger().info("Simple Chat Colors Shut Down Successfully.");

    }

}
