package tugas.ppt;

public class mahasiswa_informatika {
    public static void main(String[] args) {
        Mahasiswa mahasiswa_informatika_A = new Mahasiswa();

        mahasiswa_informatika_A.Nama = "Khairul Aqram";
        mahasiswa_informatika_A.NIM = "190170125";
        mahasiswa_informatika_A.Alamat = "Aceh Tamiang";
        mahasiswa_informatika_A.SKS = "24";

        System.out.println("Nama Saya :" + mahasiswa_informatika_A.Nama);
        System.out.println("NIM Saya  :" + mahasiswa_informatika_A.NIM);
        System.out.println("Alamat Saya :" + mahasiswa_informatika_A.Alamat);
        System.out.println("Jumlah SKS Yang Saya Ambil :" + mahasiswa_informatika_A.SKS);
    }
}
