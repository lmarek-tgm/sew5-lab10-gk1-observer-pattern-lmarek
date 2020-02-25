public class Sprechstunde extends Subject {

	private String lehrerName;
	private String raumnummer;
	private String wochentag;
	private int beginn;
	private int ende;

	private SprechstundenListe sprechstundenListe;

	public void Sprechstunde() {
		this.lehrerName = lehrerName;
		this.raumnummer = raumnummer;
		this.wochentag = wochentag;
		this.beginn = beginn;
		this.ende = ende;
	}

	public String getName() {
		return this.lehrerName;
	}

	public void setName(String name) {
		this.lehrerName = name; notifyObserver();
	}

	public String getRaum() {
		return this.raumnummer;
	}

	public void setRaum(String raum) {
		this.raumnummer = raum; notifyObserver();
	}

	public String getTag() {
		return this.wochentag;
	}

	public void setTag(String tag) {
		this.wochentag = tag; notifyObserver();
	}

	public int getBeginn() {
		return this.beginn;
	}

	public void setBeginn(int beginn) {
		this.beginn = beginn; notifyObserver();
	}

	public int getEnde() {
		return this.ende;
	}

	public void setEnde(int ende) {
		this.ende = ende; notifyObserver();
	}

}
