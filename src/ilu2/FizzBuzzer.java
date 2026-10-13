package ilu2;

public class FizzBuzzer {

	private int turn = 0;
	private static final int MAGIC_KEY = 3;
	private static final String MAGIC_VALUE = "Fizz";

	public String next() {
		turn++;
		return turn == MAGIC_KEY ? MAGIC_VALUE : Integer.toString(turn);
	}
}
