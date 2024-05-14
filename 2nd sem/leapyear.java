import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        System.out.println("enter a year");
        Scanner s= new Scanner(System.in);
        int year = s.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("you entered a leap year");
                }else{
                    System.out.println("you entered a not leap year");
                }
            }else{
                System.out.println("you entered a leap year");
            }
        }else{
            System.out.println("you entered a not leap year");
        }

    }
}
