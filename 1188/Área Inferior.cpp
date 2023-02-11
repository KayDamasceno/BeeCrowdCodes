#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
int main (){
    int i,j,t,c;
    double sum = 0;
    double A[12][12];
    char ch;
    fflush(stdin);
    scanf (" %c", &ch);
     
 
    for (i=0; i<12; i++){
        for (j=0; j<12;j++){
            scanf ("%lf", &A[i][j]);}
    }
         
        for (t=11;t>=0;t--){
            for (c=(12-t);c<t;c++)
                sum = sum + A[t][c];
                 
    }
    if (ch=='M')
        printf ("%.1lf\n", sum/30);
    if (ch=='S')
        printf ("%.1lf\n", sum);
         
        return 0;
         
}
