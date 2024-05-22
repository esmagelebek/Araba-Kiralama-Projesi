package Builder;

public class BuilderDemo {


    public static void main(String[] args) {
           Musteri builder=new Musteri.MusteriBuilder("esma","gelebek","+905434567889","esmag@gmail.com",
                "12.12.2000","esma123","234").build();
        System.out.println("Musteri Adı: " +builder.getAd()+"\n"
                +"Musteri Soyadı: "+builder.getSoyad()+"\n"
                +"Musterinin Telefon Numarası: "+builder.getTelefonNumarasi()+"\n"
                +"Musterinin Doğum tarihi: "+builder.getDogumTarihi()+"\n"
                +"Musterinin Kullanıcı adı: "+builder.getKayitliKullaniciadi()+"\n"
                +"Musterinin Şifresi: "+builder.getKayitliSifre()
        );
    }
}
