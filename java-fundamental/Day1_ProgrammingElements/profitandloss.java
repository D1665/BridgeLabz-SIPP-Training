package Day1_programming_elements;

public class profitandloss {
    
    public static void main(String[] args) {
        double costPrice = 100.0; // Example cost price
        double sellingPrice = 120.0; // Example selling price

        // Calculate profit or loss
        double profitOrLoss = sellingPrice - costPrice;

        // Determine if it's a profit or loss
        if (profitOrLoss > 0) {
            System.out.println("Profit: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss: " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No Profit, No Loss");
        }
    }
}
