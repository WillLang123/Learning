/**
 * @(#)SortStep.java
 *
 * SortStep application
 *
 * @author 
 * @version 1.00 2020/1/17
 */
 //GRAPH
 import java.util.*;
public class SortStep {
	private Scanner keyboard;
	private ArrayList <Comparable> myArray;
	private long steps;
	
	public SortStep(){
		keyboard = new Scanner(System.in);
		myArray = null;
		steps = 0;
	}
	 public void sortMenu(){
	 	String choice="";
	 	
	 	do{
	 	System.out.println();
	 	System.out.println("\nSorting algorithm menu \n");
	 	System.out.println("(1) Bubble sort");
	 	System.out.println("(2) Selection sort");
	 	System.out.println("(3) Insertion sort");
	 	System.out.println("(4) Recursive mergesort");
	 	System.out.println("(5) Quicksort");
	 	System.out.println("(Q) Quit");
	 	System.out.println();
	 	System.out.print("Choice ---> ");
	 	choice = keyboard.next() + " ";
	 	
	 	if('1' <= choice.charAt(0) && choice.charAt(0) <= '5'){
	 		System.out.println();
	 		steps = 0;
	 		
	 		switch(choice.charAt(0)){
	 			case '1':
	 				resetArray();
	 			 bubbleSort(myArray);
	 			break;
	 			case '2':
	 				resetArray();
	 			selectionSort(myArray);
	 			break;
	 			case '3':
	 				resetArray();
	 				insertionSort(myArray);
	 			break;
	 			case '4':
	 				resetArray();
	 				int last = myArray.size() - 1;
	 				mergeSort(myArray,0,last);
	 			break;
	 			case '5':
	 				resetArray();
	 				int last2 = myArray.size() - 1;
	 				quickSort(myArray,0,last2);
	 			break;
	 		}
	 		
	 		if('1' <= choice.charAt(0) && choice.charAt(0) <= '5'){
	 			System.out.println();
	 			System.out.println("Array sorted to:");
	 			screenOutput();
	 			System.out.println();
	 			System.out.println("# steps = " + steps);
	 			System.out.println();
	 		}
	 	}
	 	
	 	} while(choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
	 }
	 
	 private void fillArrayWithInts(){
	 	System.out.print("How many numbers do you wish to generate? ");
	 	int numInts = keyboard.nextInt();
	 	System.out.print("Largest integer to generate? ");
	 	int largestInt = keyboard.nextInt();
	 	
	 	Random randGen =new Random();
	 	myArray = new ArrayList <Comparable>();
	 	
	 	for(int loop = 0; loop < numInts; loop++){
	 		Integer x = new Integer(randGen.nextInt(largestInt) + 1);
	 		myArray.add(x);
	 	}
	 }
	 private void resetArray(){
	 	fillArrayWithInts();
	 	System.out.println();
	 	System.out.println("Array reset to:");
	 	screenOutput();
	 }
	 private void screenOutput(){
	 	for(int loop = 0; loop < myArray.size(); loop++){
	 		if(loop % 12 == 0){
	 			System.out.println();
	 		}
	 		System.out.print(myArray.get(loop) + " ");
	 	}
	 	System.out.println();
	 }
	     public void bubbleSort(ArrayList<Comparable>a){
    for(int outer =0;outer<a.size()-1;outer++){
    for (int inner = 0; inner<a.size()-outer-1;inner++){
    	steps+=3;
    if (a.get(inner).compareTo(a.get(inner+1))>0){
    //swap a[inner]&a[inner+1]
    Comparable temp = a.get(inner);
    a.set(inner, a.get(inner+1));
    a.set(inner+1,temp);
    steps+=4;
    }}}}
	 public void selectionSort(ArrayList<Comparable>a){
	 	int min;
	 	Comparable temp;
	 	for(int outer = 0; outer < a.size() - 1; outer++){
	 		min=outer;
	 		for(int inner = outer + 1; inner < a.size();inner++){
	 			steps+=3;
	 			if(a.get(inner).compareTo(a.get(min)) < 0){
	 				min = inner;}
	 			}
	 			temp = a.get(outer);
	 			a.set(outer,a.get(min));
	 			a.set(min,temp);
	 			steps+=4;
	 		}
	 	}	
	 public void insertionSort(ArrayList <Comparable> a){
	 	for(int outer = 1;outer< a.size(); outer++){
	 		int position = outer;
	 		steps++;
	 		Comparable key = a.get(position);
	 		steps+=2;
	 		while(position>0 && a.get(position - 1).compareTo(key) > 0){
	 			steps+=2;
	 			steps+=2;
	 			a.set(position, a.get(position - 1));
	 			position--;
	 		}
	 		a.set(position, key);
	 		steps++;
	 	}
	 }
	 public void merge(ArrayList<Comparable>a,int first,int mid,int last){
	 int Aptr=first,Bptr=mid+1;
	
	 ArrayList<Comparable> c= new ArrayList<Comparable>(a);
	 for(int Cptr=first; Cptr <= last;Cptr++){	

	 if(Aptr > mid){
	 	steps+=2;
	 	c.set(Cptr,a.get(Bptr));
		Bptr++;
		}
	else
	if(Bptr > last){
			steps+=2;
		c.set(Cptr,a.get(Aptr));
		Aptr++;
		}
		else{
			steps+=3;
			if(a.get(Aptr).compareTo(a.get(Bptr)) < 0){
				steps+=2;
				c.set(Cptr,a.get(Aptr));
				Aptr++;
				}
			else{
		steps+=3;
			if(a.get(Aptr).compareTo(a.get(Bptr)) >= 0){
				steps+=2;
				c.set(Cptr,a.get(Bptr));
				Bptr++;
				}
		}}}
		for(int loop = first; loop <= last; loop++){
					a.set(loop, c.get(loop));
					steps+=2;}
				}
				//copy subsection back into original list, a

	 public void mergeSort(ArrayList <Comparable>a,int first, int last){
	 int mid=(first+last)/2;
	 if(first-last==0){
	 	;
	 }else{
 	if(last-first==1){
 			steps+=3;
	 		if(a.get(first).compareTo(a.get(last)) > 0){
	 			Comparable temp = 0;
	 			temp = a.get(first);
	 			a.set(first,a.get(last));
	 			a.set(last,temp);
	 			steps+=4;
	 		}}
	 else{
	 mid=(first+last)/2	;
	 mergeSort(a,first,mid);
	 mergeSort(a,mid+1,last);
	 merge(a,first,mid,last);
	 }}}
	 void quickSort(ArrayList<Comparable> a, int first,int last){
	 	int g=first,h=last;
	 	int midIndex = (first + last) / 2;
	 	steps++;
	 	Comparable dividingValue = a.get(midIndex);
	 	do{
	 		steps+=2;
	 		while(a.get(g).compareTo(dividingValue) < 0){
	 			g++;
	 			steps+=2;}
	 			steps+=2;
	 		while(a.get(h).compareTo(dividingValue) > 0){
	 			h--;
	 			steps+=2;}
	 		if(g <= h){
	 			steps+=4;
	 			Comparable temp = a.get(g);
	 			a.set(g,a.get(h));
	 			a.set(h,temp);
	 			g++;
	 			h--;
	 		}
	 	}while(g < h);
	 	
	 		if(h > first)
	 		quickSort(a,first,h);
	 		if(g < last)
	 		quickSort(a,g,last);
	 }
    
    public static void main(String[] args) {
    SortStep x = new SortStep();
    x.sortMenu();}
}
