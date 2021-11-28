#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>

using namespace std;

int main()
{
    char huruf[20];
    char pindah[20];

    cout<<"Masukkan Sembarang Kata = ";
    gets(huruf);

    /* Proses */
    strcpy(pindah,huruf);

    cout<<"Pemindahannya = "<<pindah<<endl;


    return 0;
}
