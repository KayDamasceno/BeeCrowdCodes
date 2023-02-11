#include <stdio.h>
#include <math.h>

int main (){
    
    int i, n;
    
    scanf ("%d", &n);
    
    for (i=1; i<=n; i++){
        if (fmod(n,i)==0)
            printf ("%d\n", i);
    }
    
}   
