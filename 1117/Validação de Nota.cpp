#include <stdio.h>

int main (){
    
    float x,media = 0;
    int j =0;
    scanf ("%f", &x);
    
    
    
    while (j<2){
        
        if ((x>=0)&&(x<=10)){
            j++;
            media = media + x;
        }
        else 
            printf ("nota invalida\n");
        if (j!=2)
            scanf ("%f", &x);
    }
    
    printf ("media = %.2f\n", media/2.0);
}
