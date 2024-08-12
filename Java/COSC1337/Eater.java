class Eater implements Runnable {
   private Thread t;
   private String threadName;
   
   Eater( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
//Displays when it is created
   public void run() {
      System.out.println("Running " +  threadName );
      while (!((CherryData.totalnumC==4)&&(AppleData.totalnumA==4))) {
    	  if (CherryData.num_cherry == 2) {
    		  CherryData.Eat_All_Cherry();
    	  }
    	  if (AppleData.num_apple == 2) {
    		  AppleData.Eat_All_Apple();
    	  }
//While the eater hasnt eaten 4 of each pie type, it checks if there are a pair of a certain pie is available
//if there is a pair available, it eats 2, and displays that
    if(CherryData.totalnumC==4) {
		System.out.println("Thread " +  threadName + " finished eating apple pies.");
	}
    if(CherryData.totalnumC==4) {
    	System.out.println("Thread " +  threadName + " finished eating cherry pies.");
    }
//Once eater has eaten 4 of a type of pie, it displays that information
  }
      System.out.println("Thread " +  threadName + " exiting.");
}
//Displays that the thread has stopped
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
 //If the eater thread hasnt started yet, it starts
}