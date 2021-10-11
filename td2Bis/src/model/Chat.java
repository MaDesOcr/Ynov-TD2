package model;

public class Chat extends Animal{

	public Chat(String nom, int vitesse, boolean actif, int pos) {
		super(nom, vitesse, actif, pos);
	}

	public void faireDuBruit() {
		System.out.println("Miaou");
	}
	
}
