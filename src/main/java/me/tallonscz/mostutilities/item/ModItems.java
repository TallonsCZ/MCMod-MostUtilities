package me.tallonscz.mostutilities.item;

import me.tallonscz.mostutilities.MostUtilities;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MostUtilities.MODID);

    public static final RegistryObject<Item> MOD_STICK = ITEMS.register("mod_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_IRON = ITEMS.register("dark_iron",
            () -> darkIron.dark_iron());

    public static final RegistryObject<Item> DARK_IRON_PICKAXE = ITEMS.register("dark_iron_pickaxe",
            () -> darkIron_pickaxe.dark_iron_pickaxe());

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
