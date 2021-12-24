#include <stdio.h>
#include <stdlib.h>

main()
{
    int i, j = 1;

    struct
    {
        int nim;
        char nama[15];
        float nilai;
    } mhs[5];

    for(i=0; i<2; i++)
    {
        printf("Masukkan NIM = ");
        scanf("%d", &mhs[i].nim);

        printf("Masukkan Nama = ");
        scanf("%s", &mhs[i].nama);

        printf("Masukkan Nilai Akhir = ");
        scanf("%f", &mhs[i].nilai);
    }
    printf("\n\nData Yang di Inputkan adalah : \n\n");

    for(i=0; i<2; i++)
    {
        printf("Data Ke - %d\n", j++);
        printf("NIM = %d\n", mhs[i].nim);
        printf("Nama = %s\n", mhs[i].nama);
        printf("Nilai Akhir = %.2f\n", mhs[i].nilai);
    }
}
