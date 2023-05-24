//Model
import java.util.Random;

public class Game {

    public static final int SIZE = 9;
    public static final int SQRT_SIZE = 3;

    private Square[][] board;

    public Game() {
        setUp();
    }

    private void setUp() {
        Random rand = new Random();
        board = new Square[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = new Square(i,j);
                board[i][j].setValue(rand.nextInt(0, SIZE+1));
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i < SIZE; i++) {
            if ((i != 0) && (i%SQRT_SIZE == 0)) {
                for (int k = 0; k < 3*SIZE+(SQRT_SIZE-1); k++) {
                    System.out.print("–");
                }
                System.out.println();
            }
            for (int j = 0; j < SIZE; j++) {
                if ((j != 0) && (j%SQRT_SIZE == 0)) System.out.print("|");
                int val = board[i][j].getValue();
                System.out.print("("+(val > 0 ? val : " ")+")");
            }
            System.out.println();
        }
    }


    //set up

    //check puzzle

}