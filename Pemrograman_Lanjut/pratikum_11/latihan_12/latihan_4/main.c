#include <stdio.h>
#include <stdlib.h>

main()
{
    struct tanggal
    {
        int tgl;
        int bulan;
        int tahun;
    };

    struct tanggal sekarang;

    sekarang.tgl = 14;
    sekarang.bulan = 05;
    sekarang.tahun = 2001;

    printf("Tanggalnya adalah %d/%d/%d.\n\n", sekarang.tgl, sekarang.bulan, sekarang.tahun);
}
