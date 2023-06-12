import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> flightTeam;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Pilot> flightTeam,
                  ArrayList<CabinCrewMember> cabinCrew,
                  Plane plane,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime) {

        this.flightTeam = flightTeam;
        this.cabinCrew = cabinCrew;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getFlightTeam() {
        return flightTeam;
    }

    public void setFlightTeam(ArrayList<Pilot> flightTeam) {
        this.flightTeam = flightTeam;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList<CabinCrewMember> cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void addPassenger(Passenger passenger){
        if (passengers.size() < plane.getPlaneType().getCapacity() && !passengers.contains(passenger)){
            passengers.add(passenger);
        }
    }
}
