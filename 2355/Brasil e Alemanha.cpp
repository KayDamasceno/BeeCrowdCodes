#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

int main(int argc, char * * argv) {

    long long int n;
    double ale = 0, bra = 0;
    
    while(cin >> n  && n !=0){
        ale = ceil((7*n*1.0)/90);
        bra = floor((1.0*n)/90);
        
        printf("Brasil %d x Alemanha %d\n", (int)bra, (int)ale);
    }
    
    return 0;
}

