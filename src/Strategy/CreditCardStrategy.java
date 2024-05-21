package Strategy;

import Visitor.Hesapla;


public class CreditCardStrategy implements Odeme{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    private  double fiyatMiktari=0;
    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void odeme() {
        Hesapla fiyat=new Hesapla();
        fiyatMiktari=fiyat.hesaplaveYazdir();
        System.out.println(fiyatMiktari+ " TL kredi kartı ile odendi");


    }
}
