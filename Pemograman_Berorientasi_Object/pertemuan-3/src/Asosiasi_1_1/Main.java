package Asosiasi_1_1;

public class Main {
    public static void main(String args []) {
        Mahasiswa mahasiswa = new Mahasiswa("Khairul Aqram",
                190170125, 2019);
        Jurusan jurusan = new Jurusan("TEKNIK INFORMATIKA");
        jurusan.setMahasiswa(mahasiswa);
        mahasiswa.setJurusan(jurusan);
        System.out.println("Nama: " + mahasiswa.getNama()
                + "\n" + "NIM: " + mahasiswa.getNIM() + "\n" +
                "Jurusan: " + jurusan.getNamaJurusan() + "\nTahun Masuk : " +
                mahasiswa.getTahunMasuk());
    }
}
