#include <stdio.h>
#include <stdlib.h>

int main()
{
    int bil;

    printf("Masukkan bilangan : ");
    scanf("%d", &bil);
    switch(bil)
    {
        case 1 : printf("Anda memasukkan bilangan satu\n");
        break;
        case 2 : printf("Anda memasukkan bilangan dua\n");
        break;
        case 3 : printf("Anda memasukkan bilangan tiga\n");
        break;
        default : printf("Anda memasukkan bilangan selain 1, 2 dan 3\n");
        break;
    }
    return 0;
}
