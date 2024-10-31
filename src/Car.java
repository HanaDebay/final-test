import java.util.Objects;

public abstract class Car implements Vehicle {
    private String color;
    private String licensePlate;
    private double pricePerDay;

        public Car(String color, String licensePlate, Double pricePerDay) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.pricePerDay = pricePerDay;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public abstract Double calculateDailyRentalFee();

    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(licensePlate, car.licensePlate) && Objects.equals(pricePerDay, car.pricePerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, licensePlate, pricePerDay);
    }
}
