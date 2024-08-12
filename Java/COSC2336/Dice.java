
public class Dice {

int sides;
public Dice() {
			sides=6;
}
public Dice(int i) {
			sides=i;
}
public int getSides() {
	return sides;
}
public void setSides(int i) {
	sides=i;
}
public int rollDice() {
	return (int)(Math.random()*sides)+1;
}
}

