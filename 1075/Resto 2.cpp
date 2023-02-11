#include <stdio.h>
#include <math.h>

int main (){
    
    int N,i;
    scanf ("%d",&N);
    
    for (i=2; i<10000; i++){
        if (fmod(i,N)==2)
            printf ("%d\n",i);
    }
}
