#include <stdio.h>
#include <iostream>
#include <iomanip>

using namespace std;

main()
{
    cout<<"\n\n";
    cout<<"BIlangan Decimal dan 75  =";
    cout<<setiosflags(ios::dec)<<75<<endl;
    cout<<"Bilangan Octal dari 10  = ";
    cout<<setiosflags(ios::oct)<<10<<endl;
    cout<<"Bilangan Hexadecimal dari 15 =" ;
    cout<<setiosflags(ios::hex)<<15<<endl;
    return 0;
}
