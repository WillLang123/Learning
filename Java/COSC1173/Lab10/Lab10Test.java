import java.util.Scanner;
public class Lab10Test {
	
	public static void main(String[] args) {
		Rectangle10 rectangle1 = new Rectangle10(40,4);
		Rectangle10 rectangle2 = new Rectangle10(35.9,3.5);
		//creates objects with parameters
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		//Uses the toString method instead of manually creating sentences and invoking methods
		System.out.println("The number of objects created is: "+rectangle1.getNumberOfObjects()+"\n");
		//*****************************************************************************************
		//BONUS: Declares and creates an array of 5 rectangles, and calculate the total area combined
		Scanner input = new Scanner(System.in);
		//creates scanner to input preferred dimensions of the rectangles
		double totalArea=0;
		//total area counter
		Rectangle10[] rectangleShelf = new Rectangle10[5];
		//creates rectangle array
		for(int i=0;i<rectangleShelf.length;i++) {
			System.out.println("Please input length first and width second: ");
			rectangleShelf[i] = new Rectangle10(input.nextDouble(),input.nextDouble());
		//asks you to input dimensions and creates object in array
			totalArea+=rectangleShelf[i].getArea();
		//adds area to total while before going to next object creation
			
		}
		System.out.println("The total area of the five rectangles is "+totalArea);
		//displays total area
	}

}
