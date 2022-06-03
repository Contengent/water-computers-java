package com.mycompany.water.computers;

/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */
import java.util.Scanner;

public class WaterComputers {

    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        
        final double WATER_COST = 1.5;
        int inputResponse;
        double answer;
        
        
        System.out.println("Enter the amount of computers/monitor combos you have:");
        inputResponse = intInput.nextInt();
        
        answer = WATER_COST * inputResponse;
        
        System.out.println("It costs " + answer + " tons of water to make all of those!");
    }
}
