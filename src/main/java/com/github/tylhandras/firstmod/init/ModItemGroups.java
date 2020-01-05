package com.github.tylhandras.firstmod.init;

import com.github.tylhandras.firstmod.FirstMod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroups {
    public static class ModItemGroup extends ItemGroup {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(FirstMod.MODID, () -> new ItemStack(ModItems.EXAMPLE_ITEM));
}
