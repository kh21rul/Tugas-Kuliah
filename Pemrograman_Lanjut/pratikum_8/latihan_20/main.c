#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b;
    char lagi;
    atas:
        printf("\nMasukkan Bilangan = ");
        scanf("%i", &a);

        b = a % 2;

        printf("Nilai %d %% 2 adalah = %d", a, b);
        printf("\n\nIngin Hitung Lagi [Y/T] : ");
        lagi = getche();
        printf("\n");

        if(lagi == 'Y' || lagi == 'y')
            goto atas;
    return 0;
}
