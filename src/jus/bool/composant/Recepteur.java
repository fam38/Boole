package jus.bool.composant;

public class Recepteur extends Composant {
	
	
	public Recepteur(int id, Entree[] e) {
		super(id, e, null);
		// TODO Auto-generated constructor stub
	}
	public Recepteur(){
		super();
		TableauSortie = new Sortie[0];
	}
}
