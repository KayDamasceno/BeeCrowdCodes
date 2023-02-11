#include <iostream>

using namespace std;

int main(int argc, char** argv)
{
    int N;
    
    while(cin >> N && N!=0){
        int X = 0, Y = 0, valor;
        while(N-->0){
            cin >> valor;
            
            if(valor == 0)
                X++;
            else if(valor == 1)
                Y++;
        }
        
        cout << "Mary won " << X << " times and John won " << Y << " times" << endl;
    }
    return 0;
}
