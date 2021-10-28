#include <stdio.h>
#include <stdlib.h>

main()
{
    float a, b, c, d = 0;
    a = 3.0f;
    b = 4.0f;
    c = 7.0f;
    d = b * b - 4 * a * c;
    printf("Diskriminan = %f\n", d);
}
