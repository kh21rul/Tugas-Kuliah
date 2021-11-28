#include <stdio.h>
#include <string.h>
#include <iostream>
#include <stdlib.h>
#include <stdio.h>

int main()
{
    char a1[] = "BSI";
    char a2[] = "Bsi";
    char b1[] = "BSI";

    cout<<"Hasil Perbandingan "<<a1<<"dan "<<a2<<"->";
    cout<<strcmp(a1,a2)<<endl;

    cout<<"Hasil Perbandingan "<<a2<<"dan "<<a2<<"->";
    cout<<strcmp(a2,a1)<<endl;

    cout<<"Hasil Perbandingan "<<a1<<"dan "<<b1<<"->";
    cout<<strcamp(a1,b1)<<endl;


    return 0;
}
