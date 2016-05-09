package net.bbrooker.minespace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;




public class Minespace {
  
  
  //LIST ITEM HERE
  
  
  
  
  
  
  
  
  
  
  
       @Instance("Minespace");
       public static Minespace instance;
  
       // Says where the client and server 'proxy' code is loaded.
      @SidedProxy(clientSide="mrbbook.infectionz.ClientProxy", serverSide="mrbbook.infectionz.CommonProxy")
       public static CommonProxy proxy;
  
          @EventHandler
        public void preInit(FMLPreInitializationEvent event) {

        @Init
        public void load(FMLInitializationEvent event) {
           	proxy.registerRenderInformation();
        	

        }

        public Minespace() {

                //LanguageRegistry.addName(BaseballBatNail, "Spike bat");
                //LanguageRegistry.addName(Slayerblade, "Slayerblade");

                // LanguageRegistry.instance().addStringLocalization("container.TestTabsStuff", "Test Stuff");

                //====================================================================//
                //         ANTI HACK/SPY/COPY SYS BY TANAWAT BOONMAK [MRBBOOK]       //
                //==================================================================//
                
                //HOW TO USE ? 
                //1.) Disable // On Mark GameRegistry and ClientRegistry
                //2.) Run server for testing
                //3.) Pack and .Zip File to ClientSide 
                
                
                //********** if this mod is on server side please add "//" in the front of GameRegistry and ClientRegistry ******
                
                
                //GameRegistry.registerTileEntity(TileEntityTrashbin.class, "Trashbin");
                //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrashbin.class, new RendererTrashbin());

                //===================================================================//
                //     NO SPY NO KAK GREAN  NO COPY By. FRIDAY ANTIHACK SYSTEM      //
                //=================================================================//

        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}
