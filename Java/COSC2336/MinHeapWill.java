/*Will Lang
 * COSC 2336
 * Instructor: JiangJiang Liu
 * Programming Assignment 6
 * Due: 10/4/23
 * Revise the Heap class in Listing 23.9 to implement a min-heap sorter.
 */

 public class MinHeapWill<E extends Comparable<E>> {
		  private java.util.ArrayList<E> list = new java.util.ArrayList<>();
//Creates generic Heap class for integer and Strings
		      /** Create a default heap */ 
		  public MinHeapWill() {
		      }

		      /** Create a heap from an array of objects */
		  public MinHeapWill(E[] objects) {
		        for (int i = 0; i < objects.length; i++)
		          add(objects[i]);
		      }
//add objects to heap when object is created with those parameters
		      /** Add a new object into the heap */ 
		  public void add(E newObject) {
		  list.add(newObject); // Append to the heap 
		        int currentIndex = list.size()-1; // The index of the last node 

		        while (currentIndex > 0) {
		          int parentIndex = (currentIndex-1) /  2;
		          // Swap if the current object is greater than its parent 
		          if (list.get(currentIndex).compareTo(
		              list.get(parentIndex)) < 0) {
		  E temp = list.get(currentIndex);
		            list.set(currentIndex, list.get(parentIndex));
		            list.set(parentIndex, temp);
//Very similar to the add method we copy and pasted but flipped the signs so that
//the copied max heap becomes a min heap
		          }
		          else 
		  break; // The tree is a heap now 

		          currentIndex = parentIndex;
		        }
		      }

		      /** Remove the root from the heap */ 
		  public E remove() { 
		        if (list.size() == 0)  return null; 
		   E removedObject = list.get(0);
		  list.set(0, list.get(list.size()-1));
		  list.remove(list.size()-1);
		  int currentIndex = 0;
		        while (currentIndex < list.size()) {
		  int leftChildIndex = 2 * currentIndex + 1;
		          int rightChildIndex = 2 * currentIndex + 2;
		     
		          // Find the maximum between two children 
		          if (leftChildIndex >= list.size()) break; // The tree is a heap 
		          int maxIndex = leftChildIndex;
		          if (rightChildIndex < list.size()) {
		  if (list.get(maxIndex).compareTo(
		                list.get(rightChildIndex)) > 0) {
		              maxIndex = rightChildIndex;
//Removes object from heap
		            }
		          }  
		     
		          // Swap if the current node is less than the maximum 
		          if (list.get(currentIndex).compareTo(
		              list.get(maxIndex)) > 0) {
		            E temp = list.get(maxIndex);
		  list.set(maxIndex, list.get(currentIndex)); 
		            list.set(currentIndex, temp); 
		            currentIndex = maxIndex; 
//Similar to pasted maxheap remove method, but the signs are flipped to make it a minheap method
		          } 
		          else 
		            break; // The tree is a heap 
		        }

		        return removedObject;
		      }

		      /** Get the number of nodes in the tree */ 
		      public int getSize() {
		        return list.size();
		      }

	public static void main(String[] args) {
		/** test with Integers */
		Integer[]myIntegers={8, 9, 2, 3, 4, 1, 5, 6, 7};
		System.out.println("Unsorted Integers in the array: ");
	for (int i = 0; i <myIntegers.length; i++)
		System.out.print(myIntegers[i] + " ");
		System.out.println();
		MinHeapWill<Integer> heap = new MinHeapWill<Integer>(myIntegers);
		System.out.println("Sorted Integers: ");
	while (heap.getSize() > 0)System.out.print(heap.remove() + " ");
		System.out.println();
		//Creates integer array, displays it, adds content to minheap, and displays the sorted heap
		/** test with Strings */
		String[]myStrings = {"Computer " , "Science ", "Rocks "};
		System.out.println("Unsorted Strings in the array: ");
	for (int i = 0; i <myStrings.length; i++)
		System.out.print(myStrings[i]);
		System.out.println();
		System.out.println("Sorted Strings: ");
		MinHeapWill<String> stringHeap = new MinHeapWill<String>(myStrings);
	while (stringHeap.getSize() > 0)
		System.out.print(stringHeap.remove());
	//THis is the exact same as the integer but we display and sort strings using the minheap
		}
}