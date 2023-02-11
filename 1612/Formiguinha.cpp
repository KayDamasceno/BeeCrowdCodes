#include <iostream>
#include <cmath>

using namespace std;


int main(int argc, char** argv)
{
    int T;
    long long int N;
    cin >> T;
    
    while(T-->0){
        cin >> N;
        
        long long int resul = ceil((N*1.0)/2);
        
        cout << resul << endl;
    }
    return 0;
}
