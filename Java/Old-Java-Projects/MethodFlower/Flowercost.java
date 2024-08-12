
class Flowercost {
	private double cost;
	public double CalcCost(int n, double p){
	cost = n * p + 25;
	return cost;}
	public void printFlower(String s, double c){
	 System.out.printf(" %s cost is %.2f %n",s,c);}
	public void printComparison(int n){
		System.out.println("For " + n + " flowers: \n\n");
			printFlower("Daisy",CalcCost(n,0.3));
			printFlower("Tulip",CalcCost(n,1.5));
			printFlower("Carnation",CalcCost(n,0.7));}}
