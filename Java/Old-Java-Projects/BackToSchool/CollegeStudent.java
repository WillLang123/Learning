
public class CollegeStudent extends Student{
	private String major;
	private int year;
	public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int yr, String maj){
		super(name,age,gender,idNum,gpa);
		major = maj;
		year = yr;
	}
	public String getMajor(){
		return major;
	}
	public int getYear(){
		return year;
	}
	public void setMajor(String mj){
		major = mj;
	}
	public void setYear(int y){
		year = y;
	}
	public String toString(){
		return super.toString() + " Major: " + major + " Year: " + year;
	}
}
