#include <stdio.h>

int main (){
    
    int A,B,i;
    float C, TOTAL = 0;
    
    for (i=0;i<2;i++){
        scanf("%d %d %f", &A, &B, &C);
        TOTAL = TOTAL + (B*C);
    }

    printf ("VALOR A PAGAR: R$ %.2f\n", TOTAL);
}
