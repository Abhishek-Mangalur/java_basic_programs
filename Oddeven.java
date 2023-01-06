// To check the no. is odd or even 

import java.util.Scanner;
public class Oddeven 
{
    public static void main(String[] args) 
    {
        Scanner oe = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = oe.nextInt();
        if(n % 2 == 0)
            System.out.println("Number is even");
        if(n % 2 != 0)
            System.out.println("Number is odd");
    }
    
}