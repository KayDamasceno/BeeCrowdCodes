#include <stdio.h>
#include <math.h>

int main (){
    
    int x, y, k = 1, i, w,n;
    
    scanf ("%d %d", &x, &y);
    w = x;
    while (n<y){
        
        for (i=k;i<=x;i++){
            if (i == x)
            printf("%d\n",i);
            else
            printf ("%d ", i);
        }
            
        
        k = k + w;
        n = x;
        x = x + w;
        if (x > y)
            x = x - w + fmod(y,(x-w));
    }
}
