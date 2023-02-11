#include <stdio.h>

int main(){
    
    int a,b,c, maior, menor, meio;
    
    scanf ("%d %d %d", &a, &b, &c);
    
    if ((a>b)&&(a>c))
        maior = a;
    else if((b>a)&&(b>c))
        maior = b;
    else 
        maior = c;
    
    if ((a<b)&&(a<c))
        menor = a;
    else if((b<a)&&(b<c))
        menor = b;
    else 
        menor = c;
        
    if (((a<b)&&(a>c))||((a>b)&&(a<c)))
        meio = a;
    else if(((b<a)&&(b>c))||((b>a)&&(b<c)))
        meio = b;
    else 
        meio = c;
        
    printf("%d\n", menor);
    printf("%d\n", meio);
    printf("%d\n", maior);
    printf("\n");
    printf("%d\n", a);
    printf("%d\n", b);
    printf("%d\n", c);
}
