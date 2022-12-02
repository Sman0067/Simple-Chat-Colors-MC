package me.sman.simplechatcolors;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class ChatColor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (sender instanceof Player){

            Player player = (Player) sender;
            org.bukkit.ChatColor messageColor;

            if (args.length < 2){
                return false;
            }

            switch (args[0]){

                case "red":
                    messageColor = org.bukkit.ChatColor.RED;
                    break;
                case "blue":
                    messageColor = org.bukkit.ChatColor.BLUE;
                    break;
                case "yellow":
                    messageColor = org.bukkit.ChatColor.YELLOW;
                    break;
                case "gold":
                    messageColor = org.bukkit.ChatColor.GOLD;
                    break;
                case "purple":
                    messageColor = org.bukkit.ChatColor.DARK_PURPLE;
                    break;
                case "pink":
                    messageColor = org.bukkit.ChatColor.LIGHT_PURPLE;
                    break;
                case "green":
                    messageColor = org.bukkit.ChatColor.GREEN;
                    break;
                case "darkgreen":
                    messageColor = org.bukkit.ChatColor.DARK_GREEN;
                    break;
                case "aqua":
                    messageColor = org.bukkit.ChatColor.AQUA;
                    break;
                case "darkaqua":
                    messageColor = org.bukkit.ChatColor.DARK_AQUA;
                    break;
                case "darkred":
                    messageColor = org.bukkit.ChatColor.DARK_RED;
                    break;
                case "darkblue":
                    messageColor = org.bukkit.ChatColor.DARK_BLUE;
                    break;
                case "darkgray":
                    messageColor = org.bukkit.ChatColor.DARK_GRAY;
                    break;
                default:
                    return false;

            }

            StringBuilder message = new StringBuilder();

            for (int i=1; i<args.length; i++){
                message.append(args[i] + " ");
            }

            player.chat(messageColor + "" + message);
        }

        return true;
    }


}
