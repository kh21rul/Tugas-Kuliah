#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <iostream>

using namespace std;

int main()
{
    char a1[20];
    char a2[20];

    cout<<"Masukkan Kata - 1 = ";
    cin>>a1;
    cout<<"Masukkan Kata - 2 = ";
    cin>>a2;
    strcat(a1,a2); //penggabungan dua kata
    cout<<"Hasil Penggabungannya "<<a1<<endl;
    return 0;
}
