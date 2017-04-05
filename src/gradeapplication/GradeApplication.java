/*
 *Caroline Robertson
Grade application
Chapter 5 exercise
April 5, 2017
 */

package gradeapplication;

import java.util.Scanner;

/**
 *
 * @author carob8920
 */
public class GradeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grade; 
        
        System.out.println("ENTER THE FINAL GRADE: "); //title
        
        Scanner input = new Scanner(System.in);
        
        grade = input.nextInt(); //grade is the input
        input.close();
        
        if (grade < 60){ //grade less than 60
            System.out.println("The final grade is an F.");
        } else if (grade >= 60 && grade <=69){ //greater/equal than 60, less/equal than 69
            System.out.println("The final grade is a D.");
        } else if (grade >=70 && grade <= 79){ //greater/equal than 70, less/equal than 79
            System.out.println("The final grade is a C.");
        } else if (grade >=80 && grade <=89){ //greater/equal than 80, less/equal than 89
            System.out.println("The final grade is a B.");
        } else if (grade >=90 && grade <= 100){ //greater than/equal to 90 and less/equal to 100
            System.out.println("The final grade is an A.");
        } else if (grade > 100){ //greater than 100
            System.out.println("That's not a real grade");
        }
        
        
        
    }
    
}
