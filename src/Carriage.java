import java.util.ArrayList;
import java.util.List;

public class Carriage {
    private int maxCapacity;
    private List<Passenger> passengerList;

    public Carriage(int maxCapacity, List<Passenger> passengerList) {
        this.maxCapacity = maxCapacity;
        this.passengerList = passengerList;
    }

    public Carriage(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        passengerList = new ArrayList<>();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengerList.size() < maxCapacity) {
            passengerList.add(passenger);
            return true;
        }
        return false;
    }

    public void printPassengers() {
        passengerList.forEach(passenger -> System.out.println(passenger.getName() + " " + passenger.getSurname()));
    }
    public int howManyWithSeniorDiscount(){
        return (int) passengerList.stream()
                .filter(value -> value.getAge() >= 65)
                .count();
    }

    public void printCarriageInfo(){
        System.out.println("Carraige capacity: " + maxCapacity);
        System.out.println("Passengers: " + passengerList.size());
        System.out.println("Free seats: " + (maxCapacity - passengerList.size()));
        printPassengers();
    }
}
