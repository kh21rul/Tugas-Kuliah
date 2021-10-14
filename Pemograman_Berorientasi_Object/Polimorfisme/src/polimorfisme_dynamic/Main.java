package polimorfisme_dynamic;

public class Main {
    public static void main(String[] args) {

        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(6, 3);
        Lingkaran lingkaran = new Lingkaran(50);

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " +
                persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " +
                lingkaran.luas());
        System.out.println("keliling lingkaran: " +
                lingkaran.keliling());
    }
}
