/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Continuation of Lab 9 that adds a private data field,
 * an accessor for it, and a toString method
 * *********************************************** */
public class Rectangle10 {
	//creates class
		  private static int numberOfObjects = 0;
		  //creates counter that increases when a Object is created
		  private double length;
		  private double width;
		  //creates attributes
		  public Rectangle10() {
			  length = 0.0;
			  width = 0.0;
			  numberOfObjects++;
			  //increases number of object counter
		  }
		  //creates constructor with no parameters
	
		  public Rectangle10(double newLength,double newWidth) {
		    if (newLength>0)
			  this.length = newLength;
		    else
		    	System.out.println("Length must be greater than 0.");
		    if (newWidth>0)
		      this.width = newWidth;
		    else
			    System.out.println("Width must be greater than 0.");
		    if(newLength>0 && newWidth>0)
		    	numberOfObjects++;
		    	//increases number of object counter
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
		  public int getNumberOfObjects() {
			return numberOfObjects;
		  }
		  //returns number of objects
		  public String toString() {
			  return "The length is "+length+" and the width is "+width+".\nAlso, the area is "+this.getArea()+" and the perimeter is "+this.getPerimeter()+".\n";  
		  }
		  //Overrides the original toString as a nice sentence that states its attributes.
}
