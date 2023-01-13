// To print n odd no.

import java.util.Scanner;
public class Nodd 
{

    public static void main(String[] args) 
    {
        int i = 1,n;
        System.out.print("Enter the no. upto you want to see: ");
        Scanner odd = new Scanner(System.in);
        n = odd.nextInt();
        while (i<=n)
        {
            System.out.println(i);
            i += 2;
        }
    }
}