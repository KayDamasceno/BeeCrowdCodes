#include <stdio.h>

int main (){
    
    int M, N;
    scanf ("%d %d", &M, &N);
    
    while ((M!=0)&&(N!=0)){
        
            if ((M>0)&&(N>0))
                printf("primeiro\n");
            else if ((M>0)&&(N<0))
                printf ("quarto\n");
            else if ((M<0)&&(N<0))
                printf ("terceiro\n");
            else
                printf ("segundo\n");
                
            scanf ("%d %d", &M, &N);
        }
    }

