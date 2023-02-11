#include <iostream>

using namespace std;

int main(int argc, char** argv)
{
    
    int M;
    
    while (cin >> M){
        if(0<=M && M<90)
            cout << "Bom Dia!!"<<endl;
        else if(90<=M && M<180)
            cout << "Boa Tarde!!"<<endl;
        else if(180<=M && M<270)
            cout << "Boa Noite!!"<<endl;
        else if(270<=M && M<360)
            cout << "De Madrugada!!"<<endl;
        else if(M==360)
            cout << "Bom Dia!!"<< endl;
    }
    
    return 0;
}
