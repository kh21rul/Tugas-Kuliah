package Asosiasi_1_1;

public class Mahasiswa {
    private String nama;
    private int NIM;
    private int TahunMasuk;
    private Jurusan jurusan;

    public Mahasiswa(String nama, int NIM, int TahunMasuk) {
        this.nama = nama;
        this.NIM = NIM;
        this.TahunMasuk = TahunMasuk;
        jurusan = null;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public int getTahunMasuk() {
        return TahunMasuk;
    }

    public void setTahunMasuk(int TahunMasuk) {
        this.TahunMasuk = TahunMasuk;
    }
}
