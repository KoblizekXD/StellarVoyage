package lol.koblizek.stellarvoyage.registries;

import lol.koblizek.stellarvoyage.StellarVoyage;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item BAUXITE = registerItem("bauxite", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_POWDER = registerItem("aluminium_powder", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_PLATE = registerItem("aluminium_plate", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StellarVoyage.MOD_ID, name), item);
    }

    public static final ItemGroup STELLARVOYAGE = new ItemGroup(11, StellarVoyage.MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BAUXITE);
        }

        @Override
        public void appendStacks(net.minecraft.util.collection.DefaultedList<ItemStack> stacks) {
            super.appendStacks(stacks);
            stacks.add(new ItemStack(BAUXITE));
            stacks.add(new ItemStack(ALUMINIUM_INGOT));
            stacks.add(new ItemStack(ALUMINIUM_POWDER));
            stacks.add(new ItemStack(ALUMINIUM_PLATE));
        }
    };

    public static void registerModItems() {
        StellarVoyage.LOGGER.info("Registering Mod Items for " + StellarVoyage.MOD_ID);
    }
}

