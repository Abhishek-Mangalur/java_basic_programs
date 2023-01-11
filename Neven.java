// To print n even no.

import java.util.Scanner;
public class Neven 
{

    public static void main(String[] args) 
    {
        int i=2,n;
        Scanner even = new Scanner(System.in);
        System.out.print("Enter the no. upto you want to see: ");
        n = even.nextInt();
        while (i<=n)
    {
        System.out.println(+i);
        i += 2;
    }
    }
}