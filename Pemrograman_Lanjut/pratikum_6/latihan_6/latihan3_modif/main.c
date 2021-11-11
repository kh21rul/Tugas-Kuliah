#include<stdio.h>
main()
{
	int x = 2, y = 3;
	printf("x awal = %d\ny awal = %d\n", x, y);
	x = x + --x + x++;
	y = y++ + y + y-- + --y;
	printf("x akhir = %d \ny akhir = %d\n", x, y);

}
