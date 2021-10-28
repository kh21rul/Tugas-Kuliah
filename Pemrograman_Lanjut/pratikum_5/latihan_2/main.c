#include <stdio.h>
#include <stdlib.h>

main()
{
    int a, b, c, hasil;
    printf("Masukkan nilai a = ");
    scanf("%d", &a);
    printf("Masukkan nilai b = ");
    scanf("%d", &b);
    printf("Masukkan nilai c = ");
    scanf("%d", &c);
    printf("\n");
    hasil = a - b;

    printf("Hasil pengurangan : a -b = %d\n", hasil);
    printf("Hasil perkalian : b * c = %d\n", b * c);
    hasil = a / c;
    printf("Hasil pembagian : a/c = %d\n", hasil);
    printf("Hasil operasi : a + b *c = %d\n", a + b * c);
}
