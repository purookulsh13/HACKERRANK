#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i,size,k;
     
    scanf("%d", &size);
    
    int a[1000], b[1000];
    
    
   for (i=0;i<size;i++) 
    {     
        scanf("%d", &a[i]);     
    }      
       
    for(i=size-1,k=0;i>=0;i--,k++)
    {   
        b[k]=a[i];
    }    
    
    for(i=0;i<size;i++)
    {
        a[i]=b[i];
    }
    
    for(i=0;i<size;i++)
    {
        printf("%d ", a[i]);
    }
    
    return 0;
}
