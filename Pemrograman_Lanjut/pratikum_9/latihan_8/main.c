#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int i, j, panjang;
    char string[80];

    printf("Masukkan sebarang string: ");
    gets(string);

    panjang = strlen(string);
    for(i=0; i<panjang; i++)
    {
        for(j=i; j<panjang; j++)
            printf("%c", string[j]);
        printf("\n");
    }
    return 0;
}
