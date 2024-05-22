package Factory;
import Bridge.Model;
import Factory.Araba;

public class Porsche extends Araba {
    public Porsche(String model) {
        super(model);
    }

    @Override
    public void arabaModeliUret() {
        System.out.println("Porsche");

    }


}
