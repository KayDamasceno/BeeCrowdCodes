#include <stdio.h>

int main (){
    
    int N, j =0, k=0, i;
    
    scanf ("%d", &N);
    
    while (j<N){
        for (i=k+1; i<k+4; i++)
            printf ("%d ", i);
            printf ("PUM\n");
            
        j++;
        k = k+4;
        
    }
}
