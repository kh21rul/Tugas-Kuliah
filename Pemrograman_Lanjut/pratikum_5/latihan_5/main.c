#include <stdio.h>
#include <stdlib.h>

main()
{
    int m = 45, n = 30;
    printf("%d << %d = %d\n", m, n, m << n);
    printf("%d >> %d = %d\n", m, n, m >> n);
    printf("%d & %d = %d\n", m, n, m & n);
    printf("%d | %d = %d\n", m, n, m | n);
    printf("%d ^ %d = %d\n", m, n, m ^ n);
    printf("~%d = %d\n", m, ~m);
}
