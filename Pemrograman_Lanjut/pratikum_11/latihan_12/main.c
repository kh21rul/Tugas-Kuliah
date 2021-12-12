#include <stdio.h>
#include <stdlib.h>

int kali(int i, int j)
{
    return(i * j);
}

main()
{
    int k;

    for(k=1; k<20; k++)
        printf("nilai perkalian loop ke-%d, --> antara i * j = %d\n", k, kali(k, k * 2));
}
