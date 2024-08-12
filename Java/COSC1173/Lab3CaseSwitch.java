/* ***********************************************
 * COSC 1173 Programming Lab
 * Name: William Lang
 * Date: 8/22/2022
 * Creates a random interger and displays an English
 * month depending on the number.
 * *********************************************** */
public class Lab3CaseSwitch {

	public static void main(String[] args) {
		int number = (int)(Math.random()*12 +1);
		//Creates a new random integer
		System.out.println("The random number is " + number);
		//displays new random integer
		switch(number) {
		case(1):
			System.out.println("It is January");
		//displays month as January if random number is 1
		break;
		case(2):
			System.out.println("It is February");
		//displays month as February if random number is 2
		break;
		case(3):
			System.out.println("It is March");
		//displays month as March if random number is 3
		break;
		case(4):
			System.out.println("It is April");
		//displays month as April if random number is 4
		break;
		case(5):
			System.out.println("It is May");
		//displays month as May if random number is 5
		break;
		case(6):
			System.out.println("It is June");
		//displays month as June if random number is 6
		break;
		case(7):
			System.out.println("It is July");
		//displays month as July if random number is 7
		break;
		case(8):
			System.out.println("It is August");
		//displays month as August if random number is 8
		break;
		case(9):
			System.out.println("It is September");
		//displays month as September if random number is 9
		break;
		case(10):
			System.out.println("It is October");
		//displays month as October if random number is 10
		break;
		case(11):
			System.out.println("It is November");
		//displays month as November if random number is 11
		break;
		case(12):
			System.out.println("It is December");
		//displays month as December if random number is 12
		break;
		}
	}
}
