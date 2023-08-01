package lol.koblizek.stellarvoyage;

import lol.koblizek.stellarvoyage.registries.BlockRegistry;
import lol.koblizek.stellarvoyage.registries.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StellarVoyage implements ModInitializer {
    /**
     * Main logger used for mod logging
     */
    public static final Logger LOGGER = LoggerFactory.getLogger("Stellar Voyage");
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        LOGGER.info("==Begin mod initialization==");
        new BlockRegistry().create(Registry.BLOCK);
        new ItemRegistry().create(Registry.ITEM);
        LOGGER.info("==End mod initialization==");
    }
}
