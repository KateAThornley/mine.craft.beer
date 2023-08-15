package net.kat.tutorialmod.items;

import net.kat.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        TutorialMod.MODID);
        public static final RegistryObject<Item> STAR = ITEMS.register("star", () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LABATT = ITEMS.register("labatt",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMPTY_LABATT = ITEMS.register("empty_labatt",
                        () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
