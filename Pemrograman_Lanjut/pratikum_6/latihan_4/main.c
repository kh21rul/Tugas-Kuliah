#include<stdio.h>
main()
{
	int x=2,y=8;
	printf("x awal=%d\n y awal=%d\n",x,y);
	x=x++;
	y=y--;
	printf("x akhir=%d\n y akhir=%d\n",x,y);
	x=++x;
	y=--y;
	printf("x akhir=%d\n y akhir=%d\n",x,y);
    x=x++;
    y=y--;
    printf("x akhir=%d\n y akhir=%d\n",x,y);
}
