import java.util.Scanner;
public class Si 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the p,t,r:");
        Scanner sobj=new Scanner(System.in);
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        int c = sobj.nextInt();
        float si;
        si = (a*b*c)/100;
        System.out.println("Simple interest is = "+si);
    }
    
}