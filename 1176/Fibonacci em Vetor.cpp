#include <stdio.h>
#include <stdlib.h>

int main (){
    

    int T, N, i = 0,j;
    long long int f[61];
    scanf ("%d",&T);    
    
    while (i<T){
        scanf ("%d", &N);
        f[0] = 0;
        f[1] = 1;
        for (j=2; j<=N; j++){
            f[j] = f[j-1] + f[j-2];
        }
        printf ("Fib(%d) = %lld\n", N, f[N]);
        i++;
            
    }
}
