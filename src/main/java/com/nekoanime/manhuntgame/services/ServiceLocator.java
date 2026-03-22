package com.nekoanime.manhuntgame.services;

import com.nekoanime.manhuntgame.game.GameManager;
import com.nekoanime.manhuntgame.lobby.LobbyManager;
import com.nekoanime.manhuntgame.registry.GameRegistry;
import com.nekoanime.manhuntgame.ui.ActionBarService;
import org.bukkit.plugin.Plugin;

public class ServiceLocator {
    private final GameRegistry gameRegistry;
    private final ActionBarService actionBarService;
    private final LobbyManager lobbyManager;
    private final GameManager gameManager;

    public ServiceLocator(Plugin plugin) {
        this.gameManager = new GameManager();
        this.gameRegistry = new GameRegistry();
        this.actionBarService = new ActionBarService();
        this.lobbyManager = new LobbyManager();
    }
    public GameRegistry getGameRegistry() {return gameRegistry;}
    public ActionBarService getActionBarService() {return actionBarService;}
    public LobbyManager getLobbyManager() {return lobbyManager;}
    public GameManager getGameManager() {return gameManager;}
}
