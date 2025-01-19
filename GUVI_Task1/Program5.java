package GUVI_Task1;
// 5. Write a Java program that takes the purchase amount as input and calculates the final payable amount after applying the discount.
import java.util.Scanner;

public class Program5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the purchase amount : ");
        double purchaseAmount = scanner.nextInt();
        double finalPayableAmount = finalPayableAmount(purchaseAmount);
        System.out.println("Final amount to be paid is : " + finalPayableAmount);
        scanner.close();
    }
    // Method to find the finalPayableAmount
    public static double finalPayableAmount(double purchaseAmount)
    {
        double finalamount = 0;
        if (purchaseAmount<500)
        {
            double discount = 0;
            finalamount = (purchaseAmount - (purchaseAmount*discount));
        }
        else if (purchaseAmount>500 && purchaseAmount<1000)
        {
            double discount = 0.1;
            finalamount = (purchaseAmount - (purchaseAmount*discount));
        }
        else if(purchaseAmount>1000)
        {
            double discount = 0.2;
            finalamount = (purchaseAmount - (purchaseAmount*discount));
        }
        return finalamount;
    }
}
