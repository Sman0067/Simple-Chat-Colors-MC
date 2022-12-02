package me.sman.simplechatcolors;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ColorHelp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (sender instanceof Player){

            Player player = (Player) sender;

            player.sendMessage(

                "Available Colors: " + "\n" +
                ChatColor.RED + "red" + "\n" +
                ChatColor.BLUE + "blue" + "\n" +
                ChatColor.YELLOW + "yellow" + "\n" +
                ChatColor.GOLD + "gold" + "\n" +
                ChatColor.DARK_PURPLE + "purple" + "\n" +
                ChatColor.LIGHT_PURPLE + "pink" + "\n" +
                ChatColor.GREEN + "green" + "\n" +
                ChatColor.DARK_GREEN + "darkgreen" + "\n" +
                ChatColor.AQUA + "aqua" + "\n" +
                ChatColor.DARK_AQUA + "darkaqua" + "\n" +
                ChatColor.DARK_RED + "darkred" + "\n" +
                ChatColor.DARK_BLUE + "darkblue" + "\n" +
                ChatColor.DARK_GRAY + "darkgray"

            );

        }

        return true;

    }

}
