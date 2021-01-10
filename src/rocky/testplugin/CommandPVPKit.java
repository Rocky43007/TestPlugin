package rocky.testplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandPVPKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // Create a new ItemStack (type: diamond)
            ItemStack nethhel = new ItemStack(Material.NETHERITE_HELMET, 1);
            ItemStack nethchest = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
            ItemStack nethleg = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
            ItemStack nethboots = new ItemStack(Material.NETHERITE_BOOTS, 1);
            ItemStack nethsword = new ItemStack(Material.NETHERITE_SWORD, 1);
            nethsword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
            nethsword.addEnchantment(Enchantment.SWEEPING_EDGE, 3);
            nethsword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
            ItemStack nethaxe = new ItemStack(Material.NETHERITE_AXE, 1);
            nethaxe.addEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
            ItemStack ggapples = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 32);
            ItemStack gapples = new ItemStack(Material.GOLDEN_APPLE, 64);

            // Give the player our items (comma-separated list of all ItemStack)
            player.getInventory().setHelmet(nethhel);
            player.getInventory().setChestplate(nethchest);
            player.getInventory().setLeggings(nethleg);
            player.getInventory().setBoots(nethboots);
            player.getInventory().setItem(0, nethsword);
            player.getInventory().setItem(1, nethaxe);
            player.getInventory().addItem(ggapples, gapples);
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}