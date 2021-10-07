#include <stdio.h>
#include <iostream>
#include <iomanip>

using namespace std;

main()
{
    int a;
    cout<<"Penggunaan Manipulator setw()"<<"\n\n";
    cout<<"-------------------------"<<"\n";
    for(a = 1; a<=15; a++) {
        cout<<setw(a)<<a<<endl;
    }
    cout<<"-------------------------"<<"\n";
    return 0;
}
