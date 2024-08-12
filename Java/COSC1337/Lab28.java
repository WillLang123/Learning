import java.util.*;
import java.io.*;
public class Lab28 {
//Create hashmap or object array to make binary search easier
//insert binary search method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> lab = new HashMap<>();
		File text = new File("cmudict_0_6.txt");
		try {
		Scanner read = new Scanner(text);
		for(int i=1;i<50;i++) {
			read.nextLine();
		}
//Creates HashMap, Scanners, and Files to mess with and removes first 49 lines of fluff in txt
		while(read.hasNext()){
		String s = read.nextLine();
        String[] temp = s.split("  ");
		lab.put(temp[0],temp[1]);
		}
//Grabs String values from file and adds to HashMap
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
//This helps deal with filenotfoundexception in program
		System.out.println("Successfully scanned "+lab.size()+" words.");
//This tells you how many line were successfully converted (the text document given contains 127052 word with pronunciations)
		System.out.println("What word do you want pronounced?");
		String search = input.next();
//Asks for what word you want and stores it as a string
		search=search.toUpperCase();
//Converts string into all uppercase letters, since the indexes of the hashmap are all capitalized
		System.out.println("The pronunciation is: "+ lab.get(search));
//(Help from a tutor)The hashmap uses the get method instead of binary search, since the hashmap method is much faster with a speed of O(1)
//Meanwhile binary search has a worst case of O(log(n))
		
		

	}

}
