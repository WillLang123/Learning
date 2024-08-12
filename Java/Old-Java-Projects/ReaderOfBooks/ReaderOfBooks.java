/**
 * @(#)ReaderOfBooks.java
 *
 * ReaderOfBooks application
 *
 * @author 
 * @version 1.00 2019/10/29
 */
 
public class ReaderOfBooks {
	private static Library[] catalog = new Library[9];
	public ReaderOfBooks(){
		catalog[0] = new Library(new BookInfo("real title", "author", 12),3);
		catalog[1] = new Library(new BookInfo("Harry Potter","JK",105),5);
		catalog[2] = new Library(new BookInfo("Book Book", "Bookman",16),1);
		catalog[3] = new Library(new BookInfo("Book Book 2", "Bookman",17),2);
		catalog[4] = new Library(new BookInfo("Potter Harry","Rowling",104),1);
		catalog[5] = new Library(new BookInfo("Book Book 3", "Bookmanman",18),4);
		catalog[6] = new Library(new BookInfo("Original Book","Unoriginal",1),7);
		catalog[7] = new Library(new BookInfo("Computer Book", "Computer",12),5);
		catalog[8] = new Library(new BookInfo("Libro de Libro","Libromuchacho",19),19);
	}
	public static String thirdBook(){
		return catalog[2].getInfo().getTitle();
	}
	public static String leastPages(){
		int least=catalog[0].getInfo().getNumPages();
		String leastName = "";
		for(int a = 0; a<catalog.length;a++)
		if(catalog[a].getInfo().getNumPages() < least){
			least = catalog[a].getInfo().getNumPages();
			leastName=catalog[a].getInfo().getTitle();}
		return leastName;
	}
	public static String mostCopies(){
		int most=catalog[0].getNumCopies();
		String mostName = "";
		for(int a = 0; a<catalog.length;a++)
		if(catalog[a].getNumCopies() > most){
			most = catalog[a].getNumCopies();
			mostName=catalog[a].getInfo().getTitle();}
		return mostName;
	}
	public static int authorBooks(String a){
		int z = 0;
		for(int b=0;b<catalog.length;b++)
			if(catalog[b].getInfo().getAuthor().equals(a))
				z++;
			return z;
	}
	public static String[] Titles(String a){
		int z=0;
		for(int b =0; b< catalog.length;b++)
		if(catalog[b].getInfo().getAuthor().equals(a))
			z++;
		String[]title = new String[z];
		int g = 0;
		for(int c = 0; c<catalog.length;c++)
		if(catalog[c].getInfo().getAuthor().equals(a)){
			title[g] = catalog[c].getInfo().getTitle();
			g++;
			}
		return title;
			
		} 			
    public static void main(String[] args) {
   	ReaderOfBooks books = new ReaderOfBooks();
    System.out.println("The third book is: "+thirdBook());
    System.out.println("The book with the least number of pages is: " + leastPages());
    System.out.println("The book with the most copies is: " + mostCopies());
    System.out.println("The number of books done by Bookman is: " + authorBooks("Bookman"));
    String[]ans=Titles("Bookman");
    for(int a = 0; a<ans.length;a++)
    	System.out.println(ans[a]);
    }
}
