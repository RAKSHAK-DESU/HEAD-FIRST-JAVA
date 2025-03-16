import java.util.Scanner;

public class MULTIPLICATION {
    public static void main(String[] args){
        System.out.println("Enter 1st number");
        Scanner scanner= new Scanner(System.in);
        float num1= scanner.nextFloat();

        System.out.println("Enter 2nd Number");
        float num2= scanner.nextFloat();

        float result= num1* num2;
        System.out.println(result);

    }
}
