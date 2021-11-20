#include <stdio.h>
#include <stdlib.h>
#define MAKS 8

int main()
{
    int baris, kolom, hasil_kali;

    for(baris=1; baris<=MAKS; baris++)
    {
        for(kolom=1; kolom<=MAKS; kolom++)
        {
            hasil_kali = baris * kolom;
            printf("%2d\t", hasil_kali);
        }
        printf("\n");
    }
    return 0;
}
