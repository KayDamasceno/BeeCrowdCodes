#include <stdio.h>

int main (){
    
    int i,g, inter = 0, gremio = 0, empate = 0, cont = 0, ans;
    
    
    do {
        scanf ("%d %d", &i, &g);
        if (i>g)
            inter++;
        else if(i<g)
            gremio++;
        else
            empate++;
        
        cont++;
        
        printf("Novo grenal (1-sim 2-nao)\n");
        scanf("%d", &ans);
    } while (ans == 1);
    
    printf ("%d grenais\n", cont);
    printf ("Inter:%d\n", inter);
    printf ("Gremio:%d\n",gremio);
    printf ("Empates:%d\n",empate);
    
    if(inter>gremio)
        printf("Inter venceu mais\n");
    else if (inter<gremio)
        printf("Gremio venceu mais\n");
    else
        printf("Nao houve vencedor\n");
}
