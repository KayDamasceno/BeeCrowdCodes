#include <stdio.h>
#include <math.h>
int main (){
    
    int N, i, a, b, k, j =0, sum = 0;
    scanf ("%d", &N);
    
    for (i=0; i<N; i++){
        scanf ("%d %d", &a, &b);
            while (j<b){
                if (fmod(a,2)!=0){
                    sum = sum + a;
                    j++;
                }
                
                a++;
            }
            printf ("%d\n", sum);
            j = 0;
            sum = 0;
        
    }

}
