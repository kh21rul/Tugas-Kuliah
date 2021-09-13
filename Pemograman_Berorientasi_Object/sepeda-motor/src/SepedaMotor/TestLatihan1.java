package SepedaMotor;

public class TestLatihan1 {
    public static void main(String[] args) {
        Motor motor1 = new Motor();

        System.out.println("\nGigi Motor 1 saat ini = " + motor1.getGigi());
        System.out.println("Merk Motor 1 saat ini = " + motor1.getMerk());

        System.out.println("\nKita Rubah Motor 1\n");
        motor1.setGigi(3);
        motor1.setMerk("CBR 250 RR");
        System.out.println("Gigi Motor 1 saat ini = " + motor1.getGigi());
        System.out.println("Merk Motor 1 saat ini = " + motor1.getMerk() + "\n");
        motor1.berjalan();
        motor1.belokKanan();
        motor1.belokKiri();
        motor1.kecelakaan();
        System.out.println("\n =========================================== \n");

        Motor motor2 = new Motor(6, "Jupiter");

        System.out.println("\nGigi Motor 2 saat ini = " + motor2.getGigi());
        System.out.println("Merk Motor 2 saat ini = " + motor2.getMerk());

        System.out.println("\nKita Rubah Motor 2\n");
        motor2.setGigi(12);
        motor2.setMerk("Yamaha R1M");
        System.out.println("Gigi Motor 2 saat ini = " + motor2.getGigi());
        System.out.println("Merk Motor 2 saat ini = " + motor2.getMerk() + "\n");
        motor2.berjalan();
        motor2.belokKiri();
        motor2.belokKanan();
        motor2.makinKencang();




    }
}
