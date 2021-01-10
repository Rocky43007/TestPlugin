package rocky.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class testplugin extends JavaPlugin{
    @Override
    public void onEnable(){
        this.getCommand("kit").setExecutor(new CommandKit());
        this.getCommand("test").setExecutor(new CommandTest());
        this.getCommand("kitpvp").setExecutor(new CommandPVPKit());
    }
    @Override
    public void onDisable(){
    }
}
