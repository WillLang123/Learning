import java.util.Scanner;
public class FalseLab22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//creates scanner
		Triangle bob = new Triangle("bob",true,1.0,1.0,1.0);
		//takes inputs and creates object using parameters given
		System.out.println(bob);
		System.out.println("The area is "+bob.getArea()+"\nThe perimeter is "+bob.getPerimeter());
		//prints objects attributes and calls other return methods
	}

}

