#include <stdio.h>

main()
{
    char huruf;
    int jumlah;
    puts("Masukkan sebuah huruf diikuti dengan nilai!");
    scanf("%c %d", &huruf, &jumlah);
    printf("Jumlah dari %c adalah %d buah\n", huruf, jumlah);
}
