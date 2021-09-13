package SepedaMotor;

public class Motor {
    int gigi;
    String merk;

    // konstruktornya
    public Motor() {
        this.gigi = 0;
        this.merk = "Supra X";
    }
    public Motor(int g, String m) {
        this.gigi = g;
        this.merk = m;
    }
    public void setGigi(int g) {
        this.gigi = g;
    }
    public void setMerk(String m) {
        this.merk = m;
    }
    public int getGigi() {
        return this.gigi;
    }
    public  String getMerk() {
        return this.merk;
    }
    public void berjalan() {
        System.out.println("Motor Berjalan");
    }
    public void belokKiri() {
        System.out.println("Motor Belok Kiri !!!");
    }
    public void belokKanan() {
        System.out.println("Motor Belok Kanan !!!");
    }
    public void kecelakaan() {
        System.out.println("Motor Nabrak (^_^) ");
        System.out.println("Pengendara Masuk RS Arun");
    }
    public void makinKencang() {
        System.out.println("Laju Motor bertambah Kencang ('-')");
        System.out.println("Yamaha Semakin di Depan");
    }
}
