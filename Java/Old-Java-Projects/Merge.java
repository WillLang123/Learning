/**
 * @(#)Merge.java
 *
 * Merge application
 *
 * @author 
 * @version 1.00 2020/1/28
 */
 import java.util.*;
public class Merge {
	public void merge(ArrayList<Comparable>a,ArrayList<Comparable>b,ArrayList<Comparable>c){
	int Aptr=0,Bptr=0;
	

	for(int Cptr=0; Cptr < (a.size()+b.size());Cptr++){	

	if(Aptr >= a.size()){
		c.add(b.get(Bptr));
		Bptr++;}
	else
		if(Bptr >= b.size()){
		c.add(a.get(Aptr));
		Aptr++;}
		else
		if(Aptr<a.size() && Bptr<b.size()){
				if(a.get(Aptr).compareTo(b.get(Bptr))<0){
				c.add(a.get(Aptr));
				Aptr++;}
				else
				if(b.get(Bptr).compareTo(a.get(Aptr))<=0){
							c.add(b.get(Bptr));
							Bptr++;}
			}
	}
	}
	public ArrayList<Comparable>fillArray(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
	 	System.out.print("How many numbers do you wish to generate? ");
	 	int numInts = keyboard.nextInt();
	 	ArrayList<Comparable>temp = new ArrayList<Comparable>();
	 	System.out.print("Largest integer to generate? ");
	 	int largestInt = keyboard.nextInt();
	 	
	 	Random randGen =new Random();
	 	
	 	
	 	for(int loop = 0; loop < numInts; loop++){
	 		temp.add(randGen.nextInt(largestInt)+1);
	 	}
	 	return temp;
	 }
	  private void screenOutput(ArrayList<Comparable>x){
	 	for(int loop = 0; loop < x.size(); loop++){
	 		if(loop % 12 == 0){
	 			System.out.println();
	 		}
	 		System.out.print(x.get(loop) + " ");
	 	}
	 	System.out.println();
	 }
	  public void selectionSort(ArrayList<Comparable>a){
	 	int min;
	 	Comparable temp;
	 	for(int outer = 0; outer < a.size() - 1; outer++){
	 		min=outer;
	 		for(int inner = outer + 1; inner < a.size();inner++){
	 			if(a.get(inner).compareTo(a.get(min)) < 0){
	 				min = inner;}
	 			}
	 			temp = a.get(outer);
	 			a.set(outer,a.get(min));
	 			a.set(min,temp);
	 		}
	 	}	
	 
    
    public static void main(String[] args) {
    	Merge x = new Merge();
    	System.out.println("Original lists");
    	System.out.println(" List 1 ");
    	ArrayList<Comparable>a = x.fillArray();
    	
    	System.out.println(" List 2 ");
    	ArrayList<Comparable>b = x.fillArray();
    	
    	System.out.println(" List 1:");
    	x.screenOutput(a);
    	System.out.println();
    	System.out.println(" List 2:");
    	x.screenOutput(b);
    	System.out.println();
    	System.out.println("----------------------------------");
    	x.selectionSort(a);
    	x.selectionSort(b);
    	
    	System.out.println("Sorted lists:");
    	System.out.println(" List 1:");
    	x.screenOutput(a);
    	System.out.println();
    	System.out.println(" List 2:");
      	x.screenOutput(b);
      	System.out.println();
    	System.out.println("----------------------------------");
    	System.out.println("Merged list");
    	ArrayList<Comparable>c=new ArrayList<Comparable>();
    	x.merge(a,b,c);
    	x.screenOutput(c);
    	
    	
    }
}
