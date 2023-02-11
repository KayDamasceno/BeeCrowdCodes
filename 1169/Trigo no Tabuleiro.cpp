#include <stdio.h>
#include <math.h>

int main (){
    
    int N,X,i;
    scanf ("%d", &N);
    
    
    while (N>0){
    scanf ("%d", &X);
    unsigned long long  sum = 1;
    
    if (X==64)
        printf ("1537228672809129 kg\n");
    else {
    
    for (i=0; i<X; i++){

    sum = sum + pow(2,i);
    
    }   
    printf ("%llu kg\n", (sum/12)/1000);
    }
    N--;
    }
}
