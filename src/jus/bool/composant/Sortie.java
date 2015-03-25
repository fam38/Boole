package jus.bool.composant;
import java.util.HashMap;
import java.util.Map;

public class Sortie extends Port  {

	private Map<Entree,Integer> ConnecteA;
	
	public Sortie(){
		this.ConnecteA = new HashMap<>();
	}
	
	public void AjoutConnexion(Entree e, int id){
			this.ConnecteA.put(e, id);
	}

	public Map<Entree,Integer> getConnecteA() {
		return ConnecteA;
	}

	@Override
	public String toString() {
		return "connectée à :" + ConnecteA.values().toString();
	}


}
