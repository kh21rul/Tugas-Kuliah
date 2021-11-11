#include <stdio.h>
#include <stdlib.h>

int main()
{
    int bil, absolut;
    printf("Masukkan bilangan bulat : ");
    scanf("%d", &bil);
    if(bil < 0) absolut = -bil;
    printf("Nilai absolute dari %d adalah = %d", bil, absolut);
    return 0;
}
