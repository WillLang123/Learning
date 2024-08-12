/**
 * @(#)Store.java
 *
 * Store application
 *
 * @author 
 * @version 1.00 2020/2/18
 */
 //TUUUUUUURRRRRNNNN IIIITTTTT IIIINNNNNNN!!!!!!
 import java.io.*;
 import java.util.*;
public class Store {
	private ArrayList <Comparable> myStore = new ArrayList <Comparable>();
	public Store(String fName)throws IOException{
		int id,inv;
		try{
			Scanner inFile = new Scanner(new File(fName));
			while(inFile.hasNext()){
				id = inFile.nextInt();
				inv = inFile.nextInt();
				myStore.add(new Item(id, inv));
			}
		}catch(IOException i){
			System.out.println("Error: " + i.getMessage());
		}
	}
	
	public void displayStore(){
		System.out.printf("%10s%10s","Id","Inv");
		for(int loop = 0; loop < myStore.size(); loop++){
	 		if(loop % 10 == 0){
	 			System.out.println();
	 		}
	 	System.out.printf("%2d%8d%10d%n",loop,((Item)myStore.get(loop)).getId(),((Item)myStore.get(loop)).getInv());
	 	}
	 	System.out.println();
		}
	public void merge(ArrayList<Comparable>a,int first,int mid,int last){
	 int Aptr=first,Bptr=mid+1;
	
	 ArrayList<Comparable> c= new ArrayList<Comparable>(a);
	 for(int Cptr=first; Cptr <= last;Cptr++){	

	 if(Aptr > mid){
	 	c.set(Cptr,a.get(Bptr));
		Bptr++;
		}
	else
	if(Bptr > last){
		c.set(Cptr,a.get(Aptr));
		Aptr++;
		}
	else{
		if(a.get(Aptr).compareTo(a.get(Bptr)) < 0){
				c.set(Cptr,a.get(Aptr));
				Aptr++;
				}
		else{
		if(a.get(Aptr).compareTo(a.get(Bptr)) >= 0){
				c.set(Cptr,a.get(Bptr));
				Bptr++;
				}
		}}}
		for(int loop = first; loop <= last; loop++){
					a.set(loop, c.get(loop));
	}
		}
	public void mergeSort(ArrayList <Comparable>a,int first, int last){
	 int mid=(first+last)/2;
	 if(first-last==0){
	 ;
	 }else{
 	if(last-first==1){
	 		if(a.get(first).compareTo(a.get(last)) > 0){
	 			Comparable temp = 0;
	 			temp = a.get(first);
	 			a.set(first,a.get(last));
	 			a.set(last,temp);
	 		}}
	 else{
	 mid=(first+last)/2	;
	 mergeSort(a,first,mid);
	 mergeSort(a,mid+1,last);
	 merge(a,first,mid,last);
	 }}}
	public void ms(){
		mergeSort(myStore, 0, myStore.size()-1);
	}
	public void testSearchRecursive(){
		int idToFind;
		int invReturn;
		int index;
		Scanner in = new Scanner(System.in);
		System.out.println("Testing search algorithm\n");
		do{
			System.out.println();
			System.out.println("Enter the Id value to search for (-1 to quit) --->");
			idToFind = in.nextInt();
			index = bsearch(new Item(idToFind, 0),0,myStore.size()-1);
			System.out.print("Id # " + idToFind);
			if(index==-1){
				System.out.println("     No such part in stock");
			}else{
				System.out.println("     Inventory = "+((Item)myStore.get(index)).getInv());
			}
			}while(idToFind>=0);
		}
		private int bsearch(Item idToSearch,int first,int last){
			if(first>last)
				return -1;
			int mid = (first+last)/2;
			if(idToSearch.getId()==((Item)myStore.get(mid)).getId())
				return mid;
			else
				if(idToSearch.getId()<((Item)myStore.get(mid)).getId()){
					last=mid-1;
					return bsearch(idToSearch,first,last);
				}else
						first=mid+1;
					return bsearch(idToSearch,first,last);
			
		}
    
    public static void main(String[] args)throws IOException {
    Store WallyWorld = new Store("file50.txt");
    WallyWorld.ms();
    WallyWorld.displayStore();
    WallyWorld.testSearchRecursive();
    }
}
