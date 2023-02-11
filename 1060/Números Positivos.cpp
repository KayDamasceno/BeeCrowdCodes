#include <stdio.h>

int main(){
    
    int i, j;
    float number;
    
    for (i=0; i<6; i++){
        scanf("%f", &number);
        if (number>0)
            j++;
    }
    
    printf ("%d valores positivos\n", j);
}
