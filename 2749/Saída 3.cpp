#include <cstdio>

using namespace std;

int main(int argc, char** argv)
{
    for(int i = 0; i < 39; i++)
    {
        printf("-");
    }
    printf("\n");
    
        for(int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 39; j++)
        {

            if(i == 0)
            {
                if(j == 1)
                {
                    printf("x = 35");
                }
                else if(j >= 7 && j < 38)
                {
                    printf(" ");
                }
                else    if(j == 0 || j == 38)
                {
                    printf("|");
                }

            }
            else if(i == 2)
            {
                if(j == 16)
                {
                    printf("x = 35");
                }
                else if(j > 0 && j < 16)
                {
                    printf(" ");
                }
                else if(j >= 22 && j < 38)
                {
                    printf(" ");
                }
                else    if(j == 0 || j == 38)
                {
                    printf("|");
                }

            }
            else if(i == 4)
            {
                if(j == 32)
                {
                    printf("x = 35");
                }
                else if(j > 0 && j < 33)
                {
                    printf(" ");
                }
                else    if(j == 0 || j == 38)
                {
                    printf("|");
                }

            }
            else
            {
                if(j == 0 || j == 38)
                {
                    printf("|");
                }else
                    printf(" ");
            }
        }
        printf("\n");
    }
    for(int i = 0; i < 39; i++)
    {
        printf("-");
    }
    printf("\n");
    return 0;
}

