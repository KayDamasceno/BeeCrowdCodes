#include <stdio.h>

int main(){
    
    float n;
    
    scanf ("%f", &n);
    
    if((n>=0)&&(n<=2000))
        printf ("Isento\n");
    else if((n>2000)&&(n<=3000))
        printf ("R$ %.2f\n", (n-2000)*0.08 );
    else if ((n>3000)&&(n<=4500))   
        printf ("R$ %.2f\n", 1000*0.08 + (n - 3000)*0.18);
    else
        printf ("R$ %.2f\n", 1000*0.08 + 1500*0.18 + (n-4500)*0.28 );
        
}
