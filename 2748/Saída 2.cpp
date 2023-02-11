#include <iostream>
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
                if(j == 9)
                {
                    printf("Roberto");
                }
                else if(j > 0 && j < 9)
                {
                    printf(" ");
                }
                else if(j >= 16 && j < 38)
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
                if(j == 9)
                {
                    printf("5786");
                }
                else if(j > 0 && j < 9)
                {
                    printf(" ");
                }
                else if(j >= 13 && j < 38)
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
                if(j == 9)
                {
                    printf("UNIFEI");
                }
                else if(j > 0 && j < 9)
                {
                    printf(" ");
                }
                else if(j >= 15 && j < 38)
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

