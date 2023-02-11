#include <stdio.h>
#include <math.h>

int main(){
    
    int i;
    
    for (i=1; i<=100; i++){
        if (fmod(i,2)==0)
            printf("%d\n", i);
    }
}
