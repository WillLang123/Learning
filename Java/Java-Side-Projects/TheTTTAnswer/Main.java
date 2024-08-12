
import java.util.Scanner;

public class Main {
    public static void drawBoard(State state){
        for (int i = 0; i < 7; i +=3) {
            System.out.println(state.getStateIndex(i) + " "
                    + state.getStateIndex(i + 1) + " " + state.getStateIndex(i + 2));
        }
    }
    public static void main(String[] args) {

        AI adsTicTacToe = new AI();

        String[] board = {"0","1","2","3","4","5","6","7","8"};

        State state = new State(0,board);
        Scanner scanner = new Scanner(System.in);
        while (!adsTicTacToe.isTerminal(state)){
            board[adsTicTacToe.minMaxDecision(state)] = "X";
            if (!adsTicTacToe.isTerminal(state)){
                drawBoard(state);
                System.out.print("Choose your spot: ");
                int userInput = scanner.nextInt();
                state.changeState(userInput, "O");
            }
        }
        scanner.close();
        drawBoard(state);
        System.out.println("Game is over");
        switch(adsTicTacToe.utilityOf(state)){
            case(1):
            System.out.println("Robot Wins!");
            break;
            case(-1):
            System.out.println("You Win! You shouldn't be winning...");
            break;
            case(0):
            System.out.println("Draw! Who would've expected it?");
            break;
        }
        }
    }