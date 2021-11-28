#include <stdio.h>
#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    char kalimat[100];
    int jumlahKarakter;

    printf("Program Menghitung Jumlah Karakter\n\n");
    printf("Input String : ");
    gets(kalimat);

    jumlahKarakter = strlen(kalimat);
    printf("Jumlah Karakter : %d\n\n", jumlahKarakter);

    return 0;
}
