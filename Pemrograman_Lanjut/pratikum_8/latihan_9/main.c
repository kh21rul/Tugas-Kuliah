#include <stdio.h>
#include <stdlib.h>

int main()
{
    int data, jumlah, cacah;
    jumlah = 0;
    data = 0;
    cacah = 0;
    while(data != -1)
    {
        printf("Masukkan data angka (-1 untuk berhenti): ");
        scanf("%d", &data);
        if(data == -1)
            break;
        jumlah += data;
        cacah++;
    }
    printf("Jumlah data adalah : %d\n", jumlah);
    printf("Rata-rata : %d\n", jumlah/cacah);
    return 0;
}
