import java.util.*;
//imports scanner
public class Lab29b {

	public static void main(String[] args) {
		int counter=1,index=-1,input,value=0,bigcount=0,bigvalue=0;
		boolean x=true;
		Scanner bob=new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
//Creates variables needed to input into the list or for the algorithm
		System.out.println("Please input a list of numbers followed by a zero: ");
		while(x) {
			input=bob.nextInt();
			list.add(input);
			if(input==0)
				x=false;
		}
//Inputs every value into the list until the input is 0
		for(int i=1;i<list.size();i++) {
//Goes through the list once, making it O(n)
			 if(list.get(i).equals(list.get(i - 1))) {
//if there are sequential numbers numbers, it goes to work
				 if(list.get(i)!=value) {
				 value=list.get(i);
				 counter=1;
				 counter++;
//if the sequential numbers are new, it sets them up as the current sequential numbers being recorded
				 }else if(list.get(i)==value) {
				 counter++;
//if the sequential numbers are not new, it continues to count how many are in a row
				 }
				 if(counter>bigcount) {
					 bigvalue=value;
					 bigcount=counter;
					 index=i-bigcount+1;
				 } 
//if the current sequential numbers are more than the previous ones,
//it makes them the big sequential values, which are not affected by the loop unless
// a bigger sequential number lists appears. It essentially stores the data of the current biggest sequential number group
			 }
		}
		System.out.println("The longest same number sequence starts at index "+index+" with "+bigcount+" values of "+bigvalue);
//This just displays the output.
	}

}
