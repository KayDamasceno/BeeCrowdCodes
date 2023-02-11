#include  <stdio.h>
#include <math.h>
int main (){
    
    int N,i = 0,x,y, sum =0, j;
    scanf ("%d", &N);
    
    while (N>i){
    
        scanf ("%d %d", &x, &y);
                if (x>y) {
                    for (j=(y+1); j<x; j++){
                        if (fmod(j,2)!=0)
                            sum = sum + j;
                    }
                }
                else if (x<y){
                    for (j=(x+1); j<y; j++){
                        if (fmod(j,2)!=0)
                        sum = sum + j;
                    }
                }
                else
                    sum = 0;
        
                printf ("%d\n", sum);
        sum = 0;
        i++;
    }
}
