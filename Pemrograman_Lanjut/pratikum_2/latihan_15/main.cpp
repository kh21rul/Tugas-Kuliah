#include <stdio.h>
#include <conio.h>
#include <iostream>
#include <iomanip>

using namespace std;

main()
{
    int a = 250;
    cout<<"Penggunaan Manipulator setbase()"<<"\n\n";
    cout<<"Decimal Octal Hexadecimal"<<endl;
    cout<<"------------------"<<"\n";

    for(a=250; a<=260; a++) {
        cout<<setbase(10)<<a<<"   ";
        cout<<setbase(8)<<a<<"   ";
        cout<<setbase(16)<<a<<endl;
    }
    return 0;
}
