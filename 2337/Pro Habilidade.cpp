#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;


  
long long int fib(long long int n) 
{ 
  /* Declare an array to store Fibonacci numbers. */
  int f[n+2];   // 1 extra to handle case, n = 0 
  int i; 
  
  /* 0th and 1st number of the series are 0 and 1*/
  f[0] = 0; 
  f[1] = 1; 
  
  for (i = 2; i <= n; i++) 
  { 
      /* Add the previous 2 numbers in the series 
         and store it */
      f[i] = f[i-1] + f[i-2]; 
  } 
  
  return f[n]; 
} 

long long int fibonacci(int pos) {
    return fib(pos - 1);
};

int main(int argc, char * * argv) {
    int N;
    
    while(scanf("%d", &N)!=EOF){
    long long int num = fibonacci(N+3);
    long long int den = pow(2, N);
    long long int a = num;
    long long int b = den;
    
    long long int c = num % den;
    
    while(c>0){
        num = den;
        den = c;
        c = num % den;
    }
    
    long long int gcd = den;
    
    a /= gcd;
    b /= gcd;

    cout << a <<"/" << b << endl;
    }
    return 0;
}

