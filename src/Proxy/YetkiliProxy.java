package Proxy;

import java.util.Scanner;

public class YetkiliProxy implements YetkiliIslemleri{
    private Yetkili yetkili;
    private String dogruYetkili= "Mudur";
    private String dogruSifre="yetkilimudur";

    public YetkiliProxy(Yetkili yetkili) {
        this.yetkili = yetkili;
    }


    @Override
    public void girisYap() {
        if(girisKontrol()){
            yetkili.girisYap();
        }
        else {
            System.out.println("Yetkili değilsiniz.Sisteme giriş yapamassınız. ");
        }
    }
    private boolean girisKontrol(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Yetkili adı giriniz. ");
        String yetkiliAdi = scanner.next();
        System.out.println("sifrenizi giriiniz. ");
        String sifre = scanner.next();
            return yetkiliAdi.equals(dogruYetkili) && sifre.equals(dogruSifre);
    }

}
