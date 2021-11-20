#include <stdio.h>
#include <stdlib.h>

int main()
{
    char kar;
    printf("Tekanlah x untuk menghentikan program.\n");

    for(;;)
    {
        while((kar = getchar()) == 'x')
            exit(0);
    }
    return 0;
}
