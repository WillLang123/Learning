
public class Queue {
	String [] data;
	int max;		// max number of entries this queue can hold
	int nEntries;	// number of current entries in this stack
	int front;
	int rear;
	
	// Constructor
	Queue (int max) {
		data = new String [max];
		front = 0;			// when front == rear, the queue is empty
		rear = 0;
		nEntries = 0;
		this.max = max;
	}
	// Add operation
	void add (String s) {
			if (nEntries < max) {
				data[rear] = s;
				rear--;
				nEntries++;
				if(rear<0)
					rear=max-1;
			//  add the item at data[rear]
			// subtract 1 from rear, if -1, set rear to max-1
			// add 1 from nEntries
		}	
	}
	// Remove operation
	String remove () {
		String s = null;
		if (nEntries >= 1) {
			s = null;
			s = data[front];
			front--;
			nEntries--;
			if(front<0) {
				front=max-1;
				}
			// ADD CODE HERE
			// get the item at data[front]
			// subtract 1 from front, if -1, set front to max-1
			// subtract 1 from nEntries
			
		}
		return s;
	}
	// Peek operation
	String peek () {
		String s = null;
		if (nEntries >= 1)
			s = data[front-1];
		return s;
	}
	// Clear the queue
	void clear () {
		for (int i=0; i<max; i++)
			data[i] = null;
		nEntries = 0;
		front = 0;
		rear = 0;
		// Set front and rear == 0 (denoting the queue is empty)
		// nEntries = 0;
		
		
	}
	// Return the current number of entries in this queue
	int count () {
		return nEntries;
	}
}
