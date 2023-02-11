#include <stdio.h>

int main (){
    
    int i=1, j =7;
    
    while (i<=9){
        
        
        printf ("I=%d J=%d\n", i, j);
        
    
        if (j!=5)
            j--;
        else{
            i = i+2;
            j = 7;
        }
        
    }
}
