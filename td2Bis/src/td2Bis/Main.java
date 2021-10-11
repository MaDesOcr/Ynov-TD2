package td2Bis;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import model.*;

public class Main {

	static HashMap<String, Animal> hmAnimaux =
			new HashMap<String, Animal>();
	
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {

		System.out.println(TextConst.BONJOUR);
		
		do {
		
			System.out.println(TextConst.MENUQUESTION);
			
			Scanner sc = new Scanner(System.in);
			
			int i = 0;
			
			try {
				i = sc.nextInt();
			}
			catch(Exception e) {
				
			}
			
			switch(i) {
				case 1 : System.out.println(TextConst.MENUCREATE);
					createAnimal();
				break;
				case 2 : System.out.println(TextConst.MENUREAD);
					readAnimals();
				break;
				case 3 : System.out.println(TextConst.MENUUPDATE);
					updateStatusAnimal();
				break;
				case 4 : System.out.println(TextConst.MENUCOURSE);
					course();
				break;
				case 5 : System.out.println(TextConst.AUREVOIR);
					System.exit(0);
				default : System.out.println(TextConst.ERREUR);
			}
		}
		while(true);
	}
	
	private static void updateStatusAnimal() {
		System.out.println("Quel animal voulez vous mettre à jour ?"
				+ " Entrez son nom");
		Scanner sc = new Scanner(System.in);
		readAnimals();
		String s = sc.nextLine();
		
		if(hmAnimaux.containsKey(s)) {
			hmAnimaux.get(s).setActif(!hmAnimaux.get(s).isActif());
		}
		else {
			System.out.println(TextConst.ERREUR);
		}		
	}

	private static void course() {
		
		for(Entry<String, Animal> entry : hmAnimaux.entrySet()) {
			
			Animal a = entry.getValue();
			if(a.isActif()) {
				a.setPos(a.getPos() + a.getVitesse());
			}
		}
		readAnimals();
		
	}

	private static void readAnimals() {

		for(Entry<String, Animal> entry : hmAnimaux.entrySet()) {
			System.out.println(entry.getValue().toString());
		}
	}

	public static void createAnimal() {
		System.out.println("Quel type d'animal voulez vous créer? "
				+ "1. Chien"
				+ "2. Chat"
				+ "3. Poule.");
		Scanner sc = new Scanner(System.in);
		int i = 0;
		try{
			i =sc.nextInt();
		}
		catch(Exception e) {	
		}
		System.out.println("Quel nom ?");
		Scanner sc2 = new Scanner(System.in);
		String nom = sc2.nextLine();
		Animal a;
		switch(i){
		case 1: a = new Chien(nom, 4, true, 0);
		hmAnimaux.put(nom, a);
		break;
		case 2: a = new Chat(nom, 3, true, 0);
		hmAnimaux.put(nom, a);
		break;
		case 3: a = new Poule(nom, 2, true, 0);
		hmAnimaux.put(nom, a);
		break;
		default:;
		
		}
	}
}
