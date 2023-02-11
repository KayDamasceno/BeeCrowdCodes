#include <stdio.h>
#include <math.h>

int main (){
    
    int X, Y,i;
    
    scanf("%d", &X);
    scanf("%d", &Y);
    
    if (X>Y){
        for (i=(Y+1); i<X; i++){
            if ((fmod(i,5)==2)||(fmod(i,5)==3))
                printf ("%d\n",i);
        }
    }
    else if (X<=Y){
        for (i=X+1; i<Y; i++){
            if ((fmod(i,5)==2)||(fmod(i,5)==3))
                printf ("%d\n",i);
        }
    }
    
    
}
