package Iterator;

import Builder.Musteri;

import java.util.ArrayList;

import java.util.Scanner;

public class MusteriIslemleri {
    ArrayList<String> musteriList = new ArrayList<>();


    public  void yeniKayit(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("isim: ");
        String ad = scanner1.next();
        System.out.println("soyisim: ");
        String soyad = scanner1.next();
        System.out.println("telefon numarası: ");
        String telno = scanner1.next();
        System.out.println("email adresi: ");
        String email = scanner1.next();
        System.out.println("Doğum tarihi: ");
        String dgtarihi = scanner1.next();
        System.out.println("kullanıcı adı: ");
        String kayitliKulaaniciadi = scanner1.next();
        System.out.println("Sifre: ");
        String kayitliSifre = scanner1.next();

        Musteri.MusteriBuilder musteri= new Musteri.MusteriBuilder(ad,soyad,telno,email,dgtarihi,kayitliKulaaniciadi,kayitliSifre);
        System.out.println("adres(opsiyonel): ");
        String adres = scanner1.next();
        if (!adres.isEmpty()){
            musteri.adres(adres);
        }
        System.out.println("tcNo(opsiyonel): ");
        String tcNo = scanner1.next();
        if (!tcNo.isEmpty()){
            musteri.tcNo(tcNo);
        }
        musteriList.add(ad);

    }

}
