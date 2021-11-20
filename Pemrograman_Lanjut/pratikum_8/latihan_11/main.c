#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, j;
    double penjum_ganda = 0.0;

    printf("nilai i adalah : \t");
    for(i=1; i<=5; i++)
    {
        printf("%i\t", i);
    }
    printf("\nnilai j adalah : \t");
    for(j = 2; j<=4; j++)
    {
        printf("%i\t", j);
    }

    penjum_ganda = penjum_ganda + i * j;
    printf("\n\nPenjumlahan antara %i dan %i adalah %.2f\n\n", i, j, penjum_ganda);
    return 0;
}
