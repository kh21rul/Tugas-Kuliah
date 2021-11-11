#include <stdio.h>
#include <stdlib.h>

int main()
{
    int valid_operator = 1;
    char operatora;
    float bil1, bil2, hasil;
    printf("Masukkan 2 bilangan dan sebuah operator.\n\n");
    printf("Dengan format : \n\n");
    printf("= bilangan -1 operator bilangan -2\n\n");
    printf("= ");

    scanf("%f %c %f", &bil1, &operatora, &bil2);

    if(operatora == '*')
    {
        hasil = bil1 * bil2;
    }
    else if(operatora == '/')
        hasil = bil1 / bil2;
    else if(operatora == '+')
        hasil = bil1 + bil2;
    else if(operatora == '-')
        hasil = bil1 - bil2;
    else
        valid_operator = 0;

    if(valid_operator)
    {
        printf("\nHasil perhitungan\n\n");
        printf("%g %c %g = %g\n", bil1, operatora, bil2, hasil);
    }
    else
    {
        printf("\nOperator SALAH!\n");
    printf("\nGunakan operator +, -, / dan * saja!");
    }
    return 0;
}
