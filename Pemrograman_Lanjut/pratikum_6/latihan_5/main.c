#include<stdio.h>


int main(int argc, char** argv) {
int count = 0, loop;
loop = ++count;
printf ("loop = %d, count = %d\n", loop, count);
loop = count++;
printf("loop = %d, count = %d\n", loop, count);
return 0;
}
