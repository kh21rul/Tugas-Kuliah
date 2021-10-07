#include <stdio.h>
#include <iostream>
#include <iomanip>

using namespace std;

main()
{
    cout<<"Penggunaan ios::scientific dan ios::fixed\n";
    cout<<"\nHasil ios::scientific dari 75.45 adalah ";
    cout<<setiosflags(ios::scientific)<<75.45<<endl;
    cout<<"Hasil ios::fixed dari 56.65 adalah ";
    cout<<setiosflags(ios::fixed)<<56.65<<endl;
    return 0;
}
