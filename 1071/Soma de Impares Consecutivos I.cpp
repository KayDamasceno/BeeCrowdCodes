#include <stdio.h>
#include <math.h>

int main (){
    
    int x, y, i, sum = 0;
    scanf ("%d", &x);
    scanf ("%d", &y);
    
    if (x>y) {
        for (i=(y+1); i<x; i++){
            if (fmod(i,2)!=0)
                sum = sum + i;
            }
    }
    else if (x<y){
        for (i=(x+1); i<y; i++){
            if (fmod(i,2)!=0)
                sum = sum + i;
            }
    }
    else
        sum = 0;
        
    printf ("%d\n", sum);
    
}
