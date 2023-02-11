#include <stdio.h>

int main(){
    
    float salary;
    scanf ("%f", &salary);
    if ((salary>0)&&(salary<=400.00)){
        printf ("Novo salario: %.2f\n", salary + 0.15*salary);
        printf("Reajuste ganho: %.2f\n", 0.15*salary);
        printf("Em percentual: 15 %%\n");
    }
    if ((salary>=400.01)&&(salary<=800.00)){
        printf ("Novo salario: %.2f\n", salary + 0.12*salary);
        printf("Reajuste ganho: %.2f\n", 0.12*salary);
        printf("Em percentual: 12 %%\n");
    }
    if ((salary>=800.01)&&(salary<=1200.00)){
        printf ("Novo salario: %.2f\n", salary + 0.10*salary);
        printf("Reajuste ganho: %.2f\n", 0.10*salary);
        printf("Em percentual: 10 %%\n");
    }
    if ((salary>=1200.01)&&(salary<=2000.00)){
        printf ("Novo salario: %.2f\n", salary + 0.07*salary);
        printf("Reajuste ganho: %.2f\n", 0.07*salary);
        printf("Em percentual: 7 %%\n");
    }
    if (salary>2000.00){
        printf ("Novo salario: %.2f\n", salary + 0.04*salary);
        printf("Reajuste ganho: %.2f\n", 0.04*salary);
        printf("Em percentual: 4 %%\n");
    }
}
