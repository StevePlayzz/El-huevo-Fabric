package com.cookiejarmodding.el_huevo.core.registry;

import com.cookiejarmodding.el_huevo.core.ElHuevo;
import gg.moonflower.pollen.api.item.SpawnEggItemBase;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ElHuevoItems {
    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, ElHuevo.MOD_ID);

    public static final Supplier<Item> EL_HUEVO_SPAWN_EGG = ITEMS.register("huevo_spawn_egg", () -> new SpawnEggItemBase<>(ElHuevoEntities.HUEVO, 0xFFFFF5, 0x1D2635, true, new Item.Properties()));
}