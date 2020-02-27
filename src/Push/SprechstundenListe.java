package Push;

import java.util.ArrayList;

public class SprechstundenListe extends Subject {

	private ArrayList<Sprechstunde> sprechStundenListe;

	public SprechstundenListe() { sprechStundenListe= new ArrayList<Sprechstunde>(); }

	public ArrayList<Sprechstunde> getSprechstundenListe() {
		return sprechStundenListe;
	}

	public void addSprechstunde(Sprechstunde sprechstunde){
	    sprechStundenListe.add(sprechstunde);
	    notifyObserver(sprechstunde.getTag(),sprechstunde.getRaum(),sprechstunde.getBeginn(),sprechstunde.getEnde(),sprechstunde.getName());
    }
}
