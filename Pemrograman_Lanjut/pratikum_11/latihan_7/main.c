#include <stdio.h>
#include <stdlib.h>

float jumlah(float x, float y)
{
    return(x + y);
}

main()
{
    float a, b, c;

    printf("Masukkan nilai a : ");
    scanf("%f", &a);

    printf("Masukkan nilai b : ");
    scanf("%f", &b);

    c = jumlah(a, b);
    printf("\nHasil penjumlahan a + b = %g\n", c);

}
