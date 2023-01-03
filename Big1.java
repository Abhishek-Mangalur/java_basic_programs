import java.util.Scanner;
public class Big1 
{
    public static void main(String[] args) 
    {
        int a, b, c, large;
        System.out.println("Enter three numbers: ");
        Scanner sobj = new Scanner(System.in);
        a = sobj.nextInt();
        b = sobj.nextInt();
        c = sobj.nextInt();
        large = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
        System.out.println("The largest number is: " +large);
    }

}