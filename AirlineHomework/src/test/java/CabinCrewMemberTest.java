import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jeffrey", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void CrewMemberHasName(){
        assertEquals("Jeffrey", cabinCrewMember.getName());
    }

    @Test
    public void CrewMemberHasRank(){
        assertEquals("Flight Attendant", cabinCrewMember.getRankType().getRank());
    }

    @Test
    public void CrewMemberCanRelayMessage(){
        assertEquals("Please fasten your seatbelts", cabinCrewMember.relayMessage());
    }

}
