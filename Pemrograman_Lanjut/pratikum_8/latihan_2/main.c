#include <stdio.h>
#include <stdlib.h>

int main()
{
    int bilangan;

    for(bilangan = 60; bilangan >= 10; bilangan -= 10)
        printf("%d\n", bilangan);
    return 0;
}
