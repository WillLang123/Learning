/**
 * @(#)Rental.java
 *
 * Rental application
 *
 * @author 
 * @version 1.00 2019/12/10
 */
 
public class Rental {
    
    public static void main(String[] args) {
    	
    int[][] sales ={ {80,30,60,40,55,75,125,0},
                     {25,30,23,10,45,70,20,0},
                     {35,50,10,42,55,75,119,0},
                     {76,22,13,51,22,23,102,0},
                     {0,0,0,0,0,0,0,0}};
    String[]item={"Bike","Golf cart", "Scooter","Umbrella", "Total"};
    int sum=0;
    for(int a:sales[0])
    	sum+=a;
    	
    System.out.println("The total numbers of bikes rented was: "+sum);
    int TueSum = 0;
    for(int r = 0; r<sales.length;r++)
    	TueSum+=sales[r][2];
    	System.out.println("The total number of items rented on Tuesday was: " + TueSum);
    	
    int weeklySum = 0;
    for (int r = 0;r<=3;r++){
    	weeklySum = 0;
    for(int c = 0; c<=6;c++)
    	weeklySum+=sales[r][c];
    	
    sales[r][7]=weeklySum;}	
    
    int dailySum = 0;
    for(int c = 0;c<=6;c++){
    	dailySum = 0;
    for(int r = 0;r<=3;r++)
    	dailySum+=sales[r][c];
    	
    sales[4][c]=dailySum;}
    
    int leastRented = sales[0][7];
    int number = 0;
    for(int r=0;r<=3;r++)
    	if(sales[r][7]<leastRented){
    		leastRented=sales[r][7];
    		number=r;}
    System.out.println("The least rented item this week is: " + item[number]);
    System.out.printf("%10s %6s %6s %6s %6s %6s %6s %6s %5s%n","Item","Sun","Mon","Tues","Wed","Thurs","Fri","Sat","Weekly Total");
    for(int r=0; r<=4;r++){
    	System.out.printf("%10s",item[r]);  
    	for(int c=0;c<=7;c++)
         System.out.printf("%7d",sales[r][c]); 
         	
         System.out.println();}
    }
}
