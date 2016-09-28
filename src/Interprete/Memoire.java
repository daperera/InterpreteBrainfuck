package Interprete;

import java.util.Vector;

public final class Memoire {
	private Vector<Integer> memoire;
	private int pointeur;
	
	public Memoire() {
		memoire = new Vector<Integer>();
		memoire.add(0);
		pointeur = 0;
	}
	public void incremente() {
		memoire.set(pointeur, memoire.elementAt(pointeur)+1);
	}
	public void decremente() {
		memoire.set(pointeur, memoire.elementAt(pointeur)-1);
	}
	public void avance() {
		if (pointeur == memoire.size()) {
			memoire.add(0);
		}
		pointeur++;
	}
	public void recule() {
		if (pointeur == 0) {
			memoire.add(0,0);
		}
		else {
			pointeur --;
		}
	}
	public void stocke(int valeur) {
		memoire.set(pointeur, valeur);
	}
	public int recupere() {
		return memoire.elementAt(pointeur);
	}
	public Object[] get() {
		return memoire.toArray();
	}
}
