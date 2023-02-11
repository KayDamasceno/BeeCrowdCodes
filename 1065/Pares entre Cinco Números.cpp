#include <stdio.h>
#include <math.h>
int main(){
    
    int j=0;
    float n1,n2,n3,n4,n5;
    
    scanf("%f", &n1);
    scanf("%f", &n2);
    scanf("%f", &n3);
    scanf("%f", &n4);
    scanf("%f", &n5);
    
        if (fmod(n1,2)==0)
            j++;
        if (fmod(n2,2)==0)
            j++;
        if (fmod(n3,2)==0)
            j++;
        if (fmod(n4,2)==0)
            j++;
        if (fmod(n5,2)==0)
            j++;
                
    
    
    
    
    printf ("%d valores pares\n", j);
}
