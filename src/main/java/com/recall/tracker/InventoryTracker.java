package com.recall.tracker;

import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemID;
import net.runelite.api.events.ItemContainerChanged;

public class InventoryTracker {

    private Client client;

    private boolean hasCrystalOfMemories;

    public void onItemContainerChanged(ItemContainerChanged event) {
        if (event.getContainerId() == InventoryID.INVENTORY.getId()) {
            hasCrystalOfMemories = event.getItemContainer().contains(ItemID.CRYSTAL_OF_MEMORIES);
        }
    }

    public InventoryTracker(Client client) {
        this.client = client;
    }

    public boolean hasCrystalOfMemories() {
//        return hasCrystalOfMemories;
        // TODO undo when done testing
        return true;
    }
}