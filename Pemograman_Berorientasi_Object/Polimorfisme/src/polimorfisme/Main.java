package polimorfisme;

public class Main {
    public static void main (String args[]) {
        Lingkaran lingkaran1 = new Lingkaran();

        System.out.println("Luas lingkaran dengan jari-jari : " + lingkaran1.luas(6));
        System.out.println("Luas Lingkaran dengan diameter : " + lingkaran1.luas(3.5));
    }
}
