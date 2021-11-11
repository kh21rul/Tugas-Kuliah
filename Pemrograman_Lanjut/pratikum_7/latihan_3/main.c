#include <stdio.h>
#include <stdlib.h>

int main()
{
    int bil, abs;
    printf("Masukkan bilangan bulat : ");
    scanf("%d", &bil);
    if(bil < 0)
        abs = -bil;
    printf("Nilai absolut dari %d adalah %d\n\n", bil, abs);
}
