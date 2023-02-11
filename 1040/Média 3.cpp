#include <stdio.h>

int main(){
    
    float A,B,C,D,Media,E;
    
    scanf("%f %f %f %f", &A, &B, &C, &D);
    Media = ((A*2 + B*3 + C*4 + D)/10.0);
    
    printf("Media: %.1f\n", Media);
    
    if(Media>=7)
        printf("Aluno aprovado.\n");
    else if(Media<5)
        printf("Aluno reprovado.\n");
    else {
        printf("Aluno em exame.\n");
        scanf("%f", &E);
        printf("Nota do exame: %.1f\n", E);
        Media = (Media + E)/2.0;
        
        if(Media>=5)
            printf("Aluno aprovado.\n");
        else
            printf("Aluno reprovado.\n");
        
        printf("Media final: %.1f\n", Media);
    }
    
    
    
}
