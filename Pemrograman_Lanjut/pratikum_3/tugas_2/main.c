#include <stdio.h>
#include <stdlib.h>

main()
{
    float dasar, tinggi, luas;
    printf("Dasar : ");
    scanf("%f", &dasar);
    printf("Tinggi : ");
    scanf("%f", &tinggi);
    luas = (dasar * tinggi)/2;
    printf("Luas : %f", luas);
}
