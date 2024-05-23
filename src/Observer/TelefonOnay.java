package Observer;

import Builder.Musteri;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TelefonOnay {
    private List<Observer> observersList = new ArrayList<>();
    private static String onayKodu;

    public void addObserver(Observer observer) {
        observersList.add(observer);
    }
    public void removeObserver(Observer observer) {
        observersList.remove(observer);
    }
    public void notifyObservers(String mesaj) {
        for (Observer observer : observersList) {
            observer.update(mesaj);
        }
    }
    public void onayGonder(Musteri musteri) {
        System.out.println("Müşteri doğrulaması için onay gönderildi : " + musteri.getAd() + " " + musteri.getSoyad());
        onayKodu=randomSayi();
        notifyObservers("Onay kodu: "+onayKodu);

        if (onayKoduIste()) {
            System.out.println("Doğrulama başarılı oldu.");
        } else {
            System.out.println("Doğrulama başarısız oldu.");
            System.exit(1);
        }
    }

    private boolean onayKoduIste() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğrulama kodunu giriniz: ");
        String dogrulamaKodu = scanner.nextLine();
        return onayKodu.equals(dogrulamaKodu);
    }

    private String randomSayi(){
        Random random = new Random();
        int kod = random.nextInt(10000);
        return String.valueOf(kod);
    }

}
