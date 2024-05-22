package Factory;

import Bridge.Model;
import Bridge.SedanArabaModeli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaFactory  {

    private List<Araba> arabalar = new ArrayList<Araba>();
    Scanner scanner = new Scanner(System.in);

    Araba araba;

    public void arabaEkle() {
        System.out.println("Hangi araba modeli eklemek istiyorsunuz: ");
        String model = scanner.next().toUpperCase();


        Bridge.Model model1=new SedanArabaModeli();

        if (model.equals("MERCEDES")) {
            araba = new Mercedes(model1);
            araba.arabaModeliUret();
        }else if (model.equalsIgnoreCase("BMW")) {
            araba = new BMW(model1);
            araba.arabaModeliUret();
        }else if (model.equalsIgnoreCase("PORSCHE")) {
            araba = new Porsche(model1);
            araba.arabaModeliUret();
        }else {
            System.out.println("Geçersiz araba modeli.");
            return;
        }

        arabalar.add(araba);
        System.out.println(arabalar);
    }





    public List<Araba> modeldekiArabalariListele() {
        //arabaEkle();
        String model="";
        System.out.println("Hangi model araba listelemek istersiniz ");
        Scanner scanner1=new Scanner(System.in);
        model=scanner1.next().toLowerCase();

        for (Araba araba : arabalar) {
            if (araba.getModel().equals(model)) {
                arabalar.add(araba);
            }
        }
        System.out.println(arabalar);
        return arabalar;


    }
}


