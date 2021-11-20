#include <iostream>

using namespace std;

int main()
{
      int  n, x, y;
      cout << "Masukkan tinggi seitiga : ";
      cin >> n;
      for (int x = n; x >= 1; x--)
      {
            for (int y = x; y <= n; y++)
                  cout << y;
            printf("\n");
      }
      return 0;
}
