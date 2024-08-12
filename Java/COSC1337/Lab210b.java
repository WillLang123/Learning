public class Lab210b {
	public static void printArr(int[] list) {
		System.out.print("[");
		for(int i=0;i<list.length-1;i++)
			System.out.print(list[i]+", ");
		System.out.println(list[list.length-1]+"]");
	}
//This was created for the convenience of printing an array
	public static void printArr(double[] list) {
		System.out.print("[");
		for(int i=0;i<list.length-1;i++)
			System.out.printf("%.2f, ",list[i]);
		System.out.printf("%.2f]\n",list[list.length-1]);
	}
//This was also created, but it is for doubles
	public static boolean ordered (int[] list) {
		int counter=1;
		for(int i=1;i<list.length;i++) {
			if(list[i-1]<=list[i])
				counter++;
		}
		return counter==list.length;
	}
//This checks if the function is in ascending order
	public static boolean ordered (int[] list, boolean ascending) {
		int counter=1;
		for(int i=1;i<list.length;i++) {
			if(list[i-1]<=list[i])
				counter++;
		}
		return ascending?counter==list.length:counter==1;
	}
//This checks if the function is in ascending or descending order depending on the boolean given
	public static boolean ordered (double[] list) {
		int counter=1;
		for(int i=1;i<list.length;i++) {
			if(list[i-1]<=list[i])
				counter++;
		}
		return counter==list.length;
	}
//This checks if the function is in ascending order
	public static boolean ordered (double[] list, boolean ascending) {
		int counter=1;
		for(int i=1;i<list.length;i++) {
			if(list[i-1]<=list[i])
				counter++;
		}
		return ascending?counter==list.length:counter==1;
	}
//This checks if the function is in ascending or descending order depending on the boolean given
public static void bsort(int arr[]){
	int n = arr.length;
	for (int i = 0; i < n - 1; i++)
	  for (int j = 0; j < n - i - 1; j++)
	    if (arr[j] > arr[j + 1]) {
	       // swap arr[j+1] and arr[j]
	       int temp = arr[j];
	       arr[j] = arr[j + 1];
	       arr[j + 1] = temp;
	    }
}
//This a very basic bubble sort the switches the place of numbers if the two numbers are not in the correct order
public static void bsort(int arr[],boolean ascending){
	int n = arr.length;
	for (int i = 0; i < n - 1; i++)
	  for (int j = 0; j < n - i - 1; j++)
		 if(ascending) {
	    if (arr[j] > arr[j + 1]) {
	       // swap arr[j+1] and arr[j]
	       int temp = arr[j];
	       arr[j] = arr[j + 1];
	       arr[j + 1] = temp;
	    }
	}else {
		if (arr[j] < arr[j + 1]) {
		   // swap arr[j+1] and arr[j]
		   int temp = arr[j];
		   arr[j] = arr[j + 1];
		   arr[j + 1] = temp;
		    }
	}
}
//This is the same as bsort, but if the input is false, it switches the comparison signs
//this causes it to flip so that it goes in descending order

public static void bsort (double[] list) {
	int n = list.length;
	for (int i = 0; i < n - 1; i++)
	  for (int j = 0; j < n - i - 1; j++)
	    if (list[j] > list[j + 1]) {
	       // swap list[j+1] and list[j]
	       double temp = list[j];
	       list[j] = list[j + 1];
	       list[j + 1] = temp;
	    }
}
//This is the same as bsort, but it accounts for doubles
public static void bsort (double[] list, boolean ascending) {
	int n = list.length;
	for (int i = 0; i < n - 1; i++)
	  for (int j = 0; j < n - i - 1; j++)
		 if(ascending) {
	    if (list[j] > list[j + 1]) {
	       // swap list[j+1] and list[j]
	       double temp = list[j];
	       list[j] = list[j + 1];
	       list[j + 1] = temp;
	    }
	}else {
		if (list[j] < list[j + 1]) {
		   // swap list[j+1] and list[j]
		   double temp = list[j];
		   list[j] = list[j + 1];
		   list[j + 1] = temp;
		    }
	}	
}
//This is a double bsort the changes to descending mode if the given boolean is false
	public static void main(String[] args) {
	int[] test1 = new int[10];
	double[]test2 = new double[10];
	//Creates two empty arrays of unique types
	for(int i = 0;i<test1.length;i++) {
		test1[i]=(int)((Math.random()*9)+1);
	}
	//This fills the array with random numbers
	System.out.println("Before sort int array: ");
	printArr(test1);
	//Prints array before sorting
	System.out.println("Is the array sorted?: "+ordered(test1));
	bsort(test1);
	//This displays if the array is sorted and then sorts it
	printArr(test1);
	System.out.println("Is the array sorted?: "+ordered(test1));
	//This displays the sorted one and verifies that it is sorted in ascending order
	for(int i = 0;i<test2.length;i++) {
		test2[i]=((Math.random()*9)+1);
	}
	//This fills the double array with random numbers
	System.out.println("Before sort double array: ");
	printArr(test2);
	//Prints array before sorting
	System.out.println("Is the array sorted?: "+ordered(test2,false));
	bsort(test2,false);
	//This shows if the array is sorted and sorts it in descending order
	printArr(test2);
	System.out.println("Is the array sorted?: "+ordered(test2,false));
	//Displays sorted double array and verifies that the array is sorted in descending order
	}

}
