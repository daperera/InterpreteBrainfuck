package Interprete;

public final class Interprete {
	private final String instructions;
	private final Memoire memoire;
	private final Pointeur pointeur;
	private final String[] args;
	boolean done = false;
	private int pointerInput = 1;
	
	public Interprete(String[] args) {
		this.instructions = args[0];
		this.args = args;
		memoire = new Memoire();
		pointeur = new Pointeur(instructions);
		execute();
	}
	public void execute() {
		while(pointeur.continuer()) {
			switch(instructions.charAt(pointeur.get())) {
				case '+':
					memoire.incremente();
					break;
				case '-':
					memoire.decremente();
					break;
				case '>':
					memoire.avance();
					break;
				case '<':
					memoire.recule();
					break;
				case ',':
					memoire.stocke(Integer.parseInt(args[pointerInput]));
					pointerInput++;
					break;
				case '.':
					System.out.println(memoire.recupere());
					done = true;
					break;
				case '[':
					if (memoire.recupere() == 0) {
						pointeur.sautAvant();
					}
					break;
				case ']':
					if (memoire.recupere() != 0) {
						pointeur.sautArrière();
					}
					break;
				default:
					break;
			}
		}
	}
}
