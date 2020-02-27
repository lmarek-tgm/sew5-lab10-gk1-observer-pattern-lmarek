class EmailBenachrichtigungsservice implements Observer {

	private SprechstundenListe subject;

	public EmailBenachrichtigungsservice(SprechstundenListe sp) {
		this.subject= sp;
	}

	public void anzeige() {
		for (Sprechstunde ob: subject.getSprechstundenListe()) {
			System.out.println(ob.getName());
			System.out.println(ob.getRaum());
			System.out.println(ob.getEnde());
			System.out.println(ob.getBeginn());
			System.out.println(ob.getTag());
		}
	}

	public void update() {
		this.anzeige();
	}

}
