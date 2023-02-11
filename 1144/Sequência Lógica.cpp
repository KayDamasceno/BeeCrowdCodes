#include <stdio.h>

int main (){
    
    int N, j = 1;
    
    scanf ("%d", &N);
    
    while (j<=N){
        
        printf ("%d %d %d\n", j, j*j, j*j*j);
        printf ("%d %d %d\n", j, j*j+1, j*j*j+1);   
        j++;
    
        
    }
}
