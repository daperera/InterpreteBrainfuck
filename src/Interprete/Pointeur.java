package Interprete;

public final class Pointeur {
	private int pointeur = 0;
	private final String instructions;

	public Pointeur(String instructions) {
		this.instructions = instructions;
	}
	public int get() {
		return pointeur;
	}
	public void sautAvant() {
		int n = instructions.length();
		while (instructions.charAt(pointeur) != ']' && pointeur < n) {
			pointeur++;
		}
		if (pointeur == n) {
			System.out.println("Syntax error : missing ']'");
		}
	}
	public void sautArrière() {
		while (instructions.charAt(pointeur) != '[' && pointeur >= 0) {
			pointeur--;
		}
		if (pointeur == -1) {
			System.out.println("Syntax error : missing '['");
		}
	}
	public boolean continuer() {
		pointeur++;
		return (pointeur < instructions.length());
	}
}

