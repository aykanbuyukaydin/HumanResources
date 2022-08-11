import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    private List<PersonelBilgileri> personelBilgileriList = new ArrayList<>();
    private List<PersonelIzınBilgileri> personelIzınBilgileriList = new ArrayList<>();
    private String islemTuru;

    public void personelOlustur() {
        PersonelBilgileri personel1 = new PersonelBilgileri("Aykan Buyukaydın","123456789", "01-01-1991",
                "01-01-2020", "TEKNIK BIRIM");
        personelBilgileriList.add(personel1);

        PersonelIzınBilgileri personelIzın1 = new PersonelIzınBilgileri(personel1.getAdSoyad(),personel1.getKimlikNo(), personel1.getDogumTarihi(),
                personel1.getIseGirisTarihi(), personel1.getCalisilanBolum(), "YILLIK IZIN", "ISTANBUL", "01-03-2021",
                "05-03-2021", "08-03-2021", 2);
        personelIzınBilgileriList.add(personelIzın1);
    }

    public void anaMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("      IK MODULU                     ");
        System.out.println("====================================");
        System.out.println("1- PERSONEL ISLEMLERI");
        System.out.println("2- IZIN ISLEMLERI");
        System.out.println("Q- CIKIS");
        String secim = scan.next().toUpperCase();

        if(secim.equals("Q")){
            cikis();
        }else if (secim.equals("1")){
            islemTuru = "PERSONEL";
            islemMenusu();
        }else if(secim.equals("2")) {
            islemTuru = "IZIN ISLEMLERI";
            islemMenusu();
        }else {
            System.out.println("Hatali Giriş");
            anaMenu();
        }
    }

    private void cikis() {
        System.out.println("GULE GULE ...");
    }

    private void islemMenusu() {

        Scanner scan = new Scanner(System.in);
        if(islemTuru.equals("PERSONEL")) {
            System.out.println("============= ISLEMLER =============");
            System.out.println("1-EKLEME");
            System.out.println("2-ARAMA");
            System.out.println("3-LISTELEME");
            System.out.println("4-SILME");
            System.out.println("5-IK MODULU ");
            System.out.println("Q-CIKIS\n");
            System.out.println("SECIMINIZ:");
            String tercih = scan.next().toUpperCase();

            switch (tercih) {
                case "1":
                    ekle();
                    break;
                case "2":
                    ara();
                    break;
                case "3":
                    listele();
                    break;
                case "4":
                    sil();
                    break;
                case "5":
                    anaMenu();
                    break;
                case "Q":
                    cikis();
                    break;
                default:
                    System.out.println("Yanlis Giris");
                    islemMenusu();
                    break;
            }
        }else{
            System.out.println("============= IZIN TURLERI =============");
            System.out.println("1-YILLIK IZIN");
            System.out.println("2-BIRINCI DERECE YAKIN CENAZE IZNI");
            System.out.println("3-UCRETSIZ IZIN");
            System.out.println("4-ANALIK IZNI");
            System.out.println("5-BABALIK IZNI ");
            System.out.println("6-IDARI IZIN   ");
            System.out.println("7-HASTALIK IZNI");
            System.out.println("8-MESAI KARSILIGI IZIN");
            System.out.println("9-DIGER");
            System.out.println("10-IK MODULU ");
            System.out.println("Q-CIKIS\n");
            System.out.println("SECIMINIZ:");
            String tercih = scan.next().toUpperCase();

            switch (tercih) {
                case "1":
                    yillikIzin();
                    break;
                case "2":
                    cenazeIzni();
                    break;
                case "3":
                    ucretsizIzin();
                    break;
                case "4":
                    analikIzni();
                    break;
                case "5":
                    babalikIzni();
                    break;
                case "6":
                    idariIzin();
                    break;
                case "7":
                    hastalikIzni();
                    break;
                case "8":
                    mesaiKarsiligiIzin();
                    break;
                case "9":
                    diger();
                    break;
                case "10":
                    anaMenu();
                    break;
                case "Q":
                    cikis();
                    break;
                default:
                    System.out.println("Yanlis Giris");
                    islemMenusu();
                    break;
            }
        }
    }

    private void ekle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------- "+ islemTuru + " EKLEME ------------------");
        System.out.print("Ad Soyad:");
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik No:");
        String kimlikNo = scan.next();
        System.out.print("Dogum Tarihi(dd-MM-yyyy):");
        String dogumTarihi = scan.next();
        System.out.print("Ise Giris Tarihi(dd-MM-yyyy):");
        String iseGirisTarihi = scan.next();
        System.out.print("Calisilan Bolum(TEKNIK BIRIM / SATIS / M.IDR İSLER / DIS KAYNAK):");
        String calisilanBolum = scan.next();

        PersonelBilgileri  personel = new PersonelBilgileri(adSoyad,kimlikNo,dogumTarihi,iseGirisTarihi,calisilanBolum);
        kisiEkle(personel,personelBilgileriList);

        islemMenusu();
    }

    private void ara(){

        Scanner scan = new Scanner(System.in);
        System.out.println("----------------- " + islemTuru + " BILGILERI ------------------");
        System.out.print("Aradiginiz Personelin Kimlik Numarasi:");
        String kimlikNo = scan.next();

        kimlikNoIleKisiAra(kimlikNo, personelBilgileriList);

        islemMenusu();
    }

    private void listele () {
        List <PersonelBilgileri> liste;
        liste = personelBilgileriList;


        if(liste.isEmpty()){
            System.out.println("Belirtilen listede herhangi bir kayit yoktur");
        }else {
            System.out.println("************ "+ islemTuru + " LISTESI ************\n");
            for(PersonelBilgileri w: liste) {
                System.out.println(w);
            }
        }
        islemMenusu();
    }

    private void sil() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Silmek IstediGiniz "+ islemTuru + " nin Kimlik Numarası:");
        String kimlikNo = scan.next();

        kisiSil(kimlikNo, personelBilgileriList);

        islemMenusu();
    }

    private void kisiSil(String kimlikNo, List <PersonelBilgileri> liste) {
        for(PersonelBilgileri w: liste) {
            if(kimlikNo.equals(w.getKimlikNo()) ) {
                System.out.println(kimlikNo + " lu "+ islemTuru +" Silindi");
                return;
            }
        }
        System.out.println(kimlikNo + " lu "+ islemTuru +" Kayidi bulunamadi");
    }

    private void kisiEkle(PersonelBilgileri kisi, List <PersonelBilgileri> liste) {

        for(PersonelBilgileri w : liste) {
            if(kisi.getKimlikNo().equals(w.getKimlikNo()) ) {
                System.out.println(kisi.getKimlikNo() + " nolu Kisi sisteme kayitli.");
                islemMenusu();
            }
        }
        liste.add(kisi);
        System.out.println(kisi.getAdSoyad() + " Sisteme Eklenmistir.");
    }

    private void kimlikNoIleKisiAra (String kimlikNo, List<PersonelBilgileri> liste) {

        for(PersonelBilgileri w : liste) {
            if(w.getKimlikNo().equals(kimlikNo)) {
                System.out.println(w);
                return;
            }
        }
        System.out.println("Aradiginiz kisi bulunamamistir.");
    }

    private void yillikIzin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------- "+ islemTuru + " ------------------");
        System.out.print("Izın Alacak Personelin Kimlik Numarasi:");
        String kimlikNo = scan.next();

        for(PersonelBilgileri w : personelBilgileriList) {
            if(w.getKimlikNo().equals(kimlikNo)) {
                System.out.println(w);
                System.out.print(w.getAdSoyad() + " nin Izın Turu:");
                String izinTuru = scan.nextLine();
                System.out.print(w.getAdSoyad() + " nin Izın Adresi:");
                String izinAdresi = scan.nextLine();
                System.out.print(w.getAdSoyad() + " nin Izın Baslangic Tarihi:");
                String izinBaslangicTarihi = scan.nextLine();
                System.out.print(w.getAdSoyad() + " nin Izın Bitis Tarihi:");
                String izinBitisTarihi = scan.nextLine();
                System.out.print(w.getAdSoyad() + " nin Ise Baslama Tarihi:");
                String iseBaslamaTarihi = scan.nextLine();
                System.out.print(w.getAdSoyad() + " nin Izin Esnasinda Resmi Tatil Ve Haftalik Tatile Denk Gelen Gun Sayisi:");
                int izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi = scan.nextInt();

                PersonelIzınBilgileri personelIzın = new PersonelIzınBilgileri(w.getAdSoyad(),w.getKimlikNo(), w.getDogumTarihi(),
                        w.getIseGirisTarihi(), w.getCalisilanBolum(), izinTuru, izinAdresi, izinBaslangicTarihi,
                        izinBitisTarihi, iseBaslamaTarihi, izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi);
                personelIzınBilgileriList.add(personelIzın);
                System.out.print(w.getAdSoyad() + " nin Firma Adı(AVD / GEST):");
                String firmaAdi = scan.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
                LocalDate dogumTarihi = LocalDate.parse(personelIzın.getDogumTarihi(), formatter);
                System.out.println(formatter.format(dogumTarihi));


                LocalDate iseGirisTarihi = LocalDate.parse(personelIzın.getIseGirisTarihi(), formatter);
                System.out.println(formatter.format(iseGirisTarihi));


                LocalDate izinBaslangic = LocalDate.parse(personelIzın.getIzinBaslangicTarihi(), formatter);
                System.out.println(formatter.format(izinBaslangic));


                LocalDate izinBitis = LocalDate.parse(personelIzın.getIzinBitisTarihi(), formatter);
                System.out.println(formatter.format(izinBitis));


                LocalDate iseBaslama = LocalDate.parse(personelIzın.getIseBaslamaTarihi(), formatter);
                System.out.println(formatter.format(iseBaslama));

                LocalDateTime bugun = LocalDateTime.now();
                System.out.println(formatter.format(bugun));

                int yillikIzin = 0;
                if((bugun.getYear()-iseGirisTarihi.getYear()) <= 5){
                    yillikIzin = 14;
                }else if(5 < bugun.getYear()-iseGirisTarihi.getYear() && bugun.getYear()-iseGirisTarihi.getYear() < 15){
                    yillikIzin = 14;
                }else if(15 < bugun.getYear()-iseGirisTarihi.getYear()) {
                    yillikIzin = 26;
                }else if((bugun.getYear()-dogumTarihi.getYear())<18 || (bugun.getYear()-dogumTarihi.getYear())>50){
                    yillikIzin = 14;
                }
                System.out.println("yıllık izin hakkı: " + yillikIzin);


                int kacGunIzınAldi = ((iseBaslama.getDayOfMonth()-(izinBitis.getDayOfMonth()-izinBaslangic.getDayOfMonth()))*30)
                        + izinEsnasindaResmiTatilVeHaftalikTatileDenkGelenGunSayisi;
                System.out.println("aldıgı izin suresi" +kacGunIzınAldi);


                if(yillikIzin>kacGunIzınAldi){

                }else{

                }








                System.out.println("*******************************************************************************");
                System.out.println("                         PERSONEL İZİN BİLGİLERİ                               ");
                System.out.println("*******************************************************************************");
                System.out.println("Firma Adı: " + firmaAdi);
                System.out.println("Adı Soyadı: " + personelIzın.getAdSoyad());
                System.out.println("TC: " + personelIzın.getKimlikNo());
                System.out.println("Calısılan Bolum: " + personelIzın.getCalisilanBolum());
                System.out.println("Talep Edilen İzin Türü: " + personelIzın.getIzinTuru());
                System.out.println("İzin Başlangıç Tarihi: " + personelIzın.getIzinBaslangicTarihi());
                System.out.println("İzin Bitiş Tarihi: " + personelIzın.getIzinBitisTarihi());
                System.out.println("İşe Başlama Tarihi: " + personelIzın.getIseBaslamaTarihi());
                System.out.println("İzin Süresi: " + kacGunIzınAldi);
                System.out.println("İzin Adresi: " + personelIzın.getIzinAdresi());
                System.out.println("İzin Talep Edilen Tarih: " + bugun);
                System.out.println("===============================================================================");
                System.out.println(personelIzın.getIzinTuru() + "turunden KALAN GUNUNUZ: " + (yillikIzin-kacGunIzınAldi));
                System.out.println("===============================================================================");
                System.out.println("*******************************************************************************");
                return;
            }
        }
        System.out.println("Aradiginiz kisi bulunamamistir.");
        islemMenusu();
    }

    private void cenazeIzni() {

    }

    private void ucretsizIzin() {

    }

    private void analikIzni() {

    }

    private void babalikIzni() {

    }

    private void idariIzin() {

    }

    private void hastalikIzni() {

    }

    private void mesaiKarsiligiIzin() {

    }

    private void diger() {

    }

}