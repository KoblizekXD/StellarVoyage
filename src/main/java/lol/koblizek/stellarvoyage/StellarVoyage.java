package lol.koblizek.stellarvoyage;

import lol.koblizek.stellarvoyage.registries.BlockRegistry;
import lol.koblizek.stellarvoyage.registries.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StellarVoyage implements ModInitializer {
    public static final String MOD_ID = "stellarvoyage";
    public static final Logger LOGGER = LoggerFactory.getLogger("Stellar Voyage");
    @Override
    public void onInitialize() {
        LOGGER.info("==Begin mod initialization==");
        ItemRegistry.registerModItems();
        new BlockRegistry().create(Registry.BLOCK);
        LOGGER.info("==End mod initialization==");
    }
}
