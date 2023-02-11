#include <cstdio>
#include <cstring>
#include <iostream>
using namespace std;


int matrix[10010];

int main(int argc, char** argv)
{
    int n, c, aux, v;
    int p;
    bool erro;


    while(scanf("%d", &n) && n)
    {
        erro = false;

        memset(matrix, 0, sizeof(matrix));

        for(int i = 0; i < n; ++i)
        {
            scanf("%d %d", &c, &p);

            if((i + p < 0) || (i + p >= n) || (!v && matrix[i + p])) erro = true;
            //cout << erro << endl;
            if(erro)
            {
                continue;
            }
            matrix[i+p] = c;

        }

        if(erro)
            printf("-1\n");
        else
        {
            for(int i = 0; i < n; i++)
            {
                printf("%d", matrix[i]);
                if(i != (n - 1))
                    printf(" ");

            }
            printf("\n");


        }







    }
    return 0;
}

