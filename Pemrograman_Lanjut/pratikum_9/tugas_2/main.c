#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define PJG 15

int main()
{
    char klm1[PJG]="Teknik", klm2[PJG]="Informatika";

    printf("Kalimat 1 adalah %s\n", klm1);
    printf("Kalimat 2 adalah %s\n", klm2);
    strcat(klm1,klm2); // penggabungan dua kata
    printf("penggabungan antara saya dan pergi adalah %s\n\n", klm1);
    return 0;
}
