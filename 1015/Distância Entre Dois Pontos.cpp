#include <stdio.h>
#include <math.h>


int main (){
    
    int a,b,c,d;
    float distance;
    
    scanf("%d %d",&a, &b);
    scanf("%d %d",&c, &d);
    
    distance = sqrt(((c-a)*(c-a))+((d-b)*(d-b)));
    
    
    printf ("%.4f\n", distance);
}
