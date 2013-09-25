package frans.traficLight;

import enviroment.Crossing;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Crossing crossing = new Crossing();
    	TraficLight traficLight = new TraficLight(crossing);
    	//TODO add test
    	crossing.getEastSensor().setCarDetected(false);
    	crossing.getWestSensor().setCarDetected(false);
    	crossing.getNorthSensor().setCarDetected(false);
    	crossing.getSouthSensor().setCarDetected(false);
    	
        traficLight.Execute();
        
    	assertFalse(crossing.getEastLight().isGreen());
    	assertFalse(crossing.getEastLight().isYellow());
    	assertFalse(crossing.getEastLight().isRed());
    	
    	assertFalse(crossing.getNorthLight().isGreen());
    	assertFalse(crossing.getNorthLight().isYellow());
    	assertFalse(crossing.getNorthLight().isRed());
    	
    	assertFalse(crossing.getSouthLight().isGreen());
    	assertFalse(crossing.getSouthLight().isYellow());
    	assertFalse(crossing.getSouthLight().isRed());
    	
    	assertFalse(crossing.getWestLight().isGreen());
    	assertFalse(crossing.getWestLight().isYellow());
    	assertFalse(crossing.getWestLight().isRed());
    	
    	
    }
}
