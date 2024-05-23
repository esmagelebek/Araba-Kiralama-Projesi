package Observer;

import Builder.Musteri;

public class ObserverDemo {


    public static void main(String[] args) {
        Musteri.MusteriBuilder builder=new Musteri.MusteriBuilder("esma","gelebek","+905434567889","esmag@gmail.com",
                "12.12.2000","esma123","234");
         Musteri musteri=new Musteri(builder);
        TelefonOnay dogrulamaServisi = new TelefonOnay();
        TelefonOnayObserver telefonDogrulamaObserver=new TelefonOnayObserver(musteri.getTelefonNumarasi());
        dogrulamaServisi.addObserver(telefonDogrulamaObserver);

        dogrulamaServisi.onayGonder(musteri);

    }
}
