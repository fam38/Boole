package jus.bool.composant;

public class Port {
	private Etat etat;

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public Etat getEtat() {
		return etat;
	}

	public String AfficherEtat (){
		
		if (etat == Etat.ZERO)
			return "0";
		else if (etat == Etat.UN)
			return "1";
		
		return "etat indéterminé";
	}
	
}
