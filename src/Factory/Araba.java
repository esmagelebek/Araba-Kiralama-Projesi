package Factory;

public  abstract class Araba {
    public String model;
    public Araba(String model){

        this.model=model;
    }
    public abstract void arabaModeliUret();
    public String getModel() {

        return model;
    }
}
