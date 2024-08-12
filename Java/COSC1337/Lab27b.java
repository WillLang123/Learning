
public class Lab27b {
public static void letters(char c) {
	if('A'==c) {
		System.out.print(c);
//if the char is A, then it just prints it
	}else {
//if not
		letters((char)(c-1));
//It calls letters and decreases the input by one ex.'D' is now 'C'
		System.out.print(c);
//prints inputed char if it isnt A
		letters((char)(c-1));
//It calls letters but the input is one lower that the function it was originally in
//ex: if the function was originally using 'D', this one is inputting 'C'
	}
}
	public static void main(String[] args) {
		letters('D');
/*How it works:
 1: letters('C') "D" letters('C')
 2. letters('B') "C" letters('B') "D" letters('B') "C" letters('B')
 3. "A" "B" "A" + "C" + "A" "B" "A" + "D" + "A" "B" "A" + "C" + "A" "B" "A"
 */
	}

}
