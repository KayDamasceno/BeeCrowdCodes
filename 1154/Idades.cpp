#include <stdio.h>

int main (){
    int N, j = 0, sum = 0;
    scanf ("%d", &N);
    
    while (N>=0){
        sum = sum + N;
        j++;
        scanf ("%d",&N);
        
    }
    if(j>0)
    printf ("%.2f\n", (1.0*sum)/j);
}
