package com.nekoanime.manhuntgame;
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
        getCommand("manhunt").setExecutor(commandManager);
    }


}
