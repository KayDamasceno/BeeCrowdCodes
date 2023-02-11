#include <iostream>


using namespace std;

int main(int argc, char** argv)
{

    int N, T;
    cin >> N;

    while(N-- > 0)
    {

        int numero = 0;

        cin >> T;
        int tiros[T];
        char status[T];

        for(int i = 0; i < T; i++)
            cin >> tiros[i];

        for(int i = 0; i < T; i++)
            cin >> status[i];

        for(int i = 0; i < T; i++)
        {
            if(status[i] == 'J')
            {
                if(tiros[i] > 2)
                {
                    numero++;
                }
            }
            else if(status[i] == 'S')
            {
                if(tiros[i] <= 2)
                {
                    numero++;
                }
            }
        }
        
        cout << numero << endl;

    }
    return 0;
}

