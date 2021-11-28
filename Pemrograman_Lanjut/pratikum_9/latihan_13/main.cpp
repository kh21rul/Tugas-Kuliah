#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <iostream>

using namespace std;

int main()
{
    char kata[20];

    cout<<"Masukkan Sembarang Kata dengan Huruf Besar = ";
    gets(kata);

    strlwr(kata);
    cout<<"Hasil Perubahan = "<<kata<<endl;
    return 0;
}
