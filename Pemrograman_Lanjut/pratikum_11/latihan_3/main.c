#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

void tambah(int *c, int *d)
{
    *c+=7;
    *d+=5;

    printf("\n Nilai di akhir Fungsi Tambah()\n");
    printf("c = %d, d = %d\n", *c, *d);
}

main()
{
    int a, b;
    a = 4;
    b = 6;
    printf("\n Nilai Sebelum Pemanggilan Fungsi \n");
    printf("a = %d, b = %d\n", a, b);

    tambah(&a, &b);

    printf("\n Nilai Setelah Pemanggialn Fungsi \n");
    printf("a = %d, b = %d \n\n", a, b);
}
