/**
 * @(#)Hamburgers.java
 *
 * Hamburgers application
 *
 * @author 
 * @version 1.00 2019/12/16
 */
 
public class Hamburgers {
    
    public static void main(String[] args) {
    	
   int[][] sales =  { {389,204,356,360,526,0},
   					  {405,275,230,289,511,0},
   					  {402,250,390,452,532,0},
   					  {298,303,408,419,436,0} };
   double[]price = {2.50,3.25,2.00,1.50};
   String[]item = {"Hamburger","Cheeseburger","Fries","Drinks"};
int sum=0;
	for(int r=0;r<=3;r++){
		sum=0;
		for(int c =0;c<=4;c++)
			sum+=sales[r][c];
			
		sales[r][5]=sum;
	}
double	totalsales=0.0;
System.out.println("            Total Sold      Total Sales");	
	for(int r=0;r<=3;r++){
	System.out.printf("%-15s",item[r]);
	System.out.printf("%-5d         ",sales[r][5]);
	System.out.printf("$%8.2f%n",sales[r][5]*price[r]);
	totalsales+=sales[r][5]*price[r];}
	System.out.println("_____________________________________________");
	System.out.printf("Total for week               $%.2f",totalsales);
    }
}
