#include <stdio.h>

int main (){
    
    float sum = 0.0;
    int i;
    
    for (i=1; i<=100; i++)
        sum = sum + (1.0/i);
        
    printf ("%.2f\n", sum);
    
}
