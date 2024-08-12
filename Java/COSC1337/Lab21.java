import java.util.*;
//imports scanner tool
public class Lab21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalPos = 0,totalNeg = 0,counter = 0;
		double sum = 0,avg = 0;
//Creates Scanner and variables
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int n = input.nextInt();
//asks for input and stores first one
		while(n!=0) {
			if(n>0)
				totalPos++;
			if(n<0)
				totalNeg++;
			sum+=n;
			n=input.nextInt();
			counter++;
		}
//If the number isn't zero, check if its negative of positive, add it to the sum, and count how many numbers have gone through so far
		avg=sum/counter;
//calculates average using sum of numbers divided by the number of numbers
		System.out.println("The number of positives is " + totalPos
				+ "\nThe number of negatives is " + totalNeg
				+ "\nThe total is " + sum
				+ "\nThe average is " + avg);
//Displays output
	}

}
