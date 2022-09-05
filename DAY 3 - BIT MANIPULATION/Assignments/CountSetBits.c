#include <stdio.h>
int main()
{
    int n,count=0;
    scanf("%d",&n);
    while(n>0)
    {
        if(n&1 == 1)
        {
            count++;
        }
        n=n>>1;
        //Another method
        // n = n&(n-1);
        // count++;
    }
    printf("%d",count);
    return 0;
}
