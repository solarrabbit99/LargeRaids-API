package com.solarrabbit.largeraids.raid;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.Raid;
import org.bukkit.event.Listener;

public class RaidManager implements Listener {
    public final Set<LargeRaid> currentRaids = new HashSet<>();

    public int getNumOfRegisteredRaids() {
        return 0;
    }

    public Optional<LargeRaid> getLargeRaid(Location location) {
        return null;
    }

    public Optional<LargeRaid> getLargeRaid(Raid raid) {
        return null;
    }

}