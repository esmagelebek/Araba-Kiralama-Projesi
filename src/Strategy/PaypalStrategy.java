package Strategy;

import Visitor.Hesapla;


public class PaypalStrategy implements Odeme{
    private String emailId;
    private String password;
    private  double fiyatMiktari=0;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void odeme() {
        Hesapla fiyat=new Hesapla();
        fiyatMiktari=fiyat.hesaplaveYazdir();
        System.out.println(fiyatMiktari+ " TL Paypal ile odendi");
    }
}
