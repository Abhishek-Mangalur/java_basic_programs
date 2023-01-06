// Grading System

import java.util.Scanner;
public class Grade 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the marks:");
        Scanner gr = new Scanner(System.in);
        int marks = gr.nextInt();
        if(marks <= 39)
            System.out.println("Grade F (Fail)");
        else if(marks <= 49)
            System.out.println("Grade E");
        else if(marks <= 59)
            System.out.println("Grade D");
        else if(marks <= 69)
            System.out.println("Grade C");
        else if(marks <= 79)
            System.out.println("Grade B");
        else if(marks <= 89)
            System.out.println("Grade A");
        else if(marks <= 100)
            System.out.println("Grade O (Outstanding)");
        else
            System.out.println("You have entered more than 100 marks");
    }
}