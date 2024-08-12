import java.util.*;
public class Lab22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//creates scanner
		System.out.println("please input attributes in this order: color, filled, side 1, side 2, side 3: ");
		Triangle bob = new Triangle(input.next(),input.nextBoolean(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		//takes inputs and creates object using parameters given
		System.out.println(bob);
		System.out.println("The area is "+bob.getArea()+"\nThe perimeter is "+bob.getPerimeter());
		//prints objects attributes and calls other return methods
	}

}
