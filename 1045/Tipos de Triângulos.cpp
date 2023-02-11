#include <stdio.h>

int main (){
    
    double A,B,C, maior, meio, menor;
    scanf ("%lf %lf %lf", &A, &B, &C);
    
    if ((A>=B)&&(A>=C)){
        maior = A;
        if (B>C){
            meio = B; menor = C;
        }
        else{
            meio = C, menor = B;
        }
    }
    else if ((B>=A)&&(B>=C)){
        maior = B;
        if (A>C){
            meio = A; menor = C;
            
        }   
        else{
            meio = C; menor = A;
        }
    }
    else {
        maior = C;
        if (A>B){
            meio = A; menor = B;
        }
        else{
            meio = B; menor = A;
        }
    }
    
    if (maior >= (meio + menor))
        printf ("NAO FORMA TRIANGULO\n");
    else{
    
    if ((maior*maior)==((meio*meio)+(menor*menor)))
        printf ("TRIANGULO RETANGULO\n");
    if ((maior*maior)>((meio*meio)+(menor*menor)))
        printf ("TRIANGULO OBTUSANGULO\n");
    if ((maior*maior)<((meio*meio)+(menor*menor)))
        printf ("TRIANGULO ACUTANGULO\n");
    if ((maior==meio)&&(maior==menor))
        printf ("TRIANGULO EQUILATERO\n");
    if (((maior == meio)&&(maior!=menor))||((maior == menor)&&(maior!=meio))||((meio == menor)&&(meio!=maior))||((meio == maior)&&(maior!=menor))||((menor == meio)&&(menor!=maior))||((menor == maior)&&(menor!=meio)))
        printf ("TRIANGULO ISOSCELES\n");
}
}
