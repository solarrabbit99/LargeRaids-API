package com.solarrabbit.largeraids.raid;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;

public class LargeRaid {

    public int getBadOmenLevel() {
        return 0;
    }

    public int getCurrentWave() {
        return 0;
    }

    public int getTotalWaves() {
        return 0;
    }

    public boolean isLastWave() {
        return false;
    }

    public boolean isActive() {
        return false;
    }

    public boolean isLoading() {
        return false;
    }

    public int getTotalRaidersAlive() {
        return 0;
    }

    public Set<Player> getPlayersInRadius() {
        return null;
    }

    public Map<UUID, Integer> getPlayerKills() {
        return null;
    }

    public void incrementPlayerKill(Player player) {
    }

}
