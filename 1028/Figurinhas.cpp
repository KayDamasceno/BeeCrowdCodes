#include <stdio.h>


int mdc (int a, int b){
    if (b==0)
        return a;
    else
        return mdc (b, a%b);
}
int main (){
    
    int N, F1, F2;
    scanf ("%d", &N);
    
    while (N>0){
    scanf ("%d %d", &F1, &F2);
    
    printf ("%d\n", mdc(F1,F2));
    
    N--;
    }
    
}
