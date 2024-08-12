import java.util.*;
//this allows us to us the sort method
public class Lab27 {
	public static int[] generateArr(int length) {
		int[] test = new int[length];
		for(int i = 0;i<test.length;i++) {
			test[i]=(int)((Math.random()*1000)+1);
		}
		return test;
	}
	//This method essentially creates an array filled with a random amount of integers ranging from 1-1000
	public static long getTimeSort(int[] a) {
		long startTime = System.currentTimeMillis();
		Arrays.sort(a);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		return executionTime;
	}
	//This gets starts the time, sorts the array, gets an end time, and outputs the difference
	public static void main(String[] args) {
		int[] test1 = generateArr(50000);
		int[] test2 = generateArr(100000);
		int[] test3 = generateArr(150000);
		int[] test4 = generateArr(200000);
		int[] test5 = generateArr(250000);
		int[] test6 = generateArr(300000);
	//Creates 6 different sized arrays and uses array generator to fill it with integers
		System.out.println("Array Size | Sort time");
		System.out.println("______________________");
		System.out.println("50,000      | "+getTimeSort(test1));
		System.out.println("100,000     | "+getTimeSort(test2));
		System.out.println("150,000     | "+getTimeSort(test3));
		System.out.println("200,000     | "+getTimeSort(test4));
		System.out.println("250,000     | "+getTimeSort(test5));
		System.out.println("300,000     | "+getTimeSort(test6));
	//This outputs the sorting time of each array
	}

}
