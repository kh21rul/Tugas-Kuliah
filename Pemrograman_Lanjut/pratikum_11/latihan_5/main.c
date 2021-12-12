#include <stdio.h>
#include <stdlib.h>

int minimum (int x, int y)
{
    if(x < y)
        return(x);
    else
        return(y);
}

main()
{
    int a, b, kecil;

    printf("Masukkan nilai a : ");
    scanf("%d", &a);

    printf("Masukkan nilai b : ");
    scanf("%d", &b);

    kecil = minimum(a,b);
    printf("\nBilangan terkecil antara %d dan %d adalah %d\n\n", a, b, kecil);
}
