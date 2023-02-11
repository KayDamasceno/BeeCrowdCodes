#include <stdio.h>



int main (){
    
    int N,h,m,s;
    
    scanf("%d", &N);
    
    
    h = N/3600;
    
    N = N - h*3600;
    
    m = N/60;
    
    N = N - m*60;
    
    s = N/1;
    
    
    
    


    printf ("%d:%d:%d\n", h, m, s);
}
