#include <stdio.h>

int main (){
    
    int X, Z, i, sum =0, j =0;
    scanf ("%d",&X);
    scanf ("%d", &Z);
        while (Z<=X)
            scanf ("%d", &Z);
    
    while (sum<Z){
        
        sum = sum + X;
        X++;
        
    
        j++;
        
    }
        
    printf ("%d\n", j);
    
}
