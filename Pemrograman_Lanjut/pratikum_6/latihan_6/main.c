#include<stdio.h>


int main(int argc, char** argv) {
int a, b, c, v, k;
printf ("Masukkan sebuah bilangan integer : ");
scanf ("%d", &v);
k = v;
printf("\n Sebelum Selama Setelah \n");
v = k;
a = v;
b = v++;
c = v;
printf("v++ %8d%8d%8d\n", a,b,c);
v=k; a=v;
c=v--; c=v;
printf ("++v %8d%8d%8d \n", a, b, c);
v = k; a= v;
b= v++; c = v;
printf ("++v %8d%8d%8d \n", a, b, c);
v = k; a= v;
b= --v; c = v;
printf ("--v %8d%8d%8d \n", a, b, c);
return 0;
}
