import java.util.Scanner;
public class Swap 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the two numbers:");
        java.util.Scanner sobj=new Scanner(System.in);
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        System.out.println("The numbers before swap: \nnum1 = "+a +"\n" +"num2 = "+b );
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The numbers after swap: \nnum1 = "+a +"\n" +"num2 = "+b );
    }
}