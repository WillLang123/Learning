/*Will Lang
 * COSC 2336
 * Instructor: JiangJiang Liu
 * Programming Assignment 11+12
 * Due: 11/15/23
 * Implement a weighted graph so that it can take file inputs, and show the shortest paths.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ShortestPathsWill {
	public static void main(String[] args) {
		String filename;
		Scanner input = new Scanner(System.in);
		int count;
		System.out.println("Please enter the name of the file: ");
		filename=input.next();
		//grabs file name
		    	File word = new File(filename+".txt");
				try {
				Scanner read = new Scanner(word);
		// uses scanner to grab from mentioned file and tries to process in it exception catcher
				count=read.nextInt();
				String[] names = new String[count];
				for(int i = 0;i<count;i++) {
					names[i]= "Vertex "+i;
				}
				//gives vertices names
				int pieces[] = new int[3];
				int[][] edges = {};
				//creates blank edge matrix, piece array, and number of vertices
				WeightedGraph<String> graphtest =
					        new WeightedGraph<>(names, edges);
				//creates weighted graph
				System.out.println(read.nextLine());
				while(read.hasNext()){
					String[] strs = read.nextLine().trim().split("\\s\\|\\s");
				    for (int i = 0; i < strs.length; i++) {
				    	String[] strs2 = strs[i].trim().split(",\\s");
				    	for (int j = 0; j < strs2.length; j++) {
				    		pieces[j] = Integer.parseInt(strs2[j]);
				    	}
				    	graphtest.addEdge(pieces[1],pieces[0],pieces[2]);
				    	graphtest.addEdge(pieces[0],pieces[1],pieces[2]);
				   //In short, it breaks the string lines into the sets of X,Y,Z ,then it splits that into usable ints
				    }
				}
				System.out.println("Successfully scanned "+count+" vertices and their edges.");
				System.out.println("The number of vertices in graphtest: "
				        + graphtest.getSize());
		      System.out.println("The edges for graphtest:");
		      graphtest.printWeightedEdges();
		      
		      WeightedGraph<String>.ShortestPathTree tree1 = graphtest.getShortestPath(graphtest.getIndex("Vertex 1"));                                           
		      tree1.printAllPaths();

		      // Display shortest paths from Houston to Chicago
		      System.out.print("Shortest path from Vertex 0 to Vertex 1: ");
		      java.util.List<String> path = tree1.getPath(graphtest.getIndex("Vertex 0"));
		      for (String s: path) {
		        System.out.print(s + " - ");
		      }
		      //outputs everything needed
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
		//This helps deal with filenotfoundexception in program
		    }
		  }   
