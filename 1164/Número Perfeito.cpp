#include <stdio.h>
#include <math.h>

int main (){
    
    int N, i, x, j, sum =0;
    scanf ("%d", &N);
    
    for (i=0; i<N; i++){
        scanf ("%d", &x);
        for (j=1; j<x; j++){
            if (fmod(x, j)==0)
                sum = sum + j;
        }
        if (sum == x)
            printf ("%d eh perfeito\n", x);
        else 
            printf ("%d nao eh perfeito\n", x);
        sum = 0;
    }
}
