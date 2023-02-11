#include <iostream>

using namespace std;


int main()
{


    int B, N;
    while(cin >> B >> N && (B != 0 || N != 0))
    {

        int bancos[B];
        int D, C, V;

        for (int i = 0; i < B; i++)
            cin >> bancos[i];

        int flag = 0;

        while (N-- > 0)
        {

            cin >> D >> C >> V;



            //  cout << bancos[D - 1] << " " << V << endl;
            bancos[C - 1] = bancos[C - 1] + V;
            bancos[D - 1] = bancos[D - 1] - V;




        }

        for(int i = 0; i < B; i++)
        {
            if(bancos[i] < 0)
                flag++;
        }

        if (flag == 0)
            cout << "S" << endl;
        else
            cout << "N" << endl;
    }
    return 0;
}

