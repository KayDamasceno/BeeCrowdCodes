#include <stdio.h>
 
int main() {
 
    unsigned long long int n;
    scanf ("%llu", &n);
    while(n!=-1){
        if(n == 0)
            printf("0\n");
        else
            printf("%llu\n", n-1);
            
        scanf ("%llu", &n);
    }
 
    return 0;
}
