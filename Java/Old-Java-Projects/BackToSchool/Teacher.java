
public class Teacher extends Person{
	private String subject;
	private double salary;
	public Teacher(String name,int age,String gender,String sub,double sal){
		super(name,age,gender);
		subject = sub;
		salary = sal;
	}
	public String getSubject(){
		return subject;
	}
	public double getSalary(){
		return salary;
	}
	public void setSubject(String sbj){
		subject = sbj;
	}
	public void setSalary(double sly){
		salary = sly;
	}
	public String toString(){
		return super.toString() + "Subject: " + subject + " Salary: $" + salary;
	}
}
