#include <stdio.h>

int main (){
    
    int X, j =0, k;
    scanf ("%d", &X);
    
    int N[X],i,menor;
    
    scanf ("%d", &N[0]);
    
    menor = N[0];
    
    for (i=1;i<X;i++){
        scanf ("%d", &N[i]);
        if (N[i]<menor){
            menor = N[i];
            k = i;
            j++;
            
        }
    }
    if (j==0){
        printf ("Menor valor: %d\n", N[0]);
        printf ("Posicao: %d\n", 0);
    }
    else{
        printf ("Menor valor: %d\n", N[k]);
        printf ("Posicao: %d\n", k);
        
    }
        
    
    
    
    
}
