package drunkmafia.mobilebase.tents;

import net.minecraft.block.Block;

public class TentSmall extends Tent{
	
	private static int[][][][] tent = {
		//North
		{
			{
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1}
			},
			{
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,-1,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,1,1,1,2,1,1,1,1}
			},
			{
				{0,1,1,1,1,1,1,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,3,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,1,1,0,1,1,1,0}
			},
			{
				{0,0,1,1,1,1,1,0,0},
				{0,0,1,5,5,5,1,0,0},
				{0,0,1,5,5,5,1,0,0},
				{0,0,1,5,3,5,1,0,0},
				{0,0,1,5,3,5,1,0,0},
				{0,0,1,5,3,5,1,0,0},
				{0,0,1,5,5,5,1,0,0},
				{0,0,1,5,5,5,1,0,0},
				{0,0,1,1,1,1,1,0,0}
			},
			{
				{0,0,0,1,1,1,0,0,0},
				{0,0,0,1,5,1,0,0,0},
				{0,0,0,1,5,1,0,0,0},
				{0,0,0,1,4,1,0,0,0},
				{0,0,0,1,3,1,0,0,0},
				{0,0,0,1,4,1,0,0,0},
				{0,0,0,1,5,1,0,0,0},
				{0,0,0,1,5,1,0,0,0},
				{0,0,0,1,1,1,0,0,0}
			},
			{
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0}
			},
		},
		//South
		{
			{
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1}
			},
			{
				{1,1,1,1,2,1,1,1,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,-1,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,1,1,1,1,1,1,1,1}
			},
			{
				{0,1,1,1,0,1,1,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,3,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,5,5,5,5,5,1,0},
				{0,1,1,1,1,1,1,1,0}
			},
			{
				{0,0,1,1,1,1,1,0,0},
				{0,0,1,5,5,5,1,0,0},
				{0,0,1,5,5,5,1,0,0},
				{0,0,1,5,3,5,1,0,0},
				{0,0,1,5,3,5,1,0,0},
				{0,0,1,5,3,5,1,0,0},
				{0,0,1,5,5,5,1,0,0},
				{0,0,1,5,5,5,1,0,0},
				{0,0,1,1,1,1,1,0,0}
			},
			{
				{0,0,0,1,1,1,0,0,0},
				{0,0,0,1,5,1,0,0,0},
				{0,0,0,1,5,1,0,0,0},
				{0,0,0,1,4,1,0,0,0},
				{0,0,0,1,3,1,0,0,0},
				{0,0,0,1,4,1,0,0,0},
				{0,0,0,1,5,1,0,0,0},
				{0,0,0,1,5,1,0,0,0},
				{0,0,0,1,1,1,0,0,0}
			},
			{
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0}
			},
		},
		//West
		{
			{
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1}
			},
			{
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,-1,5,5,5,2},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,1,1,1,1,1,1,1,1}
			},
			{
				{0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,3,5,5,5,0},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0}
			},
			{
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,3,3,3,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
			},
			{
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,4,3,4,5,5,1},
				{1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
			},
			{
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
			}
		},
		//East
		{
			{
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1}
			},
			{
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{2,5,5,5,-1,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,1,1,1,1,1,1,1,1}
			},
			{
				{0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{0,5,5,5,3,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0}
			},
			{
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,5,5,5,5,5,1},
				{1,5,5,3,3,3,5,5,1},
				{1,5,5,5,5,5,5,5,1},
				{1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
			},
			{
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1},
				{1,5,5,4,3,4,5,5,1},
				{1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
			},
			{
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
			}
		}
	};
	
	public TentSmall() {
		setStructure(tent);
		this.center = 5;
		tents.add(this);
	}
}
