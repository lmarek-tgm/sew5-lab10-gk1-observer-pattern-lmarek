public class TestKlasse {
    public static void main(String [] args){
        Sprechstunde neu = new Sprechstunde("Brein", "H937", "Mi","13:20","16:50");
        SprechstundenListe neu2= new SprechstundenListe();
        WebService neu3=new WebService(neu2);
        neu2.attach(neu3);
        neu2.addSprechstunde(neu);
    }
}
