/*
 * Emma Elliott
March 12, 2020
Squares and Cubes Program
 */
package squaresandcubes;

import java.util.Scanner;
/**
 *
 * @author gregelliott
 */
public class SquaresandCubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int userchoice;
        int usernum;
        int userpower;
        int power =1;
        
        do 
        {
            System.out.println("Please enter the number for your choice");
            System.out.println("1... Find the value of a number squared");
            System.out.println("2... Find the value of a number cubed");
            System.out.println("3... Find the value of a number, to any power");
            System.out.println("4... Exit");
        
        userchoice=keyboard.nextInt();
        
        if (userchoice==1)
        {
            System.out.println("Enter a number");
            usernum=keyboard.nextInt();
            
            System.out.println(usernum*usernum);
        }
        
        else if (userchoice==2)
            {
                System.out.println("Enter a number");
                usernum=keyboard.nextInt(); 
                
                System.out.println(usernum*usernum*usernum);
            }
        
        else if (userchoice==3)
            {
                System.out.println("Enter a number");
                usernum=keyboard.nextInt();
                System.out.println("Enter the number to be used as a power");
                userpower=keyboard.nextInt();
                
                for (int i=1; i<=userpower; i++)
                {
                   power =power*usernum; 
                }
                System.out.println(power);
            }
    }while (userchoice !=4);
        
    }
}
