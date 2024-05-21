package Observer;

import Observer.Observer;

public class TelefonDogrulamaObserver implements Observer {
    private String telefonNumarasi;

    public TelefonDogrulamaObserver(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
    @Override
    public void update(String message) {
        System.out.println("Telefon numarasına doğrulama kodu gönderildi: " + message);
    }
    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
}
