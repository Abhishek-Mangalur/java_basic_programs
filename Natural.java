// To find first n natural no.

import java.util.Scanner;
public class Natural 
{

    public static void main(String[] args) 
    {
        System.out.print("Enter the n natural no.: ");
        Scanner nat = new Scanner(System.in);
        int n = nat.nextInt();
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }
}