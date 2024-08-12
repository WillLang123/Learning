/*Will Lang
 * COSC 2336-01
 * Assignment 1
 * Due 8/30/23
 * Submitted 8/23/23
 * Description: The objective is to creative a method that uses recursion to reverse a string.
 */
import java.util.Scanner;
//imports scanner to input string
public class RecursiveReverseString {
	public static String reverse(String b) {
		if(b==null||(b.length()<=1)){
		return b;
//if the input in the method is nothing or a letter, it just returns it
	}else {
		return reverse(b.substring(1)) + b.charAt(0);
//if the input is more than one letter, like the String "word" it returns reverse(ord) + w;
//This breaks apart the first letter of the string and concatenates it to
//the back of the word it was told to reverse, so over time, it looks like reverse(d)+"r"+"o"+"w",
//which makes the word output backwards
	}
	}
	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		String r;
//Creates Scanner and variable to input String
		System.out.println("Choose a word to reverse: ");
		r=q.next();
//Grabs inputed string and stores it
		System.out.println("The reverse of "+r+" is "+reverse(r));
//Runs the String
	}
}
