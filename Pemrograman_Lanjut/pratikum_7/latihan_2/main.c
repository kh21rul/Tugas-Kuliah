#include <stdio.h>
#include <stdlib.h>

int main()
{
    int usia;
    printf("Berapa usia Anda : ");
    scanf("%d", &usia);
    if(usia < 16)
        printf("Anda belum boleh mendapat SIM C\n");
}
