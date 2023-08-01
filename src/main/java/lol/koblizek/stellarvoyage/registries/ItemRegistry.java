package lol.koblizek.stellarvoyage.registries;

import lol.koblizek.stellarvoyage.StellarVoyage;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry extends IModRegistry<Item> {
    @Override
    void apply() {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StellarVoyage.MOD_ID, name), item);
    }
}
