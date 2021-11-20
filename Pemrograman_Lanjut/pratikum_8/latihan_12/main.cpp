
#include <stdio.h>
#include <stdlib.h>

int main()
{
   char pilihan;

   int sudah_benar = 0;
   printf("pilihan Y atau T.\n");

   while(!sudah_benar)
   {
       pilihan = getchar();
       sudah_benar = (pilihan=='Y') || (pilihan == 'y') || (pilihan=='T') || (pilihan=='t');
   }
   switch(pilihan)
   {
   case 'Y':
   case 'y':
   puts("\nPilihan anda adalah Y");
   break;
   case 'T':
   case 't':
   puts("\nPilihan anda adalah T");
   }
    return 0;
}
