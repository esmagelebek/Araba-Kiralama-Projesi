package Strategy;


import Visitor.Hesapla;

public class NakitStrategy implements Odeme{
    private  double fiyatMiktari=0;
    @Override
    public void odeme() {
        Hesapla fiyat=new Hesapla();
        fiyatMiktari=fiyat.hesaplaveYazdir();
        System.out.println(fiyatMiktari+ " TL nakit odendi");
    }
}
