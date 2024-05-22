package Bridge;

import Bridge.Model;
import Visitor.ArabaVisitor;


public class SedanArabaModeli implements Model {

    @Override
    public void arabaModel(String modelAdi) {
        System.out.println("Arabanın Modeli Sedan'dır");

    }
    public double accept (ArabaVisitor visitor, int gun){
        return visitor.visit(this,gun);
    }
}
