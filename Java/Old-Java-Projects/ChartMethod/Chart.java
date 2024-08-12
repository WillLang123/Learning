
class Chart {
	public static void createChart(double m, double b){
		System.out.println(" x     y");
		for(int x = -2; x <= 2; x ++){

			double y = (x * m) + b;
			System.out.printf("%f%5f",x,y);
	}
	}
}
