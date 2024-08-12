
public class Lab23 {
	public static void bin2Dec(String str){
		try {
			for(int i=0;i<str.length();i++){
		        if(!(str.charAt(i)=='1'||str.charAt(i)=='0'))
			throw new NumberFormatException("The number entered is not in binary.");
//if the character at any index is not 1 or 0, it throws a number format exception
			}
			int bob = Integer.parseInt(str,2);
//returns binary string as decimal
			System.out.print(bob);
//returns decimal
		}catch (NumberFormatException e) {
			System.out.println("Warning: "+e.getMessage());
			//if a number format exception is thrown, it displays the error message
		}
	}
	public static void main(String[] args) {
	bin2Dec("1010");
	System.out.println();
	bin2Dec("24");
	}

}
