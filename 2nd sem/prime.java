import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int flag=0;
        if(n==1){
            System.out.println("not prime");
        }else if(n==2){
            System.out.println("prime");
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=1;
                }
            }
            if(flag==1){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
        }
    }
}