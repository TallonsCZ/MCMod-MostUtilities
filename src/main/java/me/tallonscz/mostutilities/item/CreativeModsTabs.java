package me.tallonscz.mostutilities.item;

import me.tallonscz.mostutilities.MostUtilities;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MostUtilities.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeModsTabs {
    public static CreativeModeTab MOST_UTILITIES;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MOST_UTILITIES = event.registerCreativeModeTab(new ResourceLocation(MostUtilities.MODID, "mostutilities_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.MOD_STICK.get())).title(Component.translatable("creativemodetab.mostutilities_tab")));
    }
}
