#include <stdio.h>
#include <math.h>
int main()
{
    int n,count=1;
    scanf("%d",&n);
    while((n&1) == 0)
    {
        n=n>>1;
        count++;
    }
    printf("%d",count);
    return 0;
}
