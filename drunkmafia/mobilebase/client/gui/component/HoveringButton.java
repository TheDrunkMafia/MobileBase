package drunkmafia.mobilebase.client.gui.component;

import java.util.ArrayList;

public class HoveringButton extends RectangleButton{

	private String text;
	public int required, done;
	public boolean isFinished;
	
	public HoveringButton(int id, int x, int y, int sizeX, int sizeY, int textX, int textY, String str) {
		super(id, x, y, sizeX, sizeY, textX, textY);
		text = str;
		required = 0;
		done = 0;
		isFinished = false;
	}	
		
	public void setFinished(boolean val){
		isFinished = val;
	}
	
	public String getText() {
		return text;
	}
	
	public String getFullText(){
		return text + " - Required: " + done + "/" + required;
	}
}
