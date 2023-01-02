import java.util.Scanner;
public class Swap1 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter two numbers:");
        Scanner sobj = new Scanner(System.in);
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        System.out.println("The numbers before swap: \nnum1 = "+a +"\n" +"num2 = "+b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The numbers after swap: \nnum1 = "+a +"\n" +"num2 = "+b );    
    }
}