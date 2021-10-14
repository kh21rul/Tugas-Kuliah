#include <iostream>
#include <conio.h>
#include <stdio.h>

using namespace std;

int main()
{
    char nama[20], alamat[20], cita[20], hurufFavorit, angkaFavorit;
    int NIM;
    string hoby;

    printf("\nMasukkan Nama Anda \t: ");
    gets(nama);
    printf("Masukkan Alamat Anda \t: ");
    gets(alamat);
    printf("Masukkan cita-cita \t: ");
    gets(cita);
    printf("Masukkan NIM Anda \t: ");
    scanf("%d", &NIM);
    cout<<"Masukkan Hoby Anda \t: ";cin>>hoby;
    printf("\nMasukkan Huruf Favorit Anda \t: ");
    hurufFavorit = getch();
    printf("\nMasukkan Angka Favorit Anda \t: ");
    angkaFavorit = getche();

    printf("\n\n\n======================================================\n");

    printf("\n\nNama Anda ialah \t: %s", nama);
    printf("\nNIM Anda ialah \t\t: %d", NIM);
    printf("\nAlamat Anda ialah \t: %s", alamat);
    cout<<"\nHoby Anda adalah \t: "<<hoby<<endl;
    printf("Cita-cita Anda ialah \t: %s", cita);
    printf("\n\nHuruf Favorit Anda ialah \t: %c", hurufFavorit);
    printf("\nAngka Favorit Anda ialah \t: %c", angkaFavorit);
    printf("\n\n\n");

}
