#include <iostream>
#include <cstdio>

using namespace std;

int main(int argc, char * * argv) {

    int C;
    cin >> C;
    
    while(C-->0){
        int N, aux;
        cin >> N;
        int vetor[N];
        int soma = 0;
        double media = 0;
        for(int i = 0; i < N; i++){
            cin >> aux;
            soma = soma + aux;
            vetor[i] = aux;
        }   
        
        media = soma/N;
        int contador = 0;
        for(int i = 0; i < N; i++){
            if(vetor[i]*1.0 > media)
                contador++;
        }
        printf("%.3f%%\n", (contador*1.0*100)/N);
        
        
        
        
    }

    return 0;
}

