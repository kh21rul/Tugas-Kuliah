#include <stdio.h>
#include <stdlib.h>

int inisialisasi()
{
    return(25);
}

main()
{
    int x, y;

    x = inisialisasi();
    printf("x = %d\n", x);

    y = inisialisasi();
    printf("y = %d\n", y);
}
