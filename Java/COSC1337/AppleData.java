public class AppleData {
	static int num_apple = 0;
	static int totalnumA = 0;
	static Object o = new Object ();
//Creates counter for current number of apple pies and total number of apple pies
	static void Add_Apple () {
		synchronized (o) {
			num_apple++;
			totalnumA++;
			System.out.println ("A new apple pie is ready");
		}
	}
//Adds an apple pie to total and current pies
	static void Eat_All_Apple () {
		synchronized (o) {
			num_apple = 0;
			System.out.println ("Eating all apple pies");
		}
	}
//Resets current number of apple pies to 0 and displays that information
}
