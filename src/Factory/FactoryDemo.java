package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ArabaFactory araba=new ArabaFactory();
        araba.arabaEkle();
        araba.modeldekiArabalariListele();
    }
}
