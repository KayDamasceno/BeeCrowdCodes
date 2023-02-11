#include <iostream>
#include <cstdio>
using namespace std;

int main(int argc, char * * argv) {
    int T;
    cin >> T;
    int casos = 1;
    while(T-- > 0) {
        

        int N;
        cin >> N;

        int atual, temp;
        int mSeq = 1;
        int aSeq = 1;
        cin >> atual;
    
        for(int i = 1; i < N; i++) {
            cin >> temp;
            
            if(temp > atual){
                mSeq = 1;
                aSeq = 1;
                atual = temp;
            }else if(temp == atual){
                aSeq++;
            }else{
                mSeq = max(mSeq, aSeq);
                aSeq = 0;
            }
        
        }
        
        mSeq = max(mSeq, aSeq);
        printf("Caso #%d: %d\n", casos, mSeq);
        
        
        
        casos++;
    
    }
    return 0;
}

