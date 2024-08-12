import java.util.*;
import java.io.*;
public class Lab26 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 Boolean gate = true;
	        System.out.print("Enter year: ");
	        String year = input.next();

	        System.out.print("Enter gender: ");
	        String gender = input.next();

	        System.out.print("Enter name: ");
	        String name = input.next();
//Inputs year, gender, and name
	        
	        File file = new File("babynamesranking" + year + ".txt");
	        if (!file.exists()) {
	            System.out.println("No record for " + year);
	            gate = false;
	        }
//Checks if the file exists and what follows

	        int rank = 0;
	        if(gate) {
	        	try {
	            Scanner read = new Scanner(file);
	            while (read.hasNext()) {

	                String s = read.nextLine();
	                String[] temp = s.split(" ");
//if the file exists, input the line, split between the spaces of the file
	                if (gender.equals("M") && temp[1].contains(name))
	                    rank = Integer.parseInt(temp[0]);
	                else if (temp[3].contains(name))
	                    rank = Integer.parseInt(temp[0]);
	            }
//gets rank of boy/girl name if it is the name inputed
	        }catch(FileNotFoundException e) {
	        	e.printStackTrace();
	        }
//catches any errors
	        }

	        if (rank == 0) {
	            System.out.println("The name "+name+" is not ranked in year " + year);
	        } else {

	            System.out.println(name+" is ranked #"+rank+" in year "+ year);
	        }
//If there is a rank, then it says what it is, or it says the name isnt ranked
	}

}
