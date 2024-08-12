/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Reads the radius and length given by inputs and 
 * computes the following equations:
 * Area = radius * radius * pi
 * Volume = area * length
 * *********************************************** */
import java.util.Scanner;
//importing Scanner to take inputs
public class Lab2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Creates Scanner
	System.out.print("Enter the radius of the cylinder: ");
	double radius = input.nextDouble();
	//Lets user answer question and saves input to radius
	System.out.print("Enter the length of the cylinder: ");
	double length = input.nextDouble();
	//Lets user answer question and saves input to length
	double area = Math.pow(radius,2)*Math.PI;
	//Plugs radius into area equation shown in header
	double volume = area * length;
	//Plugs length and area into volume equation shown in header
	System.out.printf("The area is %.3f%n",area );
	//outputs area with only 3 decimal places
	System.out.printf("The volume is %.3f%n",volume);
	//outputs volume with only 3 decimal places
	}

}
