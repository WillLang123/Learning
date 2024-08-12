
class Library {
	private BookInfo info;
	private int numCopies;
	
	public Library(BookInfo b , int c){
		info = b;
		numCopies = c;
	}
	public void setNumCopies(int n ){ numCopies = n;}
	public int getNumCopies(){return numCopies;}
	public BookInfo getInfo(){return info;}
}
