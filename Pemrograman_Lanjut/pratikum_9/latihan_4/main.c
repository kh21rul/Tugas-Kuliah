#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char str1[] = "HALO";
    char str2[] = "Halo";
    char str3[] = "HALO";

    printf("Hasil perbandingan %s dengan %s: %d\n", str1, str2, strcmp(str1,str2));
    printf("Hasil perbandingan %s dengan %s: %d\n", str2, str1, strcmp(str2,str1));
    printf("Hasil perbandingan %s dengan %s: %d\n", str1, str3, strcmp(str1,str3));
    printf("Hasil perbandingan %s dengan %s: %d\n", str3, str1, strcmp(str3,str1));
    printf("Hasil perbandingan %s dengan %s: %d\n", str2, str3, strcmp(str2,str3));
    printf("Hasil perbandingan %s dengan %s: %d\n", str3, str2, strcmp(str3,str2));

    return 0;
}
