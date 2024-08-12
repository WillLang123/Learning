/**
 * @(#)BackToSchool.java
 *
 * BackToSchool application
 *
 * @author 
 * @version 1.00 2020/2/28
 */
 
public class BackToSchool {
    
    public static void main(String[] args) {
    	
    	Person bob = new Person("Coach Bob",27,"M");
    	Student lynne = new Student("Lynne Brooke",16,"F","HS95129",3.5);
    	Teacher mrJAva = new Teacher("Duke JAva",34,"M","Computer Science",50000);
    	CollegeStudent ima = new CollegeStudent("Ima Frosh",18,"F","UCB123",4.0,1,"English");
    	System.out.println(bob);
    	System.out.println(lynne);
    	System.out.println(mrJAva);
    	System.out.println(ima);
    }
}
