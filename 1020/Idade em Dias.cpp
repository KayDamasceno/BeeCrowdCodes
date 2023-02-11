#include <stdio.h>



int main (){
    
    int age,y,m,d;
    
    scanf("%d", &age);
    
    
    y = age/365;
    
    age = age - y*365;
    
    m = age/30;
    
    age = age - m*30;
    
    d = age/1;
    
    
    
    


    printf ("%d ano(s)\n", y);
    printf ("%d mes(es)\n", m);
    printf ("%d dia(s)\n", d);
}
