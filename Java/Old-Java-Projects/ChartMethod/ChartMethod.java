/**
 * @(#)ChartMethod.java
 *
 * ChartMethod application
 *
 * @author 
 * @version 1.00 2019/9/4
 */
 
public class ChartMethod {
    public static void createChart(double m, double b){
		System.out.println(" x          y");
		for(double x = -2; x <= 2; x ++){

			double y = (1.0*  x * m) + b;
			System.out.printf("%2.0f %10.0f %n",x,y);}}
			
    public static void main(String[] args) {
    createChart(3,4);
    createChart(.5,3);
    createChart(-2,-1);
    }
}
