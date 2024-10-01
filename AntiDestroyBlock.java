import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class AntiDestroyBlock implements Listener {
    private boolean enabled = true;

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (enabled) {
            event.setCancelled(true);
        }
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
