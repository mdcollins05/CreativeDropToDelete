package com.blockmovers.plugins.creativedroptodelete;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CreativeDropToDelete extends JavaPlugin {
    
    static final Logger log = Logger.getLogger("Minecraft"); //set up our logger
    
    @Override
    public void onEnable() {
        PluginDescriptionFile pdffile = this.getDescription();
        PluginManager pm = this.getServer().getPluginManager(); //the plugin object which allows us to add listeners later on

        pm.registerEvents(new Listeners(this), this);

        log.info(pdffile.getName() + " version " + pdffile.getVersion() + " is enabled.");
    }

    @Override
    public void onDisable() {
        PluginDescriptionFile pdffile = this.getDescription();


        log.info(pdffile.getName() + " version " + pdffile.getVersion() + " is disabled.");
    }
}

