#include <stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    printf((n&(n-1)==0 || n==0)?"False":"True");

    return 0;
}
// #include <stdio.h>
// #include <math.h>
// int main()
// {
//     int x;
//     scanf("%d",&x);
//     int d = log2(x);
//     if(x==0)
//     {
//         printf("false");
//     }
//     else
//     {
//         printf(floor(d)==ceil(d)?"TRUE":"false");
//     }
    
//     return 0;
// }
