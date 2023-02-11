#include <stdio.h>
#include <math.h>

int main (){
    
    int X, j = 0, sum = 0;
    scanf ("%d", &X);
    
    while (X!=0){
        while (j<5){
            if (fmod(X,2)==0){
                sum = sum + X;
                j++;
            }
            X++;
        }
        printf ("%d\n", sum);
        j = 0;
        sum = 0;    
        scanf ("%d", &X);
    }
}
