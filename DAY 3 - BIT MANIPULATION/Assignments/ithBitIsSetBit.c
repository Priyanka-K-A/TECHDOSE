#include <stdio.h>
int main()
{
    int n,i;
    scanf("%d %d",&n,&i);
    printf((n>>i==i)?"TRUE":"FALSE");
    return 0;
}
