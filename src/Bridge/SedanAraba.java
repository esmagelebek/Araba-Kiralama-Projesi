package Bridge;

public class SedanAraba extends Araba{

    public SedanAraba(Model m){
        super(m);
    }
    @Override
    public void arabaModel(String modelAdi) {
        System.out.println("Araba'nın modeli Sedandır");
        model.arabaModel(modelAdi);
    }
}
