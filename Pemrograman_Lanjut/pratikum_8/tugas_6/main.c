#include <stdio.h>
#include <stdlib.h>

int main()
{
    int menu = 1;

    while(menu == 1 || menu == 2 || menu == 3) {
        printf("MENU PILIHAN\n");
        printf("1. Baca Data\n");
        printf("2. Ubah Data\n");
        printf("3. Hapus Data\n");
        printf("4. Exit\n\n");
        printf("Masukkan Pilihan anda : ");
        scanf("%d", &menu);
    }
    printf("\nProgram Berhenti\n");
    return 0;
}
