package frans.traficLight;

import enviroment.Crossing;

public class TraficLight {

	private Crossing crossing;

	
	public TraficLight(Crossing crossing) {
		this.crossing = crossing;
	}

	public void Execute(){
		
		if ((crossing.getEastSensor().isCarDetected()) || (crossing.getWestSensor().isCarDetected()) ){
			crossing.getEastLight().setGreen();
			crossing.getWestLight().setGreen();
			crossing.getNorthLight().setRed();
			crossing.getSouthLight().setRed();
		} else if ((crossing.getNorthSensor().isCarDetected()) || (crossing.getSouthSensor().isCarDetected())){
			crossing.getEastLight().setRed();
			crossing.getWestLight().setRed();
			crossing.getNorthLight().setGreen();
			crossing.getSouthLight().setGreen();
		} else {
			crossing.getEastLight().setRed();
			crossing.getWestLight().setRed();
			crossing.getNorthLight().setRed();
			crossing.getSouthLight().setRed();
		}
	}
	
}
