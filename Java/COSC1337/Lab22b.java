import java.util.*;
class Person{
String name,address,email;
long phoneNum;
//Creates person attributes
public Person(String n,String a,String e,long p) {
	name=n;
	address=a;
	email=e;
	phoneNum=p;
}
//Person constructor
public String toString() {	
	return "Hello, I am a Person, and my name is "+name;
}
}
//Return statement when Person is called
class Student extends Person{
final String status;
//Student gains Person's previous attributes and adds new attribute "status"
public Student(String n,String a,String e,long p,String s) {
	super(n,a,e,p);
//This allows us to use Person constructor for these variables to make our life easier
	status=s;
}
public String toString() {	
	return "Hello, I am a Student, and my name is "+name;
}
//Returns sentence when student is called that overrides Person
}
class Employee extends Person{
String office;
int salary;
MyDate dateHired;
//Employee gains person's attributes plus additional ones
public Employee(String n,String a,String e,long p,String o,int s,MyDate d) {
	super(n,a,e,p);
//This allows us to use Person constructor for these variables to make our life easier
	office=o;
	salary=s;
	dateHired=d;
}
public String toString() {	
	return "Hello, I am an Employee, and my name is "+name;
}
//Creates toString that Overrides Person
}
class FacultyMember extends Employee{
int officehours;
//Faculty gains Employee and Person's attributes along with additional ones
String rank;
public FacultyMember(String n,String a,String e,long p,String o,int s,MyDate d,int officeH,String r) {
	super(n,a,e,p,o,s,d);
//uses employee constructor to make our lives MUCH easier
	officehours=officeH;
	rank=r;
}
public String toString() {	
	return "Hello, I am a Faculty Member, and my name is "+name;
}
//Overrides Employee toString
}
class StaffMember extends Employee{
	String title;
//Similar to faculty, staff gains Employee and Person's attributes
	public StaffMember(String n,String a,String e,long p,String o,int s,MyDate d,String t) {
		super(n,a,e,p,o,s,d);
//uses employee constructor to make our lives MUCH easier
		title=t;
	}	
	public String toString() {	
		return "Hello, I am a Staff Member, and my name is "+name;
	}
//overrides Employee toString
}
class MyDate{
//MyDate was borrowed in order to get time for employee attribute
		public int year;
		public int month;
		public int day;
		public MyDate() {
			GregorianCalendar g = new GregorianCalendar();
			year = g.get(Calendar.YEAR);
			month = g.get(Calendar.MONTH);
			day = g.get(Calendar.DAY_OF_MONTH);
		}
		public MyDate(int a, int b, int c) {	 
			GregorianCalendar h = new GregorianCalendar(a,b,c);
		}
		public void setDate(long a) {
			GregorianCalendar mil = new GregorianCalendar();
			mil.setTimeInMillis(a);
			month = mil.get(Calendar.YEAR);
			day = mil.get(Calendar.DAY_OF_MONTH);
			year = mil.get(Calendar.YEAR);
		}
		public int getDay() {
			return day;
		}
		public int getMonth() {
			return month;
		}
		public int getYear() {
			return year;
		}
		public String toString() {
			return month+"/"+day+"/"+year+" ";
		}
	}
public class Lab22b {
public static void main(String[] args) {
	//Tests if classes worked correctly
	Person a = new Person("Norman Guy Juan","111 1st Ave.","NGJ111@gmail.com",111111111);
	System.out.println(a);
	
	Student b = new Student("Dose Guy Tu","222 2nd St.","DGT222@gmail.com",22222222,"Senior");
	System.out.println(b);
	
	Employee c = new Employee("Trace Guy Tree","333 Oak Triangle Rd.","TGT333@outlook.com",333333333,"Blind Mice Inc.",0,(new MyDate(2003,3,13)));
	System.out.println(c);
	
	FacultyMember d = new FacultyMember("Cuarto Guy Fort","444 Square Rd.","CGF444@gmail.com",444444444,"For Score LLC.",0,(new MyDate(2014,4,4)),40,"Intern");
	System.out.println(d);
	
	StaffMember e = new StaffMember("Sink Five Guy","555 Pent Blvd.","SFG555@gmail.com",555555555,"Five Guys",0,(new MyDate(2015,5,15)),"Big Cheese");
	System.out.println(e);
}
}
