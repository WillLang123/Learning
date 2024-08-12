/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Plays with String Objects
 * *********************************************** */
public class Lab4Strings {

	public static void main(String[] args) {
		String college = new String("Podunk College");
		//Creates string named college
		String town = new String("Anytown, USA");
		//Creates string named town
		int stringLength;
		String change1, change2, change3;
		//Creates integer and String variables to use later
		stringLength= college.length();
		//Makes stringLength the character length of "Podunk College", which is 14 characters
		System.out.println(college + " contains " + stringLength + " characters.");
		//displays length of String college
		change1 = college.toUpperCase();
		//Makes change1 the String "PODUNK COLLEGE"
		change2 = change1.replace('O','*');
		//Makes change2 the String "P*DUNK C*LLEGE"
		change3 = college.concat(town);
		//Makes change3 the concatenated String of the variables college and town
		System.out.println("The final string is " + change3);
		//displays the String change3
		
	}
}
