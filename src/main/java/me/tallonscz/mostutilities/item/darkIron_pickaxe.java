package me.tallonscz.mostutilities.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class darkIron_pickaxe {
    public static final Item dark_iron_pickaxe(){
        Item dark_iron_pickaxe = new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).defaultDurability(4736));
        return dark_iron_pickaxe;
    }
}
