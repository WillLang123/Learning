public class TestThread {
	public static void main(String args[]) {
		  Eater Eater = new Eater( "The Hungry Customer");
	      Eater.start();
//Creates Eater thread and starts it
		  Baker Baker = new Baker( "The Baker");
	      Baker.start();
//Creates Baker thread and starts it
		  
	   }   
}
