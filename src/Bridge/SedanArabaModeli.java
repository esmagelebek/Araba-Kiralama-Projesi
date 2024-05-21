package Bridge;

import Bridge.Model;
import Visitor.ArabaVisitor;


public class SedanArabaModeli implements Model {

    @Override
    public Model arabaModel(String model) {
        System.out.println("Arabanın Modeli Sedan'dır");
        return arabaModel(model);
    }
    public double accept (ArabaVisitor visitor, int gun){
        return visitor.visit(this,gun);
    }
}
