#include <stdio.h>

int main (){
    
    int x, i;
    scanf ("%d", &x);
    
    while (x!=0){
        for (i=1; i<=x;i++){
            if(x==i)
                printf ("%d\n", i);
            else 
                printf ("%d ",i);
        }
        
        scanf ("%d", &x);
    }
}
