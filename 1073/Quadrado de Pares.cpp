#include <stdio.h>
#include <math.h>
int main (){
    
    int N,i;
    scanf ("%d", &N);
    
    for (i=1; i<=N; i++){
        if (fmod(i,2)==0)
            printf ("%d^2 = %d\n", i, i*i);
    }
}
