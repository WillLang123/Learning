/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Creates a Rectangle class, an object, attributes, and
 * mutators, accessors, and other methods.
 * *********************************************** */
public class Rectangle {
	//creates class
		  private double length;
		  private double width;
		  //creates attributes
		  public Rectangle() {
			  length = 0.0;
			  width = 0.0;
		  }
		  //creates constructor with no parameters
	
		  public Rectangle(double newLength,double newWidth) {
		    if (newLength>0)
			  this.length = newLength;
		    else
		    	System.out.println("Length must be greater than 0.");
		    if (newWidth>0)
		      this.width = newWidth;
		    else
			    System.out.println("Width must be greater than 0.");
		  }
		  //creates constructor with parameters

		  public double getLength() {
		    return length;
		  }
		  //returns length
		  public double getWidth() {
			return width;
		  }
		  //returns width

		  public void setLength(double newLength) {
		    if (newLength>0.0)
			  this.length = newLength;
		    else
		    	System.out.println("Length must be greater than 0.");
		  }
		  //sets a new length if it is positive
		  
		  public void setWidth(double newWidth) {
			if (newWidth>0.0)
			  this.width = newWidth;
			else
			    System.out.println("Width must be greater than 0.");
			  }
		  //sets a new width if it is positive

		  public double getArea() {
		    return length*width;
		  }
		  //returns area
		 
		  public double getPerimeter() {
		    return 2*length + 2*width;
		  }
		  //returns perimeter
}
