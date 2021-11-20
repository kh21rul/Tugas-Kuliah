#include <iostream>

using namespace std;

int main()
{
    int a, b;
    for(a=1; a<=5; a++)
    {
        printf("\n");
        for(b=a; b<=5; b++)
            cout<<a<<" ";
    }
    printf("\n\n");
    return 0;
}
