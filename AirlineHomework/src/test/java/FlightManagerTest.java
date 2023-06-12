import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;

    @Before
    public void before(){
        flightManager = new FlightManager("Ben");
    }

    @Test
    public void hasName(){
        assertEquals("Ben", flightManager.getName());
    }
}
