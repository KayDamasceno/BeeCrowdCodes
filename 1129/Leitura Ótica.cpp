#include <iostream>

using namespace std;

int main(int argc, char** argv)
{
    int N;
    

    int A, B, C, D, E;
    while(cin >> N && N != 0)
    {
        for(int i = 0; i < N; i++)
        {
            cin >> A >> B >> C >> D >> E;

            if(A <= 127 && B > 127 && C > 127 && D > 127 && E > 127 && B <= 255 && C <= 255 && D <= 255 && E <= 255)
            {
                cout << "A" << endl;
            }
            else if (B <= 127 && A > 127 && C > 127 && D > 127 && E > 127 && A <= 255 && C <= 255 && D <= 255 && E <= 255)
            {
                cout << "B" << endl;
            }
            else if (C <= 127 && A > 127 && B > 127 && D > 127 && E > 127 && B <= 255 && A <= 255 && D <= 255 && E <= 255)
            {
                cout << "C" << endl;
            }
            else if (D <= 127 && A > 127 && C > 127 && B > 127 && E > 127 && B <= 255 && C <= 255 && A <= 255 && E <= 255)
            {
                cout << "D" << endl;
            }
            else if (E <= 127 && A > 127 && C > 127 && D > 127 && B > 127 && B <= 255 && C <= 255 && D <= 255 && A <= 255)
            {
                cout << "E" << endl;
            }
            else
            {
                cout << "*" << endl;
            }
        }
    }
    return 0;
}

