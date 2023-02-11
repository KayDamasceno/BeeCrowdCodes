#include <iostream>

using namespace std;

int main(int argc, char** argv)
{
    int N, casos;
    int A,B;
    while(cin>>N && N!=0){
        
        int j1 = 0;
        int j2 = 0;
    
        while(N-->0){
            cin >> A >> B;
            if( A > B)
                j1++;
            else if (A<B)
                j2++;
        }
        
        cout << j1 << " " <<j2<<endl;
    }
    return 0;
}
