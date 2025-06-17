// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 

public class CalculateProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f%n", costPrice, sellingPrice);
        System.out.printf("The Profit is INR %.2f and the Profit Percentage is %.2f%%%n", profit, profitPercentage);
    }
}
