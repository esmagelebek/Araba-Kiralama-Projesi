package Bridge;

import Bridge.Model;
import Visitor.ArabaVisitor;


public class SUVArabaModeli implements Model {
    @Override
    public Model arabaModel(String model) {
        System.out.println("Arabanın Modeli SUV'dur");
        return this.arabaModel(model);
    }
    double accept (ArabaVisitor visitor, int gun){
        return visitor.visit(this,gun);
    }
}
