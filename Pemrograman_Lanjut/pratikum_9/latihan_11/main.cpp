#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <iostream>

using namespace std;

int main()
{
    char kata[20];
    float angka, a, b;

    cout<<"Masukkan Sembarang Kata Berupa angka = ";
    gets(kata);

    angka = atoi(kata);
    a = angka + 5;

    cout<<"Hasil Perubahan ditambah dengan 5 = "<<a;
    return 0;
}
