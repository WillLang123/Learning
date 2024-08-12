/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Creates an array from given numbers, reverses the
 * array,and states the maximum and minimum of the array.
 * *********************************************** */
import java.util.Scanner;
//imports scanner tool
public class Lab8 {
	//BONUS
	//******************************
	public static double sumColumn (double[][] m, int columnIndex) {
		double arraysum = 0;
		for(int i=0;i<m.length;i++) {
			arraysum+=m[i][columnIndex];
		}
		//finds all the numbers in a certain column and adds them together
		return arraysum;
	}
	//******************************
	public static void main(String[] args) {
		//MAIN ASSIGNMENT
		Scanner input = new Scanner(System.in);
		//Creates scanner
		double[][] box = new double[3][4];
		//creates 2d array
		System.out.println("Enter a 3 by 4 matrix row by row:");
		for(int r=0;r<box.length;r++) {
			for(int c=0;c<box[r].length;c++) {
				box[r][c] = input.nextDouble();
			}
		}
		//inputs and places numbers in the correct array positions
		
		double sum = 0;
		for(int j=0;j<box[0].length;j++) {
		sum = 0;
		for(int i=0;i<box.length;i++) {
			sum+=box[i][j];
		}
		//finds all the numbers in a certain column and adds them together
		System.out.println("Sum of the elements at column "+j+" is " + sum);
		}
		//displays sum
		System.out.println("");
		for(int l=0;l<box.length;l++) {
			sum = 0;
		for(int k=0;k<box[0].length;k++) {
			sum+=box[l][k];
			}
		//finds all the numbers in a certain row and adds them together
		System.out.println("The sum of elements at row " +l+ " is " + sum);
		}
		//displays sum
		System.out.println("The sum of the elements in column 2 is " +sumColumn(box,2));
		//invoking method
	}

}
