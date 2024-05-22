package Bridge;

public class SporAraba extends Araba{

    public SporAraba(Model m){
        super(m);
    }
    @Override
    public void arabaModel(String modelAdi) {
        model.arabaModel(modelAdi);
    }
}
