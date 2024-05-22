package Bridge;

public abstract class Araba {

    protected Model model;

    public Araba(Model m){
        this.model=m;
    }
    abstract public void arabaModel(String modelAdi);
}
