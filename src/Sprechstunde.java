public class Sprechstunde extends Subject {

	private String lehrerName;
	private String raumnummer;
	private String wochentag;
	private String beginn;
	private String ende;

	public Sprechstunde(String lehrerName, String raumnummer, String wochentag, String beginn, String ende) {
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
		this.lehrerName = name;
	}

	public String getRaum() {
		return this.raumnummer;
	}

	public void setRaum(String raum) {
		this.raumnummer = raum;
	}

	public String getTag() {
		return this.wochentag;
	}

	public void setTag(String tag) {
		this.wochentag = tag;
	}

	public String getBeginn() {
		return this.beginn;
	}

	public void setBeginn(String beginn) {
		this.beginn = beginn;
	}

	public String getEnde() {
		return this.ende;
	}

	public void setEnde(String ende) {
		this.ende = ende;
	}
}
