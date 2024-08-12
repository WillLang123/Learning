/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Prompts user to input side length of the hexagon 
 * and uses the given formula to display the area of
 * the hexagon.
 * *********************************************** */
import java.util.Scanner;
//imports scanner tool
public class Lab4Function {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Creates scanner to take inputs
		System.out.println("Please enter the side: ");
		double side = input.nextDouble();
		//Prompts user to input side length of hexagon
		double area = (6 * (Math.pow(side, 2)))/(4 * (Math.tan(Math.PI/6)));
		//Inputs side length into area of a hexagon equation and saves it as a variable
		System.out.printf("The area of the hexagon is: %.2f",area);
		//Displays hexagon area with only 2 decimal places.
	}

}
