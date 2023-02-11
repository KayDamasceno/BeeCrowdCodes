#include <stdio.h>
#include <math.h>
int main(){
    
    int j=0, k=0, t=0, l=0;
    float n1,n2,n3,n4,n5;
    
    scanf("%f", &n1);
    scanf("%f", &n2);
    scanf("%f", &n3);
    scanf("%f", &n4);
    scanf("%f", &n5);
    
        if (fmod(n1,2)==0)
            j++;
        else
            k++;
        if (n1>0)
            t++;
        else if (n1<0)
            l++;
        
        if (fmod(n2,2)==0)
            j++;
        else
            k++;
        if (n2>0)
            t++;
        else if (n2<0)
            l++;
            
        if (fmod(n3,2)==0)
            j++;
        else
            k++;
        if (n3>0)
            t++;
        else if(n3<0)
            l++;
            
        if (fmod(n4,2)==0)
            j++;
        else
            k++;
        if (n4>0)
            t++;
        else if (n4<0)
            l++;
    
        if (fmod(n5,2)==0)
            j++;
        else
            k++;
        if (n5>0)
            t++;
        else if (n5<0)
            l++;
    
    printf ("%d valor(es) par(es)\n", j);
    printf ("%d valor(es) impar(es)\n", k);
    printf ("%d valor(es) positivo(s)\n", t);
    printf ("%d valor(es) negativo(s)\n", l);
}
