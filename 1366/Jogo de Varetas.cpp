#include <iostream>
#include <vector>

using namespace std;

int main(int argc, char** argv)
{
    int N, aux1, aux2;


    while (cin >> N && N != 0)
    {

        int sobra = 0;
        int total = 0;
        int resultado = 0;
        while(N-- > 0)
        {
            cin >> aux1 >> aux2;

            total = total + aux2;

            if(aux2 % 2 != 0)
            {
                sobra++;
            }
        }
        
        resultado = (total - sobra)/4;
        
        cout << resultado << endl;

    }
    return 0;
}

