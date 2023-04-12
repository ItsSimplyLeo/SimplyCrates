package cx.leo.crates.crate;

import cx.leo.crates.crate.reward.Reward;
import org.bukkit.Location;

import java.util.List;

public interface ICrate {

    String getName();

    List<Location> getLocations();

    void addLocation(Location location);

    List<Reward> getRewards();

}
