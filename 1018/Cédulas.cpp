#include <stdio.h>



int main (){
    
    int N, cm, cq, vt, dz, cc, ds, um, fix;
    
    scanf ("%d", &N);
    
    fix = N;
    
    cm = N/100;
    
    N = N - cm*100;
    
    cq = N/50;
    
    N = N - cq*50;
    
    vt = N/20;
    
    N = N - vt*20;
    
    dz = N/10;
    
    N = N - dz*10;
    
    cc = N/5;
    
    N = N - cc*5;

    ds = N/2;
    
    N = N - ds*2;
    
    um = N/1;
    
    
    printf ("%d\n", fix);
    printf ("%d nota(s) de R$ 100,00\n", cm);
    printf ("%d nota(s) de R$ 50,00\n", cq);
    printf ("%d nota(s) de R$ 20,00\n", vt);
    printf ("%d nota(s) de R$ 10,00\n", dz);
    printf ("%d nota(s) de R$ 5,00\n", cc);
    printf ("%d nota(s) de R$ 2,00\n", ds);
    printf ("%d nota(s) de R$ 1,00\n", um);
}
