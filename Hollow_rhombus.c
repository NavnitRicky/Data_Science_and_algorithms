#include <stdio.h>
int main(){
    printf("we are going to print solid rhombus:\n");
    for(int i=1 ;i<=4;i++){
        for(int j=1;j<=4-i;j++){
            printf(" ");
        }
             for(int j=1;j<=4;j++){
                 if(j==1 || j== 4  i==1||i==4)
                  printf("*");
                 
                 else
                 printf(" ");
        }
        printf("\n");
    }
    
}