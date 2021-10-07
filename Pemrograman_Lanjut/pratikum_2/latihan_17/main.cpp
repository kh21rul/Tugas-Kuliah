#include <stdio.h>
#include <iostream>
#include <iomanip>

using namespace std;

main()
{
    int a;
    cout<<"Penggunaan Manipulator setfill()"<<"\n\n";
    cout<<"-------------------------"<<"\n";
    for(a = 1; a<=15; a++) {
        cout<<setfill('-');
        cout<<setw(a)<<a<<endl;
    }
    return 0;
}
