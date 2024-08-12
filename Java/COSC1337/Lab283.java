import java.util.*;
import java.io.*;
public class Lab283 {
	void sort(List<Integer> arr)

    {

        int n = arr.size();

        for (int i = 1; i < n; ++i) {

            int key=arr.get(i);

            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {

                arr.set(j+1,arr.get(j));

                j = j - 1;

            }

            arr.set(j+1,key);

        }

    }
	static int binarySearch(List<String> arr, String x){
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr.get(m));
            // Check if x is present at mid
            if (res == 0)
                return m;
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> worda = new ArrayList<String> ();
		List<String> proa = new ArrayList<String> ();
		File word = new File("cmudict_0_6.txt");
		try {
		Scanner read = new Scanner(word);
		for(int i=1;i<50;i++) {
			read.nextLine();
		}
		int index=0;
//Creates lists, Scanners, and Files to mess with and removes first 49 lines of fluff in txt
		while(read.hasNext()){
		String s = read.next();
		String p = read.nextLine();
		worda.add(s);
		proa.add(p);
		index++;
		}
//Grabs String values and adds to lists
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
//This helps deal with filenotfoundexception in program
		System.out.println("Successfully scanned "+worda.size()+" words.");
//This tells you how many line were successfully converted (the text document given contains 127052 word with pronunciations)
		System.out.println("What word do you want pronounced?");
		String search = input.next();
//Asks for what word you want and stores it as a string
		search=search.toUpperCase();
		int index=binarySearch(worda,search);
//Converts string into all uppercase letters to make search accurate
// finds index of the word in the array using binary search
		System.out.println("The pronunciation is: "+ proa.get(index));
//Uses found index from binary search to output pronunciation
		
		

	}

}
