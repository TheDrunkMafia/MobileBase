package drunkmafia.mobilebase.tents;

import net.minecraft.block.Block;

public class TentSmall extends Tent{
	
	public TentSmall() {
		int[][][][] structure = {
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
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{2,0,0,0,3,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,1,1,1,1,1,1,1,1}
					},
					{
						{0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{0,0,0,0,3,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,1,1,1,1,1,1,1,1},
						{0,0,0,0,0,0,0,0,0}
					},
					{
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,3,3,3,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,1,1,1,1,1,1,1,1},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0}
					},
					{
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1},
						{1,0,0,4,3,4,0,0,1},
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
						{1,1,1,1,1,1,1,1,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,3,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,1,1,1,2,1,1,1,1}
					},
					{
						{0,1,1,1,1,1,1,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,3,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,1,1,0,1,1,1,0}
					},
					{
						{0,0,1,1,1,1,1,0,0},
						{0,0,1,0,0,0,1,0,0},
						{0,0,1,0,0,0,1,0,0},
						{0,0,1,0,3,0,1,0,0},
						{0,0,1,0,3,0,1,0,0},
						{0,0,1,0,3,0,1,0,0},
						{0,0,1,0,0,0,1,0,0},
						{0,0,1,0,0,0,1,0,0},
						{0,0,1,1,1,1,1,0,0}
					},
					{
						{0,0,0,1,1,1,0,0,0},
						{0,0,0,1,0,1,0,0,0},
						{0,0,0,1,0,1,0,0,0},
						{0,0,0,1,4,1,0,0,0},
						{0,0,0,1,3,1,0,0,0},
						{0,0,0,1,4,1,0,0,0},
						{0,0,0,1,0,1,0,0,0},
						{0,0,0,1,0,1,0,0,0},
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
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,3,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,1,1,1,2,1,1,1,1}
					},
					{
						{0,1,1,1,1,1,1,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,3,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,1,1,0,1,1,1,0}
					},
					{
						{0,0,1,1,1,1,1,0,0},
						{0,0,1,0,0,0,1,0,0},
						{0,0,1,0,0,0,1,0,0},
						{0,0,1,0,3,0,1,0,0},
						{0,0,1,0,3,0,1,0,0},
						{0,0,1,0,3,0,1,0,0},
						{0,0,1,0,0,0,1,0,0},
						{0,0,1,0,0,0,1,0,0},
						{0,0,1,1,1,1,1,0,0}
					},
					{
						{0,0,0,1,1,1,0,0,0},
						{0,0,0,1,0,1,0,0,0},
						{0,0,0,1,0,1,0,0,0},
						{0,0,0,1,4,1,0,0,0},
						{0,0,0,1,3,1,0,0,0},
						{0,0,0,1,4,1,0,0,0},
						{0,0,0,1,0,1,0,0,0},
						{0,0,0,1,0,1,0,0,0},
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
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{2,0,0,0,3,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,1,1,1,1,1,1,1,1}
					},
					{
						{0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{0,0,0,0,3,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,1,1,1,1,1,1,1,1},
						{0,0,0,0,0,0,0,0,0}
					},
					{
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1},
						{1,0,0,0,0,0,0,0,1},
						{1,0,0,3,3,3,0,0,1},
						{1,0,0,0,0,0,0,0,1},
						{1,1,1,1,1,1,1,1,1},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0}
					},
					{
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1},
						{1,0,0,4,3,4,0,0,1},
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
		center = 5;
		setStructure(structure);
		
	}
}
