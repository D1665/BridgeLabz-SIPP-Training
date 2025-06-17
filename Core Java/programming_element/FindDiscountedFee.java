// The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%.
//  Write a program to find the discounted amount and discounted price the student will pay for the course.

public class FindDiscountedFee {
    public static void main(String[] args) {
        double fee = 125000.0;
        double discountPercent = 10.0;

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, finalFee);
    }
}