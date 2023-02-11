#include <stdio.h>
#include <math.h>
int main (){
    
    int value, i = 0;
    scanf ("%d", &value);
    
    while (i<6){
        if (fmod(value,2)!=0){
                printf ("%d\n", value);
                i++;
            }
        value++;
    }
}
