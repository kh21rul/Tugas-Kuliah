#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAKS 80

main()
{
    char str1[MAKS];
    char str2[] = "SAKURA";
    strcpy(str1,str2); /*menyalin isi str2 ke str1*/
    printf("String pertama adalah: %s \n", str1);
    printf("String kedua adalah: %s\n", str2);
    return 0;
}
