#include <stdio.h>

int main (){
    
    int N[20], i, V[20];
    
    for (i=0; i<20; i++)
        scanf ("%d", &N[i]);
    
    for (i=0; i<20; i++){
        V[i] = N[19-i];
        printf ("N[%d] = %d\n", i, V[i]);
    }
    
}
