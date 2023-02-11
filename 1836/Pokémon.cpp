#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;


int main(int argc, char * * argv) {
    int casos;
    cin >> casos;

    string pokemon;
    int L;
    int Bs, IV, EV;
    int aux = 1;
    int HP, temp;


    while(casos-- > 0) {
        int valores[4];
        cin >> pokemon >> L;
        int i = 1;
        cin >> Bs >> IV >> EV;
        HP = ((IV + Bs + (sqrt(EV) / 8) + 50) * L) / 50 + 10;
        valores[0] = HP;
        for(int j = 0; j < 3; j++) {

            cin >> Bs >> IV >> EV;


            temp = ((IV + Bs + (sqrt(EV) / 8)) * L) / 50 + 5;
        

            valores[i] = temp;
            i++;
        }
        cout << "Caso #"<<aux<<": "<<pokemon<<" nivel "<<L<<endl;
        printf("HP: %d\n", valores[0]);
        printf("AT: %d\n", valores[1]);
        printf("DF: %d\n", valores[2]);
        printf("SP: %d\n", valores[3]);
        aux++;
    }


    return 0;
}

