package Visitor;

import Bridge.SUVArabaModeli;
import Bridge.SedanArabaModeli;
import Bridge.SporArabaModeli;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hesapla {
    private int gun;
    private int tarihBelirle(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Bir haftadan fazla kiralanan araçlarımıza %10 indirim uygulanmaktadır. ");
        System.out.println("Kiralamak istediğiniz tarihi giriniz.(GG.AA.YYYY) ");
        String ilkgun= scanner.next();
        LocalDate ilktarih = LocalDate.parse(ilkgun,formatter);

        System.out.println("İade etmek istediğiniz tarihi giriniz.(GG.AA.YYYY) ");
        String songun = scanner.next();
        LocalDate sontarih = LocalDate.parse(songun,formatter);

        Period period = Period.between(ilktarih,sontarih);
        gun = period.getDays();

        return gun;
    }


    public double visit(SedanArabaModeli sedanArabaModeli, int gun){
        double gunlukfiyat = 1250.00;
        double toplamfiyat = gunlukfiyat * gun;
        if(gun >= 7){
            toplamfiyat *= 0.9;
            System.out.println("indirim uygulandı ");
        }
        return toplamfiyat;
    }
    public double visit(SUVArabaModeli suvArabaModeli, int gun){
        double gunlukfiyat = 1450.00;
        double toplamfiyat = gunlukfiyat * gun;
        if(gun >= 7){
            toplamfiyat *= 0.9;
            System.out.println("indirim uygulandı ");
        }
        return toplamfiyat;
    }
    public double visit(SporArabaModeli sporArabaModeli, int gun){
        double gunlukfiyat = 1850.00;
        double toplamfiyat = gunlukfiyat * gun;
        if(gun >= 7){
            toplamfiyat *= 0.9;
            System.out.println("indirim uygulandı ");
        }
        return toplamfiyat;
    }
    public double hesaplaveYazdir(){
        tarihBelirle();
        Scanner scanner=new Scanner(System.in);
        String cevap= scanner.next().toLowerCase();

        double fiyat=0.0;
        if(cevap.equals("sedan")) {
            SedanArabaModeli sedan = new SedanArabaModeli();
            double sedanFiyat = visit(sedan, gun);
            //System.out.println("Sedan Araba Günlük Fiyatı: " + sedanFiyat);
            fiyat=sedanFiyat;
            return sedanFiyat;
        }else if(cevap.equals("suv")) {
            SUVArabaModeli suv = new SUVArabaModeli();
            double suvFiyat = visit(suv, gun);
            //System.out.println("SUV Araba Günlük Fiyatı: " + suvFiyat);
            fiyat=suvFiyat;
            return suvFiyat;
        }else if(cevap.equals("spor")) {
            SporArabaModeli spor = new SporArabaModeli();
            double sporFiyat = visit(spor, gun);
            fiyat=sporFiyat;
            return sporFiyat;
            //System.out.println("Spor Araba Günlük Fiyatı: " + sporFiyat);
        }
        return fiyat;
    }
}
