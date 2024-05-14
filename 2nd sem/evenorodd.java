import java.util.Scanner; 
public class evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("the number you entered is even");
        }else{
            System.out.println("the number you entered is odd");
        }
        sc.close();
    }
}

