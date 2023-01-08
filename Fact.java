// Factorial of a no.

import java.util.Scanner;
public class Fact 
{

    public static void main(String[] args) 
    {
        int n,i,fact;
        System.out.print("Enter the value of n: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        fact = 1;
        i = 1;
        while(i<=n)
        {
            fact = fact * i;
            i = i + 1;
        }
        System.out.format("Factorial of %d is %d\n", n, fact);
    }
}