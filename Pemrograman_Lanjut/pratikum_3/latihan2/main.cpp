#include <iostream>
#include <stdio.h>
#include <conio.h>

using namespace std;

main()
{
    char nm1[20];
    char nm2[20];
    puts("Masukkan nama ke -1 = ");
    gets(nm1);
    printf("Masukkan nama ke - 2 = ");
    scanf("%s", &nm2);
    printf("\n\n");
    puts("Senang Berkanalan Dengan Anda..");
    puts(nm1);
    printf("Senang Berkenalan Dengan Anda..%s\n", nm1);
    puts("Senang Berkenalan Dengan Anda..");
    puts(nm1);
    printf("\n\n");
    puts("Senang Berkenalan Dengan Anda..");
    puts(nm2);
    printf("Senang Berkenalan Dengan Anda..%a\n", nm2);
    return 0;
}



