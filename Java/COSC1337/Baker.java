class Baker implements Runnable {
   private Thread t;
   private String threadName;
   
   Baker( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
//Displays thread is created
   public void run() {
      System.out.println("Running " +  threadName );
      int choice = 0;
      while ((CherryData.totalnumC+AppleData.totalnumA)!=8) {
    	choice=(int)(Math.random()*2)+1;
    	if (!(CherryData.totalnumC==4)&&(choice==1)) {
    		CherryData.Add_Cherry();
    	}
    	if (!(AppleData.totalnumA==4)&&(choice==2)) {
    		AppleData.Add_Apple();
    	}
	 }
// Creates a random pie, and creates only one type of pie after he bakes 4 of the other kind
     System.out.println("Thread " +  threadName + " exiting.");
   }
//Displays when thread finishes
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
//If the baker thread hasnt started yet, it starts

}