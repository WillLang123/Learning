
 import java.util.Scanner;
 import java.io.*;
public class Read404a {
    public static void pnum() throws IOException{
   	Scanner read = new Scanner(new File("prg404a1.txt"));
   	int x;
 System.out.println("Positive Numbers");
   	do{  
   	x = read.nextInt();
   	if(x >= 0)
   	System.out.println(x);
   	}while(read.hasNext());
   	System.out.println("");}
   	public static void nnum() throws IOException{
   	Scanner read = new Scanner(new File("prg404a1.txt"));
   	int y;
   	System.out.println("Negative Numbers");
   	do{
   	y = read.nextInt();
   	if(y < 0)
   		System.out.println(y);}while(read.hasNext());
   		System.out.println("");}
   	public static void evennum() throws IOException{
   	Scanner	read = new Scanner(new File("prg404a1.txt"));
   	int x,z=0;
   	do{
   	x = read.nextInt();
   	if((x%2) == 0)
   		z++;}while(read.hasNext());
   		System.out.println("There are " + z +" even numbers in the file.");}
   	public static void big() throws IOException{	
   	Scanner	read = new Scanner(new File("prg404a1.txt"));
   	int a=0, sum=0,x=0;
   	double avg;
   	while(read.hasNext()){  	x++;
   		a = read.nextInt();
   		sum += a;}
   		avg = (1.0 * sum) / x;
   		System.out.println("There are " + x  + " numbers in the file.");
   		System.out.println("The average of all numbers is " + avg);	
   
   	}
   		
    public static void main(String[] args) throws IOException {
    	pnum();
    	nnum();
    	evennum();
    	big();
   
    
}}
