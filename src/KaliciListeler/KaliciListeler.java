package KaliciListeler;

import Factory.ArabaFactory;

import java.util.ArrayList;

public class KaliciListeler {
    private static KaliciListeler instance;
    private ArrayList<Builder.Musteri> musteriList=new ArrayList<>();
    private ArrayList<ArabaFactory> arabaListesi=new ArrayList<>();

    public static KaliciListeler getInstance(){
        if (instance==null){
            synchronized (KaliciListeler.class){
                if (instance==null){
                    instance=new KaliciListeler();
                }
            }
        }

        return instance;
    }

}
