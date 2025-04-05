import java.util.Scanner;

public class Cube {
    public static void main(String[] args){
        System.out.println("Enter a number to get its cube");
        Scanner scanner= new Scanner(System.in);
        double num= scanner.nextDouble();

        double result = num*num*num;
        System.out.println(result);



    }
}

