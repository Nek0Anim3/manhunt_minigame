package com.nekoanime.manhuntgame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandManager implements CommandExecutor {

    public final JavaPlugin plugin;
    public CommandManager(JavaPlugin plugin) {this.plugin = plugin;}


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (!label.equalsIgnoreCase("manhunt")) {
                return false;
            }
            if (args[0].equalsIgnoreCase("create")) {

                sender.sendMessage("Created lobby");
                return true;
            }
            if (args[0].equalsIgnoreCase("leave")) {

                sender.sendMessage("Leaving lobby");
                return true;
            }
        }
        return false;
    }

}
