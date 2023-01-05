// To check no. is positive or not 

import java.util.Scanner;
public class Check 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n > 0)
            System.out.println("Number is positive");
        if(n < 0)
            System.out.println("Number is negative");
    }
}
