package net.kat.tutorialmod.items;

import net.kat.tutorialmod.TutorialMod;
import net.kat.tutorialmod.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, TutorialMod.MODID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> BEER_TAB = CREATIVE_MODE_TABS.register("beer_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LABATT.get()))
                    .title(Component.translatable("creativetab.beer_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LABATT.get());
                        pOutput.accept(ModBlocks.LABATT_BLOCK.get());
                        pOutput.accept(ModItems.EMPTY_LABATT.get());
                        pOutput.accept(ModBlocks.EMPTY_LABATT_BLOCK.get());
                    })
                    .build());

}
