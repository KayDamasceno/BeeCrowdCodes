#include <stdio.h>

int main (){
    
    int n, alc = 0, gas = 0, die = 0;
    
    scanf ("%d", &n);
        while ((n<1)||(n>4))
            scanf ("%d", &n);
    
    while (n!=4){
        
        if (n==1)
            alc++;
        else if (n==2)
            gas++;
        else
            die++;
            
        scanf ("%d", &n);
            while ((n<1)||(n>4))
            scanf ("%d", &n);
    }

    printf ("MUITO OBRIGADO\n");
    printf ("Alcool: %d\n", alc);
    printf ("Gasolina: %d\n", gas);
    printf ("Diesel: %d\n",die);
    
}
