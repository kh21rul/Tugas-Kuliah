#include <stdio.h>
#include <stdlib.h>

int main()
{
    int pil, v_kubus, s_kubus, r_lingkaran, r_silinder, t_silinder;
    float l_lingkaran, v_silinder;

    printf("Menu : \n");
    printf("1. Menghitung volume kubus\n");
    printf("2. Menghitung luas lingkaran\n");
    printf("3. Menghitung volume silinder\n");

    printf("\nMasukkan pilihan : ");
    scanf("%d", &pil);
    switch(pil)
    {
        case 1 :
            printf("Masukkan panjang sisi kubus : ");
            scanf("%d", &s_kubus);
            v_kubus = s_kubus * s_kubus * s_kubus;
            printf("Volume kubus ialah : %d\n", v_kubus);
        break;
        case 2 :
            printf("Masukkan panjang jari - jari lingkaran : ");
            scanf("%d", &r_lingkaran);
            l_lingkaran = 3.14 * (r_lingkaran * r_lingkaran);
            printf("Luas lingkaran ialah : %f\n", l_lingkaran);
        break;
        case 3 :
            printf("Masukkan panjang jari - jari lingkaran : ");
            scanf("%d", &r_silinder);
            printf("Masukkan tinggi silinder : ");
            scanf("%d", &t_silinder);
            v_silinder = 3.14 * (r_lingkaran * r_lingkaran) * t_silinder;
            printf("Volume silinder ialah : %f\n", v_silinder);
        break;
    }
    return 0;
}
