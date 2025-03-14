import java.util.Scanner;

public class SUBSTRACTION {
    public static void main(String[] args){
        System.out.println("Enter 1st number");
        Scanner scanner = new Scanner(System.in);
        int num1= scanner.nextInt();

        System.out.println("Enter 2st number");
        int num2= scanner.nextInt();

        int Result= num1-num2;
        System.out.println("Result is:"+Result);

    }
}
