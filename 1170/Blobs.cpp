#include <stdio.h>

int main (){
    
    int N,i=0;
    scanf ("%d",&N);
    
    float X;
    
    while (N>0){
        scanf ("%f", &X);
        
        while (X>1.0){
            X = X/2.0;
            i++;
        }
        
        printf ("%d dias\n", i);
    i=0;

    N--;
    }
}
