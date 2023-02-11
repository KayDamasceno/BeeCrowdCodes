#include <iostream>

using namespace std;

int main(int argc, char** argv)
{
    int A, C;

    while(cin >> A >> C && (A != 0 || C != 0))
    {
        int cortes = 0;
        int vetor[C];
    //  int matrix[A][C];

        for(int i = 0; i < C; i++)
            cin >> vetor[i];
        //Iniciando com zeros
    
        int resp = A-vetor[0];
        for(int i = 1; i < C; i++){
            if(vetor[i]>=vetor[i-1]){
                 //Faço nada
            } else {
                resp = resp + (vetor[i-1]-vetor[i]);
            }
        }


        cout << resp <<endl;

    




    }

    return 0;
}

