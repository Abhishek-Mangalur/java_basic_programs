// Voting eligibility check

import java.util.Scanner;
public class Vote 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the age:");
        Scanner vobj = new Scanner(System.in);
        int age = vobj.nextInt();
        if(age >= 18)
            System.out.println("Person is eligible for voting");
        if(age < 18)
            System.out.println("Person is not eligible for voting");
    }
}