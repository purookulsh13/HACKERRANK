#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    
        int size=0, i, sum=0;
        scanf(" %d ", &size);
        
        int arr[size];
        
        for(i=0;i<size;i++)
        {
            scanf("%d", &arr[i]);
        } 
        
        for(i=0;i<size;i++)
        {
            sum+=arr[i];
        } 
        printf("%d\n", sum);
    
    return 0;
}
