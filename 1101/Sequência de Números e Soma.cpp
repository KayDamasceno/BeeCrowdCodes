#include <stdio.h>

int main (){
    
    int M, N, j, sum =0;
    scanf ("%d %d", &M, &N);
    
    while ((M>0)&&(N>0)){
        
            if (M>N) {
                    for (j=N; j<=M; j++){
                            sum = sum + j;
                            printf ("%d ", j);
                    }
                }
                else if (N>M){
                    for (j=M; j<=N; j++){
                        sum = sum + j;
                            printf ("%d ", j);
                    }
                }
                else{
                    printf ("%d ", M);
                }
            printf ("Sum=%d\n", sum);
                
            sum =0;
            scanf ("%d %d", &M, &N);
        }
    }

