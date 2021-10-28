#include <stdio.h>
#include <stdlib.h>

main()
{
    int a = 14, b = 2, c = 3, d = 4;
    printf("a = &d, b = %d, c = %d, d = %d\n\n", a, b, c, d);
    printf("Hasil a %% b = %d\n", a % b);
    printf("Hasil a %% c = %d\n", a % c);
    printf("Hasil a %% d = %d\n", a % d);
    printf("Hasil a / d * d + a %% d = %d\n", a / d * d + a % d);
}
