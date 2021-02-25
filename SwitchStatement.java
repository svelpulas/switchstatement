/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;
import java.util.Scanner;

/**
 *
 * @author sande
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 if you would like to calculate the area of a circle\nEnter 2 "
                + "if you would like to calculate the area of a rectangle\nEnter 3 if you would like "
                + "to calculate the area of a triangle. :");
        byte selection = scan.nextByte();
        switch (selection){
            case 1:
                System.out.println("You have chosen to find the area of a circle. Please enter the radius.");
                final int radius = scan.nextInt();
                double part2 = (Math.pow(radius, 2));
                float pi = 3.14f;
                double AreaC = pi * part2;
                System.out.println("The area is: " + AreaC);
                break;
            case 2:
                System.out.println("You have chosen to find the area of a rectangle. Please enter the length.");
                int length = scan.nextInt();
                System.out.println("Now enter the width.");
                int width = scan.nextInt();
                int AreaR = (width) * (length);
                System.out.println("The area is: " + AreaR);
                break;
            case 3:
                System.out.println("You have chosen to find the area of a triangle. "
                        + "Please enter the base dimension.");
                int base = scan.nextInt();
                System.out.println("Now enter the height dimension.");
                int height = scan.nextInt();
                float AreaT = (float) (0.5) * (base) * (height);
                System.out.println("The area is: " + AreaT);
                break;
            default:
                System.out.println("You have enter an invalid option.  Please try again.");
}
    }
    
}
