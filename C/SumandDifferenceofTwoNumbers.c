#include <stdio.h>
#include <string.h>

int main()
{
    int a, b, c, g;
    float p, q, r, s;
    
    scanf("%d", &a);
    scanf("%d", &b);
    c=a+b; 
    g=a-b;
    printf("%d ", c); 
    printf("%d \n", g);

    
    scanf("%f", &p);
    scanf("%f", &q);
    r=p+q;
    s=p-q;
    printf("%0.1f ", r);
    printf("%0.1f", s);
    
    return 0;
}
