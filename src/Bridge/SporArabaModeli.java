package Bridge;

import Bridge.Model;
import Visitor.ArabaVisitor;


public class SporArabaModeli implements Model {
    @Override
    public void arabaModel(String modelAdi) {
        System.out.println("Arabanın Modeli Spor Araba'dır");

    }
    double accept (ArabaVisitor visitor, int gun){
        return visitor.visit(this,gun);
    }
}
