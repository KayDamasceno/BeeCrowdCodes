#include <iostream>
#include <vector>

using namespace std;



int main(int argc, char** argv)
{

    int A, P;
    int V, aux;
    cin >> A >> P;

    int voltas = 1;


    for(int i = 0; i < A ; i++)
    {
        int atual = -1;
        int temp = 1;
        cin >> V;

        for(int j = 0; j < V; j++)
        {
            cin >> aux;

            if(aux > atual)
            {
                //cout << "Entrei: " << aux << endl;
                atual = aux;
            }
            else if(aux < atual)
            {
                if(aux == 0 && j == V - 1)
                {
                    //cout << "Entrei2: " << aux << endl;
                }
                else
                {
                    atual = aux;
                    temp++;
                }
            }
        }

        if(temp > voltas )
            voltas = temp;

    }

    cout << voltas << endl;



    return 0;
}

