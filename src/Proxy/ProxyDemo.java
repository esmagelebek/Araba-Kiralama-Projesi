package Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Yetkili gercekYetkili = new Yetkili();
        YetkiliProxy gercekYetkiliProxy = new YetkiliProxy(gercekYetkili);
        gercekYetkiliProxy.girisYap();
    }
}
