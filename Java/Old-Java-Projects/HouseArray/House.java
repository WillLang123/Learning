
class House {
	private String renterName;
	private String idNum;
	private	String address;
	private int type;
	private boolean corner_lot;
	private int furnishing_code;
	public House(String a, String b, String c, int d, boolean e, int f){
		renterName = a;
		idNum = b;
		address = c;
		type = d;
		corner_lot = e;
		furnishing_code = f;
	}
	
	public String getRenter(){
	return renterName;
	}
	public String getidNum(){
	return idNum;
	}
	public String getAddress(){
	return address;
	}
	public int getType(){
	return type;
	}
	public Boolean getCornerL(){
	return corner_lot;
	}
	public int getFurnishingC(){
	return furnishing_code;
	}
	public String toString(){
		return renterName + "(" + idNum + ") \n" + address + "\n" + type + " story, Corner: " + corner_lot +"\nFurnishing code: " + furnishing_code;
	}
	public double calcRentalPayment(){
	double x;
		if(type == 1)
			if(corner_lot)
				x = 1500.00;
			else
				x = 1100.00;
		else
			if(corner_lot)
				x = 2500.00;
			else
				x = 2100.00;
		if(furnishing_code == 3)			
				return x;
		if(furnishing_code == 2)
				return x+=500.00;
		else
				return x+=1000.00;
				}
	}
