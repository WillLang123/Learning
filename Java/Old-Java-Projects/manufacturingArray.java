/**
 * @(#)manufacturingArray.java
 *
 * manufacturingArray application
 *
 * @author 
 * @version 1.00 2019/10/1
 */
 
public class manufacturingArray {
    
    public static void main(String[] args) {
    	
    	String [] employee = {"Martin","Smith", "Rydell", "Johnson","Adams", "Brockway", "Mangum  ", "Ridgeway", "Register"};
    	String [] department = {"ATG", "MKG","ATG", "ATG", "MKG", "MFG", "MFG", "MFG", "MGT"};
    	double [] salary = {44000,32000,21480,38470,34298, 22849,31983,21983,62982};
    	double mansal = 0,totalsal = 0;
    	int manemps = 0;
    	System.out.println(" Manufacturing Department");
    	System.out.println("");
    	System.out.println("Employee          Salary");
    	
    	for(int x = 0; x < employee.length; x++){
    		totalsal += salary[x];
    		if(department[x].equals("MFG")){
    			System.out.println(employee[x] + "          $" + salary[x]);
    		manemps++;
    		mansal+=salary[x];
    	}}
    	System.out.println("");
    	System.out.println("Total department salary $" + mansal);
    	System.out.println("Number of employees " +manemps);
    	System.out.println("");
    	System.out.print("Total company salary $" + totalsal);
    			
    }}
