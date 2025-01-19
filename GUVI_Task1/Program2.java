package GUVI_Task1;
// 2. Write a program that find a given number is negative or positive.
import java.util.Scanner;

public class Program2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // creating a user interactive input
        System.out.println("Enter a number : ");
        int numb = scanner.nextInt();
        if (numb >= 0)
        {
            System.out.println("The given number is +ve : " + numb);
        }
        else
        {
            System.out.println("The given number is -ve : " + numb);
        }
        scanner.close();
    }
}
