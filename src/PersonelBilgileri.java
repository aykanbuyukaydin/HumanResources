import java.util.Date;

public class PersonelBilgileri {
    private String adSoyad;
    private String kimlikNo;
    private String dogumTarihi;
    private String iseGirisTarihi;
    private String calisilanBolum;

    public PersonelBilgileri(String adSoyad, String kimlikNo, String dogumTarihi, String iseGirisTarihi, String calisilanBolum) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.dogumTarihi = dogumTarihi;
        this.iseGirisTarihi = iseGirisTarihi;
        this.calisilanBolum = calisilanBolum;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getIseGirisTarihi() {
        return iseGirisTarihi;
    }

    public void setIseGirisTarihi(String iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }

    public String getCalisilanBolum() {
        return calisilanBolum;
    }

    public void setCalisilanBolum(String calisilanBolum) {
        this.calisilanBolum = calisilanBolum;
    }

    @Override
    public String toString() {
        return "PersonelBilgileri{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", iseGirisTarihi='" + iseGirisTarihi + '\'' +
                ", calisilanBolum='" + calisilanBolum + '\'' +
                '}';
    }
}