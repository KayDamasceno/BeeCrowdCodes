#include <iostream>

using namespace std;

int main(int argc, char** argv)
{
    int N, D, aux, aux2;

    while(cin >> N >> D && (N != 0 || D != 0))
    {
        int contador = 0;
        int vetor[N];
        aux2 = D;
        for(int i = 0; i < N; i++)
            vetor[i] = 0;

        while(aux2-- > 0)
        {


            for(int i = 0; i < N; i++)
            {
                cin >> aux;
                vetor[i] = vetor[i] + aux;
            }

            for(int i = 0; i < N; i++)
            {
                if(vetor[i] == D)
                    contador++;
            }

        }
        
        if(contador!=0)
            cout << "yes" << endl;
        else
            cout << "no" << endl;
        
    }

    return 0;
}



