#include <iostream>
#include <cstdio>


using namespace std;

int main(int argc, char** argv)
{
    int A, B, C;
    
    while(scanf("%d %d %d", &A, &B, &C)!=EOF){
        
        if(A == B && B == C){
            cout << "*" << endl;
        } else if( A == B){
            cout << "C" << endl;
        } else if( A == C){
            cout << "B" << endl;
        } else if(C == B){
            cout << "A" << endl;
        }
    }
    return 0;
}
