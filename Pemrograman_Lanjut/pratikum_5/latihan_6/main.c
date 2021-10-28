#include <stdio.h>
#include <stdlib.h>

main()
{
    int m = -45;
    printf("%d >= 0 && %d <= 150 : %d\n", m, m, m >= 0 && m <= 150);
    printf("%d >= 0 || %d <= 150 : %d\n", m, m, m >= 0 || m <= 150);
}
