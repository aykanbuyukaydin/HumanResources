import java.util.Date;

public class PersonelIzınBilgileri extends PersonelBilgileri{
    private String izinTuru;
    private String izinAdresi;
    private String izinBaslangicTarihi;
    private String izinBitisTarihi;
    private String iseBaslamaTarihi;
    private int izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi;

    public PersonelIzınBilgileri(String adSoyad, String kimlikNo, String dogumTarihi, String iseGirisTarihi, String calisilanBolum, String izinTuru,
                                 String izinAdresi, String izinBaslangicTarihi, String izinBitisTarihi, String iseBaslamaTarihi,
                                 int izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi) {
        super(adSoyad, kimlikNo, dogumTarihi, iseGirisTarihi, calisilanBolum);
        this.izinTuru = izinTuru;
        this.izinAdresi = izinAdresi;
        this.izinBaslangicTarihi = izinBaslangicTarihi;
        this.izinBitisTarihi = izinBitisTarihi;
        this.iseBaslamaTarihi = iseBaslamaTarihi;
        this.izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi = izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi;
    }

    public String getIzinTuru() {
        return izinTuru;
    }

    public void setIzinTuru(String izinTuru) {
        this.izinTuru = izinTuru;
    }

    public String getIzinAdresi() {
        return izinAdresi;
    }

    public void setIzinAdresi(String izinAdresi) {
        this.izinAdresi = izinAdresi;
    }

    public String getIzinBaslangicTarihi() {
        return izinBaslangicTarihi;
    }

    public void setIzinBaslangicTarihi(String izinBaslangicTarihi) {
        this.izinBaslangicTarihi = izinBaslangicTarihi;
    }

    public String getIzinBitisTarihi() {
        return izinBitisTarihi;
    }

    public void setIzinBitisTarihi(String izinBitisTarihi) {
        this.izinBitisTarihi = izinBitisTarihi;
    }

    public String getIseBaslamaTarihi() {
        return iseBaslamaTarihi;
    }

    public void setIseBaslamaTarihi(String iseBaslamaTarihi) {
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public int getIzinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi() {
        return izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi;
    }

    public void setIzinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi(int izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi) {
        this.izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi = izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi;
    }

    @Override
    public String toString() {
        return "PersonelIzınBilgileri{" +
                "izinTuru='" + izinTuru + '\'' +
                ", izinAdresi='" + izinAdresi + '\'' +
                ", izinBaslangicTarihi='" + izinBaslangicTarihi + '\'' +
                ", izinBitisTarihi='" + izinBitisTarihi + '\'' +
                ", iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                ", izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi=" + izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi +
                '}';
    }
}
