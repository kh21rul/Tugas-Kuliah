#include <stdio.h>
#include <string.h>
#include <iostream>

using namespace std;

int main()
{
    char kata[20];
    cout<<"Masukkan Sembarang Kata = ";
    gets(kata);

    strrev(kata);
    cout<<"Hasil Perubahan = "<<kata<<endl;
    return 0;
}
