package enviroment;

public class Crossing {
	Light northLight;
	Light eastLight;
	Light westLight;
	Light southLight;
	Sensor northSensor;
	Sensor eastSensor;
	Sensor westSensor;
	Sensor southSensor;
	
	public Crossing(){
		northLight = new Light();
		eastLight = new Light();
		westLight = new Light();
		southLight = new Light();
		
		northSensor = new Sensor();
		eastSensor = new Sensor();
		westSensor = new Sensor();
		southSensor = new Sensor();
	}
	
	public Light getNorthLight(){
		return northLight;
	}
	
	public Light getSouthLight(){
		return southLight;
	}
	
	public Light getWestLight(){
		return westLight;
	}
	
	public Light getEastLight(){
		return eastLight;
	}
	
	public Sensor getNorthSensor(){
		return northSensor;
	}
	
	public Sensor getSouthSensor(){
		return southSensor;
	}

	public Sensor getEastSensor(){
		return eastSensor;
	}

	public Sensor getWestSensor(){
		return westSensor;
	}

}

