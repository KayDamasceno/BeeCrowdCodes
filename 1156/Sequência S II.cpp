#include <stdio.h>
#include <math.h>

int main (){
    
    float sum = 0.0;
    int i;
    
    for (i=1; i<=20; i++)
        sum = sum + ((2.0*i - 1)/(pow(2,i-1)));
        
    printf ("%.2f\n", sum);
    
}
