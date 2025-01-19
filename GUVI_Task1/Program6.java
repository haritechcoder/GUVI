package GUVI_Task1;

import java.util.Scanner;
// 6. Write a Java program to print bellow pattern.
public class Program6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 'n' value as 5 to achieve a given pattern");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j < i)
                {
                    System.out.print(n-j);
                }
                else
                {
                    System.out.print(n-i);
                }
            }
            System.out.println();
        }
    }
}
