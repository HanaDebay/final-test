import java.util.List;

public class Truck extends Car {
    private int numberOfWheels;
    private double pricePerDay;
    public Truck(String color, String licensePlate, double pricePerDay) {
        super(color, licensePlate, pricePerDay);
        this.numberOfWheels = 4;
    }

    @Override
    public Double calculateDailyRentalFee() {
        return pricePerDay * 1.2;
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
