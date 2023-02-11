#include <stdio.h>
#include <math.h>

int main (){
    long long int v, t, m;
    while (scanf ("%lld %lld", &v, &t)!=EOF){
    
        if (v>t)
        printf ("%lld\n", v-t);
        else
        printf ("%lld\n", t-v);
    }
}
