package model;

public class Poule extends Animal {

	public Poule(String nom, int vitesse, boolean actif, int pos) {
		super(nom, vitesse, actif, pos);
	}

	public void faireDuBruit() {
		System.out.println("Cot");
	}
}
