package observer;

import Builder.Musteri;
import Observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DogrulamaMerkezi {
    private List<Observer> observers = new ArrayList<>();
    private static String DogrulamaKodu;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public void dogrulamaBaslat(Musteri musteri) {
        System.out.println("Müşteri doğrulama başlatıldı: " + musteri.getAd() + " " + musteri.getSoyad());
        DogrulamaKodu=rastgeleSayi();
        notifyObservers("Doğrulama kodu: "+DogrulamaKodu);


        //Kontrol
        if (dogrulamaKoduAl()) {
            System.out.println("Doğrulama başarılı.");
        } else {
            System.out.println("Doğrulama başarısız. Çıkış yapılıyor.");
            System.exit(1);
        }
    }

    private boolean dogrulamaKoduAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğrulama kodunu giriniz: ");
        String girilenKod = scanner.nextLine();
        return DogrulamaKodu.equals(girilenKod);
    }

    private String rastgeleSayi(){
        Random random = new Random();
        int randomkod = random.nextInt(10000);
        return String.valueOf(randomkod);
    }

}
