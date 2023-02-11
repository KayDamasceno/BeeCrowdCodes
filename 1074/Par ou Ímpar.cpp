#include <stdio.h>
#include <math.h>

int main (){
    
    int N, v[10000], i;
    scanf ("%d", &N);
    
    for (i=0; i<N; i++){
        scanf ("%d", &v[i]);
        
        if (v[i]==0)
            printf ("NULL\n");
        else if (fmod(v[i],2)!=0){
            if (v[i]<0)
                printf ("ODD NEGATIVE\n");
            else
                printf ("ODD POSITIVE\n");
        }
        else {
            if (v[i]<0)
                printf ("EVEN NEGATIVE\n");
            else
                printf ("EVEN POSITIVE\n");
        }
        
    }
}
