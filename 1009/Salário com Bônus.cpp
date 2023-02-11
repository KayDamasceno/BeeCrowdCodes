#include <stdio.h>

int main (){
    
    double C,B;
    char nome[20];
    
    scanf("%s", nome);
    scanf("%lf", &B);
    scanf("%lf", &C);
    
    
    
    printf ("TOTAL = R$ %.2lf\n", (C*0.15)+B);
}
