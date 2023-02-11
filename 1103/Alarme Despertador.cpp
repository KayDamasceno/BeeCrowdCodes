#include <iostream>

using namespace std;

int main(int argc, char** argv)
{

    int H1, M1, H2, M2, aux1, aux2;
    int minutos;
    while(cin >> H1 && cin >> M1 && cin >> H2 && cin >> M2 && (H1 != 0 || M1 != 0 || H2 != 0 || M2 != 0))
    {

        if(H2 == 0) H2 = 24;

        minutos = (H2 - H1) * 60 + (M2 - M1);

        if(minutos < 0)
        {
            
            aux1 = H2;
            aux2 = M2;

            H2 = H1;
            M2 = M1;

            H1 = aux1;
            M1 = aux2;
            
        //  cout << H1 << " " << M1 << " " << H2 << " " << M2<<endl;

            minutos = 1440 - ((H2 - H1) * 60 + (M2 - M1));
        }
        cout << minutos << endl;
    }
    return 0;
}

