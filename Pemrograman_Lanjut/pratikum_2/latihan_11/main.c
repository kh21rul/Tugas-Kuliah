#include <stdio.h>
#include <stdlib.h>

main()
{
    int n;
    printf("Masukkan nilai integer : ");
    scanf("%d", &n);
    printf("ASCII (desimal) = %d\n", n);
    printf("ASCII (hexadesimal) = %x\n", n);
    printf("ASCII (octal) = %o\n", n);
}
