import java.util.Scanner;

public class recursion_01_first {

    public static void printNumb(int n) {
            
        if(n==0){
        return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of n ");
        int n = sc.nextInt();
        System.out.println("Your Answer is ");
        printNumb(n);
    }
}
