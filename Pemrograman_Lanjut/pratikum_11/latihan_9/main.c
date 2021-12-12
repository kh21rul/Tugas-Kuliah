#include <stdio.h>
#include <stdlib.h>

int i = 273;

void tambah()
{
    i++;
}

main()
{
    printf("Nilai awal i = %d\n", i);
    i += 7;
    printf("Nilai i kini = %d\n", i);
    tambah();
    printf("Nilai i kini = %d\n", i);
    tambah();
    printf("Nilai i kini = %d\n", i);
}
