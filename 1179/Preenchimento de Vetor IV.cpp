#include <stdio.h>

int main (){
    
    int par[5], impar[5], N,i,j=0,k=0,z=0,t;
    
    for (t=0;t<15;t++){
        scanf ("%d",&N);
        
        if (N%2==0){
            par[j] = N;
            
            j++ ;
            
        }
        else{
            impar[k] = N;
            k++;
        }
                if (j > 4) {
            for (i=0; i<5;i++)
                printf ("par[%d] = %d\n", i, par[i]);
                
                j=0;
        }
        if (k >4) {
            for (i=0; i<5;i++)
                printf ("impar[%d] = %d\n", i, impar[i]);
                        k=0;
        }
        
        
        
    }
        if (k!=0){
                for (i=0;i<k;i++)
                    printf ("impar[%d] = %d\n", i, impar[i]);
                }
        if (j!=0){
                for (i=0;i<j;i++)
                    printf ("par[%d] = %d\n", i, par[i]);
                
            }
}
