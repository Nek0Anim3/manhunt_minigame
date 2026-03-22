package com.nekoanime.manhuntgame.subcommands;

import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

public interface SubCommand {
    void execute(Player player, String[] args);
    String getName();
    String getUsage();
    String getDesc();

    default int getMinArgs() {return 0;}
    default List<String> tabCompletion(Player player, String[] args) {
        return Collections.emptyList();
    }
}
