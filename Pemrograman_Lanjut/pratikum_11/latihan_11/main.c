#include <stdio.h>
#include <stdlib.h>

main()
{
    register int i;
    int jumlah = 0;

    for(i=1; i<=100; i++)
        jumlah = jumlah + i;

    printf("1 + 2 + 3 + ... + 100 = %d\n", jumlah);
}
