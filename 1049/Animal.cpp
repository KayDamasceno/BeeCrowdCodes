#include <stdio.h>
#include <string.h>

int main(){
    
    char a[100], b[100], c[100];
    
    scanf ("%s", a);
    scanf ("%s", b);
    scanf ("%s", c);
    
    if (strcmp(a,"invertebrado")==0){
        if(strcmp(b, "inseto")==0){
            if (strcmp(c,"hematofago")==0)
                printf ("pulga\n");
            else 
                printf ("lagarta\n");
            
        }
        else {
            if (strcmp(c,"hematofago")==0)
                printf ("sanguessuga\n");
            else
                printf("minhoca\n");
        }
    }
    else{
        if(strcmp(b,"ave")==0){
            if (strcmp(c,"carnivoro")==0)
                printf ("aguia\n");
            else 
                printf ("pomba\n");
            
        }
        else {
            if (strcmp(c, "onivoro")==0)
                printf ("homem\n");
            else
                printf("vaca\n");
        }
    }
}
