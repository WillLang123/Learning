
public class Item implements Comparable<Item>{
	private int myId;
	private int myInv;
	public Item(int id, int inv){
		myId=id;
		myInv=inv;
	}
	public int getId(){
		return myId;
	}
	public int getInv(){
		return myInv;
	}
	public int compareTo(Item other){
		if(myId==((Item)other).getId())
			return 0;
		else
			if(myId<((Item)other).getId())
			return -1;
		else
			return 1;
	}
	public boolean equals(Item other){
		return(myId==((Item)other).getId());
	}
	public String toString(){
		return myId + "          " + myInv;
	}
}

