package GUVI_Task1;
// Write a java program to Find the smallest number among three numbers.
import java.util.Scanner;

public class Program4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int smallestNumber = smallestNumber(number1, number2, number3);
        System.out.println("The smallest numbers among three number is :" + smallestNumber);
        scanner.close();
    }

    public static int smallestNumber(int number1, int number2, int number3)
    {
        int smallest = number1;
        if (number2 < number1)
        {
            System.out.println("The smallest number is number 2 : " + number2);
        }
        else if (number3 < number1)
        {
            System.out.println("The smallest number is number 3 : " + number3);
        }
        return smallest;
    }
}
