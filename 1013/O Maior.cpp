#include <stdio.h>
#include <math.h>


int main (){
    
    int a,b,c, maior, maior3;
    
    scanf("%d %d %d",&a, &b, &c);
    
    maior = (a+b+fabs(a-b))/2;
    
    maior3 =  (c + maior + fabs(c-maior))/2;
    
    printf ("%d eh o maior\n", maior3);
}
