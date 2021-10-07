#include <stdio.h>
#include <conio.h>
#include <iostream>
#include <iomanip>

using namespace std;

main()
{
    double a = 78;
    //->tanpa tanda format ios::showpoint
    cout<<"Tanpa tanda format ios::showpoint"<<endl;
    cout<<"Variabel a = "<<a<<"\n\n";

    //-> dengan tanda format ios::showpoint
    cout<<"Dengan tanda format ios::showpoint"<<endl;
    cout<<setiosflags(ios::showpoint);
    cout<<"Variabel a = "<<a<<endl;
    return 0;
}
