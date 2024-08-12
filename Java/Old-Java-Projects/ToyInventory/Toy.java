
class Toy {
	private String name;
	private double price;
	private int lBound;
	private int uBound;
	private String manufacturer;
	
	public Toy (String n, double p, int l, int u, String m){
		name = n;
		price = p;
		lBound = l;
		uBound = u;
		manufacturer = m;
	}
	public String getName(){
		return name;}
	public double getPrice(){
		return price;}
	public String getManufacturer(){
		return manufacturer;}
	public boolean isAgeAppropriate(int age){
		if(age>=lBound && age<=uBound)
			return true;
		else
			return false;
	} 
	public String toString(){		
		return name +", $"+ price + ", from age " + lBound + "-" + uBound + ", and made by " + manufacturer;}
}
