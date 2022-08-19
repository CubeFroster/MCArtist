package net.cubefroster.mcartist;

import net.cubefroster.mcartist.item.ModItems;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class mcartist implements ModInitializer {
    public static final String MOD_ID = "mcartist";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
