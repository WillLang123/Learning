/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Creates an array from given numbers, reverses the
 * array,and states the maximum and minimum of the array.
 * *********************************************** */
import java.util.Scanner;
//imports scanner tool
public class Lab7SingleArrays {
	public static void max(int[] array) {
		//Creates method to find maximum number
		int max = array[0];
		//Finds a starting point to compare to other values in array
		for(int i = 0; i<array.length; i++){
			if(array[i]>max) {
				max = array[i];
			}
		//The loop runs and each time compares the values and replaces the max integer if a number in the array is bigger than the current max
		}
		System.out.println("The maximum is: " + max);
		//displays answer
	}
	public static void min(int[] array) {
		//creates method to find minimum number
		int min = array[0];
		//Finds a starting point to compare with other values in array
		for(int i = 0; i<array.length; i++){
			if(array[i]<min) {
				min = array[i];
		//The loop runs and each time compares the values and replaces the min integer if a number in the array is smaller than the current min
			}
			
		}
		System.out.println("The minimum is: " + min);
		//Displays answer
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//creates scanner
		int[] Bob = new int[10];
		int[] EvilBob = new int[10];
		//Creates bob, the original array, and evilbob, the reversed array
		System.out.print("Please enter 10 numbers: ");
		for(int i = 0; i<Bob.length;i++) {
			Bob[i]= input.nextInt();
		}
		//takes all ten inputs and puts them in bob
		for(int i = 0; i<Bob.length;i++) {
			EvilBob[i]= Bob[Bob.length-i-1];
		}
		//takes all ten numbers in bob and reverses them into evilbob
		System.out.print("The given array is: ");
		for(int i = 0; i<Bob.length;i++) {
			System.out.print(Bob[i]+ " ");
		}
		//displays the original array
		System.out.println("");
		//skips line
		System.out.print("The new array is: ");
		for(int i = 0; i<EvilBob.length;i++) {
			System.out.print(EvilBob[i]+ " ");
		}
		//Displays the reversed array
		System.out.println("\n");
		max(Bob);
		//invokes method
		min(Bob);
		//invokes method
		//*************************************
		//BONUS: count the number of integers that are greater than or less than the average of the array
		int counter = 0;
		double average = 0;
		for(int i = 0; i<Bob.length;i++) {
			average+=Bob[i];
		}
		//adds up all numbers in array
		average/=Bob.length;
		//divides by length of array to find average
		for(int i = 0; i<Bob.length;i++) {
			if(Bob[i]>=average) {
				counter++;
			}
		}
		//counts how many numbers in the array are greater than or equal to average
		System.out.println("There are " + counter + " that are above or equal to the average.");
		//Displays numbers that are greater than or equal to average
		System.out.println("There are " + (Bob.length-counter) + " that are below average.");
		//Displays numbers that are not greater than or equal to average, which is numbers less than the average
	}

}
