/*Will Lang
 * COSC 2336
 * Instructor: JiangJiang Liu
 * Programming Assignment 5
 * Due: 9/27/23
 * Create a program that has O(n) complexity to find the matching substring
 */
import java.util.*;
public class PatternMatchingWill {
	public static void findSubstring(String big,String small) {
		int index = -1;
	    for(int i = 0; i < big.length() - small.length(); i++) {
	        if(big.substring(i, i + small.length()).equals(small)){
	            index = i;
	        }
	    }
	    //Manually checks the word is every substring with the same length to see if any match
	    if(index==-1) {
	    	System.out.println("unmatched");
	    }else {
	    	System.out.println("matched at index "+index);
	    }
	    //Outputs code
	    //Since the only part that affect time complexity is the single for-loop,
	    //The time complexity is O(n)
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String bigword,smallword;
		System.out.print("Please input the bigger string: ");
		bigword = input.nextLine();
		System.out.print("\nPlease input the substring: ");
		smallword = input.nextLine();
		findSubstring(bigword,smallword);
		//Creates Scanners, Inputs strings using scanner and runs the method

	}

}
