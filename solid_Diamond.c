#include<stdio.h>
int main(){
 printf("we are going to print solid  diamond \n");
 int n=7;
 
 for(int i=1;i<=n/2+1;i++ ){
     for(int j=1;j<=n/2 +1-i;j++){
         printf(" ");
         
     }
       for(int j=1;j<=i*2-1;j++){
         printf("*");
     }
     printf("\n");
     
 }
  
 for(int i=n/2;i>=0;i-- ){
     for(int j=1;j<=n/2 +1-i;j++){
         printf(" ");
         
     }
       for(int j=1;j<=i*2-1;j++){
         printf("*");
     }
     printf("\n");
     
 }
}