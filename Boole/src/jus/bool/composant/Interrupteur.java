package jus.bool.composant;

public class Interrupteur extends Generateur {

	public void setEtat(Etat e){
		TableauSortie[1].setEtat(e);
	}
	
	public Interrupteur(int id, Sortie[] s) {
		super();
		TableauSortie = new Sortie[1];
		TableauSortie[1].setEtat(Etat.INDETERMINE);
		// TODO Auto-generated constructor stub
	}
}
