/**
 * @(#)HouseArray.java
 *
 * HouseArray application
 *
 * @author 
 * @version 1.00 2019/10/21
 */
 
public class HouseArray {
	public static House lowest(House[]rent){
		House small = rent[0];
		for(int r = 0;r<rent.length;r++)
			if(rent[r].calcRentalPayment() < small.calcRentalPayment())
				small = rent[r];
return small;	}
    
    public static void main(String[] args) {
    	
    House[]rental = new House[6];
    rental[0] = new House("Mary Jones", "A123", "220 Elm St.", 1, true, 3);
    rental[1] = new House("John Smith", "A124", "410 Oak Dr.", 2, false, 2);
    rental[2] = new House("Edgar Manzo", "A125", "866 Apple Ln.", 1, false, 1);
    rental[3] = new House("Bill Martin", "A126", " 505 Ocean View.", 2, true, 3);
    rental[4] = new House("Liz Lilac", "A127", "101 Main St.", 1, true, 2);
    rental[5] = new House("Gunnar Smythe", "A128", "220 Blossom", 2, false, 1);
    System.out.println(rental[1]);
    int z = 0;
    double sum = 0;
    System.out.println("renterName: " +rental[3].getRenter() + "\nidNum:      " + rental[3].getidNum() +"\nmonthly rent: $" + rental[3].calcRentalPayment());	
    for(int b=0;b<rental.length;b++)
    	System.out.println(rental[b].getRenter() + "  $" + rental[b].calcRentalPayment());
    	
    for(int a=0;a<rental.length;a++)
    	if(rental[a].getType()==1 && rental[a].getCornerL()){
    		System.out.println(rental[a].getRenter());
    		z++;}
    for(int d=0;d<rental.length;d++)
    	sum+=rental[d].calcRentalPayment();
    System.out.println(z + " number of people have one-story corner lot houses.");
    System.out.println("The total amount the company has gained is $" + sum);
    House smallest = lowest(rental);
    System.out.println("The person with the lowest payment of $" + smallest.calcRentalPayment() + " is " + smallest.getRenter());
    		
    }
}
