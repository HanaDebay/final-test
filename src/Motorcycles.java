import java.util.List;

public class Motorcycles implements Vehicle {
    private int numberOfWheels;

    public Motorcycles(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }


    @Override
    public void rentVehicle() {

    }

    @Override
    public void returnVehicle() {

    }

    @Override
    public double calculateRentalCost() {
        return 0;
    }
}