import java.util.*;
public class Lab23b {
	public static void add(int n1,int n2) {
		try {
			if(n1<0 || n2<0) {
				throw new Exception("Both numbers need to be positive integers.");
	//if either number inputed is negative, it throws exception
			}
		}catch(Exception e) {
				System.out.println("Warning: "+e.getMessage());
	//this catches exception and displays the message of the exception we created
		}finally {
			System.out.println("The sum of both numbers is "+(n1+n2));
	//finally adds the number despite the error, since it is a finally statement
		}
	}
	public static void divide(int n1,int n2) {
		try {
			System.out.println("The quotient of both integer numbers is "+(n1/n2));
	//This just makes a statement and divides the numbers
		}catch(ArithmeticException e) {
			System.out.println("Error: Cannot divide by 0");
	//if the the quotient has zero on the bottom, it throws an arithmetic exception
	//so instead of making our own, we can just catch the one the program throws for us
		}
	}
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		System.out.println("Please input 3 numbers: ");
		int a=bob.nextInt(),b=bob.nextInt(),c=bob.nextInt();
		add(a,b);
		divide(a,c);
	//This just allows us to input numbers and run our methods
	}

}
