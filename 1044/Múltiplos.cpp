#include <stdio.h>
#include <math.h>

int main(){
    
    int A, B;
    
    scanf ("%d %d", &A, &B);
    
    if((A<B)&&(fmod(B,A)==0))
        printf("Sao Multiplos\n");
    else if((A>B)&&(fmod(A,B)==0))
        printf("Sao Multiplos\n");
    else
        printf("Nao sao Multiplos\n");
}
