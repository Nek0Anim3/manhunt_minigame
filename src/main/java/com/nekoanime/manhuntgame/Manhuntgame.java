package com.nekoanime.manhuntgame;

import com.nekoanime.manhuntgame.services.ServiceLocator;
import org.bukkit.plugin.java.JavaPlugin;

public class Manhuntgame extends JavaPlugin {
    private ServiceLocator services;

    @Override
    public void onEnable() {
        services = new ServiceLocator(this);
    }


    public ServiceLocator getServices() {return services;}

}
