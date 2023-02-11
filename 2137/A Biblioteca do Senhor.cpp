#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

int main(int argc, char * * argv) {
    vector<string> val;
    vector<string>::iterator it;
    int N;
    string temp;
    while(cin >> N) {
        for(int i = 0; i < N; i++) {
            cin >> temp;
            val.push_back(temp);
        }

        sort(val.begin(), val.end());

        for(it = val.begin(); it != val.end(); it++) {
            cout << (*it) << endl;
        }
        
        val.clear();
    }

    return 0;
}

