#include<stdio.h>

int main (){
    
    double X,N[100];
    int i;
    scanf ("%lf", &X);
    printf ("N[%d] = %.4lf\n", 0, X);
    for (i=1; i<100; i++){
        printf ("N[%d] = %.4lf\n", i, X/2.0);
        X = X/2.0;
    }


}

