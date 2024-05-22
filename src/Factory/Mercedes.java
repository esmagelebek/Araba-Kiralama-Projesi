package Factory;
import Bridge.Model;
import Factory.Araba;

public class Mercedes extends Araba {
    public Mercedes(String model) {
        super(model);
    }

    @Override
    public void arabaModeliUret() {
        System.out.println("Mercedes");

    }
}
