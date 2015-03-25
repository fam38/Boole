package jus.bool.composant;

public class Led extends Recepteur {
	@Override
	public String toString() {
		return "La led " + id + " est à " + TableauEntree[1].AfficherEtat() + "\n";
	}

	public Led(int id, Entree[] e) {
		super();
		TableauEntree = new Entree[1];
		// TODO Auto-generated constructor stub
	}
}
