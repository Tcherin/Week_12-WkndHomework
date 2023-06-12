import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    FlightManager flightManager;
    Passenger passenger;
    ArrayList<Passenger> passengers = new ArrayList<>();
    CabinCrewMember cabinCrewMember;
    ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
    Pilot pilot;
    ArrayList<Pilot> flightTeam = new ArrayList<>();
    Plane plane;
    PlaneType planeType;
    RankType rankType;
    Passenger passenger1 = new Passenger("Freddie", 3);
    Passenger passenger2 = new Passenger("Jill", 2);
    Passenger passenger3 = new Passenger("Ian", 1);

    @Before
    public void before(){
        pilot = new Pilot("Miriam", RankType.CAPTAIN, "345765");
        CabinCrewMember cabinCrewMember1 = new CabinCrewMember("Jeff", RankType.FLIGHTATTENDANT);
        CabinCrewMember cabinCrewMember2 = new CabinCrewMember("Phil", RankType.FLIGHTATTENDANT);
        flightTeam.add(pilot);
        cabinCrew.add(cabinCrewMember1);
        cabinCrew.add(cabinCrewMember2);
        plane = new Plane(PlaneType.BOEING727);
        flightManager = new FlightManager("Ben");
        flight = new Flight(flightTeam, cabinCrew, plane, "AR432", "Barbados", "Glasgow Airport", "12:40");
    }

    @Test
    public void canGetFlightSeats(){
        assertEquals(120, plane.getPlaneType().getCapacity());
    }

    @Test
    public void canBookAPassengerOnFlight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger1);
        assertEquals(2, flight.getPassengers().size());
    }

    @Test
    public void canCalculateBagWeightPerPassenger(){
        assertEquals(5, flightManager.getBagWeightPerPassenger(PlaneType.BOEING727));
    }

    @Test
    public void canCalculateBagWeightOfBookedPassenger(){
        assertEquals(4.5, flightManager.getBagWeightOfBookedPassenger(PlaneType.BOEING727, passenger1), 0.0);
    }

//    @Test
//    public void canCalculateBagWeightPerBookedPassenger(){
//        flight.addPassenger(passenger1);
//        flight.addPassenger(passenger2);
//        assertEquals(5, flightManager.getBagWeightPerBookedPassenger(PlaneType.BOEING727, passengers));
//    }




}
