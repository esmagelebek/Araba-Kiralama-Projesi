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
        String model = scanner.next();


        Bridge.Model model1=new SedanArabaModeli();

        if (model.equals("Mercedes")) {
            araba = new Mercedes(model1);
            araba.arabaModeliUret();
        }else if (model.equalsIgnoreCase("BMW")) {
            araba = new BMW(model1);
            araba.arabaModeliUret();
        }else if (model.equalsIgnoreCase("Porsche")) {
            araba = new Porsche(model1);
            araba.arabaModeliUret();
        }else {
            System.out.println("Geçersiz araba modeli.");
            return;
        }

        arabalar.add(araba);
    }





    public List<Araba> modeldekiArabalariListele(String model) {
        arabaEkle();

        for (Araba araba : arabalar) {
            if (araba.getModel().equals(model)) {
                arabalar.add(araba);
            }
        }
        System.out.println(arabalar);
        return arabalar;


    }
}


