import java.util.Scanner;
public class Areac
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the radius:");
        float r = sobj.nextFloat();
        System.out.println("Area of circle = " +Math.PI*r*r);
    }
}