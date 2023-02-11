#include <stdio.h>
#define pi 3.14159

int main (){
    
    double A,B,C, atr, ac, at, aq, ar;
    
    scanf("%lf %lf %lf",&A, &B, &C);
    
    atr = (A*C)/2;
    ac = pi*C*C;
    at = (C*(A+B))/2;
    aq = B*B;
    ar = A*B;
        
    printf ("TRIANGULO: %.3lf\n", atr);
    printf ("CIRCULO: %.3lf\n", ac);
    printf ("TRAPEZIO: %.3lf\n", at);
    printf ("QUADRADO: %.3lf\n", aq);
    printf ("RETANGULO: %.3lf\n", ar);
}
