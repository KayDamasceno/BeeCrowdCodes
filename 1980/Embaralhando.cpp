#include <iostream>
#include <string>
using namespace std;
long long int fatorial(int n){
    if(n == 1 || n == 0){
        return 1;
    }else{
        return fatorial(n-1)*n;
    }
}

int main(int argc, char** argv)
{
    string texto;
    
    while(cin>>texto && texto!="0"){
        long long int tam = texto.length();
        cout << fatorial(tam)<<endl;
    
    }
    
    return 0;
}
