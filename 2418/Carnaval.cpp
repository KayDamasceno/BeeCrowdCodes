#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdio>
using namespace std;
int main(int argc, char * * argv) {
    vector <float> notas;
    vector <float>::iterator it;
    float temp;
    double soma = 0;

    for(int i = 0; i < 5; i++) {
        cin >> temp;
        notas.push_back(temp);
    }

    sort(notas.begin(), notas.end());

    for(it = notas.begin()+1; it < notas.end()-1; it++) {
        soma = soma + (*it);
    }
    
    printf("%.1f\n", soma);
    return 0;
}

