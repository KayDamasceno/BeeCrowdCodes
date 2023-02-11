#include <stdio.h>

int main (){
    
    int T,N[1000], j=0,i;
    scanf ("%d", &T);
    
    
        for (i=0;i<1000;i++){
            if((j<T)&&(j!=0)){
            printf("N[%d] = %d\n", i, j);
        }
            else{
            printf("N[%d] = %d\n", i, 0);
            j =0;
    }
    j++;
            
        
    }

}
