package model;

public class Chien extends Animal{

	public Chien(String nom, int vitesse, boolean actif, int pos) {
		super(nom, vitesse, actif, pos);
	}

	public void faireDuBruit() {
		System.out.println("Wouaf");
	}
	

}
