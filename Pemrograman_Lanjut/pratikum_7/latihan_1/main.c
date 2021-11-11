#include <stdio.h>
#include <stdlib.h>

main()
{
    double total_pembelian, discount = 0;
    printf("Total pembelian = Rp ");
    scanf("%L=lf", &total_pembelian);
    if(total_pembelian >= 100000)
        discount = 0.05 * total_pembelian;
    printf("Besarnya discount = Rp %.2lf\n", discount);
}
