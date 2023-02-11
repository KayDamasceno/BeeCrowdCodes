#include <iostream>

using namespace std;

int main(int argc, char * * argv) {
    
    int Q;
    int temp;
    cin >> Q;
    int um = 0, zero = 0;
    for(int i = 0; i < Q; i++){
        cin >> temp;
        
        if(temp == 1)
            um++;
        else
            zero++;
    }
    
    if(um >= zero)
        cout << "N" << endl;
    else
        cout << "Y" << endl;
    
    return 0;
}

