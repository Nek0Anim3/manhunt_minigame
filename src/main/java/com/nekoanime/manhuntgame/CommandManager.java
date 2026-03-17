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
            Player player = (Player) sender;

        }
        return true;
    }

}
