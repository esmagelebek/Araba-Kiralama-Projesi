package Factory;

import Bridge.Model;
import Bridge.SedanArabaModeli;
import KaliciListeler.KaliciListeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaFactory  {

    private List<String> arabalar = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    Araba araba;
    String model="";


    public void arabaEkle() {
        System.out.println("Hangi araba modeli eklemek istiyorsunuz: ");
        String model = scanner.next().toUpperCase();




        if (model.equalsIgnoreCase("MERCEDES")) {
            araba = new Mercedes(model);
            arabalar.add(araba.model);
        }else if (model.equalsIgnoreCase("BMW")) {
            araba = new BMW(model);
            arabalar.add(araba.model);
        }else if (model.equalsIgnoreCase("PORSCHE")) {
            araba = new Porsche(model);
            arabalar.add(araba.model);
        }else {
            System.out.println("Geçersiz araba modeli.");
            return;
        }



    }





    public void modeldekiArabalariListele() {

        System.out.println("Hangi model araba listelemek istersiniz ");
        Scanner scanner1=new Scanner(System.in);
        model=scanner1.nextLine();
        for (String araba:arabalar) {
            if (araba.equalsIgnoreCase(model))
                System.out.println("Model: "+araba);
            else
                System.out.println("Araba bulunamadı");

        }




    }
}


