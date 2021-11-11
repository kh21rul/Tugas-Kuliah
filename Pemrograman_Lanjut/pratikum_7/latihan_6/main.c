#include <stdio.h>
#include <stdlib.h>

int main()
{
    char tag;
    printf("Masukkan tipe tag ( 2 / 4) : ");
    scanf("%c", &tag);
    if(tag == '2') {
        printf("Merk sepeda motor bertipe 2 tag\n\n");
        printf(" 1. YA MAHA");
        printf(" 2. YA SUZUKI");
        printf(" 3. YA HONDA \n");
    }
    else
    {
        printf("Merk sepeda motor bertipe 4 tag\n\n");
        printf(" 1. HONDA");
        printf(" 2. SUZUKI");
        printf(" 3. YAMAHA \n");
    }
    return 0;
}
