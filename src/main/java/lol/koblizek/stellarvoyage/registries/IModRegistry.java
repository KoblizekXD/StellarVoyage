package lol.koblizek.stellarvoyage.registries;

import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.ParameterizedType;

public abstract class IModRegistry<T> {

    private Registry<T> registry;

    abstract void apply();
    private void register(T object, String name) {
        Registry.register(registry, name, object);
    }
    public void create(Registry<T> registry) {
        this.registry = registry;
        apply();
    }
}
