import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Tony", RankType.CAPTAIN, "304652");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Tony", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals("Captain", pilot.getRankType().getRank());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("304652", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Time for take off!", pilot.flyPlane());
    }

}
