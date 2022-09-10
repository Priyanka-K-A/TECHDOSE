#include <stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    printf(((n^1)==(n+1))?"even" : "odd");

    return 0;
}
