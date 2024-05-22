package Bridge;

public class SUVAraba extends Araba {
    public SUVAraba(Model m){
        super(m);
    }
    @Override
    public void arabaModel(String modelAdi) {
        System.out.println("Araba'nın modeli SUV'dur");
        model.arabaModel(modelAdi);
    }

}
