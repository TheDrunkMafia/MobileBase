package drunkmafia.mobilebase.lib;

import java.util.ArrayList;

public class ModInfo {
	
	public static final String MODID   = "mobilebase";
	public static final String NAME    = "Mobile Base"; 
	public static final String VERSION = "2.0";
	public static final String MCVERSION = "1.6.4";
	
	public static final String CHANNEL = MODID;
	
	public static final boolean updateInfoDefault = true;
	public static boolean updateInfo;
	
	public static ArrayList<Integer> blackListedBlocks = new ArrayList<Integer>();
	public static ArrayList<Integer> errorBlackListedBlocks = new ArrayList<Integer>();
}
