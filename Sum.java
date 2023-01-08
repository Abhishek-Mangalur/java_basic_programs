// Sum of n natural no.

import java.util.Scanner;
public class Sum 
{

    public static void main(String[] args) 
    {
        int n,i,sum;
        System.out.print("Enter the value of n: ");
        Scanner sobj = new Scanner(System.in);
        n = sobj.nextInt();
        sum = 0;
        // i = 1;
        for(i=1;i<=n;i++)
        {
            sum += i;
            // i += 1;
        }
        System.out.format("Sum of first %d natural number is %d", n, sum);
    }
}