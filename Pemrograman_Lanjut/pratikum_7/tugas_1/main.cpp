#include <iostream>
using namespace std;

int main(){

    char hari;

    cout << "PROGRAM MENENTUKAN NAMA HARI" <<endl;
    cout << "Pilihan : " <<endl;
    cout << "A = SENIN   C = RABU   E = JUM'AT   G = AHAD" <<endl;
    cout << "B = SELASA  D = KAMIS  F = SABTU \n" <<endl;
    cout << "Masukkan Kode Hari (A.G) : ";
    cin >> hari;

    switch (toupper(hari)){
        case 'A':
            cout << "\nHari ini ialah hari SENIN" << endl;
            break;
        case 'B':
            cout << "\nHari ini ialah hari SELASA" << endl;
            break;
        case 'C':
            cout << "\nHari ini ialah hari RABU" << endl;
            break;
        case 'D':
            cout << "\nHari ini ialah hari KAMIS" << endl;
            break;
        case 'E':
            cout << "\nHari ini ialah hari JUM'AT" << endl;
            break;
        case 'F':
            cout << "\nHari ini ialah hari SABTU" << endl;
            break;
        case 'G':
            cout << "\nHari ini ialah hari AHAD" << endl;
            break;
        default:
            cout << "\nMAAF KODE HARINYA SALAH" << endl;
    }

    return 0;
}
