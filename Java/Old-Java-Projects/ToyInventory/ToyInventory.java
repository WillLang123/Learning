/**
 * @(#)ToyInventory.java
 *
 * ToyInventory application
 *
 * @author 
 * @version 1.00 2019/12/2
 */
 import java.io.*;
 import java.util.*;
public class ToyInventory {
    private ArrayList <Toy> toyList = new ArrayList <Toy> ();
    public void inputList() throws IOException{
    	Scanner in = new Scanner(new File("Toys 2018.txt"));
    	while(in.hasNext()){
    	String toyName = in.nextLine();
    	double price = in.nextDouble();
    	int lb=in.nextInt();
    	int ub = in.nextInt();
    	String enterKey = in.nextLine();
    	String manufacturer = in.nextLine();
    	Toy t = new Toy(toyName,price,lb,ub,manufacturer);
    	toyList.add(t);
    	}}
    	public ArrayList <Toy> toySelection(int anAge, String m){
    	ArrayList <Toy> I = new ArrayList <Toy> ();	
    		for(Toy a:toyList)
    		if(a.isAgeAppropriate(anAge)&&(m.equals(a.getManufacturer())|| m.equals("Generic"))){
    		I.add(a);}
    		return I;
    	}
    public static void main(String[] args)throws IOException {
    ToyInventory mine = new ToyInventory();
    mine.inputList();
 	System.out.println(mine.toySelection(3,"Generic"));
    }}

