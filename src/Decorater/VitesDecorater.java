package Decorater;

public class VitesDecorater implements Vites {
    protected Vites vites;
    public VitesDecorater(Vites vites){
        this.vites=vites;
    }
    @Override
    public void assemble() {
        this.vites.assemble();

    }
}
