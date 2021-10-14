#include <stdio.h>
#define PI 3.141593

main()
{
    float radius, keliling, luas;
    printf("Jari-jari lingkaran : ");
    scanf("%f", &radius);
    keliling = 2 * PI * radius;
    luas = 0,5 * PI * radius * radius;
    printf("Data Segitiga : \n");
    printf("Jari-jari = %f\n", radius);
    printf("Keliling = %f\n", keliling);
    printf("Luas = %f\n", luas);
}
