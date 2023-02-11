#include <stdio.h>

int main(){
    
    int j=0;
    float n1,n2,n3,n4,n5,n6, soma = 0;
    
    scanf("%f", &n1);
    scanf("%f", &n2);
    scanf("%f", &n3);
    scanf("%f", &n4);
    scanf("%f", &n5);
    scanf("%f", &n6);
    
        if (n1>0){
            j++;
            soma = soma + n1;
        }
        if (n2>0){
            soma = soma + n2;
            j++;
        }
        if (n3>0){
            soma = soma + n3;
            j++;
        }
        if (n4>0){
            soma = soma + n4;
            j++;
        }
        if (n5>0){
            soma = soma + n5;
            j++;
        }
        
        if (n6>0){
            soma = soma + n6;
            j++;
        }
    
    
    
    printf ("%d valores positivos\n", j);
    printf ("%.1f\n", soma/j);
}
