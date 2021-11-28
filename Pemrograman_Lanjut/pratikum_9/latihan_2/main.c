#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define PJG 15

int main()
{
    char str1[PJG]="saya", str2[PJG]="pergi";

    printf("string 1 adalah %s\n", str1);
    printf("string 2 adalah %s\n", str2);
    strcat(str1,str2); // penggabungan dua kata
    printf("penggabungan antara saya dan pergi adalah %s\n\n", str1);
    return 0;
}
