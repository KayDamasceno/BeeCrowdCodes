#include <stdio.h>

int main (){
    
    long long int M, N, fatM, fatN, i;
    
    
    while (scanf ("%lld %lld", &M, &N)>0){
    fatM = 1;
    fatN = 1;

    
    if (M!=0){
    for (i=M;i>0;i--)
        fatM = fatM*i;
    }
    if (N!=0){
    for (i=N;i>0;i--)
        fatN = fatN*i;
    }
    printf ("%lld\n", fatM + fatN);
    }
}
