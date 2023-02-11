#include <cstdio>
#include <iostream>

using namespace std;

int main(int argc, char * * argv) {

    int T;
    cin >> T;
    int N;
    while(T-- > 0) {
        cin >> N;
        long long int sum = 0;
        for (int row = 0; row < N; row++) {
            sum = sum + (1 << row);
        }
        
        cout << sum << endl;
    }
    return 0;
}

