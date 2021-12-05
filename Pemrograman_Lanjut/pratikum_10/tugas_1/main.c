#include <stdio.h>
#include <stdlib.h>

int main()
{
    int batas, deret[100], i=0;
    printf("Masukan jumlah deret : ");
    scanf("%d", &batas);
    printf("\nDeret fibonaci : ");
        do{
        if(i<2){
            deret[i]=1;
        }
        else{
            deret[i]=deret[i-2]+deret[i-1];
        }
        printf("%d ", deret[i]);
        i++;
    }while(i<batas);
    printf("\n\n");
    return 0;
}
