#include <stdio.h>
#include <stdlib.h>

main()
{
    char kar;
    int jumkar = 0, jumspasi = 0;

    puts("Masukkan sebuah kalimat dan akhiri dgn ENTER.\n");
    puts("Saya akan menghitung jumlah karakter ");
    puts("pada kalimat tersebut.\n");

    while((kar = getchar()) != '\n')
    {
        jumkar++;
         if(kar == ' ') jumspasi++;
    }
    printf("\nJumlah karakter   =   %d", jumkar);
    printf("\nJumlah SPASI      =   %d\n\n", jumspasi);
    return 0;
}
