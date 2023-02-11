#include <iostream>
#include <string>
#include <stdio.h>

using namespace std;

int main(int argc, char** argv)
{
    int A;
    float B;
    char C;
    char D[50];
    
    cin>>A>>B>>C;
    getchar();
    gets(D);
    printf("%d%f%c%s\n", A, B, C, D);
    printf("%d\t%f\t%c\t%s\n", A, B, C, D);
    printf("%10d%10f%10c%10s\n", A, B, C, D);
    
    return 0;
}
