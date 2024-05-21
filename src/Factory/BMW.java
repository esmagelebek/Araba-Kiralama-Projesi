package Factory;

import Bridge.Model;
import Factory.Araba;

public class BMW extends Araba {

    public BMW(Bridge.Model model) {
        super(model.toString());
    }

    @Override
    public void arabaModeliUret() {
        System.out.println("BMW");

    }
}


