package Iterator;

public class MusteriIterator implements Musteri{

    public MusteriIslemleri musteriList= new MusteriIslemleri();

    @Override
    public Iterator getIterator() {
        return new MusteriItarete();
    }
    public class MusteriItarete implements Iterator{
         int i;
        @Override
        public boolean hasNext() {
            if (i<musteriList.musteriList.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return musteriList;
            }
            return null;
        }
    }
}
