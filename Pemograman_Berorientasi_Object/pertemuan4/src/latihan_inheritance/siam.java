package latihan_inheritance;

public class siam extends catt //class siam adalah turunan class catt
{
    public static void main(String[] args)
    {
        siam siam1 = new siam();
        siam1.jumlah_ekor = 10; // class siam memiliki field
        //jumlah_ekor karena jumlah_ekor diturunkan dari class catt
        siam1.makan(); // akan mencetak "Makan"
    }
}
