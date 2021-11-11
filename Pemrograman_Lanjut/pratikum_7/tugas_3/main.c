#include <stdio.h>
#include <stdlib.h>

int main()
{
    float I, II, Nr;

    printf("Masukkan nilai I anda : ");
    scanf("%f", &I);
    printf("Masukkan nilai II anda : ");
    scanf("%f", &II);

    if(I >= 60) {
        printf("\nAnda Lulus\n");
    }
    else if(I < 60)
    {
        Nr = (I + II) / 2;
        if(Nr >= 70) {
        printf("\nAnda Lulus\n");
        } else {
        printf("\nTidak Lulus\n");
        }

    }
    else {
        printf("\nTidak Lulus\n");
    }
    return 0;
}
