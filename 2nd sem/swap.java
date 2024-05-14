import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        System.out.println("enter two numbers to swap");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("before swapping the numbers are "+ a+" and "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping the numbers are "+ a+" and "+b);

    }
}
