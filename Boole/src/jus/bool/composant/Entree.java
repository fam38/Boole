package jus.bool.composant;

public class Entree extends Port {

	private Sortie connecteA;
	private int idCompConnect;
	
	public int getidCompConnect(){
		return idCompConnect;
	}
	public Sortie getConnecteA() {
		return connecteA;
	}

	public void setConnection(Sortie connecteA, int idComp) {
		this.connecteA = connecteA;
		this.idCompConnect = idComp;
	}
	@Override
	public String toString() {
		return "connecté à la sortie du composant" + idCompConnect;
	}

}
