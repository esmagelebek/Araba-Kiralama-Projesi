package Bridge;

public class BridgeDemo {
    /*
    Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape rect = new Rectangle(new GreenColor());
		rect.applyColor();

		Shape rect2 = new Rectangle(new YellowColor());
		rect2.applyColor();
     */
    //
    public static void main(String[] args) {
        Araba sedan=new SedanAraba(new SedanArabaModeli());
        sedan.arabaModel("Sedan");

        Araba SUV=new SUVAraba(new SUVArabaModeli());
        SUV.arabaModel("SUV");

        Araba spor=new SporAraba(new SporArabaModeli());
        spor.arabaModel("Spor");
    }

}
