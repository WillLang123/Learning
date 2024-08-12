public class Triangle extends GeometricObject{
double side1,side2,side3;
//creates attributes and uses some from geometricobject
public Triangle() {
	super();
	side1=1.0;
	side2=1.0;
	side3=1.0;
}
//No arg constructor
public Triangle(String c,boolean f,double s1,double s2,double s3) {
	super(c,f);
	side1=s1;
	side2=s2;
	side3=s3;
}
//constructor with parameters
public double getSide1() {
	return side1;
}
public double getSide2() {
	return side2;
}
public double getSide3() {
	return side3;
}
//all of these return sides
public double getArea() {
	double s = (side1+side2+side3)/2;
	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
}
//return area using formula
public double getPerimeter() {
	return side1+side2+side3;
}
//returns perimeter
public String toString() {
	return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3+" color: "+color+" filled? "+filled;
}
//overrides geometricobject tostring and returns own attributes including ones from geometricobject
}
