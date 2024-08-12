/*Will Lang
 * COSC 2336
 * Instructor: JiangJiang Liu
 * Programming Assignment 2
 * Due: 9/6/23
 * create a Generic method that sorts an ArrayList of comparable items
 */
import java.util.*;
//Imports scanner and another object that helps run ArrayList
public class GenericSortWill {
	public static <E> void print(ArrayList<E> list) {
	    for (int i = 0; i < list.size(); i++)
	      System.out.print(list.get(i) + " ");
	      System.out.println();
	} 
//This is a basic print method to save time and headaches
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
        int currentMinIndex;
        for (int i = 0; i < list.size()-1; i++) {
            // Find the minimum in the list[i+1..list.length−2]
            currentMin = list.get(i);
            currentMinIndex = i;
//This grabs current Minimum, which is the first object by default and stores it
               for (int j = i + 1; j < list.size(); j++) {
            	   if (currentMin.compareTo(list.get(j)) > 0) {
                   currentMin = list.get(j);
                   currentMinIndex = j;
//This compares the current minimum to the next ones in the list and replaces the current minimum if it finds a smaller object
            	   }
                 }
        if(currentMinIndex!=i){
                  list.set(currentMinIndex,list.get(i));
                  list.set(i,currentMin);
//This then grabs the current minimum and places it in the front of the arraylist
                }
              }
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>(10);
		ArrayList<String> b = new ArrayList<String>(5);
//Creates Scanner and Arraylists to run
		System.out.print("Enter 10 integers: ");
		for(int i=0;i<10;i++) {
			a.add(i,input.nextInt());
		}
		sort(a);
		print(a);
//Asks for input and puts it into the designated arraylist
//Then it sorts the arraylist and prints the result
		System.out.print("\nEnter 5 Strings: ");
		for(int j=0;j<5;j++) {
			b.add(j,input.next());
		}
		sort(b);
		print(b);
//Again, It asks for inputs and places it into the designated arraylist
//Then it sorts the arraylist and prints the result
	}

}
