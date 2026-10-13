package ilu2;

public class FizzBuzzer {

	private int turn = 0;

	public String next() {
		turn++;
		return Integer.toString(turn);
	}
}
