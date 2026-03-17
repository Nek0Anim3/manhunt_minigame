package com.nekoanime.manhuntgame;
import com.nekoanime.manhuntgame.CommandManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Manhuntgame extends JavaPlugin {
    private static Manhuntgame instance;

    public static Manhuntgame getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;

        CommandManager commandManager = new CommandManager(this);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
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
        return false;
    }
}
