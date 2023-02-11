#include <iostream>

using namespace std;


int main(int argc, char** argv)
{

    int K, N, M, X, Y;



    while(cin >> K && K!=0)
    {
        cin >> N >> M;
        while(K-- > 0)
        {
            cin >> X >> Y;

            //  cout << K << " " << N << " " << M << " " << X <<" " << Y << endl;
            if(X < N && Y < M)
                cout << "SO" << endl;
            else if (X > N && Y > M)
                cout << "NE" << endl;
            else if (X < N && Y > M)
                cout << "NO" << endl;
            else if (X > N && Y < M)
                cout << "SE" << endl;
            else
                cout << "divisa" << endl;

        }
    }
    return 0;
}

