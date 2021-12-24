#include <stdio.h>
#include <stdlib.h>

main()
{
    struct dtmhs
    {
        int nim;
        char nama[15];
    };

    struct dtnil
    {
        float nil1;
        float nil2;
    };

    struct
    {
        struct dtmhs mhs;
        struct dtnil nil;
    } nilai;

    //-> masukan data
    printf("Masukkan NIM = ");
    scanf("%d", &nilai.mhs.nim);

    printf("Masukkan Nama = ");
    scanf("%s", &nilai.mhs.nama);

    printf("Masukkan Nilai UTS = ");
    scanf("%f", &nilai.nil.nil1);

    printf("Masukkan Nilai UAS = ");
    scanf("%f", &nilai.nil.nil2);

    //-> menampilkan hasil masukan
    printf("\n\nData Yang di Inputkan adalah : \n\n");
    printf("Masukkan NIM = %d\n", nilai.mhs.nim);
    printf("Masukkan Nama = %s\n", nilai.mhs.nama);
    printf("Masukkan Nilai UTS = %f\n", nilai.nil.nil1);
    printf("Masukkan Nilai UAS = %f\n", nilai.nil.nil2);


}
