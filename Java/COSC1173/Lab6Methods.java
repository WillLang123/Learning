/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Invokes method and displays converted temperatures
 * *********************************************** */
import java.util.Scanner;
//imports scanner tool
public class Lab6Methods {
	public static double Fahrenheit(double celciusInput) {
		//created a method
		return (celciusInput*(9.0/5))+32;
		//displays fahrenheit degrees converted from input
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Creates Scanner
		System.out.print("Please input a temperature in Celcius: ");
		double scannerInput = input.nextDouble();
		//Takes input of desired temperature conversion
		System.out.print(scannerInput + " Celcius equals " + Fahrenheit(scannerInput) + " Fahrenheit.\n");
		//Prints Celcius degrees concatenated with Strings
		//Invokes Method
		
//***********************************************************		
		//BONUS: Create a list that invokes the method each run
		double Celcius = 40.0;
		//Creates counter
		System.out.println("Celcius      Fahrenheit");
		//Creates Table title
		while(Celcius>=31) {
		//Begins loop
		System.out.printf("%.1f        %.1f%n",Celcius, Fahrenheit(Celcius));
		//Concatenates Celcius counter with String
		//Invokes method in While loop
		Celcius--;
		//decreases counter in loop
		}
	}
}
