// Simple Calculator

import java.util.Scanner;
public class Sc 
{
    public static void main(String[] args) 
    {
        char op;
        int a,b;
        float res=0;
        System.out.println("Enter the operator(+,-,*,/):");
        Scanner sobj=new Scanner (System.in);
        op = sobj.next().charAt(0);
        System.out.println("Enter the two operands");
        a = sobj.nextInt();
        b = sobj.nextInt();
        switch(op)
        {
            case '+' : res = a + b;
                break;
            case '-' : res = a - b;
                break;
            case '*' : res = a * b;
                break;
            case '/' :if(b!=0)
                        {
                            res = a / b;
                        }
                        else
                        {
                            System.out.println("Division not possible!");
                            System.exit (0);
                        }
                        break;
            default: System.out.println("You have entered wrong cases");
            System.exit(0);
        }
        System.out.println("The Result is = " +res);
    }
    
}