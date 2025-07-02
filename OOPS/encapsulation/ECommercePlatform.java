// Taxable Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product Class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();

    public void displayProduct() {
        System.out.println("ID: " + productId + ", Name: " + name +
            ", Price: " + price + ", Discounted: " + (price - calculateDiscount()));
    }
}

// Electronics Class
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied.";
    }
}

// Clothing Class
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "12% GST applied.";
    }
}

// Groceries Class
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Test Class
public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Electronics(201, "Laptop", 80000);
        Product p2 = new Clothing(202, "Jeans", 2000);
        Product p3 = new Groceries(203, "Wheat", 500);

        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            p.displayProduct();
            if (p instanceof Taxable) {
                Taxable tax = (Taxable) p;
                System.out.println("Tax: " + tax.calculateTax() + ", Details: " + tax.getTaxDetails());
            } else {
                System.out.println("No tax on this product.");
            }
            System.out.println("----------");
        }
    }
}

