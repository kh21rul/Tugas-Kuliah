#include <stdio.h>
#include <stdlib.h>

int main()
{
    char kodeBar[20], namBar[20];
    int harga, item, jumlah, total, bayar, kembalian;
    float diskon;

    printf("Masukkan Kode Barang : ");
    gets(kodeBar);
    printf("Masukkan Nama Barang : ");
    gets(namBar);
    printf("Masukkan Harga Barang : ");
    scanf("%d", &harga);
    printf("Masukkan Berapa Item : ");
    scanf("%d", &item);
    jumlah = harga * item;
    printf("Jumlah = %d", jumlah);
    diskon = jumlah * 0.05;
    printf("\nDiskon 5 persen = %f", diskon);
    total = jumlah - diskon;
    printf("\nTotal Pembayaran = %d", total);
    printf("\nMasukkan Uang Pembayaran : ");
    scanf("%d", &bayar);
    kembalian = bayar - total;
    printf("Jumlah Kembalian = %d", kembalian);
}
