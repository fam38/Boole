package jus.bool.composant;

public class Composant {

	protected Sortie[] TableauSortie;
	protected Entree[] TableauEntree;
	protected int id;
	
	public Composant(int id, Entree[] e, Sortie[] s){
		this.id = id;
		TableauSortie = s;
		TableauEntree = e;
	}
	public Composant(){
		
	}
}

