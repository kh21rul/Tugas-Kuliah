package sepeda;

public class Sepeda {
    int gigi;
    String merk;

    //konstruktor
    public Sepeda(){
        this.gigi=0;
        this.merk="Federal";
    }
    public Sepeda(int g, String m){
        this.gigi = g;
        this.merk = m;
    }
    public void setGigi(int g){
        this.gigi=g;
    }
    public void setMerk(String m){
        this.merk = m;
    }
    public int getGigi(){
        return this.gigi;
    }
    public String getMerk(){
        return this.merk;
    }
    public void berjalan(){
        System.out.println("Sepeda Berjalan");
    }
    public void belokKiri(){
        System.out.println("Sepeda Belok Kiri");
    }
    public void belokKanan(){
        System.out.println("Sepeda Belok Kanan");
    }
}
