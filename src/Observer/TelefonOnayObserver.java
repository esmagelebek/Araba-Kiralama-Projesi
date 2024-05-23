package Observer;

public class TelefonOnayObserver implements Observer {
    private String TelNo;

    public TelefonOnayObserver(String telNumarasi) {
        this.TelNo = telNumarasi;
    }
    @Override
    public void update(String mesaj) {
        System.out.println("Telefon numarasına doğrulama kodu gönderildi: " + mesaj);
    }
    public String getTelNo() {
        return TelNo;
    }

    public void setTelNo(String telefonNumarasi) {
        this.TelNo = telefonNumarasi;
    }
}
