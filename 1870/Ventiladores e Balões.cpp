#include <bits/stdc++.h>
using namespace std;

int main (){

    int C, L, P;
    cin >> C >> L >> P;

    while (C!=0 && L!=0 && P!=0){

        int matrix[C+1][L+1];

        for (int i = 1; i <=C; i++){
            for (int j = 1; j <= L; j++){
                int number;
                cin >> number;
                matrix[i][j] = number;
            }
        }

        int stateBallon = 0; //0 nao estourou, 1 estourou
        int linha = 1;
        int coluna = P;
        int potenciaDireita = -1;
        int potenciaEsquerda = -1;
        while (linha<=C){
            //cout << coluna << endl;
            
            
            //direita
            for (int j = coluna ; j <= L; j++){
              
                if (matrix[linha][j]!=0){
                    potenciaDireita = matrix[linha][j];
                    
                    break;
                }
            }
            //esquerda
            
            for (int k = coluna ; k >= 1; k--){
                
                if (matrix[linha][k]!=0){
                    potenciaEsquerda = matrix[linha][k];
                    break;
                }
            }
            //cout << potenciaDireita << " " << potenciaEsquerda << endl;
            
            coluna = coluna + (potenciaEsquerda-potenciaDireita);
            //cout << linha << " " << coluna << endl;
            if (matrix[linha][coluna] != 0 || coluna < 1 || coluna > L){
                stateBallon = 1;
                break;
            }
          
            
            linha++;
          
        }

        
        if (stateBallon == 1){
            cout << "BOOM " << linha << " " << coluna << endl;
        }else{
            cout << "OUT " << coluna << endl;
        }

        cin >> C >> L >> P;
    }
}
