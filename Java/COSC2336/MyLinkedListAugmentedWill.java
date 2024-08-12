/*Will Lang
 * COSC 2336
 * Instructor: JiangJiang Liu
 * Programming Assignment 7
 * Due: 10/11/23
 * Implement new augmented linked list class that overrides mylist methods
 */
import java.util.*;
public class MyLinkedListAugmentedWill<E> extends MyLinkedList<E>{
	/** Create a default list */
	  public MyLinkedListAugmentedWill() {
	  }

	  /** Create a list from an array of objects */
	  public MyLinkedListAugmentedWill(E[] objects) {
	    super(objects);
	  }
	  /** Return true if this list contains the element e */
	  @Override 
	  public boolean contains(E e) {
	    Node<E> current = head;
	    for (int i = 0; i < size; i++) {
	      if (current.element.equals(e))
	        return true;
	      current = current.next;
	    }

	    return false;
	  }
	  @Override /** Return the element at the specified index */
	  public E get(int index) {
	    checkIndex(index);
	    Node<E> current = head;

	    for (int i = 0; i < size; i++) {
	      if (i == index)
	        return current.element;
	      current = current.next;
	    }

	    return null;
	  }
	   /** Return the index of the head matching element in 
	   *  this list. Return -1 if no match. */
	 @Override
	  public int indexOf(E e) {
	    Node<E> current = head;
	    for (int i = 0; i < size; i++) {
	      if (current.element.equals(e))
	        return i;
	      current = current.next;
	    }
	    return -1;
	  }
	   /** Return the index of the last matching element in 
	   *  this list. Return -1 if no match. */
	 @Override
	  public int lastIndexOf(E e) {
	    Node<E> current = head;
	    int lastIndex = -1;
	    for (int i = 0; i < size; i++) {
	      if (current.element.equals(e))
	        lastIndex = i;
	      current = current.next;
	    }
	    return lastIndex;
	  }

	  /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  @Override
	  public E set(int index, E e) {
	    checkIndex(index);
	    Node<E> current = head;
	    Node<E> newNode = new Node(e);
	    E oldValue = null;
	    for (int i = 0; i < size; i++) {
	      if (i == index-1) {
	    	  oldValue = current.element;
	    	  newNode.next = current.next;
		      current.next = newNode;
		      
	        break;
	      }
	      current = current.next;
	    }
	    return oldValue;
	  }

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a;
		int b;
		String[] c = new String[] {"Mike", "Jim", "Alice", "George", "Stevie", "Cheryl", "George", "Jane", "Ella", "Jenny", "Kathy", "Jane"};
		MyLinkedListAugmentedWill<String> list = new MyLinkedListAugmentedWill<String>(c);
		System.out.println("Original list:");
		System.out.println(list);
		System.out.print("Enter a name: ");
		a=input.next();
		System.out.print("Enter an index at which to store this name: ");
		b=input.nextInt();
		list.set(b, a);
		System.out.println("\nRevised list:");
		System.out.println(list);
		System.out.println("List contains Sue: "+list.contains("Sue")+"\nItem at index 3: "+list.get(3)+"\nIndex of George: "+list.indexOf("George")+"\nLast index of George: "+list.lastIndexOf("George"));
		

	}

}
