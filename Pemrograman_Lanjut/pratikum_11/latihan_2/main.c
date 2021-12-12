#include <stdio.h>
#include <stdlib.h>

void tambah(int m, int n)
{
    m+=5;
    n+=7;

    printf("\n\nNilai di dalam Fungsi Tambah()");
    printf("\n m = %d, n = %d\n", m, n);
}

main()
{
    int a, b;

    a = 5;
    b = 9;

    printf("Nilai Sebelum Fungsi Digunakan \n");
    printf("a = %d, b = %d\n", a, b);

    tambah(a, b);
    printf("\nNilai Setelah Fungsi Digunakan \n");
    printf("a = %d, b = %d\n\n", a, b);
}
