package enviroment;

public class Light {
	
	boolean red = false;
	boolean yellow = false;
	boolean green = false;
	
	public void setRed(boolean red){
		this.red = red; 
	}
	
	public void setYellow(boolean yellow){
		this.yellow = yellow;
	}
	
	public void setGreen(boolean green){
		this.green = green;
	}

	public boolean isRed() {
		return red;
	}

	public boolean isYellow() {
		return yellow;
	}

	public boolean isGreen() {
		return green;
	}

}

