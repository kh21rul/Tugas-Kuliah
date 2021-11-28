#include <stdio.h>
#include <string.h>
#include <iostream>

using namespace std;

int main()
{
    char huruf[20];
    char pindah[20];

    cout<<"Masukkan Sembarang Kata = ";
    gets(huruf);

    cout<<"Panjang Kata Yang Diinputkan = ";
    cout<<strlen(huruf)<<endl;
    return 0;
}
