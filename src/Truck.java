import java.util.List;

public class Truck extends Car {
    private int numberOfWheels;

    public Truck(String color, String licensePlate, Double pricePerDay) {
        super(color, licensePlate, pricePerDay);
        this.numberOfWheels = 4;
    }

    @Override
    public Double calculateDailyRentalFee() {
        return 0.0;
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
