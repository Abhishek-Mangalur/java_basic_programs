import java.util.Scanner;
public class Big 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the value of a and b:");
        Scanner sobj = new Scanner(System.in);
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        int big = (a>b) ? a : b;
        System.out.println("The bigger no is: "+big);
    }
}