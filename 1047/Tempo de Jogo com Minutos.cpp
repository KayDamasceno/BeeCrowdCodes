#include <stdio.h>

int main(){
    
    int start, end, ms, me, s, e, min, hour, time;
    
    scanf ("%d %d %d %d", &start, &ms, &end, &me);
    
    s = start*60 + ms;
    e = end*60 + me;
    
    if (start>=end)
        time = (1440 - s) + e;
    else
        time = e - s;
    
    hour = time/60;
    
    min = time - 60*hour;
    
    if((hour == 0)&&(min == 0))
        printf ("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24, min);
    else
        printf ("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hour, min);
}
