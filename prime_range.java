import java.util.Scanner;
public class prime_range {
     static boolean isPrime(int n){
         if(n<2)
         return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int last=sc.nextInt();
        
        for(int i=s;i<=last;i++){
          if ( isPrime(i))
            System.out.println(i);
        }
    }
}
