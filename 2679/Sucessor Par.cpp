#include <iostream>

using namespace std;

int main(int argc, char * * argv) {

    long long int X;
    
    cin >> X;
    
    if(X%2 == 1){
        cout << (X+1) << endl;
    }else{
        cout << (X+2) << endl;
    }
    return 0;
}

