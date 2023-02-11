#include <iostream>
#include <cmath>
using namespace std;


int main(int argc, char** argv)
{
    int N;
    cin >> N;
    int A, B;
    char C;
    while(N-->0){
        cin >> A >> C >> B;
        
        
        if(A==B){
            cout << (A*B) << endl;
        }
        else if(isupper(C)){
            cout << (B-A) << endl;
        }else if(islower(C)){
            cout << (A+B) << endl;
        }
        
    }
    return 0;
}
