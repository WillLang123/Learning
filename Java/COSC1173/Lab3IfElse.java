/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Prompts user to enter weight and price of product,
 * follows if statements to determine shipping cost,
 * and displays shipping cost and total cost.
 * *********************************************** */
import java.util.Scanner;
//imports scanner tool
public class Lab3IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Creates Scanner
		double cost = 0;
		//Initializes cost
		System.out.print("Please the input weight of package(in pounds): ");
		double weight = input.nextDouble();
		//Inputs weight of package
		System.out.print("Please the input price of the product(in dollars): ");
		double price = input.nextDouble();
		//Inputs price of product in package
		if(weight<0) {
			System.out.println("Package cannot be negative");
		//checks if package cost is below zero
		}
		if(0<weight && weight<=1) {
			cost = 3.5;
			System.out.println("The shipping cost is " + cost);
		//changes and displays cost to 3.5 based off weights between 0 and 1
		}if(1<weight && weight<=3) {
			cost = 5.5;
			System.out.println("The shipping cost is " + cost);
		//changes and displays cost to 5.5 based off weights between 1 and 3
		}if(3<weight && weight<=10) {
			cost = 8.5;
			System.out.println("The shipping cost is " + cost);
		//changes and displays cost to 8.5 based off weights between 3 and 10
		}if(10<weight && weight<=20) {
			cost = 10.5;
			System.out.println("The shipping cost is " + cost);
		//changes and displays cost to 10.5 based off weights between 10 and 20
		}if(weight>20) {
			System.out.println("Package cannot be shipped.");
		//checks if package too heavy to ship
		}
		System.out.println("The total cost is " + (cost + price));
		//displays total cost
	}

}
