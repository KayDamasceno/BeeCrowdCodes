#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (){
    int i,j,t,c;
    float sum = 0;
    float A[12][12];
    char ch;
    fflush(stdin);
    scanf (" %c", &ch);
    

    for (i=0; i<12; i++){
        for (j=0; j<12;j++){
            scanf ("%f", &A[i][j]);}
    }
        
        for (t=0;t<12;t++){
            for (c=0;c<t;c++)
                sum = sum + A[t][c];
                
    }
    if (ch=='M')
        printf ("%.1f\n", sum/66);
    if (ch=='S')
        printf ("%.1f\n", sum);
        
        return 0;
        
}
