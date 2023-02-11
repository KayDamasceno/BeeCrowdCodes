#include <stdio.h>

int main (){
    
    int N, amount, i, sum = 0, coelhos = 0, ratos = 0, sapos = 0;
    char C;
    
    scanf ("%d", &N);
    
    for (i=0; i<N; i++){
        scanf ("%d %c", &amount, &C);
        sum = sum + amount;
        
        if (C=='C')
            coelhos = coelhos + amount;
        if (C=='R')
            ratos = ratos + amount;
        if (C=='S')
            sapos = sapos + amount;
            
    }
    
    printf ("Total: %d cobaias\n", sum);
    printf ("Total de coelhos: %d\n", coelhos);
    printf ("Total de ratos: %d\n", ratos);
    printf ("Total de sapos: %d\n", sapos);
    printf ("Percentual de coelhos: %.2f %%\n", (100.0*coelhos)/sum);
    printf ("Percentual de ratos: %.2f %%\n", (100.0*ratos)/sum);
    printf ("Percentual de sapos: %.2f %%\n", (100.0*sapos)/sum);
}
