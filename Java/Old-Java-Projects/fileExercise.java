/**
 * @(#)fileExercise.java
 *
 * fileExercise application
 *
 * @author 
 * @version 1.00 2019/9/18
 */
 import java.util.Scanner;
 import java.io.*;
public class fileExercise {
	public static void names()throws IOException{
		Scanner read = new Scanner(new File("Exercise.txt"));
		String s;
		do{
		s=read.nextLine();
		read.nextLine();
		read.nextLine();
		read.nextInt();
		read.nextInt();
		read.nextLine();
		System.out.println(s);
		}while(read.hasNext());
		System.out.println("");
	}
	public static void txpeeps()throws IOException{
		Scanner read = new Scanner(new File("Exercise.txt"));
		String s,st;
		do{
		s=read.nextLine();
		read.nextLine();
		st=read.nextLine();
		read.nextInt();
		read.nextInt();
		read.nextLine();
		if(st.equals("TX"))
			System.out.println(s);
		}while(read.hasNext());
		System.out.println("");}
		
		public static void houstnum()throws IOException{
		Scanner read = new Scanner(new File("Exercise.txt"));
		String s;
			int st=0;
		do{
		read.nextLine();
		s=read.nextLine();
		read.nextLine();
		read.nextInt();
		read.nextInt();
		read.nextLine();
		if(s.equals("Houston"))
			st++;
		}while(read.hasNext());
		System.out.println("The number of people that live in Houston is " + st);}
		
		public static void totalSal()throws IOException{
		Scanner read = new Scanner(new File("Exercise.txt"));
		String s;
		 int st=0,z;
		do{
		read.nextLine();
		read.nextLine();
		s=read.nextLine();
		read.nextInt();
		z=read.nextInt();
		read.nextLine();
		if(s.equals("TX"))
			st+=z;
		}while(read.hasNext());
		System.out.println("The total salary of the people that live in Texas is $" + st);
		}
		public static void Avg()throws IOException{
		Scanner read = new Scanner(new File("Exercise.txt"));
		String s;
		 int st=0,z,c=0;
		 double avg;
		do{
		read.nextLine();
		read.nextLine();
		s=read.nextLine();
		read.nextInt();
		z=read.nextInt();
		read.nextLine();
		if(s.equals("TX")){
			st+=z;
			c++;}
		}while(read.hasNext());
		avg = (1.0 * st)/c;
		System.out.println("The average salary of the people that live in Texas is $" + avg);
		}
    public static void main(String[] args)throws IOException {
    	names();
    	txpeeps();
    	houstnum();
    	totalSal();
    	Avg();
    	
    }
}
