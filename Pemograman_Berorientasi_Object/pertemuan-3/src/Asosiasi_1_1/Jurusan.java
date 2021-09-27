package Asosiasi_1_1;

public class Jurusan {
    String namaJurusan;
    private Mahasiswa mahasiswa;

    public Jurusan(String namaJurusan){
        this.namaJurusan = namaJurusan;
        mahasiswa = null;
    }
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    public String getNamaJurusan() {
        return namaJurusan;
    }
    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
}
