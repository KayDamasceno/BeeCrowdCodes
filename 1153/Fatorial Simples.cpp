#include <stdio.h>

int main (){

    int N, fat = 1, j;
    scanf ("%d", &N);
    j = N;
    if (N==0)
        fat = 1;
    else {
    
    while(j>0){
        
        fat = fat*N;
        
        N--;
        j--;
        
    }
    }   
    printf ("%d\n", fat);
}
