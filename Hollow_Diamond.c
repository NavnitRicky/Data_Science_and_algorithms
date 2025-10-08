#include<stdio.h>
int main(){
 printf("we are going to print [hollow]  diamond \n");
 int n=7;
 for(int i=0;i<=n/2;i++ ){
     for(int j=0;j<n/2 -i;j++){
         printf(" ");
     }
    printf("*");
        if(i!=0){

    for(int j=0;j<2*i-1;j++){
        printf(" ");
    }
    
        printf("*");
        }

    
     printf("\n");
     
 }
 
 for(int i=n/2-1;i>=0;i-- ){
     for(int j=0;j<n/2 -i;j++){
         printf(" ");
     }
    printf("*");
    if(i!=0){
    for(int j=0;j<2*i-1;j++){
        printf(" ");
    }
        printf("*");
    }

    
     printf("\n");
     
 }
}
 