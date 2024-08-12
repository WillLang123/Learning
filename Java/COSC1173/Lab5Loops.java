/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Displays a table from 1 to 199 kilograms and 
 * displays the pounds converted from kilograms
 * *********************************************** */
public class Lab5Loops {

	public static void main(String[] args) {
		int counter = 1;
		//creates counter
		System.out.println("----------------------------");
		System.out.println("Kilograms          Pounds   ");
		System.out.println("----------------------------");
		//Creates Table title
		while(counter<200) {
		//will keep looping until counter is greater than or equal to 200
		System.out.printf("    %-3d             %-4.1f%n",counter,(counter *2.2));
		//Displays kilograms and the converted weight in pounds
		counter+=2;
		//increases counter in increments of 2
		}

	}

}
