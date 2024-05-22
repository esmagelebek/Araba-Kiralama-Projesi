package Builder;

public class Musteri {
    private final String ad;

    private final String soyad;

    private final String telefonNumarasi;

    private final String emailAdres;
    private final String dogumTarihi;
    private final String adres;
    private  final String tcNo;
    private  String kayitliKullaniciadi = "";
    private  String kayitliSifre = "";

    public Musteri(MusteriBuilder builder){
        this.ad=builder.ad;
        this.soyad=builder.soyad;
        this.telefonNumarasi= builder.telefonNumarasi;
        this.emailAdres= builder.emailAdres;
        this.dogumTarihi= builder.dogumTarihi;
        this.adres= builder.adres;
        this.tcNo= builder.tcNo;
        this.kayitliSifre=builder.kayitliSifre;
        this.kayitliKullaniciadi=builder.kayitliKullaniciadi;
    }
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public String getAdres() {
        return adres;
    }

    public String getTcNo() {
        return tcNo;
    }

    public String getKayitliKullaniciadi() {
        return kayitliKullaniciadi;
    }

    public void setKayitliKullaniciadi(String kayitliKullaniciadi) {
        this.kayitliKullaniciadi = kayitliKullaniciadi;
    }

    public String getKayitliSifre() {
        return kayitliSifre;
    }

    public void setKayitliSifre(String kayitliSifre) {
        this.kayitliSifre = kayitliSifre;
    }




    public static class MusteriBuilder{

        private final String ad;
        private final String soyad;
        private final String telefonNumarasi;
        private final String emailAdres;
        private final String dogumTarihi;
        private final String kayitliKullaniciadi;
        private final String kayitliSifre;
        private String adres;
        private   String tcNo;


        public MusteriBuilder(String ad,String soyad,String telefonNumarasi,String emailAdres,String dogumTarihi,String kayitliKullaniciadi,String kayitliSifre){
            this.ad=ad;
            this.soyad=soyad;
            this.telefonNumarasi= telefonNumarasi;
            this.emailAdres= emailAdres;
            this.dogumTarihi=dogumTarihi;
            this.kayitliKullaniciadi=kayitliKullaniciadi;
            this.kayitliSifre=kayitliSifre;

        }
        public MusteriBuilder adres(String adres){
            this.adres=adres;
            return this;
        }
        public MusteriBuilder tcNo(String tcNo){
            this.tcNo=tcNo;
            return this;
        }
        public Musteri build() {
            return new Musteri(this);
        }
    }


}
