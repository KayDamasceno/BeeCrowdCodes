#include <stdio.h>
#include <stdlib.h>
#include <math.h>

const double EPS = 1e-9;
int main (){
    
    double A[100];
    int i;
    
    for (i=0; i<100; i++){
        scanf ("%lf", &A[i]);
        if (A[i]<=10)
        
            printf("A[%d] = %.*f\n", i, ((fabs(A[i]) - abs((int)A[i]) > EPS)) ? (1) : (0),A[i]);    
    }
}
