package com.crazycrafter.ic2burnablecreosote.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import ic2.api.recipe.Recipes;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


@Mod(modid = IC2BurnableCreosote.MODID, version = IC2BurnableCreosote.VERSION)
public class IC2BurnableCreosote {

	public static final String MODID = "ic2burnablecreosote";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void postInit(FMLInitializationEvent event){
    	Recipes.semiFluidGenerator.addFluid("liquid.creosote", 0, 0);
    	
    }
}
