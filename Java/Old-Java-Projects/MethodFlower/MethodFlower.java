/**
 * @(#)MethodFlower.java
 *
 * MethodFlower application
 *
 * @author 
 * @version 1.00 2019/9/6
 */
 import java.util.Scanner;
public class MethodFlower {
    
    public static void main(String[] args) {
    	int numFlowers;
    	Flowercost x = new Flowercost();
    	Scanner kb = new Scanner(System.in);
    	System.out.print("Enter number of flowers: ");
    	numFlowers = kb.nextInt();
    	x.printComparison(numFlowers);}}
