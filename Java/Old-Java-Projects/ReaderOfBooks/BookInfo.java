
class BookInfo {
	private String title;
	private String author;
	private int numPages;
	
	public BookInfo(String t, String a, int n){
		title = t;
		author = a;
		numPages = n;
	}
	public String toString(){
		return title + " by " + author;
	}
	public String getTitle(){return title;}
	public int getNumPages(){return numPages;}
	public String getAuthor(){ return author;}
	}
