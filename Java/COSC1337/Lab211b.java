public class Lab211b {
public static void main(String[] args) {
		
		// Create an empty stack of up to 10 Strings
		Stack names = new Stack(10);
		
		// Add 3 names to the stack
		names.push ("Elvis");
		names.push ("Johnny");
		names.push ("Ringo");
		
		// Pop off the names and print them (should print in reverse order they were pushed)
		while (names.count() >= 1)
			System.out.println (names.pop());
		
		System.out.println();
		
		// Create an empty queue of up to 10 Strings
		Queue cars = new Queue(10);
				
		// Add 3 cars to the queue
		cars.add ("Honda");
		cars.add ("Ford");
		cars.add ("Porsche");
		cars.add ("Toyota");
		cars.add ("Mustang");
				
		// Remove the car names and print them
		while (cars.count() >= 1)
			System.out.println (cars.remove());
	}
}
