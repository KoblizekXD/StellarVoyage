package lol.koblizek.stellarvoyage;

import lol.koblizek.stellarvoyage.registries.BlockRegistry;
import lol.koblizek.stellarvoyage.registries.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class StellarVoyage implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        new BlockRegistry().create(Registry.BLOCK);
        new ItemRegistry().create(Registry.ITEM);
    }
}
