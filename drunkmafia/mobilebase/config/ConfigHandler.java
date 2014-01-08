package drunkmafia.mobilebase.config;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import drunkmafia.mobilebase.lib.BlockInfo;
import drunkmafia.mobilebase.lib.ItemInfo;
import drunkmafia.mobilebase.lib.ModInfo;

public class ConfigHandler {
	public static void init(File file){
		Configuration config = new Configuration(file);
		try{
			
			ItemInfo.tent_ID = config.getItem(ItemInfo.tent_UnlocalizedName, ItemInfo.tent_Default_ID).getInt() - 256;
			ItemInfo.canvas_ID = config.getItem(ItemInfo.canvas_UnlocalizedName, ItemInfo.canvas_Default_ID).getInt() - 256;
			
			BlockInfo.post_ID = config.getBlock(BlockInfo.post_UnlocalizedName, BlockInfo.post_Default_ID).getInt();
			BlockInfo.wool_ID = config.getBlock(BlockInfo.wool_UnlocalizedName, BlockInfo.wool_Default_ID).getInt();
			BlockInfo.tentBluePrinter_ID = config.getBlock(BlockInfo.tentBluePrinter_UnlocalizedName, BlockInfo.tentBluePrinter_Default_ID).getInt();
			BlockInfo.tentBuilder_ID = config.getBlock(BlockInfo.tentBuilder_UnlocalizedName, BlockInfo.tentBuilder_Default_ID).getInt();
			
		}catch(Exception e){
			FMLLog.log(Level.SEVERE, "[" + ModInfo.NAME + "] Config Error, please report this to the mod author", e);
			e.printStackTrace();
		}finally{
			config.save();
		}
	}
}
