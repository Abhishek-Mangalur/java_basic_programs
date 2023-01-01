import java.util.Scanner;
public class Addu 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        int c = a + b;
        System.out.println("The Sum is = " +c);
    }
    
}