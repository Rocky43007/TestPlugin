package rocky.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class testplugin extends JavaPlugin{
    @Override
    public void onEnable(){
        this.getCommand("kit").setExecutor(new CommandKit());
    }
    @Override
    public void onDisable(){
    }
}