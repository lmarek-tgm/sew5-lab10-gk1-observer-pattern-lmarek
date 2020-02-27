package Push;

public class TestKlassePush {
    public static void main(String [] args){
        Push.Sprechstunde sprechtunde1 = new Push.Sprechstunde("Brein", "H937", "Mi","13:20","16:50");
        Push.SprechstundenListe sprechstundenListe1= new Push.SprechstundenListe();
        Push.WebService webService=new Push.WebService(sprechstundenListe1);
        sprechstundenListe1.attach(webService);
        sprechstundenListe1.addSprechstunde(sprechtunde1);
        sprechstundenListe1.detach(webService);

        Push.Sprechstunde sprechtunde2 = new Push.Sprechstunde("Weber", "H930", "Di","14:20","15:50");
        Push.SprechstundenListe sprechstundenListe2= new Push.SprechstundenListe();
        Push.WebService webService2=new Push.WebService(sprechstundenListe2);
        Push.EmailBenachrichtigungsservice emailBenachrichtigungsservice=new Push.EmailBenachrichtigungsservice(sprechstundenListe2);
        sprechstundenListe2.attach(webService2);
        sprechstundenListe2.attach(emailBenachrichtigungsservice);
        sprechstundenListe2.addSprechstunde(sprechtunde2);

        Push.Sprechstunde sprechtunde3 = new Push.Sprechstunde("KAP", "H931", "Do","14:50","15:59");
        sprechstundenListe2.detach(webService2);
        sprechstundenListe2.addSprechstunde(sprechtunde3);
    }
}
