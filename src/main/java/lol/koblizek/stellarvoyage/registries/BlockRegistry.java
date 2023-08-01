package lol.koblizek.stellarvoyage.registries;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BlockRegistry extends IModRegistry<Block> {
    @Override
    void apply() {
        register(new Block(FabricBlockSettings.of(Material.STONE).strength(4f)), "titanium_ore");
    }
}
