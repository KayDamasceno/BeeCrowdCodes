#include <stdio.h>
#include <math.h>

int main (){
    
    int N, i, x, j, k =0;
    scanf ("%d", &N);
    
    for (i=0; i<N; i++){
        scanf ("%d", &x);
        for (j=1; j<=x; j++){
            if (fmod(x, j)==0)
                k++;
        }
        if (k == 2)
            printf ("%d eh primo\n", x);
        else 
            printf ("%d nao eh primo\n", x);
        k = 0;
    }
}
