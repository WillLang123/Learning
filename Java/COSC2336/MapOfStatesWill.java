/*Will Lang
 * COSC 2336
 * Instructor: JiangJiang Liu
 * Programming Assignment 4
 * Due: 9/20/23
 * Create a hashmap that retrieves capital based off state input
 */
import java.util.*;
public class MapOfStatesWill {

	public static void main(String[] args) {
		String answer;
		Scanner input = new Scanner(System.in);
		//Creates variable to store answers and scanner to get information
		Map<String, String> hashMap = new HashMap<>();
		String[][] stateCapital = {{"Alabama", "Montgomery"},{"Alaska", "Juneau"},{"Arizona", "Phoenix"},{"Arkansas", "Little Rock"},{"California", "Sacramento"},{"Colorado", "Denver"},{"Connecticut", "Hartford"},{"Delaware", "Dover"},{"Florida", "Tallahassee"},{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"},{"Idaho", "Boise"},{"Illinois", "Springfield"},{"Indiana", "Indianapolis"},{"Iowa", "Des Moines"},{"Kansas", "Topeka"},{"Kentucky", "Frankfort"},{"Louisiana", "Baton Rouge"},{"Maine", "Augusta"},{"Maryland", "Annapolis"},{"Massachusettes", "Boston"},{"Michigan", "Lansing"},{"Minnesota", "Saint Paul"},{"Mississippi", "Jackson"},{"Missouri", "Jefferson City"},{"Montana", "Helena"},{"Nebraska", "Lincoln"},{"Nevada", "Carson City"},{"New Hampshire", "Concord"},{"New Jersey", "Trenton"},{"New York", "Albany"},{"New Mexico", "Santa Fe"},{"North Carolina", "Raleigh"},{"North Dakota", "Bismark"},{"Ohio", "Columbus"},{"Oklahoma", "Oklahoma City"},{"Oregon", "Salem"},{"Pennslyvania", "Harrisburg"},{"Rhode Island", "Providence"},{"South Carolina", "Columbia"},{"South Dakota", "Pierre"},{"Tennessee", "Nashville"},{"Texas", "Austin"},{"Utah", "Salt Lake City"},{"Vermont", "Montpelier"},{"Virginia", "Richmond"},{"Washington", "Olympia"},{"West Virginia", "Charleston"},{"Wisconsin", "Madison"},{"Wyoming", "Cheyenne"}};
		for(int i = 0;i<50;i++) {
		hashMap.put((stateCapital[i][0]), stateCapital[i][1]);
		}
		//Creates Hashmap and uses a for-loop to store the data
		System.out.print("Please input a state: ");
		answer=input.nextLine();
		//asks and receives a state
		if(hashMap.containsKey(answer)) {
			System.out.println("The capital is: "+hashMap.get(answer));
		}else {
			System.out.println("Please try an actual state.");
		}
		//If the answer is a key in the map, it returns the value (or the capital of the state)
		//If input isn't a key in the map, it tells you it is not a real set
	}

}
