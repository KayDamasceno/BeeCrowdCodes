#include <iostream>
#include <cstdio>
using namespace std;

int main(int argc, char * * argv) {

    int T;

    while(cin >> T && T != 0) {
        int Q;
        double A, B;
        int aux = T, i = 0;
        double output[T];
        while(aux-- > 0) {
            cin >> Q >> A >> B;
            output[i] = (((A+B)*5)/2)*Q;
            i++;
        }
        
        for(int i = 0; i <T; i++){
            printf("Size #%d:\n", i+1);
            printf("Ice Cream Used: %.2lf cm2\n", output[i]);
        }
        printf("\n");
    }
    return 0;
}

