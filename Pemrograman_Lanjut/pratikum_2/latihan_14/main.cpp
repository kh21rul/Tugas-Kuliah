#include <stdio.h>
#include <iostream>
#include <iomanip>

using namespace std;

main()
{
    float a, b, c;
    a = 25.77;
    b = 23.45;
    c = a * b;

    cout<<setiosflags(ios::fixed);
    cout<<setprecision(1)<<c<<endl;
    cout<<setprecision(2)<<c<<endl;
    cout<<setprecision(3)<<c<<endl;
    cout<<setprecision(4)<<c<<endl;
    cout<<setprecision(5)<<c<<endl;
    return 0;
}
