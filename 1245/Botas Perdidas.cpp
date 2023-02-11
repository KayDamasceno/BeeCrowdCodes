#include <iostream>
#include <vector>

using namespace std;

int main(int argc, char** argv)
{
    int N;
    vector<pair<int, string> > pares;
    vector<pair<int, string> >::iterator it;
    int M;
    char pe[2];
    int saida;
    while(cin >> N)
    {
        saida = 0;
        while(N-- > 0)
        {
            int contador = 0;

            cin >> M >> pe;

            for(it = pares.begin(); it != pares.end(); it++)
            {

                if((*it).first == M && (*it).second != pe)
                {
                    contador++;
                    saida++;
                    pares.erase(it);
                    break;
                }

            }

            if(contador == 0)
                pares.push_back(pair<int, string>(M, pe));
            
        /*  cout << "Vetor atual" << endl;
            for(it = pares.begin(); it != pares.end(); it++)
            {

                cout << (*it).first << " " << (*it).second << endl;

            }
            */
        
        }

            cout << saida << endl;
            pares.clear();
        
    }
    return 0;
}

