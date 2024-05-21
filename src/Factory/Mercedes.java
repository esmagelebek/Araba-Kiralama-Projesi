package Factory;
import Bridge.Model;
import Factory.Araba;

public class Mercedes extends Araba {
    public Mercedes(Model model) {
        super(model.toString());
    }

    @Override
    public void arabaModeliUret() {
        System.out.println("Mercedes");

    }
}
