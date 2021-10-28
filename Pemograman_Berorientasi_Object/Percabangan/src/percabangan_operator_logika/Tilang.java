package percabangan_operator_logika;

public class Tilang {
    public static void main(String[] args) {
        boolean SIM = false;
        boolean STNK = true;
        // cek apakah dia akan ditilang atau tidak
        if(SIM == true){
            if( STNK == true ) {
                System.out.println("Tidak ditilang!");
            }
        } else {
            System.out.println("Anda ditilang!");
        }
    }

}
