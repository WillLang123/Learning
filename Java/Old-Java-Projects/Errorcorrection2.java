/**
 * @(#)Errorcorrection2.java
 *
 * Errorcorrection2 application
 *
 * @author 
 * @version 1.00 2019/8/28
 */
 import java.util.Scanner;
public class Errorcorrection2 {
public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
System.out.print("Please enter an integer ");
int m = kb.nextInt();
System.out.print("Please enter another integer ");
int n = kb.nextInt();
double quotient = (double)m/n;
System.out.printf("%n The quotient of %d divided by %d is %.2f%n%n",m, n,quotient);
int quotient2 = m/n;
System.out.printf("%d divides into %d, evenly, %d times %n",n,m,quotient2);
int remainder = m % n;
System.out.printf("and leaves a remainder of %d %n%n", remainder);
}}
