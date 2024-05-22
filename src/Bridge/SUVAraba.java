package Bridge;

public class SUVAraba extends Araba {
    public SUVAraba(Model m){
        super(m);
    }
    @Override
    public void arabaModel(String modelAdi) {
        model.arabaModel(modelAdi);
    }

}
