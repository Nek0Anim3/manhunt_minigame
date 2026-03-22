package com.nekoanime.manhuntgame;

import com.nekoanime.manhuntgame.services.ServiceLocator;
import com.nekoanime.manhuntgame.subcommands.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class CommandManager implements CommandExecutor, TabCompleter {

    private final Map<String, SubCommand> subcommands = new LinkedHashMap<>();

//    public CommandManager(ServiceLocator service);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (!label.equalsIgnoreCase("manhunt")) {
                return false;
            }
            if (args.length == 0) {
                sender.sendMessage("No argument provided!");
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
