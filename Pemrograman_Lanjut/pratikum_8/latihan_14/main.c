#include <stdio.h>
#include <stdlib.h>

int main()
{
    char kar;

    printf("Ketik sembarang kalimat\n");
    printf("dan akhiri dengan ENTER\n\n");

    for(;;)
    {
        kar = getchar();
        if(kar == '\n')
            break;
    }
    printf("Selesai\n");
    return 0;
}
