package Pull;

public class TestKlasse {
    public static void main(String [] args){
        /**Pull.Sprechstunde sprechtunde1 = new Pull.Sprechstunde("Brein", "H937", "Mi","13:20","16:50");
        Pull.SprechstundenListe sprechstundenListe1= new Pull.SprechstundenListe();
        Pull.WebService webService=new Pull.WebService(sprechstundenListe1);
        sprechstundenListe1.attach(webService);
        sprechstundenListe1.addSprechstunde(sprechtunde1);
        sprechstundenListe1.detach(webService);**/

        Sprechstunde sprechtunde2 = new Sprechstunde("Weber", "H930", "Di","14:20","15:50");
        SprechstundenListe sprechstundenListe2= new SprechstundenListe();
        WebService webService2=new WebService(sprechstundenListe2);
        EmailBenachrichtigungsservice emailBenachrichtigungsservice=new EmailBenachrichtigungsservice(sprechstundenListe2);
        sprechstundenListe2.attach(webService2);
        sprechstundenListe2.attach(emailBenachrichtigungsservice);
        sprechstundenListe2.addSprechstunde(sprechtunde2);

        Sprechstunde sprechtunde3 = new Sprechstunde("KAP", "H931", "Do","14:50","15:59");
        sprechstundenListe2.detach(webService2);
        sprechstundenListe2.addSprechstunde(sprechtunde3);
    }
}
