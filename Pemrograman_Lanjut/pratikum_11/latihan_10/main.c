#include <stdio.h>
#include <stdlib.h>

void fung_y()
{
    static int y;
    y++;
    printf("Nilai y dalam fung_y() = %d\n", y);
}

main()
{
    int y = 20;
    fung_y();
    fung_y();
    printf("Nilai y dalam main() = %d\n", y);
}
