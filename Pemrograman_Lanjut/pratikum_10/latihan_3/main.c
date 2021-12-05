#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i;
    int values[] = {1,2,3,4,5,6,7,8,9};
    char word[] = {'H','e','l','l','o'};

    for(i=0; i<9; ++i)
        printf("values[%d]is %d\n", i, values[i]);

    printf("\n");
    for(i=0; i<5; ++i)
        printf("word[%d]is %c\n", i, word[i]);
    return 0;
}
