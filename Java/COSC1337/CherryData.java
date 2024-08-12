public class CherryData {
	static int num_cherry = 0;
	static int totalnumC = 0;
	static Object o = new Object ();
//Creates counter for current number of cherry pies and total number of cherry pies
	static void Add_Cherry () {
		synchronized (o) {
			num_cherry++;
			totalnumC++;
			System.out.println ("A new cherry pie is ready");
		}
	}
//Adds a cherry pie to total and current pies
	static void Eat_All_Cherry () {
		synchronized (o) {
			num_cherry = 0;
			System.out.println ("Eating all cherry pies");
		}
	}
	//Resets current number of cherry pies to 0 and displays that information
}
