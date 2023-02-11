#include <stdio.h>



int main (){

    int N,  i, a, b, aux;
    scanf ("%d", &N);
    
    a = 0;
    b = 1;
    
    if (N==1)
        printf ("0\n");
    else if (N==2)
        printf ("0 1\n");
    else {
    printf ("0 1 ");
    
    for (i=2;i<N;i++){
        
        aux = a +b;
        a = b;
        b = aux;
        if (i == (N-1))
            printf ("%d\n", aux);
        else
            printf ("%d ", aux);
    }
    
    }
    


    }

