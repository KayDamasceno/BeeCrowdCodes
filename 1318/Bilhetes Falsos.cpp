#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(int argc, char** argv)
{
    int N , M, aux;
    vector<int> bilhetes;
    vector<int>::iterator it, st;
    vector<int> usados;
    bool status;
    while(cin >> N >> M && (N != 0 || M != 0))
    {
        int saida = 0;
        for(int i = 0; i < M; i++)
        {
            
            cin >> aux;
        //  cout << "aux : " << aux << endl;
            for(it = bilhetes.begin(); it != bilhetes.end(); it++)
            {
                status = find(usados.begin(), usados.end(), aux) != usados.end();
                //cout << aux << " " << status << endl;
                if((*it) == aux )
                {
                //  cout << "Entrei com aux: " << aux << endl;
                    if(status == false)
                    {
                        usados.push_back(aux);
                        saida++;
                    }


                }
                //bilhetes.erase(it);


            }
            /*  cout << "usados" << endl;
            for(it = usados.begin(); it != usados.end(); it++)
                cout << (*it) << endl;

            
            cout << "bilhetes" << endl;
            
            for(it = bilhetes.begin(); it != bilhetes.end(); it++)
                cout << (*it) << endl;
            
            cout << "saida : " << saida << endl;
            */

            
            bilhetes.push_back(aux);

        }



        cout << saida << endl;
        usados.clear();
        bilhetes.clear();

    }





    return 0;
}

