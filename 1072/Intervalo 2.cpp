#include <stdio.h>

int main(){
    
    int N,i,v[10000], j=0, k=0;
    scanf ("%d", &N);
    
    for (i=0; i<N; i++){
        scanf ("%d", &v[i]);
            if ((v[i]>=10)&&(v[i]<=20))
                j++;
            else
                k++;
    }
    
    printf ("%d in\n", j);
    printf ("%d out\n", k);
}
