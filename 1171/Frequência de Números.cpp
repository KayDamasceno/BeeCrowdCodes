#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;


int main(int argc, char** argv)
{

    int N;

    map <int, int> relacoes;
    map <int, int>::iterator it;
    cin >> N;
    int numeros[N];


    for(int i = 0; i < N; i++)
        cin >> numeros[i];

    int contador = 0;
    for(int i = 0; i < N; i++)
    {
        for(int j = 0; j < N; j++)
        {
            if(numeros[i] == numeros[j]){
            
                contador++;
            }   
        }
        relacoes.insert(pair<int, int>(numeros[i], contador));
        contador = 0;
    }

    for(it = relacoes.begin(); it != relacoes.end(); it++)
    {
        cout << (*it).first << " aparece " << (*it).second << " vez(es)" << endl;
    }


    return 0;
}

