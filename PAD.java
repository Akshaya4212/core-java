import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        if(n<=1 || n>=100000){
            System.out.println("invalid number");
        }
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            sum += i;
        }
        
        if(sum == n){
            System.out.println("Perfect Numbers");
            
        }else if(sum>n){
            System.out.println("Abundant Numbers");
            
        }else{
            System.out.println("Deficient Numbers");
        }
        
        sc.close();
    }
}