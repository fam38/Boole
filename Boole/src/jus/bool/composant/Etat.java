package jus.bool.composant;


public enum Etat {
	INDETERMINE("-1"),UN("1"),ZERO("0");
	
	private String Valeur;
	private Etat(String Valeur){this.Valeur = Valeur;}
	
	public String toString(){
		return Valeur;
	}
	
	public static Etat numToString(int c)
	{
		return Etat.values()[c];
	}
}


