import java.util.ArrayList;

public class FlightManager {
    private String name;

    public FlightManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBagWeightPerPassenger(PlaneType planeType) {
        int TotalBagWeight = planeType.getTotalWeight() / 2;
        int bagWeightPerPassenger = TotalBagWeight / planeType.getCapacity();
        return bagWeightPerPassenger;
    }

    public double getBagWeightOfBookedPassenger(PlaneType planeType, Passenger passenger){
        double individualBagWeight = 1.5;
        double passengerBagWeight = passenger.getNumberOfBags();
        double totalBagWeight = passengerBagWeight * individualBagWeight;
        return totalBagWeight;
    }

    public int getBagWeightPerBookedPassenger(PlaneType planeType, ArrayList passengers){
        double totalWeight = 0;
        for (Object passenger : passengers) {
           Object passenger = Passenger passenger;
            double passengerWeight = passenger.getBagWeightOfBookedPassenger();
        }
    }

}
