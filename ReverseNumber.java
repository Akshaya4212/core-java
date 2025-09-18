import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        int n = sc.nextInt();
        while(n>0){
            r = n%10;  //gt the last digit
            System.out.print(r);   //prints the last number
            n = n/10;    //removes last number
                
        }
       sc.close();
    }
}