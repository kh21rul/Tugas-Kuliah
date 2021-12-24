#include <stdio.h>
#include <stdlib.h>

main()
{
    struct
    {
        int nim;
        char nama[15];
        float nilai;
    }mahasiswa;

    printf("Masukkan NIM = ");
    scanf("%d", &mahasiswa.nim);
    printf("\nMasukan Nama = ");
    scanf("%s", &mahasiswa.nama);
    printf("\nMasukan Nilai Akhir = ");
    scanf("%f", &mahasiswa.nilai);

    printf("\n\nData Yang di Inputkan adalah : \n\n");
    printf("NIM = %d\n", mahasiswa.nim);
    printf("Nama = %s\n", mahasiswa.nama);
    printf("Nilai Akhir = %.2f\n", mahasiswa.nilai);
}
