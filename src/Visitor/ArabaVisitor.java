package Visitor;

import Bridge.SUVArabaModeli;
import Bridge.SedanArabaModeli;
import Bridge.SporArabaModeli;

public interface ArabaVisitor {
    double visit(SedanArabaModeli sedanArabaModeli, int gun);
    double visit(SporArabaModeli sporArabaModeli, int gun);
    double visit(SUVArabaModeli suvArabaModeli, int gun);
}
