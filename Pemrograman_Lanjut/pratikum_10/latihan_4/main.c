#include <stdio.h>
#include <stdlib.h>

int main()
{
    int tahun, kode_program;
    int data_lulus[4][3];

    data_lulus[0][0] = 80;
    data_lulus[0][1] = 540;
    data_lulus[0][2] = 1032;

    data_lulus[1][0] = 25;
    data_lulus[1][1] = 83;
    data_lulus[1][2] = 301;

    data_lulus[2][0] = 8;
    data_lulus[2][1] = 12;
    data_lulus[2][2] = 15;

    data_lulus[3][0] = 10;
    data_lulus[3][1] = 129;
    data_lulus[3][2] = 257;

    printf("Masukkan tahun dr data yang ingin anda ketahui");
    printf("(1998..2000) : ");
    scanf("%d", &tahun);
    printf("Masukkan kode program kursus yang ingin anda ketahui\n");
    printf("(1 = INTRO, 2 = BASIC, 3 = PASCAL, 4 = C) : ");
    scanf("%d", &kode_program);
    printf("\nTotal kelulusan program tsb = %d\n", data_lulus[kode_program - 1][tahun - 1998]);
    return 0;
}
