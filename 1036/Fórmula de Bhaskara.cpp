#include <stdio.h>
#include <math.h>
int main(){
    
    float A,B,C, delta,R1,R2;
    
    scanf("%f %f %f", &A, &B, &C);
    
    delta = (B*B - 4*A*C);
    
    R1 = (-B + sqrt(delta))/(2*A);
    R2 = (-B - sqrt(delta))/(2*A);
    
    if ((A==0)||(delta<0))
        printf ("Impossivel calcular\n");
    else if (delta>0){
        printf ("R1 = %.5f\n",R1);
        printf ("R2 = %.5f\n",R2);
    } 
    else{
        printf ("R1 = %.5f\n", R1);
        printf ("R2 = %.5f\n", R2);
    }

    
    
}
