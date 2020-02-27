package Push;

class EmailBenachrichtigungsservice implements Observer {

	private SprechstundenListe subject;

	public EmailBenachrichtigungsservice(SprechstundenListe sp) {
		this.subject= sp;
	}

	public void anzeige(String tag, String raum, String begin, String ende,String name) {
		System.out.println(name);
		System.out.println(raum);
		System.out.println(ende);
		System.out.println(begin);
		System.out.println(tag);
	}

	public void update(String tag, String raum, String begin, String ende,String name) {
		this.anzeige(tag, raum, begin, ende, name);
	}
}
