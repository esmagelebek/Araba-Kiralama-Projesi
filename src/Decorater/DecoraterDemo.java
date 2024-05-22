package Decorater;

public class DecoraterDemo {
    public static void main(String[] args) {
        Vites manuel=new VitesDecorater(new ManuelVites());
        manuel.assemble();
        System.out.println("\n********");

        Vites otomatik=new VitesDecorater(new OtomatikVites());
        otomatik.assemble();
    }
}
