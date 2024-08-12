import java.util.*;
public class GeometricObject {
String color;
boolean filled;
Date dateCreated;
//attributes created
public GeometricObject(){
	color="white";
	filled=false;
	dateCreated=(new Date());
}
//no arg constructor
public GeometricObject(String c,boolean f) {
	color=c;
	filled=f;
	dateCreated=(new Date());
}
//constructor with parameters
public String getColor() {
	return color;
}
//returns attribute
public void setColor(String c) {
	color=c;
}
//edits attribute
public boolean isFilled() {
	return filled;
}
//returns attribute
public void setFilled(boolean f) {
	filled=f;
}
//edits attribute
public Date getDateCreated() {
	return dateCreated;
}
//returns attribute
public String toString() {
	return "color: "+color+" filled: "+filled+" Date Created: "+dateCreated;
}
//returns every attribute
}
