package Asosiasi_1_1;

public class Mahasiswa {
    private String nama;
    private int NIM;
    private Jurusan jurusan;

    public Mahasiswa(String nama, int NIM){
        this.nama = nama;
        this.NIM = NIM;
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
}
