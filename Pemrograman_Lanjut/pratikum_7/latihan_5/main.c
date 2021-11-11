#include <stdio.h>
#include <stdlib.h>

int main()
{
    int pembilang, penyebut, sisa;
    printf("Masukkan pembilang : ");
    scanf("%d", &pembilang);
    printf("Masukkan penyebut : ");
    scanf("%d", &penyebut);
    sisa = pembilang % penyebut;
    puts("");
    if(sisa)
        printf("%d tidak habis dibagi %d\n", pembilang, penyebut);
    else
        printf("%d habis dibagi %d\n", pembilang, penyebut);
    return 0;
}
