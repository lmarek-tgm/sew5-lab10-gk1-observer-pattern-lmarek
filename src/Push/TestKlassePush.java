package Push;

import Pull.Sprechstunde;
import Pull.SprechstundenListe;
import Pull.WebService;

public class TestKlassePush {
    public static void main(String [] args){
        Push.Sprechstunde sprechtunde1 = new Push.Sprechstunde("Brein", "H937", "Mi","13:20","16:50");
        Push.SprechstundenListe sprechstundenListe1= new Push.SprechstundenListe();
        Push.WebService webService=new Push.WebService(sprechstundenListe1);
        sprechstundenListe1.attach(webService);
        sprechstundenListe1.addSprechstunde(sprechtunde1);
        sprechstundenListe1.detach(webService);
    }
}
