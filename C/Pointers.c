#include <stdio.h>

int main()
{
    int a, b, c;
        
        scanf("%d", &a);
        scanf("%d", &b);

        c=a||b;
        
        switch (c)
        {
         case 1:
                {
                 printf("%d \n", a+b);
                } 
       
         case 2:
                {
                 if (a>b)
                  {
                    printf("%d", a-b);
                  }
                 else 
                  {
                     printf("%d", b-a);
                  } 
                 break;
                }        
          
            
        }
    
    return 0;
}
