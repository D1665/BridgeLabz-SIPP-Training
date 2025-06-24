public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000; // Example rate

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}
