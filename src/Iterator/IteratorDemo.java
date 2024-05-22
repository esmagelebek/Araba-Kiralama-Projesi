package Iterator;

public class IteratorDemo {
    public static void main(String[] args){
        MusteriIslemleri musteriIslemleri = new MusteriIslemleri();
        musteriIslemleri.yeniKayit();


        System.out.println(musteriIslemleri.musteriList);

        MusteriIterator musteriIterator=new MusteriIterator();
        Iterator iterator = musteriIterator.getIterator();

        while (iterator.hasNext()){
            String name = (String)iterator.next();
            System.out.println("Name: "+name);
        }
    }
}
