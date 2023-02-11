#include <stdio.h>

int main (){
    
    int v[100], maior=0, pos, i;
    
    for (i=0; i<100; i++){
        scanf ("%d", &v[i]);
            if (v[i]>maior){
                maior = v[i];
                pos = i+1;
            }
        
    }
    
    printf ("%d\n", maior);
    printf ("%d\n", pos);
}
