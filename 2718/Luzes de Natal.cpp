#include <iostream>
#include <algorithm>
using namespace std;

void maxConsecutiveOnes(long long int x)
{
    // Initialize result
    int count = 0;
 
    // Count the number of iterations to
    // reach x = 0.
    while (x!=0)
    {
        // This operation reduces length
        // of every sequence of 1s by one.
        x = (x & (x << 1));
 
        count++;
    }
 
    cout << count << endl;
}
int main(int argc, char** argv)
{
    long long int N;
    cin >> N;
    long long int valor;
    while(N-->0){
        cin >> valor;
        maxConsecutiveOnes(valor);
    }
    
    return 0;
}


