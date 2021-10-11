package model;

public class Animal implements AnimalComportement{

	protected String nom;
	protected int vitesse;
	protected boolean actif;
	protected int pos;
	
	public Animal(String nom, int vitesse, boolean actif, int pos) {
		this.nom = nom;
		this.vitesse = vitesse;
		this.actif = actif;
		this.pos = pos;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public void faireDuBruit() {
		
	}
	
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", vitesse=" + vitesse + ", actif=" + actif + ", pos=" + pos + "]";
	}
	
}
