#include <iostream>

using namespace std;


int main(int argc, char * * argv) {

    int Q, D, P;
    
    while(cin >> Q &&Q!=0){
        cin>>D>>P;
        
        double resul = (D*1.0*Q)/(P-Q);
        int final = (int)(resul*P);
        
        if(final == 1)
            cout << final <<" pagina" << endl;
        else
            cout << final << " paginas" << endl;
    }
    return 0;
}

