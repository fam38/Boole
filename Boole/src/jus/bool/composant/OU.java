package jus.bool.composant;

public class OU extends Transformateur {

	@Override
	public void calculer() {

		if (this.TableauEntree[1].getEtat() == Etat.UN || this.TableauEntree[2].getEtat() == Etat.UN)
			this.TableauSortie[1].setEtat(Etat.UN);
		else
			this.TableauSortie[1].setEtat(Etat.ZERO);
	}

}
