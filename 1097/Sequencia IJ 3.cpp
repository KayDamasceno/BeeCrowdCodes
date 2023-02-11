#include <stdio.h>

int main (){
    
    int i=1, j =7, k = j;
    
    while (i<=9){
        
        
        printf ("I=%d J=%d\n", i, j);
        
    
        if (j!=(k-2))
            j--;    
        else{
            i = i+2;
            j = k+2;
            k = j;
        }
        
    }
}
