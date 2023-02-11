#include <stdio.h>

int main (){
    
    int M, N;
    scanf ("%d %d", &M, &N);
    
    while (M!=N){
        
            if (M>N) 
                printf ("Decrescente\n");
            else if (N>M)
                printf ("Crescente\n");
                
            scanf ("%d %d", &M, &N);
        }
    }

