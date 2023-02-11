#include <stdio.h>

int main (){
    
    int T, N, j = 1, i;
    scanf ("%d", &T);
            
            
    while (T>0){
        
    scanf ("%d", &N);
    
    int age[N];
    
    for (i=0;i<N;i++)
        scanf ("%d", &age[i]);

        
        printf ("Case %d: %d\n", j, age[N/2]);
        
        j++;
        
        T--;
    }
}
