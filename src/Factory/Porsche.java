package Factory;
import Bridge.Model;
import Factory.Araba;

public class Porsche extends Araba {
    public Porsche(Model model) {
        super(model.toString());
    }

    @Override
    public void arabaModeliUret() {
        System.out.println("Porsche");

    }


}
