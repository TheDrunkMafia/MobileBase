package drunkmafia.mobilebase.block;

import java.util.Random;

import drunkmafia.mobilebase.lib.BlockInfo;
import drunkmafia.mobilebase.tileentity.TentPostTile;
import drunkmafia.mobilebase.tileentity.TentPostTileDummy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TentPostBlock extends BlockFence implements ITileEntityProvider{

	public TentPostBlock() {
		super(BlockInfo.post_ID, "planks_oak", Material.wood);
		setCreativeTab(null);
		setUnlocalizedName(BlockInfo.post_UnlocalizedName);
	}
	
	@Override
	public void onBlockPreDestroy(World world, int x, int y,int z, int meta) {
		if(world.isRemote) return;
		if(world.getBlockTileEntity(x, y, z) instanceof TentPostTile){
			TentPostTile controlTile = (TentPostTile)world.getBlockTileEntity(x, y, z);
			controlTile.destoryThis();
			world.removeBlockTileEntity(x, y, z);
		}else if(world.getBlockTileEntity(x, y, z) instanceof TentPostTileDummy){
			TentPostTileDummy tile = (TentPostTileDummy)world.getBlockTileEntity(x, y, z);
			TentPostTile controlTile = tile.getPost();
			if(controlTile != null && !controlTile.isDestorying)
				world.setBlockToAir(controlTile.xCoord, controlTile.yCoord, controlTile.zCoord);
			world.removeBlockTileEntity(x, y, z);
		}
	}
		
	@Override
	public int idPicked(World world, int x, int y, int z) {
		return Block.fence.blockID;
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return -1;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TentPostTileDummy();
	}
}
