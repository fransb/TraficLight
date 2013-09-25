package enviroment;

public class Light {
	
	private Color color = Color.RED;
	
	public void setRed(){
		color = Color.RED;
		}
		
	public void setGreen(){
		color = Color.GREEN;
	}
	
	public Color getColor() {
		return color;
	}

	public boolean isGreen() {
		if (color == Color.GREEN) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isRed() {
		if (color == Color.RED) {
			return true;
		} else {
			return false;
		}
	}
	
}

