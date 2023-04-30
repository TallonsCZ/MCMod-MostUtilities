package me.tallonscz.mostutilities;

import com.mojang.logging.LogUtils;
import me.tallonscz.mostutilities.block.ModBLocks;
import me.tallonscz.mostutilities.item.CreativeModsTabs;
import me.tallonscz.mostutilities.item.ModItems;
import me.tallonscz.mostutilities.item.darkIron;
import net.minecraft.world.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static me.tallonscz.mostutilities.item.ModItems.MOD_STICK;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MostUtilities.MODID)
public class MostUtilities {

    public static final String MODID = "mostutilities";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MostUtilities() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBLocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == CreativeModsTabs.MOST_UTILITIES){
            event.accept(MOD_STICK);
            event.accept(ModItems.TEST_ITEM);
            event.accept(ModItems.DARK_IRON);
            event.accept(ModBLocks.DARK_IRON_BLOCK);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

    }
}
