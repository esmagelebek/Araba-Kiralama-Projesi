package Factory;

import Bridge.Model;
import Factory.Araba;

public class BMW extends Araba {

    public BMW(String model) {
        super(model);
    }

    @Override
    public void arabaModeliUret() {
        System.out.println("BMW");

    }
}


