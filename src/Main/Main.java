package Main;

import Interprete.Interprete;

public class Main {
	public static void main(String[] args) {
		String arg[] = {",+[.+]", // instructions en Brainfuck
						"10"}; // input
		new Interprete(arg);
	}
}
