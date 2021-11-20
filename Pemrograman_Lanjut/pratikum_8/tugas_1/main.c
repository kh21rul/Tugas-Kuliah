#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a;
    for(a=1; a<=20; a++)
    {
        if (a%2==0)
        {
            printf("%d ", a);
        }
    }
    printf("\n\n\n");
    return 0;
}
