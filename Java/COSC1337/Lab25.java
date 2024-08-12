import java.util.*;
public class Lab25 {
public static void reverseDisplay(String a) {
if(a.length()<=1){
	System.out.print(a);
}else {
	System.out.print(a.charAt(a.length()-1));
	reverseDisplay(a.substring(0,a.length()-1));
}
}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String s;
		System.out.println("Please input a string: ");
		s=input.next();
		reverseDisplay(s);
	}
}
