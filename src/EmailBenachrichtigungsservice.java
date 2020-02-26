class EmailBenachrichtigungsservice implements Observer {

	private SprechstundenListe subject;

	public void EmailBenachrichtigungsservice(SprechstundenListe sp) {
		this.subject= sp;
	}

	public void anzeige() {

	}

	public void update() {
		this.anzeige();
	}

}
