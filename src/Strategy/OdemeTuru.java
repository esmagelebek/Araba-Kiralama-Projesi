package Strategy;

import java.util.Scanner;

public class OdemeTuru {
    String odemeTuru="";
    Scanner scan=new Scanner(System.in);
    public void OdemeTuru(){
        odemeTuru=scan.next().toLowerCase();
        if (odemeTuru.equals("kredikart")){
            CreditCardStrategy creditCardStrategy=new CreditCardStrategy("Ayşe Çalışkan", "1234567890123456", "786", "12/25");
            creditCardStrategy.odeme();
        } else if (odemeTuru.equals("paypal")) {
            PaypalStrategy paypalStrategy=new PaypalStrategy("ayse@caliskan.com", "mypwd");
            paypalStrategy.odeme();

        } else if (odemeTuru.equals("nakit")) {
            NakitStrategy nakitStrategy=new NakitStrategy();

        }
    }

}
