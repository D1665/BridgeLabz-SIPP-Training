public class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
    }

    public void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost for " + quantity + " items: ₹" + total);
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Notebook", 45.50);
        item.displayItem();
        item.calculateTotalCost(5);
    }
}
