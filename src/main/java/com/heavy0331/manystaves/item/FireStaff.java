package com.heavy0331.manystaves.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;

import java.util.function.Predicate;

public class FireStaff
        extends RangedWeaponItem
         {

             public FireStaff(Settings settings) {
                 super(settings);
             }

             @Override
             public Predicate<ItemStack> getProjectiles() {
                 return null;
             }

             @Override
             public int getRange() {
                 return 0;
             }
         }
