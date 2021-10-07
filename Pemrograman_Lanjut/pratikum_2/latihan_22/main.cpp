#include <stdio.h>
#include <iostream>
#include <iomanip>

using namespace std;

main()
{
    int a = 8, b = 9;

    cout<<"Tanpa Menggunakan ios::showpos"<<"\n\n";
    cout<<"Nilai a = "<<a<<" Nilai b = "<<b<<endl;
    cout<<"\n\n";
    cout<<setiosflags(ios::showpos);
    return 0;
}
