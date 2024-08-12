import java.util.Stack;

public class DiceStack {

	public static void main(String[] args) {
		Stack<Dice> bob = new Stack<Dice>();
		Dice a = new Dice(2);
		Dice b = new Dice(3);
		Dice c = new Dice(4);
		Dice d = new Dice(6);
		Dice e = new Dice(8);
		Dice f = new Dice(10);
		Dice g = new Dice(12);
		Dice h = new Dice(20);
		Dice i = new Dice(15);
		Dice j = new Dice(16);
		bob.push(a);
		bob.push(b);
		bob.push(c);
		bob.push(d);
		bob.push(e);
		bob.push(f);
		bob.push(g);
		bob.push(h);
		bob.push(i);
		bob.push(j);
		int total = 0,temp=0;
		while(!bob.empty()) {
		temp = bob.pop().rollDice();
		total+=temp;
		System.out.println("The dice rolled: "+temp);
		System.out.println("The total so far is: "+total);
		}
	}
}
