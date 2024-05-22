package Week4.Calisan;

public class OgretimGorevlisi extends Akademisyen {

    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " öğretim görevlisi B kapısından giriş yaptı..");
    }
    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdSoyad() + " öğretim görevlisi "+ saat + " saatinde giriş yaptı");
    }
}
