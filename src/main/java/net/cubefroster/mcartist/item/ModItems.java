package net.cubefroster.mcartist.item;

import net.cubefroster.mcartist.mcartist;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item PALETTE = registerItem("palette", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(mcartist.MOD_ID, name), item);
    }
    public static void registerModItems() {
        mcartist.LOGGER.debug("Registering Mod Items for " + mcartist.MOD_ID);
    }

}
