
public class Lab9Test {
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(40,4);
		Rectangle rectangle2 = new Rectangle(35.9,3.5);
		//creates objects with parameters
		
		System.out.println("The width of rectangle1 is " + rectangle1.getWidth());
		System.out.println("The length of rectangle1 is " + rectangle1.getLength());
		System.out.println("The area of rectangle1 is " + rectangle1.getArea());
		System.out.println("The perimeter of rectangle1 is " + rectangle1.getPerimeter());
		//uses methods to find attribute values or invokes methods of rectangle1 and returns them in the sentences
		System.out.println("");
		//skips line to make things look nice
		System.out.println("The width of rectangle2 is " + rectangle1.getWidth());
		System.out.println("The length of rectangle2 is " + rectangle1.getLength());
		System.out.println("The area of rectangle2 is " + rectangle1.getArea());
		System.out.println("The perimeter of rectangle2 is " + rectangle1.getPerimeter());
		//uses methods to find attribute values or invokes methods of rectangle2 and returns them in the sentences

	}

}
