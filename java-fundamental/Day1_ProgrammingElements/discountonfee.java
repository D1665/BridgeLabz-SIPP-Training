package Day1_programming_elements;

public class discountonfee {
    
    public static void main(String[] args) {
        double originalFee = 1000.0; // Example original fee
        double discountPercentage = 10.0; // Example discount percentage

        // Calculate the discount amount
        double discountAmount = (discountPercentage / 100) * originalFee;

        // Calculate the final fee after applying the discount
        double finalFee = originalFee - discountAmount;

        // Print the results
        System.out.println("Original Fee: " + originalFee);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Fee after Discount: " + finalFee);
    }
}
