import java.util.Arrays;
//This allows us to use the sort method instead of making our own
public class Lab21b {
	public static int[] SetUpArray() {
		int[] temp = new int[10000];
		for(int i=0;i<10000;i++) {
			temp[i]=((int)((Math.random()*999)-1));
		}
		//Sets up array and puts 10000 random numbers ranging from 1-1000
		Arrays.sort(temp);
		//This sorts the array
		return temp;
	}
	public static void SearchArray(int[] focus,int[] prime) {
		int[] occur = new int[168];
		//This creates an array with the same length as the prime number array
		//This allows us to put the number of occurrences in the corresponding prime number position in the array
		int primeCounter=0,bigPrime=0,smallPrime=1000,laterLarge=0,occurMost=0;
		double primePercent = 0;
		//Creates variables
		for(int i=0; i<(focus.length);i++) {
			for(int j=0; j<(prime.length);j++) {
				if(focus[i]==prime[j]) {
					occur[j]++;
		//if the number from the setup array is prime, it puts the occurrence in the corresponding place
					primeCounter++;
		//Counter increases every time the number is prime
					if(focus[i]>bigPrime)
						bigPrime=focus[i];
		//if the number is the biggest prime seen, then bigPrime become that number
					if(focus[i]<smallPrime)
						smallPrime=focus[i];
		//Same situation but if the prime number is the smallest seen
				}
			}
		}
		for(int m:occur) {
			if(m>laterLarge)
				laterLarge=m;
		}
		//This finds the highest occurrence of prime numbers based off our psuedo-hashmap
		for(int n:occur) {
			if(n==laterLarge)
				occurMost=prime[n];
		}
		//It finds the first prime that occurred the most in case of more than one prime having the same occurrence
		
		primePercent=primeCounter/10000.0*100;
		//This calculates the percentage of prime numbers in the array
		System.out.println("The number of prime numbers in the array is "+primeCounter+"\nThe percentage of prime numbers in the array is "+primePercent+"%\nThe smallest prime number found was "+smallPrime+"\nThe largest prime number found was "+bigPrime+"\nThe prime number that occurred the most was "+occurMost);
		//This returns a statement disclosing the information
	}
	
	public static void main(String[] args) {
		int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997};
		//Creates the static array of primes
		int[] test = SetUpArray();
		//Creates random Array with 10000 numbers
		SearchArray(test,primes);
		//Applies Search method
		}

}
