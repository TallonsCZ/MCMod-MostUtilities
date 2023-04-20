package me.tallonscz.mostutilities.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class darkIron extends Items {
        public static final Item dark_iron(){
            Item dark_iron = new Item(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
            return dark_iron;
        }


    }

